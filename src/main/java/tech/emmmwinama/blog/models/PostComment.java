package tech.emmmwinama.blog.models;

public class PostComment {
    private String id;
    private String postId;
    private String parentId;
    private String title;
    private boolean published;
    private String createdAt;
    private String publishedAt;
    private String content;

    public PostComment(String id, String postId, String parentId, String title, boolean published, String createdAt, String publishedAt, String content) {
        this.id = id;
        this.postId = postId;
        this.parentId = parentId;
        this.title = title;
        this.published = published;
        this.createdAt = createdAt;
        this.publishedAt = publishedAt;
        this.content = content;
    }

    public PostComment() {
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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PostComment{" +
                "id='" + id + '\'' +
                ", postId='" + postId + '\'' +
                ", parentId='" + parentId + '\'' +
                ", title='" + title + '\'' +
                ", published=" + published +
                ", createdAt='" + createdAt + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", content='" + content + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}