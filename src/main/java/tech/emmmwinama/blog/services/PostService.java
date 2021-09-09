package tech.emmmwinama.blog.services;

import tech.emmmwinama.blog.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostService {
    private static List<Post> Posts = new ArrayList<>();

    static {

    }

    public List<Post> getPosts(){
        return Posts;
    }

    public Post getPost(String id){
        for(Post post: Posts){
            if(post.getId().equals(id)){
                return post;
            }
        }

        return null;
    }
}
