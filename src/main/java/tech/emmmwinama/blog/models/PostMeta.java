package tech.emmmwinama.blog.models;

public class PostMeta {
    private String id;
    private String postId;
    private String key;
    private String content;

    public PostMeta(String id, String postId, String key, String content) {
        this.id = id;
        this.postId = postId;
        this.key = key;
        this.content = content;
    }

    public PostMeta() {
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "PostMeta{" +
                "id='" + id + '\'' +
                ", postId='" + postId + '\'' +
                ", key='" + key + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
