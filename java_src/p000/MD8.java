package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: MD8 */
/* loaded from: classes6.dex */
public final class MD8 extends AbstractC41834gw8<Double> implements IS8, RandomAccess {

    /* renamed from: e */
    public static final MD8 f22890e;

    /* renamed from: c */
    public double[] f22891c;

    /* renamed from: d */
    public int f22892d;

    static {
        MD8 md8 = new MD8(new double[0], 0);
        f22890e = md8;
        md8.zzb();
    }

    public MD8() {
        this(new double[10], 0);
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m37302a();
        if (i >= 0 && i <= (i2 = this.f22892d)) {
            double[] dArr = this.f22891c;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f22891c, i, dArr2, i + 1, this.f22892d - i);
                this.f22891c = dArr2;
            }
            this.f22891c[i] = doubleValue;
            this.f22892d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m95486e(i));
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m37302a();
        C52124yI8.m3691d(collection);
        if (!(collection instanceof MD8)) {
            return super.addAll(collection);
        }
        MD8 md8 = (MD8) collection;
        int i = md8.f22892d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22892d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f22891c;
            if (i3 > dArr.length) {
                this.f22891c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(md8.f22891c, 0, this.f22891c, this.f22892d, md8.f22892d);
            this.f22892d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m95488b(double d) {
        m37302a();
        int i = this.f22892d;
        double[] dArr = this.f22891c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f22891c = dArr2;
        }
        double[] dArr3 = this.f22891c;
        int i2 = this.f22892d;
        this.f22892d = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: c */
    public final void m95487c(int i) {
        if (i >= 0 && i < this.f22892d) {
            return;
        }
        throw new IndexOutOfBoundsException(m95486e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String m95486e(int i) {
        int i2 = this.f22892d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MD8)) {
            return super.equals(obj);
        }
        MD8 md8 = (MD8) obj;
        if (this.f22892d != md8.f22892d) {
            return false;
        }
        double[] dArr = md8.f22891c;
        for (int i = 0; i < this.f22892d; i++) {
            if (Double.doubleToLongBits(this.f22891c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m95487c(i);
        return Double.valueOf(this.f22891c[i]);
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22892d; i2++) {
            i = (i * 31) + C52124yI8.m3693b(Double.doubleToLongBits(this.f22891c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f22891c[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        m37302a();
        m95487c(i);
        double[] dArr = this.f22891c;
        double d = dArr[i];
        if (i < this.f22892d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f22892d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m37302a();
        if (i2 >= i) {
            double[] dArr = this.f22891c;
            System.arraycopy(dArr, i2, dArr, i, this.f22892d - i2);
            this.f22892d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m37302a();
        m95487c(i);
        double[] dArr = this.f22891c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22892d;
    }

    @Override // p000.RJ8
    public final /* synthetic */ RJ8 zza(int i) {
        if (i >= this.f22892d) {
            return new MD8(Arrays.copyOf(this.f22891c, i), this.f22892d);
        }
        throw new IllegalArgumentException();
    }

    public MD8(double[] dArr, int i) {
        this.f22891c = dArr;
        this.f22892d = i;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m95488b(((Double) obj).doubleValue());
        return true;
    }
}
