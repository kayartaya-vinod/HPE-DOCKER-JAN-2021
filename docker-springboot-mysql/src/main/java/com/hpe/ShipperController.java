package com.hpe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shippers")
public class ShipperController {
	
	public ShipperController() {
		System.out.println(">>>> ShipperController instantiated!");
	}

	@Autowired
	ShipperService service;

	@GetMapping
	public Iterable<Shipper> getAllShippers() {
		Iterable<Shipper> data = service.getAll();
		System.out.println(">>>> Getting all shippers...");
		data.forEach(System.out::println);
		return data;
	}
	
	@GetMapping("/{id}")
	public Shipper getById(@PathVariable Integer id) {
		return service.getById(id);
	}
	
	@PostMapping
	public Shipper addNew(@RequestBody Shipper shipper) {
		return service.add(shipper);
	}
}
