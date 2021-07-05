package code;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangjiahao
 * @since 2021/7/4 5:49 下午
 */
public class limit {
    public static void main(String[] args) throws IOException {
        List<String> list = ListGenerator.getOneStringList();
        //以w开头的字符串会被添加至list中
        list = list.stream()
                //取前三个元素
                .limit(3)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
