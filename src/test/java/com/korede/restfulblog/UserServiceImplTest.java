package com.korede.restfulblog;

import com.korede.restfulblog.model.Comment;
import com.korede.restfulblog.model.Like;
import com.korede.restfulblog.model.Post;
import com.korede.restfulblog.model.User;
import com.korede.restfulblog.repository.CommentRepository;
import com.korede.restfulblog.repository.LikeRepository;
import com.korede.restfulblog.repository.PostRepository;
import com.korede.restfulblog.repository.UserRepository;
import com.korede.restfulblog.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserServiceImplTest {
//    @SpringBootTest
//    class UserServiceImplTest {
//
//        @Mock
//        private UserRepository userRepository;
//        @Mock
//        private LikeRepository likeRepository;
//        @Mock
//        private CommentRepository commentRepository;
//        @Mock
//        private PostRepository postRepository;
//
//        @InjectMocks
//        private UserServiceImpl userService;
//
//        private LocalDateTime localDateTime;
//        private User user;
//        private Comment comment;
//        private Like like;
//        private Post post;
//        List<Like> likeList = new ArrayList<>();
//        List<Post> postList = new ArrayList<>();
//        List<Comment> commentList = new ArrayList<>();
//        List<User> userList = new ArrayList<>();
//
//        @BeforeEach
//        void setUp() {
//            localDateTime = LocalDateTime.of(2022, AUGUST,3,6,30,40,50000);
//            user = new User(1 , "vincent" , "bigman@gmail.com" , "Admin" , "12345" , localDateTime , localDateTime  , postList , commentList , likeList);
//            post = new Post(1 , "title of post" , "small description" , "title-of-post" , "0xEsddfmk.png", localDateTime , localDateTime , user, commentList , likeList);
//            like = new Like(1 , true , localDateTime , localDateTime , user , post);
//            comment = new Comment(1 , "lovely" , localDateTime , localDateTime , post , user);
//        }
//
//
//    }
