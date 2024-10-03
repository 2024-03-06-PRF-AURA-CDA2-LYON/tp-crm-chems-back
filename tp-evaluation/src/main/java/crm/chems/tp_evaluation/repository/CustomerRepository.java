package crm.chems.tp_evaluation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import crm.chems.tp_evaluation.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
}
