package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: gb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41623gb7 extends AbstractC41613ga7 implements RandomAccess, InterfaceC44588lb7, InterfaceC40447ec7 {

    /* renamed from: e */
    public static final C41623gb7 f83935e = new C41623gb7(new int[0], 0, false);

    /* renamed from: c */
    public int[] f83936c;

    /* renamed from: d */
    public int f83937d;

    public C41623gb7() {
        this(new int[10], 0, true);
    }

    /* renamed from: c */
    public static C41623gb7 m37987c() {
        return f83935e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m39112a();
        if (i >= 0 && i <= (i2 = this.f83937d)) {
            int[] iArr = this.f83936c;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f83936c, i, iArr2, i + 1, this.f83937d - i);
                this.f83936c = iArr2;
            }
            this.f83936c[i] = intValue;
            this.f83937d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m37985f(i));
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m39112a();
        Charset charset = C46960pb7.f103839a;
        collection.getClass();
        if (!(collection instanceof C41623gb7)) {
            return super.addAll(collection);
        }
        C41623gb7 c41623gb7 = (C41623gb7) collection;
        int i = c41623gb7.f83937d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f83937d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f83936c;
            if (i3 > iArr.length) {
                this.f83936c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c41623gb7.f83936c, 0, this.f83936c, this.f83937d, c41623gb7.f83937d);
            this.f83937d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final int m37988b(int i) {
        m37984h(i);
        return this.f83936c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m37986e(int i) {
        m39112a();
        int i2 = this.f83937d;
        int[] iArr = this.f83936c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f83936c = iArr2;
        }
        int[] iArr3 = this.f83936c;
        int i3 = this.f83937d;
        this.f83937d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41623gb7)) {
            return super.equals(obj);
        }
        C41623gb7 c41623gb7 = (C41623gb7) obj;
        if (this.f83937d != c41623gb7.f83937d) {
            return false;
        }
        int[] iArr = c41623gb7.f83936c;
        for (int i = 0; i < this.f83937d; i++) {
            if (this.f83936c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m37985f(int i) {
        int i2 = this.f83937d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m37984h(i);
        return Integer.valueOf(this.f83936c[i]);
    }

    /* renamed from: h */
    public final void m37984h(int i) {
        if (i < 0 || i >= this.f83937d) {
            throw new IndexOutOfBoundsException(m37985f(i));
        }
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f83937d; i2++) {
            i = (i * 31) + this.f83936c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f83937d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f83936c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.InterfaceC46367ob7
    /* renamed from: r0 */
    public final /* bridge */ /* synthetic */ InterfaceC46367ob7 mo1043r0(int i) {
        if (i >= this.f83937d) {
            return new C41623gb7(Arrays.copyOf(this.f83936c, i), this.f83937d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m39112a();
        m37984h(i);
        int[] iArr = this.f83936c;
        int i3 = iArr[i];
        if (i < this.f83937d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f83937d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m39112a();
        if (i2 >= i) {
            int[] iArr = this.f83936c;
            System.arraycopy(iArr, i2, iArr, i, this.f83937d - i2);
            this.f83937d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m39112a();
        m37984h(i);
        int[] iArr = this.f83936c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83937d;
    }

    public C41623gb7(int[] iArr, int i, boolean z) {
        super(z);
        this.f83936c = iArr;
        this.f83937d = i;
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m37986e(((Integer) obj).intValue());
        return true;
    }
}
