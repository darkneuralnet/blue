package p000;

import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0007¨\u0006\u0004"}, m28432d2 = {"", "", C17296a.f69688o, "b", "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: WE0 */
/* loaded from: classes4.dex */
public final class WE0 {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r2.equals("NOK") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        if (r2.equals("DKK") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        return p000.C48193rg4.ic_rosette_sek;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r2.equals("SEK") == false) goto L36;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m78690a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = str.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        switch (upperCase.hashCode()) {
            case 67748:
                break;
            case 69026:
                if (upperCase.equals("EUR")) {
                    return C48193rg4.ic_rosette_eur;
                }
                return C48193rg4.ic_rosette_usd;
            case 70357:
                if (upperCase.equals("GBP")) {
                    return C48193rg4.ic_rosette_gbp;
                }
                return C48193rg4.ic_rosette_usd;
            case 70446:
                if (upperCase.equals("GEL")) {
                    return C48193rg4.ic_rosette_gel;
                }
                return C48193rg4.ic_rosette_usd;
            case 72592:
                if (upperCase.equals("ILS")) {
                    return C48193rg4.ic_rosette_ils;
                }
                return C48193rg4.ic_rosette_usd;
            case 77482:
                break;
            case 79192:
                if (upperCase.equals("PHP")) {
                    return C48193rg4.ic_rosette_php;
                }
                return C48193rg4.ic_rosette_usd;
            case 79314:
                if (upperCase.equals("PLN")) {
                    return C48193rg4.ic_rosette_pln;
                }
                return C48193rg4.ic_rosette_usd;
            case 81977:
                break;
            default:
                return C48193rg4.ic_rosette_usd;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r2.equals("NOK") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        if (r2.equals("DKK") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        return p000.C48193rg4.ic_rosette_sek_filled;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r2.equals("SEK") == false) goto L36;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m78689b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = str.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        switch (upperCase.hashCode()) {
            case 67748:
                break;
            case 69026:
                if (upperCase.equals("EUR")) {
                    return C48193rg4.ic_rosette_eur_filled;
                }
                return C48193rg4.ic_rosette_usd_filled;
            case 70357:
                if (upperCase.equals("GBP")) {
                    return C48193rg4.ic_rosette_gbp_filled;
                }
                return C48193rg4.ic_rosette_usd_filled;
            case 70446:
                if (upperCase.equals("GEL")) {
                    return C48193rg4.ic_rosette_gel_filled;
                }
                return C48193rg4.ic_rosette_usd_filled;
            case 72592:
                if (upperCase.equals("ILS")) {
                    return C48193rg4.ic_rosette_ils_filled;
                }
                return C48193rg4.ic_rosette_usd_filled;
            case 77482:
                break;
            case 79192:
                if (upperCase.equals("PHP")) {
                    return C48193rg4.ic_rosette_php_filled;
                }
                return C48193rg4.ic_rosette_usd_filled;
            case 79314:
                if (upperCase.equals("PLN")) {
                    return C48193rg4.ic_rosette_pln_filled;
                }
                return C48193rg4.ic_rosette_usd_filled;
            case 81977:
                break;
            default:
                return C48193rg4.ic_rosette_usd_filled;
        }
    }
}
