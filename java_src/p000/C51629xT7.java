package p000;

import java.io.IOException;
import java.io.StringWriter;
/* renamed from: xT7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C51629xT7 {
    /* renamed from: a */
    public final C43931kU7 m5236a() {
        if (this instanceof C43931kU7) {
            return (C43931kU7) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C31630Ab8 c31630Ab8 = new C31630Ab8(stringWriter);
            c31630Ab8.m115459m(true);
            C50507va8.f114324U.mo7459b(c31630Ab8, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
