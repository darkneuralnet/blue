package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: YA7 */
/* loaded from: classes5.dex */
public abstract class YA7 implements Iterator {

    /* renamed from: b */
    public int f44749b;

    /* renamed from: c */
    public int f44750c;

    /* renamed from: d */
    public int f44751d;

    /* renamed from: e */
    public final /* synthetic */ C50910wF7 f44752e;

    public /* synthetic */ YA7(C50910wF7 c50910wF7, C35571Qx7 c35571Qx7) {
        int i;
        this.f44752e = c50910wF7;
        i = c50910wF7.f115738f;
        this.f44749b = i;
        this.f44750c = c50910wF7.m7077g();
        this.f44751d = -1;
    }

    /* renamed from: a */
    public abstract Object mo9412a(int i);

    /* renamed from: b */
    public final void m75473b() {
        int i;
        i = this.f44752e.f115738f;
        if (i != this.f44749b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44750c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m75473b();
        if (hasNext()) {
            int i = this.f44750c;
            this.f44751d = i;
            Object mo9412a = mo9412a(i);
            this.f44750c = this.f44752e.m7076h(this.f44750c);
            return mo9412a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        m75473b();
        if (this.f44751d >= 0) {
            z = true;
        } else {
            z = false;
        }
        C50566vg7.m8260d(z, "no calls to next() since the last call to remove()");
        this.f44749b += 32;
        C50910wF7 c50910wF7 = this.f44752e;
        c50910wF7.remove(C50910wF7.m7075i(c50910wF7, this.f44751d));
        this.f44750c--;
        this.f44751d = -1;
    }
}
