package co.bird.android.feature.servicecenter;

import android.os.Handler;
import co.bird.android.feature.servicecenter.BarcodeScannerActivity;
/* renamed from: co.bird.android.feature.servicecenter.a */
/* loaded from: classes3.dex */
public final class C15557a {

    /* renamed from: co.bird.android.feature.servicecenter.a$a */
    /* loaded from: classes3.dex */
    public static final class C15558a implements BarcodeScannerActivity.InterfaceC15551a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65244a;

        /* renamed from: b */
        public final C15558a f65245b;

        /* renamed from: c */
        public Y94<InterfaceC33193Gt5> f65246c;

        /* renamed from: d */
        public C28970ty f65247d;

        /* renamed from: e */
        public Y94<InterfaceC28072ry> f65248e;

        /* renamed from: co.bird.android.feature.servicecenter.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C15559a implements Y94<InterfaceC33193Gt5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65249a;

            public C15559a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65249a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC33193Gt5 get() {
                return (InterfaceC33193Gt5) C51679xZ3.m5003d(this.f65249a.mo27534Y());
            }
        }

        @Override // co.bird.android.feature.servicecenter.BarcodeScannerActivity.InterfaceC15551a
        /* renamed from: a */
        public void mo56935a(BarcodeScannerActivity barcodeScannerActivity) {
            m56933c(barcodeScannerActivity);
        }

        /* renamed from: b */
        public final void m56934b(InterfaceC44393lG2 interfaceC44393lG2) {
            C15559a c15559a = new C15559a(interfaceC44393lG2);
            this.f65246c = c15559a;
            C28970ty m11143a = C28970ty.m11143a(c15559a);
            this.f65247d = m11143a;
            this.f65248e = C28487sy.m13307b(m11143a);
        }

        /* renamed from: c */
        public final BarcodeScannerActivity m56933c(BarcodeScannerActivity barcodeScannerActivity) {
            C5135Ly.m96068n(barcodeScannerActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65244a.mo27461w2()));
            C5135Ly.m96066p(barcodeScannerActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65244a.mo27595B1()));
            C5135Ly.m96071k(barcodeScannerActivity, (Handler) C51679xZ3.m5003d(this.f65244a.mo27535X2()));
            C5135Ly.m96067o(barcodeScannerActivity, (C22454gl) C51679xZ3.m5003d(this.f65244a.mo27479r()));
            C5135Ly.m96080b(barcodeScannerActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65244a.mo27519d0()));
            C5135Ly.m96075g(barcodeScannerActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65244a.mo27453z2()));
            C5135Ly.m96064r(barcodeScannerActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65244a.mo27459x1()));
            C5135Ly.m96081a(barcodeScannerActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65244a.mo27474s()));
            C5135Ly.m96073i(barcodeScannerActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65244a.mo27558P0()));
            C5135Ly.m96074h(barcodeScannerActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65244a.mo27598A0()));
            C5135Ly.m96077e(barcodeScannerActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65244a.mo27507i0()));
            C5135Ly.m96070l(barcodeScannerActivity, (FO2) C51679xZ3.m5003d(this.f65244a.mo27456y2()));
            C5135Ly.m96065q(barcodeScannerActivity, (YR4) C51679xZ3.m5003d(this.f65244a.mo27525b0()));
            C5135Ly.m96079c(barcodeScannerActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65244a.mo27460x()));
            C5135Ly.m96078d(barcodeScannerActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65244a.mo27517d3()));
            C5135Ly.m96072j(barcodeScannerActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65244a.mo27482q()));
            C5135Ly.m96076f(barcodeScannerActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65244a.mo27483p3()));
            C9243Wx.m77610b(barcodeScannerActivity, this.f65248e.get());
            return barcodeScannerActivity;
        }

        public C15558a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f65245b = this;
            this.f65244a = interfaceC44393lG2;
            m56934b(interfaceC44393lG2);
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.a$b */
    /* loaded from: classes3.dex */
    public static final class C15560b implements BarcodeScannerActivity.InterfaceC15551a.InterfaceC15552a {

        /* renamed from: a */
        public InterfaceC44393lG2 f65250a;

        @Override // co.bird.android.feature.servicecenter.BarcodeScannerActivity.InterfaceC15551a.InterfaceC15552a
        /* renamed from: b */
        public C15560b mo56931a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f65250a = (InterfaceC44393lG2) C51679xZ3.m5005b(interfaceC44393lG2);
            return this;
        }

        @Override // co.bird.android.feature.servicecenter.BarcodeScannerActivity.InterfaceC15551a.InterfaceC15552a
        public BarcodeScannerActivity.InterfaceC15551a build() {
            C51679xZ3.m5006a(this.f65250a, InterfaceC44393lG2.class);
            return new C15558a(this.f65250a);
        }

        private C15560b() {
        }
    }

    private C15557a() {
    }

    /* renamed from: a */
    public static BarcodeScannerActivity.InterfaceC15551a.InterfaceC15552a m56936a() {
        return new C15560b();
    }
}
