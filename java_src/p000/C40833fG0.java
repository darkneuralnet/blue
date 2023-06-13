package p000;

import java.io.IOException;
/* renamed from: fG0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C40833fG0 extends AbstractC7305S {

    /* renamed from: b */
    public final byte[] f79774b;

    public C40833fG0(byte[] bArr) {
        this.f79774b = C0210Ao.m115251d(bArr);
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f79774b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof C40833fG0) {
            return C0210Ao.m115254a(this.f79774b, ((C40833fG0) abstractC7305S).f79774b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 21, this.f79774b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f79774b.length) + 1 + this.f79774b.length;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }
}
