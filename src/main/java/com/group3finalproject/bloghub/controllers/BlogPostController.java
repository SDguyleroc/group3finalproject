package com.group3finalproject.bloghub.controllers;

import com.group3finalproject.bloghub.entities.BlogPost;
import com.group3finalproject.bloghub.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blog-posts")
public class BlogPostController {


    private BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService){
        this.blogPostService = blogPostService;
    }

    @GetMapping
    public List<BlogPost> getAllBlogPosts(){
        return blogPostService.getAllBlogposts();
    }


}
