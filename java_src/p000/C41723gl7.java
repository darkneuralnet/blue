package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
/* renamed from: gl7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41723gl7 extends C45945ns8 {

    /* renamed from: b */
    public Boolean f84203b;

    /* renamed from: c */
    public InterfaceC44085kk7 f84204c;

    /* renamed from: d */
    public Boolean f84205d;

    public C41723gl7(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        this.f84204c = C47040pj7.f103990a;
    }

    /* renamed from: I */
    public static final long m37522I() {
        return ((Long) C37795a98.f49969f.m97658a(null)).longValue();
    }

    /* renamed from: f */
    public static final long m37521f() {
        return ((Long) C37795a98.f49933F.m97658a(null)).longValue();
    }

    /* renamed from: B */
    public final boolean m37528B(String str) {
        return "1".equals(this.f84204c.mo18891b(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean m37527D() {
        Boolean m37510q = m37510q("google_analytics_automatic_screen_reporting_enabled");
        if (m37510q != null && !m37510q.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final boolean m37526E() {
        this.f100966a.mo22259C();
        Boolean m37510q = m37510q("firebase_analytics_collection_deactivated");
        if (m37510q != null && m37510q.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean m37525F(String str) {
        return "1".equals(this.f84204c.mo18891b(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: G */
    public final boolean m37524G() {
        if (this.f84203b == null) {
            Boolean m37510q = m37510q("app_measurement_lite");
            this.f84203b = m37510q;
            if (m37510q == null) {
                this.f84203b = Boolean.FALSE;
            }
        }
        if (!this.f84203b.booleanValue() && this.f100966a.m89758p()) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m37523H() {
        if (this.f84205d == null) {
            synchronized (this) {
                if (this.f84205d == null) {
                    ApplicationInfo applicationInfo = this.f100966a.mo22255z().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(myProcessName)) {
                            z = true;
                        }
                        this.f84205d = Boolean.valueOf(z);
                    }
                    if (this.f84205d == null) {
                        this.f84205d = Boolean.TRUE;
                        this.f100966a.mo22258a().m106893o().m42708a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f84205d.booleanValue();
    }

    /* renamed from: g */
    public final String m37520g(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.f100966a.mo22258a().m106893o().m42707b("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            this.f100966a.mo22258a().m106893o().m42707b("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            this.f100966a.mo22258a().m106893o().m42707b("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.f100966a.mo22258a().m106893o().m42707b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: h */
    public final double m37519h(String str, L88 l88) {
        if (str == null) {
            return ((Double) l88.m97658a(null)).doubleValue();
        }
        String mo18891b = this.f84204c.mo18891b(str, l88.m97657b());
        if (TextUtils.isEmpty(mo18891b)) {
            return ((Double) l88.m97658a(null)).doubleValue();
        }
        try {
            return ((Double) l88.m97658a(Double.valueOf(Double.parseDouble(mo18891b)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) l88.m97658a(null)).doubleValue();
        }
    }

    /* renamed from: i */
    public final int m37518i(String str) {
        return m37514m(str, C37795a98.f49941J, 500, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
    }

    /* renamed from: j */
    public final int m37517j() {
        if (this.f100966a.m89776N().m92081X(201500000, true)) {
            return 100;
        }
        return 25;
    }

    /* renamed from: k */
    public final int m37516k(String str) {
        return m37514m(str, C37795a98.f49943K, 25, 100);
    }

    /* renamed from: l */
    public final int m37515l(String str, L88 l88) {
        if (str == null) {
            return ((Integer) l88.m97658a(null)).intValue();
        }
        String mo18891b = this.f84204c.mo18891b(str, l88.m97657b());
        if (TextUtils.isEmpty(mo18891b)) {
            return ((Integer) l88.m97658a(null)).intValue();
        }
        try {
            return ((Integer) l88.m97658a(Integer.valueOf(Integer.parseInt(mo18891b)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) l88.m97658a(null)).intValue();
        }
    }

    /* renamed from: m */
    public final int m37514m(String str, L88 l88, int i, int i2) {
        return Math.max(Math.min(m37515l(str, l88), i2), i);
    }

    /* renamed from: n */
    public final long m37513n() {
        this.f100966a.mo22259C();
        return 77000L;
    }

    /* renamed from: o */
    public final long m37512o(String str, L88 l88) {
        if (str == null) {
            return ((Long) l88.m97658a(null)).longValue();
        }
        String mo18891b = this.f84204c.mo18891b(str, l88.m97657b());
        if (TextUtils.isEmpty(mo18891b)) {
            return ((Long) l88.m97658a(null)).longValue();
        }
        try {
            return ((Long) l88.m97658a(Long.valueOf(Long.parseLong(mo18891b)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) l88.m97658a(null)).longValue();
        }
    }

    @VisibleForTesting
    /* renamed from: p */
    public final Bundle m37511p() {
        try {
            if (this.f100966a.mo22255z().getPackageManager() == null) {
                this.f100966a.mo22258a().m106893o().m42708a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.f100966a.mo22255z()).getApplicationInfo(this.f100966a.mo22255z().getPackageName(), 128);
            if (applicationInfo == null) {
                this.f100966a.mo22258a().m106893o().m42708a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            this.f100966a.mo22258a().m106893o().m42707b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: q */
    public final Boolean m37510q(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle m37511p = m37511p();
        if (m37511p == null) {
            this.f100966a.mo22258a().m106893o().m42708a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!m37511p.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(m37511p.getBoolean(str));
        }
    }

    /* renamed from: r */
    public final String m37509r() {
        return m37520g("debug.firebase.analytics.app", "");
    }

    /* renamed from: s */
    public final String m37508s() {
        return m37520g("debug.deferred.deeplink", "");
    }

    /* renamed from: t */
    public final String m37507t() {
        this.f100966a.mo22259C();
        return "FA";
    }

    /* renamed from: u */
    public final String m37506u(String str, L88 l88) {
        if (str == null) {
            return (String) l88.m97658a(null);
        }
        return (String) l88.m97658a(this.f84204c.mo18891b(str, l88.m97657b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @VisibleForTesting
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m37505v(String str) {
        Integer valueOf;
        Preconditions.checkNotEmpty("analytics.safelisted_events");
        Bundle m37511p = m37511p();
        if (m37511p == null) {
            this.f100966a.mo22258a().m106893o().m42708a("Failed to load metadata: Metadata bundle is null");
        } else if (m37511p.containsKey("analytics.safelisted_events")) {
            valueOf = Integer.valueOf(m37511p.getInt("analytics.safelisted_events"));
            if (valueOf != null) {
                try {
                    String[] stringArray = this.f100966a.mo22255z().getResources().getStringArray(valueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e) {
                    this.f100966a.mo22258a().m106893o().m42707b("Failed to load string array from metadata: resource not found", e);
                }
            }
            return null;
        }
        valueOf = null;
        if (valueOf != null) {
        }
        return null;
    }

    /* renamed from: w */
    public final void m37504w(InterfaceC44085kk7 interfaceC44085kk7) {
        this.f84204c = interfaceC44085kk7;
    }

    /* renamed from: x */
    public final boolean m37503x() {
        Boolean m37510q = m37510q("google_analytics_adid_collection_enabled");
        if (m37510q != null && !m37510q.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m37502y(String str, L88 l88) {
        if (str == null) {
            return ((Boolean) l88.m97658a(null)).booleanValue();
        }
        String mo18891b = this.f84204c.mo18891b(str, l88.m97657b());
        if (TextUtils.isEmpty(mo18891b)) {
            return ((Boolean) l88.m97658a(null)).booleanValue();
        }
        return ((Boolean) l88.m97658a(Boolean.valueOf("1".equals(mo18891b)))).booleanValue();
    }
}
