package tech.emmmwinama.blog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tech.emmmwinama.blog.models.Post;
import tech.emmmwinama.blog.services.PostService;

import java.util.List;

@RestController
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> getPosts(){
        return postService.getPosts();
    }

    @GetMapping("/post/{postId}")
    public Post getPost(@PathVariable String postId){
        return  postService.getPost(postId);
    }
}
