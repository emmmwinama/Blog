package tech.emmmwinama.blog.services;

import org.springframework.stereotype.Service;
import tech.emmmwinama.blog.models.Category;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    private static List<Category> Categories = new ArrayList<>();

    static {

    }

    public List<Category> getCategories(){
        return Categories;
    }

    public Category getCategory(String id){
        for(Category category: this.Categories){
            if(category.getId().equals(id)){
                return category;
            }
        }

        return null;
    }
}
