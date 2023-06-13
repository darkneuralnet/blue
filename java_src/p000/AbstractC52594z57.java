package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: z57  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC52594z57 implements Iterator {

    /* renamed from: b */
    public Object f120764b;

    /* renamed from: c */
    public int f120765c = 2;

    /* renamed from: a */
    public abstract Object mo1832a();

    /* renamed from: b */
    public final Object m1831b() {
        this.f120765c = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f120765c;
        if (i != 4) {
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    return true;
                }
                if (i2 != 2) {
                    this.f120765c = 4;
                    this.f120764b = mo1832a();
                    if (this.f120765c != 3) {
                        this.f120765c = 1;
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f120765c = 2;
            Object obj = this.f120764b;
            this.f120764b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
