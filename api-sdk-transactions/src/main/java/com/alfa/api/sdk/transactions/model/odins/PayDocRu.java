package com.alfa.api.sdk.transactions.model.odins;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class PayDocRu {

    @XmlElement(name = "PaymentDataType")
    private PaymentDataType paymentDataType;
    @XmlElement(name = "BudgetPaymentInfo")
    private BudgetPaymentInfo budgetPaymentInfo;
}
