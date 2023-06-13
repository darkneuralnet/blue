package p000;

import android.content.Context;
import com.uber.autodispose.ScopeProvider;
import p000.NF6;
/* renamed from: dS0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39756dS0 {

    /* renamed from: dS0$a */
    /* loaded from: classes3.dex */
    public static final class C19767a implements NF6.InterfaceC5530b.InterfaceC5531a {
        @Override // p000.NF6.InterfaceC5530b.InterfaceC5531a
        /* renamed from: a */
        public NF6.InterfaceC5530b mo44256a(InterfaceC44393lG2 interfaceC44393lG2, ScopeProvider scopeProvider, C26572ni c26572ni, C33468Hy1 c33468Hy1) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c26572ni);
            C51679xZ3.m5005b(c33468Hy1);
            return new C19768b(interfaceC44393lG2, scopeProvider, c26572ni, c33468Hy1);
        }

        private C19767a() {
        }
    }

    /* renamed from: dS0$b */
    /* loaded from: classes3.dex */
    public static final class C19768b implements NF6.InterfaceC5530b {

        /* renamed from: a */
        public final C19768b f76610a;

        /* renamed from: b */
        public Y94<C33468Hy1> f76611b;

        /* renamed from: c */
        public Y94<C26572ni> f76612c;

        /* renamed from: d */
        public Y94<YF6> f76613d;

        /* renamed from: e */
        public Y94<ScopeProvider> f76614e;

        /* renamed from: f */
        public Y94<Context> f76615f;

        /* renamed from: g */
        public Y94<LF6> f76616g;

        /* renamed from: h */
        public Y94<VF6> f76617h;

        /* renamed from: dS0$b$a */
        /* loaded from: classes3.dex */
        public static final class C19769a implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f76618a;

            public C19769a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f76618a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f76618a.mo27552R1());
            }
        }

        @Override // p000.NF6.InterfaceC5530b
        /* renamed from: a */
        public void mo44255a(NF6 nf6) {
            m44253c(nf6);
        }

        /* renamed from: b */
        public final void m44254b(InterfaceC44393lG2 interfaceC44393lG2, ScopeProvider scopeProvider, C26572ni c26572ni, C33468Hy1 c33468Hy1) {
            this.f76611b = C39546d52.m44621a(c33468Hy1);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c26572ni);
            this.f76612c = m44621a;
            this.f76613d = V51.m80429b(ZF6.m73476a(this.f76611b, m44621a));
            this.f76614e = C39546d52.m44621a(scopeProvider);
            C19769a c19769a = new C19769a(interfaceC44393lG2);
            this.f76615f = c19769a;
            MF6 m95470a = MF6.m95470a(c19769a);
            this.f76616g = m95470a;
            this.f76617h = V51.m80429b(WF6.m78655a(this.f76613d, this.f76614e, m95470a));
        }

        /* renamed from: c */
        public final NF6 m44253c(NF6 nf6) {
            OF6.m92585b(nf6, this.f76617h.get());
            return nf6;
        }

        public C19768b(InterfaceC44393lG2 interfaceC44393lG2, ScopeProvider scopeProvider, C26572ni c26572ni, C33468Hy1 c33468Hy1) {
            this.f76610a = this;
            m44254b(interfaceC44393lG2, scopeProvider, c26572ni, c33468Hy1);
        }
    }

    private C39756dS0() {
    }

    /* renamed from: a */
    public static NF6.InterfaceC5530b.InterfaceC5531a m44257a() {
        return new C19767a();
    }
}
