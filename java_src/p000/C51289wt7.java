package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: wt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51289wt7 extends AbstractC31782As7 implements RandomAccess, InterfaceC32745Ev7 {

    /* renamed from: e */
    public static final C51289wt7 f116785e;

    /* renamed from: c */
    public double[] f116786c;

    /* renamed from: d */
    public int f116787d;

    static {
        C51289wt7 c51289wt7 = new C51289wt7(new double[0], 0);
        f116785e = c51289wt7;
        c51289wt7.zzb();
    }

    public C51289wt7() {
        this(new double[10], 0);
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m114986a();
        if (i >= 0 && i <= (i2 = this.f116787d)) {
            double[] dArr = this.f116786c;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f116786c, i, dArr2, i + 1, this.f116787d - i);
                this.f116786c = dArr2;
            }
            this.f116786c[i] = doubleValue;
            this.f116787d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m6154c(i));
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m114986a();
        C46557ou7.m20293e(collection);
        if (!(collection instanceof C51289wt7)) {
            return super.addAll(collection);
        }
        C51289wt7 c51289wt7 = (C51289wt7) collection;
        int i = c51289wt7.f116787d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f116787d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f116786c;
            if (i3 > dArr.length) {
                this.f116786c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c51289wt7.f116786c, 0, this.f116786c, this.f116787d, c51289wt7.f116787d);
            this.f116787d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m6155b(double d) {
        m114986a();
        int i = this.f116787d;
        double[] dArr = this.f116786c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f116786c = dArr2;
        }
        double[] dArr3 = this.f116786c;
        int i2 = this.f116787d;
        this.f116787d = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: c */
    public final String m6154c(int i) {
        int i2 = this.f116787d;
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

    @Override // p000.InterfaceC45964nu7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC45964nu7 mo6153d(int i) {
        if (i >= this.f116787d) {
            return new C51289wt7(Arrays.copyOf(this.f116786c, i), this.f116787d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m6152e(int i) {
        if (i < 0 || i >= this.f116787d) {
            throw new IndexOutOfBoundsException(m6154c(i));
        }
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51289wt7)) {
            return super.equals(obj);
        }
        C51289wt7 c51289wt7 = (C51289wt7) obj;
        if (this.f116787d != c51289wt7.f116787d) {
            return false;
        }
        double[] dArr = c51289wt7.f116786c;
        for (int i = 0; i < this.f116787d; i++) {
            if (Double.doubleToLongBits(this.f116786c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m6152e(i);
        return Double.valueOf(this.f116786c[i]);
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f116787d; i2++) {
            i = (i * 31) + C46557ou7.m20295c(Double.doubleToLongBits(this.f116786c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f116787d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f116786c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m114986a();
        m6152e(i);
        double[] dArr = this.f116786c;
        double d = dArr[i];
        if (i < this.f116787d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f116787d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m114986a();
        if (i2 >= i) {
            double[] dArr = this.f116786c;
            System.arraycopy(dArr, i2, dArr, i, this.f116787d - i2);
            this.f116787d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m114986a();
        m6152e(i);
        double[] dArr = this.f116786c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f116787d;
    }

    public C51289wt7(double[] dArr, int i) {
        this.f116786c = dArr;
        this.f116787d = i;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m6155b(((Double) obj).doubleValue());
        return true;
    }
}
