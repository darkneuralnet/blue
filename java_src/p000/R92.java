package p000;

import kotlin.UByte;
/* renamed from: R92 */
/* loaded from: classes6.dex */
public final class R92 extends AbstractC52675zE2 {

    /* renamed from: c */
    public final AbstractC52675zE2 f31610c;

    public R92(AbstractC52675zE2 abstractC52675zE2) {
        super(abstractC52675zE2.m1615d(), abstractC52675zE2.m1618a());
        this.f31610c = abstractC52675zE2;
    }

    @Override // p000.AbstractC52675zE2
    /* renamed from: b */
    public byte[] mo1617b() {
        byte[] mo1617b = this.f31610c.mo1617b();
        int m1615d = m1615d() * m1618a();
        byte[] bArr = new byte[m1615d];
        for (int i = 0; i < m1615d; i++) {
            bArr[i] = (byte) (255 - (mo1617b[i] & UByte.MAX_VALUE));
        }
        return bArr;
    }

    @Override // p000.AbstractC52675zE2
    /* renamed from: c */
    public byte[] mo1616c(int i, byte[] bArr) {
        byte[] mo1616c = this.f31610c.mo1616c(i, bArr);
        int m1615d = m1615d();
        for (int i2 = 0; i2 < m1615d; i2++) {
            mo1616c[i2] = (byte) (255 - (mo1616c[i2] & UByte.MAX_VALUE));
        }
        return mo1616c;
    }

    @Override // p000.AbstractC52675zE2
    /* renamed from: f */
    public boolean mo1613f() {
        return this.f31610c.mo1613f();
    }

    @Override // p000.AbstractC52675zE2
    /* renamed from: g */
    public AbstractC52675zE2 mo1612g() {
        return new R92(this.f31610c.mo1612g());
    }
}
