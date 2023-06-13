package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: cB7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38999cB7 extends AbstractC36507Ux7<Boolean> implements RandomAccess {

    /* renamed from: e */
    public static final C38999cB7 f60263e;

    /* renamed from: c */
    public boolean[] f60264c;

    /* renamed from: d */
    public int f60265d;

    static {
        C38999cB7 c38999cB7 = new C38999cB7();
        f60263e = c38999cB7;
        c38999cB7.zzv();
    }

    public C38999cB7() {
        this(new boolean[10], 0);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m61753c(i, ((Boolean) obj).booleanValue());
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m80580a();
        C37975aT7.m71332a(collection);
        if (collection instanceof C38999cB7) {
            C38999cB7 c38999cB7 = (C38999cB7) collection;
            int i = c38999cB7.f60265d;
            if (i == 0) {
                return false;
            }
            int i2 = this.f60265d;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                boolean[] zArr = this.f60264c;
                if (i3 > zArr.length) {
                    this.f60264c = Arrays.copyOf(zArr, i3);
                }
                System.arraycopy(c38999cB7.f60264c, 0, this.f60264c, this.f60265d, c38999cB7.f60265d);
                this.f60265d = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void m61754b(boolean z) {
        m61753c(this.f60265d, z);
    }

    /* renamed from: c */
    public final void m61753c(int i, boolean z) {
        int i2;
        m80580a();
        if (i < 0 || i > (i2 = this.f60265d)) {
            throw new IndexOutOfBoundsException(m61751f(i));
        }
        boolean[] zArr = this.f60264c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f60264c, i, zArr2, i + 1, this.f60265d - i);
            this.f60264c = zArr2;
        }
        this.f60264c[i] = z;
        this.f60265d++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: e */
    public final void m61752e(int i) {
        if (i < 0 || i >= this.f60265d) {
            throw new IndexOutOfBoundsException(m61751f(i));
        }
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38999cB7) {
            C38999cB7 c38999cB7 = (C38999cB7) obj;
            if (this.f60265d != c38999cB7.f60265d) {
                return false;
            }
            boolean[] zArr = c38999cB7.f60264c;
            for (int i = 0; i < this.f60265d; i++) {
                if (this.f60264c[i] != zArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final String m61751f(int i) {
        int i2 = this.f60265d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m61752e(i);
        return Boolean.valueOf(this.f60264c[i]);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f60265d; i2++) {
            i = (i * 31) + C37975aT7.m71327f(this.f60264c[i2]);
        }
        return i;
    }

    @Override // p000.InterfaceC47489qU7
    /* renamed from: n */
    public final /* synthetic */ InterfaceC47489qU7 mo1502n(int i) {
        if (i >= this.f60265d) {
            return new C38999cB7(Arrays.copyOf(this.f60264c, i), this.f60265d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m80580a();
        m61752e(i);
        boolean[] zArr = this.f60264c;
        boolean z = zArr[i];
        int i2 = this.f60265d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, i2 - i);
        }
        this.f60265d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m80580a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f60264c;
        System.arraycopy(zArr, i2, zArr, i, this.f60265d - i2);
        this.f60265d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m80580a();
        m61752e(i);
        boolean[] zArr = this.f60264c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f60265d;
    }

    public C38999cB7(boolean[] zArr, int i) {
        this.f60264c = zArr;
        this.f60265d = i;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m80580a();
        for (int i = 0; i < this.f60265d; i++) {
            if (obj.equals(Boolean.valueOf(this.f60264c[i]))) {
                boolean[] zArr = this.f60264c;
                System.arraycopy(zArr, i + 1, zArr, i, this.f60265d - i);
                this.f60265d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
