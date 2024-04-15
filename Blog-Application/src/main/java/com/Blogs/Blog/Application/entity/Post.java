package com.Blogs.Blog.Application.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Data

public class Post  {
        @Id // for primary key
        @GeneratedValue(strategy= GenerationType.IDENTITY) // automatically increments the id
        private long id;

        private String name;

        @Column(length = 5000) //length of words
        private String content;

        private String postedBy;

        private String img;

        private Date date;

        private int likeCount;

        private int viewCount;
        @ElementCollection
        private List<String> tags = new ArrayList<>();
}
