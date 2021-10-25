package org.fges.m1.ppc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoissonRepository extends CrudRepository<Boisson, Integer> {
  
}
