package tp.digitalbanking.web;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tp.digitalbanking.DTOs.AccountHistoryDTO;
import tp.digitalbanking.DTOs.BankAccountDTO;
import tp.digitalbanking.exepctions.BankAccountNotFoundException;
import tp.digitalbanking.services.BankAccountService;

import javax.security.auth.login.AccountNotFoundException;
import java.util.List;

@RestController
@AllArgsConstructor
public class BankAccountRestController {
    private BankAccountService bankAccountService;

    @GetMapping("/accounts")
    public List<BankAccountDTO> listAccounts() {
        return bankAccountService.bankAccountList();
    }

    @GetMapping("/accounts/{accountId}")
    public BankAccountDTO getAccount(@PathVariable(name = "accountId") String id) throws AccountNotFoundException, BankAccountNotFoundException {
        return bankAccountService.getBankAccount(id);
    }

    @GetMapping("/accounts/{accountId}/operations")
    public AccountHistoryDTO getAccountOperationsHistory(@PathVariable(name = "accountId") String accountId, @RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "size", defaultValue = "5") int size) throws BankAccountNotFoundException {
            return bankAccountService.getAccountOperationById(accountId, page, size);
    }
}
