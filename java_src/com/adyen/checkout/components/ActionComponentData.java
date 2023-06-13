package com.adyen.checkout.components;

import android.os.Parcel;
import com.adyen.checkout.components.model.payments.response.Action;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ActionComponentData extends ModelObject {
    public static final ModelObject.Creator<ActionComponentData> CREATOR = new ModelObject.Creator<>(ActionComponentData.class);

    /* renamed from: d */
    public static final ModelObject.Serializer<ActionComponentData> f68388d = new C16805a();

    /* renamed from: b */
    public String f68389b;

    /* renamed from: c */
    public JSONObject f68390c;

    /* renamed from: com.adyen.checkout.components.ActionComponentData$a */
    /* loaded from: classes.dex */
    public static class C16805a implements ModelObject.Serializer<ActionComponentData> {
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        /* renamed from: a */
        public ActionComponentData deserialize(JSONObject jSONObject) {
            ActionComponentData actionComponentData = new ActionComponentData();
            actionComponentData.setPaymentData(jSONObject.optString(Action.PAYMENT_DATA));
            actionComponentData.m53604b(jSONObject.optJSONObject("details"));
            return actionComponentData;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        /* renamed from: b */
        public JSONObject serialize(ActionComponentData actionComponentData) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(Action.PAYMENT_DATA, actionComponentData.getPaymentData());
                jSONObject.putOpt("details", actionComponentData.m53605a());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(ActionComponentData.class, e);
            }
        }
    }

    /* renamed from: a */
    public JSONObject m53605a() {
        return this.f68390c;
    }

    /* renamed from: b */
    public void m53604b(JSONObject jSONObject) {
        this.f68390c = jSONObject;
    }

    public String getPaymentData() {
        return this.f68389b;
    }

    public void setPaymentData(String str) {
        this.f68389b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, f68388d.serialize(this));
    }
}
