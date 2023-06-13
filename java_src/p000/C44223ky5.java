package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC34649Mz3;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000\u001a \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u001a4\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\f\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0002\u001a=\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a4\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"LMz3;", "outline", "", "x", "y", "LcJ3;", "tmpTouchPointPath", "tmpOpPath", "", "b", "LOs4;", "rect", DateTokenConverter.CONVERTER_KEY, "LMz3$c;", "touchPointPath", "opPath", "e", "LWb5;", C17296a.f69688o, "LLC0;", "cornerRadius", "centerX", "centerY", "f", "(FFJFF)Z", "path", "c", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ky5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44223ky5 {
    /* renamed from: a */
    public static final boolean m28083a(C36775Wb5 c36775Wb5) {
        if (LC0.m97601d(c36775Wb5.m78152h()) + LC0.m97601d(c36775Wb5.m78151i()) <= c36775Wb5.m78150j() && LC0.m97601d(c36775Wb5.m78158b()) + LC0.m97601d(c36775Wb5.m78157c()) <= c36775Wb5.m78150j() && LC0.m97600e(c36775Wb5.m78152h()) + LC0.m97600e(c36775Wb5.m78158b()) <= c36775Wb5.m78156d() && LC0.m97600e(c36775Wb5.m78151i()) + LC0.m97600e(c36775Wb5.m78157c()) <= c36775Wb5.m78156d()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m28082b(AbstractC34649Mz3 outline, float f, float f2, InterfaceC39067cJ3 interfaceC39067cJ3, InterfaceC39067cJ3 interfaceC39067cJ32) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (outline instanceof AbstractC34649Mz3.C5446b) {
            return m28080d(((AbstractC34649Mz3.C5446b) outline).m94527a(), f, f2);
        }
        if (outline instanceof AbstractC34649Mz3.C5447c) {
            return m28079e((AbstractC34649Mz3.C5447c) outline, f, f2, interfaceC39067cJ3, interfaceC39067cJ32);
        }
        if (outline instanceof AbstractC34649Mz3.C5445a) {
            return m28081c(((AbstractC34649Mz3.C5445a) outline).m94528a(), f, f2, interfaceC39067cJ3, interfaceC39067cJ32);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public static final boolean m28081c(InterfaceC39067cJ3 interfaceC39067cJ3, float f, float f2, InterfaceC39067cJ3 interfaceC39067cJ32, InterfaceC39067cJ3 interfaceC39067cJ33) {
        C35055Os4 c35055Os4 = new C35055Os4(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (interfaceC39067cJ32 == null) {
            interfaceC39067cJ32 = C28793td.m12007a();
        }
        interfaceC39067cJ32.mo20783h(c35055Os4);
        if (interfaceC39067cJ33 == null) {
            interfaceC39067cJ33 = C28793td.m12007a();
        }
        interfaceC39067cJ33.mo20782i(interfaceC39067cJ3, interfaceC39067cJ32, C47979rJ3.f106848a.m16068b());
        boolean isEmpty = interfaceC39067cJ33.isEmpty();
        interfaceC39067cJ33.reset();
        interfaceC39067cJ32.reset();
        return !isEmpty;
    }

    /* renamed from: d */
    public static final boolean m28080d(C35055Os4 c35055Os4, float f, float f2) {
        return c35055Os4.m91258i() <= f && f < c35055Os4.m91257j() && c35055Os4.m91255l() <= f2 && f2 < c35055Os4.m91262e();
    }

    /* renamed from: e */
    public static final boolean m28079e(AbstractC34649Mz3.C5447c c5447c, float f, float f2, InterfaceC39067cJ3 interfaceC39067cJ3, InterfaceC39067cJ3 interfaceC39067cJ32) {
        InterfaceC39067cJ3 interfaceC39067cJ33;
        C36775Wb5 m94526a = c5447c.m94526a();
        if (f >= m94526a.m78155e() && f < m94526a.m78154f() && f2 >= m94526a.m78153g() && f2 < m94526a.m78159a()) {
            if (!m28083a(m94526a)) {
                if (interfaceC39067cJ32 == null) {
                    interfaceC39067cJ33 = C28793td.m12007a();
                } else {
                    interfaceC39067cJ33 = interfaceC39067cJ32;
                }
                interfaceC39067cJ33.mo20784g(m94526a);
                return m28081c(interfaceC39067cJ33, f, f2, interfaceC39067cJ3, interfaceC39067cJ32);
            }
            float m97601d = LC0.m97601d(m94526a.m78152h()) + m94526a.m78155e();
            float m97600e = LC0.m97600e(m94526a.m78152h()) + m94526a.m78153g();
            float m78154f = m94526a.m78154f() - LC0.m97601d(m94526a.m78151i());
            float m97600e2 = LC0.m97600e(m94526a.m78151i()) + m94526a.m78153g();
            float m78154f2 = m94526a.m78154f() - LC0.m97601d(m94526a.m78157c());
            float m78159a = m94526a.m78159a() - LC0.m97600e(m94526a.m78157c());
            float m78159a2 = m94526a.m78159a() - LC0.m97600e(m94526a.m78158b());
            float m97601d2 = LC0.m97601d(m94526a.m78158b()) + m94526a.m78155e();
            if (f < m97601d && f2 < m97600e) {
                return m28078f(f, f2, m94526a.m78152h(), m97601d, m97600e);
            }
            if (f < m97601d2 && f2 > m78159a2) {
                return m28078f(f, f2, m94526a.m78158b(), m97601d2, m78159a2);
            }
            if (f > m78154f && f2 < m97600e2) {
                return m28078f(f, f2, m94526a.m78151i(), m78154f, m97600e2);
            }
            if (f > m78154f2 && f2 > m78159a) {
                return m28078f(f, f2, m94526a.m78157c(), m78154f2, m78159a);
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m28078f(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float m97601d = LC0.m97601d(j);
        float m97600e = LC0.m97600e(j);
        if (((f5 * f5) / (m97601d * m97601d)) + ((f6 * f6) / (m97600e * m97600e)) <= 1.0f) {
            return true;
        }
        return false;
    }
}
