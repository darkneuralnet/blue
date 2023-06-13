package p000;

import java.io.IOException;
/* renamed from: YF0 */
/* loaded from: classes8.dex */
public class YF0 extends AbstractC7305S {

    /* renamed from: b */
    public final byte[] f44911b;

    public YF0(byte[] bArr) {
        this.f44911b = bArr;
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f44911b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof YF0) {
            return C0210Ao.m115254a(this.f44911b, ((YF0) abstractC7305S).f44911b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 19, this.f44911b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f44911b.length) + 1 + this.f44911b.length;
    }

    public String toString() {
        return m75296z();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    /* renamed from: z */
    public String m75296z() {
        return C46876pS5.m19298b(this.f44911b);
    }
}
