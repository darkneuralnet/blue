package p000;

import java.io.Serializable;
/* renamed from: RE8 */
/* loaded from: classes5.dex */
public final class RE8 {
    /* renamed from: a */
    public static LD8 m87007a(LD8 ld8) {
        if (!(ld8 instanceof C49124tE8) && !(ld8 instanceof XD8)) {
            if (ld8 instanceof Serializable) {
                return new XD8(ld8);
            }
            return new C49124tE8(ld8);
        }
        return ld8;
    }

    /* renamed from: b */
    public static LD8 m87006b(Object obj) {
        return new GE8(obj);
    }
}
