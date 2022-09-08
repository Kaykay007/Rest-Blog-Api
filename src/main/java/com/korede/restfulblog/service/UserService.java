package com.korede.restfulblog.service;

import com.korede.restfulblog.dto.*;
import com.korede.restfulblog.response.*;

public interface UserService {

    RegisterResponse register(UserDto userDto);

    LoginResponse login(LoginDto loginDto);

    CreatePostResponse createPost(PostDto postDto);
    DeletePostResponse deletePost (int post_id);

    CommentResponse comment(int user_id , int post_id , CommentDto commentDto);

    LikeResponse like (int user_id, int post_id, LikeDto likeDto);

    SearchCommentResponse searchComment(String keyword);

    SearchPostResponse searchPost(String keyword);


}
