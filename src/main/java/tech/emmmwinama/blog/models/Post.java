package tech.emmmwinama.blog.models;

public class Post {
    private String id;
    private String authorId;
    private String parentId;
    private String title;
    private String metaTitlte;
    private String slug;
    private String summary;
    private boolean published;
    private String createdAt;
    private String updatedAt;
    private String publishedAt;
    private String content;

    public Post(String id, String authorId, String parentId, String title, String metaTitlte, String slug, String summary, boolean published, String createdAt, String updatedAt, String publishedAt, String content) {
        this.id = id;
        this.authorId = authorId;
        this.parentId = parentId;
        this.title = title;
        this.metaTitlte = metaTitlte;
        this.slug = slug;
        this.summary = summary;
        this.published = published;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.publishedAt = publishedAt;
        this.content = content;
    }

    public Post() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
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

    public String getMetaTitlte() {
        return metaTitlte;
    }

    public void setMetaTitlte(String metaTitlte) {
        this.metaTitlte = metaTitlte;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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
        return "Post{" +
                "id='" + id + '\'' +
                ", authorId='" + authorId + '\'' +
                ", parentId='" + parentId + '\'' +
                ", title='" + title + '\'' +
                ", metaTitlte='" + metaTitlte + '\'' +
                ", slug='" + slug + '\'' +
                ", summary='" + summary + '\'' +
                ", published=" + published +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
