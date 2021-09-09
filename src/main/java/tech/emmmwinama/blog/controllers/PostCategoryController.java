package tech.emmmwinama.blog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tech.emmmwinama.blog.models.PostCategory;
import tech.emmmwinama.blog.services.PostCategoryService;

import java.util.List;

@RestController
public class PostCategoryController {
    private final PostCategoryService postCategoryService;

    public PostCategoryController(PostCategoryService postCategoryService) {
        this.postCategoryService = postCategoryService;
    }

    @GetMapping("/post-category")
    public List<PostCategory> getPostCategories(){
        return postCategoryService.getPostCategories();
    }

    @GetMapping("/post-category/{postCategoryId}")
    public PostCategory getPostCategory(@PathVariable String postCategoryId){
        return postCategoryService.getPostCategory(postCategoryId);
    }
}
