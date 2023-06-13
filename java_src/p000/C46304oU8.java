package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* renamed from: oU8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46304oU8<E> extends AbstractC41834gw8<E> implements RandomAccess {

    /* renamed from: e */
    public static final C46304oU8<Object> f102065e;

    /* renamed from: c */
    public E[] f102066c;

    /* renamed from: d */
    public int f102067d;

    static {
        C46304oU8<Object> c46304oU8 = new C46304oU8<>(new Object[0], 0);
        f102065e = c46304oU8;
        c46304oU8.zzb();
    }

    public C46304oU8() {
        this(new Object[10], 0);
    }

    /* renamed from: e */
    public static <E> C46304oU8<E> m20985e() {
        return (C46304oU8<E>) f102065e;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m37302a();
        int i = this.f102067d;
        E[] eArr = this.f102066c;
        if (i == eArr.length) {
            this.f102066c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f102066c;
        int i2 = this.f102067d;
        this.f102067d = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public final void m20987b(int i) {
        if (i >= 0 && i < this.f102067d) {
            return;
        }
        throw new IndexOutOfBoundsException(m20986c(i));
    }

    /* renamed from: c */
    public final String m20986c(int i) {
        int i2 = this.f102067d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m20987b(i);
        return this.f102066c[i];
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        m37302a();
        m20987b(i);
        E[] eArr = this.f102066c;
        E e = eArr[i];
        if (i < this.f102067d - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f102067d--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m37302a();
        m20987b(i);
        E[] eArr = this.f102066c;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f102067d;
    }

    @Override // p000.RJ8
    public final /* synthetic */ RJ8 zza(int i) {
        if (i >= this.f102067d) {
            return new C46304oU8(Arrays.copyOf(this.f102066c, i), this.f102067d);
        }
        throw new IllegalArgumentException();
    }

    public C46304oU8(E[] eArr, int i) {
        this.f102066c = eArr;
        this.f102067d = i;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m37302a();
        if (i >= 0 && i <= (i2 = this.f102067d)) {
            E[] eArr = this.f102066c;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.f102066c, i, eArr2, i + 1, this.f102067d - i);
                this.f102066c = eArr2;
            }
            this.f102066c[i] = e;
            this.f102067d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m20986c(i));
    }
}
