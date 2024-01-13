package DTO_Pattern.Pratice_DTO.DTO_Controller;

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

import DTO_Pattern.Pratice_DTO.DTO.Info_DTO;
import DTO_Pattern.Pratice_DTO.Entity.Infor;
import DTO_Pattern.Pratice_DTO.Services.infoServiceImplement;

@RestController
@RequestMapping("/api/testDTO")
public class Controller {

	private final infoServiceImplement info_;
    @Autowired
	public Controller(infoServiceImplement info_) {
		super();
		this.info_ = info_;
	}
    @PostMapping
    public ResponseEntity<Infor> addData(@RequestBody Infor reqInfo){
    	Infor newInfo = this.info_.createInfo(reqInfo);
    	return new ResponseEntity<>(newInfo, HttpStatus.CREATED);
    }
    @GetMapping
	public ResponseEntity<List<Info_DTO>> listData(){
		List<Info_DTO> listing = this.info_.infoListDTO();
		return new ResponseEntity<>(listing, HttpStatus.OK);
	}
    @GetMapping("/{id}")
    public ResponseEntity<Info_DTO> findOne(@PathVariable Long id){
    	Info_DTO find = this.info_.takeById(id);
    	return new ResponseEntity<>(find, HttpStatus.OK);
    }
}
