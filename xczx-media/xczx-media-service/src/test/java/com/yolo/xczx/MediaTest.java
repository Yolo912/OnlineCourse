package com.yolo.xczx;

import com.yolo.xczx.base.model.PageParams;
import com.yolo.xczx.base.model.PageResult;
import com.yolo.xczx.media.model.po.MediaFiles;
import com.yolo.xczx.media.service.MediaFileService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 912
 * @description
 * @date 2023/3/2 17:00
 */
@SpringBootTest
public class MediaTest {

    @Autowired
    MediaFileService mediaFileService;

    @Test
    void testSearch(){
        PageParams pageParams = new PageParams();
        pageParams.setPageNo(1L);
        pageParams.setPageSize(10L);
        PageResult<MediaFiles> mediaFilesPageResult = mediaFileService.queryMediaFiels(1232141425L, pageParams, null);
        System.out.println(mediaFilesPageResult);
    }



}
