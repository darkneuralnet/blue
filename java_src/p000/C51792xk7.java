package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: xk7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51792xk7 extends AbstractC41505gO7 {

    /* renamed from: b */
    public final /* synthetic */ C36399Ul7 f118047b;

    public C51792xk7(C36399Ul7 c36399Ul7) {
        this.f118047b = c36399Ul7;
    }

    @Override // p000.AbstractC41505gO7
    /* renamed from: a */
    public final Map mo4751a() {
        return this.f118047b;
    }

    @Override // p000.AbstractC41505gO7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f118047b.f37957e.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C48838sl7(this.f118047b);
    }

    @Override // p000.AbstractC41505gO7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        AbstractC38821bt7.m62185o(this.f118047b.f37958f, entry.getKey());
        return true;
    }
}
