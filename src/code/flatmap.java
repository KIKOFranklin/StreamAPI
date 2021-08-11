package code;

import object.User;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wangjiahao
 * @since 2021/7/4 6:16 下午
 * map是把返回值作为下一个Stream对象的泛型类型
 * flatMap是把返回值当作下一个Stream对象
 */
public class flatmap {
    public static void main(String[] args) throws IOException {
//        List<String> list = ListGenerator.getOneStringList();
//        list = list.stream()
//                .map(t -> t.split(""))
//                //把flatmap之前的流 转换成另外一个流
//                .flatMap(t -> Arrays.stream(t))
//                .filter(t -> t.startsWith("w"))
//                .distinct()
//                .collect(Collectors.toList());
//        list.forEach(System.out :: println);


//        String[] words = new String[]{"Hello","World"};
//        List<String> list = Arrays.stream(words)
//                .map(word -> word.split(""))
//                .flatMap(Arrays::stream)
//                .distinct()
//                .collect(Collectors.toList());

        List<User> list1 = ListGenerator.getOneObjectList();
        List<Integer> result = list1.stream()
                .map(User::getName)
                .flatMap(t -> Stream.of(t.length()))
                .collect(Collectors.toList());
        result.forEach(System.out :: println);
    }
}
