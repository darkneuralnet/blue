package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import com.adyen.checkout.components.model.payments.Amount;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import com.adyen.checkout.core.model.ModelUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class VoucherAction extends Action {
    public static final String ACTION_TYPE = "voucher";
    private static final String ALTERNATIVE_REFERENCE = "alternativeReference";
    private static final String EXPIRES_AT = "expiresAt";
    private static final String INITIAL_AMOUNT = "initialAmount";
    private static final String ISSUER = "issuer";
    private static final String MERCHANT_NAME = "merchantName";
    private static final String REFERENCE = "reference";
    private static final String SURCHARGE = "surcharge";
    private static final String TOTAL_AMOUNT = "totalAmount";
    private String alternativeReference;
    private String expiresAt;
    private Amount initialAmount;
    private String issuer;
    private String merchantName;
    private String reference;
    private Amount surcharge;
    private Amount totalAmount;
    public static final ModelObject.Creator<VoucherAction> CREATOR = new ModelObject.Creator<>(VoucherAction.class);
    public static final ModelObject.Serializer<VoucherAction> SERIALIZER = new ModelObject.Serializer<VoucherAction>() { // from class: com.adyen.checkout.components.model.payments.response.VoucherAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public VoucherAction deserialize(JSONObject jSONObject) {
            VoucherAction voucherAction = new VoucherAction();
            voucherAction.setType(jSONObject.optString("type", null));
            voucherAction.setPaymentData(jSONObject.optString(Action.PAYMENT_DATA, null));
            voucherAction.setPaymentMethodType(jSONObject.optString(Action.PAYMENT_METHOD_TYPE, null));
            JSONObject optJSONObject = jSONObject.optJSONObject(VoucherAction.SURCHARGE);
            ModelObject.Serializer<Amount> serializer = Amount.SERIALIZER;
            voucherAction.setSurcharge((Amount) ModelUtils.deserializeOpt(optJSONObject, serializer));
            voucherAction.setInitialAmount((Amount) ModelUtils.deserializeOpt(jSONObject.optJSONObject(VoucherAction.INITIAL_AMOUNT), serializer));
            voucherAction.setTotalAmount((Amount) ModelUtils.deserializeOpt(jSONObject.optJSONObject(VoucherAction.TOTAL_AMOUNT), serializer));
            voucherAction.setIssuer(jSONObject.optString(VoucherAction.ISSUER));
            voucherAction.setExpiresAt(jSONObject.optString(VoucherAction.EXPIRES_AT));
            voucherAction.setReference(jSONObject.optString(VoucherAction.REFERENCE));
            voucherAction.setAlternativeReference(jSONObject.optString(VoucherAction.ALTERNATIVE_REFERENCE));
            voucherAction.setMerchantName(jSONObject.optString(VoucherAction.MERCHANT_NAME));
            return voucherAction;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(VoucherAction voucherAction) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", voucherAction.getType());
                jSONObject.putOpt(Action.PAYMENT_DATA, voucherAction.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, voucherAction.getPaymentMethodType());
                Amount surcharge = voucherAction.getSurcharge();
                ModelObject.Serializer<Amount> serializer = Amount.SERIALIZER;
                jSONObject.putOpt(VoucherAction.SURCHARGE, ModelUtils.serializeOpt(surcharge, serializer));
                jSONObject.putOpt(VoucherAction.INITIAL_AMOUNT, ModelUtils.serializeOpt(voucherAction.getInitialAmount(), serializer));
                jSONObject.putOpt(VoucherAction.TOTAL_AMOUNT, ModelUtils.serializeOpt(voucherAction.getTotalAmount(), serializer));
                jSONObject.putOpt(VoucherAction.ISSUER, voucherAction.getIssuer());
                jSONObject.putOpt(VoucherAction.EXPIRES_AT, voucherAction.getExpiresAt());
                jSONObject.putOpt(VoucherAction.REFERENCE, voucherAction.getReference());
                jSONObject.putOpt(VoucherAction.ALTERNATIVE_REFERENCE, voucherAction.getAlternativeReference());
                jSONObject.putOpt(VoucherAction.MERCHANT_NAME, voucherAction.getMerchantName());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(VoucherAction.class, e);
            }
        }
    };

    public String getAlternativeReference() {
        return this.alternativeReference;
    }

    public String getExpiresAt() {
        return this.expiresAt;
    }

    public Amount getInitialAmount() {
        return this.initialAmount;
    }

    public String getIssuer() {
        return this.issuer;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getReference() {
        return this.reference;
    }

    public Amount getSurcharge() {
        return this.surcharge;
    }

    public Amount getTotalAmount() {
        return this.totalAmount;
    }

    public void setAlternativeReference(String str) {
        this.alternativeReference = str;
    }

    public void setExpiresAt(String str) {
        this.expiresAt = str;
    }

    public void setInitialAmount(Amount amount) {
        this.initialAmount = amount;
    }

    public void setIssuer(String str) {
        this.issuer = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setReference(String str) {
        this.reference = str;
    }

    public void setSurcharge(Amount amount) {
        this.surcharge = amount;
    }

    public void setTotalAmount(Amount amount) {
        this.totalAmount = amount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
