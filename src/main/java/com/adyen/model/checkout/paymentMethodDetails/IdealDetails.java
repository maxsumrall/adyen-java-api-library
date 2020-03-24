/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2020 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */

package com.adyen.model.checkout.paymentMethodDetails;

import java.util.Objects;

/**
 * IdealDetails
 */

public class IdealDetails extends GenericIssuerPaymentMethodDetails {

    public IdealDetails() {
        this.type = "ideal";
    }

    public IdealDetails issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdealDetails idealDetails = (IdealDetails) o;
        return Objects.equals(this.issuer, idealDetails.issuer) &&
                Objects.equals(this.type, idealDetails.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issuer, type);
    }


    @Override
    public String toString() {
        return "IdealDetails{" +
                "issuer='" + issuer + '\'' +
                "} " + super.toString();
    }


}
