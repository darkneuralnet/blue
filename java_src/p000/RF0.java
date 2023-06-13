package p000;

import java.io.IOException;
/* renamed from: RF0 */
/* loaded from: classes8.dex */
public class RF0 extends AbstractC7305S {

    /* renamed from: b */
    public final byte[] f31770b;

    public RF0(byte[] bArr) {
        this.f31770b = C0210Ao.m115251d(bArr);
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f31770b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof RF0) {
            return C0210Ao.m115254a(this.f31770b, ((RF0) abstractC7305S).f31770b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 25, this.f31770b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f31770b.length) + 1 + this.f31770b.length;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }
}
