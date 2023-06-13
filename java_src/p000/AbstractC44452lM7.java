package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: lM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC44452lM7 implements Iterator {

    /* renamed from: b */
    public int f95942b;

    /* renamed from: c */
    public int f95943c;

    /* renamed from: d */
    public int f95944d;

    /* renamed from: e */
    public final /* synthetic */ C52761zN7 f95945e;

    public /* synthetic */ AbstractC44452lM7(C52761zN7 c52761zN7, VL7 vl7) {
        int i;
        this.f95945e = c52761zN7;
        i = c52761zN7.f121264f;
        this.f95942b = i;
        this.f95943c = c52761zN7.m1454e();
        this.f95944d = -1;
    }

    /* renamed from: a */
    public abstract Object mo17602a(int i);

    /* renamed from: b */
    public final void m27385b() {
        int i;
        i = this.f95945e.f121264f;
        if (i != this.f95942b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f95943c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m27385b();
        if (hasNext()) {
            int i = this.f95943c;
            this.f95944d = i;
            Object mo17602a = mo17602a(i);
            this.f95943c = this.f95945e.m1453f(this.f95943c);
            return mo17602a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        m27385b();
        if (this.f95944d >= 0) {
            z = true;
        } else {
            z = false;
        }
        C34833Nt7.m93210d(z, "no calls to next() since the last call to remove()");
        this.f95942b += 32;
        C52761zN7 c52761zN7 = this.f95945e;
        int i = this.f95944d;
        Object[] objArr = c52761zN7.f121262d;
        objArr.getClass();
        c52761zN7.remove(objArr[i]);
        this.f95943c--;
        this.f95944d = -1;
    }
}
