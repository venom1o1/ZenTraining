package com.brand.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.brand.model.Brand; 

@Service
public class BrandServiceImpl implements BrandService {
	
	List<Brand> brandlist=Arrays.asList(new Brand(1,"sony"),
										new Brand(2,"Apple"),
										new Brand(3,"Asus"));
	
	public Brand getBrand(String brandname)
	{
		for(Brand b: brandlist)
		{
			if(b.getBname().equalsIgnoreCase(brandname))
				return b;
		
		}
		return null;
	}
}