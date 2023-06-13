package p000;

import kotlin.text.Typography;
/* renamed from: WA5 */
/* loaded from: classes6.dex */
public final class WA5 extends AbstractC46665p56 {

    /* renamed from: c */
    public final short f40512c;

    /* renamed from: d */
    public final short f40513d;

    public WA5(AbstractC46665p56 abstractC46665p56, int i, int i2) {
        super(abstractC46665p56);
        this.f40512c = (short) i;
        this.f40513d = (short) i2;
    }

    @Override // p000.AbstractC46665p56
    /* renamed from: c */
    public void mo19970c(C1027CT c1027ct, byte[] bArr) {
        c1027ct.m112221f(this.f40512c, this.f40513d);
    }

    public String toString() {
        short s = this.f40512c;
        short s2 = this.f40513d;
        int i = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(i | (1 << this.f40513d)).substring(1) + Typography.greater;
    }
}
