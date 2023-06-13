package p000;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: Sn8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35950Sn8 implements Iterator {

    /* renamed from: b */
    public final ArrayDeque f34276b;

    /* renamed from: c */
    public ZW7 f34277c;

    public /* synthetic */ C35950Sn8(AbstractC41604gZ7 abstractC41604gZ7, C32674En8 c32674En8) {
        AbstractC41604gZ7 abstractC41604gZ72;
        if (abstractC41604gZ7 instanceof C48277ro8) {
            C48277ro8 c48277ro8 = (C48277ro8) abstractC41604gZ7;
            ArrayDeque arrayDeque = new ArrayDeque(c48277ro8.mo15342h());
            this.f34276b = arrayDeque;
            arrayDeque.push(c48277ro8);
            abstractC41604gZ72 = c48277ro8.f107671g;
            this.f34277c = m84824b(abstractC41604gZ72);
            return;
        }
        this.f34276b = null;
        this.f34277c = (ZW7) abstractC41604gZ7;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final ZW7 next() {
        ZW7 zw7;
        AbstractC41604gZ7 abstractC41604gZ7;
        ZW7 zw72 = this.f34277c;
        if (zw72 != null) {
            do {
                ArrayDeque arrayDeque = this.f34276b;
                zw7 = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                abstractC41604gZ7 = ((C48277ro8) this.f34276b.pop()).f107672h;
                zw7 = m84824b(abstractC41604gZ7);
            } while (zw7.mo5074e() == 0);
            this.f34277c = zw7;
            return zw72;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final ZW7 m84824b(AbstractC41604gZ7 abstractC41604gZ7) {
        while (abstractC41604gZ7 instanceof C48277ro8) {
            C48277ro8 c48277ro8 = (C48277ro8) abstractC41604gZ7;
            this.f34276b.push(c48277ro8);
            abstractC41604gZ7 = c48277ro8.f107671g;
        }
        return (ZW7) abstractC41604gZ7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34277c != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
