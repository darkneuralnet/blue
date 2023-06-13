package p000;

import java.util.Iterator;
/* renamed from: XC7 */
/* loaded from: classes5.dex */
public final class XC7 extends AbstractC34869Nx7 {

    /* renamed from: d */
    public final transient AbstractC37434Yw7 f42890d;

    /* renamed from: e */
    public final transient AbstractC32268Cu7 f42891e;

    public XC7(AbstractC37434Yw7 abstractC37434Yw7, AbstractC32268Cu7 abstractC32268Cu7) {
        this.f42890d = abstractC37434Yw7;
        this.f42891e = abstractC32268Cu7;
    }

    @Override // p000.AbstractC48306rr7
    /* renamed from: a */
    public final int mo14906a(Object[] objArr, int i) {
        return this.f42891e.mo14906a(objArr, 0);
    }

    @Override // p000.AbstractC48306rr7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f42890d.get(obj) != null;
    }

    @Override // p000.AbstractC34869Nx7, p000.AbstractC48306rr7
    /* renamed from: e */
    public final AbstractC42026hG7 mo15154e() {
        return this.f42891e.listIterator(0);
    }

    @Override // p000.AbstractC34869Nx7, p000.AbstractC48306rr7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return this.f42891e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f42890d.size();
    }
}
