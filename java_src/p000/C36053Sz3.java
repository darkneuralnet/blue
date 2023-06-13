package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
/* renamed from: Sz3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36053Sz3 {

    /* renamed from: a */
    public final InterfaceC7626a f34592a;

    /* renamed from: Sz3$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7626a {
        /* renamed from: a */
        Surface mo64891a();

        /* renamed from: b */
        void mo64890b(Surface surface);

        /* renamed from: c */
        String mo64889c();

        /* renamed from: d */
        void mo64888d();

        /* renamed from: e */
        void mo64887e(long j);

        /* renamed from: f */
        void mo64886f(String str);

        /* renamed from: g */
        Object mo64885g();
    }

    public C36053Sz3(int i, Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f34592a = new C37800aA3(i, surface);
        } else if (i2 >= 28) {
            this.f34592a = new C37457Yz3(i, surface);
        } else if (i2 >= 26) {
            this.f34592a = new C36989Wz3(i, surface);
        } else {
            this.f34592a = new C36287Tz3(i, surface);
        }
    }

    /* renamed from: h */
    public static C36053Sz3 m84502h(Object obj) {
        InterfaceC7626a m82201i;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            m82201i = C37800aA3.m71808l((OutputConfiguration) obj);
        } else if (i >= 28) {
            m82201i = C37457Yz3.m73939k((OutputConfiguration) obj);
        } else if (i >= 26) {
            m82201i = C36989Wz3.m77585j((OutputConfiguration) obj);
        } else {
            m82201i = C36287Tz3.m82201i((OutputConfiguration) obj);
        }
        if (m82201i == null) {
            return null;
        }
        return new C36053Sz3(m82201i);
    }

    /* renamed from: a */
    public void m84509a(Surface surface) {
        this.f34592a.mo64890b(surface);
    }

    /* renamed from: b */
    public void m84508b() {
        this.f34592a.mo64888d();
    }

    /* renamed from: c */
    public String m84507c() {
        return this.f34592a.mo64889c();
    }

    /* renamed from: d */
    public Surface m84506d() {
        return this.f34592a.mo64891a();
    }

    /* renamed from: e */
    public void m84505e(String str) {
        this.f34592a.mo64886f(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C36053Sz3)) {
            return false;
        }
        return this.f34592a.equals(((C36053Sz3) obj).f34592a);
    }

    /* renamed from: f */
    public void m84504f(long j) {
        this.f34592a.mo64887e(j);
    }

    /* renamed from: g */
    public Object m84503g() {
        return this.f34592a.mo64885g();
    }

    public int hashCode() {
        return this.f34592a.hashCode();
    }

    public C36053Sz3(InterfaceC7626a interfaceC7626a) {
        this.f34592a = interfaceC7626a;
    }
}
