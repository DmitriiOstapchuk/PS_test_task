package com.dmitrii.ostapchuk.testProject.controller;

import com.dmitrii.ostapchuk.testProject.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class NewsController {

    private final NewsRepository newsRepository;

    @GetMapping("/news")
    public String getNews(Model model) {
        model.addAttribute("news", newsRepository.findAll());
        return "news";
    }
}
