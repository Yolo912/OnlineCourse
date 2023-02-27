package com.yolo.xczx.content.service;

import com.yolo.xczx.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @author 912
 * @date 2023/2/27 16:01
 */
public interface CourseCategoryService {
    /**
     * 课程分类树形结构查询
     *
     * @return
     */
    List<CourseCategoryTreeDto> queryTreeNodes(String id);
}
