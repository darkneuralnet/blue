package com.adyen.checkout.components.status.model;

import android.os.Parcel;
import com.adyen.checkout.components.model.payments.request.Address;
import com.adyen.checkout.components.model.payments.response.Action;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class StatusRequest extends ModelObject {
    public static final ModelObject.Creator<StatusRequest> CREATOR = new ModelObject.Creator<>(StatusRequest.class);

    /* renamed from: c */
    public static final ModelObject.Serializer<StatusRequest> f68415c = new C16840a();

    /* renamed from: b */
    public String f68416b;

    /* renamed from: com.adyen.checkout.components.status.model.StatusRequest$a */
    /* loaded from: classes.dex */
    public static class C16840a implements ModelObject.Serializer<StatusRequest> {
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        /* renamed from: a */
        public StatusRequest deserialize(JSONObject jSONObject) {
            StatusRequest statusRequest = new StatusRequest();
            statusRequest.setPaymentData(jSONObject.optString(Action.PAYMENT_DATA, null));
            return statusRequest;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        /* renamed from: b */
        public JSONObject serialize(StatusRequest statusRequest) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(Action.PAYMENT_DATA, statusRequest.getPaymentData());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(Address.class, e);
            }
        }
    }

    public String getPaymentData() {
        return this.f68416b;
    }

    public void setPaymentData(String str) {
        this.f68416b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, f68415c.serialize(this));
    }
}
