package p000;

import java.util.Iterator;
/* renamed from: hL7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42071hL7 extends AbstractC51942xz7 {

    /* renamed from: d */
    public final transient AbstractC50746vy7 f85029d;

    /* renamed from: e */
    public final transient AbstractC38851bw7 f85030e;

    public C42071hL7(AbstractC50746vy7 abstractC50746vy7, AbstractC38851bw7 abstractC38851bw7) {
        this.f85029d = abstractC50746vy7;
        this.f85030e = abstractC38851bw7;
    }

    @Override // p000.AbstractC45944ns7
    /* renamed from: a */
    public final int mo22261a(Object[] objArr, int i) {
        return this.f85030e.mo22261a(objArr, 0);
    }

    @Override // p000.AbstractC45944ns7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f85029d.get(obj) != null;
    }

    @Override // p000.AbstractC51942xz7, p000.AbstractC45944ns7
    /* renamed from: e */
    public final ZM7 mo4273e() {
        return this.f85030e.listIterator(0);
    }

    @Override // p000.AbstractC51942xz7, p000.AbstractC45944ns7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f85030e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f85029d.size();
    }
}
