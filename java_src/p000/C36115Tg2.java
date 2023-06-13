package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import p000.C36817Wg2;
/* renamed from: Tg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36115Tg2 {

    /* renamed from: h */
    public static final C36115Tg2 f35852h = new C36115Tg2(0);

    /* renamed from: i */
    public static final C36115Tg2 f35853i = new C36115Tg2(-1);

    /* renamed from: j */
    public static final C36115Tg2 f35854j = new C36115Tg2(2);

    /* renamed from: a */
    public boolean f35855a;

    /* renamed from: b */
    public boolean f35856b;

    /* renamed from: c */
    public boolean f35857c;

    /* renamed from: d */
    public boolean f35858d;

    /* renamed from: e */
    public C36817Wg2.InterfaceC9145g f35859e;

    /* renamed from: f */
    public C36817Wg2.InterfaceC9145g f35860f;

    /* renamed from: g */
    public C36817Wg2.InterfaceC9146h f35861g;

    public C36115Tg2(int i) {
        C36817Wg2.InterfaceC9145g interfaceC9145g;
        boolean z = (i & 1) == 0;
        this.f35855a = z;
        boolean z2 = (i & 4) == 0;
        this.f35857c = z2;
        boolean z3 = (i & 2) == 0;
        this.f35856b = z3;
        this.f35858d = (i & 16) > 0;
        if ((i & 8) > 0) {
            interfaceC9145g = C36817Wg2.f41491c;
        } else {
            interfaceC9145g = C36817Wg2.f41489a;
        }
        if (z2) {
            this.f35860f = C36817Wg2.f41490b;
        } else {
            this.f35860f = interfaceC9145g;
        }
        if (z) {
            this.f35859e = C36817Wg2.f41490b;
        } else {
            this.f35859e = interfaceC9145g;
        }
        if (z3) {
            this.f35861g = C36817Wg2.f41493e;
        } else {
            this.f35861g = C36817Wg2.f41492d;
        }
    }

    /* renamed from: a */
    public void m83202a(Appendable appendable) throws IOException {
        appendable.append(CoreConstants.COMMA_CHAR);
    }

    /* renamed from: b */
    public void m83201b(Appendable appendable) throws IOException {
    }

    /* renamed from: c */
    public void m83200c(Appendable appendable) throws IOException {
        appendable.append('[');
    }

    /* renamed from: d */
    public void m83199d(Appendable appendable) throws IOException {
        appendable.append(']');
    }

    /* renamed from: e */
    public void m83198e(Appendable appendable) throws IOException {
    }

    /* renamed from: f */
    public void m83197f(String str, Appendable appendable) {
        this.f35861g.mo78010a(str, appendable);
    }

    /* renamed from: g */
    public boolean m83196g() {
        return this.f35858d;
    }

    /* renamed from: h */
    public boolean m83195h(String str) {
        return this.f35859e.mo78011a(str);
    }

    /* renamed from: i */
    public boolean m83194i(String str) {
        return this.f35860f.mo78011a(str);
    }

    /* renamed from: j */
    public void m83193j(Appendable appendable) throws IOException {
    }

    /* renamed from: k */
    public void m83192k(Appendable appendable) throws IOException {
        appendable.append(CoreConstants.COLON_CHAR);
    }

    /* renamed from: l */
    public void m83191l(Appendable appendable) throws IOException {
    }

    /* renamed from: m */
    public void m83190m(Appendable appendable) throws IOException {
        appendable.append(CoreConstants.COMMA_CHAR);
    }

    /* renamed from: n */
    public void m83189n(Appendable appendable) throws IOException {
        appendable.append(CoreConstants.CURLY_LEFT);
    }

    /* renamed from: o */
    public void m83188o(Appendable appendable) throws IOException {
        appendable.append(CoreConstants.CURLY_RIGHT);
    }

    /* renamed from: p */
    public void m83187p(Appendable appendable, String str) throws IOException {
        if (!m83194i(str)) {
            appendable.append(str);
            return;
        }
        appendable.append('\"');
        C36583Vg2.m79577a(str, appendable, this);
        appendable.append('\"');
    }

    public C36115Tg2() {
        this(0);
    }
}
