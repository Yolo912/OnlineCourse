package com.yolo.xczx.content.controller;

import com.yolo.xczx.content.model.dto.CourseCategoryTreeDto;
import com.yolo.xczx.content.service.CourseCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 912
 * @date 2023/2/27 14:21
 */
@Slf4j
@RestController
@Api(value = "课程分类相关接口")
public class CourseCategoryController {

    @Autowired
    private CourseCategoryService courseCategoryService;

    @ApiOperation(value = "课程分类查询接口")
    @GetMapping("/course-category/tree-nodes")
    public List<CourseCategoryTreeDto> queryTreeNodes(){
        return courseCategoryService.queryTreeNodes("1");
    }
}
