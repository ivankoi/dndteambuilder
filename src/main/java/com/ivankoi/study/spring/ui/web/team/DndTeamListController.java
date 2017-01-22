package com.ivankoi.study.spring.ui.web.team;

import com.ivankoi.study.spring.bussines.team.boundry.TeamService;
import com.ivankoi.study.spring.bussines.team.entity.Race;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivankoi on 1/22/2017.
 */
@Controller
@RequestMapping(value = "/team")
public class DndTeamListController {

    @Autowired
    TeamService teamService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getTeamList(Model model) {
        model.addAttribute("teamList", "teamListFakeModelAttribute");
        return "team_list";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String getCreateNewTeam(Model model) {
        List<Race> raceOptions =  teamService.findAllRaces();
        model.addAttribute("raceOptions", raceOptions);
        return "create_new_team";
    }
}
