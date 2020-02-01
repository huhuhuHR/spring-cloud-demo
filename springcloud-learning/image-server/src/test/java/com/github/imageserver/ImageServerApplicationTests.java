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


    @Test
    public void listFilesTest() {
        File file = new File("F:\\springcloud-learning\\image");
        for (File f : file.listFiles()) {
            System.out.println("fileName : " + f.getName());
        }
    }

}
