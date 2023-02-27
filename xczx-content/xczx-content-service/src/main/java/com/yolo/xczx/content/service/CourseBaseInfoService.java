package com.yolo.xczx.content.service;

import com.yolo.xczx.base.model.PageParams;
import com.yolo.xczx.base.model.PageResult;
import com.yolo.xczx.content.model.dto.AddCourseDto;
import com.yolo.xczx.content.model.dto.CourseBaseInfoDto;
import com.yolo.xczx.content.model.dto.QueryCourseParamsDto;
import com.yolo.xczx.content.model.po.CourseBase;

/**
 * 课程管理service
 *
 * @author 912
 * @date 2023/2/26 16:30
 */

public interface CourseBaseInfoService {

    /**
     * @description: 课程查询接口
     * @param pageParams
     * @param queryCourseParamsDto
     * @return
     */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams,
        QueryCourseParamsDto queryCourseParamsDto);

    /**
     * 新增课程
     * @param companyId 培训机构id
     * @param addCourseDto 新增课程信息
     * @return 课程基本信息，营销信息
     */
    CourseBaseInfoDto createCourseBase(Long companyId , AddCourseDto addCourseDto);
}
