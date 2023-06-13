package p000;

import p000.C43042iz0;
/* renamed from: hy3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42442hy3 {

    /* renamed from: a */
    public static boolean[] f86241a = new boolean[3];

    /* renamed from: a */
    public static void m35435a(C43635jz0 c43635jz0, C34342Lr2 c34342Lr2, C43042iz0 c43042iz0) {
        c43042iz0.f91921t = -1;
        c43042iz0.f91923u = -1;
        C43042iz0.EnumC24677b enumC24677b = c43635jz0.f91886b0[0];
        C43042iz0.EnumC24677b enumC24677b2 = C43042iz0.EnumC24677b.WRAP_CONTENT;
        if (enumC24677b != enumC24677b2 && c43042iz0.f91886b0[0] == C43042iz0.EnumC24677b.MATCH_PARENT) {
            int i = c43042iz0.f91869Q.f44309g;
            int m31391Y = c43635jz0.m31391Y() - c43042iz0.f91873S.f44309g;
            C37211Xy0 c37211Xy0 = c43042iz0.f91869Q;
            c37211Xy0.f44311i = c34342Lr2.m96275q(c37211Xy0);
            C37211Xy0 c37211Xy02 = c43042iz0.f91873S;
            c37211Xy02.f44311i = c34342Lr2.m96275q(c37211Xy02);
            c34342Lr2.m96286f(c43042iz0.f91869Q.f44311i, i);
            c34342Lr2.m96286f(c43042iz0.f91873S.f44311i, m31391Y);
            c43042iz0.f91921t = 2;
            c43042iz0.m31402S0(i, m31391Y);
        }
        if (c43635jz0.f91886b0[1] != enumC24677b2 && c43042iz0.f91886b0[1] == C43042iz0.EnumC24677b.MATCH_PARENT) {
            int i2 = c43042iz0.f91871R.f44309g;
            int m31328z = c43635jz0.m31328z() - c43042iz0.f91875T.f44309g;
            C37211Xy0 c37211Xy03 = c43042iz0.f91871R;
            c37211Xy03.f44311i = c34342Lr2.m96275q(c37211Xy03);
            C37211Xy0 c37211Xy04 = c43042iz0.f91875T;
            c37211Xy04.f44311i = c34342Lr2.m96275q(c37211Xy04);
            c34342Lr2.m96286f(c43042iz0.f91871R.f44311i, i2);
            c34342Lr2.m96286f(c43042iz0.f91875T.f44311i, m31328z);
            if (c43042iz0.f91910n0 > 0 || c43042iz0.m31393X() == 8) {
                C37211Xy0 c37211Xy05 = c43042iz0.f91877U;
                c37211Xy05.f44311i = c34342Lr2.m96275q(c37211Xy05);
                c34342Lr2.m96286f(c43042iz0.f91877U.f44311i, c43042iz0.f91910n0 + i2);
            }
            c43042iz0.f91923u = 2;
            c43042iz0.m31363j1(i2, m31328z);
        }
    }

    /* renamed from: b */
    public static final boolean m35434b(int i, int i2) {
        return (i & i2) == i2;
    }
}
