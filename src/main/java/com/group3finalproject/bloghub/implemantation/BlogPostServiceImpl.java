package com.group3finalproject.bloghub.implemantation;

import com.group3finalproject.bloghub.entities.BlogPost;
import com.group3finalproject.bloghub.repository.BlogPostRepository;
import com.group3finalproject.bloghub.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostServiceImpl implements BlogPostService {


   private final BlogPostRepository blogPostRepository;

    @Autowired
    public BlogPostServiceImpl(BlogPostRepository blogPostRepository){
        this.blogPostRepository = blogPostRepository;
    }
    @Override
    public List<BlogPost> getAllBlogposts() {
        return null;
    }
}
