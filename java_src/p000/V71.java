package p000;

import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: V71 */
/* loaded from: classes2.dex */
public class V71 {

    /* renamed from: f */
    public static final AbstractC39920dj2.C19847a f38659f = AbstractC39920dj2.C19847a.m43839a("ef");

    /* renamed from: g */
    public static final AbstractC39920dj2.C19847a f38660g = AbstractC39920dj2.C19847a.m43839a("nm", "v");

    /* renamed from: a */
    public C27323pe f38661a;

    /* renamed from: b */
    public C27640qe f38662b;

    /* renamed from: c */
    public C27640qe f38663c;

    /* renamed from: d */
    public C27640qe f38664d;

    /* renamed from: e */
    public C27640qe f38665e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r0.equals("Opacity") == false) goto L16;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m80359a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        abstractC39920dj2.mo2770c();
        String str = "";
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f38660g);
            if (mo2760s != 0) {
                char c = 1;
                if (mo2760s != 1) {
                    abstractC39920dj2.mo2759t();
                    abstractC39920dj2.mo2758u();
                } else {
                    str.hashCode();
                    switch (str.hashCode()) {
                        case 353103893:
                            if (str.equals("Distance")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 397447147:
                            break;
                        case 1041377119:
                            if (str.equals("Direction")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1379387491:
                            if (str.equals("Shadow Color")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1383710113:
                            if (str.equals("Softness")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f38664d = C3184He.m103627e(abstractC39920dj2, c47924rD2);
                            continue;
                        case 1:
                            this.f38662b = C3184He.m103626f(abstractC39920dj2, c47924rD2, false);
                            continue;
                        case 2:
                            this.f38663c = C3184He.m103626f(abstractC39920dj2, c47924rD2, false);
                            continue;
                        case 3:
                            this.f38661a = C3184He.m103629c(abstractC39920dj2, c47924rD2);
                            continue;
                        case 4:
                            this.f38665e = C3184He.m103627e(abstractC39920dj2, c47924rD2);
                            continue;
                        default:
                            abstractC39920dj2.mo2758u();
                            continue;
                    }
                }
            } else {
                str = abstractC39920dj2.mo2762n();
            }
        }
        abstractC39920dj2.mo2768f();
    }

    /* renamed from: b */
    public U71 m80358b(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        C27640qe c27640qe;
        C27640qe c27640qe2;
        C27640qe c27640qe3;
        C27640qe c27640qe4;
        while (abstractC39920dj2.mo2767g()) {
            if (abstractC39920dj2.mo2760s(f38659f) != 0) {
                abstractC39920dj2.mo2759t();
                abstractC39920dj2.mo2758u();
            } else {
                abstractC39920dj2.mo2771b();
                while (abstractC39920dj2.mo2767g()) {
                    m80359a(abstractC39920dj2, c47924rD2);
                }
                abstractC39920dj2.mo2769d();
            }
        }
        C27323pe c27323pe = this.f38661a;
        if (c27323pe != null && (c27640qe = this.f38662b) != null && (c27640qe2 = this.f38663c) != null && (c27640qe3 = this.f38664d) != null && (c27640qe4 = this.f38665e) != null) {
            return new U71(c27323pe, c27640qe, c27640qe2, c27640qe3, c27640qe4);
        }
        return null;
    }
}
