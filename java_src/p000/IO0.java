package p000;

import p000.InterfaceC34875Ny4;
/* renamed from: IO0 */
/* loaded from: classes3.dex */
public final class IO0 {

    /* renamed from: IO0$a */
    /* loaded from: classes3.dex */
    public static final class C3523a implements InterfaceC34875Ny4.InterfaceC5776a {
        @Override // p000.InterfaceC34875Ny4.InterfaceC5776a
        /* renamed from: a */
        public InterfaceC34875Ny4 mo93096a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C3524b(new C33237Gy4(), interfaceC44393lG2);
        }

        private C3523a() {
        }
    }

    /* renamed from: IO0$b */
    /* loaded from: classes3.dex */
    public static final class C3524b implements InterfaceC34875Ny4 {

        /* renamed from: a */
        public final C3524b f15426a;

        /* renamed from: b */
        public Y94<InterfaceC1880Ea> f15427b;

        /* renamed from: c */
        public Y94<InterfaceC37857aG6> f15428c;

        /* renamed from: d */
        public Y94<InterfaceC32301Cy4> f15429d;

        /* renamed from: IO0$b$a */
        /* loaded from: classes3.dex */
        public static final class C3525a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15430a;

            public C3525a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15430a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f15430a.mo27519d0());
            }
        }

        /* renamed from: IO0$b$b */
        /* loaded from: classes3.dex */
        public static final class C3526b implements Y94<InterfaceC37857aG6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f15431a;

            public C3526b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f15431a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37857aG6 get() {
                return (InterfaceC37857aG6) C51679xZ3.m5003d(this.f15431a.mo27549T2());
            }
        }

        @Override // p000.InterfaceC34875Ny4
        /* renamed from: a */
        public InterfaceC32301Cy4 mo93097a() {
            return this.f15429d.get();
        }

        /* renamed from: b */
        public final void m102428b(C33237Gy4 c33237Gy4, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f15427b = new C3525a(interfaceC44393lG2);
            C3526b c3526b = new C3526b(interfaceC44393lG2);
            this.f15428c = c3526b;
            this.f15429d = V51.m80429b(C33471Hy4.m103147a(c33237Gy4, this.f15427b, c3526b));
        }

        public C3524b(C33237Gy4 c33237Gy4, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f15426a = this;
            m102428b(c33237Gy4, interfaceC44393lG2);
        }
    }

    private IO0() {
    }

    /* renamed from: a */
    public static InterfaceC34875Ny4.InterfaceC5776a m102429a() {
        return new C3523a();
    }
}
