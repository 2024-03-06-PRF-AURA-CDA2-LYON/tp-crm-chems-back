package crm.chems.tp_evaluation.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import crm.chems.tp_evaluation.entity.Customer;
import crm.chems.tp_evaluation.repository.CustomerRepository;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository repo;

    @GetMapping
    public Iterable<Customer> getAll(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> one(@PathVariable Long id){
        return repo.findById(id);
    }

    @PutMapping("/{id}")
    public Customer update(@PathVariable Long id, @Valid @RequestBody Customer customer){
        Optional<Customer> existingOrders = repo.findById(id);
        if(existingOrders.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User with ID " + id + " not found");
        }
        customer.setId(id);
        repo.save(customer);
        return customer;
    }
}
