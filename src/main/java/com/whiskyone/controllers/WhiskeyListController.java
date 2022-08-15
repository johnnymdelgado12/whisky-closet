package com.whiskyone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WhiskeyListController {

    @GetMapping("whiskeyList")
    public String whiskeyList() {
        return "whiskeyList";
    }
}
