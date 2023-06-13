package co.bird.android.app.feature.birdpay.tutorial;

import android.os.Handler;
import co.bird.android.app.feature.birdpay.tutorial.InterfaceC13683a;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.app.feature.birdpay.tutorial.b */
/* loaded from: classes2.dex */
public final class C13685b {

    /* renamed from: co.bird.android.app.feature.birdpay.tutorial.b$a */
    /* loaded from: classes2.dex */
    public static final class C13686a implements InterfaceC13683a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f61307a;

        /* renamed from: b */
        public final C13686a f61308b;

        /* renamed from: c */
        public Y94<BaseActivity> f61309c;

        /* renamed from: d */
        public Y94<ScopeProvider> f61310d;

        /* renamed from: e */
        public Y94<C9765YO> f61311e;

        /* renamed from: f */
        public Y94<InterfaceC40099e13> f61312f;

        /* renamed from: g */
        public Y94<C36207Tq4> f61313g;

        /* renamed from: h */
        public Y94<InterfaceC1880Ea> f61314h;

        /* renamed from: i */
        public Y94<C8642VO> f61315i;

        /* renamed from: co.bird.android.app.feature.birdpay.tutorial.b$a$a */
        /* loaded from: classes2.dex */
        public static final class C13687a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61316a;

            public C13687a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61316a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61316a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.app.feature.birdpay.tutorial.b$a$b */
        /* loaded from: classes2.dex */
        public static final class C13688b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61317a;

            public C13688b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61317a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f61317a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.app.feature.birdpay.tutorial.b$a$c */
        /* loaded from: classes2.dex */
        public static final class C13689c implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61318a;

            public C13689c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61318a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f61318a.mo27595B1());
            }
        }

        @Override // co.bird.android.app.feature.birdpay.tutorial.InterfaceC13683a
        /* renamed from: a */
        public void mo60802a(BirdPayTutorialActivity birdPayTutorialActivity) {
            m60800c(birdPayTutorialActivity);
        }

        /* renamed from: b */
        public final void m60801b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(baseActivity);
            this.f61309c = m44621a;
            this.f61310d = V51.m80429b(m44621a);
            this.f61311e = V51.m80429b(C10246ZO.m73220a(this.f61309c));
            this.f61312f = new C13688b(interfaceC44393lG2);
            this.f61313g = new C13689c(interfaceC44393lG2);
            C13687a c13687a = new C13687a(interfaceC44393lG2);
            this.f61314h = c13687a;
            this.f61315i = V51.m80429b(C9014WO.m78504a(this.f61310d, this.f61311e, this.f61312f, this.f61313g, c13687a));
        }

        /* renamed from: c */
        public final BirdPayTutorialActivity m60800c(BirdPayTutorialActivity birdPayTutorialActivity) {
            C5135Ly.m96068n(birdPayTutorialActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f61307a.mo27461w2()));
            C5135Ly.m96066p(birdPayTutorialActivity, (C36207Tq4) C51679xZ3.m5003d(this.f61307a.mo27595B1()));
            C5135Ly.m96071k(birdPayTutorialActivity, (Handler) C51679xZ3.m5003d(this.f61307a.mo27535X2()));
            C5135Ly.m96067o(birdPayTutorialActivity, (C22454gl) C51679xZ3.m5003d(this.f61307a.mo27479r()));
            C5135Ly.m96080b(birdPayTutorialActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61307a.mo27519d0()));
            C5135Ly.m96075g(birdPayTutorialActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f61307a.mo27453z2()));
            C5135Ly.m96064r(birdPayTutorialActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f61307a.mo27459x1()));
            C5135Ly.m96081a(birdPayTutorialActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f61307a.mo27474s()));
            C5135Ly.m96073i(birdPayTutorialActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f61307a.mo27558P0()));
            C5135Ly.m96074h(birdPayTutorialActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f61307a.mo27598A0()));
            C5135Ly.m96077e(birdPayTutorialActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f61307a.mo27507i0()));
            C5135Ly.m96070l(birdPayTutorialActivity, (FO2) C51679xZ3.m5003d(this.f61307a.mo27456y2()));
            C5135Ly.m96065q(birdPayTutorialActivity, (YR4) C51679xZ3.m5003d(this.f61307a.mo27525b0()));
            C5135Ly.m96079c(birdPayTutorialActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f61307a.mo27460x()));
            C5135Ly.m96078d(birdPayTutorialActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f61307a.mo27517d3()));
            C5135Ly.m96072j(birdPayTutorialActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f61307a.mo27482q()));
            C5135Ly.m96076f(birdPayTutorialActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f61307a.mo27483p3()));
            C6774QO.m88531b(birdPayTutorialActivity, this.f61315i.get());
            return birdPayTutorialActivity;
        }

        public C13686a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            this.f61308b = this;
            this.f61307a = interfaceC44393lG2;
            m60801b(interfaceC44393lG2, baseActivity);
        }
    }

    /* renamed from: co.bird.android.app.feature.birdpay.tutorial.b$b */
    /* loaded from: classes2.dex */
    public static final class C13690b implements InterfaceC13683a.InterfaceC13684a {
        @Override // co.bird.android.app.feature.birdpay.tutorial.InterfaceC13683a.InterfaceC13684a
        /* renamed from: a */
        public InterfaceC13683a mo60796a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            return new C13686a(interfaceC44393lG2, baseActivity);
        }

        private C13690b() {
        }
    }

    private C13685b() {
    }

    /* renamed from: a */
    public static InterfaceC13683a.InterfaceC13684a m60803a() {
        return new C13690b();
    }
}
