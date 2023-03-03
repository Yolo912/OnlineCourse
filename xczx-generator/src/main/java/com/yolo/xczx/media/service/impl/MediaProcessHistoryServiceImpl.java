package com.yolo.xczx.media.service.impl;

import com.yolo.xczx.media.model.po.MediaProcessHistory;
import com.yolo.xczx.media.mapper.MediaProcessHistoryMapper;
import com.yolo.xczx.media.service.MediaProcessHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 912
 */
@Slf4j
@Service
public class MediaProcessHistoryServiceImpl extends ServiceImpl<MediaProcessHistoryMapper, MediaProcessHistory> implements MediaProcessHistoryService {

}
