package cn.whu.wy.aop.concert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Author WangYong
 * Date 2019/05/17
 * Time 11:31
 */
@SpringBootApplication
public class ConcertApp implements CommandLineRunner {

    @Autowired
    private SongPerformance songPerformance;

    public static void main(String[] args) {

        SpringApplication.run(ConcertApp.class, args);
    }

    @Override
    public void run(String... args) {
        try {
            songPerformance.perform();
        } catch (Exception e) {
//            e.printStackTrace();
        }

        List<String> yanHua = new ArrayList<>();
        yanHua.add("繁华声 遁入空门 折煞了世人");
        yanHua.add("梦偏冷 辗转一生 情债又几本");
        songPerformance.setLyrics(yanHua);
        try {
            songPerformance.perform();
        } catch (Exception e) {
//            e.printStackTrace();
        }

    }
}
