package p000;

import java.util.Iterator;
/* renamed from: UY5 */
/* loaded from: classes.dex */
public final /* synthetic */ class UY5 {
    /* renamed from: a */
    public static /* synthetic */ String m81348a(CharSequence charSequence, Iterable iterable) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(charSequence);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException("delimiter");
    }
}
