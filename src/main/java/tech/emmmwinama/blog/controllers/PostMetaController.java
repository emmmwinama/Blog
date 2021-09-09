package tech.emmmwinama.blog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tech.emmmwinama.blog.models.PostMeta;
import tech.emmmwinama.blog.services.PostMetaService;

import java.util.List;

@RestController
public class PostMetaController {
    private final PostMetaService postMetaService;

    public PostMetaController(PostMetaService postMetaService) {
        this.postMetaService = postMetaService;
    }

    @GetMapping("/post-meta")
    public List<PostMeta> getPostMetas(){
        return postMetaService.getPostMetas();
    }

    @GetMapping("/post-meta/{metaId}")
    public PostMeta getMeta(@PathVariable String metaId){
        return postMetaService.getPostMeta(metaId);
    }
}
