package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class MBWayPaymentMethod extends PaymentMethodDetails {
    public static final String PAYMENT_METHOD_TYPE = "mbway";
    private static final String TELEPHONE_NUMBER = "telephoneNumber";
    private String telephoneNumber;
    public static final ModelObject.Creator<MBWayPaymentMethod> CREATOR = new ModelObject.Creator<>(MBWayPaymentMethod.class);
    public static final ModelObject.Serializer<MBWayPaymentMethod> SERIALIZER = new ModelObject.Serializer<MBWayPaymentMethod>() { // from class: com.adyen.checkout.components.model.payments.request.MBWayPaymentMethod.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public MBWayPaymentMethod deserialize(JSONObject jSONObject) {
            MBWayPaymentMethod mBWayPaymentMethod = new MBWayPaymentMethod();
            mBWayPaymentMethod.setType(jSONObject.optString("type", null));
            mBWayPaymentMethod.setTelephoneNumber(jSONObject.optString(MBWayPaymentMethod.TELEPHONE_NUMBER, null));
            return mBWayPaymentMethod;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(MBWayPaymentMethod mBWayPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", mBWayPaymentMethod.getType());
                jSONObject.putOpt(MBWayPaymentMethod.TELEPHONE_NUMBER, mBWayPaymentMethod.getTelephoneNumber());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(GooglePayPaymentMethod.class, e);
            }
        }
    };

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public void setTelephoneNumber(String str) {
        this.telephoneNumber = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
