package tech.emmmwinama.blog.services;

import org.springframework.stereotype.Service;
import tech.emmmwinama.blog.models.PostCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PostCategoryService {
    private static List<PostCategory> PostCategories = new ArrayList<>();

    static {
        PostCategories.add(new PostCategory(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostCategories.add(new PostCategory(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostCategories.add(new PostCategory(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostCategories.add(new PostCategory(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostCategories.add(new PostCategory(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostCategories.add(new PostCategory(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostCategories.add(new PostCategory(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostCategories.add(new PostCategory(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostCategories.add(new PostCategory(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostCategories.add(new PostCategory(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
        PostCategories.add(new PostCategory(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()));
    }

    public List<PostCategory> getPostCategories(){
        return PostCategories;
    }

    public PostCategory getPostCategory(String id){
        for(PostCategory postCategory: PostCategories){
            if(postCategory.getId().equals(id)){
                return postCategory;
            }
        }

        return null;
    }
}
