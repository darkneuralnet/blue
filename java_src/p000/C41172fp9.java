package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: fp9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41172fp9 extends AbstractC44037kf9<Long> implements RandomAccess, InterfaceC44147kq9 {

    /* renamed from: e */
    public static final C41172fp9 f80772e;

    /* renamed from: c */
    public long[] f80773c;

    /* renamed from: d */
    public int f80774d;

    static {
        C41172fp9 c41172fp9 = new C41172fp9(new long[0], 0);
        f80772e = c41172fp9;
        c41172fp9.zzb();
    }

    public C41172fp9() {
        this(new long[10], 0);
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m28655a();
        if (i >= 0 && i <= (i2 = this.f80774d)) {
            long[] jArr = this.f80773c;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f80773c, i, jArr2, i + 1, this.f80774d - i);
                this.f80773c = jArr2;
            }
            this.f80773c[i] = longValue;
            this.f80774d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m40782e(i));
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m28655a();
        Fn9.m106450e(collection);
        if (!(collection instanceof C41172fp9)) {
            return super.addAll(collection);
        }
        C41172fp9 c41172fp9 = (C41172fp9) collection;
        int i = c41172fp9.f80774d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f80774d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f80773c;
            if (i3 > jArr.length) {
                this.f80773c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c41172fp9.f80773c, 0, this.f80773c, this.f80774d, c41172fp9.f80774d);
            this.f80774d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final long m40784b(int i) {
        zzh(i);
        return this.f80773c[i];
    }

    /* renamed from: c */
    public final void m40783c(long j) {
        m28655a();
        int i = this.f80774d;
        long[] jArr = this.f80773c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f80773c = jArr2;
        }
        long[] jArr3 = this.f80773c;
        int i2 = this.f80774d;
        this.f80774d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.An9
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ An9 mo16911d(int i) {
        if (i >= this.f80774d) {
            return new C41172fp9(Arrays.copyOf(this.f80773c, i), this.f80774d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final String m40782e(int i) {
        int i2 = this.f80774d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41172fp9)) {
            return super.equals(obj);
        }
        C41172fp9 c41172fp9 = (C41172fp9) obj;
        if (this.f80774d != c41172fp9.f80774d) {
            return false;
        }
        long[] jArr = c41172fp9.f80773c;
        for (int i = 0; i < this.f80774d; i++) {
            if (this.f80773c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzh(i);
        return Long.valueOf(this.f80773c[i]);
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f80774d; i2++) {
            i = (i * 31) + Fn9.m106452c(this.f80773c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f80774d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f80773c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m28655a();
        zzh(i);
        long[] jArr = this.f80773c;
        long j = jArr[i];
        if (i < this.f80774d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f80774d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m28655a();
        if (i2 >= i) {
            long[] jArr = this.f80773c;
            System.arraycopy(jArr, i2, jArr, i, this.f80774d - i2);
            this.f80774d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m28655a();
        zzh(i);
        long[] jArr = this.f80773c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80774d;
    }

    public final void zzh(int i) {
        if (i >= 0 && i < this.f80774d) {
            return;
        }
        throw new IndexOutOfBoundsException(m40782e(i));
    }

    public C41172fp9(long[] jArr, int i) {
        this.f80773c = jArr;
        this.f80774d = i;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m40783c(((Long) obj).longValue());
        return true;
    }
}
