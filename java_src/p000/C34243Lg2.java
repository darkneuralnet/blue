package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: Lg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34243Lg2 extends HashMap<String, Object> implements InterfaceC34009Kg2, InterfaceC35881Sg2 {
    private static final long serialVersionUID = -503443796854799292L;

    /* renamed from: d */
    public static String m96488d(Map<String, ? extends Object> map) {
        return m96486g(map, C36583Vg2.f39455a);
    }

    /* renamed from: g */
    public static String m96486g(Map<String, ? extends Object> map, C36115Tg2 c36115Tg2) {
        StringBuilder sb = new StringBuilder();
        try {
            m96484k(map, sb, c36115Tg2);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static void m96484k(Map<String, ? extends Object> map, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
        if (map == null) {
            appendable.append("null");
        } else {
            C32164Cj2.f4557i.mo420a(map, appendable, c36115Tg2);
        }
    }

    /* renamed from: l */
    public static void m96483l(String str, Object obj, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
        if (str == null) {
            appendable.append("null");
        } else if (!c36115Tg2.m83195h(str)) {
            appendable.append(str);
        } else {
            appendable.append('\"');
            C36583Vg2.m79577a(str, appendable, c36115Tg2);
            appendable.append('\"');
        }
        appendable.append(CoreConstants.COLON_CHAR);
        if (obj instanceof String) {
            c36115Tg2.m83187p(appendable, (String) obj);
        } else {
            C36583Vg2.m79576b(obj, appendable, c36115Tg2);
        }
    }

    @Override // p000.InterfaceC35647Rg2
    /* renamed from: e */
    public void mo86451e(Appendable appendable) throws IOException {
        m96484k(this, appendable, C36583Vg2.f39455a);
    }

    @Override // p000.InterfaceC33775Jg2
    /* renamed from: f */
    public String mo96487f() {
        return m96486g(this, C36583Vg2.f39455a);
    }

    @Override // p000.InterfaceC35881Sg2
    /* renamed from: h */
    public void mo85140h(Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
        m96484k(this, appendable, c36115Tg2);
    }

    @Override // p000.InterfaceC34009Kg2
    /* renamed from: j */
    public String mo96485j(C36115Tg2 c36115Tg2) {
        return m96486g(this, c36115Tg2);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return m96486g(this, C36583Vg2.f39455a);
    }
}
