package p000;

import android.graphics.Path;
import java.io.IOException;
import java.util.Collections;
import p000.AbstractC39920dj2;
/* renamed from: ND1 */
/* loaded from: classes2.dex */
public class ND1 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f24288a = AbstractC39920dj2.C19847a.m43839a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    public static final AbstractC39920dj2.C19847a f24289b = AbstractC39920dj2.C19847a.m43839a("p", "k");

    private ND1() {
    }

    /* renamed from: a */
    public static LD1 m94193a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        C28363se c28363se;
        RD1 rd1;
        Path.FillType fillType;
        C28363se c28363se2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        RD1 rd12 = null;
        C27959re c27959re = null;
        C30260xe c30260xe = null;
        C30260xe c30260xe2 = null;
        boolean z = false;
        while (abstractC39920dj2.mo2767g()) {
            switch (abstractC39920dj2.mo2760s(f24288a)) {
                case 0:
                    str = abstractC39920dj2.mo2762n();
                    break;
                case 1:
                    abstractC39920dj2.mo2770c();
                    int i = -1;
                    while (abstractC39920dj2.mo2767g()) {
                        int mo2760s = abstractC39920dj2.mo2760s(f24289b);
                        if (mo2760s != 0) {
                            if (mo2760s != 1) {
                                abstractC39920dj2.mo2759t();
                                abstractC39920dj2.mo2758u();
                            } else {
                                c27959re = C3184He.m103625g(abstractC39920dj2, c47924rD2, i);
                            }
                        } else {
                            i = abstractC39920dj2.mo2764l();
                        }
                    }
                    abstractC39920dj2.mo2768f();
                    break;
                case 2:
                    c28363se2 = C3184He.m103624h(abstractC39920dj2, c47924rD2);
                    break;
                case 3:
                    if (abstractC39920dj2.mo2764l() == 1) {
                        rd1 = RD1.LINEAR;
                    } else {
                        rd1 = RD1.RADIAL;
                    }
                    rd12 = rd1;
                    break;
                case 4:
                    c30260xe = C3184He.m103623i(abstractC39920dj2, c47924rD2);
                    break;
                case 5:
                    c30260xe2 = C3184He.m103623i(abstractC39920dj2, c47924rD2);
                    break;
                case 6:
                    if (abstractC39920dj2.mo2764l() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 7:
                    z = abstractC39920dj2.mo2766i();
                    break;
                default:
                    abstractC39920dj2.mo2759t();
                    abstractC39920dj2.mo2758u();
                    break;
            }
        }
        if (c28363se2 == null) {
            c28363se = new C28363se(Collections.singletonList(new C41125fl2(100)));
        } else {
            c28363se = c28363se2;
        }
        return new LD1(str, rd12, fillType2, c27959re, c28363se, c30260xe, c30260xe2, null, null, z);
    }
}
