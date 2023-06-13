package p000;

import java.io.IOException;
/* renamed from: gG0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41426gG0 extends AbstractC7305S {

    /* renamed from: b */
    public final byte[] f81861b;

    public C41426gG0(byte[] bArr) {
        this.f81861b = bArr;
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f81861b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof C41426gG0) {
            return C0210Ao.m115254a(this.f81861b, ((C41426gG0) abstractC7305S).f81861b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 26, this.f81861b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f81861b.length) + 1 + this.f81861b.length;
    }

    public String toString() {
        return m39778z();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    /* renamed from: z */
    public String m39778z() {
        return C46876pS5.m19298b(this.f81861b);
    }
}
