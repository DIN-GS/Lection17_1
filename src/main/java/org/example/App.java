package org.example;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        BufferedInputStream in = new BufferedInputStream(new URL("https://www.google.com/imgres?imgurl=https%3A%2F%2Fbaza-gai.com.ua%2Fcatalog-images%2Fbmw%2Fm5%2Fmodel.jpg&imgrefurl=https%3A%2F%2Fbaza-gai.com.ua%2Fcatalog%2Fbmw%2Fm5%2Fspecs&tbnid=-zx9rDwI8GJL-M&vet=12ahUKEwiG0Y-50ff7AhVDx4sKHT-KAScQMygQegUIARDgAQ..i&docid=KWEz5jB_0rP5SM&w=640&h=480&q=bmw%20m5%202022&ved=2ahUKEwiG0Y-50ff7AhVDx4sKHT-KAScQMygQegUIARDgAQ").openStream());
        File car = new File("src/main/java/org/example/car");
        InputStream input = new URL("https://www.google.com/imgres?imgurl=https%3A%2F%2Fbaza-gai.com.ua%2Fcatalog-images%2Fbmw%2Fm5%2Fmodel.jpg&imgrefurl=https%3A%2F%2Fbaza-gai.com.ua%2Fcatalog%2Fbmw%2Fm5%2Fspecs&tbnid=-zx9rDwI8GJL-M&vet=12ahUKEwiG0Y-50ff7AhVDx4sKHT-KAScQMygQegUIARDgAQ..i&docid=KWEz5jB_0rP5SM&w=640&h=480&q=bmw%20m5%202022&ved=2ahUKEwiG0Y-50ff7AhVDx4sKHT-KAScQMygQegUIARDgAQ").openStream();
        Files.copy(in, Paths.get(car.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
    }
}
