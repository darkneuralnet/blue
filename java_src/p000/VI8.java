package p000;

import java.util.Iterator;
/* renamed from: VI8 */
/* loaded from: classes5.dex */
public final class VI8 extends NH8 {

    /* renamed from: d */
    public final transient Object f38864d;

    public VI8(Object obj) {
        obj.getClass();
        this.f38864d = obj;
    }

    @Override // p000.ZF8
    /* renamed from: a */
    public final int mo5562a(Object[] objArr, int i) {
        objArr[0] = this.f38864d;
        return 1;
    }

    @Override // p000.ZF8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f38864d.equals(obj);
    }

    @Override // p000.NH8, p000.ZF8
    /* renamed from: e */
    public final AbstractC42054hJ8 mo73473e() {
        return new ZH8(this.f38864d);
    }

    @Override // p000.NH8, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f38864d.hashCode();
    }

    @Override // p000.NH8, p000.ZF8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return new ZH8(this.f38864d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f38864d.toString();
        return "[" + obj + "]";
    }
}
