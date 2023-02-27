package com.yolo.xczx.system;

import com.yolo.xczx.system.model.po.Dictionary;
import com.yolo.xczx.system.service.DictionaryService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 912
 * @date 2023/2/26 20:43
 */
@SpringBootTest
class DictionaryTest {
    @Resource
    private DictionaryService dictionaryService;

    @Test
    void test() {
        List<Dictionary> dictionaries = dictionaryService.queryAll();
        System.out.println(dictionaries);
    }
}
