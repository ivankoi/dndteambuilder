package com.ivankoi.study.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by ivank on 1/22/2017.
 */
public class DndTeamListControllerTest {

    private DndTeamListController cut = new DndTeamListController();

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(cut).build();
    }

    @Test
    public void getTeamList() throws Exception {
        mockMvc.perform(get("/team/list")).andDo(print()).andExpect(view().name("team_list")).andExpect(status().isOk());
    }

}