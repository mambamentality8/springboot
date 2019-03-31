package com.example.demo.controller;

import com.example.demo.domain.Article;
import com.example.demo.domain.JsonData;
import com.example.demo.repository.ArticleRepository;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/article")
public class ArticleController {

	@Autowired
	private ArticleRepository articleRepository;
	
	@PostMapping("save")
	public Object save(){
	
		Article article = new Article();
		article.setId(2L);
		article.setPv(123);
		article.setContent("springboot整合elasticsearch");
		article.setTitle("我是title");
		article.setSummary("搜索框架整合");
		
		articleRepository.save(article);
	
		return JsonData.buildSuccess();
	}
	
	
	
	
	@GetMapping("search")
	public Object search(String title){

		//QueryBuilder queryBuilder = QueryBuilders.matchAllQuery(); //搜索全部文档
		QueryBuilder queryBuilder = QueryBuilders.matchQuery("title", title);

		Iterable<Article> list =  articleRepository.search(queryBuilder);
		
		return JsonData.buildSuccess(list);
	}

}
