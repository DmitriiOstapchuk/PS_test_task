package com.dmitrii.ostapchuk.testProject.service;

import com.dmitrii.ostapchuk.testProject.model.News;

import java.util.List;

public interface NewsService {
    List<News> findAll();
}
