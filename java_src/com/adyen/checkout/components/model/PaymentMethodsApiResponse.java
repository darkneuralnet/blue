package com.adyen.checkout.components.model;

import android.os.Parcel;
import com.adyen.checkout.components.model.paymentmethods.PaymentMethod;
import com.adyen.checkout.components.model.paymentmethods.StoredPaymentMethod;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import com.adyen.checkout.core.model.ModelUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class PaymentMethodsApiResponse extends ModelObject {
    private static final String PAYMENT_METHODS = "paymentMethods";
    private static final String STORED_PAYMENT_METHODS = "storedPaymentMethods";
    private List<PaymentMethod> paymentMethods;
    private List<StoredPaymentMethod> storedPaymentMethods;
    public static final ModelObject.Creator<PaymentMethodsApiResponse> CREATOR = new ModelObject.Creator<>(PaymentMethodsApiResponse.class);
    public static final ModelObject.Serializer<PaymentMethodsApiResponse> SERIALIZER = new ModelObject.Serializer<PaymentMethodsApiResponse>() { // from class: com.adyen.checkout.components.model.PaymentMethodsApiResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public PaymentMethodsApiResponse deserialize(JSONObject jSONObject) {
            PaymentMethodsApiResponse paymentMethodsApiResponse = new PaymentMethodsApiResponse();
            paymentMethodsApiResponse.setStoredPaymentMethods(ModelUtils.deserializeOptList(jSONObject.optJSONArray(PaymentMethodsApiResponse.STORED_PAYMENT_METHODS), StoredPaymentMethod.SERIALIZER));
            paymentMethodsApiResponse.setPaymentMethods(ModelUtils.deserializeOptList(jSONObject.optJSONArray(PaymentMethodsApiResponse.PAYMENT_METHODS), PaymentMethod.SERIALIZER));
            return paymentMethodsApiResponse;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(PaymentMethodsApiResponse paymentMethodsApiResponse) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(PaymentMethodsApiResponse.STORED_PAYMENT_METHODS, ModelUtils.serializeOptList(paymentMethodsApiResponse.getStoredPaymentMethods(), StoredPaymentMethod.SERIALIZER));
                jSONObject.putOpt(PaymentMethodsApiResponse.PAYMENT_METHODS, ModelUtils.serializeOptList(paymentMethodsApiResponse.getPaymentMethods(), PaymentMethod.SERIALIZER));
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(PaymentMethodsApiResponse.class, e);
            }
        }
    };

    public List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public List<StoredPaymentMethod> getStoredPaymentMethods() {
        return this.storedPaymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> list) {
        this.paymentMethods = list;
    }

    public void setStoredPaymentMethods(List<StoredPaymentMethod> list) {
        this.storedPaymentMethods = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
