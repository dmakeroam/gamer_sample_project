package th.in.gamer.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.xebia.extras.selma.Selma;
import th.in.gamer.beans.User;
import th.in.gamer.entity.UserEntity;
import th.in.gamer.mapper.UserMapper;
import th.in.gamer.user.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	UserMapper mapper = Selma.builder(UserMapper.class).build();
	
	@Override
	public boolean saveUser(User user) {
		UserEntity entity = mapper.beanToEntity(user);
		entity = userRepository.save(entity);
		return entity!=null;
	}

	@Override
	public User findById(int id) {
		UserEntity entity = userRepository.findById(id);
		User user = mapper.entityToBean(entity);
		return  user;
	}

	@Override
	public boolean deleteById(int id) {
		int result = userRepository.deleteById(id);
		return result>0;
	}

}
