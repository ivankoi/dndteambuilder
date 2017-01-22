package com.ivankoi.study.spring.ui.web.team;

import com.ivankoi.study.spring.ui.web.team.DndTeamListController;
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
    public void getTeamListMapping() throws Exception {
        mockMvc.perform(get("/team/list")).andDo(print()).andExpect(view().name("team_list")).andExpect(status().isOk());
    }

    @Test
    public void getTeamNewMapping() throws Exception {
        mockMvc.perform(get("/team/new")).andDo(print()).andExpect(view().name("create_new_team")).andExpect(status().isOk());
    }
}