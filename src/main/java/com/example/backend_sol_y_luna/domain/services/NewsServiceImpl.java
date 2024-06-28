package com.example.backend_sol_y_luna.domain.services;

import com.example.backend_sol_y_luna.domain.entities.News;
import com.example.backend_sol_y_luna.repositories.NewsRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepositoryImpl newsRepository;

    public NewsServiceImpl(NewsRepositoryImpl newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public News createNews(News news) {
        return newsRepository.createNews(news);
    }

    @Override
    public News updateNews(News news) {
        return newsRepository.updateNews(news);
    }

    @Override
    public void deleteNews(Integer id) {
        newsRepository.deleteNews(id);
    }

    @Override
    public List<News> listNews() {
        List<News> listNewsAll = newsRepository.listNews();
        return listNewsAll;
    }

}
