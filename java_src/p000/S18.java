package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: S18 */
/* loaded from: classes5.dex */
public final class S18 extends AbstractC40966fU7 implements RandomAccess, InterfaceC41131fl8 {

    /* renamed from: e */
    public static final S18 f33043e = new S18(new double[0], 0, false);

    /* renamed from: c */
    public double[] f33044c;

    /* renamed from: d */
    public int f33045d;

    public S18() {
        this(new double[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m41291a();
        if (i >= 0 && i <= (i2 = this.f33045d)) {
            double[] dArr = this.f33044c;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f33044c, i, dArr2, i + 1, this.f33045d - i);
                this.f33044c = dArr2;
            }
            this.f33044c[i] = doubleValue;
            this.f33045d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m86091c(i));
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m41291a();
        Charset charset = C32791Fa8.f9736a;
        collection.getClass();
        if (!(collection instanceof S18)) {
            return super.addAll(collection);
        }
        S18 s18 = (S18) collection;
        int i = s18.f33045d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f33045d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f33044c;
            if (i3 > dArr.length) {
                this.f33044c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(s18.f33044c, 0, this.f33044c, this.f33045d, s18.f33045d);
            this.f33045d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m86092b(double d) {
        m41291a();
        int i = this.f33045d;
        double[] dArr = this.f33044c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f33044c = dArr2;
        }
        double[] dArr3 = this.f33044c;
        int i2 = this.f33045d;
        this.f33045d = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: c */
    public final String m86091c(int i) {
        int i2 = this.f33045d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.InterfaceC47544qa8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC47544qa8 mo17376d(int i) {
        if (i >= this.f33045d) {
            return new S18(Arrays.copyOf(this.f33044c, i), this.f33045d, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m86090e(int i) {
        if (i < 0 || i >= this.f33045d) {
            throw new IndexOutOfBoundsException(m86091c(i));
        }
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S18)) {
            return super.equals(obj);
        }
        S18 s18 = (S18) obj;
        if (this.f33045d != s18.f33045d) {
            return false;
        }
        double[] dArr = s18.f33044c;
        for (int i = 0; i < this.f33045d; i++) {
            if (Double.doubleToLongBits(this.f33044c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m86090e(i);
        return Double.valueOf(this.f33044c[i]);
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f33045d; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.f33044c[i2]);
            Charset charset = C32791Fa8.f9736a;
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
        int i = this.f33045d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f33044c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m41291a();
        m86090e(i);
        double[] dArr = this.f33044c;
        double d = dArr[i];
        if (i < this.f33045d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f33045d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m41291a();
        if (i2 >= i) {
            double[] dArr = this.f33044c;
            System.arraycopy(dArr, i2, dArr, i, this.f33045d - i2);
            this.f33045d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m41291a();
        m86090e(i);
        double[] dArr = this.f33044c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33045d;
    }

    public S18(double[] dArr, int i, boolean z) {
        super(z);
        this.f33044c = dArr;
        this.f33045d = i;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m86092b(((Double) obj).doubleValue());
        return true;
    }
}
