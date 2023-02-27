package com.yolo.xczx.content;

import com.yolo.xczx.content.mapper.CourseBaseMapper;
import com.yolo.xczx.content.mapper.CourseCategoryMapper;
import com.yolo.xczx.content.model.dto.CourseCategoryTreeDto;
import com.yolo.xczx.content.service.CourseBaseInfoService;
import com.yolo.xczx.base.model.PageParams;
import com.yolo.xczx.base.model.PageResult;
import com.yolo.xczx.content.model.dto.QueryCourseParamsDto;
import com.yolo.xczx.content.model.po.CourseBase;
import com.yolo.xczx.content.service.CourseCategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 912
 * @date 2023/2/26 16:10
 */
@SpringBootTest
class CourseBaseMapperTests {
    @Resource
    CourseBaseMapper courseBaseMapper;

    @Autowired
    CourseBaseInfoService courseBaseInfoService;

    @Autowired
    CourseCategoryService courseCategoryService;
    @Test
    void testCourseBaseMapper() {
        CourseBase courseBase = courseBaseMapper.selectById(74L);
        Assertions.assertNotNull(courseBase);
        System.out.println(courseBase);
    }


    @Test
    void testCourseBaseInfoService() {
        PageParams pageParams = new PageParams();
        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams,
            new QueryCourseParamsDto());
        System.out.println(courseBasePageResult);
    }
    @Test
    void testCourseCategoryService() {
        List<CourseCategoryTreeDto> courseCategoryTreeDtos = courseCategoryService.queryTreeNodes("1");
        System.out.println(courseCategoryTreeDtos);
    }
}