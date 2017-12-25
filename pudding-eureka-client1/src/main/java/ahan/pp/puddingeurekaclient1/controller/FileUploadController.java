package ahan.pp.puddingeurekaclient1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.*;
import java.io.File;

/**
 * create by wusf on 2017/12/25.<br>
 */
@Controller
public class FileUploadController {

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public @ResponseBody String fileUpload(@RequestParam(value="file",required =  true)MultipartFile file)
    throws  Exception{

        byte[] bytes= file.getBytes();
        File fileToSave=new File(file.getOriginalFilename());
        FileCopyUtils.copy(bytes, fileToSave);
        return fileToSave.getAbsolutePath();
    }
}
