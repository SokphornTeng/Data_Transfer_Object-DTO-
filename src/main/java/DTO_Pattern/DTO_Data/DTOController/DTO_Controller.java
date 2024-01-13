package DTO_Pattern.DTO_Data.DTOController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DTO_Pattern.DTO_Data.DTO.userDTO;
import DTO_Pattern.DTO_Data.Model.Entity.userInfo;
import DTO_Pattern.DTO_Data.Service.userService;

@RestController
@RequestMapping("/api/dto")
public class DTO_Controller {

	private final userService infoService;
    @Autowired
	public DTO_Controller(userService infoService) {
		super();
		this.infoService = infoService;
	}
	
    @PostMapping
    public ResponseEntity<userInfo> createUser(@RequestBody userInfo info){
    	userInfo myInfor = this.infoService.createUserInfo(info);
    	return new ResponseEntity<>(myInfor, HttpStatus.CREATED);
    }
    
    
    @GetMapping
    public ResponseEntity<List<userDTO>> getAllUsers() {
    	// take from class userServiceImplement
          List<userDTO> userList = this.infoService.takeAllInfo();
          return  new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<userDTO> getUserById(@PathVariable("id") Long id) {
    	userDTO savedUser = this.infoService.takeById(id);
         return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }
    
}
