package com.apringboot.api.springbootapi.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

    public final String UPLOAD_DIR = "E:\\CODE\\spring and springBoot project\\springbootapi\\src\\main\\resources\\static\\image";

    public boolean uploadFile(MultipartFile multipart) {

        boolean f = false;

        try {

            // InputStream stream = multipart.getInputStream();
            // // reading the data from stream(multipart) to write the data to UPLOAD_DIR

            // byte data[] = new byte[stream.available()];
            // // reading
            // stream.read(data);
            // // writing
            // FileOutputStream fos = new FileOutputStream(UPLOAD_DIR + File.separator +
            // multipart.getOriginalFilename());

            // // read
            // fos.write(data);
            // fos.flush();
            // fos.close();

            Files.copy(multipart.getInputStream(),
                    Paths.get(UPLOAD_DIR + File.separator + multipart.getOriginalFilename()),
                    StandardCopyOption.REPLACE_EXISTING);

            f = true;

        } catch (Exception e) {
            // TODO: handle exception
        }
        return f;
    }

}
