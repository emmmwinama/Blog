package tech.emmmwinama.blog.services;

import tech.emmmwinama.blog.models.PostComment;

import java.util.ArrayList;
import java.util.List;

public class PostCommentService {
    private static List<PostComment> PostComments = new ArrayList<>();

    static {

    }

    public List<PostComment> getPostComments(){
        return PostComments;
    }
}
