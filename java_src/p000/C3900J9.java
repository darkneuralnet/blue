package p000;

import java.util.Collection;
/* renamed from: J9 */
/* loaded from: classes6.dex */
public class C3900J9 {
    private C3900J9() {
    }

    /* renamed from: a */
    public static String m101095a(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                if (i < array.length - 1) {
                    sb.append(", ");
                } else if (i == array.length - 1) {
                    sb.append(" or ");
                }
            }
            sb.append(array[i].toString());
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m101094b(C36312Uc1 c36312Uc1, Collection<C36312Uc1> collection) {
        return "Unsupported JWE encryption method " + c36312Uc1 + ", must be " + m101095a(collection);
    }

    /* renamed from: c */
    public static String m101093c(C37051Xg2 c37051Xg2, Collection<C37051Xg2> collection) {
        return "Unsupported JWE algorithm " + c37051Xg2 + ", must be " + m101095a(collection);
    }

    /* renamed from: d */
    public static String m101092d(C42271hh2 c42271hh2, Collection<C42271hh2> collection) {
        return "Unsupported JWS algorithm " + c42271hh2 + ", must be " + m101095a(collection);
    }
}
