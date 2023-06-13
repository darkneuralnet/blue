package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Je9 */
/* loaded from: classes5.dex */
public final class Je9 extends S39 implements RandomAccess, Zh9 {

    /* renamed from: e */
    public static final Je9 f17968e;

    /* renamed from: c */
    public long[] f17969c;

    /* renamed from: d */
    public int f17970d;

    static {
        Je9 je9 = new Je9(new long[0], 0);
        f17968e = je9;
        je9.zzb();
    }

    public Je9() {
        this(new long[10], 0);
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m86050a();
        if (i >= 0 && i <= (i2 = this.f17970d)) {
            long[] jArr = this.f17969c;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f17969c, i, jArr2, i + 1, this.f17970d - i);
                this.f17969c = jArr2;
            }
            this.f17969c[i] = longValue;
            this.f17970d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m100051e(i));
    }

    @Override // p000.S39, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m86050a();
        C44007kc9.m28735e(collection);
        if (!(collection instanceof Je9)) {
            return super.addAll(collection);
        }
        Je9 je9 = (Je9) collection;
        int i = je9.f17970d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f17970d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f17969c;
            if (i3 > jArr.length) {
                this.f17969c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(je9.f17969c, 0, this.f17969c, this.f17970d, je9.f17970d);
            this.f17970d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final long m100053b(int i) {
        zzh(i);
        return this.f17969c[i];
    }

    /* renamed from: c */
    public final void m100052c(long j) {
        m86050a();
        int i = this.f17970d;
        long[] jArr = this.f17969c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f17969c = jArr2;
        }
        long[] jArr3 = this.f17969c;
        int i2 = this.f17970d;
        this.f17970d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.InterfaceC39857dc9
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC39857dc9 mo1843d(int i) {
        if (i >= this.f17970d) {
            return new Je9(Arrays.copyOf(this.f17969c, i), this.f17970d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final String m100051e(int i) {
        int i2 = this.f17970d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.S39, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Je9)) {
            return super.equals(obj);
        }
        Je9 je9 = (Je9) obj;
        if (this.f17970d != je9.f17970d) {
            return false;
        }
        long[] jArr = je9.f17969c;
        for (int i = 0; i < this.f17970d; i++) {
            if (this.f17969c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzh(i);
        return Long.valueOf(this.f17969c[i]);
    }

    @Override // p000.S39, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f17970d; i2++) {
            i = (i * 31) + C44007kc9.m28737c(this.f17969c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f17970d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f17969c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m86050a();
        zzh(i);
        long[] jArr = this.f17969c;
        long j = jArr[i];
        if (i < this.f17970d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f17970d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m86050a();
        if (i2 >= i) {
            long[] jArr = this.f17969c;
            System.arraycopy(jArr, i2, jArr, i, this.f17970d - i2);
            this.f17970d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m86050a();
        zzh(i);
        long[] jArr = this.f17969c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17970d;
    }

    public final void zzh(int i) {
        if (i < 0 || i >= this.f17970d) {
            throw new IndexOutOfBoundsException(m100051e(i));
        }
    }

    public Je9(long[] jArr, int i) {
        this.f17969c = jArr;
        this.f17970d = i;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m100052c(((Long) obj).longValue());
        return true;
    }
}
