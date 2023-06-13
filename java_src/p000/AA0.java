package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: AA0 */
/* loaded from: classes2.dex */
public class AA0 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f225a = AbstractC39920dj2.C19847a.m43839a("ty", DateTokenConverter.CONVERTER_KEY);

    private AA0() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c2, code lost:
        if (r2.equals("gf") == false) goto L21;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC52637zA0 m116044a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        InterfaceC52637zA0 interfaceC52637zA0;
        String str;
        abstractC39920dj2.mo2770c();
        char c = 2;
        int i = 2;
        while (true) {
            interfaceC52637zA0 = null;
            if (abstractC39920dj2.mo2767g()) {
                int mo2760s = abstractC39920dj2.mo2760s(f225a);
                if (mo2760s != 0) {
                    if (mo2760s != 1) {
                        abstractC39920dj2.mo2759t();
                        abstractC39920dj2.mo2758u();
                    } else {
                        i = abstractC39920dj2.mo2764l();
                    }
                } else {
                    str = abstractC39920dj2.mo2762n();
                    break;
                }
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3295:
                break;
            case 3307:
                if (str.equals("gr")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3669:
                if (str.equals("sh")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c = '\r';
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
                interfaceC52637zA0 = C31694Aj0.m115359a(abstractC39920dj2, c47924rD2, i);
                break;
            case 1:
                interfaceC52637zA0 = C47188py5.m18367a(abstractC39920dj2, c47924rD2);
                break;
            case 2:
                interfaceC52637zA0 = ND1.m94193a(abstractC39920dj2, c47924rD2);
                break;
            case 3:
                interfaceC52637zA0 = C48373ry5.m14963a(abstractC39920dj2, c47924rD2);
                break;
            case 4:
                interfaceC52637zA0 = QD1.m88736a(abstractC39920dj2, c47924rD2);
                break;
            case 5:
                interfaceC52637zA0 = C44510lT2.m27259a(abstractC39920dj2);
                c47924rD2.m16223a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                interfaceC52637zA0 = C38225at4.m65325a(abstractC39920dj2, c47924rD2);
                break;
            case 7:
                interfaceC52637zA0 = C41631gc5.m37977a(abstractC39920dj2, c47924rD2);
                break;
            case '\b':
                interfaceC52637zA0 = C42616iG4.m34275a(abstractC39920dj2, c47924rD2);
                break;
            case '\t':
                interfaceC52637zA0 = C51930xy5.m4369a(abstractC39920dj2, c47924rD2);
                break;
            case '\n':
                interfaceC52637zA0 = YX3.m74931a(abstractC39920dj2, c47924rD2, i);
                break;
            case 11:
                interfaceC52637zA0 = C53116zy5.m50a(abstractC39920dj2, c47924rD2);
                break;
            case '\f':
                interfaceC52637zA0 = C32068By5.m113209a(abstractC39920dj2, c47924rD2);
                break;
            case '\r':
                interfaceC52637zA0 = C2373Fe.m106827g(abstractC39920dj2, c47924rD2);
                break;
            default:
                C32524Dx2.m109586c("Unknown shape type " + str);
                break;
        }
        while (abstractC39920dj2.mo2767g()) {
            abstractC39920dj2.mo2758u();
        }
        abstractC39920dj2.mo2768f();
        return interfaceC52637zA0;
    }
}
