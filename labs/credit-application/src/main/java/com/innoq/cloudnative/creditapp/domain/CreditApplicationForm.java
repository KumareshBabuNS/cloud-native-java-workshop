package com.innoq.cloudnative.creditapp.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class CreditApplicationForm {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private int term;

    private BigDecimal amount;

    private String purpose;

    private BigDecimal percentage;

    @Embedded
    private SelfDisclosure selfDisclosure;

    private String customerId;


    public CreditApplicationForm() {
        selfDisclosure = new SelfDisclosure();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }


    public SelfDisclosure getSelfDisclosure() {
        return selfDisclosure;
    }

    public void setSelfDisclosure(SelfDisclosure selfDisclosure) {
        this.selfDisclosure = selfDisclosure;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CreditApplicationForm{" +
                "id=" + id +
                ", term=" + term +
                ", amount=" + amount +
                ", purpose='" + purpose + '\'' +
                ", percentage=" + percentage +
                ", selfDisclosure=" + selfDisclosure +
                ", customerId=" + customerId +
                '}';
    }
}
