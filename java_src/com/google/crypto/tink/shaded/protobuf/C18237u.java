package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18238v;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.crypto.tink.shaded.protobuf.u */
/* loaded from: classes6.dex */
public final class C18237u extends AbstractC18191c<Integer> implements C18238v.InterfaceC18245g, RandomAccess, G24 {

    /* renamed from: e */
    public static final C18237u f74214e;

    /* renamed from: c */
    public int[] f74215c;

    /* renamed from: d */
    public int f74216d;

    static {
        C18237u c18237u = new C18237u(new int[0], 0);
        f74214e = c18237u;
        c18237u.mo47412r();
    }

    public C18237u() {
        this(new int[10], 0);
    }

    /* renamed from: L2 */
    public void m47434L2(int i) {
        m47785a();
        int i2 = this.f74216d;
        int[] iArr = this.f74215c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f74215c = iArr2;
        }
        int[] iArr3 = this.f74215c;
        int i3 = this.f74216d;
        this.f74216d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m47785a();
        C18238v.m47423a(collection);
        if (!(collection instanceof C18237u)) {
            return super.addAll(collection);
        }
        C18237u c18237u = (C18237u) collection;
        int i = c18237u.f74216d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f74216d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f74215c;
            if (i3 > iArr.length) {
                this.f74215c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c18237u.f74215c, 0, this.f74215c, this.f74216d, c18237u.f74216d);
            this.f74216d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, Integer num) {
        m47431e(i, num.intValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c */
    public boolean add(Integer num) {
        m47434L2(num.intValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m47431e(int i, int i2) {
        int i3;
        m47785a();
        if (i >= 0 && i <= (i3 = this.f74216d)) {
            int[] iArr = this.f74215c;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
            } else {
                int[] iArr2 = new int[((i3 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f74215c, i, iArr2, i + 1, this.f74216d - i);
                this.f74215c = iArr2;
            }
            this.f74215c[i] = i2;
            this.f74216d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m47428j(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18237u)) {
            return super.equals(obj);
        }
        C18237u c18237u = (C18237u) obj;
        if (this.f74216d != c18237u.f74216d) {
            return false;
        }
        int[] iArr = c18237u.f74215c;
        for (int i = 0; i < this.f74216d; i++) {
            if (this.f74215c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m47430f(int i) {
        if (i >= 0 && i < this.f74216d) {
            return;
        }
        throw new IndexOutOfBoundsException(m47428j(i));
    }

    public int getInt(int i) {
        m47430f(i);
        return this.f74215c[i];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f74216d; i2++) {
            i = (i * 31) + this.f74215c[i2];
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
            if (this.f74215c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final String m47428j(int i) {
        return "Index:" + i + ", Size:" + this.f74216d;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18247i
    /* renamed from: o */
    public C18238v.InterfaceC18245g mo47397k(int i) {
        if (i >= this.f74216d) {
            return new C18237u(Arrays.copyOf(this.f74215c, i), this.f74216d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m47785a();
        if (i2 >= i) {
            int[] iArr = this.f74215c;
            System.arraycopy(iArr, i2, iArr, i, this.f74216d - i2);
            this.f74216d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: s */
    public Integer remove(int i) {
        int i2;
        m47785a();
        m47430f(i);
        int[] iArr = this.f74215c;
        int i3 = iArr[i];
        if (i < this.f74216d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f74216d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74216d;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(m47424v(i, num.intValue()));
    }

    /* renamed from: v */
    public int m47424v(int i, int i2) {
        m47785a();
        m47430f(i);
        int[] iArr = this.f74215c;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public C18237u(int[] iArr, int i) {
        this.f74215c = iArr;
        this.f74216d = i;
    }
}
