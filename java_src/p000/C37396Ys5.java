package p000;

import java.io.Serializable;
/* renamed from: Ys5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37396Ys5 implements Serializable {

    /* renamed from: b */
    public final String f47584b;

    public C37396Ys5(Object obj) {
        this.f47584b = String.valueOf(obj);
    }

    /* renamed from: a */
    public static Object m74045a(Object obj) {
        if (obj != null && !(obj instanceof Serializable)) {
            return new C37396Ys5(obj);
        }
        return obj;
    }

    public String toString() {
        return this.f47584b;
    }
}
