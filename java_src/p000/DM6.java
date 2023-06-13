package p000;

import android.support.annotation.Nullable;
import java.util.Arrays;
/* renamed from: DM6 */
/* loaded from: classes6.dex */
public final class DM6 {

    /* renamed from: a */
    public byte[] f5553a = new byte[4096];

    /* renamed from: b */
    public int f5554b;

    /* renamed from: c */
    public long f5555c;

    /* renamed from: d */
    public long f5556d;

    /* renamed from: e */
    public int f5557e;

    /* renamed from: f */
    public int f5558f;

    /* renamed from: g */
    public int f5559g;

    /* renamed from: h */
    public boolean f5560h;
    @Nullable

    /* renamed from: i */
    public String f5561i;

    public DM6() {
        m110558d();
    }

    /* renamed from: a */
    public final int m110561a(byte[] bArr, int i, int i2) {
        int m110557e = m110557e(30, bArr, i, i2);
        if (m110557e != -1) {
            if (this.f5555c == -1) {
                long m114071b = BM6.m114071b(this.f5553a, 0);
                this.f5555c = m114071b;
                if (m114071b == 67324752) {
                    this.f5560h = false;
                    this.f5556d = BM6.m114071b(this.f5553a, 18);
                    this.f5559g = BM6.m114070c(this.f5553a, 8);
                    this.f5557e = BM6.m114070c(this.f5553a, 26);
                    int m114070c = this.f5557e + 30 + BM6.m114070c(this.f5553a, 28);
                    this.f5558f = m114070c;
                    int length = this.f5553a.length;
                    if (length < m114070c) {
                        do {
                            length += length;
                        } while (length < m114070c);
                        this.f5553a = Arrays.copyOf(this.f5553a, length);
                    }
                } else {
                    this.f5560h = true;
                }
            }
            int m110557e2 = m110557e(this.f5558f, bArr, i + m110557e, i2 - m110557e);
            if (m110557e2 == -1) {
                return -1;
            }
            int i3 = m110557e + m110557e2;
            if (!this.f5560h && this.f5561i == null) {
                this.f5561i = new String(this.f5553a, 30, this.f5557e);
            }
            return i3;
        }
        return -1;
    }

    /* renamed from: b */
    public final C40309eN6 m110560b() {
        int i = this.f5554b;
        int i2 = this.f5558f;
        if (i < i2) {
            return C40309eN6.m42954a(this.f5561i, this.f5556d, this.f5559g, true, Arrays.copyOf(this.f5553a, i), this.f5560h);
        }
        C40309eN6 m42954a = C40309eN6.m42954a(this.f5561i, this.f5556d, this.f5559g, false, Arrays.copyOf(this.f5553a, i2), this.f5560h);
        m110558d();
        return m42954a;
    }

    /* renamed from: c */
    public final int m110559c() {
        return this.f5558f;
    }

    /* renamed from: d */
    public final void m110558d() {
        this.f5554b = 0;
        this.f5557e = -1;
        this.f5555c = -1L;
        this.f5560h = false;
        this.f5558f = 30;
        this.f5556d = -1L;
        this.f5559g = -1;
        this.f5561i = null;
    }

    /* renamed from: e */
    public final int m110557e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f5554b;
        if (i4 < i) {
            int min = Math.min(i3, i - i4);
            System.arraycopy(bArr, i2, this.f5553a, this.f5554b, min);
            int i5 = this.f5554b + min;
            this.f5554b = i5;
            if (i5 < i) {
                return -1;
            }
            return min;
        }
        return 0;
    }
}
