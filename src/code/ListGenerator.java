package code;

import object.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author wangjiahao
 * @since 2021/7/4 5:21 下午
 */
public class ListGenerator{
    public static List<String> getOneStringList() throws IOException {
        Properties properties = new Properties();
        List<String> result = new ArrayList<>();
        InputStream in = ListGenerator.class.getClassLoader().getResourceAsStream("string.properties");
        properties.load(in);
        for (int i = 1; i <= 10; i++) {
            result.add(properties.getProperty("content" + i));
        }
        return result;
    }

    public static List<User> getOneObjectList() throws IOException {
        Properties properties = new Properties();
        List<User> result = new ArrayList<>();
        InputStream in = ListGenerator.class.getClassLoader().getResourceAsStream("user.properties");
        properties.load(in);
        for (int i = 1; i <= 4; i++) {
            result.add(new User(properties.getProperty("name" + i), properties.getProperty("age" + i)));
        }
        return result;
    }
}
