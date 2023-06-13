package p000;
/* renamed from: mV3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45122mV3 extends AbstractC52675zE2 {

    /* renamed from: c */
    public final byte[] f98115c;

    /* renamed from: d */
    public final int f98116d;

    /* renamed from: e */
    public final int f98117e;

    /* renamed from: f */
    public final int f98118f;

    /* renamed from: g */
    public final int f98119g;

    public C45122mV3(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 <= i && i4 + i6 <= i2) {
            this.f98115c = bArr;
            this.f98116d = i;
            this.f98117e = i2;
            this.f98118f = i3;
            this.f98119g = i4;
            if (z) {
                m25500h(i5, i6);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    @Override // p000.AbstractC52675zE2
    /* renamed from: b */
    public byte[] mo1617b() {
        int m1615d = m1615d();
        int m1618a = m1618a();
        int i = this.f98116d;
        if (m1615d == i && m1618a == this.f98117e) {
            return this.f98115c;
        }
        int i2 = m1615d * m1618a;
        byte[] bArr = new byte[i2];
        int i3 = (this.f98119g * i) + this.f98118f;
        if (m1615d == i) {
            System.arraycopy(this.f98115c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < m1618a; i4++) {
            System.arraycopy(this.f98115c, i3, bArr, i4 * m1615d, m1615d);
            i3 += this.f98116d;
        }
        return bArr;
    }

    @Override // p000.AbstractC52675zE2
    /* renamed from: c */
    public byte[] mo1616c(int i, byte[] bArr) {
        if (i >= 0 && i < m1618a()) {
            int m1615d = m1615d();
            if (bArr == null || bArr.length < m1615d) {
                bArr = new byte[m1615d];
            }
            System.arraycopy(this.f98115c, ((i + this.f98119g) * this.f98116d) + this.f98118f, bArr, 0, m1615d);
            return bArr;
        }
        throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
    }

    /* renamed from: h */
    public final void m25500h(int i, int i2) {
        byte[] bArr = this.f98115c;
        int i3 = (this.f98119g * this.f98116d) + this.f98118f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f98116d;
        }
    }
}
