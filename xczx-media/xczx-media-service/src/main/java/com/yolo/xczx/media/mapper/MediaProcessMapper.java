package com.yolo.xczx.media.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yolo.xczx.media.model.po.MediaProcess;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 912
 */
@Mapper

public interface MediaProcessMapper extends BaseMapper<MediaProcess> {

    /**
     * @param shardTotal 分片总数
     * @param shardindex 分片序号
     * @param count      任务数
     * @description 根据分片参数获取待处理任务
     */
    @Select("SELECT t.* FROM media_process t WHERE t.id % #{shardTotal} = #{shardindex} and t.status='1' limit #{count}")
    List<MediaProcess> selectListByShardIndex(@Param("shardTotal") int shardTotal, @Param("shardindex") int shardindex,
        @Param("count") int count);

}
