package p000;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: Tm7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36174Tm7 extends AbstractCollection {

    /* renamed from: b */
    public final /* synthetic */ C34545Mn7 f36065b;

    public C36174Tm7(C34545Mn7 c34545Mn7) {
        this.f36065b = c34545Mn7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f36065b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C34545Mn7 c34545Mn7 = this.f36065b;
        Map m94811n = c34545Mn7.m94811n();
        if (m94811n != null) {
            return m94811n.values().iterator();
        }
        return new C47030pi7(c34545Mn7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f36065b.size();
    }
}
