package p000;

import org.jspecify.nullness.NullMarked;
@NullMarked
/* renamed from: Rh9 */
/* loaded from: classes5.dex */
public final class Rh9 {
    /* renamed from: a */
    public static final CharSequence m86436a(Object obj, String str) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }
}
