package p000;

import java.util.Iterator;
import kotlin.text.Typography;
/* renamed from: zA */
/* loaded from: classes8.dex */
public abstract class AbstractC30923zA implements InterfaceC50759w01 {
    @Override // p000.InterfaceC50759w01
    /* renamed from: a */
    public InterfaceC50759w01 mo1736a(String str) {
        mo1732e(str);
        return this;
    }

    @Override // p000.InterfaceC50759w01
    /* renamed from: b */
    public InterfaceC50759w01 mo1735b(Object obj) {
        if (obj == null) {
            mo1732e("null");
        } else if (obj instanceof String) {
            m1727j((String) obj);
        } else if (obj instanceof Character) {
            mo1733d('\"');
            m1728i(((Character) obj).charValue());
            mo1733d('\"');
        } else if (obj instanceof Short) {
            mo1733d(Typography.less);
            mo1732e(m1729h(obj));
            mo1732e("s>");
        } else if (obj instanceof Long) {
            mo1733d(Typography.less);
            mo1732e(m1729h(obj));
            mo1732e("L>");
        } else if (obj instanceof Float) {
            mo1733d(Typography.less);
            mo1732e(m1729h(obj));
            mo1732e("F>");
        } else if (obj.getClass().isArray()) {
            m1730g("[", ", ", "]", new C27063oo(obj));
        } else {
            mo1733d(Typography.less);
            mo1732e(m1729h(obj));
            mo1733d(Typography.greater);
        }
        return this;
    }

    @Override // p000.InterfaceC50759w01
    /* renamed from: c */
    public InterfaceC50759w01 mo1734c(InterfaceC37153Xr5 interfaceC37153Xr5) {
        interfaceC37153Xr5.mo20420a(this);
        return this;
    }

    /* renamed from: d */
    public abstract void mo1733d(char c);

    /* renamed from: e */
    public void mo1732e(String str) {
        for (int i = 0; i < str.length(); i++) {
            mo1733d(str.charAt(i));
        }
    }

    /* renamed from: f */
    public final InterfaceC50759w01 m1731f(String str, String str2, String str3, Iterator<? extends InterfaceC37153Xr5> it) {
        mo1732e(str);
        boolean z = false;
        while (it.hasNext()) {
            if (z) {
                mo1732e(str2);
            }
            mo1734c(it.next());
            z = true;
        }
        mo1732e(str3);
        return this;
    }

    /* renamed from: g */
    public final <T> InterfaceC50759w01 m1730g(String str, String str2, String str3, Iterator<T> it) {
        return m1731f(str, str2, str3, new C37621Zr5(it));
    }

    /* renamed from: h */
    public final String m1729h(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    /* renamed from: i */
    public final void m1728i(char c) {
        if (c != '\t') {
            if (c != '\n') {
                if (c != '\r') {
                    if (c != '\"') {
                        mo1733d(c);
                        return;
                    } else {
                        mo1732e("\\\"");
                        return;
                    }
                }
                mo1732e("\\r");
                return;
            }
            mo1732e("\\n");
            return;
        }
        mo1732e("\\t");
    }

    /* renamed from: j */
    public final void m1727j(String str) {
        mo1733d('\"');
        for (int i = 0; i < str.length(); i++) {
            m1728i(str.charAt(i));
        }
        mo1733d('\"');
    }
}
