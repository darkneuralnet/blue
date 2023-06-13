package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.FacebookException;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p000.C32172Ck1;
import p000.C9459Xi;
import p000.W42;
/* renamed from: Yi */
/* loaded from: classes5.dex */
public class C9916Yi {

    /* renamed from: c */
    public static final String f46302c = "Yi";

    /* renamed from: d */
    public static ScheduledThreadPoolExecutor f46303d;

    /* renamed from: e */
    public static C9459Xi.EnumC9460a f46304e = C9459Xi.EnumC9460a.AUTO;

    /* renamed from: f */
    public static final Object f46305f = new Object();

    /* renamed from: g */
    public static String f46306g;

    /* renamed from: h */
    public static boolean f46307h;

    /* renamed from: i */
    public static String f46308i;

    /* renamed from: a */
    public final String f46309a;

    /* renamed from: b */
    public final C1706E1 f46310b;

    /* renamed from: Yi$a */
    /* loaded from: classes5.dex */
    public static class RunnableC9917a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Context f46311b;

        /* renamed from: c */
        public final /* synthetic */ C9916Yi f46312c;

        public RunnableC9917a(Context context, C9916Yi c9916Yi) {
            this.f46311b = context;
            this.f46312c = c9916Yi;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i = 0;
                for (int i2 = 0; i2 < 11; i2++) {
                    String str = strArr[i2];
                    String str2 = strArr2[i2];
                    try {
                        Class.forName(str);
                        bundle.putInt(str2, 1);
                        i |= 1 << i2;
                    } catch (ClassNotFoundException unused) {
                    }
                }
                SharedPreferences sharedPreferences = this.f46311b.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                    sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                    this.f46312c.m74445p("fb_sdk_initialize", null, bundle);
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: Yi$b */
    /* loaded from: classes5.dex */
    public static class C9918b implements W42.InterfaceC8930a {
        @Override // p000.W42.InterfaceC8930a
        /* renamed from: a */
        public void mo74438a(String str) {
            C9916Yi.m74439v(str);
        }
    }

    /* renamed from: Yi$c */
    /* loaded from: classes5.dex */
    public static class RunnableC9919c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                HashSet<String> hashSet = new HashSet();
                for (C1706E1 c1706e1 : C8380Ui.m81050m()) {
                    hashSet.add(c1706e1.m109494b());
                }
                for (String str : hashSet) {
                    C34746Nk1.m93517o(str, true);
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    public C9916Yi(Context context, String str, AccessToken accessToken) {
        this(C52364yi6.m2819q(context), str, accessToken);
    }

    /* renamed from: a */
    public static void m74460a(Application application, String str) {
        if (TD0.m84203d(C9916Yi.class)) {
            return;
        }
        try {
            if (C17216a.m52722x()) {
                C12452bb.m64300d();
                C36353Ug6.m81185g();
                if (str == null) {
                    str = C17216a.m52740f();
                }
                C17216a.m52751C(application, str);
                C20715g4.m40168x(application, str);
                return;
            }
            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
        }
    }

    /* renamed from: b */
    public static void m74459b() {
        if (TD0.m84203d(C9916Yi.class)) {
            return;
        }
        try {
            if (m74455f() != C9459Xi.EnumC9460a.EXPLICIT_ONLY) {
                C8380Ui.m81052k(EnumC46561ov1.EAGER_FLUSHING_EVENT);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
        }
    }

    /* renamed from: d */
    public static Executor m74457d() {
        if (TD0.m84203d(C9916Yi.class)) {
            return null;
        }
        try {
            if (f46303d == null) {
                m74451j();
            }
            return f46303d;
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
            return null;
        }
    }

    /* renamed from: e */
    public static String m74456e(Context context) {
        if (TD0.m84203d(C9916Yi.class)) {
            return null;
        }
        try {
            if (f46306g == null) {
                synchronized (f46305f) {
                    if (f46306g == null) {
                        String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                        f46306g = string;
                        if (string == null) {
                            f46306g = "XZ" + UUID.randomUUID().toString();
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f46306g).apply();
                        }
                    }
                }
            }
            return f46306g;
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
            return null;
        }
    }

    /* renamed from: f */
    public static C9459Xi.EnumC9460a m74455f() {
        C9459Xi.EnumC9460a enumC9460a;
        if (TD0.m84203d(C9916Yi.class)) {
            return null;
        }
        try {
            synchronized (f46305f) {
                enumC9460a = f46304e;
            }
            return enumC9460a;
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
            return null;
        }
    }

    /* renamed from: g */
    public static String m74454g() {
        if (TD0.m84203d(C9916Yi.class)) {
            return null;
        }
        try {
            W42.m78865d(new C9918b());
            return C17216a.m52741e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
            return null;
        }
    }

    /* renamed from: h */
    public static String m74453h() {
        String str;
        if (TD0.m84203d(C9916Yi.class)) {
            return null;
        }
        try {
            synchronized (f46305f) {
                str = f46308i;
            }
            return str;
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
            return null;
        }
    }

    /* renamed from: i */
    public static void m74452i(Context context, String str) {
        if (TD0.m84203d(C9916Yi.class)) {
            return;
        }
        try {
            if (!C17216a.m52736j()) {
                return;
            }
            f46303d.execute(new RunnableC9917a(context, new C9916Yi(context, str, (AccessToken) null)));
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
        }
    }

    /* renamed from: j */
    public static void m74451j() {
        if (TD0.m84203d(C9916Yi.class)) {
            return;
        }
        try {
            synchronized (f46305f) {
                if (f46303d != null) {
                    return;
                }
                f46303d = new ScheduledThreadPoolExecutor(1);
                f46303d.scheduleAtFixedRate(new RunnableC9919c(), 0L, 86400L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
        }
    }

    /* renamed from: k */
    public static void m74450k(C7508Si c7508Si, C1706E1 c1706e1) {
        if (TD0.m84203d(C9916Yi.class)) {
            return;
        }
        try {
            C8380Ui.m81055h(c1706e1, c7508Si);
            if (C32172Ck1.m111754g(C32172Ck1.EnumC1165b.OnDevicePostInstallEventProcessing) && C34478Mg3.m95051b()) {
                C34478Mg3.m95050c(c1706e1.m109494b(), c7508Si);
            }
            if (!c7508Si.m85024c() && !f46307h) {
                if (c7508Si.getName().equals("fb_mobile_activate_app")) {
                    f46307h = true;
                } else {
                    C32992Fx2.m106220g(EnumC36034Sx2.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
        }
    }

    /* renamed from: t */
    public static void m74441t(String str) {
        if (TD0.m84203d(C9916Yi.class)) {
            return;
        }
        try {
            C32992Fx2.m106220g(EnumC36034Sx2.DEVELOPER_ERRORS, "AppEvents", str);
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
        }
    }

    /* renamed from: u */
    public static void m74440u() {
        if (TD0.m84203d(C9916Yi.class)) {
            return;
        }
        try {
            C8380Ui.m81048o();
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
        }
    }

    /* renamed from: v */
    public static void m74439v(String str) {
        if (TD0.m84203d(C9916Yi.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C17216a.m52741e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C9916Yi.class);
        }
    }

    /* renamed from: c */
    public void m74458c() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            C8380Ui.m81052k(EnumC46561ov1.EXPLICIT);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: l */
    public void m74449l(String str, double d, Bundle bundle) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            m74447n(str, Double.valueOf(d), bundle, false, C20715g4.m40175q());
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: m */
    public void m74448m(String str, Bundle bundle) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            m74447n(str, null, bundle, false, C20715g4.m40175q());
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: n */
    public void m74447n(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (!TD0.m84203d(this) && str != null) {
            try {
                if (!str.isEmpty()) {
                    if (C34278Lk1.m96391f("app_events_killswitch", C17216a.m52740f(), false)) {
                        C32992Fx2.m106219h(EnumC36034Sx2.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                        return;
                    }
                    try {
                        m74450k(new C7508Si(this.f46309a, str, d, bundle, z, C20715g4.m40173s(), uuid), this.f46310b);
                    } catch (FacebookException e) {
                        C32992Fx2.m106219h(EnumC36034Sx2.APP_EVENTS, "AppEvents", "Invalid app event: %s", e.toString());
                    } catch (JSONException e2) {
                        C32992Fx2.m106219h(EnumC36034Sx2.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e2.toString());
                    }
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: o */
    public void m74446o(String str, String str2) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            m74448m(str, bundle);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: p */
    public void m74445p(String str, Double d, Bundle bundle) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            m74447n(str, d, bundle, true, C20715g4.m40175q());
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: q */
    public void m74444q(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (bigDecimal != null && currency != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                m74447n(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, C20715g4.m40175q());
                return;
            }
            C52364yi6.m2853Y(f46302c, "purchaseAmount and currency cannot be null");
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: r */
    public void m74443r(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                m74441t("purchaseAmount cannot be null");
            } else if (currency == null) {
                m74441t("currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                m74447n("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, C20715g4.m40175q());
                m74459b();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: s */
    public void m74442s(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            m74443r(bigDecimal, currency, bundle, true);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    public C9916Yi(String str, String str2, AccessToken accessToken) {
        C48817sj6.m13763o();
        this.f46309a = str;
        accessToken = accessToken == null ? AccessToken.m52920c() : accessToken;
        if (accessToken != null && !accessToken.m52908p() && (str2 == null || str2.equals(accessToken.m52921b()))) {
            this.f46310b = new C1706E1(accessToken);
        } else {
            this.f46310b = new C1706E1(null, str2 == null ? C52364yi6.m2801z(C17216a.m52741e()) : str2);
        }
        m74451j();
    }
}
