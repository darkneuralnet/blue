package p000;

import java.util.Arrays;
/* renamed from: Pq8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35275Pq8 {

    /* renamed from: e */
    public static final C35275Pq8 f29154e = new C35275Pq8(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f29155a;

    /* renamed from: b */
    public int[] f29156b;

    /* renamed from: c */
    public Object[] f29157c;

    /* renamed from: d */
    public boolean f29158d;

    public C35275Pq8(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f29155a = i;
        this.f29156b = iArr;
        this.f29157c = objArr;
        this.f29158d = z;
    }

    /* renamed from: a */
    public static C35275Pq8 m89701a() {
        return f29154e;
    }

    /* renamed from: b */
    public static C35275Pq8 m89700b(C35275Pq8 c35275Pq8, C35275Pq8 c35275Pq82) {
        int i = c35275Pq8.f29155a + c35275Pq82.f29155a;
        int[] copyOf = Arrays.copyOf(c35275Pq8.f29156b, i);
        System.arraycopy(c35275Pq82.f29156b, 0, copyOf, c35275Pq8.f29155a, c35275Pq82.f29155a);
        Object[] copyOf2 = Arrays.copyOf(c35275Pq8.f29157c, i);
        System.arraycopy(c35275Pq82.f29157c, 0, copyOf2, c35275Pq8.f29155a, c35275Pq82.f29155a);
        return new C35275Pq8(i, copyOf, copyOf2, true);
    }

    /* renamed from: c */
    public static C35275Pq8 m89699c() {
        return new C35275Pq8(0, new int[8], new Object[8], true);
    }

    /* renamed from: d */
    public final void m89698d() {
        this.f29158d = false;
    }

    /* renamed from: e */
    public final void m89697e(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f29155a; i2++) {
            C44679lk8.m26885b(sb, i, String.valueOf(this.f29156b[i2] >>> 3), this.f29157c[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C35275Pq8)) {
            return false;
        }
        C35275Pq8 c35275Pq8 = (C35275Pq8) obj;
        int i = this.f29155a;
        if (i == c35275Pq8.f29155a) {
            int[] iArr = this.f29156b;
            int[] iArr2 = c35275Pq8.f29156b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.f29157c;
                    Object[] objArr2 = c35275Pq8.f29157c;
                    int i3 = this.f29155a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m89696f(int i, Object obj) {
        int i2;
        if (this.f29158d) {
            int i3 = this.f29155a;
            int[] iArr = this.f29156b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f29156b = Arrays.copyOf(iArr, i4);
                this.f29157c = Arrays.copyOf(this.f29157c, i4);
            }
            int[] iArr2 = this.f29156b;
            int i5 = this.f29155a;
            iArr2[i5] = i;
            this.f29157c[i5] = obj;
            this.f29155a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f29155a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f29156b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f29157c;
        int i7 = this.f29155a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    private C35275Pq8() {
        this(0, new int[8], new Object[8], true);
    }
}
