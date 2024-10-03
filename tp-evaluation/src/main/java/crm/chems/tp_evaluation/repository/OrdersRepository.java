package crm.chems.tp_evaluation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import crm.chems.tp_evaluation.entity.Orders;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long>{
}
