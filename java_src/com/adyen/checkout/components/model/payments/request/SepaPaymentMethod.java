package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SepaPaymentMethod extends PaymentMethodDetails {
    private static final String IBAN = "iban";
    private static final String OWNER_NAME = "ownerName";
    public static final String PAYMENT_METHOD_TYPE = "sepadirectdebit";
    private String iban;
    private String ownerName;
    public static final ModelObject.Creator<SepaPaymentMethod> CREATOR = new ModelObject.Creator<>(SepaPaymentMethod.class);
    public static final ModelObject.Serializer<SepaPaymentMethod> SERIALIZER = new ModelObject.Serializer<SepaPaymentMethod>() { // from class: com.adyen.checkout.components.model.payments.request.SepaPaymentMethod.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public SepaPaymentMethod deserialize(JSONObject jSONObject) {
            SepaPaymentMethod sepaPaymentMethod = new SepaPaymentMethod();
            sepaPaymentMethod.setType(jSONObject.optString("type", null));
            sepaPaymentMethod.setOwnerName(jSONObject.optString(SepaPaymentMethod.OWNER_NAME, null));
            sepaPaymentMethod.setIban(jSONObject.optString(SepaPaymentMethod.IBAN, null));
            return sepaPaymentMethod;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(SepaPaymentMethod sepaPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", sepaPaymentMethod.getType());
                jSONObject.putOpt(SepaPaymentMethod.OWNER_NAME, sepaPaymentMethod.getOwnerName());
                jSONObject.putOpt(SepaPaymentMethod.IBAN, sepaPaymentMethod.getIban());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(SepaPaymentMethod.class, e);
            }
        }
    };

    public String getIban() {
        return this.iban;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setIban(String str) {
        this.iban = str;
    }

    public void setOwnerName(String str) {
        this.ownerName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
