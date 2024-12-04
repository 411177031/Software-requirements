/**
 * Share Class
 * 作業編號：Lab4
 * 作業內容：根據 Lab2 題目2-2 設計的類別圖，撰寫程式
 * @author 411177031
 * @version 1.0
 */
public class Share {
    private User sharedBy;
    private Knowledge knowledge;
    private String sharePlatform;

    public Share(User sharedBy) {
        this.sharedBy = sharedBy;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public void setSharePlatform(String sharePlatform) {
        this.sharePlatform = sharePlatform;
    }

    public void share(String platform) {
        System.out.println("Knowledge shared to " + platform);
    }

    // Getter and Setter methods
    public User getSharedBy() {
        return sharedBy;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public String getSharePlatform() {
        return sharePlatform;
    }

    public void setSharedBy(User sharedBy) {
        this.sharedBy = sharedBy;
    }
}