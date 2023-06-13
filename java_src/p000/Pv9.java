package p000;

import java.io.IOException;
import java.io.StringWriter;
/* renamed from: Pv9 */
/* loaded from: classes5.dex */
public class Pv9 {
    /* renamed from: a */
    public final Uv9 m89367a() {
        if (this instanceof Uv9) {
            return (Uv9) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            Xx9 xx9 = new Xx9(stringWriter);
            xx9.m76011m(true);
            Tx9.f36524U.mo29591b(xx9, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
