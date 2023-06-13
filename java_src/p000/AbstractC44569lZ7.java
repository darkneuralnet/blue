package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: lZ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC44569lZ7 implements Iterator {

    /* renamed from: b */
    public C52869zZ7 f96325b;

    /* renamed from: c */
    public C52869zZ7 f96326c = null;

    /* renamed from: d */
    public int f96327d;

    /* renamed from: e */
    public final /* synthetic */ NZ7 f96328e;

    public AbstractC44569lZ7(NZ7 nz7) {
        this.f96328e = nz7;
        this.f96325b = nz7.f24799f.f121543e;
        this.f96327d = nz7.f24798e;
    }

    /* renamed from: a */
    public final C52869zZ7 m27147a() {
        C52869zZ7 c52869zZ7 = this.f96325b;
        NZ7 nz7 = this.f96328e;
        if (c52869zZ7 != nz7.f24799f) {
            if (nz7.f24798e == this.f96327d) {
                this.f96325b = c52869zZ7.f121543e;
                this.f96326c = c52869zZ7;
                return c52869zZ7;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f96325b != this.f96328e.f24799f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C52869zZ7 c52869zZ7 = this.f96326c;
        if (c52869zZ7 != null) {
            this.f96328e.m93751e(c52869zZ7, true);
            this.f96326c = null;
            this.f96327d = this.f96328e.f24798e;
            return;
        }
        throw new IllegalStateException();
    }
}
