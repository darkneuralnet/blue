package p000;

import java.io.IOException;
/* renamed from: bG0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C38444bG0 extends AbstractC7305S {

    /* renamed from: b */
    public byte[] f57203b;

    public C38444bG0(byte[] bArr) {
        this.f57203b = C0210Ao.m115251d(bArr);
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f57203b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof C38444bG0) {
            return C0210Ao.m115254a(this.f57203b, ((C38444bG0) abstractC7305S).f57203b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 20, this.f57203b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f57203b.length) + 1 + this.f57203b.length;
    }

    public String toString() {
        return m64750z();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    /* renamed from: z */
    public String m64750z() {
        return C46876pS5.m19298b(this.f57203b);
    }
}
