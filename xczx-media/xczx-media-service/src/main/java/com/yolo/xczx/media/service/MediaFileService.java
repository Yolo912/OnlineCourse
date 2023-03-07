package com.yolo.xczx.media.service;


import com.yolo.xczx.base.model.PageParams;
import com.yolo.xczx.base.model.PageResult;
import com.yolo.xczx.base.model.RestResponse;
import com.yolo.xczx.media.model.dto.QueryMediaParamsDto;
import com.yolo.xczx.media.model.dto.UploadFileParamsDto;
import com.yolo.xczx.media.model.dto.UploadFileResultDto;
import com.yolo.xczx.media.model.po.MediaFiles;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;


/**
 * @version 1.0
 * @description 媒资文件管理业务类
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
     * @param companyId
     * @param uploadFileParamsDto 上传文件参数
     * @param folder              文件目录
     * @param objectName
     * @return
     */
    UploadFileResultDto uploadFile(Long companyId, UploadFileParamsDto uploadFileParamsDto, byte[] bytes, String folder,
        String objectName);


    /**
     * @param companyId
     * @param fileMd5
     * @param uploadFileParamsDto
     * @param bucket
     * @param objectName
     * @return
     */
    @Transactional
    MediaFiles addMediaFilesToDb(Long companyId, String fileMd5, UploadFileParamsDto uploadFileParamsDto, String bucket,
        String objectName);

    /**
     * @param fileMd5 文件的md5
     * @description 检查文件是否存在
     */
    RestResponse<Boolean> checkFile(String fileMd5);

    /**
     * @param fileMd5    文件的md5
     * @param chunkIndex 分块序号
     * @description 检查分块是否存在
     */
    RestResponse<Boolean> checkChunk(String fileMd5, int chunkIndex);

    /**
     * @param fileMd5 文件md5
     * @param chunk   分块序号
     * @param bytes   文件字节
     * @description 上传分块
     */
    RestResponse uploadChunk(String fileMd5, int chunk, byte[] bytes);

    /**
     * @description 合并分块
     * @param companyId           机构id
     * @param fileMd5             文件md5
     * @param chunkTotal          分块总和
     * @param uploadFileParamsDto 文件信息
     */
    RestResponse mergechunks(Long companyId, String fileMd5, int chunkTotal,
        UploadFileParamsDto uploadFileParamsDto);

    File downloadFileFromMinIO(File file,String bucket,String objectName);

    void addMediaFilesToMinIO(String filePath, String bucket, String objectName);

    /**
     * @description 根据id查询文件信息
     * @param id  文件id
     */
    MediaFiles getFileById(String id);
}
