package com.google.protobuf;

import com.google.protobuf.C18544t;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.protobuf.s */
/* loaded from: classes6.dex */
public final class C18543s extends AbstractC18502c<Integer> implements C18544t.InterfaceC18551g, RandomAccess, F24 {

    /* renamed from: e */
    public static final C18543s f74869e;

    /* renamed from: c */
    public int[] f74870c;

    /* renamed from: d */
    public int f74871d;

    static {
        C18543s c18543s = new C18543s(new int[0], 0);
        f74869e = c18543s;
        c18543s.mo45989r();
    }

    public C18543s() {
        this(new int[10], 0);
    }

    /* renamed from: f */
    public static C18543s m46007f() {
        return f74869e;
    }

    @Override // com.google.protobuf.C18544t.InterfaceC18551g
    /* renamed from: L2 */
    public void mo45990L2(int i) {
        m46321a();
        int i2 = this.f74871d;
        int[] iArr = this.f74870c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f74870c = iArr2;
        }
        int[] iArr3 = this.f74870c;
        int i3 = this.f74871d;
        this.f74871d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m46321a();
        C18544t.m46000a(collection);
        if (!(collection instanceof C18543s)) {
            return super.addAll(collection);
        }
        C18543s c18543s = (C18543s) collection;
        int i = c18543s.f74871d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f74871d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f74870c;
            if (i3 > iArr.length) {
                this.f74870c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c18543s.f74870c, 0, this.f74870c, this.f74871d, c18543s.f74871d);
            this.f74871d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, Integer num) {
        m46008e(i, num.intValue());
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c */
    public boolean add(Integer num) {
        mo45990L2(num.intValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m46008e(int i, int i2) {
        int i3;
        m46321a();
        if (i >= 0 && i <= (i3 = this.f74871d)) {
            int[] iArr = this.f74870c;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
            } else {
                int[] iArr2 = new int[((i3 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f74870c, i, iArr2, i + 1, this.f74871d - i);
                this.f74870c = iArr2;
            }
            this.f74870c[i] = i2;
            this.f74871d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m46004o(i));
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18543s)) {
            return super.equals(obj);
        }
        C18543s c18543s = (C18543s) obj;
        if (this.f74871d != c18543s.f74871d) {
            return false;
        }
        int[] iArr = c18543s.f74870c;
        for (int i = 0; i < this.f74871d; i++) {
            if (this.f74870c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.C18544t.InterfaceC18551g
    public int getInt(int i) {
        m46006h(i);
        return this.f74870c[i];
    }

    /* renamed from: h */
    public final void m46006h(int i) {
        if (i >= 0 && i < this.f74871d) {
            return;
        }
        throw new IndexOutOfBoundsException(m46004o(i));
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f74871d; i2++) {
            i = (i * 31) + this.f74870c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f74870c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    /* renamed from: o */
    public final String m46004o(int i) {
        return "Index:" + i + ", Size:" + this.f74871d;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m46321a();
        if (i2 >= i) {
            int[] iArr = this.f74870c;
            System.arraycopy(iArr, i2, iArr, i, this.f74871d - i2);
            this.f74871d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: s */
    public Integer remove(int i) {
        int i2;
        m46321a();
        m46006h(i);
        int[] iArr = this.f74870c;
        int i3 = iArr[i];
        if (i < this.f74871d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f74871d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74871d;
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(m46001v(i, num.intValue()));
    }

    /* renamed from: v */
    public int m46001v(int i, int i2) {
        m46321a();
        m46006h(i);
        int[] iArr = this.f74870c;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public C18543s(int[] iArr, int i) {
        this.f74870c = iArr;
        this.f74871d = i;
    }

    @Override // com.google.protobuf.C18544t.InterfaceC18553i
    /* renamed from: k */
    public C18544t.InterfaceC18553i<Integer> mo45959k(int i) {
        if (i >= this.f74871d) {
            return new C18543s(Arrays.copyOf(this.f74870c, i), this.f74871d);
        }
        throw new IllegalArgumentException();
    }
}
