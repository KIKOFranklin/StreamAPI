package code;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangjiahao
 * @since 2021/7/4 5:20 下午
 * @apiNote 筛选集合
 */
public class filter {
    public static void main(String[] args) throws IOException {
        List<String> list = ListGenerator.getOneStringList();
        //以w开头的字符串会被添加至list中
        list = list.stream()
                    //筛选
                    .filter(t -> t.startsWith("r"))
                    //去重
                    .distinct()
                    .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
