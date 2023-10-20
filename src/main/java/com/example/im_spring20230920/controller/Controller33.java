package com.example.im_spring20230920.controller;


import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;


@Controller
@RequiredArgsConstructor
@RequestMapping("main33")
public class Controller33 {

    @GetMapping("sub1")
    public void method() {

    }

    @PostMapping("sub2")
    public void method2(String name, Integer age, MultipartFile myfile) throws IOException {
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        if (myfile != null) {
            String fileName = myfile.getOriginalFilename();
            System.out.println("fileName = " + fileName);

            String path = "C:\\Temp\\upload_" + fileName;
            InputStream inputstream = myfile.getInputStream();
            FileOutputStream outputStream = new FileOutputStream(path);

            BufferedInputStream bis = new BufferedInputStream(inputstream);
            BufferedOutputStream bos = new BufferedOutputStream(outputStream);

            try (bis; bos; inputstream; outputStream) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        }
    }

    // 파라메터에 MultipartFile 넣고, getFilename -> String path -> input output
//   exception try 문장  byte , len 써주고 while 문으로 bis.read bos.write
    @GetMapping("sub3")
    public void method3() {

    }

    // post / main33 /sub4
    // 업로드한 파일을 c:\\Temp\\폴더내에 저장하는 예제
    @PostMapping("sub4")
    public void method4(MultipartFile upload) throws IOException {
        if (upload != null) {
            String fileName = upload.getOriginalFilename();

            String path = "C:\\Temp\\";

            BufferedInputStream bis = new BufferedInputStream(upload.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));

            try (bis; bos) {
                byte[] data = new byte[2048];
                int len = 0;

                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        }
    }

    @GetMapping("sub5")
    public void method5() {

    }


    @PostMapping
    public void method6(MultipartFile[] multipartFiles) throws IOException {
        String path = "C:\\Temp\\";

        for (MultipartFile multipartFile : multipartFiles) {
            if (multipartFile.getSize() != 0) {

                BufferedInputStream bis = new BufferedInputStream(multipartFile.getInputStream());
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + multipartFile.getOriginalFilename()));
                int len = 0;
                try (bis; bos) {

                    byte[] bytes = new byte[2048];
                    while (bis.read(bytes) != 0) {
                        bos.write(bytes, 0, len);

                    }
                }

            }
        }
    }
    /* 파일 전송하는 예제


     *
     * */


    @GetMapping("sub7")
    public void method7() {

    }

    //    여러 업로드 파일을 - C:\\TEMP\\upload\\ 에 저장
//     만약 upload 폴더가 없으면 생성하는 것 까지
    @PostMapping("sub8")
    public void method8(MultipartFile[] multipartFiles) throws Exception {

        String path = "C:\\Temp\\";

        for (MultipartFile multipartFile : multipartFiles) {
            String dirPath = multipartFile.getOriginalFilename();

            if (multipartFile.getSize() > 0) {
                BufferedInputStream bis = new BufferedInputStream(multipartFile.getInputStream());
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + multipartFile.getOriginalFilename()));

                File dir = new File(dirPath);
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                try (bis; bos) {
                    byte[] data = new byte[2048];
                    int len = 0;

                    while ((len = bis.read(data)) != -1) {

                        bos.write(data, 0, len);
                    }

                }
            }
        }
    }
}
