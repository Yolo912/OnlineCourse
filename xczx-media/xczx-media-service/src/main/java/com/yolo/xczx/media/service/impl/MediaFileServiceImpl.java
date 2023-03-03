package com.yolo.xczx.media.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yolo.xczx.base.model.PageParams;
import com.yolo.xczx.base.model.PageResult;
import com.yolo.xczx.media.mapper.MediaFilesMapper;
import com.yolo.xczx.media.model.dto.QueryMediaParamsDto;
import com.yolo.xczx.media.model.dto.UploadFileParamsDto;
import com.yolo.xczx.media.model.dto.UploadFileResultDto;
import com.yolo.xczx.media.model.po.MediaFiles;
import com.yolo.xczx.media.service.MediaFileService;
import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mr.M
 * @version 1.0
 * @description TODO
 * @date 2022/9/10 8:58
 */
@Service
public class MediaFileServiceImpl implements MediaFileService {

    @Autowired
    MediaFilesMapper mediaFilesMapper;

    @Autowired
    MinioClient minioClient;

    @Value("${minio.bucket.files}")
    private String bucket_Files;

    @Override
    public PageResult<MediaFiles> queryMediaFiels(Long companyId, PageParams pageParams,
        QueryMediaParamsDto queryMediaParamsDto) {

        //构建查询条件对象
        LambdaQueryWrapper<MediaFiles> queryWrapper = new LambdaQueryWrapper<>();

        //分页对象
        Page<MediaFiles> page = new Page<>(pageParams.getPageNo(), pageParams.getPageSize());
        // 查询数据内容获得结果
        Page<MediaFiles> pageResult = mediaFilesMapper.selectPage(page, queryWrapper);
        // 获取数据列表
        List<MediaFiles> list = pageResult.getRecords();
        // 获取数据总数
        long total = pageResult.getTotal();
        // 构建结果集
        PageResult<MediaFiles> mediaListResult = new PageResult<>(list, total, pageParams.getPageNo(),
            pageParams.getPageSize());
        return mediaListResult;

    }

    @Transactional
    @Override
    public UploadFileResultDto uploadFile(Long companyId, UploadFileParamsDto uploadFileParamsDto, byte[] bytes,
        String folder, String objectName) {

        return null;
    }
}
