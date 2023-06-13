package p000;
/* renamed from: vV2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50456vV2 {

    /* renamed from: f */
    public static final C50456vV2 f114169f = new C50456vV2(929, 3);

    /* renamed from: a */
    public final int[] f114170a;

    /* renamed from: b */
    public final int[] f114171b;

    /* renamed from: c */
    public final C51049wV2 f114172c;

    /* renamed from: d */
    public final C51049wV2 f114173d;

    /* renamed from: e */
    public final int f114174e;

    public C50456vV2(int i, int i2) {
        this.f114174e = i;
        this.f114170a = new int[i];
        this.f114171b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f114170a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f114171b[this.f114170a[i5]] = i5;
        }
        this.f114172c = new C51049wV2(this, new int[]{0});
        this.f114173d = new C51049wV2(this, new int[]{1});
    }

    /* renamed from: a */
    public int m8593a(int i, int i2) {
        return (i + i2) % this.f114174e;
    }

    /* renamed from: b */
    public C51049wV2 m8592b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f114172c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C51049wV2(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public int m8591c(int i) {
        return this.f114170a[i];
    }

    /* renamed from: d */
    public C51049wV2 m8590d() {
        return this.f114173d;
    }

    /* renamed from: e */
    public int m8589e() {
        return this.f114174e;
    }

    /* renamed from: f */
    public C51049wV2 m8588f() {
        return this.f114172c;
    }

    /* renamed from: g */
    public int m8587g(int i) {
        if (i != 0) {
            return this.f114170a[(this.f114174e - this.f114171b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: h */
    public int m8586h(int i) {
        if (i != 0) {
            return this.f114171b[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public int m8585i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f114170a;
        int[] iArr2 = this.f114171b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f114174e - 1)];
    }

    /* renamed from: j */
    public int m8584j(int i, int i2) {
        int i3 = this.f114174e;
        return ((i + i3) - i2) % i3;
    }
}
