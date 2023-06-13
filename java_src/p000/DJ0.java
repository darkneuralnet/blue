package p000;

import p000.InterfaceC48310rs1;
/* renamed from: DJ0 */
/* loaded from: classes3.dex */
public final class DJ0 {

    /* renamed from: DJ0$a */
    /* loaded from: classes3.dex */
    public static final class C1443a implements InterfaceC48310rs1.InterfaceC28044a {
        @Override // p000.InterfaceC48310rs1.InterfaceC28044a
        /* renamed from: a */
        public InterfaceC48310rs1 mo15151a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C1444b(interfaceC44393lG2);
        }

        private C1443a() {
        }
    }

    /* renamed from: DJ0$b */
    /* loaded from: classes3.dex */
    public static final class C1444b implements InterfaceC48310rs1 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f5508a;

        /* renamed from: b */
        public final C1444b f5509b;

        @Override // p000.InterfaceC48310rs1
        /* renamed from: a */
        public void mo15152a(C47717qs1 c47717qs1) {
            m110582b(c47717qs1);
        }

        /* renamed from: b */
        public final C47717qs1 m110582b(C47717qs1 c47717qs1) {
            C48902ss1.m13562a(c47717qs1, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f5508a.mo27519d0()));
            return c47717qs1;
        }

        public C1444b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f5509b = this;
            this.f5508a = interfaceC44393lG2;
        }
    }

    private DJ0() {
    }

    /* renamed from: a */
    public static InterfaceC48310rs1.InterfaceC28044a m110583a() {
        return new C1443a();
    }
}
