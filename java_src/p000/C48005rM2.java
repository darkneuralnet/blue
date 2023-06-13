package p000;

import com.facebook.share.internal.C17296a;
import java.io.IOException;
import p000.C46819pM2;
/* renamed from: rM2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48005rM2 {
    private C48005rM2() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r0.equals("s") == false) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C46819pM2 m16043a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        boolean z;
        abstractC39920dj2.mo2770c();
        C46819pM2.EnumC27274a enumC27274a = null;
        C31066ze c31066ze = null;
        C28363se c28363se = null;
        boolean z2 = false;
        while (abstractC39920dj2.mo2767g()) {
            String mo2763m = abstractC39920dj2.mo2763m();
            mo2763m.hashCode();
            char c = 3;
            switch (mo2763m.hashCode()) {
                case 111:
                    if (mo2763m.equals("o")) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 3588:
                    if (mo2763m.equals("pt")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case 104433:
                    if (mo2763m.equals("inv")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case 3357091:
                    if (mo2763m.equals("mode")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                default:
                    z = true;
                    break;
            }
            switch (z) {
                case false:
                    c28363se = C3184He.m103624h(abstractC39920dj2, c47924rD2);
                    break;
                case true:
                    c31066ze = C3184He.m103621k(abstractC39920dj2, c47924rD2);
                    break;
                case true:
                    z2 = abstractC39920dj2.mo2766i();
                    break;
                case true:
                    String mo2762n = abstractC39920dj2.mo2762n();
                    mo2762n.hashCode();
                    switch (mo2762n.hashCode()) {
                        case 97:
                            if (mo2762n.equals(C17296a.f69688o)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 105:
                            if (mo2762n.equals("i")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 110:
                            if (mo2762n.equals("n")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 115:
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            enumC27274a = C46819pM2.EnumC27274a.MASK_MODE_ADD;
                            continue;
                        case 1:
                            c47924rD2.m16223a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            enumC27274a = C46819pM2.EnumC27274a.MASK_MODE_INTERSECT;
                            continue;
                        case 2:
                            enumC27274a = C46819pM2.EnumC27274a.MASK_MODE_NONE;
                            continue;
                        case 3:
                            enumC27274a = C46819pM2.EnumC27274a.MASK_MODE_SUBTRACT;
                            continue;
                        default:
                            C32524Dx2.m109586c("Unknown mask mode " + mo2763m + ". Defaulting to Add.");
                            enumC27274a = C46819pM2.EnumC27274a.MASK_MODE_ADD;
                            continue;
                    }
                default:
                    abstractC39920dj2.mo2758u();
                    break;
            }
        }
        abstractC39920dj2.mo2768f();
        return new C46819pM2(enumC27274a, c31066ze, c28363se, z2);
    }
}
