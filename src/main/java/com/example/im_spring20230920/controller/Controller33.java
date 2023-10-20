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

    @PostMapping("sub6")
    public void method6(MultipartFile[] files) throws IOException {
//        System.out.println("files.length = " + files.length);
        for (MultipartFile file : files) {
            System.out.println("file.getSize() = " + file.getSize());

            if (file.getSize() > 0) { //길이는 1부터 시작이라 0을 확실하게 얻기 위해
                String path = "C:\\Temp\\";
                BufferedInputStream bis = new BufferedInputStream(file.getInputStream());
                BufferedOutputStream bos
                        = new BufferedOutputStream((new FileOutputStream(path + file.getOriginalFilename())));

                int len = 0;
                byte[] data = new byte[2048];
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        }
    }

    @GetMapping("sub7")
    public void method7() {

    }

    //    여러 업로드 파일을 - C:\\TEMP\\upload\\ 에 저장
//     만약 upload 폴더가 없으면 생성하는 것 까지
    @PostMapping("sub8")
    public void method8(MultipartFile[] files) throws IOException {

        for (MultipartFile file : files) {


            if (file.getSize() > 0) {
                String path = "C:\\Temp\\upload";
                String filePath= path+ "\\" +file.getOriginalFilename();
                File dir =new File(path);
                if(!dir.exists()){
                    dir.mkdirs();
                }
                BufferedInputStream bis = new BufferedInputStream(file.getInputStream());
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
                try (bos; bis) {
                    int len = 0;
                    byte[] data = new byte[2048];
                    while ((len = bis.read(data)) != -1) {
                        bos.write(data, 0, len);
                    }
                    bos.flush();

                }
            }
        }
    }

}
