package p000;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: hH8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42036hH8 {

    /* renamed from: a */
    public static final AtomicReference f84965a = new AtomicReference();

    /* renamed from: a */
    public static WJ8 m36560a(C42290hj1 c42290hj1) {
        EnumC45612nJ8 enumC45612nJ8;
        PI8 pi8;
        EnumC52726zJ8 enumC52726zJ8;
        EnumC38479bJ8 enumC38479bJ8;
        DI8 di8 = new DI8();
        int m35951d = c42290hj1.m35951d();
        if (m35951d != 1) {
            if (m35951d != 2) {
                enumC45612nJ8 = EnumC45612nJ8.UNKNOWN_LANDMARKS;
            } else {
                enumC45612nJ8 = EnumC45612nJ8.ALL_LANDMARKS;
            }
        } else {
            enumC45612nJ8 = EnumC45612nJ8.NO_LANDMARKS;
        }
        di8.m110593d(enumC45612nJ8);
        int m35953b = c42290hj1.m35953b();
        if (m35953b != 1) {
            if (m35953b != 2) {
                pi8 = PI8.UNKNOWN_CLASSIFICATIONS;
            } else {
                pi8 = PI8.ALL_CLASSIFICATIONS;
            }
        } else {
            pi8 = PI8.NO_CLASSIFICATIONS;
        }
        di8.m110596a(pi8);
        int m35950e = c42290hj1.m35950e();
        if (m35950e != 1) {
            if (m35950e != 2) {
                enumC52726zJ8 = EnumC52726zJ8.UNKNOWN_PERFORMANCE;
            } else {
                enumC52726zJ8 = EnumC52726zJ8.ACCURATE;
            }
        } else {
            enumC52726zJ8 = EnumC52726zJ8.FAST;
        }
        di8.m110591f(enumC52726zJ8);
        int m35952c = c42290hj1.m35952c();
        if (m35952c != 1) {
            if (m35952c != 2) {
                enumC38479bJ8 = EnumC38479bJ8.UNKNOWN_CONTOURS;
            } else {
                enumC38479bJ8 = EnumC38479bJ8.ALL_CONTOURS;
            }
        } else {
            enumC38479bJ8 = EnumC38479bJ8.NO_CONTOURS;
        }
        di8.m110595b(enumC38479bJ8);
        di8.m110594c(Boolean.valueOf(c42290hj1.m35948g()));
        di8.m110592e(Float.valueOf(c42290hj1.m35954a()));
        return di8.m110586k();
    }

    /* renamed from: b */
    public static String m36559b() {
        return true != m36557d() ? "play-services-mlkit-face-detection" : "face-detection";
    }

    /* renamed from: c */
    public static void m36558c(C51993y49 c51993y49, final boolean z, final ZN8 zn8) {
        c51993y49.m4172c(new InterfaceC42507i49() { // from class: CA8
            @Override // p000.InterfaceC42507i49
            public final C52596z59 zza() {
                EnumC41497gN8 enumC41497gN8;
                boolean z2 = z;
                ZN8 zn82 = zn8;
                C51585xO8 c51585xO8 = new C51585xO8();
                if (z2) {
                    enumC41497gN8 = EnumC41497gN8.TYPE_THICK;
                } else {
                    enumC41497gN8 = EnumC41497gN8.TYPE_THIN;
                }
                c51585xO8.m5304e(enumC41497gN8);
                AR8 ar8 = new AR8();
                ar8.m115784b(zn82);
                c51585xO8.m5301h(ar8.m115783c());
                return C52596z59.m1827d(c51585xO8);
            }
        }, EnumC44471lO8.ON_DEVICE_FACE_LOAD);
    }

    /* renamed from: d */
    public static boolean m36557d() {
        AtomicReference atomicReference = f84965a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean m28660b = C44035kf7.m28660b(C52226yU2.m3451c().m3452b());
        atomicReference.set(Boolean.valueOf(m28660b));
        return m28660b;
    }
}
