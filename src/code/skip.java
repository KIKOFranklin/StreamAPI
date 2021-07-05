package code;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangjiahao
 * @since 2021/7/4 5:50 下午
 */
public class skip {
    public static void main(String[] args) throws IOException {
        List<String> list = ListGenerator.getOneStringList();
        //以w开头的字符串会被添加至list中
        list = list.stream()
                //去重
                .skip(3)
                //不会改变当前流，peek是用作打印变量的
                .peek(System.out::println)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
