package com.korede.restfulblog.controller;


import com.korede.restfulblog.dto.CommentDto;
import com.korede.restfulblog.dto.PostDto;
import com.korede.restfulblog.dto.UserDto;
import com.korede.restfulblog.response.CommentResponse;
import com.korede.restfulblog.response.CreatePostResponse;
import com.korede.restfulblog.response.RegisterResponse;
import com.korede.restfulblog.service.UserService;
import com.korede.restfulblog.serviceImpl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController  @Slf4j
@RequestMapping(value = "/api")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }



    @PostMapping(value = "/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody UserDto userDto){
        log.info("successfully registered {} " , userDto.getEmail());
        URI uri=URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/register").toUriString());
        return ResponseEntity.created(uri).body(userService.register(userDto));

    }

    @PostMapping(value = "/create")
    public ResponseEntity<CreatePostResponse> create(@RequestBody PostDto postDto){
        log.info("successfully created a post with title:  {} " , postDto.getTitle());
        URI uri=URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/create").toUriString());
        return ResponseEntity.created(uri).body(userService.createPost(postDto));

    }

    @PostMapping(value = "/comment/{user_id}/{post_id}")
    public ResponseEntity<CommentResponse> comment (@PathVariable(value = "user_id") Integer user_id, @PathVariable(value = "post_id") Integer post_id,  @RequestBody CommentDto commentDto){
        log.info("successfully commented :  {} " , commentDto.getComment());
        URI uri=URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/comment").toUriString());
        return ResponseEntity.created(uri).body(userService.comment(user_id, post_id, commentDto));

    }


}
