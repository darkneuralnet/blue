package p000;
/* renamed from: ux1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50138ux1 {

    /* renamed from: c */
    public static final int[][] f113237c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    public final EnumC41074fg1 f113238a;

    /* renamed from: b */
    public final byte f113239b;

    public C50138ux1(int i) {
        this.f113238a = EnumC41074fg1.m41045a((i >> 3) & 3);
        this.f113239b = (byte) (i & 7);
    }

    /* renamed from: a */
    public static C50138ux1 m9441a(int i, int i2) {
        C50138ux1 m9440b = m9440b(i, i2);
        if (m9440b != null) {
            return m9440b;
        }
        return m9440b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    public static C50138ux1 m9440b(int i, int i2) {
        int[][] iArr;
        int m9437e;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr2 : f113237c) {
            int i5 = iArr2[0];
            if (i5 != i && i5 != i2) {
                int m9437e2 = m9437e(i, i5);
                if (m9437e2 < i3) {
                    i4 = iArr2[1];
                    i3 = m9437e2;
                }
                if (i != i2 && (m9437e = m9437e(i2, i5)) < i3) {
                    i4 = iArr2[1];
                    i3 = m9437e;
                }
            } else {
                return new C50138ux1(iArr2[1]);
            }
        }
        if (i3 <= 3) {
            return new C50138ux1(i4);
        }
        return null;
    }

    /* renamed from: e */
    public static int m9437e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* renamed from: c */
    public byte m9439c() {
        return this.f113239b;
    }

    /* renamed from: d */
    public EnumC41074fg1 m9438d() {
        return this.f113238a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C50138ux1)) {
            return false;
        }
        C50138ux1 c50138ux1 = (C50138ux1) obj;
        if (this.f113238a != c50138ux1.f113238a || this.f113239b != c50138ux1.f113239b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f113238a.ordinal() << 3) | this.f113239b;
    }
}
