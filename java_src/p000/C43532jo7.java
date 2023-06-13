package p000;

import android.os.SystemClock;
/* renamed from: jo7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43532jo7 {

    /* renamed from: a */
    public long f93383a;

    /* renamed from: b */
    public long f93384b;

    /* renamed from: c */
    public final C44516lT8 f93385c = new C44516lT8();

    /* renamed from: d */
    public final C44516lT8 f93386d = new C44516lT8();

    /* renamed from: e */
    public final C44516lT8 f93387e = new C44516lT8();

    /* renamed from: f */
    public int f93388f;

    /* renamed from: a */
    public final C52405ym7 m29893a() {
        boolean z;
        boolean z2 = true;
        if (this.f93383a != 0) {
            z = true;
        } else {
            z = false;
        }
        DQ8.m110465f(z);
        if (this.f93384b == 0) {
            z2 = false;
        }
        DQ8.m110465f(z2);
        long j = this.f93384b;
        long j2 = this.f93383a;
        C52405ym7 c52405ym7 = new C52405ym7();
        c52405ym7.m2599d(Long.valueOf(j - j2));
        c52405ym7.m2595h(this.f93385c.m27249d());
        c52405ym7.m2596g(this.f93386d.m27249d());
        c52405ym7.m2598e(this.f93387e.m27249d());
        int i = this.f93388f;
        if (i != 0) {
            c52405ym7.m2597f(Integer.valueOf(i));
        }
        return c52405ym7;
    }

    /* renamed from: b */
    public final void m29892b(EnumC52998zm7 enumC52998zm7) {
        this.f93387e.m27250c(enumC52998zm7);
    }

    /* renamed from: c */
    public final void m29891c(EnumC52998zm7 enumC52998zm7) {
        this.f93386d.m27250c(enumC52998zm7);
    }

    /* renamed from: d */
    public final void m29890d(EnumC52998zm7 enumC52998zm7) {
        this.f93385c.m27250c(enumC52998zm7);
    }

    /* renamed from: e */
    public final void m29889e() {
        this.f93384b = SystemClock.elapsedRealtime();
    }

    /* renamed from: f */
    public final void m29888f(int i) {
        this.f93388f = i;
    }

    /* renamed from: g */
    public final void m29887g() {
        this.f93383a = SystemClock.elapsedRealtime();
    }
}
