package work.lichong.quartzdemo.quartz.job.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import work.lichong.quartzdemo.quartz.job.CustomJob1;
import work.lichong.quartzdemo.quartz.job.CustomJob2;
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
        if (quartzJobService.getJob("test1", "test1") == null) {
            quartzJobService.addJob(CustomJob1.class.getName(), "test1", "test1", CustomJob1.CRON_TIME, null);
        }
        if (quartzJobService.getJob("test2", "test2") == null) {
            quartzJobService.addJob(CustomJob2.class.getName(), "test2", "test2", CustomJob2.CRON_TIME, null);
        }
    }
}
