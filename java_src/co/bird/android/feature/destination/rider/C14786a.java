package co.bird.android.feature.destination.rider;

import android.os.Handler;
import co.bird.android.feature.destination.rider.InterfaceC14790b;
/* renamed from: co.bird.android.feature.destination.rider.a */
/* loaded from: classes3.dex */
public final class C14786a {

    /* renamed from: co.bird.android.feature.destination.rider.a$a */
    /* loaded from: classes3.dex */
    public static final class C14787a implements InterfaceC14790b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63916a;

        /* renamed from: b */
        public final C14787a f63917b;

        /* renamed from: c */
        public Y94<O01> f63918c;

        /* renamed from: d */
        public Y94<O11> f63919d;

        /* renamed from: e */
        public Y94<C19966e8> f63920e;

        /* renamed from: co.bird.android.feature.destination.rider.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C14788a implements Y94<O01> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63921a;

            public C14788a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63921a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public O01 get() {
                return (O01) C51679xZ3.m5003d(this.f63921a.mo27563N0());
            }
        }

        @Override // co.bird.android.feature.destination.rider.InterfaceC14790b
        /* renamed from: a */
        public void mo58228a(DestinationSearchActivity destinationSearchActivity) {
            m58230c(destinationSearchActivity);
        }

        /* renamed from: b */
        public final void m58231b(InterfaceC44393lG2 interfaceC44393lG2, DestinationSearchActivity destinationSearchActivity) {
            C14788a c14788a = new C14788a(interfaceC44393lG2);
            this.f63918c = c14788a;
            Y94<O11> m80429b = V51.m80429b(P11.m91067a(c14788a));
            this.f63919d = m80429b;
            this.f63920e = V51.m80429b(C20234f8.m41967a(m80429b));
        }

        /* renamed from: c */
        public final DestinationSearchActivity m58230c(DestinationSearchActivity destinationSearchActivity) {
            C5135Ly.m96068n(destinationSearchActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63916a.mo27461w2()));
            C5135Ly.m96066p(destinationSearchActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63916a.mo27595B1()));
            C5135Ly.m96071k(destinationSearchActivity, (Handler) C51679xZ3.m5003d(this.f63916a.mo27535X2()));
            C5135Ly.m96067o(destinationSearchActivity, (C22454gl) C51679xZ3.m5003d(this.f63916a.mo27479r()));
            C5135Ly.m96080b(destinationSearchActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63916a.mo27519d0()));
            C5135Ly.m96075g(destinationSearchActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f63916a.mo27453z2()));
            C5135Ly.m96064r(destinationSearchActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f63916a.mo27459x1()));
            C5135Ly.m96081a(destinationSearchActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f63916a.mo27474s()));
            C5135Ly.m96073i(destinationSearchActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f63916a.mo27558P0()));
            C5135Ly.m96074h(destinationSearchActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f63916a.mo27598A0()));
            C5135Ly.m96077e(destinationSearchActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f63916a.mo27507i0()));
            C5135Ly.m96070l(destinationSearchActivity, (FO2) C51679xZ3.m5003d(this.f63916a.mo27456y2()));
            C5135Ly.m96065q(destinationSearchActivity, (YR4) C51679xZ3.m5003d(this.f63916a.mo27525b0()));
            C5135Ly.m96079c(destinationSearchActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f63916a.mo27460x()));
            C5135Ly.m96078d(destinationSearchActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63916a.mo27517d3()));
            C5135Ly.m96072j(destinationSearchActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63916a.mo27482q()));
            C5135Ly.m96076f(destinationSearchActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f63916a.mo27483p3()));
            J11.m101388c(destinationSearchActivity, this.f63919d.get());
            J11.m101390a(destinationSearchActivity, this.f63920e.get());
            return destinationSearchActivity;
        }

        public C14787a(InterfaceC44393lG2 interfaceC44393lG2, DestinationSearchActivity destinationSearchActivity) {
            this.f63917b = this;
            this.f63916a = interfaceC44393lG2;
            m58231b(interfaceC44393lG2, destinationSearchActivity);
        }
    }

    /* renamed from: co.bird.android.feature.destination.rider.a$b */
    /* loaded from: classes3.dex */
    public static final class C14789b implements InterfaceC14790b.InterfaceC14791a {
        @Override // co.bird.android.feature.destination.rider.InterfaceC14790b.InterfaceC14791a
        /* renamed from: a */
        public InterfaceC14790b mo58227a(InterfaceC44393lG2 interfaceC44393lG2, DestinationSearchActivity destinationSearchActivity) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(destinationSearchActivity);
            return new C14787a(interfaceC44393lG2, destinationSearchActivity);
        }

        private C14789b() {
        }
    }

    private C14786a() {
    }

    /* renamed from: a */
    public static InterfaceC14790b.InterfaceC14791a m58232a() {
        return new C14789b();
    }
}
