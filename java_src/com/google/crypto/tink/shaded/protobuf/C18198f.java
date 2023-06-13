package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18238v;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.crypto.tink.shaded.protobuf.f */
/* loaded from: classes6.dex */
public final class C18198f extends AbstractC18191c<Boolean> implements C18238v.InterfaceC18239a, RandomAccess, G24 {

    /* renamed from: e */
    public static final C18198f f74139e;

    /* renamed from: c */
    public boolean[] f74140c;

    /* renamed from: d */
    public int f74141d;

    static {
        C18198f c18198f = new C18198f(new boolean[0], 0);
        f74139e = c18198f;
        c18198f.mo47412r();
    }

    public C18198f() {
        this(new boolean[10], 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m47785a();
        C18238v.m47423a(collection);
        if (!(collection instanceof C18198f)) {
            return super.addAll(collection);
        }
        C18198f c18198f = (C18198f) collection;
        int i = c18198f.f74141d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f74141d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f74140c;
            if (i3 > zArr.length) {
                this.f74140c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c18198f.f74140c, 0, this.f74140c, this.f74141d, c18198f.f74141d);
            this.f74141d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, Boolean bool) {
        m47719e(i, bool.booleanValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c */
    public boolean add(Boolean bool) {
        m47718f(bool.booleanValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m47719e(int i, boolean z) {
        int i2;
        m47785a();
        if (i >= 0 && i <= (i2 = this.f74141d)) {
            boolean[] zArr = this.f74140c;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f74140c, i, zArr2, i + 1, this.f74141d - i);
                this.f74140c = zArr2;
            }
            this.f74140c[i] = z;
            this.f74141d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m47714s(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18198f)) {
            return super.equals(obj);
        }
        C18198f c18198f = (C18198f) obj;
        if (this.f74141d != c18198f.f74141d) {
            return false;
        }
        boolean[] zArr = c18198f.f74140c;
        for (int i = 0; i < this.f74141d; i++) {
            if (this.f74140c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public void m47718f(boolean z) {
        m47785a();
        int i = this.f74141d;
        boolean[] zArr = this.f74140c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f74140c = zArr2;
        }
        boolean[] zArr3 = this.f74140c;
        int i2 = this.f74141d;
        this.f74141d = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: h */
    public final void m47717h(int i) {
        if (i >= 0 && i < this.f74141d) {
            return;
        }
        throw new IndexOutOfBoundsException(m47714s(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f74141d; i2++) {
            i = (i * 31) + C18238v.m47421c(this.f74140c[i2]);
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
            if (this.f74140c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j */
    public Boolean get(int i) {
        return Boolean.valueOf(m47715o(i));
    }

    /* renamed from: o */
    public boolean m47715o(int i) {
        m47717h(i);
        return this.f74140c[i];
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m47785a();
        if (i2 >= i) {
            boolean[] zArr = this.f74140c;
            System.arraycopy(zArr, i2, zArr, i, this.f74141d - i2);
            this.f74141d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final String m47714s(int i) {
        return "Index:" + i + ", Size:" + this.f74141d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74141d;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18247i
    /* renamed from: u */
    public C18238v.InterfaceC18239a mo47397k(int i) {
        if (i >= this.f74141d) {
            return new C18198f(Arrays.copyOf(this.f74140c, i), this.f74141d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Boolean remove(int i) {
        int i2;
        m47785a();
        m47717h(i);
        boolean[] zArr = this.f74140c;
        boolean z = zArr[i];
        if (i < this.f74141d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f74141d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: w */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(m47710x(i, bool.booleanValue()));
    }

    /* renamed from: x */
    public boolean m47710x(int i, boolean z) {
        m47785a();
        m47717h(i);
        boolean[] zArr = this.f74140c;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public C18198f(boolean[] zArr, int i) {
        this.f74140c = zArr;
        this.f74141d = i;
    }
}
