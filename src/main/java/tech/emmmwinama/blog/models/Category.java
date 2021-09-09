package tech.emmmwinama.blog.models;

public class Category {
    private String id;
    private String parentId;
    private String title;
    private String metaTitle;
    private String slug;
    private String content;

    public Category(String id, String parentId, String title, String metaTitle, String slug, String content) {
        this.id = id;
        this.parentId = parentId;
        this.title = title;
        this.metaTitle = metaTitle;
        this.slug = slug;
        this.content = content;
    }

    public Category() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", title='" + title + '\'' +
                ", metaTitle='" + metaTitle + '\'' +
                ", slug='" + slug + '\'' +
                ", content='" + content + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
