package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: iw9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC43021iw9 implements Iterator {

    /* renamed from: b */
    public C43614jw9 f91747b;

    /* renamed from: c */
    public C43614jw9 f91748c = null;

    /* renamed from: d */
    public int f91749d;

    /* renamed from: e */
    public final /* synthetic */ C44207kw9 f91750e;

    public AbstractC43021iw9(C44207kw9 c44207kw9) {
        this.f91750e = c44207kw9;
        this.f91747b = c44207kw9.f95257f.f93589e;
        this.f91749d = c44207kw9.f95256e;
    }

    /* renamed from: a */
    public final C43614jw9 m31576a() {
        C43614jw9 c43614jw9 = this.f91747b;
        C44207kw9 c44207kw9 = this.f91750e;
        if (c43614jw9 != c44207kw9.f95257f) {
            if (c44207kw9.f95256e == this.f91749d) {
                this.f91747b = c43614jw9.f93589e;
                this.f91748c = c43614jw9;
                return c43614jw9;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f91747b != this.f91750e.f95257f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C43614jw9 c43614jw9 = this.f91748c;
        if (c43614jw9 != null) {
            this.f91750e.m28105e(c43614jw9, true);
            this.f91748c = null;
            this.f91749d = this.f91750e.f95256e;
            return;
        }
        throw new IllegalStateException();
    }
}
