package co.bird.android.feature.birdairdiagnostics;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.birdairdiagnostics.BirdAirScanActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.birdairdiagnostics.a */
/* loaded from: classes3.dex */
public final class C14521a {

    /* renamed from: co.bird.android.feature.birdairdiagnostics.a$a */
    /* loaded from: classes3.dex */
    public static final class C14522a implements BirdAirScanActivity.InterfaceC14519a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63276a;

        /* renamed from: b */
        public final ScopeProvider f63277b;

        /* renamed from: c */
        public final C10104Z2 f63278c;

        /* renamed from: d */
        public final C14522a f63279d;

        @Override // co.bird.android.feature.birdairdiagnostics.BirdAirScanActivity.InterfaceC14519a
        /* renamed from: a */
        public void mo58825a(BirdAirScanActivity birdAirScanActivity) {
            m58822d(birdAirScanActivity);
        }

        /* renamed from: b */
        public final C10223ZI m58824b() {
            return new C10223ZI((InterfaceC5225MD) C51679xZ3.m5003d(this.f63276a.mo27513f2()), new C24767jI(), this.f63277b, m58823c());
        }

        /* renamed from: c */
        public final C10626aJ m58823c() {
            return new C10626aJ(this.f63278c);
        }

        /* renamed from: d */
        public final BirdAirScanActivity m58822d(BirdAirScanActivity birdAirScanActivity) {
            C5135Ly.m96068n(birdAirScanActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63276a.mo27461w2()));
            C5135Ly.m96066p(birdAirScanActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63276a.mo27595B1()));
            C5135Ly.m96071k(birdAirScanActivity, (Handler) C51679xZ3.m5003d(this.f63276a.mo27535X2()));
            C5135Ly.m96067o(birdAirScanActivity, (C22454gl) C51679xZ3.m5003d(this.f63276a.mo27479r()));
            C5135Ly.m96080b(birdAirScanActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63276a.mo27519d0()));
            C5135Ly.m96075g(birdAirScanActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f63276a.mo27453z2()));
            C5135Ly.m96064r(birdAirScanActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f63276a.mo27459x1()));
            C5135Ly.m96081a(birdAirScanActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f63276a.mo27474s()));
            C5135Ly.m96073i(birdAirScanActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f63276a.mo27558P0()));
            C5135Ly.m96074h(birdAirScanActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f63276a.mo27598A0()));
            C5135Ly.m96077e(birdAirScanActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f63276a.mo27507i0()));
            C5135Ly.m96070l(birdAirScanActivity, (FO2) C51679xZ3.m5003d(this.f63276a.mo27456y2()));
            C5135Ly.m96065q(birdAirScanActivity, (YR4) C51679xZ3.m5003d(this.f63276a.mo27525b0()));
            C5135Ly.m96079c(birdAirScanActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f63276a.mo27460x()));
            C5135Ly.m96078d(birdAirScanActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63276a.mo27517d3()));
            C5135Ly.m96072j(birdAirScanActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63276a.mo27482q()));
            C5135Ly.m96076f(birdAirScanActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f63276a.mo27483p3()));
            C7106RI.m86977b(birdAirScanActivity, m58824b());
            return birdAirScanActivity;
        }

        public C14522a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10104Z2 c10104z2) {
            this.f63279d = this;
            this.f63276a = interfaceC44393lG2;
            this.f63277b = scopeProvider;
            this.f63278c = c10104z2;
        }
    }

    /* renamed from: co.bird.android.feature.birdairdiagnostics.a$b */
    /* loaded from: classes3.dex */
    public static final class C14523b implements BirdAirScanActivity.InterfaceC14519a.InterfaceC14520a {
        @Override // co.bird.android.feature.birdairdiagnostics.BirdAirScanActivity.InterfaceC14519a.InterfaceC14520a
        /* renamed from: a */
        public BirdAirScanActivity.InterfaceC14519a mo58821a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10104Z2 c10104z2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c10104z2);
            return new C14522a(interfaceC44393lG2, baseActivity, scopeProvider, c10104z2);
        }

        private C14523b() {
        }
    }

    private C14521a() {
    }

    /* renamed from: a */
    public static BirdAirScanActivity.InterfaceC14519a.InterfaceC14520a m58826a() {
        return new C14523b();
    }
}
