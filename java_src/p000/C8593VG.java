package p000;

import kotlin.text.Typography;
/* renamed from: VG */
/* loaded from: classes6.dex */
public final class C8593VG extends AbstractC46665p56 {

    /* renamed from: c */
    public final short f38812c;

    /* renamed from: d */
    public final short f38813d;

    public C8593VG(AbstractC46665p56 abstractC46665p56, int i, int i2) {
        super(abstractC46665p56);
        this.f38812c = (short) i;
        this.f38813d = (short) i2;
    }

    @Override // p000.AbstractC46665p56
    /* renamed from: c */
    public void mo19970c(C1027CT c1027ct, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f38813d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    c1027ct.m112221f(31, 5);
                    short s2 = this.f38813d;
                    if (s2 > 62) {
                        c1027ct.m112221f(s2 - 31, 16);
                    } else if (i == 0) {
                        c1027ct.m112221f(Math.min((int) s2, 31), 5);
                    } else {
                        c1027ct.m112221f(s2 - 31, 5);
                    }
                }
                c1027ct.m112221f(bArr[this.f38812c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f38812c);
        sb.append("::");
        sb.append((this.f38812c + this.f38813d) - 1);
        sb.append(Typography.greater);
        return sb.toString();
    }
}
