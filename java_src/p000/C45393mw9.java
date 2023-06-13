package p000;

import java.util.Iterator;
/* renamed from: mw9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45393mw9 extends Ao9 {

    /* renamed from: d */
    public final transient AbstractC47062pl9 f99092d;

    /* renamed from: e */
    public final transient Ed9 f99093e;

    public C45393mw9(AbstractC47062pl9 abstractC47062pl9, Ed9 ed9) {
        this.f99092d = abstractC47062pl9;
        this.f99093e = ed9;
    }

    @Override // p000.TT8
    /* renamed from: a */
    public final int mo24687a(Object[] objArr, int i) {
        return this.f99093e.mo24687a(objArr, 0);
    }

    @Override // p000.TT8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f99092d.get(obj) != null;
    }

    @Override // p000.Ao9, p000.TT8
    /* renamed from: e */
    public final AbstractC49974ug7 mo24686e() {
        return this.f99093e.listIterator(0);
    }

    @Override // p000.Ao9, p000.TT8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f99093e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f99092d.size();
    }
}
