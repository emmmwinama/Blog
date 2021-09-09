package tech.emmmwinama.blog.services;

import org.springframework.stereotype.Service;
import tech.emmmwinama.blog.models.PostComment;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostCommentService {
    private static List<PostComment> PostComments = new ArrayList<>();

    static {

    }

    public List<PostComment> getPostComments(){
        return PostComments;
    }

    public PostComment getComment(String id){
        for(PostComment postComment: PostComments){
            if(postComment.getId().equals(id)){
                return postComment;
            }
        }

        return null;
    }
}
