package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p000.AbstractC39920dj2;
import p000.C52523yy5;
/* renamed from: QD1 */
/* loaded from: classes2.dex */
public class QD1 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f30037a = AbstractC39920dj2.C19847a.m43839a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", DateTokenConverter.CONVERTER_KEY);

    /* renamed from: b */
    public static final AbstractC39920dj2.C19847a f30038b = AbstractC39920dj2.C19847a.m43839a("p", "k");

    /* renamed from: c */
    public static final AbstractC39920dj2.C19847a f30039c = AbstractC39920dj2.C19847a.m43839a("n", "v");

    private QD1() {
    }

    /* renamed from: a */
    public static OD1 m88736a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        String str;
        C27959re c27959re;
        RD1 rd1;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str2 = null;
        RD1 rd12 = null;
        C27959re c27959re2 = null;
        C30260xe c30260xe = null;
        C30260xe c30260xe2 = null;
        C27640qe c27640qe = null;
        C52523yy5.EnumC30791b enumC30791b = null;
        C52523yy5.EnumC30792c enumC30792c = null;
        C27640qe c27640qe2 = null;
        boolean z = false;
        C28363se c28363se = null;
        while (abstractC39920dj2.mo2767g()) {
            switch (abstractC39920dj2.mo2760s(f30037a)) {
                case 0:
                    str2 = abstractC39920dj2.mo2762n();
                    continue;
                case 1:
                    str = str2;
                    abstractC39920dj2.mo2770c();
                    int i = -1;
                    while (abstractC39920dj2.mo2767g()) {
                        int mo2760s = abstractC39920dj2.mo2760s(f30038b);
                        if (mo2760s != 0) {
                            c27959re = c27959re2;
                            if (mo2760s != 1) {
                                abstractC39920dj2.mo2759t();
                                abstractC39920dj2.mo2758u();
                            } else {
                                c27959re2 = C3184He.m103625g(abstractC39920dj2, c47924rD2, i);
                            }
                        } else {
                            c27959re = c27959re2;
                            i = abstractC39920dj2.mo2764l();
                        }
                        c27959re2 = c27959re;
                    }
                    abstractC39920dj2.mo2768f();
                    break;
                case 2:
                    c28363se = C3184He.m103624h(abstractC39920dj2, c47924rD2);
                    continue;
                case 3:
                    str = str2;
                    if (abstractC39920dj2.mo2764l() == 1) {
                        rd1 = RD1.LINEAR;
                    } else {
                        rd1 = RD1.RADIAL;
                    }
                    rd12 = rd1;
                    break;
                case 4:
                    c30260xe = C3184He.m103623i(abstractC39920dj2, c47924rD2);
                    continue;
                case 5:
                    c30260xe2 = C3184He.m103623i(abstractC39920dj2, c47924rD2);
                    continue;
                case 6:
                    c27640qe = C3184He.m103627e(abstractC39920dj2, c47924rD2);
                    continue;
                case 7:
                    str = str2;
                    enumC30791b = C52523yy5.EnumC30791b.values()[abstractC39920dj2.mo2764l() - 1];
                    break;
                case 8:
                    str = str2;
                    enumC30792c = C52523yy5.EnumC30792c.values()[abstractC39920dj2.mo2764l() - 1];
                    break;
                case 9:
                    str = str2;
                    f = (float) abstractC39920dj2.mo2765k();
                    break;
                case 10:
                    z = abstractC39920dj2.mo2766i();
                    continue;
                case 11:
                    abstractC39920dj2.mo2771b();
                    while (abstractC39920dj2.mo2767g()) {
                        abstractC39920dj2.mo2770c();
                        String str3 = null;
                        C27640qe c27640qe3 = null;
                        while (abstractC39920dj2.mo2767g()) {
                            int mo2760s2 = abstractC39920dj2.mo2760s(f30039c);
                            if (mo2760s2 != 0) {
                                C27640qe c27640qe4 = c27640qe2;
                                if (mo2760s2 != 1) {
                                    abstractC39920dj2.mo2759t();
                                    abstractC39920dj2.mo2758u();
                                } else {
                                    c27640qe3 = C3184He.m103627e(abstractC39920dj2, c47924rD2);
                                }
                                c27640qe2 = c27640qe4;
                            } else {
                                str3 = abstractC39920dj2.mo2762n();
                            }
                        }
                        C27640qe c27640qe5 = c27640qe2;
                        abstractC39920dj2.mo2768f();
                        if (str3.equals("o")) {
                            c27640qe2 = c27640qe3;
                        } else {
                            if (str3.equals(DateTokenConverter.CONVERTER_KEY) || str3.equals("g")) {
                                c47924rD2.m16203u(true);
                                arrayList.add(c27640qe3);
                            }
                            c27640qe2 = c27640qe5;
                        }
                    }
                    C27640qe c27640qe6 = c27640qe2;
                    abstractC39920dj2.mo2769d();
                    if (arrayList.size() == 1) {
                        arrayList.add((C27640qe) arrayList.get(0));
                    }
                    c27640qe2 = c27640qe6;
                    continue;
                    break;
                default:
                    abstractC39920dj2.mo2759t();
                    abstractC39920dj2.mo2758u();
                    continue;
            }
            str2 = str;
        }
        String str4 = str2;
        if (c28363se == null) {
            c28363se = new C28363se(Collections.singletonList(new C41125fl2(100)));
        }
        return new OD1(str4, rd12, c27959re2, c28363se, c30260xe, c30260xe2, c27640qe, enumC30791b, enumC30792c, f, arrayList, c27640qe2, z);
    }
}
