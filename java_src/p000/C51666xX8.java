package p000;

import java.util.Iterator;
/* renamed from: xX8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51666xX8 extends AbstractC45127mV8 {

    /* renamed from: d */
    public final transient Object f117784d;

    public C51666xX8(Object obj) {
        obj.getClass();
        this.f117784d = obj;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: a */
    public final int mo5039a(Object[] objArr, int i) {
        objArr[0] = this.f117784d;
        return 1;
    }

    @Override // p000.AbstractC37976aT8, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f117784d.equals(obj);
    }

    @Override // p000.AbstractC45127mV8, p000.AbstractC37976aT8
    /* renamed from: e */
    public final HX8 mo5038e() {
        return new C51648xV8(this.f117784d);
    }

    @Override // p000.AbstractC45127mV8, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f117784d.hashCode();
    }

    @Override // p000.AbstractC45127mV8, p000.AbstractC37976aT8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C51648xV8(this.f117784d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f117784d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
