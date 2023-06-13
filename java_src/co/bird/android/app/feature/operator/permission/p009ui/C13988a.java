package co.bird.android.app.feature.operator.permission.p009ui;

import android.os.Handler;
import co.bird.android.app.feature.operator.activity.BluetoothEnableChangeReceiver;
import co.bird.android.app.feature.operator.activity.LocationEnableChangeReceiver;
import co.bird.android.app.feature.operator.permission.p009ui.InterfaceC13994b;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
/* renamed from: co.bird.android.app.feature.operator.permission.ui.a */
/* loaded from: classes2.dex */
public final class C13988a {

    /* renamed from: co.bird.android.app.feature.operator.permission.ui.a$a */
    /* loaded from: classes2.dex */
    public static final class C13989a implements InterfaceC13994b.InterfaceC13995a {
        @Override // co.bird.android.app.feature.operator.permission.p009ui.InterfaceC13994b.InterfaceC13995a
        /* renamed from: a */
        public InterfaceC13994b mo60207a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C30411y4 c30411y4, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(lifecycleScopeProvider);
            C51679xZ3.m5005b(c30411y4);
            C51679xZ3.m5005b(dq3);
            return new C13990b(interfaceC44393lG2, baseActivity, lifecycleScopeProvider, c30411y4, dq3);
        }

        private C13989a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.operator.permission.ui.a$b */
    /* loaded from: classes2.dex */
    public static final class C13990b implements InterfaceC13994b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f61910a;

        /* renamed from: b */
        public final C13990b f61911b;

        /* renamed from: c */
        public Y94<InterfaceC49820uQ3> f61912c;

        /* renamed from: d */
        public Y94<LifecycleScopeProvider<EnumC7097RE>> f61913d;

        /* renamed from: e */
        public Y94<BaseActivity> f61914e;

        /* renamed from: f */
        public Y94<C30411y4> f61915f;

        /* renamed from: g */
        public Y94<C40935fR3> f61916g;

        /* renamed from: h */
        public Y94<C36207Tq4> f61917h;

        /* renamed from: i */
        public Y94<InterfaceC40099e13> f61918i;

        /* renamed from: j */
        public Y94<DQ3> f61919j;

        /* renamed from: k */
        public Y94<BluetoothEnableChangeReceiver> f61920k;

        /* renamed from: l */
        public Y94<Observable<Boolean>> f61921l;

        /* renamed from: m */
        public Y94<LocationEnableChangeReceiver> f61922m;

        /* renamed from: n */
        public Y94<Observable<Boolean>> f61923n;

        /* renamed from: o */
        public Y94<C37953aR3> f61924o;

        /* renamed from: co.bird.android.app.feature.operator.permission.ui.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C13991a implements Y94<InterfaceC49820uQ3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61925a;

            public C13991a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61925a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC49820uQ3 get() {
                return (InterfaceC49820uQ3) C51679xZ3.m5003d(this.f61925a.mo27567M());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.permission.ui.a$b$b */
        /* loaded from: classes2.dex */
        public static final class C13992b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61926a;

            public C13992b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61926a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f61926a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.permission.ui.a$b$c */
        /* loaded from: classes2.dex */
        public static final class C13993c implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61927a;

