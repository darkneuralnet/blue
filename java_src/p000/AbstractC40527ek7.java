package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: ek7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC40527ek7 implements Iterator {

    /* renamed from: b */
    public int f78811b;

    /* renamed from: c */
    public int f78812c;

    /* renamed from: d */
    public int f78813d;

    /* renamed from: e */
    public final /* synthetic */ C34545Mn7 f78814e;

    public /* synthetic */ AbstractC40527ek7(C34545Mn7 c34545Mn7, C52345yg7 c52345yg7) {
        int i;
        this.f78814e = c34545Mn7;
        i = c34545Mn7.f23584f;
        this.f78811b = i;
        this.f78812c = c34545Mn7.m94818g();
        this.f78813d = -1;
    }

    /* renamed from: a */
    public abstract Object mo2916a(int i);

    /* renamed from: b */
    public final void m42591b() {
        int i;
        i = this.f78814e.f23584f;
        if (i != this.f78811b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f78812c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m42591b();
        if (hasNext()) {
            int i = this.f78812c;
            this.f78813d = i;
            Object mo2916a = mo2916a(i);
            this.f78812c = this.f78814e.m94817h(this.f78812c);
            return mo2916a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        m42591b();
        if (this.f78813d >= 0) {
            z = true;
        } else {
            z = false;
        }
        C41211ft8.m40585e(z, "no calls to next() since the last call to remove()");
        this.f78811b += 32;
        C34545Mn7 c34545Mn7 = this.f78814e;
        c34545Mn7.remove(C34545Mn7.m94816i(c34545Mn7, this.f78813d));
        this.f78812c--;
        this.f78813d = -1;
    }
}
