package com.ivankoi.study.spring.ui.web.team;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ivankoi on 1/22/2017.
 */
@Controller
@RequestMapping(value = "/team")
public class DndTeamListController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getTeamList(Model model) {
        model.addAttribute("teamList", "teamListFakeModelAttribute");
        return "team_list";
    }
}
