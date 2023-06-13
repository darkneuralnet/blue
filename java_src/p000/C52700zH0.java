package p000;

import p000.InterfaceC33980Kd0;
/* renamed from: zH0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52700zH0 {

    /* renamed from: zH0$a */
    /* loaded from: classes3.dex */
    public static final class C30950a implements InterfaceC33980Kd0 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f121039a;

        /* renamed from: b */
        public final C30950a f121040b;

        @Override // p000.InterfaceC33980Kd0
        /* renamed from: a */
        public void mo1573a(C33512Id0 c33512Id0) {
            m1571c(c33512Id0);
        }

        /* renamed from: b */
        public final C36086Td0 m1572b() {
            return new C36086Td0((InterfaceC10636aM) C51679xZ3.m5003d(this.f121039a.mo27460x()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f121039a.mo27461w2()));
        }

        /* renamed from: c */
        public final C33512Id0 m1571c(C33512Id0 c33512Id0) {
            C33746Jd0.m100106b(c33512Id0, m1572b());
            return c33512Id0;
        }

        public C30950a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f121040b = this;
            this.f121039a = interfaceC44393lG2;
        }
    }

    /* renamed from: zH0$b */
    /* loaded from: classes3.dex */
    public static final class C30951b implements InterfaceC33980Kd0.InterfaceC4508a {
        @Override // p000.InterfaceC33980Kd0.InterfaceC4508a
        /* renamed from: a */
        public InterfaceC33980Kd0 mo1570a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C30950a(interfaceC44393lG2);
        }

        private C30951b() {
        }
    }

    private C52700zH0() {
    }

    /* renamed from: a */
    public static InterfaceC33980Kd0.InterfaceC4508a m1574a() {
        return new C30951b();
    }
}
