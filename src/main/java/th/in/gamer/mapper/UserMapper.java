package th.in.gamer.mapper;

import fr.xebia.extras.selma.Mapper;
import th.in.gamer.beans.User;
import th.in.gamer.entity.UserEntity;

@Mapper
public interface UserMapper {

	public UserEntity beanToEntity(User bean);
	public User entityToBean(UserEntity entity);
}
