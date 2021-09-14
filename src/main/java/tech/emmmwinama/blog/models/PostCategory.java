package tech.emmmwinama.blog.models;

public class PostCategory {
    private String id;
    private String postId;
    private String categoryId;

    public PostCategory(String id, String postId, String categoryId) {
        this.id = id;
        this.postId = postId;
        this.categoryId = categoryId;
    }

    public PostCategory() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PostCategory other = (PostCategory) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
