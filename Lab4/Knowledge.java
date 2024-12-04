import java.util.ArrayList;
import java.util.List;
/**
 * Knowledge Class
 * 作業編號：Lab4
 * 作業內容：根據 Lab2 題目2-2 設計的類別圖，撰寫程式
 * @author 411177031
 * @version 1.0
 */
public class Knowledge {
    private String knowledgeID;
    private String title;
    private String content;
    private List<String> keywords;
    private String category;
    private float averageRating;
    private List<Rating> ratings;

    public Knowledge(String knowledgeID, String title, String content, List<String> keywords, String category) {
        this.knowledgeID = knowledgeID;
        this.title = title;
        this.content = content;
        this.keywords = keywords;
        this.category = category;
        this.ratings = new ArrayList<>();
    }

    public void addRating(Rating rating) {
        ratings.add(rating);
        updateAverageRating();
    }

    private void updateAverageRating() {
        int total = 0;
        for (Rating rating : ratings) {
            total += rating.getScore();
        }
        this.averageRating = ratings.isEmpty() ? 0 : (float) total / ratings.size();
    }

    public String getDetails() {
        return "Title: " + title + "\nContent: " + content + "\nAverage Rating: " + averageRating;
    }

    // Getter and Setter methods
    public String getKnowledgeID() {
        return knowledgeID;
    }

    public void setKnowledgeID(String knowledgeID) {
        this.knowledgeID = knowledgeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public List<Rating> getRatings() {
        return ratings;
    }
}