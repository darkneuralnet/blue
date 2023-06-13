package p000;

import p000.C49998uj1;
/* renamed from: jx2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43617jx2<Z> implements VL4<Z>, C49998uj1.InterfaceC29291f {

    /* renamed from: f */
    public static final InterfaceC41591gY3<C43617jx2<?>> f93596f = C49998uj1.m9835d(20, new C25049a());

    /* renamed from: b */
    public final LP5 f93597b = LP5.m96961a();

    /* renamed from: c */
    public VL4<Z> f93598c;

    /* renamed from: d */
    public boolean f93599d;

    /* renamed from: e */
    public boolean f93600e;

    /* renamed from: jx2$a */
    /* loaded from: classes5.dex */
    public class C25049a implements C49998uj1.InterfaceC29289d<C43617jx2<?>> {
        @Override // p000.C49998uj1.InterfaceC29289d
        /* renamed from: a */
        public C43617jx2<?> create() {
            return new C43617jx2<>();
        }
    }

    /* renamed from: f */
    public static <Z> C43617jx2<Z> m29676f(VL4<Z> vl4) {
        C43617jx2<Z> c43617jx2 = (C43617jx2) C52865zZ3.m1111d(f93596f.mo9830a());
        c43617jx2.m29677c(vl4);
        return c43617jx2;
    }

    @Override // p000.VL4
    /* renamed from: a */
    public int mo5713a() {
        return this.f93598c.mo5713a();
    }

    @Override // p000.VL4
    /* renamed from: b */
    public synchronized void mo5712b() {
        this.f93597b.mo96959c();
        this.f93600e = true;
        if (!this.f93599d) {
            this.f93598c.mo5712b();
            m29675g();
        }
    }

    /* renamed from: c */
    public final void m29677c(VL4<Z> vl4) {
        this.f93600e = false;
        this.f93599d = true;
        this.f93598c = vl4;
    }

    @Override // p000.VL4
    /* renamed from: d */
    public Class<Z> mo5710d() {
        return this.f93598c.mo5710d();
    }

    @Override // p000.C49998uj1.InterfaceC29291f
    /* renamed from: e */
    public LP5 mo9828e() {
        return this.f93597b;
    }

    /* renamed from: g */
    public final void m29675g() {
        this.f93598c = null;
        f93596f.mo9829b(this);
    }

    @Override // p000.VL4
    public Z get() {
        return this.f93598c.get();
    }

    /* renamed from: h */
    public synchronized void m29674h() {
        this.f93597b.mo96959c();
        if (this.f93599d) {
            this.f93599d = false;
            if (this.f93600e) {
                mo5712b();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
