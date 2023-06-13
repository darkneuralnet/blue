package p000;

import java.io.IOException;
import java.util.Iterator;
/* renamed from: G57 */
/* loaded from: classes5.dex */
public final class G57 {

    /* renamed from: a */
    public final String f10902a = "\n";

    public G57(String str) {
    }

    /* renamed from: a */
    public static G57 m105821a(String str) {
        return new G57("\n");
    }

    /* renamed from: c */
    public static final CharSequence m105819c(Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    /* renamed from: b */
    public final String m105820b(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb.append(m105819c(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f10902a);
                    sb.append(m105819c(it.next()));
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
