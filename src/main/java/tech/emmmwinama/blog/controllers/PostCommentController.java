package tech.emmmwinama.blog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tech.emmmwinama.blog.models.PostComment;
import tech.emmmwinama.blog.services.PostCommentService;

import java.util.List;

@RestController
public class PostCommentController {
    private final PostCommentService postCommentService;

    public PostCommentController(PostCommentService postCommentService) {
        this.postCommentService = postCommentService;
    }

    @GetMapping("/post-comments")
    public List<PostComment> getComments(){
        return postCommentService.getPostComments();
    }

    @GetMapping("/post-comment/{postCommentId}")
    public PostComment getComment(@PathVariable String postCommentId){
        return postCommentService.getComment(postCommentId);
    }
}
