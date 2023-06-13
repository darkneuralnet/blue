package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.braintreepayments.api.BraintreeBrowserSwitchActivity;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.exceptions.BrowserSwitchException;
import com.braintreepayments.api.models.ClientToken;
import com.braintreepayments.api.models.PayPalAccountNonce;
import com.braintreepayments.api.models.PayPalProductAttributes;
import com.braintreepayments.api.models.PayPalRequest;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.braintreepayments.api.models.PostalAddress;
import com.paypal.android.sdk.onetouch.core.BillingAgreementRequest;
import com.paypal.android.sdk.onetouch.core.CheckoutRequest;
import com.paypal.android.sdk.onetouch.core.PayPalLineItem;
import com.paypal.android.sdk.onetouch.core.Request;
import com.paypal.android.sdk.onetouch.core.Result;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: fL3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40881fL3 {

    /* renamed from: fL3$a */
    /* loaded from: classes2.dex */
    public static class C20358a implements HN1 {

        /* renamed from: a */
        public final /* synthetic */ G10 f79899a;

        /* renamed from: b */
        public final /* synthetic */ PayPalRequest f79900b;

        /* renamed from: c */
        public final /* synthetic */ boolean f79901c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC42660iL3 f79902d;

        public C20358a(G10 g10, PayPalRequest payPalRequest, boolean z, InterfaceC42660iL3 interfaceC42660iL3) {
            this.f79899a = g10;
            this.f79900b = payPalRequest;
            this.f79901c = z;
            this.f79902d = interfaceC42660iL3;
        }

        @Override // p000.HN1
        /* renamed from: a */
        public void mo10871a(Exception exc) {
            this.f79899a.m105954ya(exc);
        }

        @Override // p000.HN1
        public void success(String str) {
            Request m41554g;
            try {
                String builder = Uri.parse(C47997rL3.m16048a(str).m16047b()).buildUpon().appendQueryParameter("useraction", this.f79900b.m53340m()).toString();
                if (this.f79901c) {
                    m41554g = C40881fL3.m41555f(this.f79899a, builder);
                } else {
                    m41554g = C40881fL3.m41554g(this.f79899a, builder);
                }
                C40881fL3.m41538w(this.f79899a, m41554g, this.f79902d);
            } catch (JSONException e) {
                this.f79899a.m105954ya(e);
            }
        }
    }

    /* renamed from: fL3$b */
    /* loaded from: classes2.dex */
    public static class C20359b implements InterfaceC32288Cx0 {

        /* renamed from: b */
        public final /* synthetic */ G10 f79903b;

        /* renamed from: c */
        public final /* synthetic */ PayPalRequest f79904c;

        /* renamed from: d */
        public final /* synthetic */ boolean f79905d;

        /* renamed from: e */
        public final /* synthetic */ HN1 f79906e;

        public C20359b(G10 g10, PayPalRequest payPalRequest, boolean z, HN1 hn1) {
            this.f79903b = g10;
            this.f79904c = payPalRequest;
            this.f79905d = z;
            this.f79906e = hn1;
        }

        @Override // p000.InterfaceC32288Cx0
        /* renamed from: k */
        public void mo10872k(C40650ex0 c40650ex0) {
            if (!c40650ex0.m42366f()) {
                this.f79903b.m105954ya(new BraintreeException("PayPal is not enabled. See https://developers.braintreepayments.com/guides/paypal/overview/android/ for more information."));
            } else if (!C40881fL3.m41549l(this.f79903b)) {
                this.f79903b.m105974Ea("paypal.invalid-manifest");
                this.f79903b.m105954ya(new BraintreeException("BraintreeBrowserSwitchActivity missing, incorrectly configured in AndroidManifest.xml or another app defines the same browser switch url as this app. See https://developers.braintreepayments.com/guides/client-sdk/android/#browser-switch for the correct configuration"));
            } else {
                try {
                    C40881fL3.m41544q(this.f79903b.m105966T9(), this.f79904c);
                    C40881fL3.m41556e(this.f79903b, this.f79904c, this.f79905d, this.f79906e);
                } catch (JSONException e) {
                    this.f79903b.m105954ya(e);
                }
            }
        }
    }

    /* renamed from: fL3$c */
    /* loaded from: classes2.dex */
    public static class C20360c implements InterfaceC42067hL3 {

        /* renamed from: a */
        public final /* synthetic */ G10 f79907a;

        public C20360c(G10 g10) {
            this.f79907a = g10;
        }
    }

    /* renamed from: fL3$d */
    /* loaded from: classes2.dex */
    public static class C20361d implements InterfaceC42660iL3 {

        /* renamed from: a */
        public final /* synthetic */ G10 f79908a;

        public C20361d(G10 g10) {
            this.f79908a = g10;
        }

        @Override // p000.InterfaceC42660iL3
        /* renamed from: a */
        public void mo34136a(Request request, InterfaceC42067hL3 interfaceC42067hL3) {
            if (!this.f79908a.m105959ma()) {
                return;
            }
            C41519gQ3 m19462d = C46811pL3.m19462d(this.f79908a.m105966T9(), request);
            String m41545p = C40881fL3.m41545p(request);
            if (m19462d.m39491c() && m19462d.m39492b() == EnumC43236jJ4.wallet) {
                G10 g10 = this.f79908a;
                g10.m105974Ea(m41545p + ".app-switch.started");
                this.f79908a.startActivityForResult(m19462d.m39493a(), 13591);
            } else if (m19462d.m39491c() && m19462d.m39492b() == EnumC43236jJ4.browser) {
                G10 g102 = this.f79908a;
                g102.m105974Ea(m41545p + ".browser-switch.started");
                this.f79908a.m84410a5(13591, m19462d.m39493a());
            } else {
                G10 g103 = this.f79908a;
                g103.m105974Ea(m41545p + ".initiate.failed");
            }
        }
    }

    /* renamed from: fL3$e */
    /* loaded from: classes2.dex */
    public static class C20362e implements LN3 {

        /* renamed from: a */
        public final /* synthetic */ G10 f79909a;

        public C20362e(G10 g10) {
            this.f79909a = g10;
        }

        @Override // p000.LN3
        /* renamed from: a */
        public void mo4604a(Exception exc) {
            this.f79909a.m105954ya(exc);
        }

        @Override // p000.LN3
        /* renamed from: b */
        public void mo4603b(PaymentMethodNonce paymentMethodNonce) {
            if ((paymentMethodNonce instanceof PayPalAccountNonce) && ((PayPalAccountNonce) paymentMethodNonce).m53366h() != null) {
                this.f79909a.m105974Ea("paypal.credit.accepted");
            }
            this.f79909a.m105955va(paymentMethodNonce);
        }
    }

    /* renamed from: fL3$f */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C20363f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f79910a;

        static {
            int[] iArr = new int[EnumC42679iN4.values().length];
            f79910a = iArr;
            try {
                iArr[EnumC42679iN4.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79910a[EnumC42679iN4.Cancel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79910a[EnumC42679iN4.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: e */
    public static void m41556e(G10 g10, PayPalRequest payPalRequest, boolean z, HN1 hn1) throws JSONException {
        JSONObject jSONObject;
        String m53349c = payPalRequest.m53349c();
        if (m53349c == null) {
            m53349c = g10.m105964ea().m42367e().m27419c();
        }
        CheckoutRequest m41554g = m41554g(g10, null);
        JSONObject put = new JSONObject().put("return_url", m41554g.m45885m()).put("cancel_url", m41554g.m45890h()).put("offer_paypal_credit", payPalRequest.m53337p()).put("offer_pay_later", payPalRequest.m53336q());
        if (g10.m105965da() instanceof ClientToken) {
            put.put("authorization_fingerprint", g10.m105965da().mo53279b());
        } else {
            put.put("client_key", g10.m105965da().mo53279b());
        }
        if (!z) {
            put.put("amount", payPalRequest.m53351a()).put("currency_iso_code", m53349c).put("intent", payPalRequest.m53347e());
            if (!payPalRequest.m53345h().isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<PayPalLineItem> it = payPalRequest.m53345h().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().m45899a());
                }
                put.put("line_items", jSONArray);
            }
        } else {
            if (!TextUtils.isEmpty(payPalRequest.m53350b())) {
                put.put("description", payPalRequest.m53350b());
            }
            PayPalProductAttributes m53342k = payPalRequest.m53342k();
            if (m53342k != null) {
                put.put("product_attributes", new JSONObject().put("charge_pattern", m53342k.m53356a()).put("name", m53342k.m53355b()).put("product_code", m53342k.m53354c()));
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("no_shipping", !payPalRequest.m53338o());
        jSONObject2.put("landing_page_type", payPalRequest.m53346g());
        String m53348d = payPalRequest.m53348d();
        if (TextUtils.isEmpty(m53348d)) {
            m53348d = g10.m105964ea().m42367e().m27418d();
        }
        jSONObject2.put("brand_name", m53348d);
        if (payPalRequest.m53344i() != null) {
            jSONObject2.put("locale_code", payPalRequest.m53344i());
        }
        if (payPalRequest.m53341l() != null) {
            jSONObject2.put("address_override", !payPalRequest.m53339n());
            if (z) {
                jSONObject = new JSONObject();
                put.put("shipping_address", jSONObject);
            } else {
                jSONObject = put;
            }
            PostalAddress m53341l = payPalRequest.m53341l();
            jSONObject.put("line1", m53341l.m53316j());
            jSONObject.put("line2", m53341l.m53321d());
            jSONObject.put("city", m53341l.m53320e());
            jSONObject.put(TransferTable.COLUMN_STATE, m53341l.m53317i());
            jSONObject.put("postal_code", m53341l.m53319g());
            jSONObject.put("country_code", m53341l.m53322c());
            jSONObject.put("recipient_name", m53341l.m53318h());
        } else {
            jSONObject2.put("address_override", false);
        }
        if (payPalRequest.m53343j() != null) {
            put.put("merchant_account_id", payPalRequest.m53343j());
        }
        put.put("experience_profile", jSONObject2);
        String str = z ? "paypal_hermes/setup_billing_agreement" : "paypal_hermes/create_payment_resource";
        g10.m105962ha().mo3548e("/v1/" + str, put.toString(), hn1);
    }

    /* renamed from: f */
    public static BillingAgreementRequest m41555f(G10 g10, String str) {
        String queryParameter;
        BillingAgreementRequest mo45903s = ((BillingAgreementRequest) m41542s(g10, new BillingAgreementRequest())).mo45903s(str);
        if (str != null && (queryParameter = Uri.parse(str).getQueryParameter("ba_token")) != null) {
            mo45903s.mo45902t(g10.m105966T9(), queryParameter);
        }
        return mo45903s;
    }

    /* renamed from: g */
    public static CheckoutRequest m41554g(G10 g10, String str) {
        String queryParameter;
        CheckoutRequest mo45903s = ((CheckoutRequest) m41542s(g10, new CheckoutRequest())).mo45903s(str);
        if (str != null && (queryParameter = Uri.parse(str).getQueryParameter("token")) != null) {
            mo45903s.mo45902t(g10.m105966T9(), queryParameter);
        }
        return mo45903s;
    }

    /* renamed from: h */
    public static InterfaceC42660iL3 m41553h(G10 g10) {
        return new C20361d(g10);
    }

    /* renamed from: i */
    public static PayPalRequest m41552i(Context context) {
        SharedPreferences m93011a = O10.m93011a(context);
        try {
            byte[] decode = Base64.decode(m93011a.getString("com.braintreepayments.api.PayPal.PAYPAL_REQUEST_KEY", ""), 0);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            PayPalRequest createFromParcel = PayPalRequest.CREATOR.createFromParcel(obtain);
            m93011a.edit().remove("com.braintreepayments.api.PayPal.PAYPAL_REQUEST_KEY").apply();
            return createFromParcel;
        } catch (Exception unused) {
            m93011a.edit().remove("com.braintreepayments.api.PayPal.PAYPAL_REQUEST_KEY").apply();
            return null;
        } catch (Throwable th) {
            m93011a.edit().remove("com.braintreepayments.api.PayPal.PAYPAL_REQUEST_KEY").apply();
            throw th;
        }
    }

    /* renamed from: j */
    public static Request m41551j(Context context) {
        Parcel obtain;
        String string;
        CheckoutRequest createFromParcel;
        SharedPreferences m93011a = O10.m93011a(context);
        try {
            byte[] decode = Base64.decode(m93011a.getString("com.braintreepayments.api.PayPal.REQUEST_KEY", ""), 0);
            obtain = Parcel.obtain();
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            string = m93011a.getString("com.braintreepayments.api.PayPal.REQUEST_TYPE_KEY", "");
        } catch (Exception unused) {
        } catch (Throwable th) {
            m93011a.edit().remove("com.braintreepayments.api.PayPal.REQUEST_KEY").remove("com.braintreepayments.api.PayPal.REQUEST_TYPE_KEY").apply();
            throw th;
        }
        if (BillingAgreementRequest.class.getSimpleName().equals(string)) {
            createFromParcel = BillingAgreementRequest.CREATOR.createFromParcel(obtain);
        } else {
            if (CheckoutRequest.class.getSimpleName().equals(string)) {
                createFromParcel = CheckoutRequest.CREATOR.createFromParcel(obtain);
            }
            m93011a.edit().remove("com.braintreepayments.api.PayPal.REQUEST_KEY").remove("com.braintreepayments.api.PayPal.REQUEST_TYPE_KEY").apply();
            return null;
        }
        m93011a.edit().remove("com.braintreepayments.api.PayPal.REQUEST_KEY").remove("com.braintreepayments.api.PayPal.REQUEST_TYPE_KEY").apply();
        return createFromParcel;
    }

    /* renamed from: k */
    public static boolean m41550k(Intent intent) {
        return intent.getData() == null;
    }

    /* renamed from: l */
    public static boolean m41549l(G10 g10) {
        return TJ2.m83893b(g10.m105966T9(), g10.mo84411N6(), BraintreeBrowserSwitchActivity.class);
    }

    /* renamed from: m */
    public static void m41548m(G10 g10, int i, Intent intent) {
        Request m41551j = m41551j(g10.m105966T9());
        String str = m41545p(m41551j) + InstructionFileId.DOT + m41537x(intent);
        if (i == -1 && intent != null && m41551j != null) {
            Result m19459g = C46811pL3.m19459g(g10.m105966T9(), m41551j, intent);
            int i2 = C20363f.f79910a[m19459g.m45877c().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        m41547n(g10, intent, m41551j, m19459g);
                        g10.m105974Ea(str + ".succeeded");
                        return;
                    }
                    return;
                }
                g10.m105981Aa(13591);
                g10.m105974Ea(str + ".canceled");
                return;
            }
            g10.m105954ya(new BrowserSwitchException(m19459g.m45879a().getMessage()));
            g10.m105974Ea(str + ".failed");
            return;
        }
        g10.m105974Ea(str + ".canceled");
        if (i != 0) {
            g10.m105981Aa(13591);
        }
    }

    /* renamed from: n */
    public static void m41547n(G10 g10, Intent intent, Request request, Result result) {
        C49629u56.m10876c(g10, m41546o(m41552i(g10.m105966T9()), request, result, intent), new C20362e(g10));
    }

    /* renamed from: o */
    public static C41474gL3 m41546o(PayPalRequest payPalRequest, Request request, Result result, Intent intent) {
        C41474gL3 m39606l = new C41474gL3().m39606l(request.m45888j());
        if (payPalRequest != null && payPalRequest.m53343j() != null) {
            m39606l.m39604n(payPalRequest.m53343j());
        }
        if ((request instanceof CheckoutRequest) && payPalRequest != null) {
            m39606l.m39605m(payPalRequest.m53347e());
        }
        if (m41550k(intent)) {
            m39606l.m16027k("paypal-app");
        } else {
            m39606l.m16027k("paypal-browser");
        }
        m39606l.m39603o(result.m45878b());
        return m39606l;
    }

    /* renamed from: p */
    public static String m41545p(Request request) {
        if (request instanceof BillingAgreementRequest) {
            return "paypal.billing-agreement";
        }
        if (request instanceof CheckoutRequest) {
            return "paypal.single-payment";
        }
        return "paypal.unknown";
    }

    /* renamed from: q */
    public static void m41544q(Context context, PayPalRequest payPalRequest) {
        Parcel obtain = Parcel.obtain();
        payPalRequest.writeToParcel(obtain, 0);
        O10.m93011a(context).edit().putString("com.braintreepayments.api.PayPal.PAYPAL_REQUEST_KEY", Base64.encodeToString(obtain.marshall(), 0)).apply();
    }

    /* renamed from: r */
    public static void m41543r(Context context, Request request) {
        Parcel obtain = Parcel.obtain();
        request.writeToParcel(obtain, 0);
        O10.m93011a(context).edit().putString("com.braintreepayments.api.PayPal.REQUEST_KEY", Base64.encodeToString(obtain.marshall(), 0)).putString("com.braintreepayments.api.PayPal.REQUEST_TYPE_KEY", request.getClass().getSimpleName()).apply();
    }

    /* renamed from: s */
    public static <T extends Request> T m41542s(G10 g10, T t) {
        String str;
        C44439lL3 m42367e = g10.m105964ea().m42367e();
        String m27417e = m42367e.m27417e();
        m27417e.hashCode();
        if (m27417e.equals("offline")) {
            str = "mock";
        } else {
            str = "live";
            if (!m27417e.equals("live")) {
                str = m42367e.m27417e();
            }
        }
        String m27420b = m42367e.m27420b();
        if (m27420b == null && "mock".equals(str)) {
            m27420b = "FAKE-PAYPAL-CLIENT-ID";
        }
        t.m45893d(str).m45895b(m27420b).m45896a(g10.mo84411N6(), "cancel").m45882p(g10.mo84411N6(), "success");
        return t;
    }

    /* renamed from: t */
    public static void m41541t(G10 g10, PayPalRequest payPalRequest) {
        m41540u(g10, payPalRequest, null);
    }

    /* renamed from: u */
    public static void m41540u(G10 g10, PayPalRequest payPalRequest, InterfaceC42660iL3 interfaceC42660iL3) {
        if (payPalRequest.m53351a() == null) {
            g10.m105974Ea("paypal.billing-agreement.selected");
            if (payPalRequest.m53337p()) {
                g10.m105974Ea("paypal.billing-agreement.credit.offered");
            }
            m41539v(g10, payPalRequest, true, interfaceC42660iL3);
            return;
        }
        g10.m105954ya(new BraintreeException("There must be no amount specified for the Billing Agreement flow"));
    }

    /* renamed from: v */
    public static void m41539v(G10 g10, PayPalRequest payPalRequest, boolean z, InterfaceC42660iL3 interfaceC42660iL3) {
        g10.m105969Ja(new C20359b(g10, payPalRequest, z, new C20358a(g10, payPalRequest, z, interfaceC42660iL3)));
    }

    /* renamed from: w */
    public static void m41538w(G10 g10, Request request, InterfaceC42660iL3 interfaceC42660iL3) {
        C20360c c20360c;
        m41543r(g10.m105966T9(), request);
        if (interfaceC42660iL3 == null) {
            interfaceC42660iL3 = m41553h(g10);
            c20360c = null;
        } else {
            c20360c = new C20360c(g10);
        }
        interfaceC42660iL3.mo34136a(request, c20360c);
    }

    /* renamed from: x */
    public static String m41537x(Intent intent) {
        return intent != null ? (intent.getData() != null || intent.getBooleanExtra("com.braintreepayments.api.WAS_BROWSER_SWITCH_RESULT", false)) ? "browser-switch" : "app-switch" : "unknown";
    }
}
