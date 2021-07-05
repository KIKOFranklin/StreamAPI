package code;

import object.User;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangjiahao
 * @since 2021/7/4 7:03 下午
 */
public class sort {
    public static void main(String[] args) throws IOException {
        List<String> list = ListGenerator.getOneStringList();
        //以w开头的字符串会被添加至list中

        //自然顺序
//        list = list.stream()
//                .sorted()
//                .collect(Collectors.toList());
//        list.forEach(System.out::println);

        //逆序
//        list = list.stream()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        list.forEach(System.out::println);

        //根据字符长度顺序
//        list = list.stream()
//                .sorted(Comparator.comparing(String::length))
//                .collect(Collectors.toList());
//        list.forEach(System.out::println);

        //根据字符长度逆序
        list = list.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}
