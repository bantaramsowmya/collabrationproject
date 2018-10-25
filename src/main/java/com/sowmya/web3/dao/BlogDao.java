package com.sowmya.web3.dao;

import java.util.List;

import com.sowmya.web3.model.Blog;

public interface BlogDao 
{
public boolean save_blog(Blog blog);
public List getBlogDetails();
}
