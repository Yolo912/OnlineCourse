package com.yolo.xczx.content.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yolo.xczx.content.model.dto.TeachplanDto;
import com.yolo.xczx.content.model.po.Teachplan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 课程计划 Mapper 接口
 * </p>
 *
 * @author itcast
 */
@Mapper
public interface TeachplanMapper extends BaseMapper<Teachplan> {

    /**
     * 查询课程计划树形结构
     * @param courseId
     * @return TeachplanDto
     */
    List<TeachplanDto> selectTreeNodes(long courseId);
}
