package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: l88  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44325l88 extends AbstractC40966fU7 implements RandomAccess, K98, InterfaceC41131fl8 {

    /* renamed from: e */
    public static final C44325l88 f95633e = new C44325l88(new int[0], 0, false);

    /* renamed from: c */
    public int[] f95634c;

    /* renamed from: d */
    public int f95635d;

    public C44325l88() {
        this(new int[10], 0, true);
    }

    /* renamed from: c */
    public static C44325l88 m27745c() {
        return f95633e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m41291a();
        if (i >= 0 && i <= (i2 = this.f95635d)) {
            int[] iArr = this.f95634c;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f95634c, i, iArr2, i + 1, this.f95635d - i);
                this.f95634c = iArr2;
            }
            this.f95634c[i] = intValue;
            this.f95635d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m27743f(i));
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m41291a();
        Charset charset = C32791Fa8.f9736a;
        collection.getClass();
        if (!(collection instanceof C44325l88)) {
            return super.addAll(collection);
        }
        C44325l88 c44325l88 = (C44325l88) collection;
        int i = c44325l88.f95635d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f95635d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f95634c;
            if (i3 > iArr.length) {
                this.f95634c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c44325l88.f95634c, 0, this.f95634c, this.f95635d, c44325l88.f95635d);
            this.f95635d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final int m27746b(int i) {
        m27742h(i);
        return this.f95634c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.InterfaceC47544qa8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC47544qa8 mo17376d(int i) {
        if (i >= this.f95635d) {
            return new C44325l88(Arrays.copyOf(this.f95634c, i), this.f95635d, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m27744e(int i) {
        m41291a();
        int i2 = this.f95635d;
        int[] iArr = this.f95634c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f95634c = iArr2;
        }
        int[] iArr3 = this.f95634c;
        int i3 = this.f95635d;
        this.f95635d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44325l88)) {
            return super.equals(obj);
        }
        C44325l88 c44325l88 = (C44325l88) obj;
        if (this.f95635d != c44325l88.f95635d) {
            return false;
        }
        int[] iArr = c44325l88.f95634c;
        for (int i = 0; i < this.f95635d; i++) {
            if (this.f95634c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m27743f(int i) {
        int i2 = this.f95635d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m27742h(i);
        return Integer.valueOf(this.f95634c[i]);
    }

    /* renamed from: h */
    public final void m27742h(int i) {
        if (i < 0 || i >= this.f95635d) {
            throw new IndexOutOfBoundsException(m27743f(i));
        }
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f95635d; i2++) {
            i = (i * 31) + this.f95634c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f95635d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f95634c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m41291a();
        m27742h(i);
        int[] iArr = this.f95634c;
        int i3 = iArr[i];
        if (i < this.f95635d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f95635d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m41291a();
        if (i2 >= i) {
            int[] iArr = this.f95634c;
            System.arraycopy(iArr, i2, iArr, i, this.f95635d - i2);
            this.f95635d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m41291a();
        m27742h(i);
        int[] iArr = this.f95634c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f95635d;
    }

    public C44325l88(int[] iArr, int i, boolean z) {
        super(z);
        this.f95634c = iArr;
        this.f95635d = i;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m27744e(((Integer) obj).intValue());
        return true;
    }
}
