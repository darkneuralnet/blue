package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: Zw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37668Zw7 extends PT7 {

    /* renamed from: b */
    public final /* synthetic */ C32772Ey7 f49505b;

    public C37668Zw7(C32772Ey7 c32772Ey7) {
        this.f49505b = c32772Ey7;
    }

    @Override // p000.PT7
    /* renamed from: a */
    public final Map mo72287a() {
        return this.f49505b;
    }

    @Override // p000.PT7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f49505b.f8388e.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C35103Ox7(this.f49505b);
    }

    @Override // p000.PT7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        AbstractC42619iG7.m34266m(this.f49505b.f8389f, entry.getKey());
        return true;
    }
}
