package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Hs7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33420Hs7 extends AbstractC31782As7 implements RandomAccess, InterfaceC32745Ev7 {

    /* renamed from: e */
    public static final C33420Hs7 f14118e;

    /* renamed from: c */
    public boolean[] f14119c;

    /* renamed from: d */
    public int f14120d;

    static {
        C33420Hs7 c33420Hs7 = new C33420Hs7(new boolean[0], 0);
        f14118e = c33420Hs7;
        c33420Hs7.zzb();
    }

    public C33420Hs7() {
        this(new boolean[10], 0);
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m114986a();
        if (i >= 0 && i <= (i2 = this.f14120d)) {
            boolean[] zArr = this.f14119c;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f14119c, i, zArr2, i + 1, this.f14120d - i);
                this.f14119c = zArr2;
            }
            this.f14119c[i] = booleanValue;
            this.f14120d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m103251c(i));
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m114986a();
        C46557ou7.m20293e(collection);
        if (!(collection instanceof C33420Hs7)) {
            return super.addAll(collection);
        }
        C33420Hs7 c33420Hs7 = (C33420Hs7) collection;
        int i = c33420Hs7.f14120d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14120d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f14119c;
            if (i3 > zArr.length) {
                this.f14119c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c33420Hs7.f14119c, 0, this.f14119c, this.f14120d, c33420Hs7.f14120d);
            this.f14120d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m103252b(boolean z) {
        m114986a();
        int i = this.f14120d;
        boolean[] zArr = this.f14119c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f14119c = zArr2;
        }
        boolean[] zArr3 = this.f14119c;
        int i2 = this.f14120d;
        this.f14120d = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: c */
    public final String m103251c(int i) {
        int i2 = this.f14120d;
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

    @Override // p000.InterfaceC45964nu7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC45964nu7 mo6153d(int i) {
        if (i >= this.f14120d) {
            return new C33420Hs7(Arrays.copyOf(this.f14119c, i), this.f14120d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m103250e(int i) {
        if (i < 0 || i >= this.f14120d) {
            throw new IndexOutOfBoundsException(m103251c(i));
        }
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33420Hs7)) {
            return super.equals(obj);
        }
        C33420Hs7 c33420Hs7 = (C33420Hs7) obj;
        if (this.f14120d != c33420Hs7.f14120d) {
            return false;
        }
        boolean[] zArr = c33420Hs7.f14119c;
        for (int i = 0; i < this.f14120d; i++) {
            if (this.f14119c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m103250e(i);
        return Boolean.valueOf(this.f14119c[i]);
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14120d; i2++) {
            i = (i * 31) + C46557ou7.m20297a(this.f14119c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f14120d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f14119c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m114986a();
        m103250e(i);
        boolean[] zArr = this.f14119c;
        boolean z = zArr[i];
        if (i < this.f14120d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f14120d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m114986a();
        if (i2 >= i) {
            boolean[] zArr = this.f14119c;
            System.arraycopy(zArr, i2, zArr, i, this.f14120d - i2);
            this.f14120d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m114986a();
        m103250e(i);
        boolean[] zArr = this.f14119c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14120d;
    }

    public C33420Hs7(boolean[] zArr, int i) {
        this.f14119c = zArr;
        this.f14120d = i;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m103252b(((Boolean) obj).booleanValue());
        return true;
    }
}
