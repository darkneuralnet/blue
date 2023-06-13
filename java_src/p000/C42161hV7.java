package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: hV7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42161hV7 extends AbstractC40966fU7 implements RandomAccess, InterfaceC41131fl8 {

    /* renamed from: e */
    public static final C42161hV7 f85299e = new C42161hV7(new boolean[0], 0, false);

    /* renamed from: c */
    public boolean[] f85300c;

    /* renamed from: d */
    public int f85301d;

    public C42161hV7() {
        this(new boolean[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m41291a();
        if (i >= 0 && i <= (i2 = this.f85301d)) {
            boolean[] zArr = this.f85300c;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f85300c, i, zArr2, i + 1, this.f85301d - i);
                this.f85300c = zArr2;
            }
            this.f85300c[i] = booleanValue;
            this.f85301d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m36322c(i));
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m41291a();
        Charset charset = C32791Fa8.f9736a;
        collection.getClass();
        if (!(collection instanceof C42161hV7)) {
            return super.addAll(collection);
        }
        C42161hV7 c42161hV7 = (C42161hV7) collection;
        int i = c42161hV7.f85301d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f85301d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f85300c;
            if (i3 > zArr.length) {
                this.f85300c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c42161hV7.f85300c, 0, this.f85300c, this.f85301d, c42161hV7.f85301d);
            this.f85301d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m36323b(boolean z) {
        m41291a();
        int i = this.f85301d;
        boolean[] zArr = this.f85300c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f85300c = zArr2;
        }
        boolean[] zArr3 = this.f85300c;
        int i2 = this.f85301d;
        this.f85301d = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: c */
    public final String m36322c(int i) {
        int i2 = this.f85301d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.InterfaceC47544qa8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC47544qa8 mo17376d(int i) {
        if (i >= this.f85301d) {
            return new C42161hV7(Arrays.copyOf(this.f85300c, i), this.f85301d, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m36321e(int i) {
        if (i < 0 || i >= this.f85301d) {
            throw new IndexOutOfBoundsException(m36322c(i));
        }
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42161hV7)) {
            return super.equals(obj);
        }
        C42161hV7 c42161hV7 = (C42161hV7) obj;
        if (this.f85301d != c42161hV7.f85301d) {
            return false;
        }
        boolean[] zArr = c42161hV7.f85300c;
        for (int i = 0; i < this.f85301d; i++) {
            if (this.f85300c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m36321e(i);
        return Boolean.valueOf(this.f85300c[i]);
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f85301d; i2++) {
            i = (i * 31) + C32791Fa8.m106928a(this.f85300c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f85301d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f85300c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m41291a();
        m36321e(i);
        boolean[] zArr = this.f85300c;
        boolean z = zArr[i];
        if (i < this.f85301d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f85301d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m41291a();
        if (i2 >= i) {
            boolean[] zArr = this.f85300c;
            System.arraycopy(zArr, i2, zArr, i, this.f85301d - i2);
            this.f85301d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m41291a();
        m36321e(i);
        boolean[] zArr = this.f85300c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f85301d;
    }

    public C42161hV7(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f85300c = zArr;
        this.f85301d = i;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m36323b(((Boolean) obj).booleanValue());
        return true;
    }
}
