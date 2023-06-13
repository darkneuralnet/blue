package com.stripe.android.core.model;

import com.stripe.android.core.model.CountryCode;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0007J\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u0011J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0007J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0007H\u0007J\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0007J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0013\u001a\u00020\u0007H\u0007J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/core/model/CountryUtils;", "", "()V", "CARD_POSTAL_CODE_COUNTRIES", "", "", "cachedCountriesLocale", "Ljava/util/Locale;", "cachedOrderedLocalizedCountries", "", "Lcom/stripe/android/core/model/Country;", "doesCountryUsePostalCode", "", "countryCode", "Lcom/stripe/android/core/model/CountryCode;", "formatNameForSorting", "name", "formatNameForSorting$stripe_core_release", "getCountryByCode", "currentLocale", "getCountryCodeByName", "countryName", "getDisplayCountry", "getOrderedCountries", "getSortedLocalizedCountries", "localizedCountries", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCountryUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryUtils.kt\ncom/stripe/android/core/model/CountryUtils\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n11335#2:104\n11670#2,3:105\n288#3,2:108\n288#3,2:110\n288#3,2:112\n819#3:114\n847#3,2:115\n1045#3:117\n*S KotlinDebug\n*F\n+ 1 CountryUtils.kt\ncom/stripe/android/core/model/CountryUtils\n*L\n17#1:104\n17#1:105,3\n32#1:108,2\n37#1:110,2\n90#1:112,2\n95#1:114\n95#1:115,2\n96#1:117\n*E\n"})
/* loaded from: classes6.dex */
public final class CountryUtils {
    private static final Set<String> CARD_POSTAL_CODE_COUNTRIES;
    public static final CountryUtils INSTANCE = new CountryUtils();
    private static Locale cachedCountriesLocale;
    private static List<Country> cachedOrderedLocalizedCountries;

    static {
        Set<String> of;
        List<Country> emptyList;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"US", "GB", "CA"});
        CARD_POSTAL_CODE_COUNTRIES = of;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        cachedOrderedLocalizedCountries = emptyList;
    }

    private CountryUtils() {
    }

    private final List<Country> getSortedLocalizedCountries(Locale locale) {
        Object obj;
        List listOfNotNull;
        List sortedWith;
        List<Country> plus;
        if (Intrinsics.areEqual(locale, cachedCountriesLocale)) {
            return cachedOrderedLocalizedCountries;
        }
        cachedCountriesLocale = locale;
        List<Country> localizedCountries = localizedCountries(locale);
        Iterator<T> it = localizedCountries.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((Country) obj).getCode(), CountryCodeKt.getCountryCode(locale))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(obj);
        List list = listOfNotNull;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : localizedCountries) {
            if (!Intrinsics.areEqual(((Country) obj2).getCode(), CountryCodeKt.getCountryCode(locale))) {
                arrayList.add(obj2);
            }
        }
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.stripe.android.core.model.CountryUtils$getSortedLocalizedCountries$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                CountryUtils countryUtils = CountryUtils.INSTANCE;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(countryUtils.formatNameForSorting$stripe_core_release(((Country) t).getName()), countryUtils.formatNameForSorting$stripe_core_release(((Country) t2).getName()));
                return compareValues;
            }
        });
        plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) sortedWith);
        cachedOrderedLocalizedCountries = plus;
        return plus;
    }

    private final List<Country> localizedCountries(Locale locale) {
        String[] iSOCountries = Locale.getISOCountries();
        Intrinsics.checkNotNullExpressionValue(iSOCountries, "getISOCountries()");
        ArrayList arrayList = new ArrayList(iSOCountries.length);
        for (String code : iSOCountries) {
            CountryCode.Companion companion = CountryCode.Companion;
            Intrinsics.checkNotNullExpressionValue(code, "code");
            CountryCode create = companion.create(code);
            String displayCountry = new Locale("", code).getDisplayCountry(locale);
            Intrinsics.checkNotNullExpressionValue(displayCountry, "Locale(\"\", code).getDisplayCountry(currentLocale)");
            arrayList.add(new Country(create, displayCountry));
        }
        return arrayList;
    }

    @Deprecated(message = "Use with parameter CountryCode", replaceWith = @ReplaceWith(expression = "CountryUtils.doesCountryUsePostalCode(CountryCode.create(countryCode))", imports = {"com.stripe.android.model.CountryCode"}))
    public final /* synthetic */ boolean doesCountryUsePostalCode(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Set<String> set = CARD_POSTAL_CODE_COUNTRIES;
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return set.contains(upperCase);
    }

    public final String formatNameForSorting$stripe_core_release(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String lowerCase = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String normalize = Normalizer.normalize(lowerCase, Normalizer.Form.NFD);
        Intrinsics.checkNotNullExpressionValue(normalize, "normalize(name.lowercase(), Normalizer.Form.NFD)");
        return new Regex("\\p{Mn}+").replace(normalize, "");
    }

    public final /* synthetic */ Country getCountryByCode(CountryCode countryCode, Locale currentLocale) {
        Object obj;
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        Iterator<T> it = getSortedLocalizedCountries(currentLocale).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((Country) obj).getCode(), countryCode)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Country) obj;
    }

    public final /* synthetic */ CountryCode getCountryCodeByName(String countryName, Locale currentLocale) {
        Object obj;
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        Iterator<T> it = getSortedLocalizedCountries(currentLocale).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((Country) obj).getName(), countryName)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Country country = (Country) obj;
        if (country == null) {
            return null;
        }
        return country.getCode();
    }

    public final /* synthetic */ String getDisplayCountry(CountryCode countryCode, Locale currentLocale) {
        String name;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        Country countryByCode = getCountryByCode(countryCode, currentLocale);
        if (countryByCode == null || (name = countryByCode.getName()) == null) {
            String displayCountry = new Locale("", countryCode.getValue()).getDisplayCountry(currentLocale);
            Intrinsics.checkNotNullExpressionValue(displayCountry, "Locale(\"\", countryCode.v…layCountry(currentLocale)");
            return displayCountry;
        }
        return name;
    }

    public final /* synthetic */ List getOrderedCountries(Locale currentLocale) {
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        return getSortedLocalizedCountries(currentLocale);
    }

    public final /* synthetic */ boolean doesCountryUsePostalCode(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return CARD_POSTAL_CODE_COUNTRIES.contains(countryCode.getValue());
    }
}
