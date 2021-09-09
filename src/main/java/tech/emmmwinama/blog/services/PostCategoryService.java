package tech.emmmwinama.blog.services;

import tech.emmmwinama.blog.models.PostCategory;

import java.util.ArrayList;
import java.util.List;

public class PostCategoryService {
    private static List<PostCategory> PostCategories = new ArrayList<>();

    static {

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
