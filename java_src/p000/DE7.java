package p000;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: DE7 */
/* loaded from: classes5.dex */
public final class DE7 extends AbstractCollection {

    /* renamed from: b */
    public final /* synthetic */ C50910wF7 f5423b;

    public DE7(C50910wF7 c50910wF7) {
        this.f5423b = c50910wF7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f5423b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C50910wF7 c50910wF7 = this.f5423b;
        Map m7070n = c50910wF7.m7070n();
        if (m7070n != null) {
            return m7070n.values().iterator();
        }
        return new C50164uz7(c50910wF7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f5423b.size();
    }
}
