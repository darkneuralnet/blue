package p000;

import java.io.IOException;
/* renamed from: SF0 */
/* loaded from: classes8.dex */
public class SF0 extends AbstractC7305S {

    /* renamed from: b */
    public final byte[] f33389b;

    public SF0(byte[] bArr) {
        this.f33389b = bArr;
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f33389b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof SF0) {
            return C0210Ao.m115254a(this.f33389b, ((SF0) abstractC7305S).f33389b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 22, this.f33389b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f33389b.length) + 1 + this.f33389b.length;
    }

    public String toString() {
        return m85802z();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    /* renamed from: z */
    public String m85802z() {
        return C46876pS5.m19298b(this.f33389b);
    }
}
