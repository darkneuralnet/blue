package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: is9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42981is9 extends Bh9<Boolean> implements FW7, RandomAccess {

    /* renamed from: e */
    public static final C42981is9 f91426e;

    /* renamed from: c */
    public boolean[] f91427c;

    /* renamed from: d */
    public int f91428d;

    static {
        C42981is9 c42981is9 = new C42981is9(new boolean[0], 0);
        f91426e = c42981is9;
        c42981is9.mo113666q();
    }

    public C42981is9() {
        this(new boolean[10], 0);
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m31709c(i, ((Boolean) obj).booleanValue());
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m113667a();
        C44389lF7.m27619a(collection);
        if (!(collection instanceof C42981is9)) {
            return super.addAll(collection);
        }
        C42981is9 c42981is9 = (C42981is9) collection;
        int i = c42981is9.f91428d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f91428d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f91427c;
            if (i3 > zArr.length) {
                this.f91427c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c42981is9.f91427c, 0, this.f91427c, this.f91428d, c42981is9.f91428d);
            this.f91428d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m31710b(boolean z) {
        m31709c(this.f91428d, z);
    }

    /* renamed from: c */
    public final void m31709c(int i, boolean z) {
        int i2;
        m113667a();
        if (i >= 0 && i <= (i2 = this.f91428d)) {
            boolean[] zArr = this.f91427c;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f91427c, i, zArr2, i + 1, this.f91428d - i);
                this.f91427c = zArr2;
            }
            this.f91427c[i] = z;
            this.f91428d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m31707f(i));
    }

    /* renamed from: e */
    public final void m31708e(int i) {
        if (i >= 0 && i < this.f91428d) {
            return;
        }
        throw new IndexOutOfBoundsException(m31707f(i));
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42981is9)) {
            return super.equals(obj);
        }
        C42981is9 c42981is9 = (C42981is9) obj;
        if (this.f91428d != c42981is9.f91428d) {
            return false;
        }
        boolean[] zArr = c42981is9.f91427c;
        for (int i = 0; i < this.f91428d; i++) {
            if (this.f91427c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m31707f(int i) {
        int i2 = this.f91428d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m31708e(i);
        return Boolean.valueOf(this.f91427c[i]);
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f91428d; i2++) {
            i = (i * 31) + C44389lF7.m27614f(this.f91427c[i2]);
        }
        return i;
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m113667a();
        for (int i = 0; i < this.f91428d; i++) {
            if (obj.equals(Boolean.valueOf(this.f91427c[i]))) {
                boolean[] zArr = this.f91427c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f91428d - i) - 1);
                this.f91428d--;
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
            boolean[] zArr = this.f91427c;
            System.arraycopy(zArr, i2, zArr, i, this.f91428d - i2);
            this.f91428d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m113667a();
        m31708e(i);
        boolean[] zArr = this.f91427c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f91428d;
    }

    @Override // p000.BI7
    public final /* synthetic */ BI7 zzh(int i) {
        if (i >= this.f91428d) {
            return new C42981is9(Arrays.copyOf(this.f91427c, i), this.f91428d);
        }
        throw new IllegalArgumentException();
    }

    public C42981is9(boolean[] zArr, int i) {
        this.f91427c = zArr;
        this.f91428d = i;
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        m113667a();
        m31708e(i);
        boolean[] zArr = this.f91427c;
        boolean z = zArr[i];
        if (i < this.f91428d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f91428d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }
}
