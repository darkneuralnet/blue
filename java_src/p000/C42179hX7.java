package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
/* renamed from: hX7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42179hX7<E> extends Bh9<E> {

    /* renamed from: d */
    public static final C42179hX7<Object> f85367d;

    /* renamed from: c */
    public final List<E> f85368c;

    static {
        C42179hX7<Object> c42179hX7 = new C42179hX7<>(new ArrayList(0));
        f85367d = c42179hX7;
        c42179hX7.mo113666q();
    }

    public C42179hX7() {
        this(new ArrayList(10));
    }

    /* renamed from: b */
    public static <E> C42179hX7<E> m36224b() {
        return (C42179hX7<E>) f85367d;
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        m113667a();
        this.f85368c.add(i, e);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return this.f85368c.get(i);
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        m113667a();
        E remove = this.f85368c.remove(i);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m113667a();
        E e2 = this.f85368c.set(i, e);
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f85368c.size();
    }

    @Override // p000.BI7
    public final /* synthetic */ BI7 zzh(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f85368c);
            return new C42179hX7(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public C42179hX7(List<E> list) {
        this.f85368c = list;
    }
}
