package p000;

import p000.InterfaceC47078pn5;
/* renamed from: bQ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38534bQ0 {

    /* renamed from: bQ0$a */
    /* loaded from: classes3.dex */
    public static final class C12383a implements InterfaceC47078pn5.InterfaceC27391a {
        @Override // p000.InterfaceC47078pn5.InterfaceC27391a
        /* renamed from: a */
        public InterfaceC47078pn5 mo18688a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C12384b(interfaceC44393lG2);
        }

        private C12383a() {
        }
    }

    /* renamed from: bQ0$b */
    /* loaded from: classes3.dex */
    public static final class C12384b implements InterfaceC47078pn5 {

        /* renamed from: a */
        public final C12384b f57468a;

        /* renamed from: b */
        public Y94<InterfaceC1880Ea> f57469b;

        /* renamed from: c */
        public Y94<InterfaceC39352cn5> f57470c;

        /* renamed from: bQ0$b$a */
        /* loaded from: classes3.dex */
        public static final class C12385a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f57471a;

            public C12385a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f57471a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f57471a.mo27519d0());
            }
        }

        @Override // p000.InterfaceC47078pn5
        /* renamed from: a */
        public InterfaceC39352cn5 mo18689a() {
            return this.f57470c.get();
        }

        /* renamed from: b */
        public final void m64554b(InterfaceC44393lG2 interfaceC44393lG2) {
            C12385a c12385a = new C12385a(interfaceC44393lG2);
            this.f57469b = c12385a;
            this.f57470c = V51.m80429b(C41148fn5.m40820a(c12385a));
        }

        public C12384b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f57468a = this;
            m64554b(interfaceC44393lG2);
        }
    }

    private C38534bQ0() {
    }

    /* renamed from: a */
    public static InterfaceC47078pn5.InterfaceC27391a m64555a() {
        return new C12383a();
    }
}
