package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* renamed from: Zl8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37570Zl8<E> extends C28<E> implements RandomAccess {

    /* renamed from: e */
    public static final C37570Zl8<Object> f49194e;

    /* renamed from: c */
    public E[] f49195c;

    /* renamed from: d */
    public int f49196d;

    static {
        C37570Zl8<Object> c37570Zl8 = new C37570Zl8<>(new Object[0], 0);
        f49194e = c37570Zl8;
        c37570Zl8.zzb();
    }

    public C37570Zl8() {
        this(new Object[10], 0);
    }

    /* renamed from: b */
    public static <E> C37570Zl8<E> m72546b() {
        return (C37570Zl8<E>) f49194e;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m112947a();
        if (i >= 0 && i <= (i2 = this.f49196d)) {
            E[] eArr = this.f49195c;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.f49195c, i, eArr2, i + 1, this.f49196d - i);
                this.f49195c = eArr2;
            }
            this.f49195c[i] = e;
            this.f49196d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m72545c(i));
    }

    /* renamed from: c */
    public final String m72545c(int i) {
        int i2 = this.f49196d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.InterfaceC35383Qc8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC35383Qc8 mo41068d(int i) {
        if (i >= this.f49196d) {
            return new C37570Zl8(Arrays.copyOf(this.f49195c, i), this.f49196d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m72544e(int i) {
        if (i >= 0 && i < this.f49196d) {
            return;
        }
        throw new IndexOutOfBoundsException(m72545c(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m72544e(i);
        return this.f49195c[i];
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        m112947a();
        m72544e(i);
        E[] eArr = this.f49195c;
        E e = eArr[i];
        if (i < this.f49196d - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f49196d--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m112947a();
        m72544e(i);
        E[] eArr = this.f49195c;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49196d;
    }

    public C37570Zl8(E[] eArr, int i) {
        this.f49195c = eArr;
        this.f49196d = i;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m112947a();
        int i = this.f49196d;
        E[] eArr = this.f49195c;
        if (i == eArr.length) {
            this.f49195c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f49195c;
        int i2 = this.f49196d;
        this.f49196d = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
