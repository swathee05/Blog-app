package com.Blogs.Blog.Application.service;

import com.Blogs.Blog.Application.entity.Post;

import java.util.List;

public interface PostService {
    // for each of the function call below provide endpoint(that is in controller)
    Post savePost(Post post);

    List<Post> getAllPosts();

    Post getPostById(Long postId);

    void likePost(Long postId);

    List<Post> searchByName(String name);

}
