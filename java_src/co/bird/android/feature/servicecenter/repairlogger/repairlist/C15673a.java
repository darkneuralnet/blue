package co.bird.android.feature.servicecenter.repairlogger.repairlist;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.repairlogger.repairlist.RepairLoggerListActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.repairlogger.repairlist.a */
/* loaded from: classes3.dex */
public final class C15673a {

    /* renamed from: co.bird.android.feature.servicecenter.repairlogger.repairlist.a$a */
    /* loaded from: classes3.dex */
    public static final class C15674a implements RepairLoggerListActivity.InterfaceC15670a.InterfaceC15671a {
        @Override // co.bird.android.feature.servicecenter.repairlogger.repairlist.RepairLoggerListActivity.InterfaceC15670a.InterfaceC15671a
        /* renamed from: a */
        public RepairLoggerListActivity.InterfaceC15670a mo56761a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C20206f5 c20206f5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c20206f5);
            return new C15675b(interfaceC44393lG2, baseActivity, scopeProvider, c20206f5);
        }

        private C15674a() {
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.repairlogger.repairlist.a$b */
    /* loaded from: classes3.dex */
    public static final class C15675b implements RepairLoggerListActivity.InterfaceC15670a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65456a;

        /* renamed from: b */
        public final C15675b f65457b;

        /* renamed from: c */
        public Y94<InterfaceC10636aM> f65458c;

        /* renamed from: d */
        public Y94<C36207Tq4> f65459d;

        /* renamed from: e */
        public Y94<ScopeProvider> f65460e;

        /* renamed from: f */
        public Y94<BaseActivity> f65461f;

        /* renamed from: g */
        public Y94<C20206f5> f65462g;

        /* renamed from: h */
        public Y94<AB4> f65463h;

        /* renamed from: i */
        public Y94<InterfaceC52650zB4> f65464i;

        /* renamed from: j */
        public Y94<InterfaceC40099e13> f65465j;

        /* renamed from: k */
        public Y94<Context> f65466k;

        /* renamed from: l */
        public Y94<HA4> f65467l;

        /* renamed from: m */
        public Y94<FA4> f65468m;

        /* renamed from: n */
        public Y94<C49704uD4> f65469n;

        /* renamed from: o */
        public Y94<InterfaceC47926rD4> f65470o;

        /* renamed from: p */
        public Y94<C22454gl> f65471p;

        /* renamed from: q */
        public Y94<C50871wB4> f65472q;

        /* renamed from: r */
        public Y94<InterfaceC43164jB4> f65473r;

        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.repairlist.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15676a implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65474a;

            public C15676a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65474a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f65474a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.repairlist.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15677b implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65475a;

            public C15677b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65475a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f65475a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.repairlist.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15678c implements Y94<InterfaceC10636aM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65476a;

            public C15678c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65476a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10636aM get() {
                return (InterfaceC10636aM) C51679xZ3.m5003d(this.f65476a.mo27460x());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.repairlist.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15679d implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65477a;

            public C15679d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65477a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65477a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.repairlist.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C15680e implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65478a;

            public C15680e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65478a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65478a.mo27595B1());
            }
        }

        @Override // co.bird.android.feature.servicecenter.repairlogger.repairlist.RepairLoggerListActivity.InterfaceC15670a
        /* renamed from: a */
        public void mo56760a(RepairLoggerListActivity repairLoggerListActivity) {
            m56758c(repairLoggerListActivity);
        }

        /* renamed from: b */
        public final void m56759b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C20206f5 c20206f5) {
            this.f65458c = new C15678c(interfaceC44393lG2);
            this.f65459d = new C15680e(interfaceC44393lG2);
            this.f65460e = C39546d52.m44621a(scopeProvider);
            this.f65461f = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c20206f5);
            this.f65462g = m44621a;
            BB4 m114276a = BB4.m114276a(this.f65461f, m44621a);
            this.f65463h = m114276a;
            this.f65464i = V51.m80429b(m114276a);
            this.f65465j = new C15679d(interfaceC44393lG2);
            C15677b c15677b = new C15677b(interfaceC44393lG2);
            this.f65466k = c15677b;
            IA4 m102825a = IA4.m102825a(c15677b);
            this.f65467l = m102825a;
            this.f65468m = V51.m80429b(m102825a);
            C50296vD4 m9010a = C50296vD4.m9010a(this.f65466k);
            this.f65469n = m9010a;
            this.f65470o = V51.m80429b(m9010a);
            C15676a c15676a = new C15676a(interfaceC44393lG2);
            this.f65471p = c15676a;
            C52057yB4 m3876a = C52057yB4.m3876a(this.f65458c, this.f65459d, this.f65460e, this.f65464i, this.f65465j, this.f65468m, this.f65470o, c15676a);
            this.f65472q = m3876a;
            this.f65473r = V51.m80429b(m3876a);
        }

        /* renamed from: c */
        public final RepairLoggerListActivity m56758c(RepairLoggerListActivity repairLoggerListActivity) {
            C5135Ly.m96068n(repairLoggerListActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65456a.mo27461w2()));
            C5135Ly.m96066p(repairLoggerListActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65456a.mo27595B1()));
            C5135Ly.m96071k(repairLoggerListActivity, (Handler) C51679xZ3.m5003d(this.f65456a.mo27535X2()));
            C5135Ly.m96067o(repairLoggerListActivity, (C22454gl) C51679xZ3.m5003d(this.f65456a.mo27479r()));
            C5135Ly.m96080b(repairLoggerListActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65456a.mo27519d0()));
            C5135Ly.m96075g(repairLoggerListActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65456a.mo27453z2()));
            C5135Ly.m96064r(repairLoggerListActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65456a.mo27459x1()));
            C5135Ly.m96081a(repairLoggerListActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65456a.mo27474s()));
            C5135Ly.m96073i(repairLoggerListActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65456a.mo27558P0()));
            C5135Ly.m96074h(repairLoggerListActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65456a.mo27598A0()));
            C5135Ly.m96077e(repairLoggerListActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65456a.mo27507i0()));
            C5135Ly.m96070l(repairLoggerListActivity, (FO2) C51679xZ3.m5003d(this.f65456a.mo27456y2()));
            C5135Ly.m96065q(repairLoggerListActivity, (YR4) C51679xZ3.m5003d(this.f65456a.mo27525b0()));
            C5135Ly.m96079c(repairLoggerListActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65456a.mo27460x()));
            C5135Ly.m96078d(repairLoggerListActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65456a.mo27517d3()));
            C5135Ly.m96072j(repairLoggerListActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65456a.mo27482q()));
            C5135Ly.m96076f(repairLoggerListActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65456a.mo27483p3()));
            C42571iB4.m34372b(repairLoggerListActivity, this.f65473r.get());
            return repairLoggerListActivity;
        }

        public C15675b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C20206f5 c20206f5) {
            this.f65457b = this;
            this.f65456a = interfaceC44393lG2;
            m56759b(interfaceC44393lG2, baseActivity, scopeProvider, c20206f5);
        }
    }

    private C15673a() {
    }

    /* renamed from: a */
    public static RepairLoggerListActivity.InterfaceC15670a.InterfaceC15671a m56762a() {
        return new C15674a();
    }
}
