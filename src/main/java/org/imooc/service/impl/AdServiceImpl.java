package org.imooc.service.impl;

import java.io.File;
import java.io.IOException;

import org.imooc.bean.Ad;
import org.imooc.dao.AdDao;
import org.imooc.dto.AdDto;
import org.imooc.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AdServiceImpl implements AdService {

	@Autowired
	private AdDao adDao;

	@Value("${adImage.savePath}")
	private String adImageSavePath;

	@Override
	public boolean add(AdDto adDto) {
		Ad ad = new Ad();
		ad.setTitle(adDto.getTitle());
		ad.setLink(adDto.getLink());
		ad.setWeight(adDto.getWeight());
		// 如果没有传图片处理
		if (adDto.getImgFile() != null && adDto.getImgFile().getSize() > 0) {
			String fileName = System.currentTimeMillis() + "_" + adDto.getImgFile().getOriginalFilename();
			File file = new File(adImageSavePath + fileName);
			File fileFolder = new File(adImageSavePath);
			// 如果目录不存在的处理
			if (!fileFolder.exists()) {
				fileFolder.mkdirs();
			}

			try {
				adDto.getImgFile().transferTo(file);
				ad.setImgFileName(fileName);
				adDao.insert(ad);
				return true;
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
	}
}
