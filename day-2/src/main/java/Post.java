import java.util.List;
import java.time.*;

public class Post {
    int id;
    String title;
    String text;
    LocalDateTime date;
    List<Tag> tags;

    void setId(int id) {
        this.id = id;
    }

    void setTitle(String title) {
        this.title = title;
    }

    private int getId() {

        return id;
    }

    String getTitle() {
        return title;
    }

    String getText() {
        return text;
    }

    LocalDateTime getDate() {
        return date;
    }

    List<Tag> getTags() {
        return tags;
    }

}