package com.xxgg.blog.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

/**
 * @description: 图片工具类
 * @author: 先谢郭嘉
 * @create: 2020-09-27 08:21
 **/
public class ImageUtil {
    /**
     * 将网络图片文件转化为字节数组字符串，并对其进行Base64编码处理
     *
     * @param imageUrl 图片的url路径，如http://.....xx.jpg
     * @return
     */
    public static String encodeUrlImageToBase64(URL imageUrl) {
        ByteArrayOutputStream outputStream = null;
        try {
            BufferedImage bufferedImage = ImageIO.read(imageUrl);
            outputStream = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", outputStream);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return Base64.getEncoder().encodeToString(outputStream.toByteArray());
    }

    /**
     * 将本地图片文件转化为字节数组字符串，并对其进行Base64编码处理
     *
     * @param imageFile
     * @return
     */
    public static String encodeFileImageToBase64(File imageFile) {

        ByteArrayOutputStream outputStream = null;
        try {
            BufferedImage bufferedImage = ImageIO.read(imageFile);
            outputStream = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", outputStream);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return Base64.getEncoder().encodeToString(outputStream.toByteArray());
    }

    /**
     * Base64位编码的图片进行解码，并保存到指定目录
     *
     * @param base64  base64编码的图片信息
     * @param path    指定目录
     * @param imgName 图片名称
     */
    public static void decodeBase64ToImage(String base64, String path, String imgName) {

        try {
            FileOutputStream write = new FileOutputStream(new File(path + imgName));
            byte[] decodeByte = Base64.getDecoder().decode(base64);
            write.write(decodeByte);
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
