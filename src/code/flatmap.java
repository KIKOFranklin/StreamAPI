package code;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangjiahao
 * @since 2021/7/4 6:16 下午
 */
public class flatmap {
    public static void main(String[] args) throws IOException {
        List<String> list = ListGenerator.getOneStringList();
        list = list.stream()
                .map(t -> t.split(""))
                //把flatmap之前的流 转换成另外一个流
                .flatMap(t -> Arrays.stream(t))
                .filter(t -> t.startsWith("w"))
                .distinct()
                .collect(Collectors.toList());
        list.forEach(System.out :: println);
    }
}
