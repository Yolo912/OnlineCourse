package com.yolo.xczx;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.UploadObjectArgs;
import io.minio.errors.MinioException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @author 912
 * @description
 * @date 2023/3/3 13:27
 */

public class MinioTest {
    static MinioClient minioClient = MinioClient.builder()
        .endpoint("http://47.113.192.56:9000")
        .credentials("minioadmin", "minioadmin")
        .build();

    @Test
    public static void upload() throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidKeyException {
        try {
            boolean found =
                minioClient.bucketExists(BucketExistsArgs.builder().bucket("test").build());
            //检查testbucket桶是否创建，没有创建自动创建
            if (!found) {
                minioClient.makeBucket(MakeBucketArgs.builder().bucket("test").build());
            } else {
                System.out.println("Bucket 'test' already exists.");
            }
            //上传1.mp4
            minioClient.uploadObject(
                UploadObjectArgs.builder()
                    .bucket("test")
                    .object("123.jpg")
                    .filename("D:\\JavaLearning\\front\\123.jpg")
                    .build());
            System.out.println("上传成功");
        } catch (MinioException e) {
            System.out.println("Error occurred: " + e);
            System.out.println("HTTP trace: " + e.httpTrace());
        }

    }
    public static void main(String[] args)throws IOException, NoSuchAlgorithmException, InvalidKeyException {
        upload();
    }


}

