package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* renamed from: sl9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48840sl9 implements Iterator {

    /* renamed from: b */
    public final Iterator f109224b;

    /* renamed from: c */
    public final Collection f109225c;

    /* renamed from: d */
    public final /* synthetic */ Do9 f109226d;

    public C48840sl9(Do9 do9, Iterator it) {
        this.f109226d = do9;
        this.f109225c = do9.f6378c;
        this.f109224b = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m13703a() {
        this.f109226d.zzb();
        if (this.f109226d.f6378c == this.f109225c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m13703a();
        return this.f109224b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m13703a();
        return this.f109224b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f109224b.remove();
        Jt9.m99587g(this.f109226d.f6381f);
        this.f109226d.m109898b();
    }

    public C48840sl9(Do9 do9) {
        Iterator it;
        this.f109226d = do9;
        Collection collection = do9.f6378c;
        this.f109225c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f109224b = it;
    }
}
