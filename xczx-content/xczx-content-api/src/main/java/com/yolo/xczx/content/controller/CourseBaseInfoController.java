package com.yolo.xczx.content.controller;

import com.yolo.xczx.base.model.PageParams;
import com.yolo.xczx.base.model.PageResult;
import com.yolo.xczx.content.model.dto.AddCourseDto;
import com.yolo.xczx.content.model.dto.CourseBaseInfoDto;
import com.yolo.xczx.content.model.dto.EditCourseDto;
import com.yolo.xczx.content.model.dto.QueryCourseParamsDto;
import com.yolo.xczx.content.model.po.CourseBase;
import com.yolo.xczx.content.service.CourseBaseInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation("新增课程接口")
    @PostMapping("/course")
    public CourseBaseInfoDto createCourseBase(@RequestBody @Validated AddCourseDto addCourseDto){

        //TODO 获取当前用户所属培训机构id
        Long companyId=22L;
        CourseBaseInfoDto courseBase = courseBaseInfoService.createCourseBase(companyId, addCourseDto);
        return courseBase;
    }

    @ApiOperation("根据课程id查询课程基础信息")
    @GetMapping("/course/{courseId}")
    public CourseBaseInfoDto getCourseBaseById(@PathVariable Long courseId){
        CourseBaseInfoDto courseBase = courseBaseInfoService.getCourseBaseInfo(courseId);
        return courseBase;
    }

    @ApiOperation("修改课程基础信息")
    @PutMapping("/course")
    public CourseBaseInfoDto modifyCourseBase(@RequestBody @Validated EditCourseDto editCourseDto){
        //TODO 获取当前用户所属培训机构id
        Long companyId=1232141425L;
        return courseBaseInfoService.updateCourseBase(companyId, editCourseDto);
    }
}
