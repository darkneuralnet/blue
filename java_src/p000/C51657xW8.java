package p000;

import java.util.Iterator;
/* renamed from: xW8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51657xW8 extends AbstractC45127mV8 {

    /* renamed from: d */
    public final transient QU8 f117754d;

    /* renamed from: e */
    public final transient AbstractC50453vU8 f117755e;

    public C51657xW8(QU8 qu8, AbstractC50453vU8 abstractC50453vU8) {
        this.f117754d = qu8;
        this.f117755e = abstractC50453vU8;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: a */
    public final int mo5039a(Object[] objArr, int i) {
        return this.f117755e.mo5039a(objArr, 0);
    }

    @Override // p000.AbstractC37976aT8, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f117754d.get(obj) != null;
    }

    @Override // p000.AbstractC45127mV8, p000.AbstractC37976aT8
    /* renamed from: e */
    public final HX8 mo5038e() {
        return this.f117755e.listIterator(0);
    }

    @Override // p000.AbstractC45127mV8, p000.AbstractC37976aT8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f117755e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f117754d.size();
    }
}
