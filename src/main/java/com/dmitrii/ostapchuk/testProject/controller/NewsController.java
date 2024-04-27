package com.dmitrii.ostapchuk.testProject.controller;

import com.dmitrii.ostapchuk.testProject.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @GetMapping("/news")
    public String getNews(Model model) {
        model.addAttribute("news", newsService.findAll());
        return "news";
    }
}
