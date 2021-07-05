package code;

import object.User;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wangjiahao
 * @since 2021/7/4 7:16 下午
 */
public class maxAndSum {
    public static void main(String[] args) throws IOException {
        System.out.println(
                Stream.of("wangjiahao", "liujiabing", "caomingyang").max(Comparator.comparing(String::length)).get()
        );
    }
}
