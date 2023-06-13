package p000;

import okhttp3.internal.http2.Settings;
/* renamed from: O70 */
/* loaded from: classes6.dex */
public class O70 {

    /* renamed from: a */
    public byte[] f25907a;

    /* renamed from: b */
    public int f25908b;

    public O70() {
        this.f25907a = new byte[64];
    }

    /* renamed from: a */
    public final O70 m92898a(String str, int i, int i2) {
        int i3;
        int length = str.length();
        int i4 = i;
        int i5 = i4;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt >= 1 && charAt <= 127) {
                i5++;
            } else if (charAt <= 2047) {
                i5 += 2;
            } else {
                i5 += 3;
            }
            i4++;
        }
        if (i5 <= i2) {
            int i6 = this.f25908b;
            int i7 = (i6 - i) - 2;
            if (i7 >= 0) {
                byte[] bArr = this.f25907a;
                bArr[i7] = (byte) (i5 >>> 8);
                bArr[i7 + 1] = (byte) i5;
            }
            if ((i6 + i5) - i > this.f25907a.length) {
                m92897b(i5 - i);
            }
            int i8 = this.f25908b;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 >= 1 && charAt2 <= 127) {
                    i3 = i8 + 1;
                    this.f25907a[i8] = (byte) charAt2;
                } else if (charAt2 <= 2047) {
                    byte[] bArr2 = this.f25907a;
                    int i9 = i8 + 1;
                    bArr2[i8] = (byte) (((charAt2 >> 6) & 31) | 192);
                    i8 = i9 + 1;
                    bArr2[i9] = (byte) ((charAt2 & '?') | 128);
                    i++;
                } else {
                    byte[] bArr3 = this.f25907a;
                    int i10 = i8 + 1;
                    bArr3[i8] = (byte) (((charAt2 >> '\f') & 15) | 224);
                    int i11 = i10 + 1;
                    bArr3[i10] = (byte) (((charAt2 >> 6) & 63) | 128);
                    i3 = i11 + 1;
                    bArr3[i11] = (byte) ((charAt2 & '?') | 128);
                }
                i8 = i3;
                i++;
            }
            this.f25908b = i8;
            return this;
        }
        throw new IllegalArgumentException("UTF8 string too large");
    }

    /* renamed from: b */
    public final void m92897b(int i) {
        byte[] bArr = this.f25907a;
        int length = bArr.length * 2;
        int i2 = this.f25908b;
        int i3 = i + i2;
        if (length <= i3) {
            length = i3;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f25907a = bArr2;
    }

    /* renamed from: c */
    public final O70 m92896c(int i, int i2) {
        int i3 = this.f25908b;
        if (i3 + 2 > this.f25907a.length) {
            m92897b(2);
        }
        byte[] bArr = this.f25907a;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        bArr[i4] = (byte) i2;
        this.f25908b = i4 + 1;
        return this;
    }

    /* renamed from: d */
    public final O70 m92895d(int i, int i2, int i3) {
        int i4 = this.f25908b;
        if (i4 + 4 > this.f25907a.length) {
            m92897b(4);
        }
        byte[] bArr = this.f25907a;
        int i5 = i4 + 1;
        bArr[i4] = (byte) i;
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        int i7 = i6 + 1;
        bArr[i6] = (byte) (i3 >>> 8);
        bArr[i7] = (byte) i3;
        this.f25908b = i7 + 1;
        return this;
    }

    /* renamed from: e */
    public final O70 m92894e(int i, int i2) {
        int i3 = this.f25908b;
        if (i3 + 3 > this.f25907a.length) {
            m92897b(3);
        }
        byte[] bArr = this.f25907a;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        bArr[i5] = (byte) i2;
        this.f25908b = i5 + 1;
        return this;
    }

    /* renamed from: f */
    public final O70 m92893f(int i, int i2, int i3) {
        int i4 = this.f25908b;
        if (i4 + 5 > this.f25907a.length) {
            m92897b(5);
        }
        byte[] bArr = this.f25907a;
        int i5 = i4 + 1;
        bArr[i4] = (byte) i;
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i2 >>> 8);
        int i7 = i6 + 1;
        bArr[i6] = (byte) i2;
        int i8 = i7 + 1;
        bArr[i7] = (byte) (i3 >>> 8);
        bArr[i8] = (byte) i3;
        this.f25908b = i8 + 1;
        return this;
    }

    /* renamed from: g */
    public O70 m92892g(int i) {
        int i2 = this.f25908b;
        int i3 = i2 + 1;
        if (i3 > this.f25907a.length) {
            m92897b(1);
        }
        this.f25907a[i2] = (byte) i;
        this.f25908b = i3;
        return this;
    }

    /* renamed from: h */
    public O70 m92891h(byte[] bArr, int i, int i2) {
        if (this.f25908b + i2 > this.f25907a.length) {
            m92897b(i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.f25907a, this.f25908b, i2);
        }
        this.f25908b += i2;
        return this;
    }

    /* renamed from: i */
    public O70 m92890i(int i) {
        int i2 = this.f25908b;
        if (i2 + 4 > this.f25907a.length) {
            m92897b(4);
        }
        byte[] bArr = this.f25907a;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        this.f25908b = i5 + 1;
        return this;
    }

    /* renamed from: j */
    public O70 m92889j(long j) {
        int i = this.f25908b;
        if (i + 8 > this.f25907a.length) {
            m92897b(8);
        }
        byte[] bArr = this.f25907a;
        int i2 = (int) (j >>> 32);
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        int i7 = (int) j;
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 >>> 24);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >>> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i7 >>> 8);
        bArr[i10] = (byte) i7;
        this.f25908b = i10 + 1;
        return this;
    }

    /* renamed from: k */
    public O70 m92888k(int i) {
        int i2 = this.f25908b;
        if (i2 + 2 > this.f25907a.length) {
            m92897b(2);
        }
        byte[] bArr = this.f25907a;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i3] = (byte) i;
        this.f25908b = i3 + 1;
        return this;
    }

    /* renamed from: l */
    public O70 m92887l(String str) {
        int length = str.length();
        if (length <= 65535) {
            int i = this.f25908b;
            if (i + 2 + length > this.f25907a.length) {
                m92897b(length + 2);
            }
            byte[] bArr = this.f25907a;
            int i2 = i + 1;
            bArr[i] = (byte) (length >>> 8);
            int i3 = i2 + 1;
            bArr[i2] = (byte) length;
            int i4 = 0;
            while (i4 < length) {
                char charAt = str.charAt(i4);
                if (charAt >= 1 && charAt <= 127) {
                    bArr[i3] = (byte) charAt;
                    i4++;
                    i3++;
                } else {
                    this.f25908b = i3;
                    return m92898a(str, i4, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                }
            }
            this.f25908b = i3;
            return this;
        }
        throw new IllegalArgumentException("UTF8 string too large");
    }

    public O70(int i) {
        this.f25907a = new byte[i];
    }

    public O70(byte[] bArr) {
        this.f25907a = bArr;
        this.f25908b = bArr.length;
    }
}
