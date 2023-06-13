package co.bird.android.app.feature.wakebirds;

import android.os.Handler;
import co.bird.android.app.feature.wakebirds.WakeSleepBirdsActivity;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.app.feature.wakebirds.a */
/* loaded from: classes2.dex */
public final class C14354a {

    /* renamed from: co.bird.android.app.feature.wakebirds.a$a */
    /* loaded from: classes2.dex */
    public static final class C14355a implements WakeSleepBirdsActivity.InterfaceC14351a.InterfaceC14352a {
        @Override // co.bird.android.app.feature.wakebirds.WakeSleepBirdsActivity.InterfaceC14351a.InterfaceC14352a
        /* renamed from: a */
        public WakeSleepBirdsActivity.InterfaceC14351a mo59323a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DQ3 dq3, C29416v6 c29416v6) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(dq3);
            C51679xZ3.m5005b(c29416v6);
            return new C14356b(interfaceC44393lG2, baseActivity, scopeProvider, dq3, c29416v6);
        }

        private C14355a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.wakebirds.a$b */
    /* loaded from: classes2.dex */
    public static final class C14356b implements WakeSleepBirdsActivity.InterfaceC14351a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f62854a;

        /* renamed from: b */
        public final C14356b f62855b;

        /* renamed from: c */
        public Y94<C36207Tq4> f62856c;

        /* renamed from: d */
        public Y94<InterfaceC46473om3> f62857d;

        /* renamed from: e */
        public Y94<ScopeProvider> f62858e;

        /* renamed from: f */
        public Y94<InterfaceC40099e13> f62859f;

        /* renamed from: g */
        public Y94<BaseActivity> f62860g;

        /* renamed from: h */
        public Y94<C29416v6> f62861h;

        /* renamed from: i */
        public Y94<C49550tx6> f62862i;

        /* renamed from: j */
        public Y94<InterfaceC47772qx6> f62863j;

        /* renamed from: k */
        public Y94<DQ3> f62864k;

        /* renamed from: l */
        public Y94<C45993nx6> f62865l;

        /* renamed from: m */
        public Y94<InterfaceC38860bx6> f62866m;

        /* renamed from: co.bird.android.app.feature.wakebirds.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C14357a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62867a;

            public C14357a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62867a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f62867a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.app.feature.wakebirds.a$b$b */
        /* loaded from: classes2.dex */
        public static final class C14358b implements Y94<InterfaceC46473om3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62868a;

            public C14358b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62868a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46473om3 get() {
                return (InterfaceC46473om3) C51679xZ3.m5003d(this.f62868a.mo27584F0());
            }
        }

        /* renamed from: co.bird.android.app.feature.wakebirds.a$b$c */
        /* loaded from: classes2.dex */
        public static final class C14359c implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62869a;

            public C14359c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62869a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f62869a.mo27595B1());
            }
        }

        @Override // co.bird.android.app.feature.wakebirds.WakeSleepBirdsActivity.InterfaceC14351a
        /* renamed from: a */
        public void mo59322a(WakeSleepBirdsActivity wakeSleepBirdsActivity) {
            m59320c(wakeSleepBirdsActivity);
        }

        /* renamed from: b */
        public final void m59321b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DQ3 dq3, C29416v6 c29416v6) {
            this.f62856c = new C14359c(interfaceC44393lG2);
            this.f62857d = new C14358b(interfaceC44393lG2);
            this.f62858e = C39546d52.m44621a(scopeProvider);
            this.f62859f = new C14357a(interfaceC44393lG2);
            this.f62860g = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c29416v6);
            this.f62861h = m44621a;
            C50143ux6 m9431a = C50143ux6.m9431a(this.f62860g, m44621a);
            this.f62862i = m9431a;
            this.f62863j = V51.m80429b(m9431a);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(dq3);
            this.f62864k = m44621a2;
            C47179px6 m18382a = C47179px6.m18382a(this.f62856c, this.f62857d, this.f62858e, this.f62859f, this.f62863j, m44621a2);
            this.f62865l = m18382a;
            this.f62866m = V51.m80429b(m18382a);
        }

        /* renamed from: c */
        public final WakeSleepBirdsActivity m59320c(WakeSleepBirdsActivity wakeSleepBirdsActivity) {
            C5135Ly.m96068n(wakeSleepBirdsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f62854a.mo27461w2()));
            C5135Ly.m96066p(wakeSleepBirdsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f62854a.mo27595B1()));
            C5135Ly.m96071k(wakeSleepBirdsActivity, (Handler) C51679xZ3.m5003d(this.f62854a.mo27535X2()));
            C5135Ly.m96067o(wakeSleepBirdsActivity, (C22454gl) C51679xZ3.m5003d(this.f62854a.mo27479r()));
            C5135Ly.m96080b(wakeSleepBirdsActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f62854a.mo27519d0()));
            C5135Ly.m96075g(wakeSleepBirdsActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f62854a.mo27453z2()));
            C5135Ly.m96064r(wakeSleepBirdsActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f62854a.mo27459x1()));
            C5135Ly.m96081a(wakeSleepBirdsActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f62854a.mo27474s()));
            C5135Ly.m96073i(wakeSleepBirdsActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f62854a.mo27558P0()));
            C5135Ly.m96074h(wakeSleepBirdsActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f62854a.mo27598A0()));
            C5135Ly.m96077e(wakeSleepBirdsActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f62854a.mo27507i0()));
            C5135Ly.m96070l(wakeSleepBirdsActivity, (FO2) C51679xZ3.m5003d(this.f62854a.mo27456y2()));
            C5135Ly.m96065q(wakeSleepBirdsActivity, (YR4) C51679xZ3.m5003d(this.f62854a.mo27525b0()));
            C5135Ly.m96079c(wakeSleepBirdsActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f62854a.mo27460x()));
            C5135Ly.m96078d(wakeSleepBirdsActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f62854a.mo27517d3()));
            C5135Ly.m96072j(wakeSleepBirdsActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f62854a.mo27482q()));
            C5135Ly.m96076f(wakeSleepBirdsActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f62854a.mo27483p3()));
            C38267ax6.m65206b(wakeSleepBirdsActivity, this.f62866m.get());
            return wakeSleepBirdsActivity;
        }

        public C14356b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DQ3 dq3, C29416v6 c29416v6) {
            this.f62855b = this;
            this.f62854a = interfaceC44393lG2;
            m59321b(interfaceC44393lG2, baseActivity, scopeProvider, dq3, c29416v6);
        }
    }

    private C14354a() {
    }

    /* renamed from: a */
    public static WakeSleepBirdsActivity.InterfaceC14351a.InterfaceC14352a m59324a() {
        return new C14355a();
    }
}
