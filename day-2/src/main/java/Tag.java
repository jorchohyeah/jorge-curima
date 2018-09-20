import java.util.Date;

public class Tag {
    String name;
    Date created;

    String getName() {

        return name;
    }
    Date getDate() {
        return this.created;
    }
    void setName(String name1) {
        name = name1;
    }
    void setDate(Date created1){
        this.created = created1;
    }
}
