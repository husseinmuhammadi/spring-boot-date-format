package com.javastudio.spring.dateformat.web.resources;

import com.javastudio.spring.dateformat.api.CardService;
import com.javastudio.spring.dateformat.utils.MockDataLoader;
import com.javastudio.spring.dateformat.web.mapper.CardModelMapper;
import com.javastudio.spring.dateformat.web.mapper.CardModelMapperImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Objects;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.argThat;

@WebMvcTest(controllers = CardsResource.class)
@Import(CardModelMapperImpl.class)
class CardsResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CardService cardService;

    @Test
    void shouldWork() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/cards")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(MockDataLoader.Cards.CREATE_CARD_REQUEST.jsonString())
        ).andDo(
                MockMvcResultHandlers.print()
        ).andExpect(
                MockMvcResultMatchers.status().isCreated()
        );

        Mockito.verify(cardService).saveCard(argThat(arg -> {
            System.out.println(arg.getExpirationDate());
            return Objects.equals(arg.getCardNo(), "5522336655998844");
        }));
    }
}