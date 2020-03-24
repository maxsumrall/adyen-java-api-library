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

import com.adyen.model.Address;
import com.adyen.model.BrowserInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Objects;

import static com.adyen.constants.ApiConstants.PaymentMethodType.TYPE_SCHEME;

/**
 * CardDetails
 */

public class CardDetails extends GenericPaymentMethodDetails {

    @SerializedName("MD")
    private String MD = null;

    @SerializedName("PaRes")
    private String paRes = null;

    @SerializedName("billingAddress")
    private Address billingAddress = null;

    @SerializedName("brand")
    private String brand = null;

    @SerializedName("browserInfo")
    private BrowserInfo browserInfo = null;

    @SerializedName("cardDetails.cvc")
    private String cardDetailsCvc = null;

    @SerializedName("cupsecureplus.smscode")
    private String cupsecureplusSmscode = null;

    @SerializedName("cvc")
    private String cvc = null;

    @SerializedName("encryptedCardNumber")
    private String encryptedCardNumber = null;

    @SerializedName("encryptedExpiryMonth")
    private String encryptedExpiryMonth = null;

    @SerializedName("encryptedExpiryYear")
    private String encryptedExpiryYear = null;

    @SerializedName("encryptedSecurityCode")
    private String encryptedSecurityCode = null;

    @SerializedName("expiryMonth")
    private String expiryMonth = null;

    @SerializedName("expiryYear")
    private String expiryYear = null;

    /**
     * Gets or Sets fundingSource
     */
    @JsonAdapter(FundingSourceEnum.Adapter.class)
    public enum FundingSourceEnum {
        CREDIT("credit"),
        DEBIT("debit");

        private String value;

        FundingSourceEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FundingSourceEnum fromValue(String text) {
            for (FundingSourceEnum b : FundingSourceEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<FundingSourceEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FundingSourceEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FundingSourceEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FundingSourceEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("fundingSource")
    private FundingSourceEnum fundingSource = null;

    @SerializedName("holderName")
    private String holderName = null;

    @SerializedName("installments")
    private String installments = null;

    @SerializedName("issuer")
    private String issuer = null;

    @SerializedName("networkPaymentReference")
    private String networkPaymentReference = null;

    @SerializedName("number")
    private String number = null;

    @SerializedName("returnUrlQueryString")
    private String returnUrlQueryString = null;

    @SerializedName("telephoneNumber")
    private String telephoneNumber = null;

    @SerializedName("threeds2.challengeResult")
    private String threeds2ChallengeResult = null;

    @SerializedName("threeds2.fingerprint")
    private String threeds2Fingerprint = null;


    public CardDetails() {
        this.type = TYPE_SCHEME;
    }

    public CardDetails MD(String MD) {
        this.MD = MD;
        return this;
    }

    /**
     * Get MD
     *
     * @return MD
     **/
    public String getMD() {
        return MD;
    }

    public void setMD(String MD) {
        this.MD = MD;
    }

    public CardDetails paRes(String paRes) {
        this.paRes = paRes;
        return this;
    }

    /**
     * Get paRes
     *
     * @return paRes
     **/
    public String getPaRes() {
        return paRes;
    }

    public void setPaRes(String paRes) {
        this.paRes = paRes;
    }

    public CardDetails billingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     * Get billingAddress
     *
     * @return billingAddress
     **/
    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public CardDetails brand(String brand) {
        this.brand = brand;
        return this;
    }

    /**
     * Get brand
     *
     * @return brand
     **/
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CardDetails browserInfo(BrowserInfo browserInfo) {
        this.browserInfo = browserInfo;
        return this;
    }

    /**
     * Get browserInfo
     *
     * @return browserInfo
     **/
    public BrowserInfo getBrowserInfo() {
        return browserInfo;
    }

    public void setBrowserInfo(BrowserInfo browserInfo) {
        this.browserInfo = browserInfo;
    }

    public CardDetails cardDetailsCvc(String cardDetailsCvc) {
        this.cardDetailsCvc = cardDetailsCvc;
        return this;
    }

    /**
     * Get cardDetailsCvc
     *
     * @return cardDetailsCvc
     **/
    public String getCardDetailsCvc() {
        return cardDetailsCvc;
    }

    public void setCardDetailsCvc(String cardDetailsCvc) {
        this.cardDetailsCvc = cardDetailsCvc;
    }

    public CardDetails cupsecureplusSmscode(String cupsecureplusSmscode) {
        this.cupsecureplusSmscode = cupsecureplusSmscode;
        return this;
    }

    /**
     * Get cupsecureplusSmscode
     *
     * @return cupsecureplusSmscode
     **/
    public String getCupsecureplusSmscode() {
        return cupsecureplusSmscode;
    }

    public void setCupsecureplusSmscode(String cupsecureplusSmscode) {
        this.cupsecureplusSmscode = cupsecureplusSmscode;
    }

    public CardDetails cvc(String cvc) {
        this.cvc = cvc;
        return this;
    }

    /**
     * Get cvc
     *
     * @return cvc
     **/
    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public CardDetails encryptedCardNumber(String encryptedCardNumber) {
        this.encryptedCardNumber = encryptedCardNumber;
        return this;
    }

    /**
     * Get encryptedCardNumber
     *
     * @return encryptedCardNumber
     **/
    public String getEncryptedCardNumber() {
        return encryptedCardNumber;
    }

    public void setEncryptedCardNumber(String encryptedCardNumber) {
        this.encryptedCardNumber = encryptedCardNumber;
    }

    public CardDetails encryptedExpiryMonth(String encryptedExpiryMonth) {
        this.encryptedExpiryMonth = encryptedExpiryMonth;
        return this;
    }

    /**
     * Get encryptedExpiryMonth
     *
     * @return encryptedExpiryMonth
     **/
    public String getEncryptedExpiryMonth() {
        return encryptedExpiryMonth;
    }

    public void setEncryptedExpiryMonth(String encryptedExpiryMonth) {
        this.encryptedExpiryMonth = encryptedExpiryMonth;
    }

    public CardDetails encryptedExpiryYear(String encryptedExpiryYear) {
        this.encryptedExpiryYear = encryptedExpiryYear;
        return this;
    }

    /**
     * Get encryptedExpiryYear
     *
     * @return encryptedExpiryYear
     **/
    public String getEncryptedExpiryYear() {
        return encryptedExpiryYear;
    }

    public void setEncryptedExpiryYear(String encryptedExpiryYear) {
        this.encryptedExpiryYear = encryptedExpiryYear;
    }

    public CardDetails encryptedSecurityCode(String encryptedSecurityCode) {
        this.encryptedSecurityCode = encryptedSecurityCode;
        return this;
    }

    /**
     * Get encryptedSecurityCode
     *
     * @return encryptedSecurityCode
     **/
    public String getEncryptedSecurityCode() {
        return encryptedSecurityCode;
    }

    public void setEncryptedSecurityCode(String encryptedSecurityCode) {
        this.encryptedSecurityCode = encryptedSecurityCode;
    }

    public CardDetails expiryMonth(String expiryMonth) {
        this.expiryMonth = expiryMonth;
        return this;
    }

    /**
     * Get expiryMonth
     *
     * @return expiryMonth
     **/
    public String getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(String expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public CardDetails expiryYear(String expiryYear) {
        this.expiryYear = expiryYear;
        return this;
    }

    /**
     * Get expiryYear
     *
     * @return expiryYear
     **/
    public String getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(String expiryYear) {
        this.expiryYear = expiryYear;
    }

    public CardDetails fundingSource(FundingSourceEnum fundingSource) {
        this.fundingSource = fundingSource;
        return this;
    }

    /**
     * Get fundingSource
     *
     * @return fundingSource
     **/
    public FundingSourceEnum getFundingSource() {
        return fundingSource;
    }

    public void setFundingSource(FundingSourceEnum fundingSource) {
        this.fundingSource = fundingSource;
    }

    public CardDetails holderName(String holderName) {
        this.holderName = holderName;
        return this;
    }

    /**
     * Get holderName
     *
     * @return holderName
     **/
    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public CardDetails installments(String installments) {
        this.installments = installments;
        return this;
    }

    /**
     * Get installments
     *
     * @return installments
     **/
    public String getInstallments() {
        return installments;
    }

    public void setInstallments(String installments) {
        this.installments = installments;
    }

    public CardDetails issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get issuer
     *
     * @return issuer
     **/
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public CardDetails networkPaymentReference(String networkPaymentReference) {
        this.networkPaymentReference = networkPaymentReference;
        return this;
    }

    /**
     * Get networkPaymentReference
     *
     * @return networkPaymentReference
     **/
    public String getNetworkPaymentReference() {
        return networkPaymentReference;
    }

    public void setNetworkPaymentReference(String networkPaymentReference) {
        this.networkPaymentReference = networkPaymentReference;
    }

    public CardDetails number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     *
     * @return number
     **/
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CardDetails returnUrlQueryString(String returnUrlQueryString) {
        this.returnUrlQueryString = returnUrlQueryString;
        return this;
    }

    /**
     * Get returnUrlQueryString
     *
     * @return returnUrlQueryString
     **/
    public String getReturnUrlQueryString() {
        return returnUrlQueryString;
    }

    public void setReturnUrlQueryString(String returnUrlQueryString) {
        this.returnUrlQueryString = returnUrlQueryString;
    }

    public CardDetails telephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }

    /**
     * Get telephoneNumber
     *
     * @return telephoneNumber
     **/
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public CardDetails threeds2ChallengeResult(String threeds2ChallengeResult) {
        this.threeds2ChallengeResult = threeds2ChallengeResult;
        return this;
    }

    /**
     * Get threeds2ChallengeResult
     *
     * @return threeds2ChallengeResult
     **/
    public String getThreeds2ChallengeResult() {
        return threeds2ChallengeResult;
    }

    public void setThreeds2ChallengeResult(String threeds2ChallengeResult) {
        this.threeds2ChallengeResult = threeds2ChallengeResult;
    }

    public CardDetails threeds2Fingerprint(String threeds2Fingerprint) {
        this.threeds2Fingerprint = threeds2Fingerprint;
        return this;
    }

    /**
     * Get threeds2Fingerprint
     *
     * @return threeds2Fingerprint
     **/
    public String getThreeds2Fingerprint() {
        return threeds2Fingerprint;
    }

    public void setThreeds2Fingerprint(String threeds2Fingerprint) {
        this.threeds2Fingerprint = threeds2Fingerprint;
    }

    public CardDetails type(String type) {
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
        CardDetails cardDetails = (CardDetails) o;
        return Objects.equals(this.MD, cardDetails.MD) &&
                Objects.equals(this.paRes, cardDetails.paRes) &&
                Objects.equals(this.billingAddress, cardDetails.billingAddress) &&
                Objects.equals(this.brand, cardDetails.brand) &&
                Objects.equals(this.browserInfo, cardDetails.browserInfo) &&
                Objects.equals(this.cardDetailsCvc, cardDetails.cardDetailsCvc) &&
                Objects.equals(this.cupsecureplusSmscode, cardDetails.cupsecureplusSmscode) &&
                Objects.equals(this.cvc, cardDetails.cvc) &&
                Objects.equals(this.encryptedCardNumber, cardDetails.encryptedCardNumber) &&
                Objects.equals(this.encryptedExpiryMonth, cardDetails.encryptedExpiryMonth) &&
                Objects.equals(this.encryptedExpiryYear, cardDetails.encryptedExpiryYear) &&
                Objects.equals(this.encryptedSecurityCode, cardDetails.encryptedSecurityCode) &&
                Objects.equals(this.expiryMonth, cardDetails.expiryMonth) &&
                Objects.equals(this.expiryYear, cardDetails.expiryYear) &&
                Objects.equals(this.fundingSource, cardDetails.fundingSource) &&
                Objects.equals(this.holderName, cardDetails.holderName) &&
                Objects.equals(this.installments, cardDetails.installments) &&
                Objects.equals(this.issuer, cardDetails.issuer) &&
                Objects.equals(this.networkPaymentReference, cardDetails.networkPaymentReference) &&
                Objects.equals(this.number, cardDetails.number) &&
                Objects.equals(this.returnUrlQueryString, cardDetails.returnUrlQueryString) &&
                Objects.equals(this.telephoneNumber, cardDetails.telephoneNumber) &&
                Objects.equals(this.threeds2ChallengeResult, cardDetails.threeds2ChallengeResult) &&
                Objects.equals(this.threeds2Fingerprint, cardDetails.threeds2Fingerprint) &&
                Objects.equals(this.type, cardDetails.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MD, paRes, billingAddress, brand, browserInfo, cardDetailsCvc, cupsecureplusSmscode, cvc, encryptedCardNumber, encryptedExpiryMonth, encryptedExpiryYear, encryptedSecurityCode, expiryMonth, expiryYear, fundingSource, holderName, installments, issuer, networkPaymentReference, number, returnUrlQueryString, telephoneNumber, threeds2ChallengeResult, threeds2Fingerprint, type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CardDetails {\n");

        sb.append("    MD: ").append(toIndentedString(MD)).append("\n");
        sb.append("    paRes: ").append(toIndentedString(paRes)).append("\n");
        sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    browserInfo: ").append(toIndentedString(browserInfo)).append("\n");
        sb.append("    cardDetailsCvc: ").append(toIndentedString(cardDetailsCvc)).append("\n");
        sb.append("    cupsecureplusSmscode: ").append(toIndentedString(cupsecureplusSmscode)).append("\n");
        sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
        sb.append("    encryptedCardNumber: ").append(toIndentedString(encryptedCardNumber)).append("\n");
        sb.append("    encryptedExpiryMonth: ").append(toIndentedString(encryptedExpiryMonth)).append("\n");
        sb.append("    encryptedExpiryYear: ").append(toIndentedString(encryptedExpiryYear)).append("\n");
        sb.append("    encryptedSecurityCode: ").append(toIndentedString(encryptedSecurityCode)).append("\n");
        sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
        sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
        sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
        sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
        sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    networkPaymentReference: ").append(toIndentedString(networkPaymentReference)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    returnUrlQueryString: ").append(toIndentedString(returnUrlQueryString)).append("\n");
        sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
        sb.append("    threeds2ChallengeResult: ").append(toIndentedString(threeds2ChallengeResult)).append("\n");
        sb.append("    threeds2Fingerprint: ").append(toIndentedString(threeds2Fingerprint)).append("\n");
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
