package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Km9 */
/* loaded from: classes6.dex */
public final class Km9 extends AbstractC44037kf9<Integer> implements RandomAccess, InterfaceC42931in9, InterfaceC44147kq9 {

    /* renamed from: e */
    public static final Km9 f20217e;

    /* renamed from: c */
    public int[] f20218c;

    /* renamed from: d */
    public int f20219d;

    static {
        Km9 km9 = new Km9(new int[0], 0);
        f20217e = km9;
        km9.zzb();
    }

    public Km9() {
        this(new int[10], 0);
    }

    /* renamed from: c */
    public static Km9 m98294c() {
        return f20217e;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m28655a();
        if (i >= 0 && i <= (i2 = this.f20219d)) {
            int[] iArr = this.f20218c;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f20218c, i, iArr2, i + 1, this.f20219d - i);
                this.f20218c = iArr2;
            }
            this.f20218c[i] = intValue;
            this.f20219d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m98293e(i));
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m28655a();
        Fn9.m106450e(collection);
        if (!(collection instanceof Km9)) {
            return super.addAll(collection);
        }
        Km9 km9 = (Km9) collection;
        int i = km9.f20219d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f20219d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f20218c;
            if (i3 > iArr.length) {
                this.f20218c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(km9.f20218c, 0, this.f20218c, this.f20219d, km9.f20219d);
            this.f20219d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final int m98295b(int i) {
        m98292f(i);
        return this.f20218c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String m98293e(int i) {
        int i2 = this.f20219d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Km9)) {
            return super.equals(obj);
        }
        Km9 km9 = (Km9) obj;
        if (this.f20219d != km9.f20219d) {
            return false;
        }
        int[] iArr = km9.f20218c;
        for (int i = 0; i < this.f20219d; i++) {
            if (this.f20218c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m98292f(int i) {
        if (i >= 0 && i < this.f20219d) {
            return;
        }
        throw new IndexOutOfBoundsException(m98293e(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m98292f(i);
        return Integer.valueOf(this.f20218c[i]);
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20219d; i2++) {
            i = (i * 31) + this.f20218c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f20219d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f20218c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.An9
    /* renamed from: p */
    public final InterfaceC42931in9 mo16911d(int i) {
        if (i >= this.f20219d) {
            return new Km9(Arrays.copyOf(this.f20218c, i), this.f20219d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m28655a();
        m98292f(i);
        int[] iArr = this.f20218c;
        int i3 = iArr[i];
        if (i < this.f20219d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f20219d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m28655a();
        if (i2 >= i) {
            int[] iArr = this.f20218c;
            System.arraycopy(iArr, i2, iArr, i, this.f20219d - i2);
            this.f20219d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m28655a();
        m98292f(i);
        int[] iArr = this.f20218c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20219d;
    }

    @Override // p000.InterfaceC42931in9
    public final void zzh(int i) {
        m28655a();
        int i2 = this.f20219d;
        int[] iArr = this.f20218c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f20218c = iArr2;
        }
        int[] iArr3 = this.f20218c;
        int i3 = this.f20219d;
        this.f20219d = i3 + 1;
        iArr3[i3] = i;
    }

    public Km9(int[] iArr, int i) {
        this.f20218c = iArr;
        this.f20219d = i;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
