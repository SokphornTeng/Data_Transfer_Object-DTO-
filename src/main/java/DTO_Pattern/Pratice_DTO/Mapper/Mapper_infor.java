package DTO_Pattern.Pratice_DTO.Mapper;

import DTO_Pattern.Pratice_DTO.DTO.Info_DTO;
import DTO_Pattern.Pratice_DTO.Entity.Infor;

public class Mapper_infor {

	public static Info_DTO convertInfo(Infor listInfo) {
		
		Info_DTO listDTO = new Info_DTO();
		listDTO.setName(listInfo.getName());
		listDTO.setAge(listInfo.getAge());
		listDTO.setEmai(listInfo.getEmail());
		listDTO.setPhoneNumber(listInfo.getPhoneNumber());
		
		return listDTO;
		
	}
	
}
