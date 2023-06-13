package com.adyen.checkout.components.model.payments;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class Amount extends ModelObject {
    public static final ModelObject.Creator<Amount> CREATOR = new ModelObject.Creator<>(Amount.class);
    private static final String CURRENCY = "currency";
    public static final Amount EMPTY;
    private static final String EMPTY_CURRENCY = "NONE";
    private static final int EMPTY_VALUE = -1;
    public static final ModelObject.Serializer<Amount> SERIALIZER;
    private static final String VALUE = "value";
    private String currency;
    private int value;

    static {
        Amount amount = new Amount();
        EMPTY = amount;
        amount.setCurrency("NONE");
        amount.setValue(-1);
        SERIALIZER = new ModelObject.Serializer<Amount>() { // from class: com.adyen.checkout.components.model.payments.Amount.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.adyen.checkout.core.model.ModelObject.Serializer
            public Amount deserialize(JSONObject jSONObject) {
                Amount amount2 = new Amount();
                amount2.setCurrency(jSONObject.optString(Amount.CURRENCY, null));
                amount2.setValue(jSONObject.optInt("value", -1));
                return amount2;
            }

            @Override // com.adyen.checkout.core.model.ModelObject.Serializer
            public JSONObject serialize(Amount amount2) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt(Amount.CURRENCY, amount2.getCurrency());
                    jSONObject.putOpt("value", Integer.valueOf(amount2.getValue()));
                    return jSONObject;
                } catch (JSONException e) {
                    throw new ModelSerializationException(Amount.class, e);
                }
            }
        };
    }

    public String getCurrency() {
        return this.currency;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isEmpty() {
        if (!"NONE".equals(this.currency) && this.value != -1) {
            return false;
        }
        return true;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setValue(int i) {
        this.value = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
