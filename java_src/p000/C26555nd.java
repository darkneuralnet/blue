package p000;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import kotlin.Metadata;
import p000.C41185fr2;
import p000.C47801r06;
import p000.UN1;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0017\u001a\u00020\u0002*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u001a\f\u0010\u001e\u001a\u00020\u001d*\u00020\u001dH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, m28432d2 = {"Lr06;", "align", "", "l", "(Lr06;)I", "LUN1;", "hyphens", "n", "(LUN1;)I", "Lfr2$b;", "breakStrategy", "m", "(Lfr2$b;)I", "Lfr2$c;", "lineBreakStrictness", "o", "(Lfr2$c;)I", "Lfr2$d;", "lineBreakWordStyle", "p", "(Lfr2$d;)I", "Le26;", "maxHeight", "j", "LG26;", "textStyle", "", "ellipsis", "k", "", "i", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: nd */
/* loaded from: classes.dex */
public final class C26555nd {
    /* renamed from: a */
    public static final /* synthetic */ CharSequence m23426a(CharSequence charSequence) {
        return m23418i(charSequence);
    }

    /* renamed from: b */
    public static final /* synthetic */ int m23425b(C40112e26 c40112e26, int i) {
        return m23417j(c40112e26, i);
    }

    /* renamed from: c */
    public static final /* synthetic */ boolean m23424c(G26 g26, boolean z) {
        return m23416k(g26, z);
    }

    /* renamed from: d */
    public static final /* synthetic */ int m23423d(C47801r06 c47801r06) {
        return m23415l(c47801r06);
    }

    /* renamed from: e */
    public static final /* synthetic */ int m23422e(C41185fr2.C20554b c20554b) {
        return m23414m(c20554b);
    }

    /* renamed from: f */
    public static final /* synthetic */ int m23421f(UN1 un1) {
        return m23413n(un1);
    }

    /* renamed from: g */
    public static final /* synthetic */ int m23420g(C41185fr2.C20556c c20556c) {
        return m23412o(c20556c);
    }

    /* renamed from: h */
    public static final /* synthetic */ int m23419h(C41185fr2.C20558d c20558d) {
        return m23411p(c20558d);
    }

    /* renamed from: i */
    public static final CharSequence m23418i(CharSequence charSequence) {
        boolean z;
        Spannable spannableString;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        JN5.m100570t(spannableString, new C44842m12(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* renamed from: j */
    public static final int m23417j(C40112e26 c40112e26, int i) {
        int m43336k = c40112e26.m43336k();
        for (int i2 = 0; i2 < m43336k; i2++) {
            if (c40112e26.m43337j(i2) > i) {
                return i2;
            }
        }
        return c40112e26.m43336k();
    }

    /* renamed from: k */
    public static final boolean m23416k(G26 g26, boolean z) {
        boolean m16682j;
        boolean m16682j2;
        if (!z || M26.m95975e(g26.m105906s(), N26.m94414f(0)) || M26.m95975e(g26.m105906s(), M26.f22473b.m95968a()) || g26.m105935B() == null) {
            return false;
        }
        C47801r06 m105935B = g26.m105935B();
        C47801r06.C27748a c27748a = C47801r06.f106195b;
        int m16673f = c27748a.m16673f();
        if (m105935B == null) {
            m16682j = false;
        } else {
            m16682j = C47801r06.m16682j(m105935B.m16679m(), m16673f);
        }
        if (m16682j) {
            return false;
        }
        C47801r06 m105935B2 = g26.m105935B();
        int m16676c = c27748a.m16676c();
        if (m105935B2 == null) {
            m16682j2 = false;
        } else {
            m16682j2 = C47801r06.m16682j(m105935B2.m16679m(), m16676c);
        }
        if (m16682j2) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static final int m23415l(C47801r06 c47801r06) {
        boolean m16682j;
        boolean m16682j2;
        boolean m16682j3;
        boolean m16682j4;
        boolean m16682j5;
        C47801r06.C27748a c27748a = C47801r06.f106195b;
        int m16675d = c27748a.m16675d();
        if (c47801r06 == null) {
            m16682j = false;
        } else {
            m16682j = C47801r06.m16682j(c47801r06.m16679m(), m16675d);
        }
        if (m16682j) {
            return 3;
        }
        int m16674e = c27748a.m16674e();
        if (c47801r06 == null) {
            m16682j2 = false;
        } else {
            m16682j2 = C47801r06.m16682j(c47801r06.m16679m(), m16674e);
        }
        if (m16682j2) {
            return 4;
        }
        int m16678a = c27748a.m16678a();
        if (c47801r06 == null) {
            m16682j3 = false;
        } else {
            m16682j3 = C47801r06.m16682j(c47801r06.m16679m(), m16678a);
        }
        if (m16682j3) {
            return 2;
        }
        int m16673f = c27748a.m16673f();
        if (c47801r06 == null) {
            m16682j4 = false;
        } else {
            m16682j4 = C47801r06.m16682j(c47801r06.m16679m(), m16673f);
        }
        if (m16682j4) {
            return 0;
        }
        int m16677b = c27748a.m16677b();
        if (c47801r06 == null) {
            m16682j5 = false;
        } else {
            m16682j5 = C47801r06.m16682j(c47801r06.m16679m(), m16677b);
        }
        if (!m16682j5) {
            return 0;
        }
        return 1;
    }

    /* renamed from: m */
    public static final int m23414m(C41185fr2.C20554b c20554b) {
        boolean m40734g;
        boolean m40734g2;
        boolean m40734g3;
        C41185fr2.C20554b.C20555a c20555a = C41185fr2.C20554b.f80844b;
        int m40728c = c20555a.m40728c();
        if (c20554b == null) {
            m40734g = false;
        } else {
            m40734g = C41185fr2.C20554b.m40734g(c20554b.m40731j(), m40728c);
        }
        if (m40734g) {
            return 0;
        }
        int m40729b = c20555a.m40729b();
        if (c20554b == null) {
            m40734g2 = false;
        } else {
            m40734g2 = C41185fr2.C20554b.m40734g(c20554b.m40731j(), m40729b);
        }
        if (m40734g2) {
            return 1;
        }
        int m40730a = c20555a.m40730a();
        if (c20554b == null) {
            m40734g3 = false;
        } else {
            m40734g3 = C41185fr2.C20554b.m40734g(c20554b.m40731j(), m40730a);
        }
        if (!m40734g3) {
            return 0;
        }
        return 2;
    }

    /* renamed from: n */
    public static final int m23413n(UN1 un1) {
        boolean m81578f;
        UN1.C8270a c8270a = UN1.f37309b;
        int m81574a = c8270a.m81574a();
        if (un1 == null) {
            m81578f = false;
        } else {
            m81578f = UN1.m81578f(un1.m81575i(), m81574a);
        }
        if (m81578f) {
            if (Build.VERSION.SDK_INT <= 32) {
                return 1;
            }
            return 3;
        }
        int m81573b = c8270a.m81573b();
        if (un1 == null) {
            return 0;
        }
        UN1.m81578f(un1.m81575i(), m81573b);
        return 0;
    }

    /* renamed from: o */
    public static final int m23412o(C41185fr2.C20556c c20556c) {
        boolean m40720h;
        boolean m40720h2;
        boolean m40720h3;
        boolean m40720h4;
        C41185fr2.C20556c.C20557a c20557a = C41185fr2.C20556c.f80849b;
        int m40716a = c20557a.m40716a();
        if (c20556c == null) {
            m40720h = false;
        } else {
            m40720h = C41185fr2.C20556c.m40720h(c20556c.m40717k(), m40716a);
        }
        if (m40720h) {
            return 0;
        }
        int m40715b = c20557a.m40715b();
        if (c20556c == null) {
            m40720h2 = false;
        } else {
            m40720h2 = C41185fr2.C20556c.m40720h(c20556c.m40717k(), m40715b);
        }
        if (m40720h2) {
            return 1;
        }
        int m40714c = c20557a.m40714c();
        if (c20556c == null) {
            m40720h3 = false;
        } else {
            m40720h3 = C41185fr2.C20556c.m40720h(c20556c.m40717k(), m40714c);
        }
        if (m40720h3) {
            return 2;
        }
        int m40713d = c20557a.m40713d();
        if (c20556c == null) {
            m40720h4 = false;
        } else {
            m40720h4 = C41185fr2.C20556c.m40720h(c20556c.m40717k(), m40713d);
        }
        if (!m40720h4) {
            return 0;
        }
        return 3;
    }

    /* renamed from: p */
    public static final int m23411p(C41185fr2.C20558d c20558d) {
        boolean m40707f;
        boolean m40707f2;
        C41185fr2.C20558d.C20559a c20559a = C41185fr2.C20558d.f80855b;
        int m40703a = c20559a.m40703a();
        if (c20558d == null) {
            m40707f = false;
        } else {
            m40707f = C41185fr2.C20558d.m40707f(c20558d.m40704i(), m40703a);
        }
        if (m40707f) {
            return 0;
        }
        int m40702b = c20559a.m40702b();
        if (c20558d == null) {
            m40707f2 = false;
        } else {
            m40707f2 = C41185fr2.C20558d.m40707f(c20558d.m40704i(), m40702b);
        }
        if (!m40707f2) {
            return 0;
        }
        return 1;
    }
}
