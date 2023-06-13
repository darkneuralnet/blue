package p000;

import p000.InterfaceC37187Xv3;
/* renamed from: iN0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42675iN0 {

    /* renamed from: iN0$a */
    /* loaded from: classes3.dex */
    public static final class C23224a implements InterfaceC37187Xv3.InterfaceC9553a {
        @Override // p000.InterfaceC37187Xv3.InterfaceC9553a
        /* renamed from: a */
        public InterfaceC37187Xv3 mo34052a(InterfaceC44393lG2 interfaceC44393lG2, String str) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C23225b(interfaceC44393lG2, str);
        }

        private C23224a() {
        }
    }

    /* renamed from: iN0$b */
    /* loaded from: classes3.dex */
    public static final class C23225b implements InterfaceC37187Xv3 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f87208a;

        /* renamed from: b */
        public final String f87209b;

        /* renamed from: c */
        public final C23225b f87210c;

        @Override // p000.InterfaceC37187Xv3
        /* renamed from: a */
        public void mo34051a(C36017Sv3 c36017Sv3) {
            m34050b(c36017Sv3);
        }

        /* renamed from: b */
        public final C36017Sv3 m34050b(C36017Sv3 c36017Sv3) {
            C46573ow3.m20256b(c36017Sv3, m34049c());
            return c36017Sv3;
        }

        /* renamed from: c */
        public final C44794lw3 m34049c() {
            return new C44794lw3((InterfaceC46473om3) C51679xZ3.m5003d(this.f87208a.mo27584F0()), this.f87209b, new C35549Qv3(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f87208a.mo27461w2()));
        }

        public C23225b(InterfaceC44393lG2 interfaceC44393lG2, String str) {
            this.f87210c = this;
            this.f87208a = interfaceC44393lG2;
            this.f87209b = str;
        }
    }

    private C42675iN0() {
    }

    /* renamed from: a */
    public static InterfaceC37187Xv3.InterfaceC9553a m34053a() {
        return new C23224a();
    }
}
