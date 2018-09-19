import java.util.List;
import java.util.Date;

public class Post {
    int id;
    String title;
    String text;
    Date date;
    List<Tag> tags;

    private int getId(){
        return id;
    }
    String getTitle(){
        return title;
    }
    String getText(){
        return text;
    }
    Date getDate(){
        return date;
    }
    List<Tag> getTags(){
        return tags;
    }
    String showTags(){
        int limit = tags.size();
        Tag aux;
        for (int i = 0; i < limit; i++) {
            aux = tags.get(i);
            System.out.println("# " + aux.getName());

        }

    }
    void addTag(String t){

    }
}
