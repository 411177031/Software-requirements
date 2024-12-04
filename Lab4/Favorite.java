import java.util.ArrayList;
import java.util.List;
/**
 * Favorite Class
 * 作業編號：Lab4
 * 作業內容：根據 Lab2 題目2-2 設計的類別圖，撰寫程式
 * @author 411177031
 * @version 1.0
 */
public class Favorite {
    private User user;
    private List<Knowledge> knowledgeList;

    public Favorite(User user) {
        this.user = user;
        this.knowledgeList = new ArrayList<>();
    }

    public void addKnowledge(Knowledge knowledge) {
        if (!knowledgeList.contains(knowledge)) {
            knowledgeList.add(knowledge);
        }
    }

    public List<Knowledge> getFavorites() {
        return knowledgeList;
    }

    // Getter and Setter methods
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Knowledge> getKnowledgeList() {
        return knowledgeList;
    }

    public void setKnowledgeList(List<Knowledge> knowledgeList) {
        this.knowledgeList = knowledgeList;
    }
}