package p000;

import java.lang.reflect.Array;
/* renamed from: Rx */
/* loaded from: classes6.dex */
public final class C7300Rx {

    /* renamed from: a */
    public final C8156Tx[] f32930a;

    /* renamed from: b */
    public int f32931b;

    /* renamed from: c */
    public final int f32932c;

    /* renamed from: d */
    public final int f32933d;

    public C7300Rx(int i, int i2) {
        C8156Tx[] c8156TxArr = new C8156Tx[i];
        this.f32930a = c8156TxArr;
        int length = c8156TxArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f32930a[i3] = new C8156Tx(((i2 + 4) * 17) + 1);
        }
        this.f32933d = i2 * 17;
        this.f32932c = i;
        this.f32931b = -1;
    }

    /* renamed from: a */
    public C8156Tx m86181a() {
        return this.f32930a[this.f32931b];
    }

    /* renamed from: b */
    public byte[][] m86180b(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, this.f32932c * i2, this.f32933d * i);
        int i3 = this.f32932c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f32930a[i4 / i2].m82225b(i);
        }
        return bArr;
    }

    /* renamed from: c */
    public void m86179c() {
        this.f32931b++;
    }
}
