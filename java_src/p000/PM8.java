package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: PM8 */
/* loaded from: classes6.dex */
public final class PM8 extends AbstractC41834gw8<Long> implements IS8, RandomAccess {

    /* renamed from: e */
    public static final PM8 f28358e;

    /* renamed from: c */
    public long[] f28359c;

    /* renamed from: d */
    public int f28360d;

    static {
        PM8 pm8 = new PM8(new long[0], 0);
        f28358e = pm8;
        pm8.zzb();
    }

    public PM8() {
        this(new long[10], 0);
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m37302a();
        if (i >= 0 && i <= (i2 = this.f28360d)) {
            long[] jArr = this.f28359c;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f28359c, i, jArr2, i + 1, this.f28360d - i);
                this.f28359c = jArr2;
            }
            this.f28359c[i] = longValue;
            this.f28360d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m90366f(i));
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m37302a();
        C52124yI8.m3691d(collection);
        if (!(collection instanceof PM8)) {
            return super.addAll(collection);
        }
        PM8 pm8 = (PM8) collection;
        int i = pm8.f28360d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f28360d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f28359c;
            if (i3 > jArr.length) {
                this.f28359c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(pm8.f28359c, 0, this.f28359c, this.f28360d, pm8.f28360d);
            this.f28360d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m90369b(long j) {
        m37302a();
        int i = this.f28360d;
        long[] jArr = this.f28359c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f28359c = jArr2;
        }
        long[] jArr3 = this.f28359c;
        int i2 = this.f28360d;
        this.f28360d = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: c */
    public final long m90368c(int i) {
        m90367e(i);
        return this.f28359c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m90367e(int i) {
        if (i >= 0 && i < this.f28360d) {
            return;
        }
        throw new IndexOutOfBoundsException(m90366f(i));
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PM8)) {
            return super.equals(obj);
        }
        PM8 pm8 = (PM8) obj;
        if (this.f28360d != pm8.f28360d) {
            return false;
        }
        long[] jArr = pm8.f28359c;
        for (int i = 0; i < this.f28360d; i++) {
            if (this.f28359c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m90366f(int i) {
        int i2 = this.f28360d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(m90368c(i));
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f28360d; i2++) {
            i = (i * 31) + C52124yI8.m3693b(this.f28359c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f28359c[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        m37302a();
        m90367e(i);
        long[] jArr = this.f28359c;
        long j = jArr[i];
        if (i < this.f28360d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f28360d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m37302a();
        if (i2 >= i) {
            long[] jArr = this.f28359c;
            System.arraycopy(jArr, i2, jArr, i, this.f28360d - i2);
            this.f28360d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m37302a();
        m90367e(i);
        long[] jArr = this.f28359c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28360d;
    }

    @Override // p000.RJ8
    public final /* synthetic */ RJ8 zza(int i) {
        if (i >= this.f28360d) {
            return new PM8(Arrays.copyOf(this.f28359c, i), this.f28360d);
        }
        throw new IllegalArgumentException();
    }

    public PM8(long[] jArr, int i) {
        this.f28359c = jArr;
        this.f28360d = i;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m90369b(((Long) obj).longValue());
        return true;
    }
}
