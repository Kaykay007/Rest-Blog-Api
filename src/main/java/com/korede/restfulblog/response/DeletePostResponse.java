package com.korede.restfulblog.response;

import com.korede.restfulblog.model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class DeletePostResponse {
    private String message;
    private LocalDateTime timestamp;

}
