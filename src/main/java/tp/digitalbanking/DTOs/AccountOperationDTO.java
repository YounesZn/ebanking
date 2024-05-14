package tp.digitalbanking.DTOs;

import lombok.Data;
import tp.digitalbanking.enums.OperationDate;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationDate type;
    private String description;
}
