package com.sowmya.web3.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sowmya.web3.dao.BlogDao;
import com.sowmya.web3.model.Blog;

@RestController

public class BlogController 
{
	@Autowired
	BlogDao blogdao;
@PostMapping("/createblog")
public ResponseEntity<Blog> createBlog(@RequestBody Blog blog)
{
    System.out.println("Control at Blog Controller ");
    String random_id = UUID.randomUUID().toString();
    blog.setBlog_id(random_id);
    blog.setLike_blog("0");
    blog.setDislike_blog("0");
    blogdao.save_blog(blog);
    
    return new ResponseEntity<Blog>(blog,HttpStatus.OK);
}
@GetMapping("/getBlogDetails")
public ResponseEntity<List> getBlog()
{
	List bloglist= blogdao.getBlogDetails();
	System.out.println(bloglist);
	return new ResponseEntity<List>(bloglist,HttpStatus.OK);
}
}
