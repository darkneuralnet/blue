package p000;

import android.os.SystemClock;
/* renamed from: Gn7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33141Gn7 {

    /* renamed from: a */
    public final C44516lT8 f12461a;

    /* renamed from: b */
    public final C44516lT8 f12462b;

    /* renamed from: c */
    public final C44516lT8 f12463c;

    /* renamed from: d */
    public final String f12464d;

    /* renamed from: e */
    public final az9 f12465e;

    /* renamed from: f */
    public long f12466f;

    /* renamed from: g */
    public long f12467g;

    /* renamed from: h */
    public final C32907Fn7 f12468h;

    public C33141Gn7(String str, int i) {
        C32907Fn7 c32907Fn7 = new C32907Fn7(null);
        this.f12461a = new C44516lT8();
        this.f12462b = new C44516lT8();
        this.f12463c = new C44516lT8();
        this.f12464d = "com.google.perception";
        this.f12465e = az9.NNAPI;
        this.f12468h = c32907Fn7;
    }

    /* renamed from: a */
    public final Zy9 m104719a() {
        boolean z;
        boolean z2 = true;
        if (this.f12466f != 0) {
            z = true;
        } else {
            z = false;
        }
        DQ8.m110465f(z);
        if (this.f12467g == 0) {
            z2 = false;
        }
        DQ8.m110465f(z2);
        long j = this.f12467g;
        long j2 = this.f12466f;
        Zy9 zy9 = new Zy9();
        zy9.m72152e(Long.valueOf(j - j2));
        zy9.m72150g(this.f12464d);
        zy9.m72153d(this.f12465e);
        zy9.m72148i(this.f12461a.m27249d());
        zy9.m72149h(this.f12462b.m27249d());
        zy9.m72151f(this.f12463c.m27249d());
        return zy9;
    }

    /* renamed from: b */
    public final void m104718b(bz9 bz9Var) {
        this.f12463c.m27250c(bz9Var);
    }

    /* renamed from: c */
    public final void m104717c(bz9 bz9Var) {
        this.f12462b.m27250c(bz9Var);
    }

    /* renamed from: d */
    public final void m104716d(bz9 bz9Var) {
        this.f12461a.m27250c(bz9Var);
    }

    /* renamed from: e */
    public final void m104715e() {
        boolean z;
        if (this.f12467g == 0) {
            z = true;
        } else {
            z = false;
        }
        DQ8.m110464g(z, "Method endTiming is not supposed to be called more than once.");
        this.f12467g = SystemClock.elapsedRealtime();
    }

    /* renamed from: f */
    public final void m104714f() {
        boolean z;
        if (this.f12466f == 0) {
            z = true;
        } else {
            z = false;
        }
        DQ8.m110464g(z, "Method startTiming is not supposed to be called more than once.");
        this.f12466f = SystemClock.elapsedRealtime();
    }
}
