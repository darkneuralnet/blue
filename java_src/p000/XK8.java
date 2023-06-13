package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: XK8 */
/* loaded from: classes5.dex */
public final class XK8 extends AbstractC39081cK8 implements RandomAccess, I29 {

    /* renamed from: e */
    public static final XK8 f42985e = new XK8(new boolean[0], 0, false);

    /* renamed from: c */
    public boolean[] f42986c;

    /* renamed from: d */
    public int f42987d;

    public XK8() {
        this(new boolean[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m61580a();
        if (i >= 0 && i <= (i2 = this.f42987d)) {
            boolean[] zArr = this.f42986c;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f42986c, i, zArr2, i + 1, this.f42987d - i);
                this.f42986c = zArr2;
            }
            this.f42986c[i] = booleanValue;
            this.f42987d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m77110c(i));
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m61580a();
        Charset charset = XV8.f43341a;
        collection.getClass();
        if (!(collection instanceof XK8)) {
            return super.addAll(collection);
        }
        XK8 xk8 = (XK8) collection;
        int i = xk8.f42987d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f42987d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f42986c;
            if (i3 > zArr.length) {
                this.f42986c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(xk8.f42986c, 0, this.f42986c, this.f42987d, xk8.f42987d);
            this.f42987d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m77111b(boolean z) {
        m61580a();
        int i = this.f42987d;
        boolean[] zArr = this.f42986c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f42986c = zArr2;
        }
        boolean[] zArr3 = this.f42986c;
        int i2 = this.f42987d;
        this.f42987d = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: c */
    public final String m77110c(int i) {
        int i2 = this.f42987d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.NV8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ NV8 mo21037d(int i) {
        if (i >= this.f42987d) {
            return new XK8(Arrays.copyOf(this.f42986c, i), this.f42987d, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m77109e(int i) {
        if (i < 0 || i >= this.f42987d) {
            throw new IndexOutOfBoundsException(m77110c(i));
        }
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XK8)) {
            return super.equals(obj);
        }
        XK8 xk8 = (XK8) obj;
        if (this.f42987d != xk8.f42987d) {
            return false;
        }
        boolean[] zArr = xk8.f42986c;
        for (int i = 0; i < this.f42987d; i++) {
            if (this.f42986c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m77109e(i);
        return Boolean.valueOf(this.f42986c[i]);
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f42987d; i2++) {
            i = (i * 31) + XV8.m76919a(this.f42986c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f42987d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f42986c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m61580a();
        m77109e(i);
        boolean[] zArr = this.f42986c;
        boolean z = zArr[i];
        if (i < this.f42987d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f42987d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m61580a();
        if (i2 >= i) {
            boolean[] zArr = this.f42986c;
            System.arraycopy(zArr, i2, zArr, i, this.f42987d - i2);
            this.f42987d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m61580a();
        m77109e(i);
        boolean[] zArr = this.f42986c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42987d;
    }

    public XK8(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f42986c = zArr;
        this.f42987d = i;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m77111b(((Boolean) obj).booleanValue());
        return true;
    }
}
