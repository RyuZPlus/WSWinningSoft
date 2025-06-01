package com.sfwonsoft.officialwebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sfwonsoft.officialwebsite.models.New;
import com.sfwonsoft.officialwebsite.repositories.NewsManagerRepository;

@Service
public class NewsService {
	@Autowired
	private NewsManagerRepository newsManagerRepository;
	
	public List<New> getLatestNews() {
        return newsManagerRepository.listNews(6);
    }
}
