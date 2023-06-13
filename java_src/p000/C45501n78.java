package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
/* renamed from: n78  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45501n78<E> extends AbstractC36507Ux7<E> {

    /* renamed from: d */
    public static final C45501n78<Object> f99490d;

    /* renamed from: c */
    public final List<E> f99491c;

    static {
        C45501n78<Object> c45501n78 = new C45501n78<>();
        f99490d = c45501n78;
        c45501n78.zzv();
    }

    public C45501n78() {
        this(new ArrayList(10));
    }

    /* renamed from: b */
    public static <E> C45501n78<E> m24287b() {
        return (C45501n78<E>) f99490d;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        m80580a();
        this.f99491c.add(i, e);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return this.f99491c.get(i);
    }

    @Override // p000.InterfaceC47489qU7
    /* renamed from: n */
    public final /* synthetic */ InterfaceC47489qU7 mo1502n(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f99491c);
            return new C45501n78(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        m80580a();
        E remove = this.f99491c.remove(i);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m80580a();
        E e2 = this.f99491c.set(i, e);
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f99491c.size();
    }

    public C45501n78(List<E> list) {
        this.f99491c = list;
    }
}
