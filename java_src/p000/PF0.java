package p000;

import java.io.IOException;
/* renamed from: PF0 */
/* loaded from: classes8.dex */
public class PF0 extends AbstractC7305S {

    /* renamed from: b */
    public final byte[] f28155b;

    public PF0(byte[] bArr) {
        this.f28155b = bArr;
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f28155b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof PF0) {
            return C0210Ao.m115254a(this.f28155b, ((PF0) abstractC7305S).f28155b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 27, this.f28155b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f28155b.length) + 1 + this.f28155b.length;
    }

    public String toString() {
        return m90547z();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    /* renamed from: z */
    public String m90547z() {
        return C46876pS5.m19298b(this.f28155b);
    }
}
