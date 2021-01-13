package com.hpe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipperService {
	@Autowired
	ShipperRepository repo;

	public Iterable<Shipper> getAll() {
		return repo.findAll();
	}

	public Shipper getById(Integer id) {
		return repo.findById(id).get();
	}

	public Shipper add(Shipper shipper) {
		return repo.save(shipper);
	}
}