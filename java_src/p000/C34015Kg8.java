package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Kg8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34015Kg8 extends C28<Long> implements RandomAccess, InterfaceC51803xl8 {

    /* renamed from: e */
    public static final C34015Kg8 f20052e;

    /* renamed from: c */
    public long[] f20053c;

    /* renamed from: d */
    public int f20054d;

    static {
        C34015Kg8 c34015Kg8 = new C34015Kg8(new long[0], 0);
        f20052e = c34015Kg8;
        c34015Kg8.zzb();
    }

    public C34015Kg8() {
        this(new long[10], 0);
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m112947a();
        if (i >= 0 && i <= (i2 = this.f20054d)) {
            long[] jArr = this.f20053c;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f20053c, i, jArr2, i + 1, this.f20054d - i);
                this.f20053c = jArr2;
            }
            this.f20053c[i] = longValue;
            this.f20054d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m98518c(i));
    }

    @Override // p000.C28, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m112947a();
        C41051fd8.m41090e(collection);
        if (!(collection instanceof C34015Kg8)) {
            return super.addAll(collection);
        }
        C34015Kg8 c34015Kg8 = (C34015Kg8) collection;
        int i = c34015Kg8.f20054d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f20054d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f20053c;
            if (i3 > jArr.length) {
                this.f20053c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c34015Kg8.f20053c, 0, this.f20053c, this.f20054d, c34015Kg8.f20054d);
            this.f20054d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m98519b(long j) {
        m112947a();
        int i = this.f20054d;
        long[] jArr = this.f20053c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f20053c = jArr2;
        }
        long[] jArr3 = this.f20053c;
        int i2 = this.f20054d;
        this.f20054d = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: c */
    public final String m98518c(int i) {
        int i2 = this.f20054d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.InterfaceC35383Qc8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC35383Qc8 mo41068d(int i) {
        if (i >= this.f20054d) {
            return new C34015Kg8(Arrays.copyOf(this.f20053c, i), this.f20054d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m98517e(int i) {
        if (i >= 0 && i < this.f20054d) {
            return;
        }
        throw new IndexOutOfBoundsException(m98518c(i));
    }

    @Override // p000.C28, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34015Kg8)) {
            return super.equals(obj);
        }
        C34015Kg8 c34015Kg8 = (C34015Kg8) obj;
        if (this.f20054d != c34015Kg8.f20054d) {
            return false;
        }
        long[] jArr = c34015Kg8.f20053c;
        for (int i = 0; i < this.f20054d; i++) {
            if (this.f20053c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m98517e(i);
        return Long.valueOf(this.f20053c[i]);
    }

    @Override // p000.C28, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20054d; i2++) {
            i = (i * 31) + C41051fd8.m41092c(this.f20053c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f20054d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f20053c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m112947a();
        m98517e(i);
        long[] jArr = this.f20053c;
        long j = jArr[i];
        if (i < this.f20054d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f20054d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m112947a();
        if (i2 >= i) {
            long[] jArr = this.f20053c;
            System.arraycopy(jArr, i2, jArr, i, this.f20054d - i2);
            this.f20054d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m112947a();
        m98517e(i);
        long[] jArr = this.f20053c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20054d;
    }

    public C34015Kg8(long[] jArr, int i) {
        this.f20053c = jArr;
        this.f20054d = i;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m98519b(((Long) obj).longValue());
        return true;
    }
}
