package com.korede.restfulblog.response;
import com.korede.restfulblog.model.Like;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor

public class LikeResponse {
    private String message;
    private LocalDateTime timeStamp;
    private Like like;
    private int totalLikes;
}
