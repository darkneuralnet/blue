package p000;

import android.content.Intent;
import android.net.Uri;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.models.LocalPaymentResult;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: jv2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43597jv2 {

    /* renamed from: a */
    public static String f93528a;

    /* renamed from: b */
    public static String f93529b;

    /* renamed from: jv2$a */
    /* loaded from: classes2.dex */
    public static class C25039a implements HN1 {

        /* renamed from: a */
        public final /* synthetic */ G10 f93530a;

        public C25039a(G10 g10) {
            this.f93530a = g10;
        }

        @Override // p000.HN1
        /* renamed from: a */
        public void mo10871a(Exception exc) {
            G10 g10 = this.f93530a;
            g10.m105974Ea(C43597jv2.m29766c() + ".local-payment.tokenize.failed");
            this.f93530a.m105954ya(exc);
        }

        @Override // p000.HN1
        public void success(String str) {
            try {
                LocalPaymentResult m53370g = LocalPaymentResult.m53370g(str);
                G10 g10 = this.f93530a;
                g10.m105974Ea(C43597jv2.m29766c() + ".local-payment.tokenize.succeeded");
                this.f93530a.m105955va(m53370g);
            } catch (JSONException e) {
                mo10871a(e);
            }
        }
    }

    /* renamed from: b */
    public static void m29767b(G10 g10, int i, Intent intent) {
        Uri data;
        if (i == 0) {
            m29765d(g10);
            return;
        }
        if (intent == null) {
            data = null;
        } else {
            data = intent.getData();
        }
        if (data == null) {
            m29764e(g10);
            return;
        }
        String uri = data.toString();
        if (uri.toLowerCase().contains("local-payment-cancel".toLowerCase())) {
            m29765d(g10);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("merchant_account_id", f93528a);
            jSONObject.put("paypal_account", new JSONObject().put("intent", "sale").put("response", new JSONObject().put("webURL", uri)).put("options", new JSONObject().put("validate", false)).put("response_type", "web").put("correlation_id", C45032mL3.m25820a(g10.m105966T9())));
            jSONObject.put("_meta", new JSONObject().put(Stripe3ds2AuthParams.FIELD_SOURCE, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT).put("integration", g10.m105961ia()).put("sessionId", g10.m105960la()));
            g10.m105962ha().mo3548e("/v1/payment_methods/paypal_accounts", jSONObject.toString(), new C25039a(g10));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c */
    public static String m29766c() {
        String str = f93529b;
        return str != null ? str : "unknown";
    }

    /* renamed from: d */
    public static void m29765d(G10 g10) {
        g10.m105974Ea(m29766c() + ".local-payment.webswitch.canceled");
        g10.m105981Aa(13596);
    }

    /* renamed from: e */
    public static void m29764e(G10 g10) {
        g10.m105974Ea(m29766c() + ".local-payment.webswitch-response.invalid");
        g10.m105954ya(new BraintreeException("LocalPayment encountered an error, return URL is invalid."));
    }
}
