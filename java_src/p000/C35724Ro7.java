package p000;

import java.util.Iterator;
/* renamed from: Ro7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35724Ro7 implements Iterator {

    /* renamed from: b */
    public final /* synthetic */ Iterator f32635b;

    public C35724Ro7(Iterator it) {
        this.f32635b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32635b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C43019iw7((String) this.f32635b.next());
    }
}
