public class Review {

    private String displayName;
    private String content;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Review{" +
                "displayName='" + displayName + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
