package cn.whu.wy.aop.concert;

import org.springframework.beans.factory.InitializingBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Author WangYong
 * Date 2019/05/17
 * Time 14:13
 */
//@Component
public class Test implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        SongPerformance yanHuaYiLeng = new SongPerformance();
        SongPerformance yiXiangRen = new SongPerformance();
        SongPerformance caiXuKun = new SongPerformance();

        List<String> yanHua = new ArrayList<>();
        yanHua.add("繁华声 遁入空门 折煞了世人");
        yanHua.add("梦偏冷 辗转一生 情债又几本");

        List<String> yiXia = new ArrayList<>();
        yiXia.add("披星戴月的奔波");
        yiXia.add("只为一扇窗");

        yanHuaYiLeng.setLyrics(yanHua);
        yiXiangRen.setLyrics(yiXia);

        yanHuaYiLeng.perform();
        yiXiangRen.perform();
//        caiXuKun.perform();
    }
}
