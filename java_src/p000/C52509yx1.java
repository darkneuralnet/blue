package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b\u001a\u0015\u0010\r\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u000b¨\u0006\u000f"}, m28432d2 = {"Ljava/text/NumberFormat;", "", "show", "Ljava/util/Currency;", "currency", "", "e", "b", "Ljava/util/Locale;", "locale", "c", "Ljava/math/BigDecimal;", LegacyRepairType.OTHER_KEY, DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "localization_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: yx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52509yx1 {
    /* renamed from: a */
    public static final boolean m2226a(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        if (m2223d(bigDecimal, ONE).compareTo(BigDecimal.ZERO) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m2225b() {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return m2224c(locale);
    }

    /* renamed from: c */
    public static final boolean m2224c(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            byte directionality = Character.getDirectionality(locale.getDisplayName().charAt(0));
            if (directionality != 1 && directionality != 2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static final BigDecimal m2223d(BigDecimal bigDecimal, BigDecimal other) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal remainder = bigDecimal.remainder(other);
        Intrinsics.checkNotNullExpressionValue(remainder, "this.remainder(other)");
        return remainder;
    }

    /* renamed from: e */
    public static final void m2222e(NumberFormat numberFormat, boolean z, Currency currency) {
        Intrinsics.checkNotNullParameter(numberFormat, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (z) {
            numberFormat.setMinimumFractionDigits(currency.getDefaultFractionDigits());
            numberFormat.setMaximumFractionDigits(currency.getDefaultFractionDigits());
            return;
        }
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        numberFormat.setMinimumFractionDigits(0);
        numberFormat.setMaximumFractionDigits(0);
    }
}
