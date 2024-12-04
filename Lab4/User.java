import java.util.ArrayList;
import java.util.List;
/**
 * User Class
 * 作業編號：Lab4
 * 作業內容：根據 Lab2 題目2-2 設計的類別圖，撰寫程式
 * @author 411177031
 * @version 1.0
 */
public class User {
    private String userID;
    private String username;
    private String email;

    public User(String userID, String username, String email) {
        this.userID = userID;
        this.username = username;
        this.email = email;
    }

    public List<Knowledge> search(String keyword) {
        // 模擬搜索功能（返回空列表作為佔位）
        return new ArrayList<>();
    }

    public void rateContent(Knowledge knowledge, int score) {
        Rating rating = new Rating(this, knowledge, score);
        knowledge.addRating(rating);
    }

    public void addToFavorites(Favorite favorite, Knowledge knowledge) {
        favorite.addKnowledge(knowledge);
    }

    public void shareContent(Share share, Knowledge knowledge, String sharePlatform) {
        share.setKnowledge(knowledge);
        share.setSharePlatform(sharePlatform);
    }

    // Getter and Setter methods
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}