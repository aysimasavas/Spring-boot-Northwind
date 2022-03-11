package com.aysimasavas.northwind.business.abstracts;

import com.aysimasavas.northwind.core.entities.User;
import com.aysimasavas.northwind.core.utilities.results.DataResult;
import com.aysimasavas.northwind.core.utilities.results.Result;

public interface UserService {

	Result add(User user);

	DataResult<User> findByEmail(String email);
}
