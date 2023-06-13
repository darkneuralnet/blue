package p000;

import java.util.Iterator;
/* renamed from: iP8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42701iP8<E> extends CO8<E> {
    public C42701iP8() {
        super(4);
    }

    /* renamed from: d */
    public final C42701iP8<E> m34006d(E e) {
        super.m112265b(e);
        return this;
    }

    /* renamed from: e */
    public final C42701iP8<E> m34005e(Iterator<? extends E> it) {
        while (it.hasNext()) {
            super.m112265b(it.next());
        }
        return this;
    }

    /* renamed from: f */
    public final ZP8<E> m34004f() {
        this.f4030c = true;
        return ZP8.m73200w(this.f4028a, this.f4029b);
    }

    public C42701iP8(int i) {
        super(4);
    }
}
