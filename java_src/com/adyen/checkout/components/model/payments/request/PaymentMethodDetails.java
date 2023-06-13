package com.adyen.checkout.components.model.payments.request;

import android.text.TextUtils;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.model.ModelObject;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class PaymentMethodDetails extends ModelObject {
    public static final ModelObject.Serializer<PaymentMethodDetails> SERIALIZER = new ModelObject.Serializer<PaymentMethodDetails>() { // from class: com.adyen.checkout.components.model.payments.request.PaymentMethodDetails.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public PaymentMethodDetails deserialize(JSONObject jSONObject) {
            String optString = jSONObject.optString("type", null);
            if (!TextUtils.isEmpty(optString)) {
                return PaymentMethodDetails.getChildSerializer(optString).deserialize(jSONObject);
            }
            throw new CheckoutException("PaymentMethod type not found");
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(PaymentMethodDetails paymentMethodDetails) {
            String type = paymentMethodDetails.getType();
            if (!TextUtils.isEmpty(type)) {
                return PaymentMethodDetails.getChildSerializer(type).serialize(paymentMethodDetails);
            }
            throw new CheckoutException("PaymentMethod type not found");
        }
    };
    public static final String TYPE = "type";
    private String type;

    public static ModelObject.Serializer<? extends PaymentMethodDetails> getChildSerializer(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1647305830:
                if (str.equals("molpay_ebanking_fpx_MY")) {
                    c = 0;
                    break;
                }
                break;
            case -1325974849:
                if (str.equals(DotpayPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c = 1;
                    break;
                }
                break;
            case -907987547:
                if (str.equals(CardPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c = 2;
                    break;
                }
                break;
            case -857582069:
                if (str.equals(EntercashPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c = 3;
                    break;
                }
                break;
            case 100648:
                if (str.equals("eps")) {
                    c = 4;
                    break;
                }
                break;
            case 3026668:
                if (str.equals(BlikPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c = 5;
                    break;
                }
                break;
            case 100048981:
                if (str.equals("ideal")) {
                    c = 6;
                    break;
                }
                break;
            case 103700794:
                if (str.equals(MBWayPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c = 7;
                    break;
                }
                break;
            case 970824177:
                if (str.equals("molpay_ebanking_TH")) {
                    c = '\b';
                    break;
                }
                break;
            case 970824245:
                if (str.equals("molpay_ebanking_VN")) {
                    c = '\t';
                    break;
                }
                break;
            case 1200873767:
                if (str.equals("paywithgoogle")) {
                    c = '\n';
                    break;
                }
                break;
            case 1474526159:
                if (str.equals(PaymentSheetEvent.FIELD_GOOGLE_PAY)) {
                    c = 11;
                    break;
                }
                break;
            case 1545915136:
                if (str.equals(SepaPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c = '\f';
                    break;
                }
                break;
            case 1984622361:
                if (str.equals(OpenBankingPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case '\b':
            case '\t':
                return MolpayPaymentMethod.SERIALIZER;
            case 1:
                return DotpayPaymentMethod.SERIALIZER;
            case 2:
                return CardPaymentMethod.SERIALIZER;
            case 3:
                return EntercashPaymentMethod.SERIALIZER;
            case 4:
                return EPSPaymentMethod.SERIALIZER;
            case 5:
                return BlikPaymentMethod.SERIALIZER;
            case 6:
                return IdealPaymentMethod.SERIALIZER;
            case 7:
                return MBWayPaymentMethod.SERIALIZER;
            case '\n':
            case 11:
                return GooglePayPaymentMethod.SERIALIZER;
            case '\f':
                return SepaPaymentMethod.SERIALIZER;
            case '\r':
                return OpenBankingPaymentMethod.SERIALIZER;
            default:
                return GenericPaymentMethod.SERIALIZER;
        }
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }
}
