package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
/* renamed from: G70 */
/* loaded from: classes6.dex */
public final class G70 {

    /* renamed from: a */
    public final byte[][] f10985a;

    /* renamed from: b */
    public final int f10986b;

    /* renamed from: c */
    public final int f10987c;

    public G70(int i, int i2) {
        this.f10985a = (byte[][]) Array.newInstance(Byte.TYPE, i2, i);
        this.f10986b = i;
        this.f10987c = i2;
    }

    /* renamed from: a */
    public void m105769a(byte b) {
        for (byte[] bArr : this.f10985a) {
            Arrays.fill(bArr, b);
        }
    }

    /* renamed from: b */
    public byte m105768b(int i, int i2) {
        return this.f10985a[i2][i];
    }

    /* renamed from: c */
    public byte[][] m105767c() {
        return this.f10985a;
    }

    /* renamed from: d */
    public int m105766d() {
        return this.f10987c;
    }

    /* renamed from: e */
    public int m105765e() {
        return this.f10986b;
    }

    /* renamed from: f */
    public void m105764f(int i, int i2, int i3) {
        this.f10985a[i2][i] = (byte) i3;
    }

    /* renamed from: g */
    public void m105763g(int i, int i2, boolean z) {
        this.f10985a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f10986b * 2 * this.f10987c) + 2);
        for (int i = 0; i < this.f10987c; i++) {
            byte[] bArr = this.f10985a[i];
            for (int i2 = 0; i2 < this.f10986b; i2++) {
                byte b = bArr[i2];
                if (b != 0) {
                    if (b != 1) {
                        sb.append("  ");
                    } else {
                        sb.append(" 1");
                    }
                } else {
                    sb.append(" 0");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
