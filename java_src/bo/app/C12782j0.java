package bo.app;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import bo.app.C12697h0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0007R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010R\u0013\u0010#\u001a\u0004\u0018\u00010\t8G¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006."}, m28432d2 = {"Lbo/app/j0;", "Lbo/app/c2;", "", "k", "l", "Ljava/util/Locale;", "m", "Ljava/util/TimeZone;", "n", "", "j", "i", "f", "hostAppVersion", "Ljava/lang/String;", "c", "()Ljava/lang/String;", C17296a.f69688o, "hostAppSemanticVersionCode", "Lbo/app/h0;", DateTokenConverter.CONVERTER_KEY, "()Lbo/app/h0;", "device", "b", "dirtyDevice", "getDeviceId", "deviceId", "Landroid/content/pm/PackageInfo;", "g", "()Landroid/content/pm/PackageInfo;", "packageInfo", "e", "googleAdvertisingId", "h", "()Ljava/lang/Boolean;", "isAdTrackingEnabled", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LX10;", "configurationProvider", "Lbo/app/d2;", "deviceIdProvider", "Lbo/app/i0;", "deviceCache", "<init>", "(Landroid/content/Context;LX10;Lbo/app/d2;Lbo/app/i0;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.j0 */
/* loaded from: classes.dex */
public final class C12782j0 implements InterfaceC12565c2 {

    /* renamed from: g */
    public static final C12783a f58707g = new C12783a(null);

    /* renamed from: a */
    private Context f58708a;

    /* renamed from: b */
    private final X10 f58709b;

    /* renamed from: c */
    private final InterfaceC12579d2 f58710c;

    /* renamed from: d */
    private final C12731i0 f58711d;

    /* renamed from: e */
    private final String f58712e;

