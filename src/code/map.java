package code;

import object.User;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangjiahao
 * @since 2021/7/4 5:53 下午
 */
public class map {
    public static void main(String[] args) throws IOException {
        List<User> list = ListGenerator.getOneObjectList();
        //以w开头的字符串会被添加至list中
        List<String> strlist = list.stream()
                    //将返回值生成一个新的stream流对象
                    .map(User::getAge)
                    //生成新的Sting stream流对象 并在这个String流对象上做过滤操作
                    .filter(t -> Integer.parseInt(t) < 20)
                    .collect(Collectors.toList());
        strlist.forEach(System.out::println);
    }
}
