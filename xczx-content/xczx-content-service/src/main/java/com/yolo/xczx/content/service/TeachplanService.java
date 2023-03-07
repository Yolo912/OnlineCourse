package com.yolo.xczx.content.service;

import com.yolo.xczx.content.model.dto.BindTeachplanMediaDto;
import com.yolo.xczx.content.model.dto.SaveTeachplanDto;
import com.yolo.xczx.content.model.dto.TeachplanDto;
import com.yolo.xczx.content.model.po.TeachplanMedia;

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


    /**
     * @description 教学计划绑定媒资
     * @param bindTeachplanMediaDto
     */
    TeachplanMedia associationMedia(BindTeachplanMediaDto bindTeachplanMediaDto);
}
