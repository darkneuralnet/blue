package co.bird.android.feature.servicecenter.inventorycount;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.inventorycount.InventoryCountActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.inventorycount.a */
/* loaded from: classes3.dex */
public final class C15633a {

    /* renamed from: co.bird.android.feature.servicecenter.inventorycount.a$a */
    /* loaded from: classes3.dex */
    public static final class C15634a implements InventoryCountActivity.InterfaceC15627a.InterfaceC15628a {
        @Override // co.bird.android.feature.servicecenter.inventorycount.InventoryCountActivity.InterfaceC15627a.InterfaceC15628a
        /* renamed from: a */
        public InventoryCountActivity.InterfaceC15627a mo56817a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C8921W3 c8921w3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c8921w3);
            return new C15635b(interfaceC44393lG2, baseActivity, scopeProvider, c8921w3);
        }

        private C15634a() {
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.inventorycount.a$b */
    /* loaded from: classes3.dex */
    public static final class C15635b implements InventoryCountActivity.InterfaceC15627a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65388a;

        /* renamed from: b */
        public final C15635b f65389b;

        /* renamed from: c */
        public Y94<InterfaceC44647lh6> f65390c;

        /* renamed from: d */
        public Y94<BaseActivity> f65391d;

        /* renamed from: e */
        public Y94<C8921W3> f65392e;

        /* renamed from: f */
        public Y94<B82> f65393f;

        /* renamed from: g */
        public Y94<ScopeProvider> f65394g;

        /* renamed from: h */
        public Y94<I82> f65395h;

        /* renamed from: i */
        public Y94<InterfaceC33193Gt5> f65396i;

        /* renamed from: j */
        public Y94<InterfaceC1880Ea> f65397j;

        /* renamed from: k */
        public Y94<InterfaceC40099e13> f65398k;

        /* renamed from: l */
        public Y94<C51174wi2> f65399l;

        /* renamed from: m */
        public Y94<Context> f65400m;

        /* renamed from: n */
        public Y94<G82> f65401n;

        /* renamed from: o */
        public Y94<C48469s82> f65402o;

        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15636a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65403a;

            public C15636a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65403a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65403a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15637b implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65404a;

            public C15637b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65404a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f65404a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15638c implements Y94<C51174wi2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65405a;

            public C15638c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65405a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C51174wi2 get() {
                return (C51174wi2) C51679xZ3.m5003d(this.f65405a.mo27492m2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15639d implements Y94<I82> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65406a;

            public C15639d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65406a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public I82 get() {
                return (I82) C51679xZ3.m5003d(this.f65406a.mo27455z());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C15640e implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65407a;

            public C15640e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65407a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65407a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.a$b$f */
        /* loaded from: classes3.dex */
        public static final class C15641f implements Y94<InterfaceC33193Gt5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65408a;

            public C15641f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65408a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC33193Gt5 get() {
                return (InterfaceC33193Gt5) C51679xZ3.m5003d(this.f65408a.mo27534Y());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.a$b$g */
        /* loaded from: classes3.dex */
        public static final class C15642g implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65409a;

            public C15642g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65409a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65409a.mo27459x1());
            }
        }

        @Override // co.bird.android.feature.servicecenter.inventorycount.InventoryCountActivity.InterfaceC15627a
        /* renamed from: a */
        public void mo56816a(InventoryCountActivity inventoryCountActivity) {
            m56814c(inventoryCountActivity);
        }

        /* renamed from: b */
        public final void m56815b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C8921W3 c8921w3) {
            this.f65390c = new C15642g(interfaceC44393lG2);
            this.f65391d = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c8921w3);
            this.f65392e = m44621a;
            this.f65393f = V51.m80429b(C82.m112748a(this.f65391d, m44621a));
            this.f65394g = C39546d52.m44621a(scopeProvider);
            this.f65395h = new C15639d(interfaceC44393lG2);
            this.f65396i = new C15641f(interfaceC44393lG2);
            this.f65397j = new C15636a(interfaceC44393lG2);
            this.f65398k = new C15640e(interfaceC44393lG2);
            this.f65399l = new C15638c(interfaceC44393lG2);
            C15637b c15637b = new C15637b(interfaceC44393lG2);
            this.f65400m = c15637b;
            Y94<G82> m80429b = V51.m80429b(H82.m104365a(c15637b));
            this.f65401n = m80429b;
            this.f65402o = V51.m80429b(C52619z82.m1767a(this.f65390c, this.f65393f, this.f65394g, this.f65395h, this.f65396i, this.f65397j, this.f65398k, this.f65399l, m80429b));
        }

        /* renamed from: c */
        public final InventoryCountActivity m56814c(InventoryCountActivity inventoryCountActivity) {
            C5135Ly.m96068n(inventoryCountActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65388a.mo27461w2()));
            C5135Ly.m96066p(inventoryCountActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65388a.mo27595B1()));
            C5135Ly.m96071k(inventoryCountActivity, (Handler) C51679xZ3.m5003d(this.f65388a.mo27535X2()));
            C5135Ly.m96067o(inventoryCountActivity, (C22454gl) C51679xZ3.m5003d(this.f65388a.mo27479r()));
            C5135Ly.m96080b(inventoryCountActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65388a.mo27519d0()));
            C5135Ly.m96075g(inventoryCountActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65388a.mo27453z2()));
            C5135Ly.m96064r(inventoryCountActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65388a.mo27459x1()));
            C5135Ly.m96081a(inventoryCountActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65388a.mo27474s()));
            C5135Ly.m96073i(inventoryCountActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65388a.mo27558P0()));
            C5135Ly.m96074h(inventoryCountActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65388a.mo27598A0()));
            C5135Ly.m96077e(inventoryCountActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65388a.mo27507i0()));
            C5135Ly.m96070l(inventoryCountActivity, (FO2) C51679xZ3.m5003d(this.f65388a.mo27456y2()));
            C5135Ly.m96065q(inventoryCountActivity, (YR4) C51679xZ3.m5003d(this.f65388a.mo27525b0()));
            C5135Ly.m96079c(inventoryCountActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65388a.mo27460x()));
            C5135Ly.m96078d(inventoryCountActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65388a.mo27517d3()));
            C5135Ly.m96072j(inventoryCountActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65388a.mo27482q()));
            C5135Ly.m96076f(inventoryCountActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65388a.mo27483p3()));
            T72.m84289b(inventoryCountActivity, this.f65402o.get());
            return inventoryCountActivity;
        }

        public C15635b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C8921W3 c8921w3) {
            this.f65389b = this;
            this.f65388a = interfaceC44393lG2;
            m56815b(interfaceC44393lG2, baseActivity, scopeProvider, c8921w3);
        }
    }

    private C15633a() {
    }

    /* renamed from: a */
    public static InventoryCountActivity.InterfaceC15627a.InterfaceC15628a m56818a() {
        return new C15634a();
    }
}
