package com.alphainnovator.decify.core.Entities;

import java.util.Date;

public class PaymentEntity {
    /*bankName string
		accountNumber  string
		cardNumber string
		dateofTransaction dateTime
		paymentStatus boolean */

    String accountNo;
    String cardNo;
    String bankName;
    Date transactionDate;
    boolean paymentStatus;

}
