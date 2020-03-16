package com.douzone.fileupload.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
	
	private static final String SAVE_PATH = "/mysite-uploads";
	private static final String URL = "/images";

	public String restore(MultipartFile multipartFile) {
		String url;
		
		try {
			if(multipartFile.isEmpty()) {
				return url = "";
			}

			String originFilename = multipartFile.getOriginalFilename();
			String extName = originFilename.substring( originFilename.lastIndexOf('.')+1);
			String saveFilename = generateSaveFilename(extName);
			long fileSize = multipartFile.getSize();

			System.out.println("######## " + originFilename);
			System.out.println("######## " + saveFilename);
			System.out.println("######## " + fileSize);
			
			byte[] fileData = multipartFile.getBytes();
			
			OutputStream os = new FileOutputStream(SAVE_PATH + "/" + saveFilename);
			os.write(fileData);
			os.close();
			
			url = URL + "/" + saveFilename;
			
		} catch (IOException e) {
			throw new RuntimeException("file upload error"+e);
		}
		
		return url;
	}

	private String generateSaveFilename(String extName) {
		String filenaem = "";
		
		Calendar calendar = Calendar.getInstance();
		filenaem += calendar.get(Calendar.YEAR);
		filenaem += calendar.get(Calendar.MONTH);
		filenaem += calendar.get(Calendar.DATE);
		filenaem += calendar.get(Calendar.HOUR);
		filenaem += calendar.get(Calendar.MINUTE);
		filenaem += calendar.get(Calendar.SECOND);
		filenaem += calendar.get(Calendar.MILLISECOND);
		filenaem += ("."+extName);
		
		return filenaem;
	}

}
