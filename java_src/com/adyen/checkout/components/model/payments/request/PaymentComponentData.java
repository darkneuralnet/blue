package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.components.model.payments.Amount;
import com.adyen.checkout.components.model.payments.request.PaymentMethodDetails;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import com.adyen.checkout.core.model.ModelUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PaymentComponentData<PaymentMethodDetailsT extends PaymentMethodDetails> extends ModelObject {
    private static final String AMOUNT = "amount";
    private static final String BILLING_ADDRESS = "billingAddress";
    private static final String DATE_OF_BIRTH = "dateOfBirth";
    private static final String DELIVERY_ADDRESS = "deliveryAddress";
    private static final String PAYMENT_METHOD = "paymentMethod";
    private static final String SHOPPER_EMAIL = "shopperEmail";
    private static final String SHOPPER_NAME = "shopperName";
    private static final String SHOPPER_REFERENCE = "shopperReference";
    private static final String SOCIAL_SECURITY_NUMBER = "socialSecurityNumber";
    private static final String STORE_PAYMENT_METHOD = "storePaymentMethod";
    private static final String TELEPHONE_NUMBER = "telephoneNumber";
    private Amount amount;
    private Address billingAddress;
    private String dateOfBirth;
    private Address deliveryAddress;
    private PaymentMethodDetailsT paymentMethod;
    private String shopperEmail;
    private ShopperName shopperName;
    private String shopperReference;
    private String socialSecurityNumber;
    private boolean storePaymentMethod;
    private String telephoneNumber;
    public static final ModelObject.Creator<PaymentComponentData> CREATOR = new ModelObject.Creator<>(PaymentComponentData.class);
    public static final ModelObject.Serializer<PaymentComponentData> SERIALIZER = new ModelObject.Serializer<PaymentComponentData>() { // from class: com.adyen.checkout.components.model.payments.request.PaymentComponentData.1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public PaymentComponentData deserialize(JSONObject jSONObject) {
            PaymentComponentData paymentComponentData = new PaymentComponentData();
            paymentComponentData.setPaymentMethod((PaymentMethodDetails) ModelUtils.deserializeOpt(jSONObject.optJSONObject(PaymentComponentData.PAYMENT_METHOD), PaymentMethodDetails.SERIALIZER));
            paymentComponentData.setStorePaymentMethod(jSONObject.optBoolean(PaymentComponentData.STORE_PAYMENT_METHOD));
            paymentComponentData.setShopperReference(jSONObject.optString(PaymentComponentData.SHOPPER_REFERENCE));
            paymentComponentData.setAmount((Amount) ModelUtils.deserializeOpt(jSONObject.optJSONObject(PaymentComponentData.AMOUNT), Amount.SERIALIZER));
            JSONObject optJSONObject = jSONObject.optJSONObject(PaymentComponentData.BILLING_ADDRESS);
            ModelObject.Serializer<Address> serializer = Address.SERIALIZER;
            paymentComponentData.setBillingAddress((Address) ModelUtils.deserializeOpt(optJSONObject, serializer));
            paymentComponentData.setDeliveryAddress((Address) ModelUtils.deserializeOpt(jSONObject.optJSONObject(PaymentComponentData.DELIVERY_ADDRESS), serializer));
            paymentComponentData.setShopperName((ShopperName) ModelUtils.deserializeOpt(jSONObject.optJSONObject(PaymentComponentData.SHOPPER_NAME), ShopperName.SERIALIZER));
            paymentComponentData.setTelephoneNumber(jSONObject.optString(PaymentComponentData.TELEPHONE_NUMBER));
            paymentComponentData.setShopperEmail(jSONObject.optString(PaymentComponentData.SHOPPER_EMAIL));
            paymentComponentData.setDateOfBirth(jSONObject.optString(PaymentComponentData.DATE_OF_BIRTH));
            paymentComponentData.setSocialSecurityNumber(jSONObject.optString(PaymentComponentData.SOCIAL_SECURITY_NUMBER));
            return paymentComponentData;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(PaymentComponentData paymentComponentData) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(PaymentComponentData.PAYMENT_METHOD, ModelUtils.serializeOpt(paymentComponentData.getPaymentMethod(), PaymentMethodDetails.SERIALIZER));
                jSONObject.putOpt(PaymentComponentData.STORE_PAYMENT_METHOD, Boolean.valueOf(paymentComponentData.isStorePaymentMethodEnable()));
                jSONObject.putOpt(PaymentComponentData.SHOPPER_REFERENCE, paymentComponentData.getShopperReference());
                jSONObject.putOpt(PaymentComponentData.AMOUNT, ModelUtils.serializeOpt(paymentComponentData.getAmount(), Amount.SERIALIZER));
                Address billingAddress = paymentComponentData.getBillingAddress();
                ModelObject.Serializer<Address> serializer = Address.SERIALIZER;
                jSONObject.putOpt(PaymentComponentData.BILLING_ADDRESS, ModelUtils.serializeOpt(billingAddress, serializer));
                jSONObject.putOpt(PaymentComponentData.DELIVERY_ADDRESS, ModelUtils.serializeOpt(paymentComponentData.getDeliveryAddress(), serializer));
                jSONObject.putOpt(PaymentComponentData.SHOPPER_NAME, ModelUtils.serializeOpt(paymentComponentData.getShopperName(), ShopperName.SERIALIZER));
                jSONObject.putOpt(PaymentComponentData.TELEPHONE_NUMBER, paymentComponentData.getTelephoneNumber());
                jSONObject.putOpt(PaymentComponentData.SHOPPER_EMAIL, paymentComponentData.getShopperEmail());
                jSONObject.putOpt(PaymentComponentData.DATE_OF_BIRTH, paymentComponentData.getDateOfBirth());
                jSONObject.putOpt(PaymentComponentData.SOCIAL_SECURITY_NUMBER, paymentComponentData.getSocialSecurityNumber());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(PaymentComponentData.class, e);
            }
        }
    };

    public Amount getAmount() {
        return this.amount;
    }

    public Address getBillingAddress() {
        return this.billingAddress;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public Address getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public PaymentMethodDetailsT getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getShopperEmail() {
        return this.shopperEmail;
    }

    public ShopperName getShopperName() {
        return this.shopperName;
    }

    public String getShopperReference() {
        return this.shopperReference;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public boolean isStorePaymentMethodEnable() {
        return this.storePaymentMethod;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public void setBillingAddress(Address address) {
        this.billingAddress = address;
    }

    public void setDateOfBirth(String str) {
        this.dateOfBirth = str;
    }

    public void setDeliveryAddress(Address address) {
        this.deliveryAddress = address;
    }

    public void setPaymentMethod(PaymentMethodDetailsT paymentmethoddetailst) {
        this.paymentMethod = paymentmethoddetailst;
    }

    public void setShopperEmail(String str) {
        this.shopperEmail = str;
    }

    public void setShopperName(ShopperName shopperName) {
        this.shopperName = shopperName;
    }

    public void setShopperReference(String str) {
        this.shopperReference = str;
    }

    public void setSocialSecurityNumber(String str) {
        this.socialSecurityNumber = str;
    }

    public void setStorePaymentMethod(boolean z) {
        this.storePaymentMethod = z;
    }

    public void setTelephoneNumber(String str) {
        this.telephoneNumber = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
