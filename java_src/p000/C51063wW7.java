package p000;

import java.util.Iterator;
/* renamed from: wW7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51063wW7 extends AbstractC51027wS7 {

    /* renamed from: d */
    public final transient AbstractC42727iS7 f116120d;

    /* renamed from: e */
    public final transient DR7 f116121e;

    public C51063wW7(AbstractC42727iS7 abstractC42727iS7, DR7 dr7) {
        this.f116120d = abstractC42727iS7;
        this.f116121e = dr7;
    }

    @Override // p000.VO7
    /* renamed from: a */
    public final int mo6713a(Object[] objArr, int i) {
        return this.f116121e.mo6713a(objArr, i);
    }

    @Override // p000.VO7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f116120d.get(obj) != null;
    }

    @Override // p000.AbstractC51027wS7, p000.VO7
    /* renamed from: e */
    public final AbstractC41011fZ7 mo6712e() {
        return this.f116121e.listIterator(0);
    }

    @Override // p000.AbstractC51027wS7, p000.VO7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return this.f116121e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f116120d.size();
    }
}
