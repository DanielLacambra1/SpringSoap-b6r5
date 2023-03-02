package com.rubrica.b6r5.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "surcharge"
})
@XmlRootElement(name = "SurchargeResponse")
public class SurchargeResponse {
    protected int surcharge;

    public int getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(int value) {
        this.surcharge = value;
    }
}