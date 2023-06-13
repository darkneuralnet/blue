package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: lj7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44668lj7 extends BQ7 {

    /* renamed from: b */
    public final /* synthetic */ C39334cl7 f96643b;

    public C44668lj7(C39334cl7 c39334cl7) {
        this.f96643b = c39334cl7;
    }

    @Override // p000.BQ7
    /* renamed from: a */
    public final Map mo26904a() {
        return this.f96643b;
    }

    @Override // p000.BQ7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f96643b.f61206e.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C41120fk7(this.f96643b);
    }

    @Override // p000.BQ7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        AbstractC37389Yr7.m74083m(this.f96643b.f61207f, entry.getKey());
        return true;
    }
}
