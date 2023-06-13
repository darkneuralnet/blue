package co.bird.android.feature.ownedbirds;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.ownedbirds.PrivateBirdsOverviewActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.ownedbirds.c */
/* loaded from: classes3.dex */
public final class C15081c {

    /* renamed from: co.bird.android.feature.ownedbirds.c$a */
    /* loaded from: classes3.dex */
    public static final class C15082a implements PrivateBirdsOverviewActivity.InterfaceC15059a.InterfaceC15060a {
        @Override // co.bird.android.feature.ownedbirds.PrivateBirdsOverviewActivity.InterfaceC15059a.InterfaceC15060a
        /* renamed from: a */
        public PrivateBirdsOverviewActivity.InterfaceC15059a mo57796a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7060R4 c7060r4, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c7060r4);
            C51679xZ3.m5005b(dq3);
            return new C15083b(interfaceC44393lG2, baseActivity, scopeProvider, c7060r4, dq3);
        }

        private C15082a() {
        }
    }

    /* renamed from: co.bird.android.feature.ownedbirds.c$b */
    /* loaded from: classes3.dex */
    public static final class C15083b implements PrivateBirdsOverviewActivity.InterfaceC15059a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64389a;

        /* renamed from: b */
        public final ScopeProvider f64390b;

        /* renamed from: c */
        public final BaseActivity f64391c;

        /* renamed from: d */
        public final C7060R4 f64392d;

        /* renamed from: e */
        public final DQ3 f64393e;

        /* renamed from: f */
        public final C15083b f64394f;

        @Override // co.bird.android.feature.ownedbirds.PrivateBirdsOverviewActivity.InterfaceC15059a
        /* renamed from: a */
        public void mo57795a(PrivateBirdsOverviewActivity privateBirdsOverviewActivity) {
            m57794b(privateBirdsOverviewActivity);
        }

        /* renamed from: b */
        public final PrivateBirdsOverviewActivity m57794b(PrivateBirdsOverviewActivity privateBirdsOverviewActivity) {
            C5135Ly.m96068n(privateBirdsOverviewActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64389a.mo27461w2()));
            C5135Ly.m96066p(privateBirdsOverviewActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64389a.mo27595B1()));
            C5135Ly.m96071k(privateBirdsOverviewActivity, (Handler) C51679xZ3.m5003d(this.f64389a.mo27535X2()));
            C5135Ly.m96067o(privateBirdsOverviewActivity, (C22454gl) C51679xZ3.m5003d(this.f64389a.mo27479r()));
            C5135Ly.m96080b(privateBirdsOverviewActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64389a.mo27519d0()));
            C5135Ly.m96075g(privateBirdsOverviewActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64389a.mo27453z2()));
            C5135Ly.m96064r(privateBirdsOverviewActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64389a.mo27459x1()));
            C5135Ly.m96081a(privateBirdsOverviewActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64389a.mo27474s()));
            C5135Ly.m96073i(privateBirdsOverviewActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64389a.mo27558P0()));
            C5135Ly.m96074h(privateBirdsOverviewActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64389a.mo27598A0()));
            C5135Ly.m96077e(privateBirdsOverviewActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64389a.mo27507i0()));
            C5135Ly.m96070l(privateBirdsOverviewActivity, (FO2) C51679xZ3.m5003d(this.f64389a.mo27456y2()));
            C5135Ly.m96065q(privateBirdsOverviewActivity, (YR4) C51679xZ3.m5003d(this.f64389a.mo27525b0()));
            C5135Ly.m96079c(privateBirdsOverviewActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64389a.mo27460x()));
            C5135Ly.m96078d(privateBirdsOverviewActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64389a.mo27517d3()));
            C5135Ly.m96072j(privateBirdsOverviewActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64389a.mo27482q()));
            C5135Ly.m96076f(privateBirdsOverviewActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64389a.mo27483p3()));
            J54.m101175b(privateBirdsOverviewActivity, m57792d());
            return privateBirdsOverviewActivity;
        }

        /* renamed from: c */
        public final L54 m57793c() {
            return new L54((Context) C51679xZ3.m5003d(this.f64389a.mo27552R1()), (C36207Tq4) C51679xZ3.m5003d(this.f64389a.mo27595B1()));
        }

        /* renamed from: d */
        public final C40743f64 m57792d() {
            return new C40743f64((C36207Tq4) C51679xZ3.m5003d(this.f64389a.mo27595B1()), this.f64390b, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64389a.mo27461w2()), m57791e(), (InterfaceC48164rd5) C51679xZ3.m5003d(this.f64389a.mo27463w()), m57793c(), (InterfaceC47256q54) C51679xZ3.m5003d(this.f64389a.mo27582F2()), this.f64393e);
        }

        /* renamed from: e */
        public final C43115j64 m57791e() {
            return new C43115j64(this.f64391c, this.f64392d);
        }

        public C15083b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7060R4 c7060r4, DQ3 dq3) {
            this.f64394f = this;
            this.f64389a = interfaceC44393lG2;
            this.f64390b = scopeProvider;
            this.f64391c = baseActivity;
            this.f64392d = c7060r4;
            this.f64393e = dq3;
        }
    }

    private C15081c() {
    }

    /* renamed from: a */
    public static PrivateBirdsOverviewActivity.InterfaceC15059a.InterfaceC15060a m57797a() {
        return new C15082a();
    }
}
