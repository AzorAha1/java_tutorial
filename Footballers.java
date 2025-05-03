public class Footballers {
    private String name;
    private String position;
    private int age;

    public Footballers(String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setAge(int age) {
        this.age = age;
    }
}