package com.yolo.xczx.media.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yolo.xczx.media.service.MediaProcessHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 912
 */
@Slf4j
@RestController
@RequestMapping("mediaProcessHistory")
public class MediaProcessHistoryController {

    @Autowired
    private MediaProcessHistoryService  mediaProcessHistoryService;
}
