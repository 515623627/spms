package com.spms.validator.impl;

import org.springframework.stereotype.Component;

import com.spms.entity.TSuppliersinfo;
import com.spms.validator.BaseValidator;

@Component
public class SuppliersValidator implements BaseValidator<TSuppliersinfo> {

	@Override
	public TSuppliersinfo validateWhenSave(TSuppliersinfo object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TSuppliersinfo validateWhenDelete(TSuppliersinfo object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TSuppliersinfo validateWhenUpdate(TSuppliersinfo object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TSuppliersinfo validateWhenQuery(TSuppliersinfo object) {
		TSuppliersinfo suppliers = new TSuppliersinfo();
		
		return suppliers;
	}

}
