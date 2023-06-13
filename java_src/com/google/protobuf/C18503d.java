package com.google.protobuf;

import com.google.protobuf.C18544t;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.protobuf.d */
/* loaded from: classes6.dex */
public final class C18503d extends AbstractC18502c<Boolean> implements C18544t.InterfaceC18545a, RandomAccess, F24 {

    /* renamed from: e */
    public static final C18503d f74794e;

    /* renamed from: c */
    public boolean[] f74795c;

    /* renamed from: d */
    public int f74796d;

    static {
        C18503d c18503d = new C18503d(new boolean[0], 0);
        f74794e = c18503d;
        c18503d.mo45989r();
    }

    public C18503d() {
        this(new boolean[10], 0);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m46321a();
        C18544t.m46000a(collection);
        if (!(collection instanceof C18503d)) {
            return super.addAll(collection);
        }
        C18503d c18503d = (C18503d) collection;
        int i = c18503d.f74796d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f74796d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f74795c;
            if (i3 > zArr.length) {
                this.f74795c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c18503d.f74795c, 0, this.f74795c, this.f74796d, c18503d.f74796d);
            this.f74796d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, Boolean bool) {
        m46318e(i, bool.booleanValue());
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c */
    public boolean add(Boolean bool) {
        m46317f(bool.booleanValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m46318e(int i, boolean z) {
        int i2;
        m46321a();
        if (i >= 0 && i <= (i2 = this.f74796d)) {
            boolean[] zArr = this.f74795c;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f74795c, i, zArr2, i + 1, this.f74796d - i);
                this.f74795c = zArr2;
            }
            this.f74795c[i] = z;
            this.f74796d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m46313s(i));
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18503d)) {
            return super.equals(obj);
        }
        C18503d c18503d = (C18503d) obj;
        if (this.f74796d != c18503d.f74796d) {
            return false;
        }
        boolean[] zArr = c18503d.f74795c;
        for (int i = 0; i < this.f74796d; i++) {
            if (this.f74795c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public void m46317f(boolean z) {
        m46321a();
        int i = this.f74796d;
        boolean[] zArr = this.f74795c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f74795c = zArr2;
        }
        boolean[] zArr3 = this.f74795c;
        int i2 = this.f74796d;
        this.f74796d = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: h */
    public final void m46316h(int i) {
        if (i >= 0 && i < this.f74796d) {
            return;
        }
        throw new IndexOutOfBoundsException(m46313s(i));
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f74796d; i2++) {
            i = (i * 31) + C18544t.m45998c(this.f74795c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f74795c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j */
    public Boolean get(int i) {
        return Boolean.valueOf(m46314o(i));
    }

    /* renamed from: o */
    public boolean m46314o(int i) {
        m46316h(i);
        return this.f74795c[i];
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m46321a();
        if (i2 >= i) {
            boolean[] zArr = this.f74795c;
            System.arraycopy(zArr, i2, zArr, i, this.f74796d - i2);
            this.f74796d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final String m46313s(int i) {
        return "Index:" + i + ", Size:" + this.f74796d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74796d;
    }

    @Override // com.google.protobuf.C18544t.InterfaceC18553i
    /* renamed from: u */
    public C18544t.InterfaceC18545a mo45959k(int i) {
        if (i >= this.f74796d) {
            return new C18503d(Arrays.copyOf(this.f74795c, i), this.f74796d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Boolean remove(int i) {
        int i2;
        m46321a();
        m46316h(i);
        boolean[] zArr = this.f74795c;
        boolean z = zArr[i];
        if (i < this.f74796d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f74796d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: w */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(m46309x(i, bool.booleanValue()));
    }

    /* renamed from: x */
    public boolean m46309x(int i, boolean z) {
        m46321a();
        m46316h(i);
        boolean[] zArr = this.f74795c;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public C18503d(boolean[] zArr, int i) {
        this.f74795c = zArr;
        this.f74796d = i;
    }
}
