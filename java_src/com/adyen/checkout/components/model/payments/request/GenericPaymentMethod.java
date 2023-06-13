package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GenericPaymentMethod extends PaymentMethodDetails {
    public static final ModelObject.Creator<GenericPaymentMethod> CREATOR = new ModelObject.Creator<>(GenericPaymentMethod.class);
    public static final ModelObject.Serializer<GenericPaymentMethod> SERIALIZER = new ModelObject.Serializer<GenericPaymentMethod>() { // from class: com.adyen.checkout.components.model.payments.request.GenericPaymentMethod.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public GenericPaymentMethod deserialize(JSONObject jSONObject) {
            return new GenericPaymentMethod(jSONObject.optString("type", null));
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(GenericPaymentMethod genericPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", genericPaymentMethod.getType());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(GenericPaymentMethod.class, e);
            }
        }
    };

    public GenericPaymentMethod(String str) {
        setType(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
