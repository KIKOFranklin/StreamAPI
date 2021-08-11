package code;

import java.io.IOException;
import java.util.List;

/**
 * @author wangjiahao
 * @since 2021/8/11 5:09 下午
 * 并行流
 */
public class parallel {
    public static void main(String[] args) throws IOException {
        List<String> list = ListGenerator.getOneStringList();
        long startTime = System.currentTimeMillis();
        list.stream().parallel().forEach(t -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long endTime = System.currentTimeMillis();
        System.out.println("并行流耗时：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        list.stream().forEach(t -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        endTime = System.currentTimeMillis();
        System.out.println("普通流耗时：" + (endTime - startTime));

    }
}
