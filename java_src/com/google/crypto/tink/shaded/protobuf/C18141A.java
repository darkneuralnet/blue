package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18238v;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.crypto.tink.shaded.protobuf.A */
/* loaded from: classes6.dex */
public final class C18141A extends AbstractC18191c<Long> implements C18238v.InterfaceC18246h, RandomAccess, G24 {

    /* renamed from: e */
    public static final C18141A f74012e;

    /* renamed from: c */
    public long[] f74013c;

    /* renamed from: d */
    public int f74014d;

    static {
        C18141A c18141a = new C18141A(new long[0], 0);
        f74012e = c18141a;
        c18141a.mo47412r();
    }

    public C18141A() {
        this(new long[10], 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m47785a();
        C18238v.m47423a(collection);
        if (!(collection instanceof C18141A)) {
            return super.addAll(collection);
        }
        C18141A c18141a = (C18141A) collection;
        int i = c18141a.f74014d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f74014d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f74013c;
            if (i3 > jArr.length) {
                this.f74013c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c18141a.f74013c, 0, this.f74013c, this.f74014d, c18141a.f74014d);
            this.f74014d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, Long l) {
        m48222e(i, l.longValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c */
    public boolean add(Long l) {
        m48221f(l.longValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m48222e(int i, long j) {
        int i2;
        m47785a();
        if (i >= 0 && i <= (i2 = this.f74014d)) {
            long[] jArr = this.f74013c;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f74013c, i, jArr2, i + 1, this.f74014d - i);
                this.f74013c = jArr2;
            }
            this.f74013c[i] = j;
            this.f74014d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m48217s(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18141A)) {
            return super.equals(obj);
        }
        C18141A c18141a = (C18141A) obj;
        if (this.f74014d != c18141a.f74014d) {
            return false;
        }
        long[] jArr = c18141a.f74013c;
        for (int i = 0; i < this.f74014d; i++) {
            if (this.f74013c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public void m48221f(long j) {
        m47785a();
        int i = this.f74014d;
        long[] jArr = this.f74013c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f74013c = jArr2;
        }
        long[] jArr3 = this.f74013c;
        int i2 = this.f74014d;
        this.f74014d = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: h */
    public final void m48220h(int i) {
        if (i >= 0 && i < this.f74014d) {
            return;
        }
        throw new IndexOutOfBoundsException(m48217s(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f74014d; i2++) {
            i = (i * 31) + C18238v.m47418f(this.f74013c[i2]);
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
            if (this.f74013c[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j */
    public Long get(int i) {
        return Long.valueOf(m48218o(i));
    }

    /* renamed from: o */
    public long m48218o(int i) {
        m48220h(i);
        return this.f74013c[i];
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m47785a();
        if (i2 >= i) {
            long[] jArr = this.f74013c;
            System.arraycopy(jArr, i2, jArr, i, this.f74014d - i2);
            this.f74014d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final String m48217s(int i) {
        return "Index:" + i + ", Size:" + this.f74014d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74014d;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18247i
    /* renamed from: u */
    public C18238v.InterfaceC18246h mo47397k(int i) {
        if (i >= this.f74014d) {
            return new C18141A(Arrays.copyOf(this.f74013c, i), this.f74014d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Long remove(int i) {
        int i2;
        m47785a();
        m48220h(i);
        long[] jArr = this.f74013c;
        long j = jArr[i];
        if (i < this.f74014d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f74014d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: w */
    public Long set(int i, Long l) {
        return Long.valueOf(m48213x(i, l.longValue()));
    }

    /* renamed from: x */
    public long m48213x(int i, long j) {
        m47785a();
        m48220h(i);
        long[] jArr = this.f74013c;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public C18141A(long[] jArr, int i) {
        this.f74013c = jArr;
        this.f74014d = i;
    }
}
