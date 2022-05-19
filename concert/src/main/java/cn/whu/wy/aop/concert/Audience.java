package cn.whu.wy.aop.concert;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Author WangYong
 * Date 2019/05/17
 * Time 11:06
 */
@Aspect
@Component
@Slf4j
public class Audience {

    @Pointcut("execution( * cn.whu.wy.aop.concert..Performance.perform(..))")
    public void performance() {}

    @Before("performance()")
    public void mutePhone(){
        log.info("mute phone");
    }

    @Before("performance()")
    public void takeSeats() {
        log.info("take seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        log.info("CLAP! CLAP! CLAP!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        log.info("Demanding a refund");
    }

}
