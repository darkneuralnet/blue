package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: p89  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46698p89 extends S39 implements RandomAccess, Zh9 {

    /* renamed from: e */
    public static final C46698p89 f103201e;

    /* renamed from: c */
    public double[] f103202c;

    /* renamed from: d */
    public int f103203d;

    static {
        C46698p89 c46698p89 = new C46698p89(new double[0], 0);
        f103201e = c46698p89;
        c46698p89.zzb();
    }

    public C46698p89() {
        this(new double[10], 0);
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m86050a();
        if (i >= 0 && i <= (i2 = this.f103203d)) {
            double[] dArr = this.f103202c;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f103202c, i, dArr2, i + 1, this.f103203d - i);
                this.f103202c = dArr2;
            }
            this.f103202c[i] = doubleValue;
            this.f103203d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m19877c(i));
    }

    @Override // p000.S39, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m86050a();
        C44007kc9.m28735e(collection);
        if (!(collection instanceof C46698p89)) {
            return super.addAll(collection);
        }
        C46698p89 c46698p89 = (C46698p89) collection;
        int i = c46698p89.f103203d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f103203d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f103202c;
            if (i3 > dArr.length) {
                this.f103202c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c46698p89.f103202c, 0, this.f103202c, this.f103203d, c46698p89.f103203d);
            this.f103203d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m19878b(double d) {
        m86050a();
        int i = this.f103203d;
        double[] dArr = this.f103202c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f103202c = dArr2;
        }
        double[] dArr3 = this.f103202c;
        int i2 = this.f103203d;
        this.f103203d = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: c */
    public final String m19877c(int i) {
        int i2 = this.f103203d;
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

    @Override // p000.InterfaceC39857dc9
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC39857dc9 mo1843d(int i) {
        if (i >= this.f103203d) {
            return new C46698p89(Arrays.copyOf(this.f103202c, i), this.f103203d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m19876e(int i) {
        if (i < 0 || i >= this.f103203d) {
            throw new IndexOutOfBoundsException(m19877c(i));
        }
    }

    @Override // p000.S39, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46698p89)) {
            return super.equals(obj);
        }
        C46698p89 c46698p89 = (C46698p89) obj;
        if (this.f103203d != c46698p89.f103203d) {
            return false;
        }
        double[] dArr = c46698p89.f103202c;
        for (int i = 0; i < this.f103203d; i++) {
            if (Double.doubleToLongBits(this.f103202c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m19876e(i);
        return Double.valueOf(this.f103202c[i]);
    }

    @Override // p000.S39, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f103203d; i2++) {
            i = (i * 31) + C44007kc9.m28737c(Double.doubleToLongBits(this.f103202c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f103203d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f103202c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m86050a();
        m19876e(i);
        double[] dArr = this.f103202c;
        double d = dArr[i];
        if (i < this.f103203d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f103203d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m86050a();
        if (i2 >= i) {
            double[] dArr = this.f103202c;
            System.arraycopy(dArr, i2, dArr, i, this.f103203d - i2);
            this.f103203d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m86050a();
        m19876e(i);
        double[] dArr = this.f103202c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f103203d;
    }

    public C46698p89(double[] dArr, int i) {
        this.f103202c = dArr;
        this.f103203d = i;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m19878b(((Double) obj).doubleValue());
        return true;
    }
}
