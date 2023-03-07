package com.yolo.xczx.content.service;

import com.yolo.xczx.content.model.dto.CoursePreviewDto;

/**
 * @description 课程预览、发布接口
 */
public interface CoursePublishService {


 /**
  * @description 获取课程预览信息
  * @param courseId 课程id
 */
   CoursePreviewDto getCoursePreviewInfo(Long courseId);

    /**
     * @description 提交审核
     * @param courseId  课程id
     * @return void
     */
    void commitAudit(Long companyId,Long courseId);


    void publish(Long companyId,Long courseId);

}