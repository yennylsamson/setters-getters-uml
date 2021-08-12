package Classifications;

public class Course extends Classification{
    public int getId() {
        return id;
    }

    public void setId(int course_id) {
        this.id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String course_name) {
        this.name = course_name;
    }
}
