package com.korede.restfulblog.controller;


import com.korede.restfulblog.dto.CommentDto;
import com.korede.restfulblog.dto.LikeDto;
import com.korede.restfulblog.dto.PostDto;
import com.korede.restfulblog.dto.UserDto;
import com.korede.restfulblog.model.Post;
import com.korede.restfulblog.response.*;
import com.korede.restfulblog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

import static org.springframework.http.HttpStatus.OK;

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
        System.out.println(postDto.getFeaturedImage());
        URI uri=URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/create").toUriString());
        return ResponseEntity.created(uri).body(userService.createPost(postDto));

    }

    @DeleteMapping(value = "/delete/{post_id}")
    public ResponseEntity<DeletePostResponse> deletePost (@PathVariable("post_id") Integer post_id){
        log.info("successfully deleted a post with title:  {} " );

        return new ResponseEntity<>(userService.deletePost(post_id) , OK);

    }

    @PostMapping(value = "/comment/{user_id}/{post_id}")
    public ResponseEntity<CommentResponse> comment (@PathVariable(value = "user_id") Integer user_id, @PathVariable(value = "post_id") Integer post_id,  @RequestBody CommentDto commentDto){
        log.info("successfully commented :  {} " , commentDto.getComment());
        URI uri=URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/comment").toUriString());
        return ResponseEntity.created(uri).body(userService.comment(user_id, post_id, commentDto));

    }

    @PostMapping(value = "/like/{user_id}/{post_id}")
    public ResponseEntity<LikeResponse> like(@PathVariable(value = "user_id") Integer user_id, @PathVariable(value = "post_id") Integer post_id, @RequestBody LikeDto likeDto){
        log.info("Successfully liked :  {} " , likeDto.isLiked());
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/like").toUriString());
        return ResponseEntity.created(uri).body( userService.like(user_id , post_id , likeDto));
    }

    @GetMapping(value = "/searchPost/{keyword}")
    public ResponseEntity<SearchPostResponse> searchPost(@PathVariable(  value = "keyword") String keyword){
        return new ResponseEntity<>(userService.searchPost(keyword) , OK);
    }

    @GetMapping(value = "/searchComment/{keyword}")
    public ResponseEntity<SearchCommentResponse> searchComment(@PathVariable(  value = "keyword") String keyword){
        return ResponseEntity.ok().body(userService.searchComment(keyword));
    }

    @GetMapping(value = "/post/{id}")
    public ResponseEntity<Post> searchComment(@PathVariable(  value = "id") Integer id){
        return ResponseEntity.ok().body(userService.findPostById(id));
    }

}
