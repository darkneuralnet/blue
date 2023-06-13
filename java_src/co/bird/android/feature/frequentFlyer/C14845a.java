package co.bird.android.feature.frequentFlyer;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.frequentFlyer.FrequentFlyerActivity;
import co.bird.android.model.wire.WireFrequentFlyerView;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.frequentFlyer.a */
/* loaded from: classes3.dex */
public final class C14845a {

    /* renamed from: co.bird.android.feature.frequentFlyer.a$a */
    /* loaded from: classes3.dex */
    public static final class C14846a implements FrequentFlyerActivity.InterfaceC14841a.InterfaceC14842a {
        @Override // co.bird.android.feature.frequentFlyer.FrequentFlyerActivity.InterfaceC14841a.InterfaceC14842a
        /* renamed from: a */
        public FrequentFlyerActivity.InterfaceC14841a mo58145a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            return new C14847b(interfaceC44393lG2, baseActivity);
        }

        private C14846a() {
        }
    }

    /* renamed from: co.bird.android.feature.frequentFlyer.a$b */
    /* loaded from: classes3.dex */
    public static final class C14847b implements FrequentFlyerActivity.InterfaceC14841a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64017a;

        /* renamed from: b */
        public final C14847b f64018b;

        /* renamed from: c */
        public Y94<BaseActivity> f64019c;

        /* renamed from: d */
        public Y94<WireFrequentFlyerView> f64020d;

        /* renamed from: e */
        public Y94<C46117oA1> f64021e;

        /* renamed from: f */
        public Y94<InterfaceC45524nA1> f64022f;

        /* renamed from: g */
        public Y94<C36207Tq4> f64023g;

        /* renamed from: h */
        public Y94<InterfaceC40099e13> f64024h;

        /* renamed from: i */
        public Y94<ScopeProvider> f64025i;

        /* renamed from: j */
        public Y94<InterfaceC1880Ea> f64026j;

        /* renamed from: k */
        public Y94<C43152jA1> f64027k;

        /* renamed from: l */
        public Y94<InterfaceC40780fA1> f64028l;

        /* renamed from: co.bird.android.feature.frequentFlyer.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C14848a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64029a;

            public C14848a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64029a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64029a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.frequentFlyer.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C14849b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64030a;

            public C14849b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64030a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64030a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.frequentFlyer.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C14850c implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64031a;

            public C14850c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64031a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f64031a.mo27595B1());
            }
        }

        @Override // co.bird.android.feature.frequentFlyer.FrequentFlyerActivity.InterfaceC14841a
        /* renamed from: a */
        public void mo58144a(FrequentFlyerActivity frequentFlyerActivity) {
            m58142c(frequentFlyerActivity);
        }

        /* renamed from: b */
        public final void m58143b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(baseActivity);
            this.f64019c = m44621a;
            this.f64020d = V51.m80429b(C14851b.m58138a(m44621a));
            C46710pA1 m19853a = C46710pA1.m19853a(this.f64019c);
            this.f64021e = m19853a;
            this.f64022f = V51.m80429b(m19853a);
            this.f64023g = new C14850c(interfaceC44393lG2);
            this.f64024h = new C14849b(interfaceC44393lG2);
            this.f64025i = V51.m80429b(C14852c.m58135a(this.f64019c));
            C14848a c14848a = new C14848a(interfaceC44393lG2);
            this.f64026j = c14848a;
            C43745kA1 m29205a = C43745kA1.m29205a(this.f64020d, this.f64022f, this.f64023g, this.f64024h, this.f64025i, c14848a);
            this.f64027k = m29205a;
            this.f64028l = V51.m80429b(m29205a);
        }

        /* renamed from: c */
        public final FrequentFlyerActivity m58142c(FrequentFlyerActivity frequentFlyerActivity) {
            C5135Ly.m96068n(frequentFlyerActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64017a.mo27461w2()));
            C5135Ly.m96066p(frequentFlyerActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64017a.mo27595B1()));
            C5135Ly.m96071k(frequentFlyerActivity, (Handler) C51679xZ3.m5003d(this.f64017a.mo27535X2()));
            C5135Ly.m96067o(frequentFlyerActivity, (C22454gl) C51679xZ3.m5003d(this.f64017a.mo27479r()));
            C5135Ly.m96080b(frequentFlyerActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64017a.mo27519d0()));
            C5135Ly.m96075g(frequentFlyerActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64017a.mo27453z2()));
            C5135Ly.m96064r(frequentFlyerActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64017a.mo27459x1()));
            C5135Ly.m96081a(frequentFlyerActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64017a.mo27474s()));
            C5135Ly.m96073i(frequentFlyerActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64017a.mo27558P0()));
            C5135Ly.m96074h(frequentFlyerActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64017a.mo27598A0()));
            C5135Ly.m96077e(frequentFlyerActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64017a.mo27507i0()));
            C5135Ly.m96070l(frequentFlyerActivity, (FO2) C51679xZ3.m5003d(this.f64017a.mo27456y2()));
            C5135Ly.m96065q(frequentFlyerActivity, (YR4) C51679xZ3.m5003d(this.f64017a.mo27525b0()));
            C5135Ly.m96079c(frequentFlyerActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64017a.mo27460x()));
            C5135Ly.m96078d(frequentFlyerActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64017a.mo27517d3()));
            C5135Ly.m96072j(frequentFlyerActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64017a.mo27482q()));
            C5135Ly.m96076f(frequentFlyerActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64017a.mo27483p3()));
            C32307Cz1.m111180b(frequentFlyerActivity, this.f64028l.get());
            return frequentFlyerActivity;
        }

        public C14847b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            this.f64018b = this;
            this.f64017a = interfaceC44393lG2;
            m58143b(interfaceC44393lG2, baseActivity);
        }
    }

    private C14845a() {
    }

    /* renamed from: a */
    public static FrequentFlyerActivity.InterfaceC14841a.InterfaceC14842a m58146a() {
        return new C14846a();
    }
}
