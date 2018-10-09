package com.firstoriginal.online.service.impl;

import com.firstoriginal.online.dao.ArticleDao;
import com.firstoriginal.online.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDaoImpl;

    @Override
    public void insert(String[] ariticle) {
        articleDaoImpl.insert(ariticle);
    }
}
