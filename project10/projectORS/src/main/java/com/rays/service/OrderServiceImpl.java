package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.OrderDAOInt;
import com.rays.dto.OrderDTO;

@Service
@Transactional
public class OrderServiceImpl  extends BaseServiceImpl<OrderDTO, OrderDAOInt> implements OrderServiceInt{

	@Autowired
	OrderDAOInt OrderDAO;
}
