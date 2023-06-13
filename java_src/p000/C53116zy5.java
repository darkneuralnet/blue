package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p000.AbstractC39920dj2;
import p000.C52523yy5;
/* renamed from: zy5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53116zy5 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f122541a = AbstractC39920dj2.C19847a.m43839a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", DateTokenConverter.CONVERTER_KEY);

    /* renamed from: b */
    public static final AbstractC39920dj2.C19847a f122542b = AbstractC39920dj2.C19847a.m43839a("n", "v");

    private C53116zy5() {
    }

    /* renamed from: a */
    public static C52523yy5 m50a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        boolean z = false;
        String str = null;
        C27640qe c27640qe = null;
        C27323pe c27323pe = null;
        C27640qe c27640qe2 = null;
        C52523yy5.EnumC30791b enumC30791b = null;
        C52523yy5.EnumC30792c enumC30792c = null;
        C28363se c28363se = null;
        while (abstractC39920dj2.mo2767g()) {
            switch (abstractC39920dj2.mo2760s(f122541a)) {
                case 0:
                    str = abstractC39920dj2.mo2762n();
                    break;
                case 1:
                    c27323pe = C3184He.m103629c(abstractC39920dj2, c47924rD2);
                    break;
                case 2:
                    c27640qe2 = C3184He.m103627e(abstractC39920dj2, c47924rD2);
                    break;
                case 3:
                    c28363se = C3184He.m103624h(abstractC39920dj2, c47924rD2);
                    break;
                case 4:
                    enumC30791b = C52523yy5.EnumC30791b.values()[abstractC39920dj2.mo2764l() - 1];
                    break;
                case 5:
                    enumC30792c = C52523yy5.EnumC30792c.values()[abstractC39920dj2.mo2764l() - 1];
                    break;
                case 6:
                    f = (float) abstractC39920dj2.mo2765k();
                    break;
                case 7:
                    z = abstractC39920dj2.mo2766i();
                    break;
                case 8:
                    abstractC39920dj2.mo2771b();
                    while (abstractC39920dj2.mo2767g()) {
                        abstractC39920dj2.mo2770c();
                        String str2 = null;
                        C27640qe c27640qe3 = null;
                        while (abstractC39920dj2.mo2767g()) {
                            int mo2760s = abstractC39920dj2.mo2760s(f122542b);
                            if (mo2760s != 0) {
                                if (mo2760s != 1) {
                                    abstractC39920dj2.mo2759t();
                                    abstractC39920dj2.mo2758u();
                                } else {
                                    c27640qe3 = C3184He.m103627e(abstractC39920dj2, c47924rD2);
                                }
                            } else {
                                str2 = abstractC39920dj2.mo2762n();
                            }
                        }
                        abstractC39920dj2.mo2768f();
                        str2.hashCode();
                        char c = 65535;
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals(DateTokenConverter.CONVERTER_KEY)) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                c47924rD2.m16203u(true);
                                arrayList.add(c27640qe3);
                                break;
                            case 2:
                                c27640qe = c27640qe3;
                                break;
                        }
                    }
                    abstractC39920dj2.mo2769d();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((C27640qe) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    abstractC39920dj2.mo2758u();
                    break;
            }
        }
        if (c28363se == null) {
            c28363se = new C28363se(Collections.singletonList(new C41125fl2(100)));
        }
        return new C52523yy5(str, c27640qe, arrayList, c27323pe, c28363se, c27640qe2, enumC30791b, enumC30792c, f, z);
    }
}
