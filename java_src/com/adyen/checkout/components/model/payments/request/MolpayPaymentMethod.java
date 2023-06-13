package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class MolpayPaymentMethod extends IssuerListPaymentMethod {
    public static final ModelObject.Creator<MolpayPaymentMethod> CREATOR = new ModelObject.Creator<>(MolpayPaymentMethod.class);
    public static final ModelObject.Serializer<MolpayPaymentMethod> SERIALIZER = new ModelObject.Serializer<MolpayPaymentMethod>() { // from class: com.adyen.checkout.components.model.payments.request.MolpayPaymentMethod.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public MolpayPaymentMethod deserialize(JSONObject jSONObject) {
            MolpayPaymentMethod molpayPaymentMethod = new MolpayPaymentMethod();
            molpayPaymentMethod.setType(jSONObject.optString("type", null));
            molpayPaymentMethod.setIssuer(jSONObject.optString("issuer", null));
            return molpayPaymentMethod;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(MolpayPaymentMethod molpayPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", molpayPaymentMethod.getType());
                jSONObject.putOpt("issuer", molpayPaymentMethod.getIssuer());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(MolpayPaymentMethod.class, e);
            }
        }
    };

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
