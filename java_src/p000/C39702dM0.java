package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C50923wH2;
/* renamed from: dM0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39702dM0 {

    /* renamed from: dM0$a */
    /* loaded from: classes3.dex */
    public static final class C19732a implements C50923wH2.InterfaceC29852b.InterfaceC29853a {

        /* renamed from: a */
        public C50923wH2.C29854c f76471a;

        /* renamed from: b */
        public InterfaceC44393lG2 f76472b;

        @Override // p000.C50923wH2.InterfaceC29852b.InterfaceC29853a
        public C50923wH2.InterfaceC29852b build() {
            C51679xZ3.m5006a(this.f76471a, C50923wH2.C29854c.class);
            C51679xZ3.m5006a(this.f76472b, InterfaceC44393lG2.class);
            return new C19733b(this.f76471a, this.f76472b);
        }

        @Override // p000.C50923wH2.InterfaceC29852b.InterfaceC29853a
        /* renamed from: c */
        public C19732a mo7047a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f76472b = (InterfaceC44393lG2) C51679xZ3.m5005b(interfaceC44393lG2);
            return this;
        }

        @Override // p000.C50923wH2.InterfaceC29852b.InterfaceC29853a
        /* renamed from: d */
        public C19732a mo7046b(C50923wH2.C29854c c29854c) {
            this.f76471a = (C50923wH2.C29854c) C51679xZ3.m5005b(c29854c);
            return this;
        }

        private C19732a() {
        }
    }

    /* renamed from: dM0$b */
    /* loaded from: classes3.dex */
    public static final class C19733b implements C50923wH2.InterfaceC29852b {

        /* renamed from: a */
        public final C19733b f76473a;

        /* renamed from: b */
        public Y94<ScopeProvider> f76474b;

        /* renamed from: c */
        public Y94<BaseActivity> f76475c;

        /* renamed from: d */
        public Y94<C50923wH2> f76476d;

        /* renamed from: e */
        public Y94<MH2> f76477e;

        /* renamed from: f */
        public Y94<C47960rH2> f76478f;

        /* renamed from: g */
        public Y94<YR4> f76479g;

        /* renamed from: h */
        public Y94<InterfaceC36821Wg6> f76480h;

        /* renamed from: i */
        public Y94<InterfaceC46893pU4> f76481i;

        /* renamed from: j */
        public Y94<InterfaceC46164oF3> f76482j;

        /* renamed from: k */
        public Y94<IH2> f76483k;

        /* renamed from: dM0$b$a */
        /* loaded from: classes3.dex */
        public static final class C19734a implements Y94<InterfaceC46164oF3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f76484a;

            public C19734a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f76484a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46164oF3 get() {
                return (InterfaceC46164oF3) C51679xZ3.m5003d(this.f76484a.mo27587D2());
            }
        }

        /* renamed from: dM0$b$b */
        /* loaded from: classes3.dex */
        public static final class C19735b implements Y94<YR4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f76485a;

            public C19735b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f76485a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public YR4 get() {
                return (YR4) C51679xZ3.m5003d(this.f76485a.mo27525b0());
            }
        }

        /* renamed from: dM0$b$c */
        /* loaded from: classes3.dex */
        public static final class C19736c implements Y94<InterfaceC46893pU4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f76486a;

            public C19736c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f76486a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46893pU4 get() {
                return (InterfaceC46893pU4) C51679xZ3.m5003d(this.f76486a.mo27566M0());
            }
        }

        /* renamed from: dM0$b$d */
        /* loaded from: classes3.dex */
        public static final class C19737d implements Y94<InterfaceC36821Wg6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f76487a;

            public C19737d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f76487a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36821Wg6 get() {
                return (InterfaceC36821Wg6) C51679xZ3.m5003d(this.f76487a.mo27580H());
            }
        }

        @Override // p000.C50923wH2.InterfaceC29852b
        /* renamed from: a */
        public void mo7048a(C50923wH2 c50923wH2) {
            m44363c(c50923wH2);
        }

        /* renamed from: b */
        public final void m44364b(C50923wH2.C29854c c29854c, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f76474b = V51.m80429b(RH2.m86995a(c29854c));
            this.f76475c = V51.m80429b(OH2.m92576b(c29854c));
            Y94<C50923wH2> m80429b = V51.m80429b(QH2.m88670a(c29854c));
            this.f76476d = m80429b;
            this.f76477e = V51.m80429b(NH2.m94109a(this.f76475c, m80429b));
            this.f76478f = V51.m80429b(PH2.m90513b(c29854c));
            this.f76479g = new C19735b(interfaceC44393lG2);
            this.f76480h = new C19737d(interfaceC44393lG2);
            this.f76481i = new C19736c(interfaceC44393lG2);
            C19734a c19734a = new C19734a(interfaceC44393lG2);
            this.f76482j = c19734a;
            this.f76483k = V51.m80429b(LH2.m97398a(this.f76474b, this.f76477e, this.f76478f, this.f76479g, this.f76480h, this.f76481i, c19734a));
        }

        /* renamed from: c */
        public final C50923wH2 m44363c(C50923wH2 c50923wH2) {
            SH2.m85781b(c50923wH2, this.f76483k.get());
            return c50923wH2;
        }

        public C19733b(C50923wH2.C29854c c29854c, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f76473a = this;
            m44364b(c29854c, interfaceC44393lG2);
        }
    }

    private C39702dM0() {
    }

    /* renamed from: a */
    public static C50923wH2.InterfaceC29852b.InterfaceC29853a m44367a() {
        return new C19732a();
    }
}
