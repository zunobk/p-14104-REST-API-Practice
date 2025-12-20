package com.back.domain.post.post.dtd;

import com.back.domain.post.post.entity.Post;

import java.time.LocalDateTime;

public class PostDto {
    private int id;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String subject;
    private String body;

    public PostDto(Post post) {
        this.id = post.getId();
        this.createdDate = post.getCreateDate();
        this.modifiedDate = post.getModifyDate();
        this.subject = post.getTitle();
        this.body = post.getContent();
    }
}
