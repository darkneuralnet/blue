package p000;

import p000.AbstractC43142j91;
/* renamed from: n91  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45514n91 extends AbstractC43142j91 {
    private static final long serialVersionUID = 1;

    /* renamed from: g */
    public final int f99526g;

    /* renamed from: h */
    public transient byte[] f99527h;

    /* renamed from: i */
    public transient byte[] f99528i;

    /* renamed from: j */
    public transient String f99529j;

    /* renamed from: k */
    public transient String f99530k;

    /* renamed from: l */
    public transient String f99531l;

    public C45514n91() {
        this(23, 22, new byte[]{-86, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    }

    /* renamed from: e */
    public final int m24279e(byte[] bArr) {
        if (4 <= bArr.length) {
            return bArr[3];
        }
        return 0;
    }

    /* renamed from: f */
    public byte[] m24278f() {
        if (this.f99528i == null) {
            this.f99528i = R70.m87309b(m40379a(), 14, 20);
        }
        return this.f99528i;
    }

    /* renamed from: g */
    public String m24277g() {
        if (this.f99530k == null) {
            this.f99530k = R70.m87306e(m24278f(), true);
        }
        return this.f99530k;
    }

    /* renamed from: h */
    public byte[] m24276h() {
        if (this.f99527h == null) {
            this.f99527h = R70.m87309b(m40379a(), 4, 14);
        }
        return this.f99527h;
    }

    /* renamed from: i */
    public String m24275i() {
        if (this.f99529j == null) {
            this.f99529j = R70.m87306e(m24276h(), true);
        }
        return this.f99529j;
    }

    @Override // p000.AbstractC43142j91, p000.C35533Qt5, p000.C20674g
    public String toString() {
        String str = this.f99531l;
        if (str != null) {
            return str;
        }
        String format = String.format("EddyStoneUID(TxPower=%d,NamespaceId=%s,InstanceId=%s)", Integer.valueOf(this.f99526g), m24275i(), m24277g());
        this.f99531l = format;
        return format;
    }

    public C45514n91(int i, int i2, byte[] bArr) {
        super(i, i2, bArr, AbstractC43142j91.EnumC24725a.UID);
        this.f99526g = m24279e(bArr);
    }
}
