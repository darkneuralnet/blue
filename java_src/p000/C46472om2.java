package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0000*\u00020\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m28432d2 = {"Lnm2;", "LCe3;", "e", "(Lnm2;)J", "f", "LOs4;", "b", "c", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: om2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46472om2 {
    /* renamed from: a */
    public static final C35055Os4 m20520a(InterfaceC45879nm2 interfaceC45879nm2) {
        C35055Os4 m23184f;
        Intrinsics.checkNotNullParameter(interfaceC45879nm2, "<this>");
        InterfaceC45879nm2 mo23182t = interfaceC45879nm2.mo23182t();
        if (mo23182t == null || (m23184f = InterfaceC45879nm2.m23184f(mo23182t, interfaceC45879nm2, false, 2, null)) == null) {
            return new C35055Os4(0.0f, 0.0f, G52.m105829g(interfaceC45879nm2.mo23186a()), G52.m105830f(interfaceC45879nm2.mo23186a()));
        }
        return m23184f;
    }

    /* renamed from: b */
    public static final C35055Os4 m20519b(InterfaceC45879nm2 interfaceC45879nm2) {
        Intrinsics.checkNotNullParameter(interfaceC45879nm2, "<this>");
        return InterfaceC45879nm2.m23184f(m20517d(interfaceC45879nm2), interfaceC45879nm2, false, 2, null);
    }

    /* renamed from: c */
    public static final C35055Os4 m20518c(InterfaceC45879nm2 interfaceC45879nm2) {
        float coerceIn;
        float coerceIn2;
        float coerceIn3;
        float coerceIn4;
        boolean z;
        boolean z2;
        float minOf;
        float minOf2;
        float maxOf;
        float maxOf2;
        Intrinsics.checkNotNullParameter(interfaceC45879nm2, "<this>");
        InterfaceC45879nm2 m20517d = m20517d(interfaceC45879nm2);
        C35055Os4 m20519b = m20519b(interfaceC45879nm2);
        float m105829g = G52.m105829g(m20517d.mo23186a());
        float m105830f = G52.m105830f(m20517d.mo23186a());
        coerceIn = RangesKt___RangesKt.coerceIn(m20519b.m91258i(), 0.0f, m105829g);
        coerceIn2 = RangesKt___RangesKt.coerceIn(m20519b.m91255l(), 0.0f, m105830f);
        coerceIn3 = RangesKt___RangesKt.coerceIn(m20519b.m91257j(), 0.0f, m105829g);
        coerceIn4 = RangesKt___RangesKt.coerceIn(m20519b.m91262e(), 0.0f, m105830f);
        if (coerceIn == coerceIn3) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (coerceIn2 == coerceIn4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                long mo23183i = m20517d.mo23183i(C33056Ge3.m104938a(coerceIn, coerceIn2));
                long mo23183i2 = m20517d.mo23183i(C33056Ge3.m104938a(coerceIn3, coerceIn2));
                long mo23183i3 = m20517d.mo23183i(C33056Ge3.m104938a(coerceIn3, coerceIn4));
                long mo23183i4 = m20517d.mo23183i(C33056Ge3.m104938a(coerceIn, coerceIn4));
                minOf = ComparisonsKt___ComparisonsJvmKt.minOf(C32120Ce3.m111944o(mo23183i), C32120Ce3.m111944o(mo23183i2), C32120Ce3.m111944o(mo23183i4), C32120Ce3.m111944o(mo23183i3));
                minOf2 = ComparisonsKt___ComparisonsJvmKt.minOf(C32120Ce3.m111943p(mo23183i), C32120Ce3.m111943p(mo23183i2), C32120Ce3.m111943p(mo23183i4), C32120Ce3.m111943p(mo23183i3));
                maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(C32120Ce3.m111944o(mo23183i), C32120Ce3.m111944o(mo23183i2), C32120Ce3.m111944o(mo23183i4), C32120Ce3.m111944o(mo23183i3));
                maxOf2 = ComparisonsKt___ComparisonsJvmKt.maxOf(C32120Ce3.m111943p(mo23183i), C32120Ce3.m111943p(mo23183i2), C32120Ce3.m111943p(mo23183i4), C32120Ce3.m111943p(mo23183i3));
                return new C35055Os4(minOf, minOf2, maxOf, maxOf2);
            }
        }
        return C35055Os4.f27481e.m91247a();
    }

    /* renamed from: d */
    public static final InterfaceC45879nm2 m20517d(InterfaceC45879nm2 interfaceC45879nm2) {
        InterfaceC45879nm2 interfaceC45879nm22;
        H83 h83;
        Intrinsics.checkNotNullParameter(interfaceC45879nm2, "<this>");
        InterfaceC45879nm2 mo23182t = interfaceC45879nm2.mo23182t();
        while (true) {
            InterfaceC45879nm2 interfaceC45879nm23 = mo23182t;
            interfaceC45879nm22 = interfaceC45879nm2;
            interfaceC45879nm2 = interfaceC45879nm23;
            if (interfaceC45879nm2 == null) {
                break;
            }
            mo23182t = interfaceC45879nm2.mo23182t();
        }
        if (interfaceC45879nm22 instanceof H83) {
            h83 = (H83) interfaceC45879nm22;
        } else {
            h83 = null;
        }
        if (h83 == null) {
            return interfaceC45879nm22;
        }
        H83 m104309j2 = h83.m104309j2();
        while (true) {
            H83 h832 = m104309j2;
            H83 h833 = h83;
            h83 = h832;
            if (h83 != null) {
                m104309j2 = h83.m104309j2();
            } else {
                return h833;
            }
        }
    }

    /* renamed from: e */
    public static final long m20516e(InterfaceC45879nm2 interfaceC45879nm2) {
        Intrinsics.checkNotNullParameter(interfaceC45879nm2, "<this>");
        return interfaceC45879nm2.mo23181y(C32120Ce3.f4427b.m111932c());
    }

    /* renamed from: f */
    public static final long m20515f(InterfaceC45879nm2 interfaceC45879nm2) {
        Intrinsics.checkNotNullParameter(interfaceC45879nm2, "<this>");
        return interfaceC45879nm2.mo23183i(C32120Ce3.f4427b.m111932c());
    }
}
