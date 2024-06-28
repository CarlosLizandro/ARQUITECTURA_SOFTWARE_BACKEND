package com.example.backend_sol_y_luna.domain.repositories;

import com.example.backend_sol_y_luna.domain.entities.News;

import java.util.List;

public interface NewsRepository {

    News createNews(News news);

    News updateNews(News event);

    void deleteNews(Integer id);

    List<News> listNews();

}
