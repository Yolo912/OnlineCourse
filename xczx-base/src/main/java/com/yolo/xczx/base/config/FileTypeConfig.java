package com.yolo.xczx.base.config;

import com.j256.simplemagic.ContentInfo;
import com.j256.simplemagic.ContentInfoUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.MediaType;

/**
 * @author 912
 * @description
 * @date 2023/3/3 16:09
 */
public class FileTypeConfig {
    public static String getMimeTypeByExtension(String extension) {
        String contentType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
        if (StringUtils.isNotEmpty(extension)) {
            ContentInfo extensionMatch = ContentInfoUtil.findExtensionMatch(extension);
            if (extensionMatch != null) {
                contentType = extensionMatch.getMimeType();
            }
        }
        return contentType;
    }
}
