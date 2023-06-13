package p000;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.idtools.identify.associate.C15610b;
import co.bird.android.feature.servicecenter.idtools.identify.associate.IdToolsIdentifyAssociateActivity;
import co.bird.android.feature.servicecenter.idtools.identify.associate.InterfaceC15608a;
import co.bird.android.feature.servicecenter.idtools.identify.dissociate.C15613b;
import co.bird.android.feature.servicecenter.idtools.identify.dissociate.IdToolsIdentifyDissociateActivity;
import co.bird.android.feature.servicecenter.idtools.identify.dissociate.InterfaceC15611a;
import co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity;
import com.uber.autodispose.ScopeProvider;
import p000.InterfaceC48632sQ1;
/* renamed from: IK0 */
/* loaded from: classes3.dex */
public final class IK0 {

    /* renamed from: IK0$a */
    /* loaded from: classes3.dex */
    public static final class C3492a implements InterfaceC48632sQ1.InterfaceC28302a {
        @Override // p000.InterfaceC48632sQ1.InterfaceC28302a
        /* renamed from: a */
        public InterfaceC48632sQ1 mo14224a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C3493b(interfaceC44393lG2);
        }

        private C3492a() {
        }
    }

    /* renamed from: IK0$b */
    /* loaded from: classes3.dex */
    public static final class C3493b implements InterfaceC48632sQ1 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f15308a;

        /* renamed from: b */
        public final C3493b f15309b;

        /* renamed from: c */
        public Y94<String> f15310c;

        /* renamed from: d */
        public Y94<InterfaceC45686nS1> f15311d;

        /* renamed from: e */
        public Y94<InterfaceC46473om3> f15312e;

        /* renamed from: f */
        public Y94<InterfaceC7381SM> f15313f;

        /* renamed from: g */
        public Y94<InterfaceC27246pJ> f15314g;

        /* renamed from: h */
        public Y94<InterfaceC10163ZF> f15315h;

        /* renamed from: i */
        public Y94<InterfaceC1880Ea> f15316i;

        /* renamed from: j */
        public Y94<InterfaceC36149Tk0> f15317j;

        /* renamed from: k */
        public Y94<InterfaceC10636aM> f15318k;

        /* renamed from: l */
        public Y94<InterfaceC36185To0> f15319l;

        /* renamed from: m */
        public Y94<InterfaceC40099e13> f15320m;

        /* renamed from: n */
        public Y94<C36207Tq4> f15321n;

        /* renamed from: o */
        public Y94<InterfaceC45433n10> f15322o;

        /* renamed from: p */
        public Y94<InterfaceC48164rd5> f15323p;

        /* renamed from: q */
        public Y94<Context> f15324q;

        /* renamed from: IK0$b$a */
        /* loaded from: classes3.dex */
        public static final class C3494a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15325a;

            public C3494a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15325a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f15325a.mo27519d0());
            }
        }

        /* renamed from: IK0$b$b */
        /* loaded from: classes3.dex */
        public static final class C3495b implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15326a;

            public C3495b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15326a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f15326a.mo27552R1());
            }
        }

        /* renamed from: IK0$b$c */
        /* loaded from: classes3.dex */
        public static final class C3496c implements Y94<InterfaceC10163ZF> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15327a;

            public C3496c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15327a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10163ZF get() {
                return (InterfaceC10163ZF) C51679xZ3.m5003d(this.f15327a.mo27560O());
            }
        }

        /* renamed from: IK0$b$d */
        /* loaded from: classes3.dex */
        public static final class C3497d implements Y94<InterfaceC27246pJ> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15328a;

            public C3497d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15328a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC27246pJ get() {
                return (InterfaceC27246pJ) C51679xZ3.m5003d(this.f15328a.mo27517d3());
            }
        }

        /* renamed from: IK0$b$e */
        /* loaded from: classes3.dex */
        public static final class C3498e implements Y94<InterfaceC10636aM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15329a;

            public C3498e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15329a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10636aM get() {
                return (InterfaceC10636aM) C51679xZ3.m5003d(this.f15329a.mo27460x());
            }
        }

        /* renamed from: IK0$b$f */
        /* loaded from: classes3.dex */
        public static final class C3499f implements Y94<InterfaceC7381SM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15330a;

            public C3499f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15330a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC7381SM get() {
                return (InterfaceC7381SM) C51679xZ3.m5003d(this.f15330a.mo27592C0());
            }
        }

        /* renamed from: IK0$b$g */
        /* loaded from: classes3.dex */
        public static final class C3500g implements Y94<InterfaceC36185To0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15331a;

            public C3500g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15331a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36185To0 get() {
                return (InterfaceC36185To0) C51679xZ3.m5003d(this.f15331a.mo27481q2());
            }
        }

        /* renamed from: IK0$b$h */
        /* loaded from: classes3.dex */
        public static final class C3501h implements Y94<InterfaceC45433n10> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15332a;

            public C3501h(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15332a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC45433n10 get() {
                return (InterfaceC45433n10) C51679xZ3.m5003d(this.f15332a.mo27510g1());
            }
        }

        /* renamed from: IK0$b$i */
        /* loaded from: classes3.dex */
        public static final class C3502i implements Y94<InterfaceC36149Tk0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15333a;

            public C3502i(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15333a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36149Tk0 get() {
                return (InterfaceC36149Tk0) C51679xZ3.m5003d(this.f15333a.mo27490n());
            }
        }

        /* renamed from: IK0$b$j */
        /* loaded from: classes3.dex */
        public static final class C3503j implements Y94<InterfaceC48164rd5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15334a;

            public C3503j(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15334a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC48164rd5 get() {
                return (InterfaceC48164rd5) C51679xZ3.m5003d(this.f15334a.mo27463w());
            }
        }

        /* renamed from: IK0$b$k */
        /* loaded from: classes3.dex */
        public static final class C3504k implements Y94<InterfaceC45686nS1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15335a;

            public C3504k(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15335a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC45686nS1 get() {
                return (InterfaceC45686nS1) C51679xZ3.m5003d(this.f15335a.mo27498k3());
            }
        }

        /* renamed from: IK0$b$l */
        /* loaded from: classes3.dex */
        public static final class C3505l implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15336a;

            public C3505l(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15336a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f15336a.mo27461w2());
            }
        }

        /* renamed from: IK0$b$m */
        /* loaded from: classes3.dex */
        public static final class C3506m implements Y94<InterfaceC46473om3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15337a;

            public C3506m(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15337a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46473om3 get() {
                return (InterfaceC46473om3) C51679xZ3.m5003d(this.f15337a.mo27584F0());
            }
        }

        /* renamed from: IK0$b$n */
        /* loaded from: classes3.dex */
        public static final class C3507n implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15338a;

            public C3507n(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15338a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f15338a.mo27595B1());
            }
        }

        @Override // p000.InterfaceC48632sQ1
        /* renamed from: a */
        public InterfaceC15608a.InterfaceC15609a mo14227a() {
            return new C3508c(this.f15309b);
        }

        @Override // p000.InterfaceC48632sQ1
        /* renamed from: b */
        public InterfaceC15611a.InterfaceC15612a mo14226b() {
            return new C3510e(this.f15309b);
        }

        @Override // p000.InterfaceC48632sQ1
        /* renamed from: c */
        public void mo14225c(IdToolsLandingActivity idToolsLandingActivity) {
            m102499w(idToolsLandingActivity);
        }

        /* renamed from: t */
        public final RR1 m102502t() {
            return new RR1((Context) C51679xZ3.m5003d(this.f15308a.mo27552R1()));
        }

        /* renamed from: u */
        public final C40942fS1 m102501u() {
            return new C40942fS1((InterfaceC45433n10) C51679xZ3.m5003d(this.f15308a.mo27510g1()), (InterfaceC46473om3) C51679xZ3.m5003d(this.f15308a.mo27584F0()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f15308a.mo27519d0()), (C36207Tq4) C51679xZ3.m5003d(this.f15308a.mo27595B1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f15308a.mo27461w2()), this.f15310c.get());
        }

        /* renamed from: v */
        public final void m102500v(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f15310c = V51.m80429b(C52207yS1.m3479a());
            this.f15311d = new C3504k(interfaceC44393lG2);
            this.f15312e = new C3506m(interfaceC44393lG2);
            this.f15313f = new C3499f(interfaceC44393lG2);
            this.f15314g = new C3497d(interfaceC44393lG2);
            this.f15315h = new C3496c(interfaceC44393lG2);
            this.f15316i = new C3494a(interfaceC44393lG2);
            this.f15317j = new C3502i(interfaceC44393lG2);
            this.f15318k = new C3498e(interfaceC44393lG2);
            this.f15319l = new C3500g(interfaceC44393lG2);
            this.f15320m = new C3505l(interfaceC44393lG2);
            this.f15321n = new C3507n(interfaceC44393lG2);
            this.f15322o = new C3501h(interfaceC44393lG2);
            this.f15323p = new C3503j(interfaceC44393lG2);
            this.f15324q = new C3495b(interfaceC44393lG2);
        }

        /* renamed from: w */
        public final IdToolsLandingActivity m102499w(IdToolsLandingActivity idToolsLandingActivity) {
            C4650Ky.m98043b(idToolsLandingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f15308a.mo27461w2()));
            C4650Ky.m98042c(idToolsLandingActivity, (C22454gl) C51679xZ3.m5003d(this.f15308a.mo27479r()));
            C4650Ky.m98041d(idToolsLandingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f15308a.mo27595B1()));
            OR1.m92308c(idToolsLandingActivity, m102501u());
            OR1.m92310a(idToolsLandingActivity, m102502t());
            return idToolsLandingActivity;
        }

        public C3493b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f15309b = this;
            this.f15308a = interfaceC44393lG2;
            m102500v(interfaceC44393lG2);
        }
    }

    /* renamed from: IK0$c */
    /* loaded from: classes3.dex */
    public static final class C3508c implements InterfaceC15608a.InterfaceC15609a {

        /* renamed from: a */
        public final C3493b f15339a;

        @Override // co.bird.android.feature.servicecenter.idtools.identify.associate.InterfaceC15608a.InterfaceC15609a
        /* renamed from: a */
        public InterfaceC15608a mo56859a(BaseActivity baseActivity, ScopeProvider scopeProvider, C6233P3 c6233p3, DQ3 dq3) {
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c6233p3);
            C51679xZ3.m5005b(dq3);
            return new C3509d(this.f15339a, baseActivity, scopeProvider, c6233p3, dq3);
        }

        public C3508c(C3493b c3493b) {
            this.f15339a = c3493b;
        }
    }

    /* renamed from: IK0$d */
    /* loaded from: classes3.dex */
    public static final class C3509d implements InterfaceC15608a {

        /* renamed from: a */
        public final C3493b f15340a;

        /* renamed from: b */
        public final C3509d f15341b;

        /* renamed from: c */
        public Y94<DQ3> f15342c;

        /* renamed from: d */
        public Y94<BaseActivity> f15343d;

        /* renamed from: e */
        public Y94<C6233P3> f15344e;

        /* renamed from: f */
        public Y94<HR1> f15345f;

        /* renamed from: g */
        public Y94<GR1> f15346g;

        /* renamed from: h */
        public Y94<ScopeProvider> f15347h;

        /* renamed from: i */
        public Y94<C46854pQ1> f15348i;

        /* renamed from: j */
        public Y94<InterfaceC45075mQ1> f15349j;

        /* renamed from: k */
        public Y94<C39137cR1> f15350k;

        /* renamed from: l */
        public Y94<FR1> f15351l;

        @Override // co.bird.android.feature.servicecenter.idtools.identify.associate.InterfaceC15608a
        /* renamed from: a */
        public void mo56860a(IdToolsIdentifyAssociateActivity idToolsIdentifyAssociateActivity) {
            m102483c(idToolsIdentifyAssociateActivity);
        }

        /* renamed from: b */
        public final void m102484b(BaseActivity baseActivity, ScopeProvider scopeProvider, C6233P3 c6233p3, DQ3 dq3) {
            this.f15342c = C39546d52.m44621a(dq3);
            this.f15343d = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c6233p3);
            this.f15344e = m44621a;
            IR1 m102410a = IR1.m102410a(this.f15343d, m44621a);
            this.f15345f = m102410a;
            this.f15346g = V51.m80429b(m102410a);
            this.f15347h = C39546d52.m44621a(scopeProvider);
            C47447qQ1 m17530a = C47447qQ1.m17530a(this.f15340a.f15324q);
            this.f15348i = m17530a;
            this.f15349j = V51.m80429b(m17530a);
            C46270oR1 m21083a = C46270oR1.m21083a(this.f15340a.f15311d, this.f15340a.f15312e, this.f15340a.f15313f, this.f15340a.f15314g, this.f15340a.f15315h, this.f15340a.f15316i, this.f15342c, this.f15340a.f15317j, this.f15340a.f15318k, this.f15340a.f15319l, this.f15340a.f15320m, this.f15346g, this.f15347h, this.f15340a.f15310c, this.f15340a.f15321n, this.f15340a.f15322o, this.f15340a.f15323p, this.f15349j);
            this.f15350k = m21083a;
            this.f15351l = V51.m80429b(m21083a);
        }

        /* renamed from: c */
        public final IdToolsIdentifyAssociateActivity m102483c(IdToolsIdentifyAssociateActivity idToolsIdentifyAssociateActivity) {
            C5135Ly.m96068n(idToolsIdentifyAssociateActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f15340a.f15308a.mo27461w2()));
            C5135Ly.m96066p(idToolsIdentifyAssociateActivity, (C36207Tq4) C51679xZ3.m5003d(this.f15340a.f15308a.mo27595B1()));
            C5135Ly.m96071k(idToolsIdentifyAssociateActivity, (Handler) C51679xZ3.m5003d(this.f15340a.f15308a.mo27535X2()));
            C5135Ly.m96067o(idToolsIdentifyAssociateActivity, (C22454gl) C51679xZ3.m5003d(this.f15340a.f15308a.mo27479r()));
            C5135Ly.m96080b(idToolsIdentifyAssociateActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f15340a.f15308a.mo27519d0()));
            C5135Ly.m96075g(idToolsIdentifyAssociateActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f15340a.f15308a.mo27453z2()));
            C5135Ly.m96064r(idToolsIdentifyAssociateActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f15340a.f15308a.mo27459x1()));
            C5135Ly.m96081a(idToolsIdentifyAssociateActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f15340a.f15308a.mo27474s()));
            C5135Ly.m96073i(idToolsIdentifyAssociateActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f15340a.f15308a.mo27558P0()));
            C5135Ly.m96074h(idToolsIdentifyAssociateActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f15340a.f15308a.mo27598A0()));
            C5135Ly.m96077e(idToolsIdentifyAssociateActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f15340a.f15308a.mo27507i0()));
            C5135Ly.m96070l(idToolsIdentifyAssociateActivity, (FO2) C51679xZ3.m5003d(this.f15340a.f15308a.mo27456y2()));
            C5135Ly.m96065q(idToolsIdentifyAssociateActivity, (YR4) C51679xZ3.m5003d(this.f15340a.f15308a.mo27525b0()));
            C5135Ly.m96079c(idToolsIdentifyAssociateActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f15340a.f15308a.mo27460x()));
            C5135Ly.m96078d(idToolsIdentifyAssociateActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f15340a.f15308a.mo27517d3()));
            C5135Ly.m96072j(idToolsIdentifyAssociateActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f15340a.f15308a.mo27482q()));
            C5135Ly.m96076f(idToolsIdentifyAssociateActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f15340a.f15308a.mo27483p3()));
            C15610b.m56857b(idToolsIdentifyAssociateActivity, this.f15351l.get());
            return idToolsIdentifyAssociateActivity;
        }

        public C3509d(C3493b c3493b, BaseActivity baseActivity, ScopeProvider scopeProvider, C6233P3 c6233p3, DQ3 dq3) {
            this.f15341b = this;
            this.f15340a = c3493b;
            m102484b(baseActivity, scopeProvider, c6233p3, dq3);
        }
    }

    /* renamed from: IK0$e */
    /* loaded from: classes3.dex */
    public static final class C3510e implements InterfaceC15611a.InterfaceC15612a {

        /* renamed from: a */
        public final C3493b f15352a;

        @Override // co.bird.android.feature.servicecenter.idtools.identify.dissociate.InterfaceC15611a.InterfaceC15612a
        /* renamed from: a */
        public InterfaceC15611a mo56854a(BaseActivity baseActivity, ScopeProvider scopeProvider, C6233P3 c6233p3, DQ3 dq3) {
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c6233p3);
            C51679xZ3.m5005b(dq3);
            return new C3511f(this.f15352a, baseActivity, scopeProvider, c6233p3, dq3);
        }

        public C3510e(C3493b c3493b) {
            this.f15352a = c3493b;
        }
    }

    /* renamed from: IK0$f */
    /* loaded from: classes3.dex */
    public static final class C3511f implements InterfaceC15611a {

        /* renamed from: a */
        public final C3493b f15353a;

        /* renamed from: b */
        public final C3511f f15354b;

        /* renamed from: c */
        public Y94<DQ3> f15355c;

        /* renamed from: d */
        public Y94<BaseActivity> f15356d;

        /* renamed from: e */
        public Y94<C6233P3> f15357e;

        /* renamed from: f */
        public Y94<HR1> f15358f;

        /* renamed from: g */
        public Y94<GR1> f15359g;

        /* renamed from: h */
        public Y94<ScopeProvider> f15360h;

        /* renamed from: i */
        public Y94<C51003wQ1> f15361i;

        /* renamed from: j */
        public Y94<InterfaceC49225tQ1> f15362j;

        /* renamed from: k */
        public Y94<C52791zR1> f15363k;

        /* renamed from: l */
        public Y94<FR1> f15364l;

        @Override // co.bird.android.feature.servicecenter.idtools.identify.dissociate.InterfaceC15611a
        /* renamed from: a */
        public void mo56855a(IdToolsIdentifyDissociateActivity idToolsIdentifyDissociateActivity) {
            m102481c(idToolsIdentifyDissociateActivity);
        }

        /* renamed from: b */
        public final void m102482b(BaseActivity baseActivity, ScopeProvider scopeProvider, C6233P3 c6233p3, DQ3 dq3) {
            this.f15355c = C39546d52.m44621a(dq3);
            this.f15356d = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c6233p3);
            this.f15357e = m44621a;
            IR1 m102410a = IR1.m102410a(this.f15356d, m44621a);
            this.f15358f = m102410a;
            this.f15359g = V51.m80429b(m102410a);
            this.f15360h = C39546d52.m44621a(scopeProvider);
            C51596xQ1 m5284a = C51596xQ1.m5284a(this.f15353a.f15324q);
            this.f15361i = m5284a;
            this.f15362j = V51.m80429b(m5284a);
            ER1 m109020a = ER1.m109020a(this.f15353a.f15311d, this.f15353a.f15312e, this.f15353a.f15314g, this.f15353a.f15313f, this.f15353a.f15315h, this.f15353a.f15316i, this.f15355c, this.f15353a.f15317j, this.f15353a.f15318k, this.f15353a.f15319l, this.f15353a.f15320m, this.f15359g, this.f15360h, this.f15353a.f15310c, this.f15362j);
            this.f15363k = m109020a;
            this.f15364l = V51.m80429b(m109020a);
        }

        /* renamed from: c */
        public final IdToolsIdentifyDissociateActivity m102481c(IdToolsIdentifyDissociateActivity idToolsIdentifyDissociateActivity) {
            C5135Ly.m96068n(idToolsIdentifyDissociateActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f15353a.f15308a.mo27461w2()));
            C5135Ly.m96066p(idToolsIdentifyDissociateActivity, (C36207Tq4) C51679xZ3.m5003d(this.f15353a.f15308a.mo27595B1()));
            C5135Ly.m96071k(idToolsIdentifyDissociateActivity, (Handler) C51679xZ3.m5003d(this.f15353a.f15308a.mo27535X2()));
            C5135Ly.m96067o(idToolsIdentifyDissociateActivity, (C22454gl) C51679xZ3.m5003d(this.f15353a.f15308a.mo27479r()));
            C5135Ly.m96080b(idToolsIdentifyDissociateActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f15353a.f15308a.mo27519d0()));
            C5135Ly.m96075g(idToolsIdentifyDissociateActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f15353a.f15308a.mo27453z2()));
            C5135Ly.m96064r(idToolsIdentifyDissociateActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f15353a.f15308a.mo27459x1()));
            C5135Ly.m96081a(idToolsIdentifyDissociateActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f15353a.f15308a.mo27474s()));
            C5135Ly.m96073i(idToolsIdentifyDissociateActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f15353a.f15308a.mo27558P0()));
            C5135Ly.m96074h(idToolsIdentifyDissociateActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f15353a.f15308a.mo27598A0()));
            C5135Ly.m96077e(idToolsIdentifyDissociateActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f15353a.f15308a.mo27507i0()));
            C5135Ly.m96070l(idToolsIdentifyDissociateActivity, (FO2) C51679xZ3.m5003d(this.f15353a.f15308a.mo27456y2()));
            C5135Ly.m96065q(idToolsIdentifyDissociateActivity, (YR4) C51679xZ3.m5003d(this.f15353a.f15308a.mo27525b0()));
            C5135Ly.m96079c(idToolsIdentifyDissociateActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f15353a.f15308a.mo27460x()));
            C5135Ly.m96078d(idToolsIdentifyDissociateActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f15353a.f15308a.mo27517d3()));
            C5135Ly.m96072j(idToolsIdentifyDissociateActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f15353a.f15308a.mo27482q()));
            C5135Ly.m96076f(idToolsIdentifyDissociateActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f15353a.f15308a.mo27483p3()));
            C15613b.m56852b(idToolsIdentifyDissociateActivity, this.f15364l.get());
            return idToolsIdentifyDissociateActivity;
        }

        public C3511f(C3493b c3493b, BaseActivity baseActivity, ScopeProvider scopeProvider, C6233P3 c6233p3, DQ3 dq3) {
            this.f15354b = this;
            this.f15353a = c3493b;
            m102482b(baseActivity, scopeProvider, c6233p3, dq3);
        }
    }

    private IK0() {
    }

    /* renamed from: a */
    public static InterfaceC48632sQ1.InterfaceC28302a m102519a() {
        return new C3492a();
    }
}
