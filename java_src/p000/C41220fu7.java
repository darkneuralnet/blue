package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: fu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41220fu7 extends AbstractC31782As7 implements RandomAccess, InterfaceC44185ku7, InterfaceC32745Ev7 {

    /* renamed from: e */
    public static final C41220fu7 f81046e;

    /* renamed from: c */
    public int[] f81047c;

    /* renamed from: d */
    public int f81048d;

    static {
        C41220fu7 c41220fu7 = new C41220fu7(new int[0], 0);
        f81046e = c41220fu7;
        c41220fu7.zzb();
    }

    public C41220fu7() {
        this(new int[10], 0);
    }

    /* renamed from: c */
    public static C41220fu7 m40572c() {
        return f81046e;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m114986a();
        if (i >= 0 && i <= (i2 = this.f81048d)) {
            int[] iArr = this.f81047c;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f81047c, i, iArr2, i + 1, this.f81048d - i);
                this.f81047c = iArr2;
            }
            this.f81047c[i] = intValue;
            this.f81048d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m40570f(i));
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m114986a();
        C46557ou7.m20293e(collection);
        if (!(collection instanceof C41220fu7)) {
            return super.addAll(collection);
        }
        C41220fu7 c41220fu7 = (C41220fu7) collection;
        int i = c41220fu7.f81048d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f81048d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f81047c;
            if (i3 > iArr.length) {
                this.f81047c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c41220fu7.f81047c, 0, this.f81047c, this.f81048d, c41220fu7.f81048d);
            this.f81048d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final int m40573b(int i) {
        m40569h(i);
        return this.f81047c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.InterfaceC45964nu7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC45964nu7 mo6153d(int i) {
        if (i >= this.f81048d) {
            return new C41220fu7(Arrays.copyOf(this.f81047c, i), this.f81048d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m40571e(int i) {
        m114986a();
        int i2 = this.f81048d;
        int[] iArr = this.f81047c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f81047c = iArr2;
        }
        int[] iArr3 = this.f81047c;
        int i3 = this.f81048d;
        this.f81048d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41220fu7)) {
            return super.equals(obj);
        }
        C41220fu7 c41220fu7 = (C41220fu7) obj;
        if (this.f81048d != c41220fu7.f81048d) {
            return false;
        }
        int[] iArr = c41220fu7.f81047c;
        for (int i = 0; i < this.f81048d; i++) {
            if (this.f81047c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m40570f(int i) {
        int i2 = this.f81048d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m40569h(i);
        return Integer.valueOf(this.f81047c[i]);
    }

    /* renamed from: h */
    public final void m40569h(int i) {
        if (i < 0 || i >= this.f81048d) {
            throw new IndexOutOfBoundsException(m40570f(i));
        }
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f81048d; i2++) {
            i = (i * 31) + this.f81047c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f81048d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f81047c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m114986a();
        m40569h(i);
        int[] iArr = this.f81047c;
        int i3 = iArr[i];
        if (i < this.f81048d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f81048d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m114986a();
        if (i2 >= i) {
            int[] iArr = this.f81047c;
            System.arraycopy(iArr, i2, iArr, i, this.f81048d - i2);
            this.f81048d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m114986a();
        m40569h(i);
        int[] iArr = this.f81047c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81048d;
    }

    public C41220fu7(int[] iArr, int i) {
        this.f81047c = iArr;
        this.f81048d = i;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m40571e(((Integer) obj).intValue());
        return true;
    }
}
