package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class CardPaymentMethod extends PaymentMethodDetails {
    private static final String ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";
    private static final String ENCRYPTED_EXPIRY_MONTH = "encryptedExpiryMonth";
    private static final String ENCRYPTED_EXPIRY_YEAR = "encryptedExpiryYear";
    private static final String ENCRYPTED_PASSWORD = "encryptedPassword";
    private static final String ENCRYPTED_SECURITY_CODE = "encryptedSecurityCode";
    private static final String HOLDER_NAME = "holderName";
    public static final String PAYMENT_METHOD_TYPE = "scheme";
    private static final String STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
    private static final String TAX_NUMBER = "taxNumber";
    private String encryptedCardNumber;
    private String encryptedExpiryMonth;
    private String encryptedExpiryYear;
    private String encryptedPassword;
    private String encryptedSecurityCode;
    private String holderName;
    private String storedPaymentMethodId;
    private String taxNumber;
    public static final ModelObject.Creator<CardPaymentMethod> CREATOR = new ModelObject.Creator<>(CardPaymentMethod.class);
    public static final ModelObject.Serializer<CardPaymentMethod> SERIALIZER = new ModelObject.Serializer<CardPaymentMethod>() { // from class: com.adyen.checkout.components.model.payments.request.CardPaymentMethod.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public CardPaymentMethod deserialize(JSONObject jSONObject) {
            CardPaymentMethod cardPaymentMethod = new CardPaymentMethod();
            cardPaymentMethod.setType(jSONObject.optString("type", null));
            cardPaymentMethod.setEncryptedCardNumber(jSONObject.optString(CardPaymentMethod.ENCRYPTED_CARD_NUMBER, null));
            cardPaymentMethod.setEncryptedExpiryMonth(jSONObject.optString(CardPaymentMethod.ENCRYPTED_EXPIRY_MONTH, null));
            cardPaymentMethod.setEncryptedExpiryYear(jSONObject.optString(CardPaymentMethod.ENCRYPTED_EXPIRY_YEAR, null));
            cardPaymentMethod.setStoredPaymentMethodId(jSONObject.optString(CardPaymentMethod.STORED_PAYMENT_METHOD_ID));
            cardPaymentMethod.setEncryptedSecurityCode(jSONObject.optString(CardPaymentMethod.ENCRYPTED_SECURITY_CODE, null));
            cardPaymentMethod.setHolderName(jSONObject.optString(CardPaymentMethod.HOLDER_NAME, null));
            cardPaymentMethod.setEncryptedPassword(jSONObject.optString(CardPaymentMethod.ENCRYPTED_PASSWORD, null));
            cardPaymentMethod.setTaxNumber(jSONObject.optString(CardPaymentMethod.TAX_NUMBER));
            return cardPaymentMethod;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(CardPaymentMethod cardPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", cardPaymentMethod.getType());
                jSONObject.putOpt(CardPaymentMethod.ENCRYPTED_CARD_NUMBER, cardPaymentMethod.getEncryptedCardNumber());
                jSONObject.putOpt(CardPaymentMethod.ENCRYPTED_EXPIRY_MONTH, cardPaymentMethod.getEncryptedExpiryMonth());
                jSONObject.putOpt(CardPaymentMethod.ENCRYPTED_EXPIRY_YEAR, cardPaymentMethod.getEncryptedExpiryYear());
                jSONObject.putOpt(CardPaymentMethod.ENCRYPTED_SECURITY_CODE, cardPaymentMethod.getEncryptedSecurityCode());
                jSONObject.putOpt(CardPaymentMethod.STORED_PAYMENT_METHOD_ID, cardPaymentMethod.getStoredPaymentMethodId());
                jSONObject.putOpt(CardPaymentMethod.HOLDER_NAME, cardPaymentMethod.getHolderName());
                jSONObject.putOpt(CardPaymentMethod.ENCRYPTED_PASSWORD, cardPaymentMethod.getEncryptedPassword());
                jSONObject.putOpt(CardPaymentMethod.TAX_NUMBER, cardPaymentMethod.getTaxNumber());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(IdealPaymentMethod.class, e);
            }
        }
    };

    public String getEncryptedCardNumber() {
        return this.encryptedCardNumber;
    }

    public String getEncryptedExpiryMonth() {
        return this.encryptedExpiryMonth;
    }

    public String getEncryptedExpiryYear() {
        return this.encryptedExpiryYear;
    }

    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public String getEncryptedSecurityCode() {
        return this.encryptedSecurityCode;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    public String getTaxNumber() {
        return this.taxNumber;
    }

    public void setEncryptedCardNumber(String str) {
        this.encryptedCardNumber = str;
    }

    public void setEncryptedExpiryMonth(String str) {
        this.encryptedExpiryMonth = str;
    }

    public void setEncryptedExpiryYear(String str) {
        this.encryptedExpiryYear = str;
    }

    public void setEncryptedPassword(String str) {
        this.encryptedPassword = str;
    }

    public void setEncryptedSecurityCode(String str) {
        this.encryptedSecurityCode = str;
    }

    public void setHolderName(String str) {
        this.holderName = str;
    }

    public void setStoredPaymentMethodId(String str) {
        this.storedPaymentMethodId = str;
    }

    public void setTaxNumber(String str) {
        this.taxNumber = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
