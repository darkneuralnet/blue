package p000;
/* renamed from: he8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42247he8 {

    /* renamed from: a */
    public final C47793qz7 f85630a;

    /* renamed from: b */
    public final C38159am8 f85631b;

    /* renamed from: c */
    public final C38159am8 f85632c;

    /* renamed from: d */
    public final C46780pH8 f85633d;

    public C42247he8() {
        C47793qz7 c47793qz7 = new C47793qz7();
        this.f85630a = c47793qz7;
        C38159am8 c38159am8 = new C38159am8(null, c47793qz7);
        this.f85632c = c38159am8;
        this.f85631b = c38159am8.m70758a();
        C46780pH8 c46780pH8 = new C46780pH8();
        this.f85633d = c46780pH8;
        c38159am8.m70752g("require", new Bv9(c46780pH8));
        c46780pH8.m19570a("internal.platform", Z58.f47840b);
        c38159am8.m70752g("runtime.counter", new C44105km7(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final InterfaceC37164Xs7 m36114a(C38159am8 c38159am8, C32485Ds8... c32485Ds8Arr) {
        InterfaceC37164Xs7 interfaceC37164Xs7 = InterfaceC37164Xs7.f44125h0;
        for (C32485Ds8 c32485Ds8 : c32485Ds8Arr) {
            interfaceC37164Xs7 = C40194eA8.m43154a(c32485Ds8);
            C38822bt8.m62181c(this.f85632c);
            if ((interfaceC37164Xs7 instanceof C34365Lt7) || (interfaceC37164Xs7 instanceof C42386hs7)) {
                interfaceC37164Xs7 = this.f85630a.m16705a(c38159am8, interfaceC37164Xs7);
            }
        }
        return interfaceC37164Xs7;
    }
}