    /* renamed from: f */
    public final SharedPreferences f58713f;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, m28432d2 = {"Lbo/app/j0$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isRotated", "", C17296a.f69688o, "Ljava/util/Locale;", "locale", "STORAGE_AD_TRACKING_ENABLED", "Ljava/lang/String;", "STORAGE_FILENAME", "STORAGE_GOOGLE_ADVERTISING_ID_KEY", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j0$a */
    /* loaded from: classes.dex */
    public static final class C12783a {
        public /* synthetic */ C12783a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final String m63496a(Context context, boolean z) {
            int i;
            int i2;
            WindowMetrics currentWindowMetrics;
            Rect bounds;
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("window");
            if (systemService != null) {
                WindowManager windowManager = (WindowManager) systemService;
                if (Build.VERSION.SDK_INT >= 30) {
                    currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                    bounds = currentWindowMetrics.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "windowManager.currentWindowMetrics.bounds");
                    i = bounds.width();
                    i2 = bounds.height();
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    int i3 = displayMetrics.widthPixels;
                    int i4 = displayMetrics.heightPixels;
                    i = i3;
                    i2 = i4;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append('x');
                    sb.append(i);
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                sb2.append('x');
                sb2.append(i2);
                return sb2.toString();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }

        private C12783a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final String m63495a(Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            String locale2 = locale.toString();
            Intrinsics.checkNotNullExpressionValue(locale2, "locale.toString()");
            return locale2;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j0$c */
    /* loaded from: classes.dex */
    public static final class C12784c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12784c f58714b = new C12784c();

        public C12784c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "App version code could not be read. Returning null";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j0$d */
    /* loaded from: classes.dex */
    public static final class C12785d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12785d f58715b = new C12785d();

        public C12785d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to collect background restriction information from Activity Manager";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j0$e */
    /* loaded from: classes.dex */
    public static final class C12786e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58716b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12786e(String str) {
            super(0);
            this.f58716b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Unable to inspect package [" + ((Object) this.f58716b) + ']';
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j0$f */
    /* loaded from: classes.dex */
    public static final class C12787f extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12787f f58717b = new C12787f();

        public C12787f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception while reading the phone carrier name.";
        }
    }

    public C12782j0(Context context, X10 configurationProvider, InterfaceC12579d2 deviceIdProvider, C12731i0 deviceCache) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
        this.f58708a = context;
        this.f58709b = configurationProvider;
        this.f58710c = deviceIdProvider;
        this.f58711d = deviceCache;
        PackageInfo m63504g = m63504g();
        if (m63504g == null) {
            str = null;
        } else {
            str = m63504g.versionName;
        }
        this.f58712e = str;
        this.f58713f = this.f58708a.getSharedPreferences("com.appboy.managers.device_data_provider", 0);
    }

    /* renamed from: i */
    private final boolean m63502i() {
        boolean isBackgroundRestricted;
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            Object systemService = this.f58708a.getSystemService("activity");
            if (systemService != null) {
                isBackgroundRestricted = ((ActivityManager) systemService).isBackgroundRestricted();
                return isBackgroundRestricted;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12785d.f58715b, 4, null);
            return false;
        }
    }

    /* renamed from: j */
    private final boolean m63501j() {
        return this.f58708a.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: k */
    private final String m63500k() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    /* renamed from: l */
    private final String m63499l() {
        try {
            Object systemService = this.f58708a.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
            if (systemService != null) {
                return ((TelephonyManager) systemService).getNetworkOperatorName();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12787f.f58717b, 4, null);
            return null;
        }
    }

    /* renamed from: m */
    private final Locale m63498m() {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return locale;
    }

    /* renamed from: n */
    private final TimeZone m63497n() {
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault()");
        return timeZone;
    }

    @Override // bo.app.InterfaceC12565c2
    /* renamed from: a */
    public String mo63510a() {
        long m100948a;
        PackageInfo m63504g = m63504g();
        if (m63504g != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                m100948a = m63504g.getLongVersionCode();
            } else {
                m100948a = JD3.m100948a(m63504g);
            }
            return m100948a + ".0.0.0";
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12784c.f58714b, 7, null);
        return null;
    }

    @Override // bo.app.InterfaceC12565c2
    /* renamed from: b */
    public C12697h0 mo63509b() {
        this.f58711d.m63604a(m63507d());
        return this.f58711d.m63972a();
    }

    @Override // bo.app.InterfaceC12565c2
    /* renamed from: c */
    public String mo63508c() {
        return this.f58712e;
    }

    /* renamed from: d */
    public C12697h0 m63507d() {
        C12697h0.C12698a m63642e = new C12697h0.C12698a(this.f58709b).m63648a(m63500k()).m63646b(m63499l()).m63642e(Build.MODEL);
        C12783a c12783a = f58707g;
        return m63642e.m63643d(c12783a.m63495a(m63498m())).m63640g(m63497n().getID()).m63641f(c12783a.m63496a(this.f58708a, m63501j())).m63645c(Boolean.valueOf(m63505f())).m63647b(Boolean.valueOf(m63502i())).m63644c(m63506e()).m63649a(m63503h()).m63650a();
    }

    /* renamed from: e */
    public final String m63506e() {
        return this.f58713f.getString("google_ad_id", null);
    }

    /* renamed from: f */
    public final boolean m63505f() {
        Object systemService = this.f58708a.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        if (systemService != null) {
            return ((NotificationManager) systemService).areNotificationsEnabled();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    /* renamed from: g */
    public final PackageInfo m63504g() {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageArchiveInfo;
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        String packageName = this.f58708a.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.f58708a.getPackageManager();
                of2 = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of2);
                return packageInfo;
            }
            return this.f58708a.getPackageManager().getPackageInfo(packageName, 0);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C12786e(packageName), 4, null);
            ApplicationInfo applicationInfo = this.f58708a.getApplicationInfo();
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager2 = this.f58708a.getPackageManager();
                String str = applicationInfo.sourceDir;
                of = PackageManager.PackageInfoFlags.of(0L);
                packageArchiveInfo = packageManager2.getPackageArchiveInfo(str, of);
                return packageArchiveInfo;
            }
            return this.f58708a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
        }
    }

    @Override // bo.app.InterfaceC12565c2
    public String getDeviceId() {
        return this.f58710c.getDeviceId();
    }

    /* renamed from: h */
    public final Boolean m63503h() {
        if (!this.f58713f.contains("ad_tracking_enabled")) {
            return null;
        }
        return Boolean.valueOf(this.f58713f.getBoolean("ad_tracking_enabled", true));
    }
}
