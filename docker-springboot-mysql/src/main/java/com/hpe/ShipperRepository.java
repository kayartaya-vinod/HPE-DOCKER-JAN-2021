package com.hpe;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipperRepository extends CrudRepository<Shipper, Integer> {
}
