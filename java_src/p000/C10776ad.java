package p000;

import java.util.Locale;
/* renamed from: ad */
/* loaded from: classes6.dex */
public class C10776ad {

    /* renamed from: c */
    public static volatile C10776ad f50826c;

    /* renamed from: a */
    public final C50731vx2 f50827a;

    /* renamed from: b */
    public boolean f50828b;

    public C10776ad(C50731vx2 c50731vx2) {
        this.f50828b = false;
        this.f50827a = c50731vx2 == null ? C50731vx2.m7714c() : c50731vx2;
    }

    /* renamed from: e */
    public static C10776ad m71007e() {
        if (f50826c == null) {
            synchronized (C10776ad.class) {
                if (f50826c == null) {
                    f50826c = new C10776ad();
                }
            }
        }
        return f50826c;
    }

    /* renamed from: a */
    public void m71011a(String str) {
        if (this.f50828b) {
            this.f50827a.m7716a(str);
        }
    }

    /* renamed from: b */
    public void m71010b(String str, Object... objArr) {
        if (this.f50828b) {
            this.f50827a.m7716a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: c */
    public void m71009c(String str) {
        if (this.f50828b) {
            this.f50827a.m7715b(str);
        }
    }

    /* renamed from: d */
    public void m71008d(String str, Object... objArr) {
        if (this.f50828b) {
            this.f50827a.m7715b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: f */
    public void m71006f(String str) {
        if (this.f50828b) {
            this.f50827a.m7713d(str);
        }
    }

    /* renamed from: g */
    public void m71005g(String str, Object... objArr) {
        if (this.f50828b) {
            this.f50827a.m7713d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: h */
    public boolean m71004h() {
        return this.f50828b;
    }

    /* renamed from: i */
    public void m71003i(boolean z) {
        this.f50828b = z;
    }

    /* renamed from: j */
    public void m71002j(String str) {
        if (this.f50828b) {
            this.f50827a.m7712e(str);
        }
    }

    /* renamed from: k */
    public void m71001k(String str, Object... objArr) {
        if (this.f50828b) {
            this.f50827a.m7712e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private C10776ad() {
        this(null);
    }
}
