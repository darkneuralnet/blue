package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Tu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36246Tu7 extends AbstractC31782As7 implements RandomAccess, InterfaceC45371mu7, InterfaceC32745Ev7 {

    /* renamed from: e */
    public static final C36246Tu7 f36440e;

    /* renamed from: c */
    public long[] f36441c;

    /* renamed from: d */
    public int f36442d;

    static {
        C36246Tu7 c36246Tu7 = new C36246Tu7(new long[0], 0);
        f36440e = c36246Tu7;
        c36246Tu7.zzb();
    }

    public C36246Tu7() {
        this(new long[10], 0);
    }

    /* renamed from: c */
    public static C36246Tu7 m82271c() {
        return f36440e;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m114986a();
        if (i >= 0 && i <= (i2 = this.f36442d)) {
            long[] jArr = this.f36441c;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f36441c, i, jArr2, i + 1, this.f36442d - i);
                this.f36441c = jArr2;
            }
            this.f36441c[i] = longValue;
            this.f36442d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m82269f(i));
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m114986a();
        C46557ou7.m20293e(collection);
        if (!(collection instanceof C36246Tu7)) {
            return super.addAll(collection);
        }
        C36246Tu7 c36246Tu7 = (C36246Tu7) collection;
        int i = c36246Tu7.f36442d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f36442d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f36441c;
            if (i3 > jArr.length) {
                this.f36441c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c36246Tu7.f36441c, 0, this.f36441c, this.f36442d, c36246Tu7.f36442d);
            this.f36442d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final long m82272b(int i) {
        m82268h(i);
        return this.f36441c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.InterfaceC45964nu7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC45964nu7 mo6153d(int i) {
        if (i >= this.f36442d) {
            return new C36246Tu7(Arrays.copyOf(this.f36441c, i), this.f36442d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m82270e(long j) {
        m114986a();
        int i = this.f36442d;
        long[] jArr = this.f36441c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f36441c = jArr2;
        }
        long[] jArr3 = this.f36441c;
        int i2 = this.f36442d;
        this.f36442d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36246Tu7)) {
            return super.equals(obj);
        }
        C36246Tu7 c36246Tu7 = (C36246Tu7) obj;
        if (this.f36442d != c36246Tu7.f36442d) {
            return false;
        }
        long[] jArr = c36246Tu7.f36441c;
        for (int i = 0; i < this.f36442d; i++) {
            if (this.f36441c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m82269f(int i) {
        int i2 = this.f36442d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m82268h(i);
        return Long.valueOf(this.f36441c[i]);
    }

    /* renamed from: h */
    public final void m82268h(int i) {
        if (i < 0 || i >= this.f36442d) {
            throw new IndexOutOfBoundsException(m82269f(i));
        }
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f36442d; i2++) {
            i = (i * 31) + C46557ou7.m20295c(this.f36441c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f36442d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f36441c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m114986a();
        m82268h(i);
        long[] jArr = this.f36441c;
        long j = jArr[i];
        if (i < this.f36442d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f36442d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m114986a();
        if (i2 >= i) {
            long[] jArr = this.f36441c;
            System.arraycopy(jArr, i2, jArr, i, this.f36442d - i2);
            this.f36442d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m114986a();
        m82268h(i);
        long[] jArr = this.f36441c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36442d;
    }

    public C36246Tu7(long[] jArr, int i) {
        this.f36441c = jArr;
        this.f36442d = i;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m82270e(((Long) obj).longValue());
        return true;
    }
}
