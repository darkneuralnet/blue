package p000;

import java.io.IOException;
/* renamed from: dG0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C39648dG0 extends AbstractC7305S {

    /* renamed from: b */
    public final byte[] f76337b;

    public C39648dG0(byte[] bArr) {
        this.f76337b = bArr;
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f76337b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof C39648dG0) {
            return C0210Ao.m115254a(this.f76337b, ((C39648dG0) abstractC7305S).f76337b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 12, this.f76337b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        return ER5.m109017a(this.f76337b.length) + 1 + this.f76337b.length;
    }

    public String toString() {
        return m44466z();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    /* renamed from: z */
    public String m44466z() {
        return C46876pS5.m19297c(this.f76337b);
    }
}
