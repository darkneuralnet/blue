package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: IY8 */
/* loaded from: classes5.dex */
public final class IY8 extends AbstractC39081cK8 implements RandomAccess, CV8, I29 {

    /* renamed from: e */
    public static final IY8 f15883e = new IY8(new long[0], 0, false);

    /* renamed from: c */
    public long[] f15884c;

    /* renamed from: d */
    public int f15885d;

    public IY8() {
        this(new long[10], 0, true);
    }

    /* renamed from: b */
    public static IY8 m101935b() {
        return f15883e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m61580a();
        if (i >= 0 && i <= (i2 = this.f15885d)) {
            long[] jArr = this.f15884c;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f15884c, i, jArr2, i + 1, this.f15885d - i);
                this.f15884c = jArr2;
            }
            this.f15884c[i] = longValue;
            this.f15885d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m101933e(i));
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m61580a();
        Charset charset = XV8.f43341a;
        collection.getClass();
        if (!(collection instanceof IY8)) {
            return super.addAll(collection);
        }
        IY8 iy8 = (IY8) collection;
        int i = iy8.f15885d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15885d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f15884c;
            if (i3 > jArr.length) {
                this.f15884c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(iy8.f15884c, 0, this.f15884c, this.f15885d, iy8.f15885d);
            this.f15885d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void m101934c(long j) {
        m61580a();
        int i = this.f15885d;
        long[] jArr = this.f15884c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f15884c = jArr2;
        }
        long[] jArr3 = this.f15884c;
        int i2 = this.f15885d;
        this.f15885d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String m101933e(int i) {
        int i2 = this.f15885d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IY8)) {
            return super.equals(obj);
        }
        IY8 iy8 = (IY8) obj;
        if (this.f15885d != iy8.f15885d) {
            return false;
        }
        long[] jArr = iy8.f15884c;
        for (int i = 0; i < this.f15885d; i++) {
            if (this.f15884c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m101932f(int i) {
        if (i < 0 || i >= this.f15885d) {
            throw new IndexOutOfBoundsException(m101933e(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m101932f(i);
        return Long.valueOf(this.f15884c[i]);
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15885d; i2++) {
            long j = this.f15884c[i2];
            Charset charset = XV8.f43341a;
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
        int i = this.f15885d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15884c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m61580a();
        m101932f(i);
        long[] jArr = this.f15884c;
        long j = jArr[i];
        if (i < this.f15885d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f15885d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m61580a();
        if (i2 >= i) {
            long[] jArr = this.f15884c;
            System.arraycopy(jArr, i2, jArr, i, this.f15885d - i2);
            this.f15885d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m61580a();
        m101932f(i);
        long[] jArr = this.f15884c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15885d;
    }

    @Override // p000.CV8
    public final long zza(int i) {
        m101932f(i);
        return this.f15884c[i];
    }

    @Override // p000.NV8
    /* renamed from: zze */
    public final CV8 mo21037d(int i) {
        if (i >= this.f15885d) {
            return new IY8(Arrays.copyOf(this.f15884c, i), this.f15885d, true);
        }
        throw new IllegalArgumentException();
    }

    public IY8(long[] jArr, int i, boolean z) {
        super(z);
        this.f15884c = jArr;
        this.f15885d = i;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m101934c(((Long) obj).longValue());
        return true;
    }
}
