package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.nullness.NullMarked;
@NullMarked
/* renamed from: Cw9 */
/* loaded from: classes5.dex */
public final class Cw9 {

    /* renamed from: a */
    public final A99 f4953a;

    /* renamed from: b */
    public final boolean f4954b;

    /* renamed from: c */
    public final C50688vs9 f4955c;

    public Cw9(C50688vs9 c50688vs9, boolean z, A99 a99, int i, byte[] bArr) {
        this.f4955c = c50688vs9;
        this.f4954b = z;
        this.f4953a = a99;
    }

    /* renamed from: c */
    public static Cw9 m111220c(A99 a99) {
        return new Cw9(new C50688vs9(a99), false, C39553d59.f76115b, Integer.MAX_VALUE, null);
    }

    /* renamed from: b */
    public final Cw9 m111221b() {
        return new Cw9(this.f4955c, true, this.f4953a, Integer.MAX_VALUE, null);
    }

    /* renamed from: d */
    public final Iterable m111219d(CharSequence charSequence) {
        return new C38240au9(this, charSequence);
    }

    /* renamed from: f */
    public final List m111217f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator m111215h = m111215h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (m111215h.hasNext()) {
            arrayList.add((String) m111215h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: h */
    public final Iterator m111215h(CharSequence charSequence) {
        return new Tq9(this.f4955c, this, charSequence);
    }
}
