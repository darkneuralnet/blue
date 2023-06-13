package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: Jh7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33789Jh7 implements Iterator {

    /* renamed from: b */
    public final /* synthetic */ Iterator f18056b;

    /* renamed from: c */
    public final /* synthetic */ Iterator f18057c;

    public C33789Jh7(C50596vj7 c50596vj7, Iterator it, Iterator it2) {
        this.f18056b = it;
        this.f18057c = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f18056b.hasNext()) {
            return true;
        }
        return this.f18057c.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f18056b.hasNext()) {
            return new C43019iw7(((Integer) this.f18056b.next()).toString());
        }
        if (this.f18057c.hasNext()) {
            return new C43019iw7((String) this.f18057c.next());
        }
        throw new NoSuchElementException();
    }
}
