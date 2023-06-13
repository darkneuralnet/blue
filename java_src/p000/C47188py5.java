package p000;

import android.graphics.Path;
import java.io.IOException;
import java.util.Collections;
import p000.AbstractC39920dj2;
/* renamed from: py5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47188py5 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f104413a = AbstractC39920dj2.C19847a.m43839a("nm", "c", "o", "fillEnabled", "r", "hd");

    private C47188py5() {
    }

    /* renamed from: a */
    public static C46595oy5 m18367a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        Path.FillType fillType;
        C28363se c28363se = null;
        String str = null;
        C27323pe c27323pe = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f104413a);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        if (mo2760s != 3) {
                            if (mo2760s != 4) {
                                if (mo2760s != 5) {
                                    abstractC39920dj2.mo2759t();
                                    abstractC39920dj2.mo2758u();
                                } else {
                                    z2 = abstractC39920dj2.mo2766i();
                                }
                            } else {
                                i = abstractC39920dj2.mo2764l();
                            }
                        } else {
                            z = abstractC39920dj2.mo2766i();
                        }
                    } else {
                        c28363se = C3184He.m103624h(abstractC39920dj2, c47924rD2);
                    }
                } else {
                    c27323pe = C3184He.m103629c(abstractC39920dj2, c47924rD2);
                }
            } else {
                str = abstractC39920dj2.mo2762n();
            }
        }
        if (c28363se == null) {
            c28363se = new C28363se(Collections.singletonList(new C41125fl2(100)));
        }
        C28363se c28363se2 = c28363se;
        if (i == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new C46595oy5(str, z, fillType, c27323pe, c28363se2, z2);
    }
}
