package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* renamed from: com.google.protobuf.H */
/* loaded from: classes6.dex */
public final class C18467H<E> extends AbstractC18502c<E> implements RandomAccess {

    /* renamed from: e */
    public static final C18467H<Object> f74715e;

    /* renamed from: c */
    public E[] f74716c;

    /* renamed from: d */
    public int f74717d;

    static {
        C18467H<Object> c18467h = new C18467H<>(new Object[0], 0);
        f74715e = c18467h;
        c18467h.mo45989r();
    }

    public C18467H() {
        this(new Object[10], 0);
    }

    /* renamed from: b */
    public static <E> E[] m46543b(int i) {
        return (E[]) new Object[i];
    }

    /* renamed from: c */
    public static <E> C18467H<E> m46542c() {
        return (C18467H<E>) f74715e;
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m46321a();
        int i = this.f74717d;
        E[] eArr = this.f74716c;
        if (i == eArr.length) {
            this.f74716c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f74716c;
        int i2 = this.f74717d;
        this.f74717d = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: e */
    public final void m46541e(int i) {
        if (i >= 0 && i < this.f74717d) {
            return;
        }
        throw new IndexOutOfBoundsException(m46540f(i));
    }

    /* renamed from: f */
    public final String m46540f(int i) {
        return "Index:" + i + ", Size:" + this.f74717d;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        m46541e(i);
        return this.f74716c[i];
    }

    @Override // com.google.protobuf.C18544t.InterfaceC18553i
    /* renamed from: h */
    public C18467H<E> mo45959k(int i) {
        if (i >= this.f74717d) {
            return new C18467H<>(Arrays.copyOf(this.f74716c, i), this.f74717d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        m46321a();
        m46541e(i);
        E[] eArr = this.f74716c;
        E e = eArr[i];
        if (i < this.f74717d - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f74717d--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        m46321a();
        m46541e(i);
        E[] eArr = this.f74716c;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74717d;
    }

    public C18467H(E[] eArr, int i) {
        this.f74716c = eArr;
        this.f74717d = i;
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        m46321a();
        if (i >= 0 && i <= (i2 = this.f74717d)) {
            E[] eArr = this.f74716c;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) m46543b(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f74716c, 0, eArr2, 0, i);
                System.arraycopy(this.f74716c, i, eArr2, i + 1, this.f74717d - i);
                this.f74716c = eArr2;
            }
            this.f74716c[i] = e;
            this.f74717d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m46540f(i));
    }
}
