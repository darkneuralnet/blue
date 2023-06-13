package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Bb9 */
/* loaded from: classes5.dex */
public final class Bb9 extends S39 implements RandomAccess, Zh9 {

    /* renamed from: e */
    public static final Bb9 f2551e;

    /* renamed from: c */
    public int[] f2552c;

    /* renamed from: d */
    public int f2553d;

    static {
        Bb9 bb9 = new Bb9(new int[0], 0);
        f2551e = bb9;
        bb9.zzb();
    }

    public Bb9() {
        this(new int[10], 0);
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m86050a();
        if (i >= 0 && i <= (i2 = this.f2553d)) {
            int[] iArr = this.f2552c;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f2552c, i, iArr2, i + 1, this.f2553d - i);
                this.f2552c = iArr2;
            }
            this.f2552c[i] = intValue;
            this.f2553d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m113808e(i));
    }

    @Override // p000.S39, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m86050a();
        C44007kc9.m28735e(collection);
        if (!(collection instanceof Bb9)) {
            return super.addAll(collection);
        }
        Bb9 bb9 = (Bb9) collection;
        int i = bb9.f2553d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2553d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f2552c;
            if (i3 > iArr.length) {
                this.f2552c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(bb9.f2552c, 0, this.f2552c, this.f2553d, bb9.f2553d);
            this.f2553d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final int m113810b(int i) {
        zzh(i);
        return this.f2552c[i];
    }

    /* renamed from: c */
    public final void m113809c(int i) {
        m86050a();
        int i2 = this.f2553d;
        int[] iArr = this.f2552c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f2552c = iArr2;
        }
        int[] iArr3 = this.f2552c;
        int i3 = this.f2553d;
        this.f2553d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.InterfaceC39857dc9
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC39857dc9 mo1843d(int i) {
        if (i >= this.f2553d) {
            return new Bb9(Arrays.copyOf(this.f2552c, i), this.f2553d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final String m113808e(int i) {
        int i2 = this.f2553d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.S39, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bb9)) {
            return super.equals(obj);
        }
        Bb9 bb9 = (Bb9) obj;
        if (this.f2553d != bb9.f2553d) {
            return false;
        }
        int[] iArr = bb9.f2552c;
        for (int i = 0; i < this.f2553d; i++) {
            if (this.f2552c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzh(i);
        return Integer.valueOf(this.f2552c[i]);
    }

    @Override // p000.S39, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f2553d; i2++) {
            i = (i * 31) + this.f2552c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f2553d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2552c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m86050a();
        zzh(i);
        int[] iArr = this.f2552c;
        int i3 = iArr[i];
        if (i < this.f2553d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f2553d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m86050a();
        if (i2 >= i) {
            int[] iArr = this.f2552c;
            System.arraycopy(iArr, i2, iArr, i, this.f2553d - i2);
            this.f2553d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m86050a();
        zzh(i);
        int[] iArr = this.f2552c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2553d;
    }

    public final void zzh(int i) {
        if (i < 0 || i >= this.f2553d) {
            throw new IndexOutOfBoundsException(m113808e(i));
        }
    }

    public Bb9(int[] iArr, int i) {
        this.f2552c = iArr;
        this.f2553d = i;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m113809c(((Integer) obj).intValue());
        return true;
    }
}
