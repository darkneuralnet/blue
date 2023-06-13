package p000;

import java.util.Iterator;
/* renamed from: MV8 */
/* loaded from: classes6.dex */
public final class MV8 extends XW8 {

    /* renamed from: c */
    public final /* synthetic */ BV8 f23177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MV8(BV8 bv8) {
        super(bv8, null);
        this.f23177c = bv8;
    }

    @Override // p000.XW8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new WV8(this.f23177c, null);
    }

    public /* synthetic */ MV8(BV8 bv8, C47499qV8 c47499qV8) {
        this(bv8);
    }
}
