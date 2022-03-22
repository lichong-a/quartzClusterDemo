package work.lichong.quartzdemo.quartz.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import work.lichong.quartzdemo.task.TaskOne;

/**
 * DisallowConcurrentExecution : 此标记用在实现Job的类上面,意思是不允许并发执行.
 * PersistJobDataAfterExecution : 这个注解用于持久化Job的JobDataMap（Trigger的JobDataMap不适用）
 * 注org.quartz.threadPool.threadCount的数量有多个的情况,@DisallowConcurrentExecution才生效
 *
 * @author 李冲
 * @date 2022年03月21日 14:21
 */
@Component
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
@Slf4j
public class CustomJob2 implements Job {

    public static final String CRON_TIME = "0/5 * * * * ?";

    @Autowired
    TaskOne taskOne;

    /**
     * 核心方法,Quartz Job真正的执行逻辑.
     *
     * @param context 中封装有Quartz运行所需要的所有信息
     * @throws JobExecutionException execute()方法只允许抛出JobExecutionException异常
     */
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("--------------定时任务执行逻辑2---------------------");
        taskOne.doSomething2();
    }
}
