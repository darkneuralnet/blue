package p000;

import java.util.Iterator;
/* renamed from: oT8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46295oT8<E> extends RQ8<E> {

    /* renamed from: d */
    public final transient E f102051d;

    /* renamed from: e */
    public transient int f102052e;

    public C46295oT8(E e) {
        e.getClass();
        this.f102051d = e;
    }

    @Override // p000.XO8
    /* renamed from: a */
    public final int mo21022a(Object[] objArr, int i) {
        objArr[0] = this.f102051d;
        return 1;
    }

    @Override // p000.XO8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f102051d.equals(obj);
    }

    @Override // p000.RQ8, p000.XO8
    /* renamed from: f */
    public final AbstractC38578bU8<E> mo21021f() {
        return new C44498lR8(this.f102051d);
    }

    @Override // p000.RQ8, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f102052e;
        if (i == 0) {
            int hashCode = this.f102051d.hashCode();
            this.f102052e = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // p000.RQ8, p000.XO8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C44498lR8(this.f102051d);
    }

    @Override // p000.RQ8
    /* renamed from: s */
    public final ZP8<E> mo21020s() {
        return ZP8.m73206A(this.f102051d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f102051d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // p000.RQ8
    /* renamed from: x */
    public final boolean mo21019x() {
        return this.f102052e != 0;
    }

    public C46295oT8(E e, int i) {
        this.f102051d = e;
        this.f102052e = i;
    }
}
