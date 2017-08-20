package th.in.gamer.user.services;

import th.in.gamer.beans.User;

public interface UserService {

	public boolean saveUser(User user);
	
	public User findById(int id);
	
	public boolean deleteById(int id);
}
