package p000;

import java.util.Iterator;
/* renamed from: LT7 */
/* loaded from: classes5.dex */
public final class LT7 extends AbstractC49195tM7 {

    /* renamed from: d */
    public final transient AbstractC39709dM7 f21472d;

    /* renamed from: e */
    public final transient AbstractC51557xL7 f21473e;

    public LT7(AbstractC39709dM7 abstractC39709dM7, AbstractC51557xL7 abstractC51557xL7) {
        this.f21472d = abstractC39709dM7;
        this.f21473e = abstractC51557xL7;
    }

    @Override // p000.AbstractC47983rJ7
    /* renamed from: a */
    public final int mo5429a(Object[] objArr, int i) {
        return this.f21473e.mo5429a(objArr, 0);
    }

    @Override // p000.AbstractC47983rJ7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f21472d.get(obj) != null;
    }

    @Override // p000.AbstractC49195tM7, p000.AbstractC47983rJ7
    /* renamed from: e */
    public final AbstractC46312oV7 mo5428e() {
        return this.f21473e.listIterator(0);
    }

    @Override // p000.AbstractC49195tM7, p000.AbstractC47983rJ7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f21473e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21472d.size();
    }
}
