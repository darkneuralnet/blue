package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: bG7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38451bG7 extends Bh9<Integer> implements InterfaceC48575sJ7, FW7, RandomAccess {

    /* renamed from: e */
    public static final C38451bG7 f57211e;

    /* renamed from: c */
    public int[] f57212c;

    /* renamed from: d */
    public int f57213d;

    static {
        C38451bG7 c38451bG7 = new C38451bG7(new int[0], 0);
        f57211e = c38451bG7;
        c38451bG7.mo113666q();
    }

    public C38451bG7() {
        this(new int[10], 0);
    }

    /* renamed from: c */
    public static C38451bG7 m64734c() {
        return f57211e;
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m64731h(i, ((Integer) obj).intValue());
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m113667a();
        C44389lF7.m27619a(collection);
        if (!(collection instanceof C38451bG7)) {
            return super.addAll(collection);
        }
        C38451bG7 c38451bG7 = (C38451bG7) collection;
        int i = c38451bG7.f57213d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f57213d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f57212c;
            if (i3 > iArr.length) {
                this.f57212c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c38451bG7.f57212c, 0, this.f57212c, this.f57213d, c38451bG7.f57213d);
            this.f57213d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m64735b(int i) {
        m64731h(this.f57213d, i);
    }

    /* renamed from: e */
    public final void m64733e(int i) {
        if (i >= 0 && i < this.f57213d) {
            return;
        }
        throw new IndexOutOfBoundsException(m64732f(i));
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38451bG7)) {
            return super.equals(obj);
        }
        C38451bG7 c38451bG7 = (C38451bG7) obj;
        if (this.f57213d != c38451bG7.f57213d) {
            return false;
        }
        int[] iArr = c38451bG7.f57212c;
        for (int i = 0; i < this.f57213d; i++) {
            if (this.f57212c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m64732f(int i) {
        int i2 = this.f57213d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        m64733e(i);
        return this.f57212c[i];
    }

    /* renamed from: h */
    public final void m64731h(int i, int i2) {
        int i3;
        m113667a();
        if (i >= 0 && i <= (i3 = this.f57213d)) {
            int[] iArr = this.f57212c;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
            } else {
                int[] iArr2 = new int[((i3 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f57212c, i, iArr2, i + 1, this.f57213d - i);
                this.f57212c = iArr2;
            }
            this.f57212c[i] = i2;
            this.f57213d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m64732f(i));
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f57213d; i2++) {
            i = (i * 31) + this.f57212c[i2];
        }
        return i;
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m113667a();
        for (int i = 0; i < this.f57213d; i++) {
            if (obj.equals(Integer.valueOf(this.f57212c[i]))) {
                int[] iArr = this.f57212c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f57213d - i) - 1);
                this.f57213d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m113667a();
        if (i2 >= i) {
            int[] iArr = this.f57212c;
            System.arraycopy(iArr, i2, iArr, i, this.f57213d - i2);
            this.f57213d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m113667a();
        m64733e(i);
        int[] iArr = this.f57212c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f57213d;
    }

    @Override // p000.BI7
    public final /* synthetic */ BI7<Integer> zzh(int i) {
        if (i >= this.f57213d) {
            return new C38451bG7(Arrays.copyOf(this.f57212c, i), this.f57213d);
        }
        throw new IllegalArgumentException();
    }

    public C38451bG7(int[] iArr, int i) {
        this.f57212c = iArr;
        this.f57213d = i;
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        m113667a();
        m64733e(i);
        int[] iArr = this.f57212c;
        int i3 = iArr[i];
        if (i < this.f57213d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f57213d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }
}
