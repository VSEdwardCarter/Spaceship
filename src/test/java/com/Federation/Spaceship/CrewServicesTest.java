package com.Federation.Spaceship;

import com.Federation.Model.Spaceship.CrewServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.junit.runner.RunWith;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@WebMvcTest(CrewServices.class)
@RunWith(SpringRunner.class)

public class CrewServicesTest {

    @Autowired
    MockMvc mvc;

    @Test
    void testCrewMemberListReturned() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/crewmember");

        this.mvc.perform(request)
                .andExpect(status().isOk());
    }

}
