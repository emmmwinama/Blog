package tech.emmmwinama.blog.services;

import org.springframework.stereotype.Service;
import tech.emmmwinama.blog.models.PostComment;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PostCommentService {
    private static List<PostComment> PostComments = new ArrayList<>();

    static {
        PostComments.add(new PostComment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), true, UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostComments.add(new PostComment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), true, UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostComments.add(new PostComment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), true, UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostComments.add(new PostComment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), false, UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostComments.add(new PostComment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), false, UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostComments.add(new PostComment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), true, UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostComments.add(new PostComment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), false, UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostComments.add(new PostComment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), false, UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostComments.add(new PostComment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), true, UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostComments.add(new PostComment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), false, UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostComments.add(new PostComment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), false, UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostComments.add(new PostComment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), true, UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
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
