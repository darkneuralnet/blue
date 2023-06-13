package co.bird.android.feature.rider.birdpay.place;

import android.os.Handler;
import co.bird.android.feature.rider.birdpay.place.InterfaceC15477b;
/* renamed from: co.bird.android.feature.rider.birdpay.place.a */
/* loaded from: classes3.dex */
public final class C15468a {

    /* renamed from: co.bird.android.feature.rider.birdpay.place.a$a */
    /* loaded from: classes3.dex */
    public static final class C15469a implements InterfaceC15477b.InterfaceC15478a {
        @Override // co.bird.android.feature.rider.birdpay.place.InterfaceC15477b.InterfaceC15478a
        /* renamed from: a */
        public InterfaceC15477b mo57104a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C15470b(interfaceC44393lG2);
        }

        private C15469a() {
        }
    }

    /* renamed from: co.bird.android.feature.rider.birdpay.place.a$b */
    /* loaded from: classes3.dex */
    public static final class C15470b implements InterfaceC15477b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65092a;

        /* renamed from: b */
        public final C15470b f65093b;

        /* renamed from: c */
        public Y94<InterfaceC1880Ea> f65094c;

        /* renamed from: d */
        public Y94<InterfaceC23227iO> f65095d;

        /* renamed from: e */
        public Y94<InterfaceC49950ue3> f65096e;

        /* renamed from: f */
        public Y94<C36207Tq4> f65097f;

        /* renamed from: g */
        public Y94<InterfaceC40099e13> f65098g;

        /* renamed from: h */
        public Y94<String> f65099h;

        /* renamed from: i */
        public Y94<JU3> f65100i;

        /* renamed from: co.bird.android.feature.rider.birdpay.place.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15471a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65101a;

            public C15471a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65101a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65101a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.rider.birdpay.place.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15472b implements Y94<InterfaceC23227iO> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65102a;

            public C15472b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65102a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC23227iO get() {
                return (InterfaceC23227iO) C51679xZ3.m5003d(this.f65102a.mo27536X1());
            }
        }

        /* renamed from: co.bird.android.feature.rider.birdpay.place.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15473c implements Y94<String> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65103a;

            public C15473c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65103a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public String get() {
                return (String) C51679xZ3.m5003d(this.f65103a.mo24054h());
            }
        }

        /* renamed from: co.bird.android.feature.rider.birdpay.place.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15474d implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65104a;

            public C15474d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65104a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65104a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.rider.birdpay.place.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C15475e implements Y94<InterfaceC49950ue3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65105a;

            public C15475e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65105a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC49950ue3 get() {
                return (InterfaceC49950ue3) C51679xZ3.m5003d(this.f65105a.mo27472s3());
            }
        }

        /* renamed from: co.bird.android.feature.rider.birdpay.place.a$b$f */
        /* loaded from: classes3.dex */
        public static final class C15476f implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65106a;

            public C15476f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65106a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65106a.mo27595B1());
            }
        }

        @Override // co.bird.android.feature.rider.birdpay.place.InterfaceC15477b
        /* renamed from: a */
        public void mo57105a(PlaceInfoActivity placeInfoActivity) {
            m57112c(placeInfoActivity);
        }

        /* renamed from: b */
        public final void m57113b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f65094c = new C15471a(interfaceC44393lG2);
            this.f65095d = new C15472b(interfaceC44393lG2);
            this.f65096e = new C15475e(interfaceC44393lG2);
            this.f65097f = new C15476f(interfaceC44393lG2);
            this.f65098g = new C15474d(interfaceC44393lG2);
            C15473c c15473c = new C15473c(interfaceC44393lG2);
            this.f65099h = c15473c;
            this.f65100i = V51.m80429b(LU3.m96890a(this.f65094c, this.f65095d, this.f65096e, this.f65097f, this.f65098g, c15473c));
        }

        /* renamed from: c */
        public final PlaceInfoActivity m57112c(PlaceInfoActivity placeInfoActivity) {
            C5135Ly.m96068n(placeInfoActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65092a.mo27461w2()));
            C5135Ly.m96066p(placeInfoActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65092a.mo27595B1()));
            C5135Ly.m96071k(placeInfoActivity, (Handler) C51679xZ3.m5003d(this.f65092a.mo27535X2()));
            C5135Ly.m96067o(placeInfoActivity, (C22454gl) C51679xZ3.m5003d(this.f65092a.mo27479r()));
            C5135Ly.m96080b(placeInfoActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65092a.mo27519d0()));
            C5135Ly.m96075g(placeInfoActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65092a.mo27453z2()));
            C5135Ly.m96064r(placeInfoActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65092a.mo27459x1()));
            C5135Ly.m96081a(placeInfoActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65092a.mo27474s()));
            C5135Ly.m96073i(placeInfoActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65092a.mo27558P0()));
            C5135Ly.m96074h(placeInfoActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65092a.mo27598A0()));
            C5135Ly.m96077e(placeInfoActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65092a.mo27507i0()));
            C5135Ly.m96070l(placeInfoActivity, (FO2) C51679xZ3.m5003d(this.f65092a.mo27456y2()));
            C5135Ly.m96065q(placeInfoActivity, (YR4) C51679xZ3.m5003d(this.f65092a.mo27525b0()));
            C5135Ly.m96079c(placeInfoActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65092a.mo27460x()));
            C5135Ly.m96078d(placeInfoActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65092a.mo27517d3()));
            C5135Ly.m96072j(placeInfoActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65092a.mo27482q()));
            C5135Ly.m96076f(placeInfoActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65092a.mo27483p3()));
            C45113mU3.m25523b(placeInfoActivity, this.f65100i.get());
            return placeInfoActivity;
        }

        public C15470b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f65093b = this;
            this.f65092a = interfaceC44393lG2;
            m57113b(interfaceC44393lG2);
        }
    }

    private C15468a() {
    }

    /* renamed from: a */
    public static InterfaceC15477b.InterfaceC15478a m57114a() {
        return new C15469a();
    }
}
