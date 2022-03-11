package com.aysimasavas.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aysimasavas.northwind.business.abstracts.ProductService;
import com.aysimasavas.northwind.core.utilities.results.DataResult;
import com.aysimasavas.northwind.core.utilities.results.Result;
import com.aysimasavas.northwind.core.utilities.results.SuccesDataResult;
import com.aysimasavas.northwind.dataAccess.abstracts.ProductDao;
import com.aysimasavas.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccesDataResult<List<Product>>(this.productDao.findAll(), "data listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccesDataResult("ürün eklendi");
	}

}
