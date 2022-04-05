package com.inventory.system.repository;

import org.springframework.data.repository.CrudRepository;

import com.inventory.system.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>{

}
