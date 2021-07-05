package code;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangjiahao
 * @since 2021/7/4 6:54 下午
 */
public class match {
    public static void main(String[] args) throws IOException {
        List<String> list = ListGenerator.getOneStringList();
        boolean result = list.stream()
                //所有都满足
//                .allMatch(t -> t.startsWith("w"));
                //部分满足
//                .anyMatch(t -> t.startsWith("w"));
                //都不满足
                .noneMatch(t -> t.startsWith("a"));
        System.out.println(result);
    }
}
