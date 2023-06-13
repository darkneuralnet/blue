package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C34512Mk1;
import p000.C45848nj1;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u001cB\t\b\u0002¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u00150\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0002R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010'\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010#0#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, m28432d2 = {"LNk1;", "", "", "k", "", NamedConstantsKt.APPLICATION_ID, "LMk1;", "j", "LNk1$b;", "callback", "h", "", "forceRequery", "o", "Lorg/json/JSONObject;", "settingsJSON", "l", "n", "i", "dialogConfigResponse", "", "", "LMk1$b;", "m", C17296a.f69688o, "Ljava/lang/String;", "TAG", "", "b", "Ljava/util/List;", "APP_SETTING_FIELDS", "c", "Ljava/util/Map;", "fetchedAppSettings", "Ljava/util/concurrent/atomic/AtomicReference;", "LNk1$a;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicReference;", "loadingState", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "e", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "fetchedAppSettingsCallbacks", "f", "Z", "printedSDKUpdatedMessage", "Lorg/json/JSONArray;", "g", "Lorg/json/JSONArray;", "unityEventBindings", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Nk1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34746Nk1 {

    /* renamed from: a */
    public static final String f25043a;

    /* renamed from: b */
    public static final List<String> f25044b;

    /* renamed from: c */
    public static final Map<String, C34512Mk1> f25045c;

    /* renamed from: d */
    public static final AtomicReference<EnumC5661a> f25046d;

    /* renamed from: e */
    public static final ConcurrentLinkedQueue<InterfaceC5662b> f25047e;

    /* renamed from: f */
    public static boolean f25048f;

    /* renamed from: g */
    public static JSONArray f25049g;

    /* renamed from: h */
    public static final C34746Nk1 f25050h = new C34746Nk1();

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"LNk1$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Nk1$a */
    /* loaded from: classes5.dex */
    public enum EnumC5661a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, m28432d2 = {"LNk1$b;", "", "LMk1;", "fetchedAppSettings", "", C17296a.f69688o, "onError", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Nk1$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC5662b {
        /* renamed from: a */
        void mo70828a(C34512Mk1 c34512Mk1);

        void onError();
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Nk1$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC5663c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Context f25056b;

        /* renamed from: c */
        public final /* synthetic */ String f25057c;

        /* renamed from: d */
        public final /* synthetic */ String f25058d;

        public RunnableC5663c(Context context, String str, String str2) {
            this.f25056b = context;
            this.f25057c = str;
            this.f25058d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            EnumC5661a enumC5661a;
            JSONObject jSONObject;
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f25056b.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                C34512Mk1 c34512Mk1 = null;
                String string = sharedPreferences.getString(this.f25057c, null);
                if (!C52364yi6.m2860R(string)) {
                    if (string != null) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e) {
                            C52364yi6.m2854X("FacebookSDK", e);
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            C34746Nk1 c34746Nk1 = C34746Nk1.f25050h;
                            String applicationId = this.f25058d;
                            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
                            c34512Mk1 = c34746Nk1.m93520l(applicationId, jSONObject);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                C34746Nk1 c34746Nk12 = C34746Nk1.f25050h;
                String applicationId2 = this.f25058d;
                Intrinsics.checkNotNullExpressionValue(applicationId2, "applicationId");
                JSONObject m93523i = c34746Nk12.m93523i(applicationId2);
                if (m93523i != null) {
                    String applicationId3 = this.f25058d;
                    Intrinsics.checkNotNullExpressionValue(applicationId3, "applicationId");
                    c34746Nk12.m93520l(applicationId3, m93523i);
                    sharedPreferences.edit().putString(this.f25057c, m93523i.toString()).apply();
                }
                if (c34512Mk1 != null) {
                    String m94970l = c34512Mk1.m94970l();
                    if (!C34746Nk1.f25048f && m94970l != null && m94970l.length() > 0) {
                        C34746Nk1.f25048f = true;
                        Log.w(C34746Nk1.f25043a, m94970l);
                    }
                }
                String applicationId4 = this.f25058d;
                Intrinsics.checkNotNullExpressionValue(applicationId4, "applicationId");
                C34278Lk1.m96384m(applicationId4, true);
                C7580Su.m84663d();
                AtomicReference atomicReference = C34746Nk1.f25046d;
                if (C34746Nk1.f25045c.containsKey(this.f25058d)) {
                    enumC5661a = EnumC5661a.SUCCESS;
                } else {
                    enumC5661a = EnumC5661a.ERROR;
                }
                atomicReference.set(enumC5661a);
                c34746Nk12.m93518n();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Nk1$d */
    /* loaded from: classes5.dex */
    public static final class RunnableC5664d implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC5662b f25059b;

        public RunnableC5664d(InterfaceC5662b interfaceC5662b) {
            this.f25059b = interfaceC5662b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                this.f25059b.onError();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Nk1$e */
    /* loaded from: classes5.dex */
    public static final class RunnableC5665e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC5662b f25060b;

        /* renamed from: c */
        public final /* synthetic */ C34512Mk1 f25061c;

        public RunnableC5665e(InterfaceC5662b interfaceC5662b, C34512Mk1 c34512Mk1) {
            this.f25060b = interfaceC5662b;
            this.f25061c = c34512Mk1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                this.f25060b.mo70828a(this.f25061c);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    static {
        List<String> listOf;
        String simpleName = C34746Nk1.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "FetchedAppSettingsManager::class.java.simpleName");
        f25043a = simpleName;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting"});
        f25044b = listOf;
        f25045c = new ConcurrentHashMap();
        f25046d = new AtomicReference<>(EnumC5661a.NOT_LOADED);
        f25047e = new ConcurrentLinkedQueue<>();
    }

    private C34746Nk1() {
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m93524h(InterfaceC5662b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        f25047e.add(callback);
        m93521k();
    }

    @JvmStatic
    /* renamed from: j */
    public static final C34512Mk1 m93522j(String str) {
        if (str != null) {
            return f25045c.get(str);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m93521k() {
        boolean z;
        Context m52741e = C17216a.m52741e();
        String m52740f = C17216a.m52740f();
        if (C52364yi6.m2860R(m52740f)) {
            f25046d.set(EnumC5661a.ERROR);
            f25050h.m93518n();
        } else if (f25045c.containsKey(m52740f)) {
            f25046d.set(EnumC5661a.SUCCESS);
            f25050h.m93518n();
        } else {
            AtomicReference<EnumC5661a> atomicReference = f25046d;
            EnumC5661a enumC5661a = EnumC5661a.NOT_LOADED;
            EnumC5661a enumC5661a2 = EnumC5661a.LOADING;
            if (!C42482i24.m35337a(atomicReference, enumC5661a, enumC5661a2) && !C42482i24.m35337a(atomicReference, EnumC5661a.ERROR, enumC5661a2)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                f25050h.m93518n();
                return;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m52740f}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            C17216a.m52731o().execute(new RunnableC5663c(m52741e, format, m52740f));
        }
    }

    @JvmStatic
    /* renamed from: o */
    public static final C34512Mk1 m93517o(String applicationId, boolean z) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z) {
            Map<String, C34512Mk1> map = f25045c;
            if (map.containsKey(applicationId)) {
                return map.get(applicationId);
            }
        }
        C34746Nk1 c34746Nk1 = f25050h;
        JSONObject m93523i = c34746Nk1.m93523i(applicationId);
        if (m93523i != null) {
            C34512Mk1 m93520l = c34746Nk1.m93520l(applicationId, m93523i);
            if (Intrinsics.areEqual(applicationId, C17216a.m52740f())) {
                f25046d.set(EnumC5661a.SUCCESS);
                c34746Nk1.m93518n();
            }
            return m93520l;
        }
        return null;
    }

    /* renamed from: i */
    public final JSONObject m93523i(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f25044b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest m52781w = GraphRequest.f69390s.m52781w(null, str, null);
        m52781w.m52849D(true);
        m52781w.m52850C(bundle);
        JSONObject m78702d = m52781w.m52837j().m78702d();
        if (m78702d == null) {
            return new JSONObject();
        }
        return m78702d;
    }

    /* renamed from: l */
    public final C34512Mk1 m93520l(String applicationId, JSONObject settingsJSON) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(settingsJSON, "settingsJSON");
        JSONArray optJSONArray = settingsJSON.optJSONArray("android_sdk_error_categories");
        C45848nj1.C26574a c26574a = C45848nj1.f100423h;
        C45848nj1 m23266a = c26574a.m23266a(optJSONArray);
        if (m23266a == null) {
            m23266a = c26574a.m23265b();
        }
        C45848nj1 c45848nj1 = m23266a;
        int optInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        if ((optInt & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((optInt & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((optInt & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((optInt & 256) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((optInt & 16384) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        JSONArray optJSONArray2 = settingsJSON.optJSONArray("auto_event_mapping_android");
        f25049g = optJSONArray2;
        if (optJSONArray2 != null && C50820w62.m7409b()) {
            if (optJSONArray2 != null) {
                str = optJSONArray2.toString();
            } else {
                str = null;
            }
            C43431je6.m30140b(str);
        }
        boolean optBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String optString = settingsJSON.optString("gdpv4_nux_content", "");
        Intrinsics.checkNotNullExpressionValue(optString, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = settingsJSON.optInt("app_events_session_timeout", C36509Uy0.m80579a());
        EnumSet<DF5> m110640a = DF5.f5447h.m110640a(settingsJSON.optLong("seamless_login"));
        Map<String, Map<String, C34512Mk1.C5353b>> m93519m = m93519m(settingsJSON.optJSONObject("android_dialog_configs"));
        String optString2 = settingsJSON.optString("smart_login_bookmark_icon_url");
        Intrinsics.checkNotNullExpressionValue(optString2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = settingsJSON.optString("smart_login_menu_icon_url");
        Intrinsics.checkNotNullExpressionValue(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = settingsJSON.optString("sdk_update_message");
        Intrinsics.checkNotNullExpressionValue(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        C34512Mk1 c34512Mk1 = new C34512Mk1(optBoolean, optString, optBoolean2, optInt2, m110640a, m93519m, z, c45848nj1, optString2, optString3, z2, z3, optJSONArray2, optString4, z4, z5, settingsJSON.optString("aam_rules"), settingsJSON.optString("suggested_events_setting"), settingsJSON.optString("restrictive_data_filter_params"));
        f25045c.put(applicationId, c34512Mk1);
        return c34512Mk1;
    }

    /* renamed from: m */
    public final Map<String, Map<String, C34512Mk1.C5353b>> m93519m(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(MessageExtension.FIELD_DATA)) != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                C34512Mk1.C5353b.C5354a c5354a = C34512Mk1.C5353b.f23467e;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "dialogConfigData.optJSONObject(i)");
                C34512Mk1.C5353b m94960a = c5354a.m94960a(optJSONObject);
                if (m94960a != null) {
                    String m94964a = m94960a.m94964a();
                    Map map = (Map) hashMap.get(m94964a);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(m94964a, map);
                    }
                    map.put(m94960a.m94962c(), m94960a);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: n */
    public final synchronized void m93518n() {
        EnumC5661a enumC5661a = f25046d.get();
        if (EnumC5661a.NOT_LOADED != enumC5661a && EnumC5661a.LOADING != enumC5661a) {
            C34512Mk1 c34512Mk1 = f25045c.get(C17216a.m52740f());
            Handler handler = new Handler(Looper.getMainLooper());
            if (EnumC5661a.ERROR == enumC5661a) {
                while (true) {
                    ConcurrentLinkedQueue<InterfaceC5662b> concurrentLinkedQueue = f25047e;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        handler.post(new RunnableC5664d(concurrentLinkedQueue.poll()));
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<InterfaceC5662b> concurrentLinkedQueue2 = f25047e;
                    if (!concurrentLinkedQueue2.isEmpty()) {
                        handler.post(new RunnableC5665e(concurrentLinkedQueue2.poll(), c34512Mk1));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
