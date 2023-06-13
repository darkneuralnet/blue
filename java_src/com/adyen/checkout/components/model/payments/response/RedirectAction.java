package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class RedirectAction extends Action {
    public static final String ACTION_TYPE = "redirect";
    private static final String METHOD = "method";
    private static final String URL = "url";
    private String method;
    private String url;
    public static final ModelObject.Creator<RedirectAction> CREATOR = new ModelObject.Creator<>(RedirectAction.class);
    public static final ModelObject.Serializer<RedirectAction> SERIALIZER = new ModelObject.Serializer<RedirectAction>() { // from class: com.adyen.checkout.components.model.payments.response.RedirectAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public RedirectAction deserialize(JSONObject jSONObject) {
            RedirectAction redirectAction = new RedirectAction();
            redirectAction.setType(jSONObject.optString("type", null));
            redirectAction.setPaymentData(jSONObject.optString(Action.PAYMENT_DATA, null));
            redirectAction.setPaymentMethodType(jSONObject.optString(Action.PAYMENT_METHOD_TYPE, null));
            redirectAction.setMethod(jSONObject.optString(RedirectAction.METHOD, null));
            redirectAction.setUrl(jSONObject.optString("url", null));
            return redirectAction;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(RedirectAction redirectAction) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", redirectAction.getType());
                jSONObject.putOpt(Action.PAYMENT_DATA, redirectAction.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, redirectAction.getPaymentMethodType());
                jSONObject.putOpt(RedirectAction.METHOD, redirectAction.getMethod());
                jSONObject.putOpt("url", redirectAction.getUrl());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(RedirectAction.class, e);
            }
        }
    };

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
