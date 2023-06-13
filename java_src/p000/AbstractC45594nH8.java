package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;
@NullMarked
/* renamed from: nH8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC45594nH8 implements Iterator {

    /* renamed from: b */
    public Object f99722b;

    /* renamed from: c */
    public int f99723c = 2;

    /* renamed from: a */
    public abstract Object mo2250a();

    /* renamed from: b */
    public final Object m23997b() {
        this.f99723c = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f99723c;
        if (i != 4) {
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    return true;
                }
                if (i2 != 2) {
                    this.f99723c = 4;
                    this.f99722b = mo2250a();
                    if (this.f99723c != 3) {
                        this.f99723c = 1;
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
            this.f99723c = 2;
            Object obj = this.f99722b;
            this.f99722b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
