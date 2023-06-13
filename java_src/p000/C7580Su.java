package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J \u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J.\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011H\u0002R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LSu;", "", "", DateTokenConverter.CONVERTER_KEY, "", "activityName", "", "timeSpentInSeconds", "e", "purchase", "skuDetails", "", "isSubscription", "f", "c", "LSu$a;", C17296a.f69688o, "", "extraParameter", "b", "Ljava/lang/String;", "TAG", "Ln62;", "Ln62;", "internalAppEventsLogger", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Su */
/* loaded from: classes5.dex */
public final class C7580Su {

    /* renamed from: c */
    public static final C7580Su f34423c = new C7580Su();

    /* renamed from: a */
    public static final String f34421a = C7580Su.class.getCanonicalName();

    /* renamed from: b */
    public static final C45485n62 f34422b = new C45485n62(C17216a.m52741e());

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LSu$a;", "", "Ljava/math/BigDecimal;", C17296a.f69688o, "Ljava/math/BigDecimal;", "c", "()Ljava/math/BigDecimal;", "setPurchaseAmount", "(Ljava/math/BigDecimal;)V", "purchaseAmount", "Ljava/util/Currency;", "b", "Ljava/util/Currency;", "()Ljava/util/Currency;", "setCurrency", "(Ljava/util/Currency;)V", "currency", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "setParam", "(Landroid/os/Bundle;)V", "param", "<init>", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Su$a */
    /* loaded from: classes5.dex */
    public static final class C7581a {

        /* renamed from: a */
        public BigDecimal f34424a;

        /* renamed from: b */
        public Currency f34425b;

        /* renamed from: c */
        public Bundle f34426c;

        public C7581a(BigDecimal purchaseAmount, Currency currency, Bundle param) {
            Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(param, "param");
            this.f34424a = purchaseAmount;
            this.f34425b = currency;
            this.f34426c = param;
        }

        /* renamed from: a */
        public final Currency m84660a() {
            return this.f34425b;
        }

        /* renamed from: b */
        public final Bundle m84659b() {
            return this.f34426c;
        }

        /* renamed from: c */
        public final BigDecimal m84658c() {
            return this.f34424a;
        }
    }

    private C7580Su() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m84664c() {
        C34512Mk1 m93522j = C34746Nk1.m93522j(C17216a.m52740f());
        if (m93522j != null && C17216a.m52736j() && m93522j.m94975g()) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m84663d() {
        Context m52741e = C17216a.m52741e();
        String m52740f = C17216a.m52740f();
        boolean m52736j = C17216a.m52736j();
        C48817sj6.m13765m(m52741e, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (m52736j) {
            if (m52741e instanceof Application) {
                C9459Xi.m76557a((Application) m52741e, m52740f);
            } else {
                Log.w(f34421a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m84662e(String str, long j) {
        Context m52741e = C17216a.m52741e();
        String appId = C17216a.m52740f();
        C48817sj6.m13765m(m52741e, CoreConstants.CONTEXT_SCOPE_VALUE);
        Intrinsics.checkNotNullExpressionValue(appId, "appId");
        C34512Mk1 m93517o = C34746Nk1.m93517o(appId, false);
        if (m93517o != null && m93517o.m94981a() && j > 0) {
            C45485n62 c45485n62 = new C45485n62(m52741e);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            c45485n62.m24342d("fb_aa_time_spent_on_view", j, bundle);
        }
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m84661f(String purchase, String skuDetails, boolean z) {
        C7581a m84666a;
        String str;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
        if (m84664c() && (m84666a = f34423c.m84666a(purchase, skuDetails)) != null) {
            boolean z2 = false;
            if (z && C34278Lk1.m96391f("app_events_if_auto_log_subs", C17216a.m52740f(), false)) {
                z2 = true;
            }
            if (z2) {
                if (KZ1.m98743m(skuDetails)) {
                    str = "StartTrial";
                } else {
                    str = "Subscribe";
                }
                f34422b.m24336j(str, m84666a.m84658c(), m84666a.m84660a(), m84666a.m84659b());
                return;
            }
            f34422b.m24335k(m84666a.m84658c(), m84666a.m84660a(), m84666a.m84659b());
        }
    }

    /* renamed from: a */
    public final C7581a m84666a(String str, String str2) {
        return m84665b(str, str2, new HashMap());
    }

    /* renamed from: b */
    public final C7581a m84665b(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            boolean z = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (Intrinsics.areEqual(optString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
                Intrinsics.checkNotNullExpressionValue(introductoryPriceCycles, "introductoryPriceCycles");
                if (introductoryPriceCycles.length() != 0) {
                    z = false;
                }
                if (!z) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", introductoryPriceCycles);
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            Intrinsics.checkNotNullExpressionValue(currency, "Currency.getInstance(sku…g(\"price_currency_code\"))");
            return new C7581a(bigDecimal, currency, bundle);
        } catch (JSONException e) {
            Log.e(f34421a, "Error parsing in-app subscription data.", e);
            return null;
        }
    }
}
