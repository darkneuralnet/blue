package com.adyen.checkout.components.status.model;

import android.os.Parcel;
import com.adyen.checkout.components.model.payments.request.Address;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class StatusResponse extends ModelObject {
    public static final ModelObject.Creator<StatusResponse> CREATOR = new ModelObject.Creator<>(StatusResponse.class);

    /* renamed from: e */
    public static final ModelObject.Serializer<StatusResponse> f68417e = new C16841a();

    /* renamed from: b */
    public String f68418b;

    /* renamed from: c */
    public String f68419c;

    /* renamed from: d */
    public String f68420d;

    /* renamed from: com.adyen.checkout.components.status.model.StatusResponse$a */
    /* loaded from: classes.dex */
    public static class C16841a implements ModelObject.Serializer<StatusResponse> {
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        /* renamed from: a */
        public StatusResponse deserialize(JSONObject jSONObject) {
            StatusResponse statusResponse = new StatusResponse();
            statusResponse.setType(jSONObject.optString("type", null));
            statusResponse.m53589c(jSONObject.optString("payload", null));
            statusResponse.m53588d(jSONObject.optString("resultCode", null));
            return statusResponse;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        /* renamed from: b */
        public JSONObject serialize(StatusResponse statusResponse) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", statusResponse.getType());
                jSONObject.putOpt("payload", statusResponse.m53591a());
                jSONObject.putOpt("resultCode", statusResponse.m53590b());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(Address.class, e);
            }
        }
    }

    /* renamed from: a */
    public String m53591a() {
        return this.f68419c;
    }

    /* renamed from: b */
    public String m53590b() {
        return this.f68420d;
    }

    /* renamed from: c */
    public void m53589c(String str) {
        this.f68419c = str;
    }

    /* renamed from: d */
    public void m53588d(String str) {
        this.f68420d = str;
    }

    public String getType() {
        return this.f68418b;
    }

    public void setType(String str) {
        this.f68418b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, f68417e.serialize(this));
    }
}
