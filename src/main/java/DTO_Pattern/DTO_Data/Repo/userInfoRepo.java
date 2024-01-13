package DTO_Pattern.DTO_Data.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DTO_Pattern.DTO_Data.Model.Entity.userInfo;

@Repository
public interface userInfoRepo extends JpaRepository<userInfo, Long> {

}
