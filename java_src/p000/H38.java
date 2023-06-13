package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: H38 */
/* loaded from: classes5.dex */
public final class H38 extends C28<Boolean> implements RandomAccess, InterfaceC51803xl8 {

    /* renamed from: e */
    public static final H38 f12792e;

    /* renamed from: c */
    public boolean[] f12793c;

    /* renamed from: d */
    public int f12794d;

    static {
        H38 h38 = new H38(new boolean[0], 0);
        f12792e = h38;
        h38.zzb();
    }

    public H38() {
        this(new boolean[10], 0);
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m112947a();
        if (i >= 0 && i <= (i2 = this.f12794d)) {
            boolean[] zArr = this.f12793c;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f12793c, i, zArr2, i + 1, this.f12794d - i);
                this.f12793c = zArr2;
            }
            this.f12793c[i] = booleanValue;
            this.f12794d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m104458c(i));
    }

    @Override // p000.C28, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m112947a();
        C41051fd8.m41090e(collection);
        if (!(collection instanceof H38)) {
            return super.addAll(collection);
        }
        H38 h38 = (H38) collection;
        int i = h38.f12794d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12794d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f12793c;
            if (i3 > zArr.length) {
                this.f12793c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(h38.f12793c, 0, this.f12793c, this.f12794d, h38.f12794d);
            this.f12794d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m104459b(boolean z) {
        m112947a();
        int i = this.f12794d;
        boolean[] zArr = this.f12793c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f12793c = zArr2;
        }
        boolean[] zArr3 = this.f12793c;
        int i2 = this.f12794d;
        this.f12794d = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: c */
    public final String m104458c(int i) {
        int i2 = this.f12794d;
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
        if (i >= this.f12794d) {
            return new H38(Arrays.copyOf(this.f12793c, i), this.f12794d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m104457e(int i) {
        if (i >= 0 && i < this.f12794d) {
            return;
        }
        throw new IndexOutOfBoundsException(m104458c(i));
    }

    @Override // p000.C28, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H38)) {
            return super.equals(obj);
        }
        H38 h38 = (H38) obj;
        if (this.f12794d != h38.f12794d) {
            return false;
        }
        boolean[] zArr = h38.f12793c;
        for (int i = 0; i < this.f12794d; i++) {
            if (this.f12793c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m104457e(i);
        return Boolean.valueOf(this.f12793c[i]);
    }

    @Override // p000.C28, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12794d; i2++) {
            i = (i * 31) + C41051fd8.m41094a(this.f12793c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f12794d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f12793c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m112947a();
        m104457e(i);
        boolean[] zArr = this.f12793c;
        boolean z = zArr[i];
        if (i < this.f12794d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f12794d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m112947a();
        if (i2 >= i) {
            boolean[] zArr = this.f12793c;
            System.arraycopy(zArr, i2, zArr, i, this.f12794d - i2);
            this.f12794d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m112947a();
        m104457e(i);
        boolean[] zArr = this.f12793c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12794d;
    }

    public H38(boolean[] zArr, int i) {
        this.f12793c = zArr;
        this.f12794d = i;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m104459b(((Boolean) obj).booleanValue());
        return true;
    }
}
