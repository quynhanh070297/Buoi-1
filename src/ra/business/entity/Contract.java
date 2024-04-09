package ra.business.entity;

import java.time.LocalDate;

public class Contract
{
    private Number contractId;
    private String contractName;
    private String employeeId;
    private String customerId;
    private LocalDate createdDate;
    private LocalDate expiryDate;
    private double totalAmount;
    private String description;
    private Number priority;
}
