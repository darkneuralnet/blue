package com.google.protobuf;

import com.google.protobuf.C18544t;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.protobuf.y */
/* loaded from: classes6.dex */
public final class C18564y extends AbstractC18502c<Long> implements C18544t.InterfaceC18552h, RandomAccess, F24 {

    /* renamed from: e */
    public static final C18564y f74892e;

    /* renamed from: c */
    public long[] f74893c;

    /* renamed from: d */
    public int f74894d;

    static {
        C18564y c18564y = new C18564y(new long[0], 0);
        f74892e = c18564y;
        c18564y.mo45989r();
    }

    public C18564y() {
        this(new long[10], 0);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m46321a();
        C18544t.m46000a(collection);
        if (!(collection instanceof C18564y)) {
            return super.addAll(collection);
        }
        C18564y c18564y = (C18564y) collection;
        int i = c18564y.f74894d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f74894d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f74893c;
            if (i3 > jArr.length) {
                this.f74893c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c18564y.f74893c, 0, this.f74893c, this.f74894d, c18564y.f74894d);
            this.f74894d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, Long l) {
        m45963e(i, l.longValue());
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c */
    public boolean add(Long l) {
        m45962f(l.longValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m45963e(int i, long j) {
        int i2;
        m46321a();
        if (i >= 0 && i <= (i2 = this.f74894d)) {
            long[] jArr = this.f74893c;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f74893c, i, jArr2, i + 1, this.f74894d - i);
                this.f74893c = jArr2;
            }
            this.f74893c[i] = j;
            this.f74894d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m45957s(i));
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18564y)) {
            return super.equals(obj);
        }
        C18564y c18564y = (C18564y) obj;
        if (this.f74894d != c18564y.f74894d) {
            return false;
        }
        long[] jArr = c18564y.f74893c;
        for (int i = 0; i < this.f74894d; i++) {
            if (this.f74893c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public void m45962f(long j) {
        m46321a();
        int i = this.f74894d;
        long[] jArr = this.f74893c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f74893c = jArr2;
        }
        long[] jArr3 = this.f74893c;
        int i2 = this.f74894d;
        this.f74894d = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: h */
    public final void m45961h(int i) {
        if (i >= 0 && i < this.f74894d) {
            return;
        }
        throw new IndexOutOfBoundsException(m45957s(i));
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f74894d; i2++) {
            i = (i * 31) + C18544t.m45995f(this.f74893c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f74893c[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j */
    public Long get(int i) {
        return Long.valueOf(m45958o(i));
    }

    /* renamed from: o */
    public long m45958o(int i) {
        m45961h(i);
        return this.f74893c[i];
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m46321a();
        if (i2 >= i) {
            long[] jArr = this.f74893c;
            System.arraycopy(jArr, i2, jArr, i, this.f74894d - i2);
            this.f74894d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final String m45957s(int i) {
        return "Index:" + i + ", Size:" + this.f74894d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74894d;
    }

    @Override // com.google.protobuf.C18544t.InterfaceC18553i
    /* renamed from: u */
    public C18544t.InterfaceC18552h mo45959k(int i) {
        if (i >= this.f74894d) {
            return new C18564y(Arrays.copyOf(this.f74893c, i), this.f74894d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Long remove(int i) {
        int i2;
        m46321a();
        m45961h(i);
        long[] jArr = this.f74893c;
        long j = jArr[i];
        if (i < this.f74894d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f74894d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: w */
    public Long set(int i, Long l) {
        return Long.valueOf(m45953x(i, l.longValue()));
    }

    /* renamed from: x */
    public long m45953x(int i, long j) {
        m46321a();
        m45961h(i);
        long[] jArr = this.f74893c;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public C18564y(long[] jArr, int i) {
        this.f74893c = jArr;
        this.f74894d = i;
    }
}
