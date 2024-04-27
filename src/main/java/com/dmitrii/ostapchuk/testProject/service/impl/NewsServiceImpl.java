package com.dmitrii.ostapchuk.testProject.service.impl;

import com.dmitrii.ostapchuk.testProject.model.News;
import com.dmitrii.ostapchuk.testProject.repository.NewsRepository;
import com.dmitrii.ostapchuk.testProject.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;
    @Override
    public List<News> findAll() {
        return newsRepository.findAll();
    }
}
