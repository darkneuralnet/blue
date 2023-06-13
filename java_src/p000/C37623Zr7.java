package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Zr7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37623Zr7 extends Bh9<Double> implements FW7, RandomAccess {

    /* renamed from: e */
    public static final C37623Zr7 f49415e;

    /* renamed from: c */
    public double[] f49416c;

    /* renamed from: d */
    public int f49417d;

    static {
        C37623Zr7 c37623Zr7 = new C37623Zr7(new double[0], 0);
        f49415e = c37623Zr7;
        c37623Zr7.mo113666q();
    }

    public C37623Zr7() {
        this(new double[10], 0);
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m72385c(i, ((Double) obj).doubleValue());
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m113667a();
        C44389lF7.m27619a(collection);
        if (!(collection instanceof C37623Zr7)) {
            return super.addAll(collection);
        }
        C37623Zr7 c37623Zr7 = (C37623Zr7) collection;
        int i = c37623Zr7.f49417d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f49417d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f49416c;
            if (i3 > dArr.length) {
                this.f49416c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c37623Zr7.f49416c, 0, this.f49416c, this.f49417d, c37623Zr7.f49417d);
            this.f49417d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m72386b(double d) {
        m72385c(this.f49417d, d);
    }

    /* renamed from: c */
    public final void m72385c(int i, double d) {
        int i2;
        m113667a();
        if (i >= 0 && i <= (i2 = this.f49417d)) {
            double[] dArr = this.f49416c;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f49416c, i, dArr2, i + 1, this.f49417d - i);
                this.f49416c = dArr2;
            }
            this.f49416c[i] = d;
            this.f49417d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m72383f(i));
    }

    /* renamed from: e */
    public final void m72384e(int i) {
        if (i >= 0 && i < this.f49417d) {
            return;
        }
        throw new IndexOutOfBoundsException(m72383f(i));
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37623Zr7)) {
            return super.equals(obj);
        }
        C37623Zr7 c37623Zr7 = (C37623Zr7) obj;
        if (this.f49417d != c37623Zr7.f49417d) {
            return false;
        }
        double[] dArr = c37623Zr7.f49416c;
        for (int i = 0; i < this.f49417d; i++) {
            if (Double.doubleToLongBits(this.f49416c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m72383f(int i) {
        int i2 = this.f49417d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m72384e(i);
        return Double.valueOf(this.f49416c[i]);
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f49417d; i2++) {
            i = (i * 31) + C44389lF7.m27610j(Double.doubleToLongBits(this.f49416c[i2]));
        }
        return i;
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m113667a();
        for (int i = 0; i < this.f49417d; i++) {
            if (obj.equals(Double.valueOf(this.f49416c[i]))) {
                double[] dArr = this.f49416c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f49417d - i) - 1);
                this.f49417d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m113667a();
        if (i2 >= i) {
            double[] dArr = this.f49416c;
            System.arraycopy(dArr, i2, dArr, i, this.f49417d - i2);
            this.f49417d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m113667a();
        m72384e(i);
        double[] dArr = this.f49416c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49417d;
    }

    @Override // p000.BI7
    public final /* synthetic */ BI7 zzh(int i) {
        if (i >= this.f49417d) {
            return new C37623Zr7(Arrays.copyOf(this.f49416c, i), this.f49417d);
        }
        throw new IllegalArgumentException();
    }

    public C37623Zr7(double[] dArr, int i) {
        this.f49416c = dArr;
        this.f49417d = i;
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        m113667a();
        m72384e(i);
        double[] dArr = this.f49416c;
        double d = dArr[i];
        if (i < this.f49417d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f49417d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }
}
