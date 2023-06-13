package co.bird.android.feature.servicecenter.repairlogger.scan;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.repairlogger.scan.RepairLoggerScanActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.repairlogger.scan.a */
/* loaded from: classes3.dex */
public final class C15684a {

    /* renamed from: co.bird.android.feature.servicecenter.repairlogger.scan.a$a */
    /* loaded from: classes3.dex */
    public static final class C15685a implements RepairLoggerScanActivity.InterfaceC15681a.InterfaceC15682a {
        @Override // co.bird.android.feature.servicecenter.repairlogger.scan.RepairLoggerScanActivity.InterfaceC15681a.InterfaceC15682a
        /* renamed from: a */
        public RepairLoggerScanActivity.InterfaceC15681a mo56748a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C20724g5 c20724g5, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c20724g5);
            C51679xZ3.m5005b(dq3);
            return new C15686b(interfaceC44393lG2, baseActivity, scopeProvider, c20724g5, dq3);
        }

        private C15685a() {
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.repairlogger.scan.a$b */
    /* loaded from: classes3.dex */
    public static final class C15686b implements RepairLoggerScanActivity.InterfaceC15681a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65480a;

        /* renamed from: b */
        public final C15686b f65481b;

        /* renamed from: c */
        public Y94<InterfaceC44647lh6> f65482c;

        /* renamed from: d */
        public Y94<InterfaceC36047Sy6> f65483d;

        /* renamed from: e */
        public Y94<C36207Tq4> f65484e;

        /* renamed from: f */
        public Y94<ScopeProvider> f65485f;

        /* renamed from: g */
        public Y94<InterfaceC40099e13> f65486g;

        /* renamed from: h */
        public Y94<C43038iy6> f65487h;

        /* renamed from: i */
        public Y94<BaseActivity> f65488i;

        /* renamed from: j */
        public Y94<C20724g5> f65489j;

        /* renamed from: k */
        public Y94<KB4> f65490k;

        /* renamed from: l */
        public Y94<JB4> f65491l;

        /* renamed from: m */
        public Y94<DQ3> f65492m;

        /* renamed from: n */
        public Y94<HB4> f65493n;

        /* renamed from: o */
        public Y94<DB4> f65494o;

        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.scan.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15687a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65495a;

            public C15687a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65495a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65495a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.scan.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15688b implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65496a;

            public C15688b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65496a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65496a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.scan.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15689c implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65497a;

            public C15689c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65497a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65497a.mo27459x1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.scan.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15690d implements Y94<InterfaceC36047Sy6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65498a;

            public C15690d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65498a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36047Sy6 get() {
                return (InterfaceC36047Sy6) C51679xZ3.m5003d(this.f65498a.mo27571K2());
            }
        }

        @Override // co.bird.android.feature.servicecenter.repairlogger.scan.RepairLoggerScanActivity.InterfaceC15681a
        /* renamed from: a */
        public void mo56747a(RepairLoggerScanActivity repairLoggerScanActivity) {
            m56745c(repairLoggerScanActivity);
        }

        /* renamed from: b */
        public final void m56746b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C20724g5 c20724g5, DQ3 dq3) {
            this.f65482c = new C15689c(interfaceC44393lG2);
            this.f65483d = new C15690d(interfaceC44393lG2);
            this.f65484e = new C15688b(interfaceC44393lG2);
            this.f65485f = C39546d52.m44621a(scopeProvider);
            C15687a c15687a = new C15687a(interfaceC44393lG2);
            this.f65486g = c15687a;
            this.f65487h = C32303Cy6.m111187a(this.f65482c, this.f65483d, this.f65484e, this.f65485f, c15687a);
            this.f65488i = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c20724g5);
            this.f65489j = m44621a;
            LB4 m97609a = LB4.m97609a(this.f65488i, m44621a);
            this.f65490k = m97609a;
            this.f65491l = V51.m80429b(m97609a);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(dq3);
            this.f65492m = m44621a2;
            IB4 m102820a = IB4.m102820a(this.f65487h, this.f65491l, this.f65485f, this.f65486g, m44621a2);
            this.f65493n = m102820a;
            this.f65494o = V51.m80429b(m102820a);
        }

        /* renamed from: c */
        public final RepairLoggerScanActivity m56745c(RepairLoggerScanActivity repairLoggerScanActivity) {
            C5135Ly.m96068n(repairLoggerScanActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65480a.mo27461w2()));
            C5135Ly.m96066p(repairLoggerScanActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65480a.mo27595B1()));
            C5135Ly.m96071k(repairLoggerScanActivity, (Handler) C51679xZ3.m5003d(this.f65480a.mo27535X2()));
            C5135Ly.m96067o(repairLoggerScanActivity, (C22454gl) C51679xZ3.m5003d(this.f65480a.mo27479r()));
            C5135Ly.m96080b(repairLoggerScanActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65480a.mo27519d0()));
            C5135Ly.m96075g(repairLoggerScanActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65480a.mo27453z2()));
            C5135Ly.m96064r(repairLoggerScanActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65480a.mo27459x1()));
            C5135Ly.m96081a(repairLoggerScanActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65480a.mo27474s()));
            C5135Ly.m96073i(repairLoggerScanActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65480a.mo27558P0()));
            C5135Ly.m96074h(repairLoggerScanActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65480a.mo27598A0()));
            C5135Ly.m96077e(repairLoggerScanActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65480a.mo27507i0()));
            C5135Ly.m96070l(repairLoggerScanActivity, (FO2) C51679xZ3.m5003d(this.f65480a.mo27456y2()));
            C5135Ly.m96065q(repairLoggerScanActivity, (YR4) C51679xZ3.m5003d(this.f65480a.mo27525b0()));
            C5135Ly.m96079c(repairLoggerScanActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65480a.mo27460x()));
            C5135Ly.m96078d(repairLoggerScanActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65480a.mo27517d3()));
            C5135Ly.m96072j(repairLoggerScanActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65480a.mo27482q()));
            C5135Ly.m96076f(repairLoggerScanActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65480a.mo27483p3()));
            CB4.m112664b(repairLoggerScanActivity, this.f65494o.get());
            return repairLoggerScanActivity;
        }

        public C15686b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C20724g5 c20724g5, DQ3 dq3) {
            this.f65481b = this;
            this.f65480a = interfaceC44393lG2;
            m56746b(interfaceC44393lG2, baseActivity, scopeProvider, c20724g5, dq3);
        }
    }

    private C15684a() {
    }

    /* renamed from: a */
    public static RepairLoggerScanActivity.InterfaceC15681a.InterfaceC15682a m56749a() {
        return new C15685a();
    }
}
