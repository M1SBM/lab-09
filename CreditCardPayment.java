package edu.kau.fcit.cpit252.paymentsStrategy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class CreditCardPayment {
    private String transactionId;
    private String name;
    private String cardNumber;
    private String cvv;
    private String monthYearExpiration;
    private Date date;


    public CreditCardPayment(String name, String cardNumber, String cvv,
                             String monthYearExpiration) {
        transactionId = UUID.randomUUID().toString();
        name = name;
        cardNumber = cardNumber;
        cvv = cvv;
        monthYearExpiration = monthYearExpiration;
        date = new Date();
    }


    @Override
    public String toString() {
        String datePattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        return "Credit Card Payment " +
                "\n\tTransaction Id: " + this.transactionId +
                "\n\tDate: " + simpleDateFormat.format(this.date) +
                "\n\tCard Number: ****" +
                this.cardNumber.substring(this.cardNumber.length() - 5, this.cardNumber.length() - 1);
    }
}
