package p000;

import kotlin.KotlinVersion;
import kotlin.UByte;
/* renamed from: JT */
/* loaded from: classes6.dex */
public final class C4088JT {

    /* renamed from: a */
    public final byte[] f17605a;

    /* renamed from: b */
    public int f17606b;

    /* renamed from: c */
    public int f17607c;

    public C4088JT(byte[] bArr) {
        this.f17605a = bArr;
    }

    /* renamed from: a */
    public int m100426a() {
        return ((this.f17605a.length - this.f17606b) * 8) - this.f17607c;
    }

    /* renamed from: b */
    public int m100425b() {
        return this.f17607c;
    }

    /* renamed from: c */
    public int m100424c() {
        return this.f17606b;
    }

    /* renamed from: d */
    public int m100423d(int i) {
        int i2;
        if (i > 0 && i <= 32 && i <= m100426a()) {
            int i3 = this.f17607c;
            int i4 = 0;
            if (i3 > 0) {
                int i5 = 8 - i3;
                if (i < i5) {
                    i2 = i;
                } else {
                    i2 = i5;
                }
                int i6 = i5 - i2;
                byte[] bArr = this.f17605a;
                int i7 = this.f17606b;
                int i8 = (((KotlinVersion.MAX_COMPONENT_VALUE >> (8 - i2)) << i6) & bArr[i7]) >> i6;
                i -= i2;
                int i9 = i3 + i2;
                this.f17607c = i9;
                if (i9 == 8) {
                    this.f17607c = 0;
                    this.f17606b = i7 + 1;
                }
                i4 = i8;
            }
            if (i > 0) {
                while (i >= 8) {
                    int i10 = i4 << 8;
                    byte[] bArr2 = this.f17605a;
                    int i11 = this.f17606b;
                    i4 = (bArr2[i11] & UByte.MAX_VALUE) | i10;
                    this.f17606b = i11 + 1;
                    i -= 8;
                }
                if (i > 0) {
                    int i12 = 8 - i;
                    int i13 = (i4 << i) | ((((KotlinVersion.MAX_COMPONENT_VALUE >> i12) << i12) & this.f17605a[this.f17606b]) >> i12);
                    this.f17607c += i;
                    return i13;
                }
                return i4;
            }
            return i4;
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }
}
