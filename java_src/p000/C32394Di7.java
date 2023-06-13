package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: Di7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32394Di7 implements Iterator {

    /* renamed from: b */
    public int f6217b = 0;

    /* renamed from: c */
    public final /* synthetic */ C50596vj7 f6218c;

    public C32394Di7(C50596vj7 c50596vj7) {
        this.f6218c = c50596vj7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6217b < this.f6218c.m8225f();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f6217b < this.f6218c.m8225f()) {
            C50596vj7 c50596vj7 = this.f6218c;
            int i = this.f6217b;
            this.f6217b = i + 1;
            return c50596vj7.m8224h(i);
        }
        int i2 = this.f6217b;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
