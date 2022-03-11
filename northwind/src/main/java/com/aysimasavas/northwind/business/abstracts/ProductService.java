package com.aysimasavas.northwind.business.abstracts;

import java.util.List;

import com.aysimasavas.northwind.core.utilities.results.DataResult;
import com.aysimasavas.northwind.core.utilities.results.Result;
import com.aysimasavas.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();

	Result add(Product product);

}
