package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: rZ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48127rZ7 extends AbstractC36507Ux7<Long> implements RandomAccess {

    /* renamed from: e */
    public static final C48127rZ7 f107284e;

    /* renamed from: c */
    public long[] f107285c;

    /* renamed from: d */
    public int f107286d;

    static {
        C48127rZ7 c48127rZ7 = new C48127rZ7();
        f107284e = c48127rZ7;
        c48127rZ7.zzv();
    }

    public C48127rZ7() {
        this(new long[10], 0);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m15756f(i, ((Long) obj).longValue());
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m80580a();
        C37975aT7.m71332a(collection);
        if (collection instanceof C48127rZ7) {
            C48127rZ7 c48127rZ7 = (C48127rZ7) collection;
            int i = c48127rZ7.f107286d;
            if (i == 0) {
                return false;
            }
            int i2 = this.f107286d;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                long[] jArr = this.f107285c;
                if (i3 > jArr.length) {
                    this.f107285c = Arrays.copyOf(jArr, i3);
                }
                System.arraycopy(c48127rZ7.f107285c, 0, this.f107285c, this.f107286d, c48127rZ7.f107286d);
                this.f107286d = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final long m15759b(int i) {
        m15758c(i);
        return this.f107285c[i];
    }

    /* renamed from: c */
    public final void m15758c(int i) {
        if (i < 0 || i >= this.f107286d) {
            throw new IndexOutOfBoundsException(m15757e(i));
        }
    }

    /* renamed from: e */
    public final String m15757e(int i) {
        int i2 = this.f107286d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C48127rZ7) {
            C48127rZ7 c48127rZ7 = (C48127rZ7) obj;
            if (this.f107286d != c48127rZ7.f107286d) {
                return false;
            }
            long[] jArr = c48127rZ7.f107285c;
            for (int i = 0; i < this.f107286d; i++) {
                if (this.f107285c[i] != jArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final void m15756f(int i, long j) {
        int i2;
        m80580a();
        if (i < 0 || i > (i2 = this.f107286d)) {
            throw new IndexOutOfBoundsException(m15757e(i));
        }
        long[] jArr = this.f107285c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f107285c, i, jArr2, i + 1, this.f107286d - i);
            this.f107285c = jArr2;
        }
        this.f107285c[i] = j;
        this.f107286d++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(m15759b(i));
    }

    /* renamed from: h */
    public final void m15755h(long j) {
        m15756f(this.f107286d, j);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f107286d; i2++) {
            i = (i * 31) + C37975aT7.m71323j(this.f107285c[i2]);
        }
        return i;
    }

    @Override // p000.InterfaceC47489qU7
    /* renamed from: n */
    public final /* synthetic */ InterfaceC47489qU7 mo1502n(int i) {
        if (i >= this.f107286d) {
            return new C48127rZ7(Arrays.copyOf(this.f107285c, i), this.f107286d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m80580a();
        m15758c(i);
        long[] jArr = this.f107285c;
        long j = jArr[i];
        int i2 = this.f107286d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.f107286d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m80580a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f107285c;
        System.arraycopy(jArr, i2, jArr, i, this.f107286d - i2);
        this.f107286d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m80580a();
        m15758c(i);
        long[] jArr = this.f107285c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107286d;
    }

    public C48127rZ7(long[] jArr, int i) {
        this.f107285c = jArr;
        this.f107286d = i;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m80580a();
        for (int i = 0; i < this.f107286d; i++) {
            if (obj.equals(Long.valueOf(this.f107285c[i]))) {
                long[] jArr = this.f107285c;
                System.arraycopy(jArr, i + 1, jArr, i, this.f107286d - i);
                this.f107286d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
