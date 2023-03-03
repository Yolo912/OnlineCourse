package com.yolo.xczx.content.service;

import com.yolo.xczx.content.model.dto.SaveTeachplanDto;
import com.yolo.xczx.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * @author 912
 * @description
 * @date 2023/2/28 20:45
 */
public interface TeachplanService {
    /**
     * 查询课程计划树形结构
     * @param courseId
     * @return
     */
    List<TeachplanDto> findTeachplanTree(long courseId);

    /**
     * 课程计划添加或修改
     * @param teachplanDto
     */
    void saveTeachplan(SaveTeachplanDto teachplanDto);
}
