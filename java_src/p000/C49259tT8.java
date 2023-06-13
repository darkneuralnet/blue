package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: tT8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49259tT8 extends GE7 {

    /* renamed from: b */
    public final /* synthetic */ I49 f110536b;

    public C49259tT8(I49 i49) {
        this.f110536b = i49;
    }

    @Override // p000.GE7
    /* renamed from: a */
    public final Map mo12292a() {
        return this.f110536b;
    }

    @Override // p000.GE7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f110536b.f14460e.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C42198hZ8(this.f110536b);
    }

    @Override // p000.GE7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        Jt9.m99581o(this.f110536b.f14461f, entry.getKey());
        return true;
    }
}
