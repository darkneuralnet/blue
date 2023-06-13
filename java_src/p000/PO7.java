package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: PO7 */
/* loaded from: classes5.dex */
public final class PO7 extends Bh9<Long> implements FW7, RandomAccess {

    /* renamed from: e */
    public static final PO7 f28387e;

    /* renamed from: c */
    public long[] f28388c;

    /* renamed from: d */
    public int f28389d;

    static {
        PO7 po7 = new PO7(new long[0], 0);
        f28387e = po7;
        po7.mo113666q();
    }

    public PO7() {
        this(new long[10], 0);
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m90349f(i, ((Long) obj).longValue());
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m113667a();
        C44389lF7.m27619a(collection);
        if (!(collection instanceof PO7)) {
            return super.addAll(collection);
        }
        PO7 po7 = (PO7) collection;
        int i = po7.f28389d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f28389d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f28388c;
            if (i3 > jArr.length) {
                this.f28388c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(po7.f28388c, 0, this.f28388c, this.f28389d, po7.f28389d);
            this.f28389d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final long m90352b(int i) {
        m90351c(i);
        return this.f28388c[i];
    }

    /* renamed from: c */
    public final void m90351c(int i) {
        if (i >= 0 && i < this.f28389d) {
            return;
        }
        throw new IndexOutOfBoundsException(m90350e(i));
    }

    /* renamed from: e */
    public final String m90350e(int i) {
        int i2 = this.f28389d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PO7)) {
            return super.equals(obj);
        }
        PO7 po7 = (PO7) obj;
        if (this.f28389d != po7.f28389d) {
            return false;
        }
        long[] jArr = po7.f28388c;
        for (int i = 0; i < this.f28389d; i++) {
            if (this.f28388c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m90349f(int i, long j) {
        int i2;
        m113667a();
        if (i >= 0 && i <= (i2 = this.f28389d)) {
            long[] jArr = this.f28388c;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f28388c, i, jArr2, i + 1, this.f28389d - i);
                this.f28388c = jArr2;
            }
            this.f28388c[i] = j;
            this.f28389d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m90350e(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(m90352b(i));
    }

    /* renamed from: h */
    public final void m90348h(long j) {
        m90349f(this.f28389d, j);
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f28389d; i2++) {
            i = (i * 31) + C44389lF7.m27610j(this.f28388c[i2]);
        }
        return i;
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m113667a();
        for (int i = 0; i < this.f28389d; i++) {
            if (obj.equals(Long.valueOf(this.f28388c[i]))) {
                long[] jArr = this.f28388c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f28389d - i) - 1);
                this.f28389d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m113667a();
        if (i2 >= i) {
            long[] jArr = this.f28388c;
            System.arraycopy(jArr, i2, jArr, i, this.f28389d - i2);
            this.f28389d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m113667a();
        m90351c(i);
        long[] jArr = this.f28388c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28389d;
    }

    @Override // p000.BI7
    public final /* synthetic */ BI7 zzh(int i) {
        if (i >= this.f28389d) {
            return new PO7(Arrays.copyOf(this.f28388c, i), this.f28389d);
        }
        throw new IllegalArgumentException();
    }

    public PO7(long[] jArr, int i) {
        this.f28388c = jArr;
        this.f28389d = i;
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        m113667a();
        m90351c(i);
        long[] jArr = this.f28388c;
        long j = jArr[i];
        if (i < this.f28389d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f28389d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }
}
