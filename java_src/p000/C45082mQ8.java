package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: mQ8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45082mQ8 extends AbstractC39081cK8 implements RandomAccess, I29 {

    /* renamed from: e */
    public static final C45082mQ8 f97988e = new C45082mQ8(new double[0], 0, false);

    /* renamed from: c */
    public double[] f97989c;

    /* renamed from: d */
    public int f97990d;

    public C45082mQ8() {
        this(new double[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m61580a();
        if (i >= 0 && i <= (i2 = this.f97990d)) {
            double[] dArr = this.f97989c;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f97989c, i, dArr2, i + 1, this.f97990d - i);
                this.f97989c = dArr2;
            }
            this.f97989c[i] = doubleValue;
            this.f97990d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m25649c(i));
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m61580a();
        Charset charset = XV8.f43341a;
        collection.getClass();
        if (!(collection instanceof C45082mQ8)) {
            return super.addAll(collection);
        }
        C45082mQ8 c45082mQ8 = (C45082mQ8) collection;
        int i = c45082mQ8.f97990d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f97990d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f97989c;
            if (i3 > dArr.length) {
                this.f97989c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c45082mQ8.f97989c, 0, this.f97989c, this.f97990d, c45082mQ8.f97990d);
            this.f97990d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m25650b(double d) {
        m61580a();
        int i = this.f97990d;
        double[] dArr = this.f97989c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f97989c = dArr2;
        }
        double[] dArr3 = this.f97989c;
        int i2 = this.f97990d;
        this.f97990d = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: c */
    public final String m25649c(int i) {
        int i2 = this.f97990d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.NV8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ NV8 mo21037d(int i) {
        if (i >= this.f97990d) {
            return new C45082mQ8(Arrays.copyOf(this.f97989c, i), this.f97990d, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m25648e(int i) {
        if (i < 0 || i >= this.f97990d) {
            throw new IndexOutOfBoundsException(m25649c(i));
        }
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45082mQ8)) {
            return super.equals(obj);
        }
        C45082mQ8 c45082mQ8 = (C45082mQ8) obj;
        if (this.f97990d != c45082mQ8.f97990d) {
            return false;
        }
        double[] dArr = c45082mQ8.f97989c;
        for (int i = 0; i < this.f97990d; i++) {
            if (Double.doubleToLongBits(this.f97989c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m25648e(i);
        return Double.valueOf(this.f97989c[i]);
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f97990d; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.f97989c[i2]);
            Charset charset = XV8.f43341a;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f97990d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f97989c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m61580a();
        m25648e(i);
        double[] dArr = this.f97989c;
        double d = dArr[i];
        if (i < this.f97990d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f97990d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m61580a();
        if (i2 >= i) {
            double[] dArr = this.f97989c;
            System.arraycopy(dArr, i2, dArr, i, this.f97990d - i2);
            this.f97990d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m61580a();
        m25648e(i);
        double[] dArr = this.f97989c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f97990d;
    }

    public C45082mQ8(double[] dArr, int i, boolean z) {
        super(z);
        this.f97989c = dArr;
        this.f97990d = i;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m25650b(((Double) obj).doubleValue());
        return true;
    }
}
