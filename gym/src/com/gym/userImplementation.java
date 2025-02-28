package com.gym;

public class userImplementation implements IUser {

	private User users[];
	
	userImplementation()
	{
		users = new User[5];
	}

	@Override
	public boolean register(User user, int index) {
		// TODO Auto-generated method stub
		System.out.println("user info is:"+user);
		users[index] = user;
		return false;
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("user username and password is:"+username+" "+password);
		for(User user:users)
		{
			if(user!=null)
			{
				if(user.getUname().equals(username) && user.getPassword().equals(password))
				{
					return true;
				}
			}
		}
		return false;
	}
}
	
