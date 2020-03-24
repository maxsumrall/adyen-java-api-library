package com.adyen.model.checkout.paymentMethodDetails;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class GenericIssuerPaymentMethodDetails extends GenericPaymentMethodDetails {

    @SerializedName("issuer")
    protected String issuer = null;

    /**
     * The issuer value for the paymentMethod
     *
     * @return
     */
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericIssuerPaymentMethodDetails)) return false;
        if (!super.equals(o)) return false;
        GenericIssuerPaymentMethodDetails that = (GenericIssuerPaymentMethodDetails) o;
        return getIssuer().equals(that.getIssuer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIssuer());
    }

    @Override
    public String toString() {
        return "GenericIssuerPaymentMethod{" +
                "issuer='" + issuer + '\'' +
                "} " + super.toString();
    }
}
