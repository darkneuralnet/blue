package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: dc8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39856dc8 extends C28<Integer> implements RandomAccess, InterfaceC51803xl8 {

    /* renamed from: e */
    public static final C39856dc8 f76886e;

    /* renamed from: c */
    public int[] f76887c;

    /* renamed from: d */
    public int f76888d;

    static {
        C39856dc8 c39856dc8 = new C39856dc8(new int[0], 0);
        f76886e = c39856dc8;
        c39856dc8.zzb();
    }

    public C39856dc8() {
        this(new int[10], 0);
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m112947a();
        if (i >= 0 && i <= (i2 = this.f76888d)) {
            int[] iArr = this.f76887c;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f76887c, i, iArr2, i + 1, this.f76888d - i);
                this.f76887c = iArr2;
            }
            this.f76887c[i] = intValue;
            this.f76888d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m44015c(i));
    }

    @Override // p000.C28, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m112947a();
        C41051fd8.m41090e(collection);
        if (!(collection instanceof C39856dc8)) {
            return super.addAll(collection);
        }
        C39856dc8 c39856dc8 = (C39856dc8) collection;
        int i = c39856dc8.f76888d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f76888d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f76887c;
            if (i3 > iArr.length) {
                this.f76887c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c39856dc8.f76887c, 0, this.f76887c, this.f76888d, c39856dc8.f76888d);
            this.f76888d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m44016b(int i) {
        m112947a();
        int i2 = this.f76888d;
        int[] iArr = this.f76887c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f76887c = iArr2;
        }
        int[] iArr3 = this.f76887c;
        int i3 = this.f76888d;
        this.f76888d = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: c */
    public final String m44015c(int i) {
        int i2 = this.f76888d;
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
        if (i >= this.f76888d) {
            return new C39856dc8(Arrays.copyOf(this.f76887c, i), this.f76888d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m44014e(int i) {
        if (i >= 0 && i < this.f76888d) {
            return;
        }
        throw new IndexOutOfBoundsException(m44015c(i));
    }

    @Override // p000.C28, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39856dc8)) {
            return super.equals(obj);
        }
        C39856dc8 c39856dc8 = (C39856dc8) obj;
        if (this.f76888d != c39856dc8.f76888d) {
            return false;
        }
        int[] iArr = c39856dc8.f76887c;
        for (int i = 0; i < this.f76888d; i++) {
            if (this.f76887c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m44014e(i);
        return Integer.valueOf(this.f76887c[i]);
    }

    @Override // p000.C28, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f76888d; i2++) {
            i = (i * 31) + this.f76887c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f76888d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f76887c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m112947a();
        m44014e(i);
        int[] iArr = this.f76887c;
        int i3 = iArr[i];
        if (i < this.f76888d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f76888d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m112947a();
        if (i2 >= i) {
            int[] iArr = this.f76887c;
            System.arraycopy(iArr, i2, iArr, i, this.f76888d - i2);
            this.f76888d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m112947a();
        m44014e(i);
        int[] iArr = this.f76887c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f76888d;
    }

    public C39856dc8(int[] iArr, int i) {
        this.f76887c = iArr;
        this.f76888d = i;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m44016b(((Integer) obj).intValue());
        return true;
    }
}
