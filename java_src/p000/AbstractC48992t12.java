package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: t12  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48992t12<T> implements Iterator<T> {

    /* renamed from: b */
    public int f109696b;

    /* renamed from: c */
    public int f109697c;

    /* renamed from: d */
    public boolean f109698d;

    public AbstractC48992t12(int i) {
        this.f109696b = i;
    }

    /* renamed from: a */
    public abstract T mo2570a(int i);

    /* renamed from: b */
    public abstract void mo2569b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f109697c < this.f109696b;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            T mo2570a = mo2570a(this.f109697c);
            this.f109697c++;
            this.f109698d = true;
            return mo2570a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f109698d) {
            int i = this.f109697c - 1;
            this.f109697c = i;
            mo2569b(i);
            this.f109696b--;
            this.f109698d = false;
            return;
        }
        throw new IllegalStateException();
    }
}
