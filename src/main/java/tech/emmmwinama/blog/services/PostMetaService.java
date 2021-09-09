package tech.emmmwinama.blog.services;

import tech.emmmwinama.blog.models.PostMeta;

import java.util.ArrayList;
import java.util.List;

public class PostMetaService {
    private static List<PostMeta> PostMetas = new ArrayList<>();

    static {

    }

    public List<PostMeta> getPostMetas(){
        return PostMetas;
    }

    public PostMeta getPostMeta(String id){
        for(PostMeta postMeta: PostMetas){
            if(postMeta.getId().equals(id)) {
                return postMeta;
            }
        }

        return null;
    }
}
