package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* renamed from: com.google.crypto.tink.shaded.protobuf.K */
/* loaded from: classes6.dex */
public final class C18155K<E> extends AbstractC18191c<E> implements RandomAccess {

    /* renamed from: e */
    public static final C18155K<Object> f74050e;

    /* renamed from: c */
    public E[] f74051c;

    /* renamed from: d */
    public int f74052d;

    static {
        C18155K<Object> c18155k = new C18155K<>(new Object[0], 0);
        f74050e = c18155k;
        c18155k.mo47412r();
    }

    public C18155K() {
        this(new Object[10], 0);
    }

    /* renamed from: b */
    public static <E> E[] m47999b(int i) {
        return (E[]) new Object[i];
    }

    /* renamed from: c */
    public static <E> C18155K<E> m47998c() {
        return (C18155K<E>) f74050e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m47785a();
        int i = this.f74052d;
        E[] eArr = this.f74051c;
        if (i == eArr.length) {
            this.f74051c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f74051c;
        int i2 = this.f74052d;
        this.f74052d = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: e */
    public final void m47997e(int i) {
        if (i >= 0 && i < this.f74052d) {
            return;
        }
        throw new IndexOutOfBoundsException(m47996f(i));
    }

    /* renamed from: f */
    public final String m47996f(int i) {
        return "Index:" + i + ", Size:" + this.f74052d;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        m47997e(i);
        return this.f74051c[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18247i
    /* renamed from: h */
    public C18155K<E> mo47397k(int i) {
        if (i >= this.f74052d) {
            return new C18155K<>(Arrays.copyOf(this.f74051c, i), this.f74052d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        m47785a();
        m47997e(i);
        E[] eArr = this.f74051c;
        E e = eArr[i];
        if (i < this.f74052d - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f74052d--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        m47785a();
        m47997e(i);
        E[] eArr = this.f74051c;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74052d;
    }

    public C18155K(E[] eArr, int i) {
        this.f74051c = eArr;
        this.f74052d = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        m47785a();
        if (i >= 0 && i <= (i2 = this.f74052d)) {
            E[] eArr = this.f74051c;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) m47999b(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f74051c, 0, eArr2, 0, i);
                System.arraycopy(this.f74051c, i, eArr2, i + 1, this.f74052d - i);
                this.f74051c = eArr2;
            }
            this.f74051c[i] = e;
            this.f74052d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m47996f(i));
    }
}
