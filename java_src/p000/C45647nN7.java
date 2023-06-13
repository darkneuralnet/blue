package p000;

import java.util.Iterator;
/* renamed from: nN7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45647nN7 extends ZL7 {

    /* renamed from: d */
    public final transient IL7 f99850d;

    /* renamed from: e */
    public final transient AbstractC40292eL7 f99851e;

    public C45647nN7(IL7 il7, AbstractC40292eL7 abstractC40292eL7) {
        this.f99850d = il7;
        this.f99851e = abstractC40292eL7;
    }

    @Override // p000.OI7
    /* renamed from: a */
    public final int mo19398a(Object[] objArr, int i) {
        return this.f99851e.mo19398a(objArr, 0);
    }

    @Override // p000.OI7, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f99850d.get(obj) != null;
    }

    @Override // p000.ZL7, p000.OI7
    /* renamed from: e */
    public final AbstractC49806uO7 mo23923e() {
        return this.f99851e.listIterator(0);
    }

    @Override // p000.ZL7, p000.OI7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f99851e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f99850d.size();
    }
}
