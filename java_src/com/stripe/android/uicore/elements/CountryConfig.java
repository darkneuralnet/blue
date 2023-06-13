package com.stripe.android.uicore.elements;

import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.uicore.C19423R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B_\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\u0010\u000eJ\u0010\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u001bH\u0016R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u001a\u001a\u00020\u001b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u0006*"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/CountryConfig;", "Lcom/stripe/android/uicore/elements/DropdownConfig;", "onlyShowCountryCodes", "", "", "locale", "Ljava/util/Locale;", "tinyMode", "", "disableDropdownWithSingleElement", "collapsedLabelMapper", "Lkotlin/Function1;", "Lcom/stripe/android/core/model/Country;", "expandedLabelMapper", "(Ljava/util/Set;Ljava/util/Locale;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "countries", "", "getCountries$stripe_ui_core_release", "()Ljava/util/List;", "debugLabel", "getDebugLabel", "()Ljava/lang/String;", "getDisableDropdownWithSingleElement", "()Z", "displayItems", "getDisplayItems", "label", "", "getLabel", "()I", "getLocale", "()Ljava/util/Locale;", "getOnlyShowCountryCodes", "()Ljava/util/Set;", "rawItems", "getRawItems", "getTinyMode", "convertFromRaw", "rawValue", "getSelectedItemLabel", "index", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCountryConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryConfig.kt\ncom/stripe/android/uicore/elements/CountryConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n766#2:77\n857#2,2:78\n1549#2:80\n1620#2,3:81\n1549#2:84\n1620#2,3:85\n1#3:88\n*S KotlinDebug\n*F\n+ 1 CountryConfig.kt\ncom/stripe/android/uicore/elements/CountryConfig\n*L\n39#1:77\n39#1:78,2\n43#1:80\n43#1:81,3\n45#1:84\n45#1:85,3\n*E\n"})
/* loaded from: classes7.dex */
public final class CountryConfig implements DropdownConfig {
    private final Function1<Country, String> collapsedLabelMapper;
    private final List<Country> countries;
    private final String debugLabel;
    private final boolean disableDropdownWithSingleElement;
    private final List<String> displayItems;
    private final int label;
    private final Locale locale;
    private final Set<String> onlyShowCountryCodes;
    private final List<String> rawItems;
    private final boolean tinyMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "country", "Lcom/stripe/android/core/model/Country;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.uicore.elements.CountryConfig$1 */
    /* loaded from: classes7.dex */
    public static final class C194491 extends Lambda implements Function1<Country, String> {
        public static final C194491 INSTANCE = new C194491();

        public C194491() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Country country) {
            Intrinsics.checkNotNullParameter(country, "country");
            return country.getName();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "country", "Lcom/stripe/android/core/model/Country;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.uicore.elements.CountryConfig$2 */
    /* loaded from: classes7.dex */
    public static final class C194502 extends Lambda implements Function1<Country, String> {
        public static final C194502 INSTANCE = new C194502();

        public C194502() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Country country) {
            Intrinsics.checkNotNullParameter(country, "country");
            String countryCodeToEmoji$stripe_ui_core_release = CountryConfig.Companion.countryCodeToEmoji$stripe_ui_core_release(country.getCode().getValue());
            String name = country.getName();
            return countryCodeToEmoji$stripe_ui_core_release + " " + name;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/CountryConfig$Companion;", "", "()V", "countryCodeToEmoji", "", "countryCode", "countryCodeToEmoji$stripe_ui_core_release", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String countryCodeToEmoji$stripe_ui_core_release(String countryCode) {
            char[] plus;
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            if (countryCode.length() != 2) {
                return "🌐";
            }
            char[] chars = Character.toChars((Character.codePointAt(countryCode, 0) - 65) + 127462);
            Intrinsics.checkNotNullExpressionValue(chars, "toChars(firstLetter)");
            char[] chars2 = Character.toChars((Character.codePointAt(countryCode, 1) - 65) + 127462);
            Intrinsics.checkNotNullExpressionValue(chars2, "toChars(secondLetter)");
            plus = ArraysKt___ArraysJvmKt.plus(chars, chars2);
            return new String(plus);
        }

        private Companion() {
        }
    }

