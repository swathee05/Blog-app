package com.Blogs.Blog.Application.service;

import com.Blogs.Blog.Application.entity.Comment;

import java.util.List;

public interface CommentService {
    public Comment createComment(Long postId, String postedBy, String content);

    List<Comment> getCommentByPostId(Long postId);
}
