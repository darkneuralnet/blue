package p000;

import java.io.IOException;
/* renamed from: Ov */
/* loaded from: classes8.dex */
public class C6205Ov extends AbstractC8888W {
    public C6205Ov() {
    }

    public C6205Ov(InterfaceC1693E interfaceC1693E) {
        super(interfaceC1693E);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89156q(z, 49, this.f40179b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        int length = this.f40179b.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.f40179b[i2].mo13850c().mo16144s();
        }
        return i + 2 + 2;
    }

    public C6205Ov(C2042F c2042f) {
        super(c2042f, false);
    }

    public C6205Ov(boolean z, InterfaceC1693E[] interfaceC1693EArr) {
        super(z, interfaceC1693EArr);
    }
}
