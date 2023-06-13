package com.adyen.checkout.components.model.paymentmethods;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class Issuer extends ModelObject {
    private static final String DISABLED = "disabled";

    /* renamed from: ID */
    private static final String f68409ID = "id";
    private static final String NAME = "name";
    private boolean disabled;

    /* renamed from: id */
    private String f68410id;
    private String name;
    public static final ModelObject.Creator<Issuer> CREATOR = new ModelObject.Creator<>(Issuer.class);
    public static final ModelObject.Serializer<Issuer> SERIALIZER = new ModelObject.Serializer<Issuer>() { // from class: com.adyen.checkout.components.model.paymentmethods.Issuer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public Issuer deserialize(JSONObject jSONObject) {
            Issuer issuer = new Issuer();
            issuer.setId(jSONObject.optString("id", null));
            issuer.setName(jSONObject.optString("name", null));
            issuer.setDisabled(jSONObject.optBoolean(Issuer.DISABLED, false));
            return issuer;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(Issuer issuer) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("id", issuer.getId());
                jSONObject.putOpt("name", issuer.getName());
                jSONObject.putOpt(Issuer.DISABLED, Boolean.valueOf(issuer.isDisabled()));
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(PaymentMethod.class, e);
            }
        }
    };

    public String getId() {
        return this.f68410id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean z) {
        this.disabled = z;
    }

    public void setId(String str) {
        this.f68410id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
