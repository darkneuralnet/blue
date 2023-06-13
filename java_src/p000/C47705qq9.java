package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* renamed from: qq9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47705qq9<E> extends AbstractC44037kf9<E> implements RandomAccess {

    /* renamed from: e */
    public static final C47705qq9<Object> f105924e;

    /* renamed from: c */
    public E[] f105925c;

    /* renamed from: d */
    public int f105926d;

    static {
        C47705qq9<Object> c47705qq9 = new C47705qq9<>(new Object[0], 0);
        f105924e = c47705qq9;
        c47705qq9.zzb();
    }

    public C47705qq9() {
        this(new Object[10], 0);
    }

    /* renamed from: b */
    public static <E> C47705qq9<E> m16913b() {
        return (C47705qq9<E>) f105924e;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m28655a();
        if (i >= 0 && i <= (i2 = this.f105926d)) {
            E[] eArr = this.f105925c;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.f105925c, i, eArr2, i + 1, this.f105926d - i);
                this.f105925c = eArr2;
            }
            this.f105925c[i] = e;
            this.f105926d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m16912c(i));
    }

    /* renamed from: c */
    public final String m16912c(int i) {
        int i2 = this.f105926d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.An9
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ An9 mo16911d(int i) {
        if (i >= this.f105926d) {
            return new C47705qq9(Arrays.copyOf(this.f105925c, i), this.f105926d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m16910e(int i) {
        if (i >= 0 && i < this.f105926d) {
            return;
        }
        throw new IndexOutOfBoundsException(m16912c(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m16910e(i);
        return this.f105925c[i];
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        m28655a();
        m16910e(i);
        E[] eArr = this.f105925c;
        E e = eArr[i];
        if (i < this.f105926d - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f105926d--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m28655a();
        m16910e(i);
        E[] eArr = this.f105925c;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f105926d;
    }

    public C47705qq9(E[] eArr, int i) {
        this.f105925c = eArr;
        this.f105926d = i;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m28655a();
        int i = this.f105926d;
        E[] eArr = this.f105925c;
        if (i == eArr.length) {
            this.f105925c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f105925c;
        int i2 = this.f105926d;
        this.f105926d = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
