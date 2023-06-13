package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: La7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34194La7 extends AbstractC41613ga7 implements RandomAccess, InterfaceC40447ec7 {

    /* renamed from: e */
    public static final C34194La7 f21723e = new C34194La7(new double[0], 0, false);

    /* renamed from: c */
    public double[] f21724c;

    /* renamed from: d */
    public int f21725d;

    public C34194La7() {
        this(new double[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m39112a();
        if (i >= 0 && i <= (i2 = this.f21725d)) {
            double[] dArr = this.f21724c;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f21724c, i, dArr2, i + 1, this.f21725d - i);
                this.f21724c = dArr2;
            }
            this.f21724c[i] = doubleValue;
            this.f21725d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m96616c(i));
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m39112a();
        Charset charset = C46960pb7.f103839a;
        collection.getClass();
        if (!(collection instanceof C34194La7)) {
            return super.addAll(collection);
        }
        C34194La7 c34194La7 = (C34194La7) collection;
        int i = c34194La7.f21725d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f21725d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f21724c;
            if (i3 > dArr.length) {
                this.f21724c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c34194La7.f21724c, 0, this.f21724c, this.f21725d, c34194La7.f21725d);
            this.f21725d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m96617b(double d) {
        m39112a();
        int i = this.f21725d;
        double[] dArr = this.f21724c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f21724c = dArr2;
        }
        double[] dArr3 = this.f21724c;
        int i2 = this.f21725d;
        this.f21725d = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: c */
    public final String m96616c(int i) {
        int i2 = this.f21725d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m96615e(int i) {
        if (i < 0 || i >= this.f21725d) {
            throw new IndexOutOfBoundsException(m96616c(i));
        }
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34194La7)) {
            return super.equals(obj);
        }
        C34194La7 c34194La7 = (C34194La7) obj;
        if (this.f21725d != c34194La7.f21725d) {
            return false;
        }
        double[] dArr = c34194La7.f21724c;
        for (int i = 0; i < this.f21725d; i++) {
            if (Double.doubleToLongBits(this.f21724c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m96615e(i);
        return Double.valueOf(this.f21724c[i]);
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f21725d; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.f21724c[i2]);
            Charset charset = C46960pb7.f103839a;
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
        int i = this.f21725d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f21724c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.InterfaceC46367ob7
    /* renamed from: r0 */
    public final /* bridge */ /* synthetic */ InterfaceC46367ob7 mo1043r0(int i) {
        if (i >= this.f21725d) {
            return new C34194La7(Arrays.copyOf(this.f21724c, i), this.f21725d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m39112a();
        m96615e(i);
        double[] dArr = this.f21724c;
        double d = dArr[i];
        if (i < this.f21725d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f21725d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m39112a();
        if (i2 >= i) {
            double[] dArr = this.f21724c;
            System.arraycopy(dArr, i2, dArr, i, this.f21725d - i2);
            this.f21725d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m39112a();
        m96615e(i);
        double[] dArr = this.f21724c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21725d;
    }

    public C34194La7(double[] dArr, int i, boolean z) {
        super(z);
        this.f21724c = dArr;
        this.f21725d = i;
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m96617b(((Double) obj).doubleValue());
        return true;
    }
}
