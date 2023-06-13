package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: iT7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42736iT7 extends C51629xT7 implements Iterable {

    /* renamed from: b */
    public final List f87396b = new ArrayList();

    /* renamed from: b */
    public final void m33864b(C51629xT7 c51629xT7) {
        this.f87396b.add(c51629xT7);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C42736iT7) && ((C42736iT7) obj).f87396b.equals(this.f87396b);
        }
        return true;
    }

    public final int hashCode() {
        return this.f87396b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f87396b.iterator();
    }
}
