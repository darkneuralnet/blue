package co.bird.android.feature.hardcount.landing;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.hardcount.landing.HardCountLandingActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.hardcount.landing.a */
/* loaded from: classes3.dex */
public final class C14881a {

    /* renamed from: co.bird.android.feature.hardcount.landing.a$a */
    /* loaded from: classes3.dex */
    public static final class C14882a implements HardCountLandingActivity.InterfaceC14878a.InterfaceC14879a {
        @Override // co.bird.android.feature.hardcount.landing.HardCountLandingActivity.InterfaceC14878a.InterfaceC14879a
        /* renamed from: a */
        public HardCountLandingActivity.InterfaceC14878a mo58073a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, DQ3 dq3, ScopeProvider scopeProvider, C3318I3 c3318i3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(dq3);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c3318i3);
            return new C14883b(interfaceC44393lG2, baseActivity, dq3, scopeProvider, c3318i3);
        }

        private C14882a() {
        }
    }

    /* renamed from: co.bird.android.feature.hardcount.landing.a$b */
    /* loaded from: classes3.dex */
    public static final class C14883b implements HardCountLandingActivity.InterfaceC14878a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64074a;

        /* renamed from: b */
        public final BaseActivity f64075b;

        /* renamed from: c */
        public final C3318I3 f64076c;

        /* renamed from: d */
        public final ScopeProvider f64077d;

        /* renamed from: e */
        public final DQ3 f64078e;

        /* renamed from: f */
        public final C14883b f64079f;

        @Override // co.bird.android.feature.hardcount.landing.HardCountLandingActivity.InterfaceC14878a
        /* renamed from: a */
        public void mo58072a(HardCountLandingActivity hardCountLandingActivity) {
            m58069d(hardCountLandingActivity);
        }

        /* renamed from: b */
        public final TF1 m58071b() {
            return new TF1(m58070c(), this.f64077d, this.f64078e, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64074a.mo27461w2()), m58068e(), (XF1) C51679xZ3.m5003d(this.f64074a.mo27569L0()));
        }

        /* renamed from: c */
        public final VF1 m58070c() {
            return new VF1(this.f64075b, this.f64076c);
        }

        /* renamed from: d */
        public final HardCountLandingActivity m58069d(HardCountLandingActivity hardCountLandingActivity) {
            C5135Ly.m96068n(hardCountLandingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64074a.mo27461w2()));
            C5135Ly.m96066p(hardCountLandingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64074a.mo27595B1()));
            C5135Ly.m96071k(hardCountLandingActivity, (Handler) C51679xZ3.m5003d(this.f64074a.mo27535X2()));
            C5135Ly.m96067o(hardCountLandingActivity, (C22454gl) C51679xZ3.m5003d(this.f64074a.mo27479r()));
            C5135Ly.m96080b(hardCountLandingActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64074a.mo27519d0()));
            C5135Ly.m96075g(hardCountLandingActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64074a.mo27453z2()));
            C5135Ly.m96064r(hardCountLandingActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64074a.mo27459x1()));
            C5135Ly.m96081a(hardCountLandingActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64074a.mo27474s()));
            C5135Ly.m96073i(hardCountLandingActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64074a.mo27558P0()));
            C5135Ly.m96074h(hardCountLandingActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64074a.mo27598A0()));
            C5135Ly.m96077e(hardCountLandingActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64074a.mo27507i0()));
            C5135Ly.m96070l(hardCountLandingActivity, (FO2) C51679xZ3.m5003d(this.f64074a.mo27456y2()));
            C5135Ly.m96065q(hardCountLandingActivity, (YR4) C51679xZ3.m5003d(this.f64074a.mo27525b0()));
            C5135Ly.m96079c(hardCountLandingActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64074a.mo27460x()));
            C5135Ly.m96078d(hardCountLandingActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64074a.mo27517d3()));
            C5135Ly.m96072j(hardCountLandingActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64074a.mo27482q()));
            C5135Ly.m96076f(hardCountLandingActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64074a.mo27483p3()));
            FF1.m107381b(hardCountLandingActivity, m58071b());
            return hardCountLandingActivity;
        }

        /* renamed from: e */
        public final C43038iy6 m58068e() {
            return new C43038iy6((InterfaceC44647lh6) C51679xZ3.m5003d(this.f64074a.mo27459x1()), (InterfaceC36047Sy6) C51679xZ3.m5003d(this.f64074a.mo27571K2()), (C36207Tq4) C51679xZ3.m5003d(this.f64074a.mo27595B1()), this.f64077d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64074a.mo27461w2()));
        }

        public C14883b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, DQ3 dq3, ScopeProvider scopeProvider, C3318I3 c3318i3) {
            this.f64079f = this;
            this.f64074a = interfaceC44393lG2;
            this.f64075b = baseActivity;
            this.f64076c = c3318i3;
            this.f64077d = scopeProvider;
            this.f64078e = dq3;
        }
    }

    private C14881a() {
    }

    /* renamed from: a */
    public static HardCountLandingActivity.InterfaceC14878a.InterfaceC14879a m58074a() {
        return new C14882a();
    }
}
