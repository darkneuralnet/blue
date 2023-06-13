package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: na7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45764na7 extends AbstractC41613ga7 implements RandomAccess, InterfaceC40447ec7 {

    /* renamed from: e */
    public static final C45764na7 f100160e = new C45764na7(new boolean[0], 0, false);

    /* renamed from: c */
    public boolean[] f100161c;

    /* renamed from: d */
    public int f100162d;

    public C45764na7() {
        this(new boolean[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m39112a();
        if (i >= 0 && i <= (i2 = this.f100162d)) {
            boolean[] zArr = this.f100161c;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f100161c, i, zArr2, i + 1, this.f100162d - i);
                this.f100161c = zArr2;
            }
            this.f100161c[i] = booleanValue;
            this.f100162d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m23491c(i));
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m39112a();
        Charset charset = C46960pb7.f103839a;
        collection.getClass();
        if (!(collection instanceof C45764na7)) {
            return super.addAll(collection);
        }
        C45764na7 c45764na7 = (C45764na7) collection;
        int i = c45764na7.f100162d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f100162d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f100161c;
            if (i3 > zArr.length) {
                this.f100161c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c45764na7.f100161c, 0, this.f100161c, this.f100162d, c45764na7.f100162d);
            this.f100162d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m23492b(boolean z) {
        m39112a();
        int i = this.f100162d;
        boolean[] zArr = this.f100161c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f100161c = zArr2;
        }
        boolean[] zArr3 = this.f100161c;
        int i2 = this.f100162d;
        this.f100162d = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: c */
    public final String m23491c(int i) {
        int i2 = this.f100162d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m23490e(int i) {
        if (i < 0 || i >= this.f100162d) {
            throw new IndexOutOfBoundsException(m23491c(i));
        }
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45764na7)) {
            return super.equals(obj);
        }
        C45764na7 c45764na7 = (C45764na7) obj;
        if (this.f100162d != c45764na7.f100162d) {
            return false;
        }
        boolean[] zArr = c45764na7.f100161c;
        for (int i = 0; i < this.f100162d; i++) {
            if (this.f100161c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m23490e(i);
        return Boolean.valueOf(this.f100161c[i]);
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f100162d; i2++) {
            i = (i * 31) + C46960pb7.m19081a(this.f100161c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f100162d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f100161c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.InterfaceC46367ob7
    /* renamed from: r0 */
    public final /* bridge */ /* synthetic */ InterfaceC46367ob7 mo1043r0(int i) {
        if (i >= this.f100162d) {
            return new C45764na7(Arrays.copyOf(this.f100161c, i), this.f100162d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m39112a();
        m23490e(i);
        boolean[] zArr = this.f100161c;
        boolean z = zArr[i];
        if (i < this.f100162d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f100162d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m39112a();
        if (i2 >= i) {
            boolean[] zArr = this.f100161c;
            System.arraycopy(zArr, i2, zArr, i, this.f100162d - i2);
            this.f100162d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m39112a();
        m23490e(i);
        boolean[] zArr = this.f100161c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f100162d;
    }

    public C45764na7(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f100161c = zArr;
        this.f100162d = i;
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m23492b(((Boolean) obj).booleanValue());
        return true;
    }
}
