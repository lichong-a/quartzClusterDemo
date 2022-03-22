package work.lichong.quartzdemo.quartz.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author 李冲
 * @date 2022年03月21日 15:33
 */
@Data
public class QuartzConfigDTO implements Serializable {


    private static final long serialVersionUID = 51849498484L;
    /**
     * 任务名称
     */
    private String jobName;

    /**
     * 任务所属组
     */
    private String groupName;

    /**
     * 任务执行类
     */
    private String jobClass;

    /**
     * 任务调度时间表达式
     */
    private String cronExpression;

    /**
     * 附加参数
     */
    private Map<String, Object> param;

}
