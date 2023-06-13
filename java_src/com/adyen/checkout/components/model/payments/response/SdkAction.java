package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import com.adyen.checkout.components.model.payments.response.SdkData;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import com.adyen.checkout.core.model.ModelUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SdkAction<SdkDataT extends SdkData> extends Action {
    public static final String ACTION_TYPE = "sdk";
    private static final String SDK_DATA = "sdkData";
    private SdkDataT sdkData;
    public static final ModelObject.Creator<SdkAction> CREATOR = new ModelObject.Creator<>(SdkAction.class);
    public static final ModelObject.Serializer<SdkAction> SERIALIZER = new ModelObject.Serializer<SdkAction>() { // from class: com.adyen.checkout.components.model.payments.response.SdkAction.1
        private ModelObject.Serializer<? extends SdkData> getSdkDataSerializer(String str) {
            if (str != null) {
                if (str.equals("wechatpaySDK")) {
                    return WeChatPaySdkData.SERIALIZER;
                }
                throw new CheckoutException("sdkData not found for type paymentMethodType - " + str);
            }
            throw new CheckoutException("SdkAction cannot be parsed with null paymentMethodType.");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public SdkAction deserialize(JSONObject jSONObject) {
            SdkAction sdkAction = new SdkAction();
            sdkAction.setType(jSONObject.optString("type", null));
            sdkAction.setPaymentData(jSONObject.optString(Action.PAYMENT_DATA, null));
            sdkAction.setPaymentMethodType(jSONObject.optString(Action.PAYMENT_METHOD_TYPE, null));
            sdkAction.setSdkData((SdkData) ModelUtils.deserializeOpt(jSONObject.optJSONObject(SdkAction.SDK_DATA), getSdkDataSerializer(sdkAction.getPaymentMethodType())));
            return sdkAction;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(SdkAction sdkAction) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", sdkAction.getType());
                jSONObject.putOpt(Action.PAYMENT_DATA, sdkAction.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, sdkAction.getPaymentMethodType());
                ModelObject.Serializer<? extends SdkData> sdkDataSerializer = getSdkDataSerializer(sdkAction.getPaymentMethodType());
                if (sdkAction.getSdkData() != null) {
                    jSONObject.putOpt(SdkAction.SDK_DATA, ModelUtils.serializeOpt(sdkAction.getSdkData(), sdkDataSerializer));
                }
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(SdkAction.class, e);
            }
        }
    };

    public SdkDataT getSdkData() {
        return this.sdkData;
    }

    public void setSdkData(SdkDataT sdkdatat) {
        this.sdkData = sdkdatat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
