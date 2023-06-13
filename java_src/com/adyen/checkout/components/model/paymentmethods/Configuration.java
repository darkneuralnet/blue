package com.adyen.checkout.components.model.paymentmethods;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class Configuration extends ModelObject {
    private static final String GATEWAY_MERCHANT_ID = "gatewayMerchantId";
    private static final String INTENT = "intent";
    private static final String KOREAN_AUTHENTICATION_REQUIRED = "koreanAuthenticationRequired";
    private static final String MERCHANT_ID = "merchantId";
    private String gatewayMerchantId;
    private String intent;
    private String koreanAuthenticationRequired;
    private String merchantId;
    public static final ModelObject.Creator<Configuration> CREATOR = new ModelObject.Creator<>(Configuration.class);
    public static final ModelObject.Serializer<Configuration> SERIALIZER = new ModelObject.Serializer<Configuration>() { // from class: com.adyen.checkout.components.model.paymentmethods.Configuration.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public Configuration deserialize(JSONObject jSONObject) {
            Configuration configuration = new Configuration();
            configuration.setMerchantId(jSONObject.optString(Configuration.MERCHANT_ID, null));
            configuration.setGatewayMerchantId(jSONObject.optString(Configuration.GATEWAY_MERCHANT_ID, null));
            configuration.setIntent(jSONObject.optString(Configuration.INTENT, null));
            configuration.setKoreanAuthenticationRequired(jSONObject.optString(Configuration.KOREAN_AUTHENTICATION_REQUIRED, null));
            return configuration;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(Configuration configuration) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(Configuration.MERCHANT_ID, configuration.getMerchantId());
                jSONObject.putOpt(Configuration.GATEWAY_MERCHANT_ID, configuration.getGatewayMerchantId());
                jSONObject.putOpt(Configuration.INTENT, configuration.getIntent());
                jSONObject.putOpt(Configuration.KOREAN_AUTHENTICATION_REQUIRED, configuration.getKoreanAuthenticationRequired());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(PaymentMethod.class, e);
            }
        }
    };

    public String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    public String getIntent() {
        return this.intent;
    }

    public String getKoreanAuthenticationRequired() {
        return this.koreanAuthenticationRequired;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setGatewayMerchantId(String str) {
        this.gatewayMerchantId = str;
    }

    public void setIntent(String str) {
        this.intent = str;
    }

    public void setKoreanAuthenticationRequired(String str) {
        this.koreanAuthenticationRequired = str;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
