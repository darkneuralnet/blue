package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: PA7 */
/* loaded from: classes5.dex */
public abstract class PA7 implements Iterator {

    /* renamed from: b */
    public int f28048b;

    /* renamed from: c */
    public int f28049c;

    /* renamed from: d */
    public int f28050d;

    /* renamed from: e */
    public final /* synthetic */ C43796kF7 f28051e;

    public /* synthetic */ PA7(C43796kF7 c43796kF7, C37804aA7 c37804aA7) {
        int i;
        this.f28051e = c43796kF7;
        i = c43796kF7.f94167f;
        this.f28048b = i;
        this.f28049c = c43796kF7.m29131e();
        this.f28050d = -1;
    }

    /* renamed from: a */
    public abstract Object mo6017a(int i);

    /* renamed from: b */
    public final void m90603b() {
        int i;
        i = this.f28051e.f94167f;
        if (i != this.f28048b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28049c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m90603b();
        if (hasNext()) {
            int i = this.f28049c;
            this.f28050d = i;
            Object mo6017a = mo6017a(i);
            this.f28049c = this.f28051e.m29130f(this.f28049c);
            return mo6017a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        m90603b();
        if (this.f28050d >= 0) {
            z = true;
        } else {
            z = false;
        }
        C31899Bf7.m113726d(z, "no calls to next() since the last call to remove()");
        this.f28048b += 32;
        C43796kF7 c43796kF7 = this.f28051e;
        int i = this.f28050d;
        Object[] objArr = c43796kF7.f94165d;
        objArr.getClass();
        c43796kF7.remove(objArr[i]);
        this.f28049c--;
        this.f28050d = -1;
    }
}
