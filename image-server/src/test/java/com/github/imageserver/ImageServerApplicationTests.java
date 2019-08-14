package com.github.imageserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.FileCopyUtils;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImageServerApplicationTests {
    @Value("${web.upload.path}")
    private String path;

    /**
     * 文件上传测试
     */
    @Test
    public void uploadTest() throws Exception {
        File f = new File("/Users/huorong/Documents/idea/springcloud-learning/timg.jpeg");
        FileCopyUtils.copy(f, new File(path + "/aaa.png"));
    }

    @Test
    public void listFilesTest() {
        File file = new File(path);
        for (File f : file.listFiles()) {
            System.out.println("fileName : " + f.getName());
        }
    }

}
