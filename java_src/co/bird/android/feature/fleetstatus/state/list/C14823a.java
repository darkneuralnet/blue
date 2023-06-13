package co.bird.android.feature.fleetstatus.state.list;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.fleetstatus.state.list.FleetListActivity;
import co.bird.android.model.constant.FlightSheetContext;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.fleetstatus.state.list.a */
/* loaded from: classes3.dex */
public final class C14823a {

    /* renamed from: co.bird.android.feature.fleetstatus.state.list.a$a */
    /* loaded from: classes3.dex */
    public static final class C14824a implements FleetListActivity.InterfaceC14818a.InterfaceC14819a {
        @Override // co.bird.android.feature.fleetstatus.state.list.FleetListActivity.InterfaceC14818a.InterfaceC14819a
        /* renamed from: a */
        public FleetListActivity.InterfaceC14818a mo58177a(InterfaceC44393lG2 interfaceC44393lG2, FleetListActivity.C14821b c14821b, BaseActivity baseActivity, ScopeProvider scopeProvider, C0846C3 c0846c3, boolean z, FlightSheetContext flightSheetContext) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c0846c3);
            C51679xZ3.m5005b(Boolean.valueOf(z));
            C51679xZ3.m5005b(flightSheetContext);
            return new C14825b(interfaceC44393lG2, baseActivity, scopeProvider, c0846c3, Boolean.valueOf(z), flightSheetContext);
        }

        private C14824a() {
        }
    }

    /* renamed from: co.bird.android.feature.fleetstatus.state.list.a$b */
    /* loaded from: classes3.dex */
    public static final class C14825b implements FleetListActivity.InterfaceC14818a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63977a;

        /* renamed from: b */
        public final ScopeProvider f63978b;

        /* renamed from: c */
        public final C14825b f63979c;

        /* renamed from: d */
        public Y94<InterfaceC46473om3> f63980d;

        /* renamed from: e */
        public Y94<InterfaceC30556yL> f63981e;

        /* renamed from: f */
        public Y94<InterfaceC48265rn6> f63982f;

        /* renamed from: g */
        public Y94<InterfaceC1880Ea> f63983g;

        /* renamed from: h */
        public Y94<C42826id4> f63984h;

        /* renamed from: i */
        public Y94<BaseActivity> f63985i;

        /* renamed from: j */
        public Y94<C0846C3> f63986j;

        /* renamed from: k */
        public Y94<C39386cp1> f63987k;

        /* renamed from: l */
        public Y94<InterfaceC40099e13> f63988l;

        /* renamed from: m */
        public Y94<C36207Tq4> f63989m;

        /* renamed from: n */
        public Y94<ScopeProvider> f63990n;

        /* renamed from: o */
        public Y94<C22454gl> f63991o;

        /* renamed from: p */
        public Y94<InterfaceC36185To0> f63992p;

        /* renamed from: q */
        public Y94<InterfaceC48164rd5> f63993q;

        /* renamed from: r */
        public Y94<C31739Ao0> f63994r;

        /* renamed from: s */
        public Y94<InterfaceC50047uo0> f63995s;

        /* renamed from: t */
        public Y94<FlightSheetContext> f63996t;

        /* renamed from: u */
        public Y94<Context> f63997u;

        /* renamed from: v */
        public Y94<C42390ht1> f63998v;

        /* renamed from: w */
        public Y94<C35529Qt1> f63999w;

        /* renamed from: x */
        public Y94<InterfaceC31776As1> f64000x;

        /* renamed from: co.bird.android.feature.fleetstatus.state.list.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C14826a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64001a;

            public C14826a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64001a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64001a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.fleetstatus.state.list.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C14827b implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64002a;

            public C14827b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64002a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f64002a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.feature.fleetstatus.state.list.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C14828c implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64003a;

            public C14828c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64003a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f64003a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.fleetstatus.state.list.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C14829d implements Y94<InterfaceC30556yL> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64004a;

            public C14829d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64004a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC30556yL get() {
                return (InterfaceC30556yL) C51679xZ3.m5003d(this.f64004a.mo27509g3());
            }
        }

        /* renamed from: co.bird.android.feature.fleetstatus.state.list.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C14830e implements Y94<InterfaceC36185To0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64005a;

            public C14830e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64005a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36185To0 get() {
                return (InterfaceC36185To0) C51679xZ3.m5003d(this.f64005a.mo27481q2());
            }
        }

        /* renamed from: co.bird.android.feature.fleetstatus.state.list.a$b$f */
        /* loaded from: classes3.dex */
        public static final class C14831f implements Y94<InterfaceC48164rd5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64006a;

            public C14831f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64006a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC48164rd5 get() {
                return (InterfaceC48164rd5) C51679xZ3.m5003d(this.f64006a.mo27463w());
            }
        }

        /* renamed from: co.bird.android.feature.fleetstatus.state.list.a$b$g */
        /* loaded from: classes3.dex */
        public static final class C14832g implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64007a;

            public C14832g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64007a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64007a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.fleetstatus.state.list.a$b$h */
        /* loaded from: classes3.dex */
        public static final class C14833h implements Y94<InterfaceC46473om3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64008a;

            public C14833h(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64008a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46473om3 get() {
                return (InterfaceC46473om3) C51679xZ3.m5003d(this.f64008a.mo27584F0());
            }
        }

        /* renamed from: co.bird.android.feature.fleetstatus.state.list.a$b$i */
        /* loaded from: classes3.dex */
        public static final class C14834i implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64009a;

            public C14834i(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64009a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f64009a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.fleetstatus.state.list.a$b$j */
        /* loaded from: classes3.dex */
        public static final class C14835j implements Y94<InterfaceC48265rn6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64010a;

            public C14835j(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64010a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC48265rn6 get() {
                return (InterfaceC48265rn6) C51679xZ3.m5003d(this.f64010a.mo27515e3());
            }
        }

        @Override // co.bird.android.feature.fleetstatus.state.list.FleetListActivity.InterfaceC14818a
        /* renamed from: a */
        public void mo58176a(FleetListActivity fleetListActivity) {
            m58173d(fleetListActivity);
        }

        /* renamed from: b */
        public final C35016Oo1 m58175b() {
            return new C35016Oo1((InterfaceC31992Bq1) C51679xZ3.m5003d(this.f63977a.mo27496l1()), (InterfaceC48265rn6) C51679xZ3.m5003d(this.f63977a.mo27515e3()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63977a.mo27519d0()), this.f64000x.get(), this.f63987k.get(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f63977a.mo27461w2()), new C50640vo1(), this.f63978b);
        }

        /* renamed from: c */
        public final void m58174c(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C0846C3 c0846c3, Boolean bool, FlightSheetContext flightSheetContext) {
            this.f63980d = new C14833h(interfaceC44393lG2);
            this.f63981e = new C14829d(interfaceC44393lG2);
            this.f63982f = new C14835j(interfaceC44393lG2);
            C14826a c14826a = new C14826a(interfaceC44393lG2);
            this.f63983g = c14826a;
            this.f63984h = C43419jd4.m30181a(c14826a);
            this.f63985i = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c0846c3);
            this.f63986j = m44621a;
            this.f63987k = V51.m80429b(C39978dp1.m43685a(this.f63985i, m44621a));
            this.f63988l = new C14832g(interfaceC44393lG2);
            this.f63989m = new C14834i(interfaceC44393lG2);
            this.f63990n = C39546d52.m44621a(scopeProvider);
            this.f63991o = new C14827b(interfaceC44393lG2);
            this.f63992p = new C14830e(interfaceC44393lG2);
            C14831f c14831f = new C14831f(interfaceC44393lG2);
            this.f63993q = c14831f;
            C33611Io0 m101706a = C33611Io0.m101706a(this.f63992p, this.f63980d, c14831f, this.f63990n, this.f63987k);
            this.f63994r = m101706a;
            this.f63995s = V51.m80429b(m101706a);
            this.f63996t = C39546d52.m44621a(flightSheetContext);
            C14828c c14828c = new C14828c(interfaceC44393lG2);
            this.f63997u = c14828c;
            C42983it1 m31684a = C42983it1.m31684a(c14828c);
            this.f63998v = m31684a;
            C38825bu1 m62167a = C38825bu1.m62167a(this.f63980d, this.f63981e, this.f63982f, this.f63983g, this.f63984h, this.f63987k, this.f63988l, this.f63989m, this.f63990n, this.f63991o, this.f63995s, this.f63996t, m31684a);
            this.f63999w = m62167a;
            this.f64000x = V51.m80429b(m62167a);
        }

        /* renamed from: d */
        public final FleetListActivity m58173d(FleetListActivity fleetListActivity) {
            C5135Ly.m96068n(fleetListActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63977a.mo27461w2()));
            C5135Ly.m96066p(fleetListActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63977a.mo27595B1()));
            C5135Ly.m96071k(fleetListActivity, (Handler) C51679xZ3.m5003d(this.f63977a.mo27535X2()));
            C5135Ly.m96067o(fleetListActivity, (C22454gl) C51679xZ3.m5003d(this.f63977a.mo27479r()));
            C5135Ly.m96080b(fleetListActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63977a.mo27519d0()));
            C5135Ly.m96075g(fleetListActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f63977a.mo27453z2()));
            C5135Ly.m96064r(fleetListActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f63977a.mo27459x1()));
            C5135Ly.m96081a(fleetListActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f63977a.mo27474s()));
            C5135Ly.m96073i(fleetListActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f63977a.mo27558P0()));
            C5135Ly.m96074h(fleetListActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f63977a.mo27598A0()));
            C5135Ly.m96077e(fleetListActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f63977a.mo27507i0()));
            C5135Ly.m96070l(fleetListActivity, (FO2) C51679xZ3.m5003d(this.f63977a.mo27456y2()));
            C5135Ly.m96065q(fleetListActivity, (YR4) C51679xZ3.m5003d(this.f63977a.mo27525b0()));
            C5135Ly.m96079c(fleetListActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f63977a.mo27460x()));
            C5135Ly.m96078d(fleetListActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63977a.mo27517d3()));
            C5135Ly.m96072j(fleetListActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63977a.mo27482q()));
            C5135Ly.m96076f(fleetListActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f63977a.mo27483p3()));
            C48270ro1.m15374b(fleetListActivity, m58175b());
            C48270ro1.m15373c(fleetListActivity, m58172e());
            return fleetListActivity;
        }

        /* renamed from: e */
        public final C45883nm6 m58172e() {
            return new C45883nm6((InterfaceC31992Bq1) C51679xZ3.m5003d(this.f63977a.mo27496l1()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63977a.mo27519d0()), this.f64000x.get(), this.f63987k.get(), new C50640vo1(), this.f63978b);
        }

        public C14825b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C0846C3 c0846c3, Boolean bool, FlightSheetContext flightSheetContext) {
            this.f63979c = this;
            this.f63977a = interfaceC44393lG2;
            this.f63978b = scopeProvider;
            m58174c(interfaceC44393lG2, baseActivity, scopeProvider, c0846c3, bool, flightSheetContext);
        }
    }

    private C14823a() {
    }

    /* renamed from: a */
    public static FleetListActivity.InterfaceC14818a.InterfaceC14819a m58178a() {
        return new C14824a();
    }
}
