package p000;

import java.io.IOException;
/* renamed from: Mv */
/* loaded from: classes8.dex */
public class C5424Mv extends AbstractC8166U {
    public C5424Mv() {
    }

    public C5424Mv(C2042F c2042f) {
        super(c2042f);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89156q(z, 48, this.f36590b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        int length = this.f36590b.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.f36590b[i2].mo13850c().mo16144s();
        }
        return i + 2 + 2;
    }
}
