package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: z49  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52586z49 extends S39 implements RandomAccess, Zh9 {

    /* renamed from: e */
    public static final C52586z49 f120747e;

    /* renamed from: c */
    public boolean[] f120748c;

    /* renamed from: d */
    public int f120749d;

    static {
        C52586z49 c52586z49 = new C52586z49(new boolean[0], 0);
        f120747e = c52586z49;
        c52586z49.zzb();
    }

    public C52586z49() {
        this(new boolean[10], 0);
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m86050a();
        if (i >= 0 && i <= (i2 = this.f120749d)) {
            boolean[] zArr = this.f120748c;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f120748c, i, zArr2, i + 1, this.f120749d - i);
                this.f120748c = zArr2;
            }
            this.f120748c[i] = booleanValue;
            this.f120749d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m1844c(i));
    }

    @Override // p000.S39, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m86050a();
        C44007kc9.m28735e(collection);
        if (!(collection instanceof C52586z49)) {
            return super.addAll(collection);
        }
        C52586z49 c52586z49 = (C52586z49) collection;
        int i = c52586z49.f120749d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f120749d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f120748c;
            if (i3 > zArr.length) {
                this.f120748c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c52586z49.f120748c, 0, this.f120748c, this.f120749d, c52586z49.f120749d);
            this.f120749d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m1845b(boolean z) {
        m86050a();
        int i = this.f120749d;
        boolean[] zArr = this.f120748c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f120748c = zArr2;
        }
        boolean[] zArr3 = this.f120748c;
        int i2 = this.f120749d;
        this.f120749d = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: c */
    public final String m1844c(int i) {
        int i2 = this.f120749d;
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
        if (i >= this.f120749d) {
            return new C52586z49(Arrays.copyOf(this.f120748c, i), this.f120749d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m1842e(int i) {
        if (i < 0 || i >= this.f120749d) {
            throw new IndexOutOfBoundsException(m1844c(i));
        }
    }

    @Override // p000.S39, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52586z49)) {
            return super.equals(obj);
        }
        C52586z49 c52586z49 = (C52586z49) obj;
        if (this.f120749d != c52586z49.f120749d) {
            return false;
        }
        boolean[] zArr = c52586z49.f120748c;
        for (int i = 0; i < this.f120749d; i++) {
            if (this.f120748c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m1842e(i);
        return Boolean.valueOf(this.f120748c[i]);
    }

    @Override // p000.S39, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f120749d; i2++) {
            i = (i * 31) + C44007kc9.m28739a(this.f120748c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f120749d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f120748c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m86050a();
        m1842e(i);
        boolean[] zArr = this.f120748c;
        boolean z = zArr[i];
        if (i < this.f120749d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f120749d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m86050a();
        if (i2 >= i) {
            boolean[] zArr = this.f120748c;
            System.arraycopy(zArr, i2, zArr, i, this.f120749d - i2);
            this.f120749d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m86050a();
        m1842e(i);
        boolean[] zArr = this.f120748c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f120749d;
    }

    public C52586z49(boolean[] zArr, int i) {
        this.f120748c = zArr;
        this.f120749d = i;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m1845b(((Boolean) obj).booleanValue());
        return true;
    }
}
