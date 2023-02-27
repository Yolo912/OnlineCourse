package com.yolo.xczx.content.controller;

import com.yolo.xczx.base.model.PageParams;
import com.yolo.xczx.base.model.PageResult;
import com.yolo.xczx.content.model.dto.QueryCourseParamsDto;
import com.yolo.xczx.content.model.po.CourseBase;
import com.yolo.xczx.content.service.CourseBaseInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 912
 * @date 2023/2/26 14:52
 */
@Api(value = "课程信息编辑接口",tags = "课程信息编辑接口")
@RestController
public class CourseBaseInfoController {

    @Autowired
    private CourseBaseInfoService courseBaseInfoService;

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody
    QueryCourseParamsDto queryCourseParams){
        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams,
            queryCourseParams);
        return courseBasePageResult;
    }
}