            public C13993c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61927a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f61927a.mo27595B1());
            }
        }

        @Override // co.bird.android.app.feature.operator.permission.p009ui.InterfaceC13994b
        /* renamed from: a */
        public void mo60208a(OperatorPermissionsRequiredActivity operatorPermissionsRequiredActivity) {
            m60213d(operatorPermissionsRequiredActivity);
        }

        /* renamed from: b */
        public final BluetoothEnableChangeReceiver m60215b() {
            return new BluetoothEnableChangeReceiver((InterfaceC49820uQ3) C51679xZ3.m5003d(this.f61910a.mo27567M()));
        }

        /* renamed from: c */
        public final void m60214c(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C30411y4 c30411y4, DQ3 dq3) {
            this.f61912c = new C13991a(interfaceC44393lG2);
            this.f61913d = C39546d52.m44621a(lifecycleScopeProvider);
            this.f61914e = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c30411y4);
            this.f61915f = m44621a;
            this.f61916g = V51.m80429b(C41528gR3.m39474a(this.f61914e, m44621a));
            this.f61917h = new C13993c(interfaceC44393lG2);
            this.f61918i = new C13992b(interfaceC44393lG2);
            this.f61919j = C39546d52.m44621a(dq3);
            C20921gX m39198a = C20921gX.m39198a(this.f61912c);
            this.f61920k = m39198a;
            this.f61921l = V51.m80429b(C32462Dq3.m109856b(m39198a));
            C36952Wv2 m77710a = C36952Wv2.m77710a(this.f61912c);
            this.f61922m = m77710a;
            Y94<Observable<Boolean>> m80429b = V51.m80429b(C32696Eq3.m108332a(m77710a));
            this.f61923n = m80429b;
            this.f61924o = V51.m80429b(C38546bR3.m64534a(this.f61912c, this.f61913d, this.f61916g, this.f61917h, this.f61918i, this.f61919j, this.f61921l, m80429b));
        }

        /* renamed from: d */
        public final OperatorPermissionsRequiredActivity m60213d(OperatorPermissionsRequiredActivity operatorPermissionsRequiredActivity) {
            C5135Ly.m96068n(operatorPermissionsRequiredActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f61910a.mo27461w2()));
            C5135Ly.m96066p(operatorPermissionsRequiredActivity, (C36207Tq4) C51679xZ3.m5003d(this.f61910a.mo27595B1()));
            C5135Ly.m96071k(operatorPermissionsRequiredActivity, (Handler) C51679xZ3.m5003d(this.f61910a.mo27535X2()));
            C5135Ly.m96067o(operatorPermissionsRequiredActivity, (C22454gl) C51679xZ3.m5003d(this.f61910a.mo27479r()));
            C5135Ly.m96080b(operatorPermissionsRequiredActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61910a.mo27519d0()));
            C5135Ly.m96075g(operatorPermissionsRequiredActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f61910a.mo27453z2()));
            C5135Ly.m96064r(operatorPermissionsRequiredActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f61910a.mo27459x1()));
            C5135Ly.m96081a(operatorPermissionsRequiredActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f61910a.mo27474s()));
            C5135Ly.m96073i(operatorPermissionsRequiredActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f61910a.mo27558P0()));
            C5135Ly.m96074h(operatorPermissionsRequiredActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f61910a.mo27598A0()));
            C5135Ly.m96077e(operatorPermissionsRequiredActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f61910a.mo27507i0()));
            C5135Ly.m96070l(operatorPermissionsRequiredActivity, (FO2) C51679xZ3.m5003d(this.f61910a.mo27456y2()));
            C5135Ly.m96065q(operatorPermissionsRequiredActivity, (YR4) C51679xZ3.m5003d(this.f61910a.mo27525b0()));
            C5135Ly.m96079c(operatorPermissionsRequiredActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f61910a.mo27460x()));
            C5135Ly.m96078d(operatorPermissionsRequiredActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f61910a.mo27517d3()));
            C5135Ly.m96072j(operatorPermissionsRequiredActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f61910a.mo27482q()));
            C5135Ly.m96076f(operatorPermissionsRequiredActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f61910a.mo27483p3()));
            C32930Fq3.m106420d(operatorPermissionsRequiredActivity, this.f61924o.get());
            C32930Fq3.m106423a(operatorPermissionsRequiredActivity, m60215b());
            C32930Fq3.m106422b(operatorPermissionsRequiredActivity, m60212e());
            return operatorPermissionsRequiredActivity;
        }

        /* renamed from: e */
        public final LocationEnableChangeReceiver m60212e() {
            return new LocationEnableChangeReceiver((InterfaceC49820uQ3) C51679xZ3.m5003d(this.f61910a.mo27567M()));
        }

        public C13990b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C30411y4 c30411y4, DQ3 dq3) {
            this.f61911b = this;
            this.f61910a = interfaceC44393lG2;
            m60214c(interfaceC44393lG2, baseActivity, lifecycleScopeProvider, c30411y4, dq3);
        }
    }

    private C13988a() {
    }

    /* renamed from: a */
    public static InterfaceC13994b.InterfaceC13995a m60216a() {
        return new C13989a();
    }
}
