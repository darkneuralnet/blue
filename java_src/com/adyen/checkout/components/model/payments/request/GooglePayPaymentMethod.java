package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GooglePayPaymentMethod extends PaymentMethodDetails {
    private static final String GOOGLE_PAY_CARD_NETWORK = "googlePayCardNetwork";
    private static final String GOOGLE_PAY_TOKEN = "googlePayToken";
    private String googlePayCardNetwork;
    private String googlePayToken;
    public static final ModelObject.Creator<GooglePayPaymentMethod> CREATOR = new ModelObject.Creator<>(GooglePayPaymentMethod.class);
    public static final ModelObject.Serializer<GooglePayPaymentMethod> SERIALIZER = new ModelObject.Serializer<GooglePayPaymentMethod>() { // from class: com.adyen.checkout.components.model.payments.request.GooglePayPaymentMethod.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public GooglePayPaymentMethod deserialize(JSONObject jSONObject) {
            GooglePayPaymentMethod googlePayPaymentMethod = new GooglePayPaymentMethod();
            googlePayPaymentMethod.setType(jSONObject.optString("type", null));
            googlePayPaymentMethod.setGooglePayToken(jSONObject.optString(GooglePayPaymentMethod.GOOGLE_PAY_TOKEN, null));
            googlePayPaymentMethod.setGooglePayCardNetwork(jSONObject.optString(GooglePayPaymentMethod.GOOGLE_PAY_CARD_NETWORK, null));
            return googlePayPaymentMethod;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(GooglePayPaymentMethod googlePayPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", googlePayPaymentMethod.getType());
                jSONObject.putOpt(GooglePayPaymentMethod.GOOGLE_PAY_TOKEN, googlePayPaymentMethod.getGooglePayToken());
                jSONObject.putOpt(GooglePayPaymentMethod.GOOGLE_PAY_CARD_NETWORK, googlePayPaymentMethod.getGooglePayCardNetwork());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(GooglePayPaymentMethod.class, e);
            }
        }
    };

    public String getGooglePayCardNetwork() {
        return this.googlePayCardNetwork;
    }

    public String getGooglePayToken() {
        return this.googlePayToken;
    }

    public void setGooglePayCardNetwork(String str) {
        this.googlePayCardNetwork = str;
    }

    public void setGooglePayToken(String str) {
        this.googlePayToken = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
