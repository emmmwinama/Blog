package tech.emmmwinama.blog.models;

public class PostCategory {
    private String postId;
    private String categoryId;

    public PostCategory(String postId, String categoryId) {
        this.postId = postId;
        this.categoryId = categoryId;
    }

    public PostCategory() {
    }


    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }


    @Override
    public String toString() {
        return "PostCategory{" +
                "postId='" + postId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
