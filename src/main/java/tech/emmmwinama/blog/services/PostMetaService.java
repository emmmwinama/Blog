package tech.emmmwinama.blog.services;

import org.springframework.stereotype.Service;
import tech.emmmwinama.blog.models.PostMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PostMetaService {
    private static List<PostMeta> PostMetas = new ArrayList<>();

    static {
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostMetas.add(new PostMeta(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
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
