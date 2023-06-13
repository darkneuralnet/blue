package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Fj9 */
/* loaded from: classes6.dex */
public final class Fj9 extends AbstractC44037kf9<Double> implements RandomAccess, InterfaceC44147kq9 {

    /* renamed from: e */
    public static final Fj9 f10045e;

    /* renamed from: c */
    public double[] f10046c;

    /* renamed from: d */
    public int f10047d;

    static {
        Fj9 fj9 = new Fj9(new double[0], 0);
        f10045e = fj9;
        fj9.zzb();
    }

    public Fj9() {
        this(new double[10], 0);
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m28655a();
        if (i >= 0 && i <= (i2 = this.f10047d)) {
            double[] dArr = this.f10046c;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f10046c, i, dArr2, i + 1, this.f10047d - i);
                this.f10046c = dArr2;
            }
            this.f10046c[i] = doubleValue;
            this.f10047d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m106637c(i));
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m28655a();
        Fn9.m106450e(collection);
        if (!(collection instanceof Fj9)) {
            return super.addAll(collection);
        }
        Fj9 fj9 = (Fj9) collection;
        int i = fj9.f10047d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f10047d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f10046c;
            if (i3 > dArr.length) {
                this.f10046c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(fj9.f10046c, 0, this.f10046c, this.f10047d, fj9.f10047d);
            this.f10047d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m106638b(double d) {
        m28655a();
        int i = this.f10047d;
        double[] dArr = this.f10046c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f10046c = dArr2;
        }
        double[] dArr3 = this.f10046c;
        int i2 = this.f10047d;
        this.f10047d = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: c */
    public final String m106637c(int i) {
        int i2 = this.f10047d;
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

    @Override // p000.An9
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ An9 mo16911d(int i) {
        if (i >= this.f10047d) {
            return new Fj9(Arrays.copyOf(this.f10046c, i), this.f10047d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m106636e(int i) {
        if (i >= 0 && i < this.f10047d) {
            return;
        }
        throw new IndexOutOfBoundsException(m106637c(i));
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fj9)) {
            return super.equals(obj);
        }
        Fj9 fj9 = (Fj9) obj;
        if (this.f10047d != fj9.f10047d) {
            return false;
        }
        double[] dArr = fj9.f10046c;
        for (int i = 0; i < this.f10047d; i++) {
            if (Double.doubleToLongBits(this.f10046c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m106636e(i);
        return Double.valueOf(this.f10046c[i]);
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10047d; i2++) {
            i = (i * 31) + Fn9.m106452c(Double.doubleToLongBits(this.f10046c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f10047d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f10046c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m28655a();
        m106636e(i);
        double[] dArr = this.f10046c;
        double d = dArr[i];
        if (i < this.f10047d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f10047d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m28655a();
        if (i2 >= i) {
            double[] dArr = this.f10046c;
            System.arraycopy(dArr, i2, dArr, i, this.f10047d - i2);
            this.f10047d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m28655a();
        m106636e(i);
        double[] dArr = this.f10046c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10047d;
    }

    public Fj9(double[] dArr, int i) {
        this.f10046c = dArr;
        this.f10047d = i;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m106638b(((Double) obj).doubleValue());
        return true;
    }
}
