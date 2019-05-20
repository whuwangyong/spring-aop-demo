package concert;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author WangYong
 * @Date 2019/05/17
 * @Time 14:06
 */
@Data
@Slf4j
@Component
public class Song implements Performance {

    private List<String> lyrics;

    @Override
    public void perform() throws Exception {
        if(lyrics == null) {
            log.info("忘词");
            throw new Exception();
        }
        else
            lyrics.forEach(System.out::println);
    }
}
