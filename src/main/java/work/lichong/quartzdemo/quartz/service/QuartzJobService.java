package work.lichong.quartzdemo.quartz.service;

import org.quartz.JobDetail;

import java.util.Map;

/**
 * 任务操作
 *
 * @author 李冲
 * @date 2022年03月21日 15:24
 */
public interface QuartzJobService {

    /**
     * 获取任务
     *
     * @param jobName   任务名称
     * @param groupName 任务组
     * @return JobDetail
     */
    JobDetail getJob(String jobName, String groupName);

    /**
     * 添加任务可以传参数
     *
     * @param clazzName 继承自Job的类，例如：work.lichong.quartzdemo.solution.one.job.CustomJob
     * @param jobName   任务名称
     * @param groupName 任务组
     * @param cronExp   cron表达式
     * @param param     JobDataMap的参数
     */
    void addJob(String clazzName, String jobName, String groupName, String cronExp, Map<String, Object> param);

    /**
     * 暂停任务
     *
     * @param jobName   任务名称
     * @param groupName 任务组
     */
    void pauseJob(String jobName, String groupName);

    /**
     * 恢复任务
     *
     * @param jobName   任务名称
     * @param groupName 任务组
     */
    void resumeJob(String jobName, String groupName);

    /**
     * 立即运行一次定时任务
     *
     * @param jobName   任务名称
     * @param groupName 任务组
     */
    void runOnce(String jobName, String groupName);

    /**
     * 更新任务
     *
     * @param jobName   任务名称
     * @param groupName 任务组
     * @param cronExp   cron表达式
     * @param param     JobDataMap的参数
     */
    void updateJob(String jobName, String groupName, String cronExp, Map<String, Object> param);

    /**
     * 删除任务
     *
     * @param jobName   任务名称
     * @param groupName 任务组
     */
    void deleteJob(String jobName, String groupName);

    /**
     * 启动所有任务
     */
    void startAllJobs();

    /**
     * 暂停所有任务
     */
    void pauseAllJobs();

    /**
     * 恢复所有任务
     */
    void resumeAllJobs();

    /**
     * 关闭所有任务
     */
    void shutdownAllJobs();
}
