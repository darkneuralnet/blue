package com.stripe.android.p049ui.core.elements;

import com.stripe.android.model.Source;
import com.stripe.android.p049ui.core.C19369R;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/KlarnaHelper;", "", "()V", "buyNowCountries", "", "", "currencyToAllowedCountries", "", "getAllowedCountriesForCurrency", "currencyCode", "getKlarnaHeader", "", "locale", "Ljava/util/Locale;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.KlarnaHelper */
/* loaded from: classes7.dex */
public final class KlarnaHelper {
    public static final int $stable;
    public static final KlarnaHelper INSTANCE = new KlarnaHelper();
    private static final Set<String> buyNowCountries;
    private static final Map<String, Set<String>> currencyToAllowedCountries;

    static {
        Set of;
        Set of2;
        Set of3;
        Set of4;
        Set of5;
        Set of6;
        Map<String, Set<String>> mapOf;
        Set<String> of7;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"AT", "FI", "DE", "NL", "BE", "ES", "IT", "FR"});
        of2 = SetsKt__SetsJVMKt.setOf("DK");
        of3 = SetsKt__SetsJVMKt.setOf("NO");
        of4 = SetsKt__SetsJVMKt.setOf("SE");
        of5 = SetsKt__SetsJVMKt.setOf("GB");
        of6 = SetsKt__SetsJVMKt.setOf("US");
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(Source.EURO, of), TuplesKt.m28425to("dkk", of2), TuplesKt.m28425to("nok", of3), TuplesKt.m28425to("sek", of4), TuplesKt.m28425to("gbp", of5), TuplesKt.m28425to(Source.USD, of6));
        currencyToAllowedCountries = mapOf;
        of7 = SetsKt__SetsKt.setOf((Object[]) new String[]{"AT", "BE", "DE", "IT", "NL", "ES", "SE"});
        buyNowCountries = of7;
        $stable = 8;
    }

    private KlarnaHelper() {
    }

    public static /* synthetic */ int getKlarnaHeader$default(KlarnaHelper klarnaHelper, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return klarnaHelper.getKlarnaHeader(locale);
    }

    public final Set<String> getAllowedCountriesForCurrency(String str) {
        Set<String> emptySet;
        Set<String> set = currencyToAllowedCountries.get(str);
        if (set == null) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        }
        return set;
    }

    public final int getKlarnaHeader(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (buyNowCountries.contains(locale.getCountry())) {
            return C19369R.string.klarna_buy_now_pay_later;
        }
        return C19369R.string.klarna_pay_later;
    }
}
