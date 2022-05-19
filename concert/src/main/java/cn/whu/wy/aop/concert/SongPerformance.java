package cn.whu.wy.aop.concert;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author WangYong
 * Date 2019/05/17
 * Time 14:06
 */
@Data
@Slf4j
@Component
public class SongPerformance implements Performance {

    private List<String> lyrics;

    @Override
    public void perform() throws Exception {
        if (lyrics == null) {
            log.info("忘词");
            throw new Exception("演出故障");
        } else {
            lyrics.forEach(log::info);
        }
    }
}
