package com.yolo.xczx.media.service;


import com.yolo.xczx.base.model.PageParams;
import com.yolo.xczx.base.model.PageResult;
import com.yolo.xczx.media.model.dto.QueryMediaParamsDto;
import com.yolo.xczx.media.model.dto.UploadFileParamsDto;
import com.yolo.xczx.media.model.dto.UploadFileResultDto;
import com.yolo.xczx.media.model.po.MediaFiles;


/**
 * @author Mr.M
 * @version 1.0
 * @description 媒资文件管理业务类
 * @date 2022/9/10 8:55
 */
public interface MediaFileService {

    /**
     * @param pageParams          分页参数
     * @param queryMediaParamsDto 查询条件
     * @description 媒资文件查询方法
     */
    PageResult<MediaFiles> queryMediaFiels(Long companyId, PageParams pageParams,
        QueryMediaParamsDto queryMediaParamsDto);

    /**
     *
     * @param companyId
     * @param uploadFileParamsDto 上传文件参数
     * @param folder 文件目录
     * @param objectName
     * @return
     */
    UploadFileResultDto uploadFile(Long companyId, UploadFileParamsDto uploadFileParamsDto,byte[] bytes,String folder,String objectName);
}
