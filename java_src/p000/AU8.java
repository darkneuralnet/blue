package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: AU8 */
/* loaded from: classes5.dex */
public final class AU8 extends AbstractC39081cK8 implements RandomAccess, InterfaceC48092rV8, I29 {

    /* renamed from: e */
    public static final AU8 f631e = new AU8(new int[0], 0, false);

    /* renamed from: c */
    public int[] f632c;

    /* renamed from: d */
    public int f633d;

    public AU8() {
        this(new int[10], 0, true);
    }

    /* renamed from: c */
    public static AU8 m115722c() {
        return f631e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m61580a();
        if (i >= 0 && i <= (i2 = this.f633d)) {
            int[] iArr = this.f632c;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f632c, i, iArr2, i + 1, this.f633d - i);
                this.f632c = iArr2;
            }
            this.f632c[i] = intValue;
            this.f633d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m115721e(i));
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m61580a();
        Charset charset = XV8.f43341a;
        collection.getClass();
        if (!(collection instanceof AU8)) {
            return super.addAll(collection);
        }
        AU8 au8 = (AU8) collection;
        int i = au8.f633d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f633d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f632c;
            if (i3 > iArr.length) {
                this.f632c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(au8.f632c, 0, this.f632c, this.f633d, au8.f633d);
            this.f633d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final int m115723b(int i) {
        m115720f(i);
        return this.f632c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String m115721e(int i) {
        int i2 = this.f633d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AU8)) {
            return super.equals(obj);
        }
        AU8 au8 = (AU8) obj;
        if (this.f633d != au8.f633d) {
            return false;
        }
        int[] iArr = au8.f632c;
        for (int i = 0; i < this.f633d; i++) {
            if (this.f632c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m115720f(int i) {
        if (i < 0 || i >= this.f633d) {
            throw new IndexOutOfBoundsException(m115721e(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m115720f(i);
        return Integer.valueOf(this.f632c[i]);
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f633d; i2++) {
            i = (i * 31) + this.f632c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f633d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f632c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.NV8
    /* renamed from: p */
    public final InterfaceC48092rV8 mo21037d(int i) {
        if (i >= this.f633d) {
            return new AU8(Arrays.copyOf(this.f632c, i), this.f633d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m61580a();
        m115720f(i);
        int[] iArr = this.f632c;
        int i3 = iArr[i];
        if (i < this.f633d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f633d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m61580a();
        if (i2 >= i) {
            int[] iArr = this.f632c;
            System.arraycopy(iArr, i2, iArr, i, this.f633d - i2);
            this.f633d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m61580a();
        m115720f(i);
        int[] iArr = this.f632c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f633d;
    }

    public final void zzh(int i) {
        m61580a();
        int i2 = this.f633d;
        int[] iArr = this.f632c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f632c = iArr2;
        }
        int[] iArr3 = this.f632c;
        int i3 = this.f633d;
        this.f633d = i3 + 1;
        iArr3[i3] = i;
    }

    public AU8(int[] iArr, int i, boolean z) {
        super(z);
        this.f632c = iArr;
        this.f633d = i;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
