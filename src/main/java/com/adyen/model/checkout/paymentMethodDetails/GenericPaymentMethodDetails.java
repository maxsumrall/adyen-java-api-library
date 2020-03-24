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

import com.adyen.model.checkout.PaymentMethodDetails;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class GenericPaymentMethodDetails implements PaymentMethodDetails {

    @SerializedName("type")
    protected String type = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericPaymentMethodDetails)) return false;
        GenericPaymentMethodDetails that = (GenericPaymentMethodDetails) o;
        return getType().equals(that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType());
    }

    @Override
    public String toString() {
        return "GenericPaymentMethodDetails{" +
                "type='" + type + '\'' +
                '}';
    }
}
