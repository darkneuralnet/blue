package p000;

import p000.InterfaceC41597gZ0;
/* renamed from: qy3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47779qy3<T> implements X94<T>, InterfaceC41597gZ0<T> {

    /* renamed from: c */
    public static final InterfaceC41597gZ0.InterfaceC20924a<Object> f106137c = new InterfaceC41597gZ0.InterfaceC20924a() { // from class: ny3
        @Override // p000.InterfaceC41597gZ0.InterfaceC20924a
        /* renamed from: a */
        public final void mo18368a(X94 x94) {
            C47779qy3.m16719f(x94);
        }
    };

    /* renamed from: d */
    public static final X94<Object> f106138d = new X94() { // from class: oy3
        @Override // p000.X94
        public final Object get() {
            Object m16718g;
            m16718g = C47779qy3.m16718g();
            return m16718g;
        }
    };

    /* renamed from: a */
    public InterfaceC41597gZ0.InterfaceC20924a<T> f106139a;

    /* renamed from: b */
    public volatile X94<T> f106140b;

    public C47779qy3(InterfaceC41597gZ0.InterfaceC20924a<T> interfaceC20924a, X94<T> x94) {
        this.f106139a = interfaceC20924a;
        this.f106140b = x94;
    }

    /* renamed from: e */
    public static <T> C47779qy3<T> m16720e() {
        return new C47779qy3<>(f106137c, f106138d);
    }

    /* renamed from: f */
    public static /* synthetic */ void m16719f(X94 x94) {
    }

    /* renamed from: g */
    public static /* synthetic */ Object m16718g() {
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ void m16717h(InterfaceC41597gZ0.InterfaceC20924a interfaceC20924a, InterfaceC41597gZ0.InterfaceC20924a interfaceC20924a2, X94 x94) {
        interfaceC20924a.mo18368a(x94);
        interfaceC20924a2.mo18368a(x94);
    }

    /* renamed from: i */
    public static <T> C47779qy3<T> m16716i(X94<T> x94) {
        return new C47779qy3<>(null, x94);
    }

    @Override // p000.InterfaceC41597gZ0
    /* renamed from: a */
    public void mo16724a(final InterfaceC41597gZ0.InterfaceC20924a<T> interfaceC20924a) {
        X94<T> x94;
        X94<T> x942;
        X94<T> x943 = this.f106140b;
        X94<Object> x944 = f106138d;
        if (x943 != x944) {
            interfaceC20924a.mo18368a(x943);
            return;
        }
        synchronized (this) {
            x94 = this.f106140b;
            if (x94 != x944) {
                x942 = x94;
            } else {
                final InterfaceC41597gZ0.InterfaceC20924a<T> interfaceC20924a2 = this.f106139a;
                this.f106139a = new InterfaceC41597gZ0.InterfaceC20924a() { // from class: py3
                    @Override // p000.InterfaceC41597gZ0.InterfaceC20924a
                    /* renamed from: a */
                    public final void mo18368a(X94 x945) {
                        C47779qy3.m16717h(InterfaceC41597gZ0.InterfaceC20924a.this, interfaceC20924a, x945);
                    }
                };
                x942 = null;
            }
        }
        if (x942 != null) {
            interfaceC20924a.mo18368a(x94);
        }
    }

    @Override // p000.X94
    public T get() {
        return this.f106140b.get();
    }

    /* renamed from: j */
    public void m16715j(X94<T> x94) {
        InterfaceC41597gZ0.InterfaceC20924a<T> interfaceC20924a;
        if (this.f106140b == f106138d) {
            synchronized (this) {
                interfaceC20924a = this.f106139a;
                this.f106139a = null;
                this.f106140b = x94;
            }
            interfaceC20924a.mo18368a(x94);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
