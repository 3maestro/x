package com.cafe24.radev.service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe24.radev.mapper.UserMapper;
import com.cafe24.radev.vo.CarFactory;

@Service
public class UserService {

	@Value("${static.file.upload.path}")
	private String location;
	
	@Autowired
	private UserMapper userMapper;	
	
	public int addCarFactory(CarFactory carFactory, MultipartFile bs_docu){
		String realFilename = null;
		long filesize = 0;
		if(bs_docu != null) {			
			String filename = StringUtils.cleanPath(bs_docu.getOriginalFilename());				
		
			try (InputStream inputStream = bs_docu.getInputStream()) {
				
				Files.copy(inputStream, Paths.get(location).resolve(filename),
						StandardCopyOption.REPLACE_EXISTING);
				realFilename = bs_docu.getOriginalFilename();
				filesize = bs_docu.getSize();
				System.out.println(realFilename + " << 실제 업로드된 파일명");
				System.out.println(bs_docu.getContentType() + " << 실제 업로드된 파일명");	
				System.out.println(filesize + " << 실제 업로드된 사이즈명");				
				System.out.println("/" + location + "/ " +filename+ " <<<<<<<<<<<< 저장 경로");//고정으로 할꺼면 파일명,사이즈만 필요
				
			} catch (IOException e) {
				e.printStackTrace();				
				try {
					Files.delete(Paths.get(location).resolve(filename));
				}catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		System.out.println(realFilename);
		return userMapper.addCarFactory(carFactory, realFilename,filesize);
	}
}
