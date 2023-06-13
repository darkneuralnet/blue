package p000;

import java.util.NoSuchElementException;
/* renamed from: ZH8 */
/* loaded from: classes5.dex */
public final class ZH8 extends AbstractC42054hJ8 {

    /* renamed from: b */
    public boolean f48179b;

    /* renamed from: c */
    public final /* synthetic */ Object f48180c;

    public ZH8(Object obj) {
        this.f48180c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f48179b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f48179b) {
            throw new NoSuchElementException();
        }
        this.f48179b = true;
        return this.f48180c;
    }
}
