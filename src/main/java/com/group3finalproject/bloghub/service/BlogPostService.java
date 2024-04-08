package com.group3finalproject.bloghub.service;

import com.group3finalproject.bloghub.entities.BlogPost;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BlogPostService{


    public List<BlogPost> getAllBlogposts();
}
