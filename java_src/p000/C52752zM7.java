package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: zM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52752zM7 extends AbstractC36507Ux7<Double> implements RandomAccess {

    /* renamed from: e */
    public static final C52752zM7 f121136e;

    /* renamed from: c */
    public double[] f121137c;

    /* renamed from: d */
    public int f121138d;

    static {
        C52752zM7 c52752zM7 = new C52752zM7();
        f121136e = c52752zM7;
        c52752zM7.zzv();
    }

    public C52752zM7() {
        this(new double[10], 0);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m1505c(i, ((Double) obj).doubleValue());
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m80580a();
        C37975aT7.m71332a(collection);
        if (collection instanceof C52752zM7) {
            C52752zM7 c52752zM7 = (C52752zM7) collection;
            int i = c52752zM7.f121138d;
            if (i == 0) {
                return false;
            }
            int i2 = this.f121138d;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                double[] dArr = this.f121137c;
                if (i3 > dArr.length) {
                    this.f121137c = Arrays.copyOf(dArr, i3);
                }
                System.arraycopy(c52752zM7.f121137c, 0, this.f121137c, this.f121138d, c52752zM7.f121138d);
                this.f121138d = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void m1506b(double d) {
        m1505c(this.f121138d, d);
    }

    /* renamed from: c */
    public final void m1505c(int i, double d) {
        int i2;
        m80580a();
        if (i < 0 || i > (i2 = this.f121138d)) {
            throw new IndexOutOfBoundsException(m1503f(i));
        }
        double[] dArr = this.f121137c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f121137c, i, dArr2, i + 1, this.f121138d - i);
            this.f121137c = dArr2;
        }
        this.f121137c[i] = d;
        this.f121138d++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: e */
    public final void m1504e(int i) {
        if (i < 0 || i >= this.f121138d) {
            throw new IndexOutOfBoundsException(m1503f(i));
        }
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52752zM7) {
            C52752zM7 c52752zM7 = (C52752zM7) obj;
            if (this.f121138d != c52752zM7.f121138d) {
                return false;
            }
            double[] dArr = c52752zM7.f121137c;
            for (int i = 0; i < this.f121138d; i++) {
                if (this.f121137c[i] != dArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final String m1503f(int i) {
        int i2 = this.f121138d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m1504e(i);
        return Double.valueOf(this.f121137c[i]);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f121138d; i2++) {
            i = (i * 31) + C37975aT7.m71323j(Double.doubleToLongBits(this.f121137c[i2]));
        }
        return i;
    }

    @Override // p000.InterfaceC47489qU7
    /* renamed from: n */
    public final /* synthetic */ InterfaceC47489qU7 mo1502n(int i) {
        if (i >= this.f121138d) {
            return new C52752zM7(Arrays.copyOf(this.f121137c, i), this.f121138d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m80580a();
        m1504e(i);
        double[] dArr = this.f121137c;
        double d = dArr[i];
        int i2 = this.f121138d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, i2 - i);
        }
        this.f121138d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m80580a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f121137c;
        System.arraycopy(dArr, i2, dArr, i, this.f121138d - i2);
        this.f121138d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m80580a();
        m1504e(i);
        double[] dArr = this.f121137c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f121138d;
    }

    public C52752zM7(double[] dArr, int i) {
        this.f121137c = dArr;
        this.f121138d = i;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m80580a();
        for (int i = 0; i < this.f121138d; i++) {
            if (obj.equals(Double.valueOf(this.f121137c[i]))) {
                double[] dArr = this.f121137c;
                System.arraycopy(dArr, i + 1, dArr, i, this.f121138d - i);
                this.f121138d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
