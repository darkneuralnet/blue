package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.UByte;
/* renamed from: XH3 */
/* loaded from: classes8.dex */
public class XH3 {

    /* renamed from: a */
    public static final char[] f42958a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static String m77157a(int i) {
        switch (i) {
            case 10:
                return "BOND_NONE";
            case 11:
                return "BOND_BONDING";
            case 12:
                return "BOND_BONDED";
            default:
                return "UNKNOWN (" + i + ")";
        }
    }

    /* renamed from: b */
    public static String m77156b(int i) {
        switch (i) {
            case 0:
                return "PAIRING_VARIANT_PIN";
            case 1:
                return "PAIRING_VARIANT_PASSKEY";
            case 2:
                return "PAIRING_VARIANT_PASSKEY_CONFIRMATION";
            case 3:
                return "PAIRING_VARIANT_CONSENT";
            case 4:
                return "PAIRING_VARIANT_DISPLAY_PASSKEY";
            case 5:
                return "PAIRING_VARIANT_DISPLAY_PIN";
            case 6:
                return "PAIRING_VARIANT_OOB_CONSENT";
            default:
                return "UNKNOWN (" + i + ")";
        }
    }

    /* renamed from: c */
    public static String m77155c(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char[] cArr = new char[(bArr.length * 3) - 1];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = bArr[i] & UByte.MAX_VALUE;
                int i3 = i * 3;
                char[] cArr2 = f42958a;
                cArr[i3] = cArr2[i2 >>> 4];
                cArr[i3 + 1] = cArr2[i2 & 15];
                if (i != bArr.length - 1) {
                    cArr[i3 + 2] = CoreConstants.DASH_CHAR;
                }
            }
            return "(0x) " + new String(cArr);
        }
        return "";
    }

    /* renamed from: d */
    public static String m77154d(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return "UNKNOWN (" + i + ")";
                }
                return "S8";
            }
            return "S2";
        }
        return "No preferred";
    }

    /* renamed from: e */
    public static String m77153e(int i) {
        switch (i) {
            case 1:
                return "LE 1M";
            case 2:
                return "LE 2M";
            case 3:
                return "LE 1M or LE 2M";
            case 4:
                return "LE Coded";
            case 5:
                return "LE 1M or LE Coded";
            case 6:
                return "LE 2M or LE Coded";
            case 7:
                return "LE 1M, LE 2M or LE Coded";
            default:
                return "UNKNOWN (" + i + ")";
        }
    }

    /* renamed from: f */
    public static String m77152f(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "UNKNOWN (" + i + ")";
                }
                return "LE Coded";
            }
            return "LE 2M";
        }
        return "LE 1M";
    }

    /* renamed from: g */
    public static String m77151g(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "UNKNOWN (" + i + ")";
                    }
                    return "DISCONNECTING";
                }
                return "CONNECTED";
            }
            return "CONNECTING";
        }
        return "DISCONNECTED";
    }

    /* renamed from: h */
    public static String m77150h(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return "UNKNOWN (" + i + ")";
                }
                return "WRITE SIGNED";
            }
            return "WRITE REQUEST";
        }
        return "WRITE COMMAND";
    }
}
