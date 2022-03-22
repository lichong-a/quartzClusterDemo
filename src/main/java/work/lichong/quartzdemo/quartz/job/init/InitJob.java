package work.lichong.quartzdemo.quartz.job.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import work.lichong.quartzdemo.quartz.job.CustomJob;
import work.lichong.quartzdemo.quartz.service.QuartzJobService;

/**
 * @author 李冲
 * @date 2022年03月21日 15:47
 */
@Component
public class InitJob implements CommandLineRunner {

    @Autowired
    private QuartzJobService quartzJobService;

    @Override
    public void run(String... args) {
        quartzJobService.addJob(CustomJob.class.getName(), "test", "test", CustomJob.CRON_TIME, null);
    }
}
