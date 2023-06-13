package p000;
/* renamed from: cl8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39335cl8 implements Cloneable {

    /* renamed from: f */
    public static final C46468ol8 f61208f = new C46468ol8();

    /* renamed from: b */
    public boolean f61209b;

    /* renamed from: c */
    public int[] f61210c;

    /* renamed from: d */
    public C46468ol8[] f61211d;

    /* renamed from: e */
    public int f61212e;

    public C39335cl8() {
        this(10);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f61212e;
        C39335cl8 c39335cl8 = new C39335cl8(i);
        System.arraycopy(this.f61210c, 0, c39335cl8.f61210c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C46468ol8 c46468ol8 = this.f61211d[i2];
            if (c46468ol8 != null) {
                c39335cl8.f61211d[i2] = (C46468ol8) c46468ol8.clone();
            }
        }
        c39335cl8.f61212e = i;
        return c39335cl8;
    }

    /* renamed from: d */
    public final boolean m60897d() {
        return this.f61212e == 0;
    }

    /* renamed from: e */
    public final C46468ol8 m60896e(int i) {
        return this.f61211d[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39335cl8) {
            C39335cl8 c39335cl8 = (C39335cl8) obj;
            int i = this.f61212e;
            if (i != c39335cl8.f61212e) {
                return false;
            }
            int[] iArr = this.f61210c;
            int[] iArr2 = c39335cl8.f61210c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                C46468ol8[] c46468ol8Arr = this.f61211d;
                C46468ol8[] c46468ol8Arr2 = c39335cl8.f61211d;
                int i3 = this.f61212e;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!c46468ol8Arr[i4].equals(c46468ol8Arr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f61212e; i2++) {
            i = (((i * 31) + this.f61210c[i2]) * 31) + this.f61211d[i2].hashCode();
        }
        return i;
    }

    public final int size() {
        return this.f61212e;
    }

    public C39335cl8(int i) {
        this.f61209b = false;
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f61210c = new int[i5];
        this.f61211d = new C46468ol8[i5];
        this.f61212e = 0;
    }
}
