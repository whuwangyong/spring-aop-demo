package concert;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author WangYong
 * @Date 2019/05/17
 * @Time 11:06
 */
@Aspect
@Component
public class Audience {

    @Pointcut("execution( * concert.Performance.perform(..))")
    public void performance() {}

    @Before("performance()")
    public void mutePhone(){
        System.out.println("mute phone");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("take seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP! CLAP! CLAP!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

}
