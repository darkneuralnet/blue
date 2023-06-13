package p000;

import java.io.IOException;
/* renamed from: iG0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42612iG0 extends AbstractC0808C {
    public C42612iG0(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89162k(z, 3, (byte) this.f3197c, this.f3196b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f3196b.length + 1) + 1 + this.f3196b.length + 1;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    @Override // p000.AbstractC0808C, p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return this;
    }
}
