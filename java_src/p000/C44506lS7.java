package p000;

import java.util.Iterator;
/* renamed from: lS7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44506lS7 extends FM7 {

    /* renamed from: d */
    public final transient AbstractC46231oM7 f96221d;

    /* renamed from: e */
    public final transient HL7 f96222e;

    public C44506lS7(AbstractC46231oM7 abstractC46231oM7, HL7 hl7) {
        this.f96221d = abstractC46231oM7;
        this.f96222e = hl7;
    }

    @Override // p000.BJ7
    /* renamed from: a */
    public final int mo15942a(Object[] objArr, int i) {
        return this.f96222e.mo15942a(objArr, 0);
    }

    @Override // p000.BJ7, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f96221d.get(obj) != null;
    }

    @Override // p000.FM7, p000.BJ7
    /* renamed from: e */
    public final ST7 mo27266e() {
        return this.f96222e.listIterator(0);
    }

    @Override // p000.FM7, p000.BJ7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f96222e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f96221d.size();
    }
}
