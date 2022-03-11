package com.aysimasavas.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aysimasavas.northwind.business.abstracts.UserService;
import com.aysimasavas.northwind.core.dataAccess.UserDao;
import com.aysimasavas.northwind.core.entities.User;
import com.aysimasavas.northwind.core.utilities.results.DataResult;
import com.aysimasavas.northwind.core.utilities.results.Result;
import com.aysimasavas.northwind.core.utilities.results.SuccesDataResult;
import com.aysimasavas.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService {
	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("kullanıcı eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccesDataResult<User>(this.userDao.findByEmail(email), "kullanıcı bulundu");
	}

}
