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
 * MolPayDetails
 */

public class MolPayDetails extends GenericIssuerPaymentMethodDetails {

    public MolPayDetails() {
        this.type = "molpay";
    }

    public MolPayDetails issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    public MolPayDetails type(String type) {
        this.type = type;
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
        MolPayDetails molPayDetails = (MolPayDetails) o;
        return Objects.equals(this.issuer, molPayDetails.issuer) &&
                Objects.equals(this.type, molPayDetails.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issuer, type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MolPayDetails {\n");

        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
