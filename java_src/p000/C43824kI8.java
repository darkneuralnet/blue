package p000;

import java.io.IOException;
import java.util.Iterator;
/* renamed from: kI8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43824kI8 {
    /* renamed from: a */
    public static final CharSequence m29082a(Object obj, String str) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    /* renamed from: b */
    public static final StringBuilder m29081b(StringBuilder sb, Iterator<? extends Object> it, String str) {
        try {
            if (it.hasNext()) {
                sb.append(m29082a(it.next(), str));
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    sb.append(m29082a(it.next(), str));
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
