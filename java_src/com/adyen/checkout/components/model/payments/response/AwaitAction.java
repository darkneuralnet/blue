package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AwaitAction extends Action {
    public static final String ACTION_TYPE = "await";
    public static final ModelObject.Creator<AwaitAction> CREATOR = new ModelObject.Creator<>(AwaitAction.class);
    public static final ModelObject.Serializer<AwaitAction> SERIALIZER = new ModelObject.Serializer<AwaitAction>() { // from class: com.adyen.checkout.components.model.payments.response.AwaitAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public AwaitAction deserialize(JSONObject jSONObject) {
            AwaitAction awaitAction = new AwaitAction();
            awaitAction.setType(jSONObject.optString("type", null));
            awaitAction.setPaymentData(jSONObject.optString(Action.PAYMENT_DATA, null));
            awaitAction.setPaymentMethodType(jSONObject.optString(Action.PAYMENT_METHOD_TYPE, null));
            return awaitAction;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(AwaitAction awaitAction) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", awaitAction.getType());
                jSONObject.putOpt(Action.PAYMENT_DATA, awaitAction.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, awaitAction.getPaymentMethodType());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(RedirectAction.class, e);
            }
        }
    };

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
