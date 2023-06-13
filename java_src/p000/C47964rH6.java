package p000;

import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
/* renamed from: rH6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47964rH6 {
    private C47964rH6() {
    }

    /* renamed from: a */
    public static List<X509Certificate> m16114a(List<C2990Gy> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                X509Certificate m14485a = C48556sH6.m14485a(list.get(i).m104549a());
                if (m14485a != null) {
                    linkedList.add(m14485a);
                } else {
                    throw new ParseException("Invalid X.509 certificate at position " + i, 0);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: b */
    public static List<C2990Gy> m16113b(List<Object> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj != null) {
                if (obj instanceof String) {
                    linkedList.add(new C2990Gy((String) obj));
                } else {
                    throw new ParseException("The X.509 certificate at position " + i + " must be encoded as a Base64 string", 0);
                }
            } else {
                throw new ParseException("The X.509 certificate at position " + i + " must not be null", 0);
            }
        }
        return linkedList;
    }
}
