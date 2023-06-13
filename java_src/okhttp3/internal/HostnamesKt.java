package okhttp3.internal;

import ch.qos.logback.core.CoreConstants;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.stripe.android.model.PaymentMethod;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, m28432d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, m28431k = 2, m28430mv = {1, 6, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int indexOf$default;
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (Intrinsics.compare((int) charAt, 31) > 0 && Intrinsics.compare((int) charAt, 127) < 0) {
                indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", charAt, 0, false, 6, (Object) null);
                if (indexOf$default != -1) {
                    return true;
                }
                i = i2;
            } else {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (Intrinsics.compare((int) charAt, 48) < 0 || Intrinsics.compare((int) charAt, 57) > 0) {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
        if (r13 == 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
        if (r14 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InetAddress decodeIpv6(String str, int i, int i2) {
        boolean startsWith$default;
        boolean startsWith$default2;
        int i3;
        boolean startsWith$default3;
        byte[] bArr = new byte[16];
        int i4 = i;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        while (true) {
            if (i4 < i2) {
                if (i7 == 16) {
                    return null;
                }
                int i8 = i4 + 2;
                if (i8 <= i2) {
                    startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(str, "::", i4, false, 4, null);
                    if (startsWith$default3) {
                        if (i5 != -1) {
                            return null;
                        }
                        i7 += 2;
                        if (i8 == i2) {
                            i5 = i7;
                            break;
                        }
                        i6 = i8;
                        i5 = i7;
                        i4 = i6;
                        int i9 = 0;
                        while (i4 < i2) {
                            int parseHexDigit = Util.parseHexDigit(str.charAt(i4));
                            if (parseHexDigit == -1) {
                                break;
                            }
                            i9 = (i9 << 4) + parseHexDigit;
                            i4++;
                        }
                        i3 = i4 - i6;
                        if (i3 == 0 || i3 > 4) {
                            break;
                        }
                        int i10 = i7 + 1;
                        bArr[i7] = (byte) ((i9 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        i7 = i10 + 1;
                        bArr[i10] = (byte) (i9 & KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                }
                if (i7 != 0) {
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, ":", i4, false, 4, null);
                    if (!startsWith$default) {
                        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str, InstructionFileId.DOT, i4, false, 4, null);
                        if (!startsWith$default2 || !decodeIpv4Suffix(str, i6, i2, bArr, i7 - 2)) {
                            return null;
                        }
                        i7 += 2;
                    } else {
                        i4++;
                    }
                }
                i6 = i4;
                i4 = i6;
                int i92 = 0;
                while (i4 < i2) {
                }
                i3 = i4 - i6;
                if (i3 == 0) {
                    break;
                }
                break;
            }
            break;
        }
        return null;
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C42488i30 c42488i30 = new C42488i30();
        while (i2 < bArr.length) {
            if (i2 == i) {
                c42488i30.mo24534M0(58);
                i2 += i4;
                if (i2 == 16) {
                    c42488i30.mo24534M0(58);
                }
            } else {
                if (i2 > 0) {
                    c42488i30.mo24534M0(58);
                }
                c42488i30.mo24525g1((Util.and(bArr[i2], (int) KotlinVersion.MAX_COMPONENT_VALUE) << 8) | Util.and(bArr[i2 + 1], (int) KotlinVersion.MAX_COMPONENT_VALUE));
                i2 += 2;
            }
        }
        return c42488i30.mo21932r1();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String toCanonicalHost(String str) {
        boolean contains$default;
        boolean startsWith$default;
        InetAddress decodeIpv6;
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        boolean z = false;
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ":", false, 2, (Object) null);
        if (contains$default) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "[", false, 2, null);
            if (startsWith$default) {
                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str, "]", false, 2, null);
                if (endsWith$default) {
                    decodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
                    if (decodeIpv6 != null) {
                        return null;
                    }
                    byte[] address = decodeIpv6.getAddress();
                    if (address.length == 16) {
                        Intrinsics.checkNotNullExpressionValue(address, "address");
                        return inet6AddressToAscii(address);
                    } else if (address.length == 4) {
                        return decodeIpv6.getHostAddress();
                    } else {
                        throw new AssertionError("Invalid IPv6 address: '" + str + CoreConstants.SINGLE_QUOTE_CHAR);
                    }
                }
            }
            decodeIpv6 = decodeIpv6(str, 0, str.length());
            if (decodeIpv6 != null) {
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    z = true;
                }
                if (z) {
                    return null;
                }
                if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }
}
