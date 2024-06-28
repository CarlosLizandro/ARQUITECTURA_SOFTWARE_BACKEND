package com.example.backend_sol_y_luna.domain.services;

import com.example.backend_sol_y_luna.domain.entities.News;

import java.util.List;

public interface NewsService {

    News createNews(News event);

    News updateNews(News event);

    void deleteNews(Integer id);

    List<News> listNews();

}
