package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* renamed from: Fo7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C32916Fo7 implements Iterator {

    /* renamed from: b */
    public final Iterator f10262b;

    /* renamed from: c */
    public final Collection f10263c;

    /* renamed from: d */
    public final /* synthetic */ C51842xp7 f10264d;

    public C32916Fo7(C51842xp7 c51842xp7, Iterator it) {
        this.f10264d = c51842xp7;
        this.f10263c = c51842xp7.f118196c;
        this.f10262b = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m106440a() {
        this.f10264d.zzb();
        if (this.f10264d.f118196c == this.f10263c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m106440a();
        return this.f10262b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m106440a();
        return this.f10262b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.f10262b.remove();
        AbstractC37389Yr7 abstractC37389Yr7 = this.f10264d.f118199f;
        i = abstractC37389Yr7.f47501e;
        abstractC37389Yr7.f47501e = i - 1;
        this.f10264d.m4584b();
    }

    public C32916Fo7(C51842xp7 c51842xp7) {
        Iterator it;
        this.f10264d = c51842xp7;
        Collection collection = c51842xp7.f118196c;
        this.f10263c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f10262b = it;
    }
}
