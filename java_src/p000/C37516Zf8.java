package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Zf8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37516Zf8 extends AbstractC40966fU7 implements RandomAccess, InterfaceC41131fl8 {

    /* renamed from: e */
    public static final C37516Zf8 f48933e = new C37516Zf8(new long[0], 0, false);

    /* renamed from: c */
    public long[] f48934c;

    /* renamed from: d */
    public int f48935d;

    public C37516Zf8() {
        this(new long[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m41291a();
        if (i >= 0 && i <= (i2 = this.f48935d)) {
            long[] jArr = this.f48934c;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f48934c, i, jArr2, i + 1, this.f48935d - i);
                this.f48934c = jArr2;
            }
            this.f48934c[i] = longValue;
            this.f48935d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m72782e(i));
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m41291a();
        Charset charset = C32791Fa8.f9736a;
        collection.getClass();
        if (!(collection instanceof C37516Zf8)) {
            return super.addAll(collection);
        }
        C37516Zf8 c37516Zf8 = (C37516Zf8) collection;
        int i = c37516Zf8.f48935d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f48935d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f48934c;
            if (i3 > jArr.length) {
                this.f48934c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c37516Zf8.f48934c, 0, this.f48934c, this.f48935d, c37516Zf8.f48935d);
            this.f48935d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final long m72784b(int i) {
        zzh(i);
        return this.f48934c[i];
    }

    /* renamed from: c */
    public final void m72783c(long j) {
        m41291a();
        int i = this.f48935d;
        long[] jArr = this.f48934c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f48934c = jArr2;
        }
        long[] jArr3 = this.f48934c;
        int i2 = this.f48935d;
        this.f48935d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.InterfaceC47544qa8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC47544qa8 mo17376d(int i) {
        if (i >= this.f48935d) {
            return new C37516Zf8(Arrays.copyOf(this.f48934c, i), this.f48935d, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final String m72782e(int i) {
        int i2 = this.f48935d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37516Zf8)) {
            return super.equals(obj);
        }
        C37516Zf8 c37516Zf8 = (C37516Zf8) obj;
        if (this.f48935d != c37516Zf8.f48935d) {
            return false;
        }
        long[] jArr = c37516Zf8.f48934c;
        for (int i = 0; i < this.f48935d; i++) {
            if (this.f48934c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzh(i);
        return Long.valueOf(this.f48934c[i]);
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f48935d; i2++) {
            long j = this.f48934c[i2];
            Charset charset = C32791Fa8.f9736a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f48935d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f48934c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m41291a();
        zzh(i);
        long[] jArr = this.f48934c;
        long j = jArr[i];
        if (i < this.f48935d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f48935d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m41291a();
        if (i2 >= i) {
            long[] jArr = this.f48934c;
            System.arraycopy(jArr, i2, jArr, i, this.f48935d - i2);
            this.f48935d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m41291a();
        zzh(i);
        long[] jArr = this.f48934c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f48935d;
    }

    public final void zzh(int i) {
        if (i < 0 || i >= this.f48935d) {
            throw new IndexOutOfBoundsException(m72782e(i));
        }
    }

    public C37516Zf8(long[] jArr, int i, boolean z) {
        super(z);
        this.f48934c = jArr;
        this.f48935d = i;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m72783c(((Long) obj).longValue());
        return true;
    }
}
