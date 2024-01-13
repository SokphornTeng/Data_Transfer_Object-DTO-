package DTO_Pattern.Pratice_DTO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DTO_Pattern.Pratice_DTO.Entity.Infor;

@Repository
public interface infoRepo extends JpaRepository<Infor, Long>{

}
