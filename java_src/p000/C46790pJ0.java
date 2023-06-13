package p000;

import p000.InterfaceC32919Fp1;
/* renamed from: pJ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46790pJ0 {

    /* renamed from: pJ0$a */
    /* loaded from: classes3.dex */
    public static final class C27250a implements InterfaceC32919Fp1.InterfaceC2483a {
        @Override // p000.InterfaceC32919Fp1.InterfaceC2483a
        /* renamed from: a */
        public InterfaceC32919Fp1 mo19537a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C27251b(interfaceC44393lG2);
        }

        private C27250a() {
        }
    }

    /* renamed from: pJ0$b */
    /* loaded from: classes3.dex */
    public static final class C27251b implements InterfaceC32919Fp1 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f103446a;

        /* renamed from: b */
        public final C27251b f103447b;

        @Override // p000.InterfaceC32919Fp1
        /* renamed from: a */
        public void mo19536a(C32451Dp1 c32451Dp1) {
            m19534c(c32451Dp1);
        }

        /* renamed from: b */
        public final C38192aq1 m19535b() {
            return new C38192aq1((InterfaceC33387Hp1) C51679xZ3.m5003d(this.f103446a.mo27531Y2()));
        }

        /* renamed from: c */
        public final C32451Dp1 m19534c(C32451Dp1 c32451Dp1) {
            C33153Gp1.m104698b(c32451Dp1, m19535b());
            return c32451Dp1;
        }

        public C27251b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f103447b = this;
            this.f103446a = interfaceC44393lG2;
        }
    }

    private C46790pJ0() {
    }

    /* renamed from: a */
    public static InterfaceC32919Fp1.InterfaceC2483a m19538a() {
        return new C27250a();
    }
}
