package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: iN8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC42683iN8 implements Iterator {

    /* renamed from: b */
    public Object f87225b;

    /* renamed from: c */
    public int f87226c = 2;

    /* renamed from: a */
    public abstract Object mo14187a();

    /* renamed from: b */
    public final Object m34038b() {
        this.f87226c = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f87226c != 4) {
            z = true;
        } else {
            z = false;
        }
        DQ8.m110465f(z);
        int i = this.f87226c;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return true;
            }
            if (i2 != 2) {
                this.f87226c = 4;
                this.f87225b = mo14187a();
                if (this.f87226c != 3) {
                    this.f87226c = 1;
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f87226c = 2;
            Object obj = this.f87225b;
            this.f87225b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
