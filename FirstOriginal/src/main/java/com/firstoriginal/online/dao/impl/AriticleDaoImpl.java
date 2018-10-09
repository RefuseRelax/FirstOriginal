package com.firstoriginal.online.dao.impl;

import com.firstoriginal.online.dao.ArticleDao;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class AriticleDaoImpl implements ArticleDao{

    @Autowired
    private MongoTemplate mongoTemplate;

    public void insert(String[] Article){
        MongoCollection mongoCollection = mongoTemplate.getCollection("write");
        List<Document> writes  = new ArrayList<>();
        for(int i=1;i<Article.length;i++){
            String str[] = Article[i].split("&");
            Document document = new Document();
            document.append("seq",  i);
            document.append("type",str[1]);
            document.append("content",str[0]);
            writes.add(document);
        }
        Document document = new Document();
        document.append("title",Article[0]);
        document.append("author","jac");
        document.append("createtime",new Date());
        document.append("paragraphs",writes);
        mongoCollection.insertOne(document);
    }
}
