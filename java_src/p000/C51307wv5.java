package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.spi.ComponentTracker;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import p000.C32992Fx2;
import p000.C9459Xi;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J$\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u0013\u001a\u00020\tH\u0002R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Lwv5;", "", "", "activityName", "LBN5;", "sourceApplicationInfo", "appId", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "c", "Lvv5;", "sessionInfo", "e", "", "timeBetweenSessions", "", "b", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "TAG", "", "[J", "INACTIVE_SECONDS_QUANTA", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: wv5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51307wv5 {

    /* renamed from: c */
    public static final C51307wv5 f116831c = new C51307wv5();

    /* renamed from: a */
    public static final String f116829a = C51307wv5.class.getCanonicalName();

    /* renamed from: b */
    public static final long[] f116830b = {300000, 900000, ComponentTracker.DEFAULT_TIMEOUT, CoreConstants.MILLIS_IN_ONE_HOUR, 21600000, 43200000, CoreConstants.MILLIS_IN_ONE_DAY, 172800000, 259200000, CoreConstants.MILLIS_IN_ONE_WEEK, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private C51307wv5() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final int m6100b(long j) {
        if (TD0.m84203d(C51307wv5.class)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = f116830b;
                if (i >= jArr.length || jArr[i] >= j) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                TD0.m84205b(th, C51307wv5.class);
                return 0;
            }
        }
        return i;
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m6099c(String activityName, BN5 bn5, String str, Context context) {
        String str2;
        if (TD0.m84203d(C51307wv5.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(context, "context");
            if (bn5 == null || (str2 = bn5.toString()) == null) {
                str2 = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", str2);
            bundle.putString("fb_mobile_pckg_fp", f116831c.m6101a(context));
            bundle.putString("fb_mobile_app_cert_hash", C36347Ug0.m81198a(context));
            C45485n62 c45485n62 = new C45485n62(activityName, str, null);
            c45485n62.m24341e("fb_mobile_activate_app", bundle);
            if (C45485n62.f99442b.m24332b() != C9459Xi.EnumC9460a.EXPLICIT_ONLY) {
                c45485n62.m24345a();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C51307wv5.class);
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m6097e(String activityName, C50714vv5 c50714vv5, String str) {
        long j;
        long j2;
        String str2;
        if (TD0.m84203d(C51307wv5.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            if (c50714vv5 == null) {
                return;
            }
            Long m7756b = c50714vv5.m7756b();
            long j3 = 0;
            if (m7756b != null) {
                j2 = m7756b.longValue();
            } else {
                Long m7753e = c50714vv5.m7753e();
                if (m7753e != null) {
                    j = m7753e.longValue();
                } else {
                    j = 0;
                }
                j2 = 0 - j;
            }
            if (j2 < 0) {
                f116831c.m6098d();
                j2 = 0;
            }
            long m7752f = c50714vv5.m7752f();
            if (m7752f < 0) {
                f116831c.m6098d();
                m7752f = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", c50714vv5.m7755c());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(m6100b(j2))}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", format);
            BN5 m7751g = c50714vv5.m7751g();
            if (m7751g == null || (str2 = m7751g.toString()) == null) {
                str2 = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", str2);
            Long m7753e2 = c50714vv5.m7753e();
            if (m7753e2 != null) {
                j3 = m7753e2.longValue();
            }
            bundle.putLong("_logTime", j3 / 1000);
            new C45485n62(activityName, str, null).m24342d("fb_mobile_deactivate_app", m7752f / 1000, bundle);
        } catch (Throwable th) {
            TD0.m84205b(th, C51307wv5.class);
        }
    }

    /* renamed from: a */
    public final String m6101a(Context context) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                PackageManager packageManager = context.getPackageManager();
                String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                String string = sharedPreferences.getString(str, null);
                if (string != null && string.length() == 32) {
                    return string;
                }
                String m8942c = C50329vH1.m8942c(context, null);
                if (m8942c == null) {
                    m8942c = C50329vH1.m8943b(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
                }
                sharedPreferences.edit().putString(str, m8942c).apply();
                return m8942c;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final void m6098d() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
            EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.APP_EVENTS;
            String str = f116829a;
            Intrinsics.checkNotNull(str);
            c2516a.m106214c(enumC36034Sx2, str, "Clock skew detected");
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
