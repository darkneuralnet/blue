package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: aI8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37877aI8 extends AbstractC41834gw8<Integer> implements IS8, RandomAccess {

    /* renamed from: e */
    public static final C37877aI8 f50272e;

    /* renamed from: c */
    public int[] f50273c;

    /* renamed from: d */
    public int f50274d;

    static {
        C37877aI8 c37877aI8 = new C37877aI8(new int[0], 0);
        f50272e = c37877aI8;
        c37877aI8.zzb();
    }

    public C37877aI8() {
        this(new int[10], 0);
    }

    /* renamed from: e */
    public static C37877aI8 m71671e() {
        return f50272e;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m37302a();
        if (i >= 0 && i <= (i2 = this.f50274d)) {
            int[] iArr = this.f50273c;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f50273c, i, iArr2, i + 1, this.f50274d - i);
                this.f50273c = iArr2;
            }
            this.f50273c[i] = intValue;
            this.f50274d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m71669h(i));
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m37302a();
        C52124yI8.m3691d(collection);
        if (!(collection instanceof C37877aI8)) {
            return super.addAll(collection);
        }
        C37877aI8 c37877aI8 = (C37877aI8) collection;
        int i = c37877aI8.f50274d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f50274d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f50273c;
            if (i3 > iArr.length) {
                this.f50273c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c37877aI8.f50273c, 0, this.f50273c, this.f50274d, c37877aI8.f50274d);
            this.f50274d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final int m71673b(int i) {
        m71670f(i);
        return this.f50273c[i];
    }

    /* renamed from: c */
    public final void m71672c(int i) {
        m37302a();
        int i2 = this.f50274d;
        int[] iArr = this.f50273c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f50273c = iArr2;
        }
        int[] iArr3 = this.f50273c;
        int i3 = this.f50274d;
        this.f50274d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37877aI8)) {
            return super.equals(obj);
        }
        C37877aI8 c37877aI8 = (C37877aI8) obj;
        if (this.f50274d != c37877aI8.f50274d) {
            return false;
        }
        int[] iArr = c37877aI8.f50273c;
        for (int i = 0; i < this.f50274d; i++) {
            if (this.f50273c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m71670f(int i) {
        if (i >= 0 && i < this.f50274d) {
            return;
        }
        throw new IndexOutOfBoundsException(m71669h(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(m71673b(i));
    }

    /* renamed from: h */
    public final String m71669h(int i) {
        int i2 = this.f50274d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f50274d; i2++) {
            i = (i * 31) + this.f50273c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f50273c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        m37302a();
        m71670f(i);
        int[] iArr = this.f50273c;
        int i3 = iArr[i];
        if (i < this.f50274d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f50274d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m37302a();
        if (i2 >= i) {
            int[] iArr = this.f50273c;
            System.arraycopy(iArr, i2, iArr, i, this.f50274d - i2);
            this.f50274d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m37302a();
        m71670f(i);
        int[] iArr = this.f50273c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50274d;
    }

    @Override // p000.RJ8
    public final /* synthetic */ RJ8 zza(int i) {
        if (i >= this.f50274d) {
            return new C37877aI8(Arrays.copyOf(this.f50273c, i), this.f50274d);
        }
        throw new IllegalArgumentException();
    }

    public C37877aI8(int[] iArr, int i) {
        this.f50273c = iArr;
        this.f50274d = i;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m71672c(((Integer) obj).intValue());
        return true;
    }
}
