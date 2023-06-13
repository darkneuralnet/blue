package p000;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: Lv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34383Lv7 implements Iterator {

    /* renamed from: b */
    public final ArrayDeque f22280b;

    /* renamed from: c */
    public AbstractC42396ht7 f22281c;

    public /* synthetic */ C34383Lv7(AbstractC44175kt7 abstractC44175kt7, C33915Jv7 c33915Jv7) {
        AbstractC44175kt7 abstractC44175kt72;
        if (abstractC44175kt7 instanceof C34617Mv7) {
            C34617Mv7 c34617Mv7 = (C34617Mv7) abstractC44175kt7;
            ArrayDeque arrayDeque = new ArrayDeque(c34617Mv7.mo28215h());
            this.f22280b = arrayDeque;
            arrayDeque.push(c34617Mv7);
            abstractC44175kt72 = c34617Mv7.f23823g;
            this.f22281c = m96144b(abstractC44175kt72);
            return;
        }
        this.f22280b = null;
        this.f22281c = (AbstractC42396ht7) abstractC44175kt7;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final AbstractC42396ht7 next() {
        AbstractC42396ht7 abstractC42396ht7;
        AbstractC44175kt7 abstractC44175kt7;
        AbstractC42396ht7 abstractC42396ht72 = this.f22281c;
        if (abstractC42396ht72 != null) {
            do {
                ArrayDeque arrayDeque = this.f22280b;
                abstractC42396ht7 = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                abstractC44175kt7 = ((C34617Mv7) this.f22280b.pop()).f23824h;
                abstractC42396ht7 = m96144b(abstractC44175kt7);
            } while (abstractC42396ht7.mo28217e() == 0);
            this.f22281c = abstractC42396ht7;
            return abstractC42396ht72;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final AbstractC42396ht7 m96144b(AbstractC44175kt7 abstractC44175kt7) {
        while (abstractC44175kt7 instanceof C34617Mv7) {
            C34617Mv7 c34617Mv7 = (C34617Mv7) abstractC44175kt7;
            this.f22280b.push(c34617Mv7);
            abstractC44175kt7 = c34617Mv7.f23823g;
        }
        return (AbstractC42396ht7) abstractC44175kt7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22281c != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
