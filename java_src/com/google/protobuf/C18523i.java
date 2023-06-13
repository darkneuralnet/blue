package com.google.protobuf;

import com.google.protobuf.C18544t;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.protobuf.i */
/* loaded from: classes6.dex */
public final class C18523i extends AbstractC18502c<Double> implements C18544t.InterfaceC18546b, RandomAccess, F24 {

    /* renamed from: e */
    public static final C18523i f74831e;

    /* renamed from: c */
    public double[] f74832c;

    /* renamed from: d */
    public int f74833d;

    static {
        C18523i c18523i = new C18523i(new double[0], 0);
        f74831e = c18523i;
        c18523i.mo45989r();
    }

    public C18523i() {
        this(new double[10], 0);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m46321a();
        C18544t.m46000a(collection);
        if (!(collection instanceof C18523i)) {
            return super.addAll(collection);
        }
        C18523i c18523i = (C18523i) collection;
        int i = c18523i.f74833d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f74833d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f74832c;
            if (i3 > dArr.length) {
                this.f74832c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c18523i.f74832c, 0, this.f74832c, this.f74833d, c18523i.f74833d);
            this.f74833d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, Double d) {
        m46131f(i, d.doubleValue());
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c */
    public boolean add(Double d) {
        m46132e(d.doubleValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public void m46132e(double d) {
        m46321a();
        int i = this.f74833d;
        double[] dArr = this.f74832c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f74832c = dArr2;
        }
        double[] dArr3 = this.f74832c;
        int i2 = this.f74833d;
        this.f74833d = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18523i)) {
            return super.equals(obj);
        }
        C18523i c18523i = (C18523i) obj;
        if (this.f74833d != c18523i.f74833d) {
            return false;
        }
        double[] dArr = c18523i.f74832c;
        for (int i = 0; i < this.f74833d; i++) {
            if (Double.doubleToLongBits(this.f74832c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m46131f(int i, double d) {
        int i2;
        m46321a();
        if (i >= 0 && i <= (i2 = this.f74833d)) {
            double[] dArr = this.f74832c;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f74832c, i, dArr2, i + 1, this.f74833d - i);
                this.f74832c = dArr2;
            }
            this.f74832c[i] = d;
            this.f74833d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m46127s(i));
    }

    /* renamed from: h */
    public final void m46130h(int i) {
        if (i >= 0 && i < this.f74833d) {
            return;
        }
        throw new IndexOutOfBoundsException(m46127s(i));
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f74833d; i2++) {
            i = (i * 31) + C18544t.m45995f(Double.doubleToLongBits(this.f74832c[i2]));
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
            if (this.f74832c[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j */
    public Double get(int i) {
        return Double.valueOf(m46128o(i));
    }

    /* renamed from: o */
    public double m46128o(int i) {
        m46130h(i);
        return this.f74832c[i];
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m46321a();
        if (i2 >= i) {
            double[] dArr = this.f74832c;
            System.arraycopy(dArr, i2, dArr, i, this.f74833d - i2);
            this.f74833d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final String m46127s(int i) {
        return "Index:" + i + ", Size:" + this.f74833d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74833d;
    }

    @Override // com.google.protobuf.C18544t.InterfaceC18553i
    /* renamed from: u */
    public C18544t.InterfaceC18546b mo45959k(int i) {
        if (i >= this.f74833d) {
            return new C18523i(Arrays.copyOf(this.f74832c, i), this.f74833d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Double remove(int i) {
        int i2;
        m46321a();
        m46130h(i);
        double[] dArr = this.f74832c;
        double d = dArr[i];
        if (i < this.f74833d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f74833d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: w */
    public Double set(int i, Double d) {
        return Double.valueOf(m46123x(i, d.doubleValue()));
    }

    /* renamed from: x */
    public double m46123x(int i, double d) {
        m46321a();
        m46130h(i);
        double[] dArr = this.f74832c;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public C18523i(double[] dArr, int i) {
        this.f74832c = dArr;
        this.f74833d = i;
    }
}
