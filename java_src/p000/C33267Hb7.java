package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Hb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33267Hb7 extends AbstractC41613ga7 implements RandomAccess, InterfaceC45774nb7, InterfaceC40447ec7 {

    /* renamed from: e */
    public static final C33267Hb7 f13623e = new C33267Hb7(new long[0], 0, false);

    /* renamed from: c */
    public long[] f13624c;

    /* renamed from: d */
    public int f13625d;

    public C33267Hb7() {
        this(new long[10], 0, true);
    }

    /* renamed from: c */
    public static C33267Hb7 m103663c() {
        return f13623e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m39112a();
        if (i >= 0 && i <= (i2 = this.f13625d)) {
            long[] jArr = this.f13624c;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f13624c, i, jArr2, i + 1, this.f13625d - i);
                this.f13624c = jArr2;
            }
            this.f13624c[i] = longValue;
            this.f13625d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m103661f(i));
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m39112a();
        Charset charset = C46960pb7.f103839a;
        collection.getClass();
        if (!(collection instanceof C33267Hb7)) {
            return super.addAll(collection);
        }
        C33267Hb7 c33267Hb7 = (C33267Hb7) collection;
        int i = c33267Hb7.f13625d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13625d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f13624c;
            if (i3 > jArr.length) {
                this.f13624c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c33267Hb7.f13624c, 0, this.f13624c, this.f13625d, c33267Hb7.f13625d);
            this.f13625d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final long m103664b(int i) {
        m103660h(i);
        return this.f13624c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m103662e(long j) {
        m39112a();
        int i = this.f13625d;
        long[] jArr = this.f13624c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f13624c = jArr2;
        }
        long[] jArr3 = this.f13624c;
        int i2 = this.f13625d;
        this.f13625d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33267Hb7)) {
            return super.equals(obj);
        }
        C33267Hb7 c33267Hb7 = (C33267Hb7) obj;
        if (this.f13625d != c33267Hb7.f13625d) {
            return false;
        }
        long[] jArr = c33267Hb7.f13624c;
        for (int i = 0; i < this.f13625d; i++) {
            if (this.f13624c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m103661f(int i) {
        int i2 = this.f13625d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m103660h(i);
        return Long.valueOf(this.f13624c[i]);
    }

    /* renamed from: h */
    public final void m103660h(int i) {
        if (i < 0 || i >= this.f13625d) {
            throw new IndexOutOfBoundsException(m103661f(i));
        }
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13625d; i2++) {
            long j = this.f13624c[i2];
            Charset charset = C46960pb7.f103839a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f13625d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13624c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.InterfaceC46367ob7
    /* renamed from: r0 */
    public final /* bridge */ /* synthetic */ InterfaceC46367ob7 mo1043r0(int i) {
        if (i >= this.f13625d) {
            return new C33267Hb7(Arrays.copyOf(this.f13624c, i), this.f13625d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m39112a();
        m103660h(i);
        long[] jArr = this.f13624c;
        long j = jArr[i];
        if (i < this.f13625d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f13625d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m39112a();
        if (i2 >= i) {
            long[] jArr = this.f13624c;
            System.arraycopy(jArr, i2, jArr, i, this.f13625d - i2);
            this.f13625d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m39112a();
        m103660h(i);
        long[] jArr = this.f13624c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13625d;
    }

    public C33267Hb7(long[] jArr, int i, boolean z) {
        super(z);
        this.f13624c = jArr;
        this.f13625d = i;
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m103662e(((Long) obj).longValue());
        return true;
    }
}
