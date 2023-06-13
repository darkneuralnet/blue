package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.HashMap;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.C34278Lk1;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0011\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\u0010B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LCk1;", "", "LCk1$b;", "feature", "LCk1$a;", "callback", "", C17296a.f69688o, "", "g", "c", "", "className", DateTokenConverter.CONVERTER_KEY, "f", "e", "b", "", "", "Ljava/util/Map;", "featureMapping", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Ck1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32172Ck1 {

    /* renamed from: b */
    public static final C32172Ck1 f4590b = new C32172Ck1();

    /* renamed from: a */
    public static final Map<EnumC1165b, String[]> f4589a = new HashMap();

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LCk1$a;", "", "", "enabled", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Ck1$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC1164a {
        /* renamed from: a */
        void mo16504a(boolean z);
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\tj\u0002\b\u0004j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006)"}, m28432d2 = {"LCk1$b;", "", "", "toString", "c", "", "b", "I", PaymentMethodOptionsParams.Blik.PARAM_CODE, "()LCk1$b;", "parent", "<init>", "(Ljava/lang/String;II)V", "E", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Ck1$b */
    /* loaded from: classes5.dex */
    public enum EnumC1165b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(DateUtils.FORMAT_NUMERIC_DATE),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(ImageMetadata.EDGE_MODE),
        Login(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        Share(33554432),
        Places(50331648);
        

        /* renamed from: E */
        public static final C1166a f4595E = new C1166a(null);

        /* renamed from: b */
        public final int f4620b;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"LCk1$b$a;", "", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "LCk1$b;", C17296a.f69688o, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: Ck1$b$a */
        /* loaded from: classes5.dex */
        public static final class C1166a {
            private C1166a() {
            }

            /* renamed from: a */
            public final EnumC1165b m111750a(int i) {
                EnumC1165b[] values;
                for (EnumC1165b enumC1165b : EnumC1165b.values()) {
                    if (enumC1165b.f4620b == i) {
                        return enumC1165b;
                    }
                }
                return EnumC1165b.Unknown;
            }

            public /* synthetic */ C1166a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        EnumC1165b(int i) {
            this.f4620b = i;
        }

        /* renamed from: b */
        public final EnumC1165b m111752b() {
            int i = this.f4620b;
            if ((i & KotlinVersion.MAX_COMPONENT_VALUE) > 0) {
                return f4595E.m111750a(i & (-256));
            }
            if ((65280 & i) > 0) {
                return f4595E.m111750a(i & (-65536));
            }
            if ((16711680 & i) > 0) {
                return f4595E.m111750a(i & (-16777216));
            }
            return f4595E.m111750a(0);
        }

        /* renamed from: c */
        public final String m111751c() {
            return "FBSDKFeature" + this;
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (C32406Dk1.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "PrivacyProtection";
                case 13:
                    return "SuggestedEvents";
                case 14:
                    return "IntelligentIntegrity";
                case 15:
                    return "ModelRequest";
                case 16:
                    return "EventDeactivation";
                case 17:
                    return "OnDeviceEventProcessing";
                case 18:
                    return "OnDevicePostInstallEventProcessing";
                case 19:
                    return "IAPLogging";
                case 20:
                    return "IAPLoggingLib2";
                case 21:
                    return "Monitoring";
                case 22:
                    return "LoginKit";
                case 23:
                    return "ChromeCustomTabsPrefetching";
                case 24:
                    return "IgnoreAppSwitchToLoggedOut";
                case 25:
                    return "ShareKit";
                case 26:
                    return "PlacesKit";
                default:
                    return "unknown";
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"Ck1$c", "LLk1$a;", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Ck1$c */
    /* loaded from: classes5.dex */
    public static final class C1167c implements C34278Lk1.InterfaceC5074a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1164a f4621a;

        /* renamed from: b */
        public final /* synthetic */ EnumC1165b f4622b;

        public C1167c(InterfaceC1164a interfaceC1164a, EnumC1165b enumC1165b) {
            this.f4621a = interfaceC1164a;
            this.f4622b = enumC1165b;
        }

        @Override // p000.C34278Lk1.InterfaceC5074a
        /* renamed from: a */
        public void mo96383a() {
            this.f4621a.mo16504a(C32172Ck1.m111754g(this.f4622b));
        }
    }

    private C32172Ck1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m111760a(EnumC1165b feature, InterfaceC1164a callback) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C34278Lk1.m96387j(new C1167c(callback, feature));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m111758c(EnumC1165b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        C17216a.m52741e().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.m111751c(), C17216a.m52725u()).apply();
    }

    @JvmStatic
    /* renamed from: d */
    public static final EnumC1165b m111757d(String className) {
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(className, "className");
        f4590b.m111755f();
        for (Map.Entry<EnumC1165b, String[]> entry : f4589a.entrySet()) {
            EnumC1165b key = entry.getKey();
            for (String str : entry.getValue()) {
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(className, str, false, 2, null);
                if (startsWith$default) {
                    return key;
                }
            }
        }
        return EnumC1165b.Unknown;
    }

    @JvmStatic
    /* renamed from: g */
    public static final boolean m111754g(EnumC1165b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        if (EnumC1165b.Unknown == feature) {
            return false;
        }
        if (EnumC1165b.Core == feature) {
            return true;
        }
        String string = C17216a.m52741e().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.m111751c(), null);
        if (string != null && Intrinsics.areEqual(string, C17216a.m52725u())) {
            return false;
        }
        EnumC1165b m111752b = feature.m111752b();
        if (m111752b == feature) {
            return f4590b.m111756e(feature);
        }
        if (!m111754g(m111752b) || !f4590b.m111756e(feature)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m111759b(EnumC1165b enumC1165b) {
        switch (C32640Ek1.$EnumSwitchMapping$0[enumC1165b.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: e */
    public final boolean m111756e(EnumC1165b enumC1165b) {
        return C34278Lk1.m96391f(enumC1165b.m111751c(), C17216a.m52740f(), m111759b(enumC1165b));
    }

    /* renamed from: f */
    public final synchronized void m111755f() {
        Map<EnumC1165b, String[]> map = f4589a;
        if (!map.isEmpty()) {
            return;
        }
        map.put(EnumC1165b.AAM, new String[]{"com.facebook.appevents.aam."});
        map.put(EnumC1165b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
        map.put(EnumC1165b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
        map.put(EnumC1165b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
        map.put(EnumC1165b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
        map.put(EnumC1165b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
        map.put(EnumC1165b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
        map.put(EnumC1165b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
        map.put(EnumC1165b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
        map.put(EnumC1165b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
        map.put(EnumC1165b.IapLogging, new String[]{"com.facebook.appevents.iap."});
        map.put(EnumC1165b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
    }
}
