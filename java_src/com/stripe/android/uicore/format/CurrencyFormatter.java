package com.stripe.android.uicore.format;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J \u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/uicore/format/CurrencyFormatter;", "", "()V", "MAJOR_UNIT_BASE", "", "SERVER_DECIMAL_DIGITS", "", "", "", "", "format", "amount", "", "amountCurrency", "Ljava/util/Currency;", "targetLocale", "Ljava/util/Locale;", "amountCurrencyCode", "getDefaultDecimalDigits", "currency", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCurrencyFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyFormatter.kt\ncom/stripe/android/uicore/format/CurrencyFormatter\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,87:1\n515#2:88\n500#2,6:89\n125#3:95\n152#3,3:96\n*S KotlinDebug\n*F\n+ 1 CurrencyFormatter.kt\ncom/stripe/android/uicore/format/CurrencyFormatter\n*L\n80#1:88\n80#1:89,6\n82#1:95\n82#1:96,3\n*E\n"})
/* loaded from: classes7.dex */
public final class CurrencyFormatter {
    public static final int $stable;
    public static final CurrencyFormatter INSTANCE = new CurrencyFormatter();
    private static final double MAJOR_UNIT_BASE = 10.0d;
    private static final Map<Set<String>, Integer> SERVER_DECIMAL_DIGITS;

    static {
        Set of;
        Map<Set<String>, Integer> mapOf;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"UGX", "AFN", "ALL", "AMD", "COP", "IDR", "ISK", "PKR", "LBP", "MMK"});
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(of, 2));
        SERVER_DECIMAL_DIGITS = mapOf;
        $stable = 8;
    }

    private CurrencyFormatter() {
    }

    public static /* synthetic */ String format$default(CurrencyFormatter currencyFormatter, long j, String str, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return currencyFormatter.format(j, str, locale);
    }

    private final int getDefaultDecimalDigits(Currency currency) {
        Object firstOrNull;
        Map<Set<String>, Integer> map = SERVER_DECIMAL_DIGITS;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Set<String>, Integer> entry : map.entrySet()) {
            String currencyCode = currency.getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode, "currency.currencyCode");
            String upperCase = currencyCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (entry.getKey().contains(upperCase)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(Integer.valueOf(((Number) entry2.getValue()).intValue()));
        }
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
        Integer num = (Integer) firstOrNull;
        if (num != null) {
            return num.intValue();
        }
        return currency.getDefaultFractionDigits();
    }

    public final String format(long j, String amountCurrencyCode, Locale targetLocale) {
        Intrinsics.checkNotNullParameter(amountCurrencyCode, "amountCurrencyCode");
        Intrinsics.checkNotNullParameter(targetLocale, "targetLocale");
        String upperCase = amountCurrencyCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        Currency currency = Currency.getInstance(upperCase);
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(amountCurrencyCode.uppercase())");
        return format(j, currency, targetLocale);
    }

    public static /* synthetic */ String format$default(CurrencyFormatter currencyFormatter, long j, Currency currency, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return currencyFormatter.format(j, currency, locale);
    }

    public final String format(long j, Currency amountCurrency, Locale targetLocale) {
        Intrinsics.checkNotNullParameter(amountCurrency, "amountCurrency");
        Intrinsics.checkNotNullParameter(targetLocale, "targetLocale");
        int defaultDecimalDigits = getDefaultDecimalDigits(amountCurrency);
        double pow = j / Math.pow(MAJOR_UNIT_BASE, defaultDecimalDigits);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(targetLocale);
        try {
            Result.Companion companion = Result.Companion;
            Intrinsics.checkNotNull(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrency(amountCurrency);
            decimalFormatSymbols.setCurrencySymbol(amountCurrency.getSymbol(targetLocale));
            ((DecimalFormat) currencyInstance).setMinimumFractionDigits(defaultDecimalDigits);
            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        String format = currencyInstance.format(pow);
        Intrinsics.checkNotNullExpressionValue(format, "currencyFormat.format(majorUnitAmount)");
        return format;
    }
}
