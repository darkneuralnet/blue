package co.bird.android.vehiclescanner.servicecenter.scan;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.vehiclescanner.servicecenter.scan.ScanCodeActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.a */
/* loaded from: classes4.dex */
public final class C16448a {

    /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.a$a */
    /* loaded from: classes4.dex */
    public static final class C16449a implements ScanCodeActivity.InterfaceC16442b.InterfaceC16443a {
        @Override // co.bird.android.vehiclescanner.servicecenter.scan.ScanCodeActivity.InterfaceC16442b.InterfaceC16443a
        /* renamed from: a */
        public ScanCodeActivity.InterfaceC16442b mo54796a(InterfaceC44393lG2 interfaceC44393lG2, ScanCodeActivity.C16444c c16444c, BaseActivity baseActivity, ScopeProvider scopeProvider, C8191U5 c8191u5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(c16444c);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c8191u5);
            return new C16450b(c16444c, interfaceC44393lG2, baseActivity, scopeProvider, c8191u5);
        }

        private C16449a() {
        }
    }

    /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.a$b */
    /* loaded from: classes4.dex */
    public static final class C16450b implements ScanCodeActivity.InterfaceC16442b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f67103a;

        /* renamed from: b */
        public final C16450b f67104b;

        /* renamed from: c */
        public Y94<InterfaceC46473om3> f67105c;

        /* renamed from: d */
        public Y94<InterfaceC7381SM> f67106d;

        /* renamed from: e */
        public Y94<NQ5> f67107e;

        /* renamed from: f */
        public Y94<C36207Tq4> f67108f;

        /* renamed from: g */
        public Y94<ScopeProvider> f67109g;

        /* renamed from: h */
        public Y94<BaseActivity> f67110h;

        /* renamed from: i */
        public Y94<C8191U5> f67111i;

        /* renamed from: j */
        public Y94<C35911Sj5> f67112j;

        /* renamed from: k */
        public Y94<InterfaceC40099e13> f67113k;

        /* renamed from: l */
        public Y94<C34039Kj5> f67114l;

        /* renamed from: m */
        public Y94<XF1> f67115m;

        /* renamed from: n */
        public Y94<M92> f67116n;

        /* renamed from: o */
        public Y94<N92> f67117o;

        /* renamed from: p */
        public Y94<C42622iH1> f67118p;

        /* renamed from: q */
        public Y94<InterfaceC45852nj5> f67119q;

        /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.a$b$a */
        /* loaded from: classes4.dex */
        public static final class C16451a implements Y94<InterfaceC7381SM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f67120a;

            public C16451a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f67120a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC7381SM get() {
                return (InterfaceC7381SM) C51679xZ3.m5003d(this.f67120a.mo27592C0());
            }
        }

        /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.a$b$b */
        /* loaded from: classes4.dex */
        public static final class C16452b implements Y94<XF1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f67121a;

            public C16452b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f67121a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public XF1 get() {
                return (XF1) C51679xZ3.m5003d(this.f67121a.mo27569L0());
            }
        }

        /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.a$b$c */
        /* loaded from: classes4.dex */
        public static final class C16453c implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f67122a;

            public C16453c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f67122a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f67122a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.a$b$d */
        /* loaded from: classes4.dex */
        public static final class C16454d implements Y94<InterfaceC46473om3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f67123a;

            public C16454d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f67123a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46473om3 get() {
                return (InterfaceC46473om3) C51679xZ3.m5003d(this.f67123a.mo27584F0());
            }
        }

        /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.a$b$e */
        /* loaded from: classes4.dex */
        public static final class C16455e implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f67124a;

            public C16455e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f67124a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f67124a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.a$b$f */
        /* loaded from: classes4.dex */
        public static final class C16456f implements Y94<NQ5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f67125a;

            public C16456f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f67125a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public NQ5 get() {
                return (NQ5) C51679xZ3.m5003d(this.f67125a.mo27533Y0());
            }
        }

        @Override // co.bird.android.vehiclescanner.servicecenter.scan.ScanCodeActivity.InterfaceC16442b
        /* renamed from: a */
        public void mo54795a(ScanCodeActivity scanCodeActivity) {
            m54793c(scanCodeActivity);
        }

        /* renamed from: b */
        public final void m54794b(ScanCodeActivity.C16444c c16444c, InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C8191U5 c8191u5) {
            this.f67105c = new C16454d(interfaceC44393lG2);
            this.f67106d = new C16451a(interfaceC44393lG2);
            this.f67107e = new C16456f(interfaceC44393lG2);
            this.f67108f = new C16455e(interfaceC44393lG2);
            this.f67109g = C39546d52.m44621a(scopeProvider);
            this.f67110h = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c8191u5);
            this.f67111i = m44621a;
            this.f67112j = V51.m80429b(C36145Tj5.m83064a(this.f67110h, m44621a));
            C16453c c16453c = new C16453c(interfaceC44393lG2);
            this.f67113k = c16453c;
            this.f67114l = C35209Pj5.m89889a(this.f67105c, this.f67106d, this.f67107e, this.f67108f, this.f67109g, this.f67112j, c16453c);
            this.f67115m = new C16452b(interfaceC44393lG2);
            P92 m90630a = P92.m90630a(this.f67110h);
            this.f67116n = m90630a;
            Y94<N92> m80429b = V51.m80429b(O92.m92712a(this.f67110h, m90630a));
            this.f67117o = m80429b;
            C43808kH1 m29108a = C43808kH1.m29108a(this.f67115m, m80429b, this.f67105c, this.f67106d, this.f67107e, this.f67112j, this.f67108f, this.f67109g, this.f67113k);
            this.f67118p = m29108a;
            this.f67119q = V51.m80429b(C16457b.m54786a(c16444c, this.f67114l, m29108a));
        }

        /* renamed from: c */
        public final ScanCodeActivity m54793c(ScanCodeActivity scanCodeActivity) {
            C5135Ly.m96068n(scanCodeActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f67103a.mo27461w2()));
            C5135Ly.m96066p(scanCodeActivity, (C36207Tq4) C51679xZ3.m5003d(this.f67103a.mo27595B1()));
            C5135Ly.m96071k(scanCodeActivity, (Handler) C51679xZ3.m5003d(this.f67103a.mo27535X2()));
            C5135Ly.m96067o(scanCodeActivity, (C22454gl) C51679xZ3.m5003d(this.f67103a.mo27479r()));
            C5135Ly.m96080b(scanCodeActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f67103a.mo27519d0()));
            C5135Ly.m96075g(scanCodeActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f67103a.mo27453z2()));
            C5135Ly.m96064r(scanCodeActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f67103a.mo27459x1()));
            C5135Ly.m96081a(scanCodeActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f67103a.mo27474s()));
            C5135Ly.m96073i(scanCodeActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f67103a.mo27558P0()));
            C5135Ly.m96074h(scanCodeActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f67103a.mo27598A0()));
            C5135Ly.m96077e(scanCodeActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f67103a.mo27507i0()));
            C5135Ly.m96070l(scanCodeActivity, (FO2) C51679xZ3.m5003d(this.f67103a.mo27456y2()));
            C5135Ly.m96065q(scanCodeActivity, (YR4) C51679xZ3.m5003d(this.f67103a.mo27525b0()));
            C5135Ly.m96079c(scanCodeActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f67103a.mo27460x()));
            C5135Ly.m96078d(scanCodeActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f67103a.mo27517d3()));
            C5135Ly.m96072j(scanCodeActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f67103a.mo27482q()));
            C5135Ly.m96076f(scanCodeActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f67103a.mo27483p3()));
            C45259mj5.m25135b(scanCodeActivity, this.f67119q.get());
            return scanCodeActivity;
        }

        public C16450b(ScanCodeActivity.C16444c c16444c, InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C8191U5 c8191u5) {
            this.f67104b = this;
            this.f67103a = interfaceC44393lG2;
            m54794b(c16444c, interfaceC44393lG2, baseActivity, scopeProvider, c8191u5);
        }
    }

    private C16448a() {
    }

    /* renamed from: a */
    public static ScanCodeActivity.InterfaceC16442b.InterfaceC16443a m54797a() {
        return new C16449a();
    }
}
