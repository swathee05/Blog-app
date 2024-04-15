package com.Blogs.Blog.Application.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String content;

    private Date createdAt;

    private String postedBy;

    @ManyToOne // since one post can have many comments
    @JoinColumn(name = "post_id", nullable = false)
    private Post post; // to build relationship between post entity and comment entity



}
