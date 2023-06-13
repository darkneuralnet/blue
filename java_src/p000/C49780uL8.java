package p000;

import java.util.Iterator;
/* renamed from: uL8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49780uL8 implements Iterable<String> {

    /* renamed from: b */
    public final /* synthetic */ CharSequence f112235b;

    /* renamed from: c */
    public final /* synthetic */ SL8 f112236c;

    public C49780uL8(SL8 sl8, CharSequence charSequence) {
        this.f112236c = sl8;
        this.f112235b = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return SL8.m85704e(this.f112236c, this.f112235b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        C43824kI8.m29081b(sb, iterator(), ", ");
        sb.append(']');
        return sb.toString();
    }
}
