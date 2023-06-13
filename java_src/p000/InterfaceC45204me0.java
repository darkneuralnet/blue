package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH&J\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010 \u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J-\u0010)\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J0\u0010,\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J@\u0010/\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J-\u00102\u001a\u00020\u00022\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103JH\u00108\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u00107\u001a\u0002062\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u00109\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H&J-\u0010=\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>JM\u0010E\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020?2\b\b\u0002\u0010D\u001a\u00020A2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010FJ\b\u0010G\u001a\u00020\u0002H&J\b\u0010H\u001a\u00020\u0002H&ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006IÀ\u0006\u0003"}, m28432d2 = {"Lme0;", "", "", "v", "p", "LOs4;", "bounds", "LkE3;", "paint", "x", "", "dx", "dy", "b", "sx", "sy", "l", "degrees", "u", "LhN2;", "matrix", "w", "([F)V", "rect", "LRk0;", "clipOp", "m", "(LOs4;I)V", "left", "top", "right", "bottom", C17296a.f69688o, "(FFFFI)V", "LcJ3;", "path", "c", "(LcJ3;I)V", "LCe3;", "p1", "p2", "g", "(JJLkE3;)V", "s", "k", "radiusX", "radiusY", "h", "center", "radius", "j", "(JFLkE3;)V", "startAngle", "sweepAngle", "", "useCenter", "o", "t", "LMW1;", Entry.TYPE_IMAGE, "topLeftOffset", "q", "(LMW1;JLkE3;)V", "LA52;", "srcOffset", "LG52;", "srcSize", "dstOffset", "dstSize", DateTokenConverter.CONVERTER_KEY, "(LMW1;JJJJLkE3;)V", "r", "i", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: me0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC45204me0 {
    /* renamed from: e */
    static /* synthetic */ void m25262e(InterfaceC45204me0 interfaceC45204me0, C35055Os4 c35055Os4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = C35681Rk0.f32493a.m86404b();
        }
        interfaceC45204me0.m25254m(c35055Os4, i);
    }

    /* renamed from: f */
    static /* synthetic */ void m25261f(InterfaceC45204me0 interfaceC45204me0, InterfaceC39067cJ3 interfaceC39067cJ3, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = C35681Rk0.f32493a.m86404b();
        }
        interfaceC45204me0.mo25264c(interfaceC39067cJ3, i);
    }

    /* renamed from: n */
    static /* synthetic */ void m25253n(InterfaceC45204me0 interfaceC45204me0, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 16) != 0) {
                i = C35681Rk0.f32493a.m86404b();
            }
            interfaceC45204me0.mo25266a(f, f2, f3, f4, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* renamed from: a */
    void mo25266a(float f, float f2, float f3, float f4, int i);

    /* renamed from: b */
    void mo25265b(float f, float f2);

    /* renamed from: c */
    void mo25264c(InterfaceC39067cJ3 interfaceC39067cJ3, int i);

    /* renamed from: d */
    void mo25263d(MW1 mw1, long j, long j2, long j3, long j4, InterfaceC43783kE3 interfaceC43783kE3);

    /* renamed from: g */
    void mo25260g(long j, long j2, InterfaceC43783kE3 interfaceC43783kE3);

    /* renamed from: h */
    void mo25259h(float f, float f2, float f3, float f4, float f5, float f6, InterfaceC43783kE3 interfaceC43783kE3);

    /* renamed from: i */
    void mo25258i();

    /* renamed from: j */
    void mo25257j(long j, float f, InterfaceC43783kE3 interfaceC43783kE3);

    /* renamed from: k */
    void mo25256k(float f, float f2, float f3, float f4, InterfaceC43783kE3 interfaceC43783kE3);

    /* renamed from: l */
    void mo25255l(float f, float f2);

    /* renamed from: m */
    default void m25254m(C35055Os4 rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        mo25266a(rect.m91258i(), rect.m91255l(), rect.m91257j(), rect.m91262e(), i);
    }

    /* renamed from: o */
    void mo25252o(float f, float f2, float f3, float f4, float f5, float f6, boolean z, InterfaceC43783kE3 interfaceC43783kE3);

    /* renamed from: p */
    void mo25251p();

    /* renamed from: q */
    void mo25250q(MW1 mw1, long j, InterfaceC43783kE3 interfaceC43783kE3);

    /* renamed from: r */
    void mo25249r();

    /* renamed from: s */
    default void m25248s(C35055Os4 rect, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        mo25256k(rect.m91258i(), rect.m91255l(), rect.m91257j(), rect.m91262e(), paint);
    }

    /* renamed from: t */
    void mo25247t(InterfaceC39067cJ3 interfaceC39067cJ3, InterfaceC43783kE3 interfaceC43783kE3);

    /* renamed from: u */
    void mo25246u(float f);

    /* renamed from: v */
    void mo25245v();

    /* renamed from: w */
    void mo25244w(float[] fArr);

    /* renamed from: x */
    void mo25243x(C35055Os4 c35055Os4, InterfaceC43783kE3 interfaceC43783kE3);
}
