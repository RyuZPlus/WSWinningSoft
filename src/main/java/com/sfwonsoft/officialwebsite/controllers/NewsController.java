package com.sfwonsoft.officialwebsite.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfwonsoft.officialwebsite.models.New;
import com.sfwonsoft.officialwebsite.services.NewsService;

@RestController
@RequestMapping("/news")
public class NewsController {
	@Autowired
    private NewsService newsService;
	
	@PostMapping("/latest")
    public List<New> getLatestNews() {
        return newsService.getLatestNews();
    }
}
