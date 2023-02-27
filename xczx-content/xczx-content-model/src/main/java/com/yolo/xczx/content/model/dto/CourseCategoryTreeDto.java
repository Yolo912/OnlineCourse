package com.yolo.xczx.content.model.dto;

import com.yolo.xczx.content.model.po.CourseCategory;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;

/**
 * @author 912
 * @date 2023/2/27 14:36
 */
@Data
public class CourseCategoryTreeDto extends CourseCategory implements Serializable {

    List childrenTreeNodes;
}
