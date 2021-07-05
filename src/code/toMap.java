package code;

import object.User;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wangjiahao
 * @since 2021/7/4 7:00 下午
 */
public class toMap {
    public static void main(String[] args) throws IOException {
        List<User> list = ListGenerator.getOneObjectList();
        //以w开头的字符串会被添加至list中
        Map<String, String> map = list.stream()
                .collect(Collectors.toMap(User::getName, User::getAge));
        System.out.println(map.get("franklin"));
        System.out.println(map.get("wangjiahao"));
    }
}
