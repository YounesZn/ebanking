package tp.digitalbanking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.digitalbanking.entities.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
