package work.lichong.quartzdemo.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 具体的业务逻辑，最好不要在Job类中写过多逻辑，不然就和quartz耦合了
 *
 * @author 李冲
 * @date 2022年03月22日 11:40
 */
@Component
@Slf4j
public class TaskOne {

    public void doSomething1() {
        log.info("执行定时任务1成功......time={}", new Date());
    }

    public void doSomething2() {
        log.info("执行定时任务2成功......time={}", new Date());
    }

}
