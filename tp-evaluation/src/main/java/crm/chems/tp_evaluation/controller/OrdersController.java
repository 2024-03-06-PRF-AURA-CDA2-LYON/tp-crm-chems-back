package crm.chems.tp_evaluation.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import crm.chems.tp_evaluation.entity.Orders;
import crm.chems.tp_evaluation.repository.OrdersRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
    @Autowired
    private OrdersRepository repo;

    @GetMapping
    public Iterable<Orders> getAll(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Orders> one(@PathVariable Long id){
        return repo.findById(id);
    }

    @PutMapping("/{id}")
    public Orders update(@PathVariable Long id, @Valid @RequestBody Orders order){
        Optional<Orders> existingOrders = repo.findById(id);
        if(existingOrders.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User with ID " + id + " not found");
        }
        order.setId(id);
        repo.save(order);
        return order;
    }
    
}
