package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class IdealPaymentMethod extends IssuerListPaymentMethod {
    public static final String PAYMENT_METHOD_TYPE = "ideal";
    public static final ModelObject.Creator<IdealPaymentMethod> CREATOR = new ModelObject.Creator<>(IdealPaymentMethod.class);
    public static final ModelObject.Serializer<IdealPaymentMethod> SERIALIZER = new ModelObject.Serializer<IdealPaymentMethod>() { // from class: com.adyen.checkout.components.model.payments.request.IdealPaymentMethod.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public IdealPaymentMethod deserialize(JSONObject jSONObject) {
            IdealPaymentMethod idealPaymentMethod = new IdealPaymentMethod();
            idealPaymentMethod.setType(jSONObject.optString("type", null));
            idealPaymentMethod.setIssuer(jSONObject.optString("issuer", null));
            return idealPaymentMethod;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(IdealPaymentMethod idealPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", idealPaymentMethod.getType());
                jSONObject.putOpt("issuer", idealPaymentMethod.getIssuer());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(IdealPaymentMethod.class, e);
            }
        }
    };

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
