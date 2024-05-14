package tp.digitalbanking.DTOs;

import lombok.Data;
import tp.digitalbanking.enums.AccountStatus;

import java.util.Date;

@Data
public class SavingBankAccountDTO  extends BankAccountDTO{
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}