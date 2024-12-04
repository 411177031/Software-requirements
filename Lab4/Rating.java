/**
 * Rating Class
 * 作業編號：Lab4
 * 作業內容：根據 Lab2 題目2-2 設計的類別圖，撰寫程式
 * @author 411177031
 * @version 1.0
 */
public class Rating {
    private String ratingID;
    private User user;
    private Knowledge knowledge;
    private int score;

    public Rating(User user, Knowledge knowledge, int score) {
        this.ratingID = "R" + System.currentTimeMillis();
        this.user = user;
        this.knowledge = knowledge;
        this.score = score;
    }

    // Getter and Setter methods
    public String getRatingID() {
        return ratingID;
    }

    public void setRatingID(String ratingID) {
        this.ratingID = ratingID;
    }
   
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}