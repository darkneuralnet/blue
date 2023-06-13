package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Af9 */
/* loaded from: classes6.dex */
public final class Af9 extends AbstractC44037kf9<Boolean> implements RandomAccess, InterfaceC44147kq9 {

    /* renamed from: e */
    public static final Af9 f943e;

    /* renamed from: c */
    public boolean[] f944c;

    /* renamed from: d */
    public int f945d;

    static {
        Af9 af9 = new Af9(new boolean[0], 0);
        f943e = af9;
        af9.zzb();
    }

    public Af9() {
        this(new boolean[10], 0);
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m28655a();
        if (i >= 0 && i <= (i2 = this.f945d)) {
            boolean[] zArr = this.f944c;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f944c, i, zArr2, i + 1, this.f945d - i);
                this.f944c = zArr2;
            }
            this.f944c[i] = booleanValue;
            this.f945d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m115389c(i));
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m28655a();
        Fn9.m106450e(collection);
        if (!(collection instanceof Af9)) {
            return super.addAll(collection);
        }
        Af9 af9 = (Af9) collection;
        int i = af9.f945d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f945d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f944c;
            if (i3 > zArr.length) {
                this.f944c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(af9.f944c, 0, this.f944c, this.f945d, af9.f945d);
            this.f945d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m115390b(boolean z) {
        m28655a();
        int i = this.f945d;
        boolean[] zArr = this.f944c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f944c = zArr2;
        }
        boolean[] zArr3 = this.f944c;
        int i2 = this.f945d;
        this.f945d = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: c */
    public final String m115389c(int i) {
        int i2 = this.f945d;
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
        if (i >= this.f945d) {
            return new Af9(Arrays.copyOf(this.f944c, i), this.f945d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m115388e(int i) {
        if (i >= 0 && i < this.f945d) {
            return;
        }
        throw new IndexOutOfBoundsException(m115389c(i));
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Af9)) {
            return super.equals(obj);
        }
        Af9 af9 = (Af9) obj;
        if (this.f945d != af9.f945d) {
            return false;
        }
        boolean[] zArr = af9.f944c;
        for (int i = 0; i < this.f945d; i++) {
            if (this.f944c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m115388e(i);
        return Boolean.valueOf(this.f944c[i]);
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f945d; i2++) {
            i = (i * 31) + Fn9.m106454a(this.f944c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f945d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f944c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m28655a();
        m115388e(i);
        boolean[] zArr = this.f944c;
        boolean z = zArr[i];
        if (i < this.f945d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f945d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m28655a();
        if (i2 >= i) {
            boolean[] zArr = this.f944c;
            System.arraycopy(zArr, i2, zArr, i, this.f945d - i2);
            this.f945d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m28655a();
        m115388e(i);
        boolean[] zArr = this.f944c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f945d;
    }

    public Af9(boolean[] zArr, int i) {
        this.f944c = zArr;
        this.f945d = i;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m115390b(((Boolean) obj).booleanValue());
        return true;
    }
}
