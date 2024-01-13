package DTO_Pattern.DTO_Data.Mapper;

import DTO_Pattern.DTO_Data.DTO.userDTO;
import DTO_Pattern.DTO_Data.Model.Entity.userInfo;

public class userMapper {

	public static  userDTO convertUserInfo(userInfo dtoInfo) {
		
		userDTO info = new userDTO();
		
		info.setId(dtoInfo.getId());
		info.setFirstName(dtoInfo.getFirstName());
		info.setLastName(dtoInfo.getLastName());
		info.setEmail(dtoInfo.getEmail());
		
		return info;
	}
	
}