    public CountryConfig() {
        this(null, null, false, false, null, null, 63, null);
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String convertFromRaw(String rawValue) {
        Object firstOrNull;
        boolean z;
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        CountryUtils countryUtils = CountryUtils.INSTANCE;
        CountryCode create = CountryCode.Companion.create(rawValue);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        Country countryByCode = countryUtils.getCountryByCode(create, locale);
        if (countryByCode != null) {
            Integer valueOf = Integer.valueOf(this.countries.indexOf(countryByCode));
            if (valueOf.intValue() == -1) {
                z = true;
            } else {
                z = false;
            }
            String str = null;
            if (z) {
                valueOf = null;
            }
            if (valueOf != null) {
                str = getDisplayItems().get(valueOf.intValue());
            }
            if (str != null) {
                return str;
            }
        }
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) getDisplayItems());
        String str2 = (String) firstOrNull;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final List<Country> getCountries$stripe_ui_core_release() {
        return this.countries;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public boolean getDisableDropdownWithSingleElement() {
        return this.disableDropdownWithSingleElement;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public List<String> getDisplayItems() {
        return this.displayItems;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public int getLabel() {
        return this.label;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final Set<String> getOnlyShowCountryCodes() {
        return this.onlyShowCountryCodes;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public List<String> getRawItems() {
        return this.rawItems;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String getSelectedItemLabel(int i) {
        Object orNull;
        String invoke;
        orNull = CollectionsKt___CollectionsKt.getOrNull(this.countries, i);
        Country country = (Country) orNull;
        return (country == null || (invoke = this.collapsedLabelMapper.invoke(country)) == null) ? "" : invoke;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public boolean getTinyMode() {
        return this.tinyMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CountryConfig(Set<String> onlyShowCountryCodes, Locale locale, boolean z, boolean z2, Function1<? super Country, String> collapsedLabelMapper, Function1<? super Country, String> expandedLabelMapper) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(onlyShowCountryCodes, "onlyShowCountryCodes");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(collapsedLabelMapper, "collapsedLabelMapper");
        Intrinsics.checkNotNullParameter(expandedLabelMapper, "expandedLabelMapper");
        this.onlyShowCountryCodes = onlyShowCountryCodes;
        this.locale = locale;
        this.tinyMode = z;
        this.disableDropdownWithSingleElement = z2;
        this.collapsedLabelMapper = collapsedLabelMapper;
        this.debugLabel = "country";
        this.label = C19423R.string.address_label_country_or_region;
        ArrayList arrayList = new ArrayList();
        for (Object obj : CountryUtils.INSTANCE.getOrderedCountries(locale)) {
            if (this.onlyShowCountryCodes.isEmpty() || this.onlyShowCountryCodes.contains(((Country) obj).getCode().getValue())) {
                arrayList.add(obj);
            }
        }
        this.countries = arrayList;
        ArrayList<Country> arrayList2 = arrayList;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        for (Country country : arrayList2) {
            arrayList3.add(country.getCode().getValue());
        }
        this.rawItems = arrayList3;
        List<Country> list = this.countries;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
        for (Object obj2 : list) {
            arrayList4.add(expandedLabelMapper.invoke(obj2));
        }
        this.displayItems = arrayList4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CountryConfig(Set set, Locale locale, boolean z, boolean z2, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, locale, (i & 4) != 0 ? false : z, (i & 8) == 0 ? z2 : false, (i & 16) != 0 ? C194491.INSTANCE : function1, (i & 32) != 0 ? C194502.INSTANCE : function12);
        set = (i & 1) != 0 ? SetsKt__SetsKt.emptySet() : set;
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
    }
}
