package p000;

import android.content.DialogInterface;
import co.bird.android.core.base.BaseCoreActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C33458Hx0;
/* renamed from: jI0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43223jI0 {

    /* renamed from: jI0$a */
    /* loaded from: classes3.dex */
    public static final class C24768a implements C33458Hx0.InterfaceC3279b {

        /* renamed from: a */
        public final C24768a f92432a;

        /* renamed from: b */
        public Y94<ScopeProvider> f92433b;

        /* renamed from: c */
        public Y94<BaseCoreActivity> f92434c;

        /* renamed from: d */
        public Y94<C5029LZ> f92435d;

        /* renamed from: e */
        public Y94<DialogInterface> f92436e;

        /* renamed from: f */
        public Y94<C35798Rx0> f92437f;

        /* renamed from: g */
        public Y94<C36207Tq4> f92438g;

        /* renamed from: h */
        public Y94<InterfaceC52757zN3> f92439h;

        /* renamed from: i */
        public Y94<InterfaceC40099e13> f92440i;

        /* renamed from: j */
        public Y94<C34862Nx0> f92441j;

        /* renamed from: jI0$a$a */
        /* loaded from: classes3.dex */
        public static final class C24769a implements Y94<InterfaceC52757zN3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f92442a;

            public C24769a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f92442a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC52757zN3 get() {
                return (InterfaceC52757zN3) C51679xZ3.m5003d(this.f92442a.mo27518d2());
            }
        }

        /* renamed from: jI0$a$b */
        /* loaded from: classes3.dex */
        public static final class C24770b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f92443a;

            public C24770b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f92443a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f92443a.mo27461w2());
            }
        }

        /* renamed from: jI0$a$c */
        /* loaded from: classes3.dex */
        public static final class C24771c implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f92444a;

            public C24771c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f92444a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f92444a.mo27595B1());
            }
        }

        @Override // p000.C33458Hx0.InterfaceC3279b
        /* renamed from: a */
        public void mo30890a(C33458Hx0 c33458Hx0) {
            m30888c(c33458Hx0);
        }

        /* renamed from: b */
        public final void m30889b(InterfaceC44393lG2 interfaceC44393lG2, BaseCoreActivity baseCoreActivity, ScopeProvider scopeProvider, C5029LZ c5029lz, DialogInterface dialogInterface) {
            this.f92433b = C39546d52.m44621a(scopeProvider);
            this.f92434c = C39546d52.m44621a(baseCoreActivity);
            this.f92435d = C39546d52.m44621a(c5029lz);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(dialogInterface);
            this.f92436e = m44621a;
            this.f92437f = C36032Sx0.m84583a(this.f92434c, this.f92435d, m44621a);
            this.f92438g = new C24771c(interfaceC44393lG2);
            this.f92439h = new C24769a(interfaceC44393lG2);
            C24770b c24770b = new C24770b(interfaceC44393lG2);
            this.f92440i = c24770b;
            this.f92441j = V51.m80429b(C35564Qx0.m87561a(this.f92433b, this.f92437f, this.f92438g, this.f92439h, c24770b));
        }

        /* renamed from: c */
        public final C33458Hx0 m30888c(C33458Hx0 c33458Hx0) {
            C33692Ix0.m101459b(c33458Hx0, this.f92441j.get());
            return c33458Hx0;
        }

        public C24768a(InterfaceC44393lG2 interfaceC44393lG2, BaseCoreActivity baseCoreActivity, ScopeProvider scopeProvider, C5029LZ c5029lz, DialogInterface dialogInterface) {
            this.f92432a = this;
            m30889b(interfaceC44393lG2, baseCoreActivity, scopeProvider, c5029lz, dialogInterface);
        }
    }

    /* renamed from: jI0$b */
    /* loaded from: classes3.dex */
    public static final class C24772b implements C33458Hx0.InterfaceC3279b.InterfaceC3280a {
        @Override // p000.C33458Hx0.InterfaceC3279b.InterfaceC3280a
        /* renamed from: a */
        public C33458Hx0.InterfaceC3279b mo30884a(InterfaceC44393lG2 interfaceC44393lG2, BaseCoreActivity baseCoreActivity, ScopeProvider scopeProvider, C5029LZ c5029lz, DialogInterface dialogInterface) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseCoreActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c5029lz);
            C51679xZ3.m5005b(dialogInterface);
            return new C24768a(interfaceC44393lG2, baseCoreActivity, scopeProvider, c5029lz, dialogInterface);
        }

        private C24772b() {
        }
    }

    private C43223jI0() {
    }

    /* renamed from: a */
    public static C33458Hx0.InterfaceC3279b.InterfaceC3280a m30891a() {
        return new C24772b();
    }
}
