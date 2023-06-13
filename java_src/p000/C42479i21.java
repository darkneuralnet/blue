package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: i21  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42479i21 {

    /* renamed from: c */
    public static final C10776ad f86307c = C10776ad.m71007e();

    /* renamed from: d */
    public static C42479i21 f86308d;

    /* renamed from: a */
    public volatile SharedPreferences f86309a;

    /* renamed from: b */
    public final ExecutorService f86310b;

    public C42479i21(ExecutorService executorService) {
        this.f86310b = executorService;
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: e */
    public static synchronized C42479i21 m35346e() {
        C42479i21 c42479i21;
        synchronized (C42479i21.class) {
            if (f86308d == null) {
                f86308d = new C42479i21(Executors.newSingleThreadExecutor());
            }
            c42479i21 = f86308d;
        }
        return c42479i21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m35343h(Context context) {
        if (this.f86309a == null && context != null) {
            this.f86309a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        }
    }

    /* renamed from: b */
    public C43628jy3<Boolean> m35349b(String str) {
        if (str == null) {
            f86307c.m71011a("Key is null when getting boolean value on device cache.");
            return C43628jy3.m29585a();
        }
        if (this.f86309a == null) {
            m35342i(m35347d());
            if (this.f86309a == null) {
                return C43628jy3.m29585a();
            }
        }
        if (!this.f86309a.contains(str)) {
            return C43628jy3.m29585a();
        }
        try {
            return C43628jy3.m29581e(Boolean.valueOf(this.f86309a.getBoolean(str, false)));
        } catch (ClassCastException e) {
            f86307c.m71010b("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return C43628jy3.m29585a();
        }
    }

    /* renamed from: c */
    public C43628jy3<Double> m35348c(String str) {
        if (str == null) {
            f86307c.m71011a("Key is null when getting double value on device cache.");
            return C43628jy3.m29585a();
        }
        if (this.f86309a == null) {
            m35342i(m35347d());
            if (this.f86309a == null) {
                return C43628jy3.m29585a();
            }
        }
        if (!this.f86309a.contains(str)) {
            return C43628jy3.m29585a();
        }
        try {
            try {
                return C43628jy3.m29581e(Double.valueOf(Double.longBitsToDouble(this.f86309a.getLong(str, 0L))));
            } catch (ClassCastException unused) {
                return C43628jy3.m29581e(Double.valueOf(Float.valueOf(this.f86309a.getFloat(str, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e) {
            f86307c.m71010b("Key %s from sharedPreferences has type other than double: %s", str, e.getMessage());
            return C43628jy3.m29585a();
        }
    }

    /* renamed from: d */
    public final Context m35347d() {
        try {
            C31722Am1.m115292k();
            return C31722Am1.m115292k().m115293j();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public C43628jy3<Long> m35345f(String str) {
        if (str == null) {
            f86307c.m71011a("Key is null when getting long value on device cache.");
            return C43628jy3.m29585a();
        }
        if (this.f86309a == null) {
            m35342i(m35347d());
            if (this.f86309a == null) {
                return C43628jy3.m29585a();
            }
        }
        if (!this.f86309a.contains(str)) {
            return C43628jy3.m29585a();
        }
        try {
            return C43628jy3.m29581e(Long.valueOf(this.f86309a.getLong(str, 0L)));
        } catch (ClassCastException e) {
            f86307c.m71010b("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return C43628jy3.m29585a();
        }
    }

    /* renamed from: g */
    public C43628jy3<String> m35344g(String str) {
        if (str == null) {
            f86307c.m71011a("Key is null when getting String value on device cache.");
            return C43628jy3.m29585a();
        }
        if (this.f86309a == null) {
            m35342i(m35347d());
            if (this.f86309a == null) {
                return C43628jy3.m29585a();
            }
        }
        if (!this.f86309a.contains(str)) {
            return C43628jy3.m29585a();
        }
        try {
            return C43628jy3.m29581e(this.f86309a.getString(str, ""));
        } catch (ClassCastException e) {
            f86307c.m71010b("Key %s from sharedPreferences has type other than String: %s", str, e.getMessage());
            return C43628jy3.m29585a();
        }
    }

    /* renamed from: i */
    public synchronized void m35342i(final Context context) {
        if (this.f86309a == null && context != null) {
            this.f86310b.execute(new Runnable() { // from class: h21
                @Override // java.lang.Runnable
                public final void run() {
                    C42479i21.this.m35343h(context);
                }
            });
        }
    }

    /* renamed from: j */
    public boolean m35341j(String str, double d) {
        if (str == null) {
            f86307c.m71011a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f86309a == null) {
            m35342i(m35347d());
            if (this.f86309a == null) {
                return false;
            }
        }
        this.f86309a.edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
        return true;
    }

    /* renamed from: k */
    public boolean m35340k(String str, long j) {
        if (str == null) {
            f86307c.m71011a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f86309a == null) {
            m35342i(m35347d());
            if (this.f86309a == null) {
                return false;
            }
        }
        this.f86309a.edit().putLong(str, j).apply();
        return true;
    }

    /* renamed from: l */
    public boolean m35339l(String str, String str2) {
        if (str == null) {
            f86307c.m71011a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f86309a == null) {
            m35342i(m35347d());
            if (this.f86309a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f86309a.edit().remove(str).apply();
            return true;
        }
        this.f86309a.edit().putString(str, str2).apply();
        return true;
    }

    /* renamed from: m */
    public boolean m35338m(String str, boolean z) {
        if (str == null) {
            f86307c.m71011a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f86309a == null) {
            m35342i(m35347d());
            if (this.f86309a == null) {
                return false;
            }
        }
        this.f86309a.edit().putBoolean(str, z).apply();
        return true;
    }
}
