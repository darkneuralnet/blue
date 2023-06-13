package co.bird.android.feature.servicecenter.repairlogger.addrepair;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.repairlogger.addrepair.RepairLoggerAddActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.repairlogger.addrepair.a */
/* loaded from: classes3.dex */
public final class C15665a {

    /* renamed from: co.bird.android.feature.servicecenter.repairlogger.addrepair.a$a */
    /* loaded from: classes3.dex */
    public static final class C15666a implements RepairLoggerAddActivity.InterfaceC15662a.InterfaceC15663a {
        @Override // co.bird.android.feature.servicecenter.repairlogger.addrepair.RepairLoggerAddActivity.InterfaceC15662a.InterfaceC15663a
        /* renamed from: a */
        public RepairLoggerAddActivity.InterfaceC15662a mo56773a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C19960e5 c19960e5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c19960e5);
            return new C15667b(interfaceC44393lG2, baseActivity, scopeProvider, c19960e5);
        }

        private C15666a() {
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.repairlogger.addrepair.a$b */
    /* loaded from: classes3.dex */
    public static final class C15667b implements RepairLoggerAddActivity.InterfaceC15662a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65441a;

        /* renamed from: b */
        public final C15667b f65442b;

        /* renamed from: c */
        public Y94<InterfaceC10636aM> f65443c;

        /* renamed from: d */
        public Y94<ScopeProvider> f65444d;

        /* renamed from: e */
        public Y94<BaseActivity> f65445e;

        /* renamed from: f */
        public Y94<C19960e5> f65446f;

        /* renamed from: g */
        public Y94<C41385gB4> f65447g;

        /* renamed from: h */
        public Y94<InterfaceC40199eB4> f65448h;

        /* renamed from: i */
        public Y94<InterfaceC40099e13> f65449i;

        /* renamed from: j */
        public Y94<InterfaceC29058u7> f65450j;

        /* renamed from: k */
        public Y94<C38996cB4> f65451k;

        /* renamed from: l */
        public Y94<NA4> f65452l;

        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.addrepair.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15668a implements Y94<InterfaceC10636aM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65453a;

            public C15668a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65453a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10636aM get() {
                return (InterfaceC10636aM) C51679xZ3.m5003d(this.f65453a.mo27460x());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.addrepair.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15669b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65454a;

            public C15669b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65454a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65454a.mo27461w2());
            }
        }

        @Override // co.bird.android.feature.servicecenter.repairlogger.addrepair.RepairLoggerAddActivity.InterfaceC15662a
        /* renamed from: a */
        public void mo56772a(RepairLoggerAddActivity repairLoggerAddActivity) {
            m56770c(repairLoggerAddActivity);
        }

        /* renamed from: b */
        public final void m56771b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C19960e5 c19960e5) {
            this.f65443c = new C15668a(interfaceC44393lG2);
            this.f65444d = C39546d52.m44621a(scopeProvider);
            this.f65445e = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c19960e5);
            this.f65446f = m44621a;
            C41978hB4 m36644a = C41978hB4.m36644a(this.f65445e, m44621a);
            this.f65447g = m36644a;
            this.f65448h = V51.m80429b(m36644a);
            this.f65449i = new C15669b(interfaceC44393lG2);
            Y94<InterfaceC29058u7> m80429b = V51.m80429b(C30039x7.m5838a());
            this.f65450j = m80429b;
            C39607dB4 m44544a = C39607dB4.m44544a(this.f65443c, this.f65444d, this.f65448h, this.f65449i, m80429b);
            this.f65451k = m44544a;
            this.f65452l = V51.m80429b(m44544a);
        }

        /* renamed from: c */
        public final RepairLoggerAddActivity m56770c(RepairLoggerAddActivity repairLoggerAddActivity) {
            C5135Ly.m96068n(repairLoggerAddActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65441a.mo27461w2()));
            C5135Ly.m96066p(repairLoggerAddActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65441a.mo27595B1()));
            C5135Ly.m96071k(repairLoggerAddActivity, (Handler) C51679xZ3.m5003d(this.f65441a.mo27535X2()));
            C5135Ly.m96067o(repairLoggerAddActivity, (C22454gl) C51679xZ3.m5003d(this.f65441a.mo27479r()));
            C5135Ly.m96080b(repairLoggerAddActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65441a.mo27519d0()));
            C5135Ly.m96075g(repairLoggerAddActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65441a.mo27453z2()));
            C5135Ly.m96064r(repairLoggerAddActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65441a.mo27459x1()));
            C5135Ly.m96081a(repairLoggerAddActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65441a.mo27474s()));
            C5135Ly.m96073i(repairLoggerAddActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65441a.mo27558P0()));
            C5135Ly.m96074h(repairLoggerAddActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65441a.mo27598A0()));
            C5135Ly.m96077e(repairLoggerAddActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65441a.mo27507i0()));
            C5135Ly.m96070l(repairLoggerAddActivity, (FO2) C51679xZ3.m5003d(this.f65441a.mo27456y2()));
            C5135Ly.m96065q(repairLoggerAddActivity, (YR4) C51679xZ3.m5003d(this.f65441a.mo27525b0()));
            C5135Ly.m96079c(repairLoggerAddActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65441a.mo27460x()));
            C5135Ly.m96078d(repairLoggerAddActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65441a.mo27517d3()));
            C5135Ly.m96072j(repairLoggerAddActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65441a.mo27482q()));
            C5135Ly.m96076f(repairLoggerAddActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65441a.mo27483p3()));
            MA4.m95624b(repairLoggerAddActivity, this.f65452l.get());
            return repairLoggerAddActivity;
        }

        public C15667b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C19960e5 c19960e5) {
            this.f65442b = this;
            this.f65441a = interfaceC44393lG2;
            m56771b(interfaceC44393lG2, baseActivity, scopeProvider, c19960e5);
        }
    }

    private C15665a() {
    }

    /* renamed from: a */
    public static RepairLoggerAddActivity.InterfaceC15662a.InterfaceC15663a m56774a() {
        return new C15666a();
    }
}
