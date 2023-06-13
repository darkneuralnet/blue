package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: O57 */
/* loaded from: classes5.dex */
public final class O57 {

    /* renamed from: a */
    public final D57 f25635a;

    /* renamed from: b */
    public final M57 f25636b;

    public O57(M57 m57) {
        C57 c57 = C57.f3387b;
        this.f25636b = m57;
        this.f25635a = c57;
    }

    /* renamed from: b */
    public static O57 m92919b(String str) {
        return new O57(new M57("#vk "));
    }

    /* renamed from: c */
    public final List m92918c(CharSequence charSequence) {
        charSequence.getClass();
        L57 l57 = new L57(this.f25636b, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (l57.hasNext()) {
            arrayList.add((String) l57.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
