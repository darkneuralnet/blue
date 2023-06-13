package p000;

import java.util.Iterator;
/* renamed from: na8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45765na8 extends C36310Ub8 {

    /* renamed from: c */
    public final /* synthetic */ C48485s98 f100163c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45765na8(C48485s98 c48485s98) {
        super(c48485s98, null);
        this.f100163c = c48485s98;
    }

    @Override // p000.C36310Ub8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new X98(this.f100163c, null);
    }

    public /* synthetic */ C45765na8(C48485s98 c48485s98, H98 h98) {
        this(c48485s98);
    }
}
