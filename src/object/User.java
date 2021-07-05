package object;

/**
 * @author wangjiahao
 * @since 2021/7/4 5:55 下午
 */
public class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
