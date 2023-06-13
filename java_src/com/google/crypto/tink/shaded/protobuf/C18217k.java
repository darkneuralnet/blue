package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18238v;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.crypto.tink.shaded.protobuf.k */
/* loaded from: classes6.dex */
public final class C18217k extends AbstractC18191c<Double> implements C18238v.InterfaceC18240b, RandomAccess, G24 {

    /* renamed from: e */
    public static final C18217k f74175e;

    /* renamed from: c */
    public double[] f74176c;

    /* renamed from: d */
    public int f74177d;

    static {
        C18217k c18217k = new C18217k(new double[0], 0);
        f74175e = c18217k;
        c18217k.mo47412r();
    }

    public C18217k() {
        this(new double[10], 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m47785a();
        C18238v.m47423a(collection);
        if (!(collection instanceof C18217k)) {
            return super.addAll(collection);
        }
        C18217k c18217k = (C18217k) collection;
        int i = c18217k.f74177d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f74177d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f74176c;
            if (i3 > dArr.length) {
                this.f74176c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c18217k.f74176c, 0, this.f74176c, this.f74177d, c18217k.f74177d);
            this.f74177d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, Double d) {
        m47538f(i, d.doubleValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c */
    public boolean add(Double d) {
        m47539e(d.doubleValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public void m47539e(double d) {
        m47785a();
        int i = this.f74177d;
        double[] dArr = this.f74176c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f74176c = dArr2;
        }
        double[] dArr3 = this.f74176c;
        int i2 = this.f74177d;
        this.f74177d = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18217k)) {
            return super.equals(obj);
        }
        C18217k c18217k = (C18217k) obj;
        if (this.f74177d != c18217k.f74177d) {
            return false;
        }
        double[] dArr = c18217k.f74176c;
        for (int i = 0; i < this.f74177d; i++) {
            if (Double.doubleToLongBits(this.f74176c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m47538f(int i, double d) {
        int i2;
        m47785a();
        if (i >= 0 && i <= (i2 = this.f74177d)) {
            double[] dArr = this.f74176c;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f74176c, i, dArr2, i + 1, this.f74177d - i);
                this.f74176c = dArr2;
            }
            this.f74176c[i] = d;
            this.f74177d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m47534s(i));
    }

    /* renamed from: h */
    public final void m47537h(int i) {
        if (i >= 0 && i < this.f74177d) {
            return;
        }
        throw new IndexOutOfBoundsException(m47534s(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f74177d; i2++) {
            i = (i * 31) + C18238v.m47418f(Double.doubleToLongBits(this.f74176c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f74176c[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j */
    public Double get(int i) {
        return Double.valueOf(m47535o(i));
    }

    /* renamed from: o */
    public double m47535o(int i) {
        m47537h(i);
        return this.f74176c[i];
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m47785a();
        if (i2 >= i) {
            double[] dArr = this.f74176c;
            System.arraycopy(dArr, i2, dArr, i, this.f74177d - i2);
            this.f74177d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final String m47534s(int i) {
        return "Index:" + i + ", Size:" + this.f74177d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74177d;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18247i
    /* renamed from: u */
    public C18238v.InterfaceC18240b mo47397k(int i) {
        if (i >= this.f74177d) {
            return new C18217k(Arrays.copyOf(this.f74176c, i), this.f74177d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Double remove(int i) {
        int i2;
        m47785a();
        m47537h(i);
        double[] dArr = this.f74176c;
        double d = dArr[i];
        if (i < this.f74177d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f74177d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: w */
    public Double set(int i, Double d) {
        return Double.valueOf(m47530x(i, d.doubleValue()));
    }

    /* renamed from: x */
    public double m47530x(int i, double d) {
        m47785a();
        m47537h(i);
        double[] dArr = this.f74176c;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public C18217k(double[] dArr, int i) {
        this.f74176c = dArr;
        this.f74177d = i;
    }
}
