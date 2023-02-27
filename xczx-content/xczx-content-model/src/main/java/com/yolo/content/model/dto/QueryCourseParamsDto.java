package com.yolo.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @description: 课程查询参数dto
 *
 * @author 912
 * @date 2023/2/26 14:36
 */
@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
