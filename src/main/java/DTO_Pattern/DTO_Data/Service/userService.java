package DTO_Pattern.DTO_Data.Service;

import java.util.List;

import DTO_Pattern.DTO_Data.DTO.userDTO;
import DTO_Pattern.DTO_Data.Model.Entity.userInfo;

public interface userService {

	userInfo createUserInfo(userInfo info);
	
	List<userDTO> takeAllInfo();
	
	userDTO takeById(Long id);
	
}
