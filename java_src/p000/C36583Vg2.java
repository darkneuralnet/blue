package p000;

import java.io.IOException;
/* renamed from: Vg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36583Vg2 {

    /* renamed from: a */
    public static C36115Tg2 f39455a = C36115Tg2.f35852h;

    /* renamed from: b */
    public static final C32164Cj2 f39456b = new C32164Cj2();

    /* renamed from: c */
    public static final C40512ej2 f39457c = new C40512ej2();

    /* renamed from: a */
    public static void m79577a(String str, Appendable appendable, C36115Tg2 c36115Tg2) {
        if (str == null) {
            return;
        }
        c36115Tg2.m83197f(str, appendable);
    }

    /* renamed from: b */
    public static void m79576b(Object obj, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
        if (obj == null) {
            appendable.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        C32164Cj2 c32164Cj2 = f39456b;
        InterfaceC32632Ej2<Object> m111792a = c32164Cj2.m111792a(cls);
        if (m111792a == null) {
            if (cls.isArray()) {
                m111792a = C32164Cj2.f4560l;
            } else {
                m111792a = c32164Cj2.m111791b(obj.getClass());
                if (m111792a == null) {
                    m111792a = C32164Cj2.f4558j;
                }
            }
            c32164Cj2.m111789d(m111792a, cls);
        }
        m111792a.mo420a(obj, appendable, c36115Tg2);
    }
}
