package com.ivankoi.study.spring.ui.web.team;

import com.ivankoi.study.spring.bussines.team.boundry.TeamService;
import com.ivankoi.study.spring.bussines.team.entity.Race;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by ivank on 1/22/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class TeamControllerTest {

    @InjectMocks
    private TeamController cut;

    @Mock
    TeamService teamService;

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
        when(teamService.findAllRaces()).thenReturn(new ArrayList<Race>());

        mockMvc.perform(get("/team/new"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("create_new_team"))
                .andExpect(model().attribute("raceOptions", notNullValue()));

        verify(teamService, times(1)).findAllRaces();
    }
}