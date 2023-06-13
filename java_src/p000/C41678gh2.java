package p000;

import java.net.URI;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: gh2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41678gh2 {
    /* renamed from: a */
    public static C1744E9 m37903a(Map<String, Object> map) throws ParseException {
        return C1744E9.m109343a(C34477Mg2.m95060h(map, "alg"));
    }

    /* renamed from: b */
    public static String m37902b(Map<String, Object> map) throws ParseException {
        return C34477Mg2.m95060h(map, "kid");
    }

    /* renamed from: c */
    public static Set<EnumC52380yk2> m37901c(Map<String, Object> map) throws ParseException {
        return EnumC52380yk2.m2707b(C34477Mg2.m95058j(map, "key_ops"));
    }

    /* renamed from: d */
    public static C34981Ok2 m37900d(Map<String, Object> map) throws ParseException {
        try {
            return C34981Ok2.m91590b(C34477Mg2.m95060h(map, "kty"));
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    /* renamed from: e */
    public static C35683Rk2 m37899e(Map<String, Object> map) throws ParseException {
        return C35683Rk2.m86402b(C34477Mg2.m95060h(map, "use"));
    }

    /* renamed from: f */
    public static List<C2990Gy> m37898f(Map<String, Object> map) throws ParseException {
        List<C2990Gy> m16113b = C47964rH6.m16113b(C34477Mg2.m95063e(map, "x5c"));
        if (m16113b != null && m16113b.isEmpty()) {
            return null;
        }
        return m16113b;
    }

    /* renamed from: g */
    public static C3824Iy m37897g(Map<String, Object> map) throws ParseException {
        return C34477Mg2.m95067a(map, "x5t#S256");
    }

    /* renamed from: h */
    public static C3824Iy m37896h(Map<String, Object> map) throws ParseException {
        return C34477Mg2.m95067a(map, "x5t");
    }

    /* renamed from: i */
    public static URI m37895i(Map<String, Object> map) throws ParseException {
        return C34477Mg2.m95057k(map, "x5u");
    }
}
