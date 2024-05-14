package tp.digitalbanking.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import tp.digitalbanking.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
