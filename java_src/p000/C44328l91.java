package p000;

import p000.AbstractC43142j91;
/* renamed from: l91  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44328l91 extends AbstractC43142j91 {
    private static final long serialVersionUID = 1;

    /* renamed from: g */
    public final int f95641g;

    /* renamed from: h */
    public transient byte[] f95642h;

    /* renamed from: i */
    public transient String f95643i;

    /* renamed from: j */
    public transient String f95644j;

    public C44328l91() {
        this(13, 22, new byte[]{-86, -2, 48, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    }

    /* renamed from: e */
    public final int m27732e(byte[] bArr) {
        if (4 <= bArr.length) {
            return bArr[3];
        }
        return 0;
    }

    /* renamed from: f */
    public byte[] m27731f() {
        if (this.f95642h == null) {
            this.f95642h = R70.m87309b(m40379a(), 4, 12);
        }
        return this.f95642h;
    }

    /* renamed from: g */
    public String m27730g() {
        if (this.f95643i == null) {
            this.f95643i = R70.m87306e(m27731f(), true);
        }
        return this.f95643i;
    }

    @Override // p000.AbstractC43142j91, p000.C35533Qt5, p000.C20674g
    public String toString() {
        if (this.f95644j == null) {
            this.f95644j = String.format("EddyStoneEID(TxPower=%d,EID=%s)", Integer.valueOf(this.f95641g), m27730g());
        }
        return this.f95644j;
    }

    public C44328l91(int i, int i2, byte[] bArr) {
        super(i, i2, bArr, AbstractC43142j91.EnumC24725a.EID);
        this.f95641g = m27732e(bArr);
    }
}
