package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: Jd1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C33747Jd1<Z> implements VL4<Z> {

    /* renamed from: b */
    public final boolean f17907b;

    /* renamed from: c */
    public final boolean f17908c;

    /* renamed from: d */
    public final VL4<Z> f17909d;

    /* renamed from: e */
    public final InterfaceC4169a f17910e;

    /* renamed from: f */
    public final InterfaceC38133ak2 f17911f;

    /* renamed from: g */
    public int f17912g;

    /* renamed from: h */
    public boolean f17913h;

    /* renamed from: Jd1$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC4169a {
        /* renamed from: a */
        void mo100101a(InterfaceC38133ak2 interfaceC38133ak2, C33747Jd1<?> c33747Jd1);
    }

    public C33747Jd1(VL4<Z> vl4, boolean z, boolean z2, InterfaceC38133ak2 interfaceC38133ak2, InterfaceC4169a interfaceC4169a) {
        this.f17909d = (VL4) C52865zZ3.m1111d(vl4);
        this.f17907b = z;
        this.f17908c = z2;
        this.f17911f = interfaceC38133ak2;
        this.f17910e = (InterfaceC4169a) C52865zZ3.m1111d(interfaceC4169a);
    }

    @Override // p000.VL4
    /* renamed from: a */
    public int mo5713a() {
        return this.f17909d.mo5713a();
    }

    @Override // p000.VL4
    /* renamed from: b */
    public synchronized void mo5712b() {
        if (this.f17912g <= 0) {
            if (!this.f17913h) {
                this.f17913h = true;
                if (this.f17908c) {
                    this.f17909d.mo5712b();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    /* renamed from: c */
    public synchronized void m100105c() {
        if (!this.f17913h) {
            this.f17912g++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // p000.VL4
    /* renamed from: d */
    public Class<Z> mo5710d() {
        return this.f17909d.mo5710d();
    }

    /* renamed from: e */
    public VL4<Z> m100104e() {
        return this.f17909d;
    }

    /* renamed from: f */
    public boolean m100103f() {
        return this.f17907b;
    }

    /* renamed from: g */
    public void m100102g() {
        boolean z;
        synchronized (this) {
            int i = this.f17912g;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f17912g = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f17910e.mo100101a(this.f17911f, this);
        }
    }

    @Override // p000.VL4
    public Z get() {
        return this.f17909d.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f17907b + ", listener=" + this.f17910e + ", key=" + this.f17911f + ", acquired=" + this.f17912g + ", isRecycled=" + this.f17913h + ", resource=" + this.f17909d + CoreConstants.CURLY_RIGHT;
    }
}
