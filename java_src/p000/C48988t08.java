package p000;

import java.util.Iterator;
/* renamed from: t08  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48988t08 extends C37725a28 {

    /* renamed from: c */
    public final /* synthetic */ ZY7 f109685c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48988t08(ZY7 zy7) {
        super(zy7, null);
        this.f109685c = zy7;
    }

    @Override // p000.C37725a28, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new CZ7(this.f109685c, null);
    }

    public /* synthetic */ C48988t08(ZY7 zy7, QZ7 qz7) {
        this(zy7);
    }
}
