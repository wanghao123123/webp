package com.example.webp;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.name.Rename;

import java.io.File;
import java.io.IOException;

/**
 * @author hao.wong
 * @date 2021/11/5
 */
public class Test {


    public static void main(String[] args) throws IOException {
        String originalImage=System.getProperty("user.dir")+"/file/wallhaven-y8233x.jpeg";
        String thumbnailImage=System.getProperty("user.dir")+"/file/图片.webp";
        Thumbnails.of(originalImage).scale(1.0f)
                .outputFormat("webp")
                .outputQuality(1.0f)
                .toFile(thumbnailImage);
    }
}
