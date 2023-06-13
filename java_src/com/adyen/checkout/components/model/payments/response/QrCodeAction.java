package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class QrCodeAction extends Action {
    public static final String ACTION_TYPE = "qrCode";
    private static final String QR_CODE_DATA = "qrCodeData";
    private static final String URL = "url";
    private String qrCodeData;
    private String url;
    public static final ModelObject.Creator<QrCodeAction> CREATOR = new ModelObject.Creator<>(QrCodeAction.class);
    public static final ModelObject.Serializer<QrCodeAction> SERIALIZER = new ModelObject.Serializer<QrCodeAction>() { // from class: com.adyen.checkout.components.model.payments.response.QrCodeAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public QrCodeAction deserialize(JSONObject jSONObject) {
            QrCodeAction qrCodeAction = new QrCodeAction();
            qrCodeAction.setType(jSONObject.optString("type", null));
            qrCodeAction.setPaymentData(jSONObject.optString(Action.PAYMENT_DATA, null));
            qrCodeAction.setPaymentMethodType(jSONObject.optString(Action.PAYMENT_METHOD_TYPE, null));
            qrCodeAction.setQrCodeData(jSONObject.optString(QrCodeAction.QR_CODE_DATA));
            qrCodeAction.setUrl(jSONObject.optString("url"));
            return qrCodeAction;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(QrCodeAction qrCodeAction) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", qrCodeAction.getType());
                jSONObject.putOpt(Action.PAYMENT_DATA, qrCodeAction.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, qrCodeAction.getPaymentMethodType());
                jSONObject.putOpt(QrCodeAction.QR_CODE_DATA, qrCodeAction.getQrCodeData());
                jSONObject.putOpt("url", qrCodeAction.getUrl());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(QrCodeAction.class, e);
            }
        }
    };

    public String getQrCodeData() {
        return this.qrCodeData;
    }

    public String getUrl() {
        return this.url;
    }

    public void setQrCodeData(String str) {
        this.qrCodeData = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
