package DTO_Pattern.Pratice_DTO.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import DTO_Pattern.Pratice_DTO.DTO.Info_DTO;
import DTO_Pattern.Pratice_DTO.Entity.Infor;
import DTO_Pattern.Pratice_DTO.Mapper.Mapper_infor;
import DTO_Pattern.Pratice_DTO.Repository.infoRepo;

public class infoServiceImplement implements infoService {

	private ModelMapper modelMapper;
	
	private final infoRepo infoRepo_;
	@Autowired
	public infoServiceImplement(infoRepo infoRepo_) {
		super();
		this.infoRepo_ = infoRepo_;
	}

	@Override
	public Infor createInfo(Infor listInfors) {
		return this.infoRepo_.save(listInfors);
	}

	@Override
	public List<Info_DTO> infoListDTO() {
		
	 List<Infor> infos = this.infoRepo_.findAll();
	 List<Info_DTO> infoDto = new ArrayList<Info_DTO>();
		for(Infor myInfo : infos) {
			Info_DTO dto = modelMapper.map(myInfo, Info_DTO.class);
			infoDto.add(dto);
		}
		return infoDto;
	}

	@Override
	public Info_DTO takeById(Long id) {
		Optional<Infor> findInfo = this.infoRepo_.findById(id);
		return Mapper_infor.convertInfo(findInfo.get());
	}

}
