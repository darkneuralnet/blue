package p000;

import java.io.IOException;
/* renamed from: a0 */
/* loaded from: classes8.dex */
public class C10484a0 extends AbstractC7305S {

    /* renamed from: b */
    public byte[] f49626b;

    public C10484a0(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.f49626b = bArr;
        if (!m72138z(0) || !m72138z(1)) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f49626b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof C10484a0) {
            return C0210Ao.m115254a(this.f49626b, ((C10484a0) abstractC7305S).f49626b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 23, this.f49626b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        int length = this.f49626b.length;
        return ER5.m109017a(length) + 1 + length;
    }

    public String toString() {
        return C46876pS5.m19298b(this.f49626b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    /* renamed from: z */
    public final boolean m72138z(int i) {
        byte b;
        byte[] bArr = this.f49626b;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }
}
