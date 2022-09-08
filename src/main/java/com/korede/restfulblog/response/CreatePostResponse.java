package com.korede.restfulblog.response;

import com.korede.restfulblog.model.Post;
import com.korede.restfulblog.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CreatePostResponse {
    private String message;
    private LocalDateTime timeStamp;
    private Post post;
}
