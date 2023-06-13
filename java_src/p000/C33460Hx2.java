package p000;

import android.util.Log;
/* renamed from: Hx2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C33460Hx2 {

    /* renamed from: c */
    public static final C33460Hx2 f14209c = new C33460Hx2("FirebaseAppCheck");

    /* renamed from: a */
    public final String f14210a;

    /* renamed from: b */
    public int f14211b = 4;

    public C33460Hx2(String str) {
        this.f14210a = str;
    }

    /* renamed from: f */
    public static C33460Hx2 m103196f() {
        return f14209c;
    }

    /* renamed from: a */
    public final boolean m103201a(int i) {
        return this.f14211b <= i || Log.isLoggable(this.f14210a, i);
    }

    /* renamed from: b */
    public void m103200b(String str) {
        m103199c(str, null);
    }

    /* renamed from: c */
    public void m103199c(String str, Throwable th) {
        if (m103201a(3)) {
            Log.d(this.f14210a, str, th);
        }
    }

    /* renamed from: d */
    public void m103198d(String str) {
        m103197e(str, null);
    }

    /* renamed from: e */
    public void m103197e(String str, Throwable th) {
        if (m103201a(6)) {
            Log.e(this.f14210a, str, th);
        }
    }
}
