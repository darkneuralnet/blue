package p000;

import java.io.IOException;
import java.util.List;
/* renamed from: He */
/* loaded from: classes2.dex */
public class C3184He {
    private C3184He() {
    }

    /* renamed from: a */
    public static <T> List<C41125fl2<T>> m103631a(AbstractC39920dj2 abstractC39920dj2, float f, C47924rD2 c47924rD2, InterfaceC34274Lj6<T> interfaceC34274Lj6) throws IOException {
        return C42904il2.m33514a(abstractC39920dj2, c47924rD2, f, interfaceC34274Lj6, false);
    }

    /* renamed from: b */
    public static <T> List<C41125fl2<T>> m103630b(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2, InterfaceC34274Lj6<T> interfaceC34274Lj6) throws IOException {
        return C42904il2.m33514a(abstractC39920dj2, c47924rD2, 1.0f, interfaceC34274Lj6, false);
    }

    /* renamed from: c */
    public static C27323pe m103629c(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        return new C27323pe(m103630b(abstractC39920dj2, c47924rD2, C52398ym0.f120147a));
    }

    /* renamed from: d */
    public static C0675Be m103628d(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        return new C0675Be(m103631a(abstractC39920dj2, C33095Gi6.m104867e(), c47924rD2, O51.f25618a));
    }

    /* renamed from: e */
    public static C27640qe m103627e(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        return m103626f(abstractC39920dj2, c47924rD2, true);
    }

    /* renamed from: f */
    public static C27640qe m103626f(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2, boolean z) throws IOException {
        float f;
        if (z) {
            f = C33095Gi6.m104867e();
        } else {
            f = 1.0f;
        }
        return new C27640qe(m103631a(abstractC39920dj2, f, c47924rD2, C47737qu1.f106050a));
    }

    /* renamed from: g */
    public static C27959re m103625g(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2, int i) throws IOException {
        return new C27959re(m103630b(abstractC39920dj2, c47924rD2, new KD1(i)));
    }

    /* renamed from: h */
    public static C28363se m103624h(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        return new C28363se(m103630b(abstractC39920dj2, c47924rD2, O52.f25620a));
    }

    /* renamed from: i */
    public static C30260xe m103623i(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        return new C30260xe(C42904il2.m33514a(abstractC39920dj2, c47924rD2, C33095Gi6.m104867e(), JW3.f17711a, true));
    }

    /* renamed from: j */
    public static C30641ye m103622j(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        return new C30641ye(m103630b(abstractC39920dj2, c47924rD2, C40515ej5.f78741a));
    }

    /* renamed from: k */
    public static C31066ze m103621k(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        return new C31066ze(m103631a(abstractC39920dj2, C33095Gi6.m104867e(), c47924rD2, C46002ny5.f101165a));
    }
}
