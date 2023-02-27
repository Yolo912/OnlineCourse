package com.yolo.xczx.content.service.impl;

import com.yolo.xczx.content.mapper.CourseCategoryMapper;
import com.yolo.xczx.content.model.dto.CourseCategoryTreeDto;
import com.yolo.xczx.content.service.CourseCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author 912
 * @date 2023/2/27 16:01
 */
@Service
@Slf4j
public class CourseCategoryServiceImpl implements CourseCategoryService {

    @Autowired
    private CourseCategoryMapper courseCategoryMapper;
    @Override
    public List<CourseCategoryTreeDto> queryTreeNodes(String id) {
        List<CourseCategoryTreeDto> categoryTreeDtos = courseCategoryMapper.selectTreeNodes(id);
        List<CourseCategoryTreeDto> courseCategoryTreeDtos=new ArrayList<>();
        HashMap<String,CourseCategoryTreeDto> nodeMap=new HashMap<>();
        categoryTreeDtos.stream().forEach(item->{
            nodeMap.put(item.getId(),item);
            if (item.getParentid().equals(id)){
                courseCategoryTreeDtos.add(item);
            }
            String parentid = item.getParentid();
            CourseCategoryTreeDto parentNode = nodeMap.get(parentid);
            if (parentNode!=null){
                List childrenTreeNodes = parentNode.getChildrenTreeNodes();
                if (childrenTreeNodes==null){
                    parentNode.setChildrenTreeNodes(new ArrayList<CourseCategoryTreeDto>());
                }
                parentNode.getChildrenTreeNodes().add(item);
            }
        });
        return courseCategoryTreeDtos;
    }
}
