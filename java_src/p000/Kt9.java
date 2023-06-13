package p000;

import java.io.IOException;
import java.util.Iterator;
/* renamed from: Kt9 */
/* loaded from: classes5.dex */
public final class Kt9 {

    /* renamed from: a */
    public final String f20329a = "\n";

    public Kt9(String str) {
    }

    /* renamed from: a */
    public static Kt9 m98197a(String str) {
        return new Kt9("\n");
    }

    /* renamed from: c */
    public static final CharSequence m98195c(Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    /* renamed from: b */
    public final String m98196b(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb.append(m98195c(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f20329a);
                    sb.append(m98195c(it.next()));
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
