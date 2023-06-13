package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: X38 */
/* loaded from: classes5.dex */
public final class X38 extends AbstractList<String> implements KM7, RandomAccess {

    /* renamed from: b */
    public final KM7 f42591b;

    public X38(KM7 km7) {
        this.f42591b = km7;
    }

    @Override // p000.KM7
    /* renamed from: O1 */
    public final Object mo64612O1(int i) {
        return this.f42591b.mo64612O1(i);
    }

    @Override // p000.KM7
    /* renamed from: W */
    public final List<?> mo64611W() {
        return this.f42591b.mo64611W();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.f42591b.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C52585z48(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new P48(this, i);
    }

    @Override // p000.KM7
    /* renamed from: m */
    public final KM7 mo64609m() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42591b.size();
    }
}
