package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: G88 */
/* loaded from: classes5.dex */
public final class G88 extends C28<Double> implements RandomAccess, InterfaceC51803xl8 {

    /* renamed from: e */
    public static final G88 f11047e;

    /* renamed from: c */
    public double[] f11048c;

    /* renamed from: d */
    public int f11049d;

    static {
        G88 g88 = new G88(new double[0], 0);
        f11047e = g88;
        g88.zzb();
    }

    public G88() {
        this(new double[10], 0);
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m112947a();
        if (i >= 0 && i <= (i2 = this.f11049d)) {
            double[] dArr = this.f11048c;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f11048c, i, dArr2, i + 1, this.f11049d - i);
                this.f11048c = dArr2;
            }
            this.f11048c[i] = doubleValue;
            this.f11049d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m105703c(i));
    }

    @Override // p000.C28, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m112947a();
        C41051fd8.m41090e(collection);
        if (!(collection instanceof G88)) {
            return super.addAll(collection);
        }
        G88 g88 = (G88) collection;
        int i = g88.f11049d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11049d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f11048c;
            if (i3 > dArr.length) {
                this.f11048c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(g88.f11048c, 0, this.f11048c, this.f11049d, g88.f11049d);
            this.f11049d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m105704b(double d) {
        m112947a();
        int i = this.f11049d;
        double[] dArr = this.f11048c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f11048c = dArr2;
        }
        double[] dArr3 = this.f11048c;
        int i2 = this.f11049d;
        this.f11049d = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: c */
    public final String m105703c(int i) {
        int i2 = this.f11049d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.InterfaceC35383Qc8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC35383Qc8 mo41068d(int i) {
        if (i >= this.f11049d) {
            return new G88(Arrays.copyOf(this.f11048c, i), this.f11049d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m105702e(int i) {
        if (i >= 0 && i < this.f11049d) {
            return;
        }
        throw new IndexOutOfBoundsException(m105703c(i));
    }

    @Override // p000.C28, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G88)) {
            return super.equals(obj);
        }
        G88 g88 = (G88) obj;
        if (this.f11049d != g88.f11049d) {
            return false;
        }
        double[] dArr = g88.f11048c;
        for (int i = 0; i < this.f11049d; i++) {
            if (Double.doubleToLongBits(this.f11048c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m105702e(i);
        return Double.valueOf(this.f11048c[i]);
    }

    @Override // p000.C28, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11049d; i2++) {
            i = (i * 31) + C41051fd8.m41092c(Double.doubleToLongBits(this.f11048c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f11049d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11048c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m112947a();
        m105702e(i);
        double[] dArr = this.f11048c;
        double d = dArr[i];
        if (i < this.f11049d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f11049d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m112947a();
        if (i2 >= i) {
            double[] dArr = this.f11048c;
            System.arraycopy(dArr, i2, dArr, i, this.f11049d - i2);
            this.f11049d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m112947a();
        m105702e(i);
        double[] dArr = this.f11048c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11049d;
    }

    public G88(double[] dArr, int i) {
        this.f11048c = dArr;
        this.f11049d = i;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m105704b(((Double) obj).doubleValue());
        return true;
    }
}
