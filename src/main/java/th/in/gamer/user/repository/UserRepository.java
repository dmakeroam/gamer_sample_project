package th.in.gamer.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import th.in.gamer.entity.UserEntity;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<UserEntity, Integer>{

	public UserEntity findById(int id);
	
	public int deleteById(int id);
	
	public UserEntity save(UserEntity userEntity);	
	
}
