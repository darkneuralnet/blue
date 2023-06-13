package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: AF8 */
/* loaded from: classes6.dex */
public abstract class AF8<T> implements Iterator<T> {

    /* renamed from: b */
    public T f318b;

    /* renamed from: c */
    public int f319c = 2;

    /* renamed from: a */
    public abstract T mo105299a();

    /* renamed from: b */
    public final T m115953b() {
        this.f319c = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f319c != 4) {
            z = true;
        } else {
            z = false;
        }
        C52142yK8.m3656i(z);
        int i = this.f319c;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return true;
            }
            if (i2 != 2) {
                this.f319c = 4;
                this.f318b = mo105299a();
                if (this.f319c != 3) {
                    this.f319c = 1;
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f319c = 2;
            T t = this.f318b;
            this.f318b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
