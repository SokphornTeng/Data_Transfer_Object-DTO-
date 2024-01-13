package DTO_Pattern.DTO_Data.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DTO_Pattern.DTO_Data.DTO.userDTO;
import DTO_Pattern.DTO_Data.Mapper.userMapper;
import DTO_Pattern.DTO_Data.Model.Entity.userInfo;
import DTO_Pattern.DTO_Data.Repo.userInfoRepo;

@Service
public class userServiceImplementation implements userService {

    @Autowired
    private ModelMapper modelMapper;
	
	
	private final userInfoRepo userInfoRepository;
	@Autowired
	public userServiceImplementation(userInfoRepo userInfoRepository) {
		super();
		this.userInfoRepository = userInfoRepository;
	}
	
	

	
	@Override
	public userInfo createUserInfo(userInfo info) {
		return this.userInfoRepository.save(info);
	}

	@Override
	public List<userDTO> takeAllInfo() {
		
		List<userInfo> userList = this.userInfoRepository.findAll();
		List<userDTO> userDTOList = new ArrayList<userDTO>();
		
		for(userInfo myInfo : userList) {
			
			userDTO myDTO = modelMapper.map(myInfo, userDTO.class);
	        userDTOList.add(myDTO);
		}
	
		return userDTOList	;
	}




	@Override
	public userDTO takeById(Long id) {
		Optional<userInfo> optionaluserInfo = this.userInfoRepository.findById(id);
		return userMapper.convertUserInfo(optionaluserInfo.get());
	}

}
