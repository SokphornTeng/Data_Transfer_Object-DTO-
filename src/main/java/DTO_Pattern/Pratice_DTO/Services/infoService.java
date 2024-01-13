package DTO_Pattern.Pratice_DTO.Services;

import java.util.List;

import DTO_Pattern.Pratice_DTO.DTO.Info_DTO;
import DTO_Pattern.Pratice_DTO.Entity.Infor;

public interface infoService {

	public Infor createInfo(Infor listInfors); 
	
	public List<Info_DTO> infoListDTO();
	
	public Info_DTO takeById(Long id);
	
}
