package com.stripe.android.uicore.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.uicore.elements.PhoneNumberFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.CharRange;
import kotlin.text.StringsKt__StringsJVMKt;
@kotlin.Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00132\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;", "", "", "input", "userInputFilter", "toE164Format", "getPrefix", "()Ljava/lang/String;", "prefix", "getPlaceholder", "placeholder", "getCountryCode", "countryCode", "LEu6;", "getVisualTransformation", "()LEu6;", "visualTransformation", "<init>", "()V", "Companion", "Metadata", "UnknownRegion", "WithRegion", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion;", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public abstract class PhoneNumberFormatter {
    private static final int COUNTRY_PREFIX_MAX_LENGTH = 5;
    private static final int E164_MAX_DIGITS = 15;
    private static final Map<String, Metadata> allMetadata;
    public static final Companion Companion = new Companion(null);
    private static final CharRange VALID_INPUT_RANGE = new CharRange('0', '9');

    @kotlin.Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0002J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;", "", "", "prefix", "Lvv2;", "userLocales", "findBestCountryForPrefix", "", "countryCodesForPrefix", "countryCode", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;", "forCountry", "phoneNumber", "forPrefix", "", "lengthForCountry", "(Ljava/lang/String;)Ljava/lang/Integer;", "prefixForCountry$stripe_ui_core_release", "(Ljava/lang/String;)Ljava/lang/String;", "prefixForCountry", "Lkotlin/ranges/CharRange;", "VALID_INPUT_RANGE", "Lkotlin/ranges/CharRange;", "getVALID_INPUT_RANGE", "()Lkotlin/ranges/CharRange;", "COUNTRY_PREFIX_MAX_LENGTH", "I", "E164_MAX_DIGITS", "", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;", "allMetadata", "Ljava/util/Map;", "<init>", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPhoneNumberFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberFormatter.kt\ncom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,489:1\n1#2:490\n1099#3,3:491\n515#4:494\n500#4,6:495\n125#5:501\n152#5,3:502\n*S KotlinDebug\n*F\n+ 1 PhoneNumberFormatter.kt\ncom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion\n*L\n233#1:491,3\n236#1:494\n236#1:495,6\n236#1:501\n236#1:502,3\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<String> countryCodesForPrefix(String str) {
            Map map = PhoneNumberFormatter.allMetadata;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (Intrinsics.areEqual(((Metadata) entry.getValue()).getPrefix(), str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList.add(((Metadata) entry2.getValue()).getRegionCode());
            }
            return arrayList;
        }

        private final String findBestCountryForPrefix(String str, C50711vv2 c50711vv2) {
            Object first;
            List<String> countryCodesForPrefix = countryCodesForPrefix(str);
            if (!(!countryCodesForPrefix.isEmpty())) {
                countryCodesForPrefix = null;
            }
            if (countryCodesForPrefix == null) {
                return null;
            }
            int m7766h = c50711vv2.m7766h();
            for (int i = 0; i < m7766h; i++) {
                Locale m7771c = c50711vv2.m7771c(i);
                Intrinsics.checkNotNull(m7771c);
                if (countryCodesForPrefix.contains(m7771c.getCountry())) {
                    return m7771c.getCountry();
                }
            }
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) countryCodesForPrefix);
            return (String) first;
        }

        public final PhoneNumberFormatter forCountry(String countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Map map = PhoneNumberFormatter.allMetadata;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Metadata metadata = (Metadata) map.get(upperCase);
            if (metadata != null) {
                return new WithRegion(metadata);
            }
            return new UnknownRegion(countryCode);
        }

        /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final PhoneNumberFormatter forPrefix(String phoneNumber) {
            int lastIndex;
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            int i = 1;
            while (i < lastIndex && i < 4) {
                i++;
                String substring = phoneNumber.substring(0, i);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                C50711vv2 m7770d = C50711vv2.m7770d();
                Intrinsics.checkNotNullExpressionValue(m7770d, "getAdjustedDefault()");
                String findBestCountryForPrefix = findBestCountryForPrefix(substring, m7770d);
                if (findBestCountryForPrefix != null) {
                    return forCountry(findBestCountryForPrefix);
                }
            }
            return null;
        }

        public final CharRange getVALID_INPUT_RANGE() {
            return PhoneNumberFormatter.VALID_INPUT_RANGE;
        }

        public final Integer lengthForCountry(String countryCode) {
            String pattern;
            boolean z;
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Map map = PhoneNumberFormatter.allMetadata;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Metadata metadata = (Metadata) map.get(upperCase);
            if (metadata != null && (pattern = metadata.getPattern()) != null) {
                int i = 0;
                for (int i2 = 0; i2 < pattern.length(); i2++) {
                    if (pattern.charAt(i2) == '#') {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            }
            return null;
        }

        public final String prefixForCountry$stripe_ui_core_release(String countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Map map = PhoneNumberFormatter.allMetadata;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Metadata metadata = (Metadata) map.get(upperCase);
            if (metadata != null) {
                return metadata.getPrefix();
            }
            return null;
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;", "", "prefix", "", "regionCode", "pattern", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPattern", "()Ljava/lang/String;", "getPrefix", "getRegionCode", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Metadata {
        public static final int $stable = 0;
        private final String pattern;
        private final String prefix;
        private final String regionCode;

        public Metadata(String prefix, String regionCode, String pattern) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(regionCode, "regionCode");
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.prefix = prefix;
            this.regionCode = regionCode;
            this.pattern = pattern;
        }

        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metadata.prefix;
            }
            if ((i & 2) != 0) {
                str2 = metadata.regionCode;
            }
            if ((i & 4) != 0) {
                str3 = metadata.pattern;
            }
            return metadata.copy(str, str2, str3);
        }

        public final String component1() {
            return this.prefix;
        }

        public final String component2() {
            return this.regionCode;
        }

        public final String component3() {
            return this.pattern;
        }

        public final Metadata copy(String prefix, String regionCode, String pattern) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(regionCode, "regionCode");
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            return new Metadata(prefix, regionCode, pattern);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Metadata) {
                Metadata metadata = (Metadata) obj;
                return Intrinsics.areEqual(this.prefix, metadata.prefix) && Intrinsics.areEqual(this.regionCode, metadata.regionCode) && Intrinsics.areEqual(this.pattern, metadata.pattern);
            }
            return false;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public final String getPrefix() {
            return this.prefix;
        }

        public final String getRegionCode() {
            return this.regionCode;
        }

        public int hashCode() {
            return (((this.prefix.hashCode() * 31) + this.regionCode.hashCode()) * 31) + this.pattern.hashCode();
        }

        public String toString() {
            String str = this.prefix;
            String str2 = this.regionCode;
            String str3 = this.pattern;
            return "Metadata(prefix=" + str + ", regionCode=" + str2 + ", pattern=" + str3 + ")";
        }
    }

    @kotlin.Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion;", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;", "", "input", "userInputFilter", "toE164Format", "countryCode", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "prefix", "getPrefix", "placeholder", "getPlaceholder", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "<init>", "(Ljava/lang/String;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPhoneNumberFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberFormatter.kt\ncom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,489:1\n429#2:490\n502#2,5:491\n*S KotlinDebug\n*F\n+ 1 PhoneNumberFormatter.kt\ncom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion\n*L\n162#1:490\n162#1:491,5\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class UnknownRegion extends PhoneNumberFormatter {
        public static final int $stable = 0;
        private final String countryCode;
        private final String placeholder;
        private final String prefix;
        private final InterfaceC32735Eu6 visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownRegion(String countryCode) {
            super(null);
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.countryCode = countryCode;
            this.prefix = "";
            this.placeholder = "+############";
            this.visualTransformation = PhoneNumberFormatter$UnknownRegion$visualTransformation$1.INSTANCE;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String getPrefix() {
            return this.prefix;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public InterfaceC32735Eu6 getVisualTransformation() {
            return this.visualTransformation;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String toE164Format(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            String userInputFilter = userInputFilter(input);
            return "+" + userInputFilter;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String userInputFilter(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            StringBuilder sb = new StringBuilder();
            int length = input.length();
            for (int i = 0; i < length; i++) {
                char charAt = input.charAt(i);
                if (PhoneNumberFormatter.Companion.getVALID_INPUT_RANGE().contains(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
            String substring = sb2.substring(0, Math.min(sb2.length(), 15));
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    @kotlin.Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;", "", "input", "userInputFilter", "toE164Format", "filteredInput", "formatNumberNational", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;", "metadata", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;", "prefix", "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "placeholder", "getPlaceholder", "countryCode", "getCountryCode", "", "maxSubscriberDigits", "I", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "<init>", "(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPhoneNumberFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberFormatter.kt\ncom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,489:1\n429#2:490\n502#2,5:491\n1174#2,2:496\n*S KotlinDebug\n*F\n+ 1 PhoneNumberFormatter.kt\ncom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion\n*L\n63#1:490\n63#1:491,5\n130#1:496,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class WithRegion extends PhoneNumberFormatter {
        public static final int $stable = 0;
        private final String countryCode;
        private final int maxSubscriberDigits;
        private final Metadata metadata;
        private final String placeholder;
        private final String prefix;
        private final InterfaceC32735Eu6 visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithRegion(Metadata metadata) {
            super(null);
            String replace$default;
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.metadata = metadata;
            this.prefix = metadata.getPrefix();
            replace$default = StringsKt__StringsJVMKt.replace$default(metadata.getPattern(), '#', '5', false, 4, (Object) null);
            this.placeholder = replace$default;
            this.countryCode = metadata.getRegionCode();
            this.maxSubscriberDigits = 15 - (getPrefix().length() - 1);
            this.visualTransformation = new InterfaceC32735Eu6() { // from class: com.stripe.android.uicore.elements.PhoneNumberFormatter$WithRegion$visualTransformation$1
                @Override // p000.InterfaceC32735Eu6
                public A96 filter(C1577Df text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    C1577Df c1577Df = new C1577Df(PhoneNumberFormatter.WithRegion.this.formatNumberNational(text.m110052j()), null, null, 6, null);
                    final PhoneNumberFormatter.WithRegion withRegion = PhoneNumberFormatter.WithRegion.this;
                    return new A96(c1577Df, new InterfaceC33290He3() { // from class: com.stripe.android.uicore.elements.PhoneNumberFormatter$WithRegion$visualTransformation$1$filter$1
                        @Override // p000.InterfaceC33290He3
                        public int originalToTransformed(int i) {
                            PhoneNumberFormatter.Metadata metadata2;
                            metadata2 = PhoneNumberFormatter.WithRegion.this.metadata;
                            String pattern = metadata2.getPattern();
                            if (i == 0) {
                                return 0;
                            }
                            int i2 = 0;
                            int i3 = 0;
                            int i4 = -1;
                            for (int i5 = 0; i5 < pattern.length(); i5++) {
                                i2++;
                                if (pattern.charAt(i5) == '#' && (i3 = i3 + 1) == i) {
                                    i4 = i2;
                                }
                            }
                            if (i4 == -1) {
                                return pattern.length() + 1 + (i - i3);
                            }
                            return i4;
                        }

                        @Override // p000.InterfaceC33290He3
                        public int transformedToOriginal(int i) {
                            PhoneNumberFormatter.Metadata metadata2;
                            boolean z;
                            if (i == 0) {
                                return 0;
                            }
                            metadata2 = PhoneNumberFormatter.WithRegion.this.metadata;
                            String pattern = metadata2.getPattern();
                            String substring = pattern.substring(0, Math.min(i, pattern.length()));
                            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            StringBuilder sb = new StringBuilder();
                            int length = substring.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                char charAt = substring.charAt(i2);
                                if (charAt != '#') {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    sb.append(charAt);
                                }
                            }
                            String sb2 = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
                            int length2 = sb2.length();
                            if (i > pattern.length()) {
                                length2++;
                            }
                            return i - length2;
                        }
                    });
                }
            };
        }

        public final String formatNumberNational(String filteredInput) {
            Intrinsics.checkNotNullParameter(filteredInput, "filteredInput");
            StringBuilder sb = new StringBuilder();
            String pattern = this.metadata.getPattern();
            int i = 0;
            for (int i2 = 0; i2 < pattern.length(); i2++) {
                char charAt = pattern.charAt(i2);
                if (i < filteredInput.length()) {
                    if (charAt == '#') {
                        charAt = filteredInput.charAt(i);
                        i++;
                    }
                    sb.append(charAt);
                }
            }
            if (i < filteredInput.length()) {
                sb.append(' ');
                String substring = filteredInput.substring(i);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                char[] charArray = substring.toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
                sb.append(charArray);
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "formatted.toString()");
            return sb2;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String getPrefix() {
            return this.prefix;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public InterfaceC32735Eu6 getVisualTransformation() {
            return this.visualTransformation;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String toE164Format(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            String prefix = getPrefix();
            String userInputFilter = userInputFilter(input);
            return prefix + userInputFilter;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String userInputFilter(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            StringBuilder sb = new StringBuilder();
            int length = input.length();
            for (int i = 0; i < length; i++) {
                char charAt = input.charAt(i);
                if (PhoneNumberFormatter.Companion.getVALID_INPUT_RANGE().contains(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
            String substring = sb2.substring(0, Math.min(sb2.length(), this.maxSubscriberDigits));
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    static {
        Map<String, Metadata> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("US", new Metadata("+1", "US", "(###) ###-####")), TuplesKt.m28425to("CA", new Metadata("+1", "CA", "(###) ###-####")), TuplesKt.m28425to("AG", new Metadata("+1", "AG", "(###) ###-####")), TuplesKt.m28425to("AS", new Metadata("+1", "AS", "(###) ###-####")), TuplesKt.m28425to("AI", new Metadata("+1", "AI", "(###) ###-####")), TuplesKt.m28425to("BB", new Metadata("+1", "BB", "(###) ###-####")), TuplesKt.m28425to("BM", new Metadata("+1", "BM", "(###) ###-####")), TuplesKt.m28425to("BS", new Metadata("+1", "BS", "(###) ###-####")), TuplesKt.m28425to("DM", new Metadata("+1", "DM", "(###) ###-####")), TuplesKt.m28425to("DO", new Metadata("+1", "DO", "(###) ###-####")), TuplesKt.m28425to("GD", new Metadata("+1", "GD", "(###) ###-####")), TuplesKt.m28425to("GU", new Metadata("+1", "GU", "(###) ###-####")), TuplesKt.m28425to("JM", new Metadata("+1", "JM", "(###) ###-####")), TuplesKt.m28425to("KN", new Metadata("+1", "KN", "(###) ###-####")), TuplesKt.m28425to("KY", new Metadata("+1", "KY", "(###) ###-####")), TuplesKt.m28425to("LC", new Metadata("+1", "LC", "(###) ###-####")), TuplesKt.m28425to("MP", new Metadata("+1", "MP", "(###) ###-####")), TuplesKt.m28425to("MS", new Metadata("+1", "MS", "(###) ###-####")), TuplesKt.m28425to("PR", new Metadata("+1", "PR", "(###) ###-####")), TuplesKt.m28425to("SX", new Metadata("+1", "SX", "(###) ###-####")), TuplesKt.m28425to("TC", new Metadata("+1", "TC", "(###) ###-####")), TuplesKt.m28425to("TT", new Metadata("+1", "TT", "(###) ###-####")), TuplesKt.m28425to("VC", new Metadata("+1", "VC", "(###) ###-####")), TuplesKt.m28425to("VG", new Metadata("+1", "VG", "(###) ###-####")), TuplesKt.m28425to("VI", new Metadata("+1", "VI", "(###) ###-####")), TuplesKt.m28425to("EG", new Metadata("+20", "EG", "### ### ####")), TuplesKt.m28425to("SS", new Metadata("+211", "SS", "### ### ###")), TuplesKt.m28425to("MA", new Metadata("+212", "MA", "###-######")), TuplesKt.m28425to("EH", new Metadata("+212", "EH", "###-######")), TuplesKt.m28425to("DZ", new Metadata("+213", "DZ", "### ## ## ##")), TuplesKt.m28425to("TN", new Metadata("+216", "TN", "## ### ###")), TuplesKt.m28425to("LY", new Metadata("+218", "LY", "##-#######")), TuplesKt.m28425to("GM", new Metadata("+220", "GM", "### ####")), TuplesKt.m28425to("SN", new Metadata("+221", "SN", "## ### ## ##")), TuplesKt.m28425to("MR", new Metadata("+222", "MR", "## ## ## ##")), TuplesKt.m28425to("ML", new Metadata("+223", "ML", "## ## ## ##")), TuplesKt.m28425to("GN", new Metadata("+224", "GN", "### ## ## ##")), TuplesKt.m28425to("CI", new Metadata("+225", "CI", "## ## ## ##")), TuplesKt.m28425to("BF", new Metadata("+226", "BF", "## ## ## ##")), TuplesKt.m28425to("NE", new Metadata("+227", "NE", "## ## ## ##")), TuplesKt.m28425to("TG", new Metadata("+228", "TG", "## ## ## ##")), TuplesKt.m28425to("BJ", new Metadata("+229", "BJ", "## ## ## ##")), TuplesKt.m28425to("MU", new Metadata("+230", "MU", "#### ####")), TuplesKt.m28425to("LR", new Metadata("+231", "LR", "### ### ###")), TuplesKt.m28425to("SL", new Metadata("+232", "SL", "## ######")), TuplesKt.m28425to("GH", new Metadata("+233", "GH", "## ### ####")), TuplesKt.m28425to("NG", new Metadata("+234", "NG", "### ### ####")), TuplesKt.m28425to("TD", new Metadata("+235", "TD", "## ## ## ##")), TuplesKt.m28425to("CF", new Metadata("+236", "CF", "## ## ## ##")), TuplesKt.m28425to("CM", new Metadata("+237", "CM", "## ## ## ##")), TuplesKt.m28425to("CV", new Metadata("+238", "CV", "### ## ##")), TuplesKt.m28425to("ST", new Metadata("+239", "ST", "### ####")), TuplesKt.m28425to("GQ", new Metadata("+240", "GQ", "### ### ###")), TuplesKt.m28425to("GA", new Metadata("+241", "GA", "## ## ## ##")), TuplesKt.m28425to("CG", new Metadata("+242", "CG", "## ### ####")), TuplesKt.m28425to("CD", new Metadata("+243", "CD", "### ### ###")), TuplesKt.m28425to("AO", new Metadata("+244", "AO", "### ### ###")), TuplesKt.m28425to("GW", new Metadata("+245", "GW", "### ####")), TuplesKt.m28425to("IO", new Metadata("+246", "IO", "### ####")), TuplesKt.m28425to("AC", new Metadata("+247", "AC", "")), TuplesKt.m28425to("SC", new Metadata("+248", "SC", "# ### ###")), TuplesKt.m28425to("RW", new Metadata("+250", "RW", "### ### ###")), TuplesKt.m28425to("ET", new Metadata("+251", "ET", "## ### ####")), TuplesKt.m28425to("SO", new Metadata("+252", "SO", "## #######")), TuplesKt.m28425to("DJ", new Metadata("+253", "DJ", "## ## ## ##")), TuplesKt.m28425to("KE", new Metadata("+254", "KE", "## #######")), TuplesKt.m28425to("TZ", new Metadata("+255", "TZ", "### ### ###")), TuplesKt.m28425to("UG", new Metadata("+256", "UG", "### ######")), TuplesKt.m28425to("BI", new Metadata("+257", "BI", "## ## ## ##")), TuplesKt.m28425to("MZ", new Metadata("+258", "MZ", "## ### ####")), TuplesKt.m28425to("ZM", new Metadata("+260", "ZM", "## #######")), TuplesKt.m28425to("MG", new Metadata("+261", "MG", "## ## ### ##")), TuplesKt.m28425to("RE", new Metadata("+262", "RE", "")), TuplesKt.m28425to("TF", new Metadata("+262", "TF", "")), TuplesKt.m28425to("YT", new Metadata("+262", "YT", "### ## ## ##")), TuplesKt.m28425to("ZW", new Metadata("+263", "ZW", "## ### ####")), TuplesKt.m28425to("NA", new Metadata("+264", "NA", "## ### ####")), TuplesKt.m28425to("MW", new Metadata("+265", "MW", "### ## ## ##")), TuplesKt.m28425to("LS", new Metadata("+266", "LS", "#### ####")), TuplesKt.m28425to("BW", new Metadata("+267", "BW", "## ### ###")), TuplesKt.m28425to("SZ", new Metadata("+268", "SZ", "#### ####")), TuplesKt.m28425to("KM", new Metadata("+269", "KM", "### ## ##")), TuplesKt.m28425to("ZA", new Metadata("+27", "ZA", "## ### ####")), TuplesKt.m28425to("SH", new Metadata("+290", "SH", "")), TuplesKt.m28425to("TA", new Metadata("+290", "TA", "")), TuplesKt.m28425to("ER", new Metadata("+291", "ER", "# ### ###")), TuplesKt.m28425to("AW", new Metadata("+297", "AW", "### ####")), TuplesKt.m28425to("FO", new Metadata("+298", "FO", "######")), TuplesKt.m28425to("GL", new Metadata("+299", "GL", "## ## ##")), TuplesKt.m28425to("GR", new Metadata("+30", "GR", "### ### ####")), TuplesKt.m28425to("NL", new Metadata("+31", "NL", "# ########")), TuplesKt.m28425to("BE", new Metadata("+32", "BE", "### ## ## ##")), TuplesKt.m28425to("FR", new Metadata("+33", "FR", "# ## ## ## ##")), TuplesKt.m28425to("ES", new Metadata("+34", "ES", "### ## ## ##")), TuplesKt.m28425to("GI", new Metadata("+350", "GI", "### #####")), TuplesKt.m28425to("PT", new Metadata("+351", "PT", "### ### ###")), TuplesKt.m28425to("LU", new Metadata("+352", "LU", "## ## ## ###")), TuplesKt.m28425to("IE", new Metadata("+353", "IE", "## ### ####")), TuplesKt.m28425to("IS", new Metadata("+354", "IS", "### ####")), TuplesKt.m28425to("AL", new Metadata("+355", "AL", "## ### ####")), TuplesKt.m28425to("MT", new Metadata("+356", "MT", "#### ####")), TuplesKt.m28425to("CY", new Metadata("+357", "CY", "## ######")), TuplesKt.m28425to("FI", new Metadata("+358", "FI", "## ### ## ##")), TuplesKt.m28425to("AX", new Metadata("+358", "AX", "")), TuplesKt.m28425to("BG", new Metadata("+359", "BG", "### ### ##")), TuplesKt.m28425to("HU", new Metadata("+36", "HU", "## ### ####")), TuplesKt.m28425to("LT", new Metadata("+370", "LT", "### #####")), TuplesKt.m28425to("LV", new Metadata("+371", "LV", "## ### ###")), TuplesKt.m28425to("EE", new Metadata("+372", "EE", "#### ####")), TuplesKt.m28425to("MD", new Metadata("+373", "MD", "### ## ###")), TuplesKt.m28425to("AM", new Metadata("+374", "AM", "## ######")), TuplesKt.m28425to("BY", new Metadata("+375", "BY", "## ###-##-##")), TuplesKt.m28425to("AD", new Metadata("+376", "AD", "### ###")), TuplesKt.m28425to("MC", new Metadata("+377", "MC", "# ## ## ## ##")), TuplesKt.m28425to("SM", new Metadata("+378", "SM", "## ## ## ##")), TuplesKt.m28425to("VA", new Metadata("+379", "VA", "")), TuplesKt.m28425to("UA", new Metadata("+380", "UA", "## ### ####")), TuplesKt.m28425to("RS", new Metadata("+381", "RS", "## #######")), TuplesKt.m28425to("ME", new Metadata("+382", "ME", "## ### ###")), TuplesKt.m28425to("XK", new Metadata("+383", "XK", "## ### ###")), TuplesKt.m28425to("HR", new Metadata("+385", "HR", "## ### ####")), TuplesKt.m28425to("SI", new Metadata("+386", "SI", "## ### ###")), TuplesKt.m28425to("BA", new Metadata("+387", "BA", "## ###-###")), TuplesKt.m28425to("MK", new Metadata("+389", "MK", "## ### ###")), TuplesKt.m28425to("IT", new Metadata("+39", "IT", "## #### ####")), TuplesKt.m28425to("RO", new Metadata("+40", "RO", "## ### ####")), TuplesKt.m28425to("CH", new Metadata("+41", "CH", "## ### ## ##")), TuplesKt.m28425to("CZ", new Metadata("+420", "CZ", "### ### ###")), TuplesKt.m28425to("SK", new Metadata("+421", "SK", "### ### ###")), TuplesKt.m28425to("LI", new Metadata("+423", "LI", "### ### ###")), TuplesKt.m28425to("AT", new Metadata("+43", "AT", "### ######")), TuplesKt.m28425to("GB", new Metadata("+44", "GB", "#### ######")), TuplesKt.m28425to("GG", new Metadata("+44", "GG", "#### ######")), TuplesKt.m28425to("JE", new Metadata("+44", "JE", "#### ######")), TuplesKt.m28425to("IM", new Metadata("+44", "IM", "#### ######")), TuplesKt.m28425to("DK", new Metadata("+45", "DK", "## ## ## ##")), TuplesKt.m28425to("SE", new Metadata("+46", "SE", "##-### ## ##")), TuplesKt.m28425to("NO", new Metadata("+47", "NO", "### ## ###")), TuplesKt.m28425to("BV", new Metadata("+47", "BV", "")), TuplesKt.m28425to("SJ", new Metadata("+47", "SJ", "## ## ## ##")), TuplesKt.m28425to("PL", new Metadata("+48", "PL", "## ### ## ##")), TuplesKt.m28425to("DE", new Metadata("+49", "DE", "### #######")), TuplesKt.m28425to("FK", new Metadata("+500", "FK", "")), TuplesKt.m28425to("GS", new Metadata("+500", "GS", "")), TuplesKt.m28425to("BZ", new Metadata("+501", "BZ", "###-####")), TuplesKt.m28425to("GT", new Metadata("+502", "GT", "#### ####")), TuplesKt.m28425to("SV", new Metadata("+503", "SV", "#### ####")), TuplesKt.m28425to("HN", new Metadata("+504", "HN", "####-####")), TuplesKt.m28425to("NI", new Metadata("+505", "NI", "#### ####")), TuplesKt.m28425to("CR", new Metadata("+506", "CR", "#### ####")), TuplesKt.m28425to("PA", new Metadata("+507", "PA", "####-####")), TuplesKt.m28425to("PM", new Metadata("+508", "PM", "## ## ##")), TuplesKt.m28425to("HT", new Metadata("+509", "HT", "## ## ####")), TuplesKt.m28425to("PE", new Metadata("+51", "PE", "### ### ###")), TuplesKt.m28425to("MX", new Metadata("+52", "MX", "### ### ### ####")), TuplesKt.m28425to("CY", new Metadata("+537", "CY", "")), TuplesKt.m28425to("AR", new Metadata("+54", "AR", "## ##-####-####")), TuplesKt.m28425to("BR", new Metadata("+55", "BR", "## #####-####")), TuplesKt.m28425to("CL", new Metadata("+56", "CL", "# #### ####")), TuplesKt.m28425to("CO", new Metadata("+57", "CO", "### #######")), TuplesKt.m28425to("VE", new Metadata("+58", "VE", "###-#######")), TuplesKt.m28425to("BL", new Metadata("+590", "BL", "### ## ## ##")), TuplesKt.m28425to("MF", new Metadata("+590", "MF", "")), TuplesKt.m28425to("GP", new Metadata("+590", "GP", "### ## ## ##")), TuplesKt.m28425to("BO", new Metadata("+591", "BO", "########")), TuplesKt.m28425to("GY", new Metadata("+592", "GY", "### ####")), TuplesKt.m28425to("EC", new Metadata("+593", "EC", "## ### ####")), TuplesKt.m28425to("GF", new Metadata("+594", "GF", "### ## ## ##")), TuplesKt.m28425to("PY", new Metadata("+595", "PY", "## #######")), TuplesKt.m28425to("MQ", new Metadata("+596", "MQ", "### ## ## ##")), TuplesKt.m28425to("SR", new Metadata("+597", "SR", "###-####")), TuplesKt.m28425to("UY", new Metadata("+598", "UY", "#### ####")), TuplesKt.m28425to("CW", new Metadata("+599", "CW", "# ### ####")), TuplesKt.m28425to("BQ", new Metadata("+599", "BQ", "### ####")), TuplesKt.m28425to("MY", new Metadata("+60", "MY", "##-### ####")), TuplesKt.m28425to("AU", new Metadata("+61", "AU", "### ### ###")), TuplesKt.m28425to("ID", new Metadata("+62", "ID", "###-###-###")), TuplesKt.m28425to("PH", new Metadata("+63", "PH", "#### ######")), TuplesKt.m28425to("NZ", new Metadata("+64", "NZ", "## ### ####")), TuplesKt.m28425to("SG", new Metadata("+65", "SG", "#### ####")), TuplesKt.m28425to("TH", new Metadata("+66", "TH", "## ### ####")), TuplesKt.m28425to("TL", new Metadata("+670", "TL", "#### ####")), TuplesKt.m28425to("AQ", new Metadata("+672", "AQ", "## ####")), TuplesKt.m28425to("BN", new Metadata("+673", "BN", "### ####")), TuplesKt.m28425to("NR", new Metadata("+674", "NR", "### ####")), TuplesKt.m28425to("PG", new Metadata("+675", "PG", "### ####")), TuplesKt.m28425to("TO", new Metadata("+676", "TO", "### ####")), TuplesKt.m28425to("SB", new Metadata("+677", "SB", "### ####")), TuplesKt.m28425to("VU", new Metadata("+678", "VU", "### ####")), TuplesKt.m28425to("FJ", new Metadata("+679", "FJ", "### ####")), TuplesKt.m28425to("WF", new Metadata("+681", "WF", "## ## ##")), TuplesKt.m28425to("CK", new Metadata("+682", "CK", "## ###")), TuplesKt.m28425to("NU", new Metadata("+683", "NU", "")), TuplesKt.m28425to("WS", new Metadata("+685", "WS", "")), TuplesKt.m28425to("KI", new Metadata("+686", "KI", "")), TuplesKt.m28425to("NC", new Metadata("+687", "NC", "########")), TuplesKt.m28425to("TV", new Metadata("+688", "TV", "")), TuplesKt.m28425to("PF", new Metadata("+689", "PF", "## ## ##")), TuplesKt.m28425to("TK", new Metadata("+690", "TK", "")), TuplesKt.m28425to("RU", new Metadata("+7", "RU", "### ###-##-##")), TuplesKt.m28425to("KZ", new Metadata("+7", "KZ", "")), TuplesKt.m28425to("JP", new Metadata("+81", "JP", "##-####-####")), TuplesKt.m28425to("KR", new Metadata("+82", "KR", "##-####-####")), TuplesKt.m28425to("VN", new Metadata("+84", "VN", "## ### ## ##")), TuplesKt.m28425to("HK", new Metadata("+852", "HK", "#### ####")), TuplesKt.m28425to("MO", new Metadata("+853", "MO", "#### ####")), TuplesKt.m28425to("KH", new Metadata("+855", "KH", "## ### ###")), TuplesKt.m28425to("LA", new Metadata("+856", "LA", "## ## ### ###")), TuplesKt.m28425to("CN", new Metadata("+86", "CN", "### #### ####")), TuplesKt.m28425to("PN", new Metadata("+872", "PN", "")), TuplesKt.m28425to("BD", new Metadata("+880", "BD", "####-######")), TuplesKt.m28425to("TW", new Metadata("+886", "TW", "### ### ###")), TuplesKt.m28425to("TR", new Metadata("+90", "TR", "### ### ####")), TuplesKt.m28425to("IN", new Metadata("+91", "IN", "## ## ######")), TuplesKt.m28425to("PK", new Metadata("+92", "PK", "### #######")), TuplesKt.m28425to("AF", new Metadata("+93", "AF", "## ### ####")), TuplesKt.m28425to("LK", new Metadata("+94", "LK", "## # ######")), TuplesKt.m28425to("MM", new Metadata("+95", "MM", "# ### ####")), TuplesKt.m28425to("MV", new Metadata("+960", "MV", "###-####")), TuplesKt.m28425to("LB", new Metadata("+961", "LB", "## ### ###")), TuplesKt.m28425to("JO", new Metadata("+962", "JO", "# #### ####")), TuplesKt.m28425to("IQ", new Metadata("+964", "IQ", "### ### ####")), TuplesKt.m28425to("KW", new Metadata("+965", "KW", "### #####")), TuplesKt.m28425to("SA", new Metadata("+966", "SA", "## ### ####")), TuplesKt.m28425to("YE", new Metadata("+967", "YE", "### ### ###")), TuplesKt.m28425to("OM", new Metadata("+968", "OM", "#### ####")), TuplesKt.m28425to("PS", new Metadata("+970", "PS", "### ### ###")), TuplesKt.m28425to("AE", new Metadata("+971", "AE", "## ### ####")), TuplesKt.m28425to("IL", new Metadata("+972", "IL", "##-###-####")), TuplesKt.m28425to("BH", new Metadata("+973", "BH", "#### ####")), TuplesKt.m28425to("QA", new Metadata("+974", "QA", "#### ####")), TuplesKt.m28425to("BT", new Metadata("+975", "BT", "## ## ## ##")), TuplesKt.m28425to("MN", new Metadata("+976", "MN", "#### ####")), TuplesKt.m28425to("NP", new Metadata("+977", "NP", "###-#######")), TuplesKt.m28425to("TJ", new Metadata("+992", "TJ", "### ## ####")), TuplesKt.m28425to("TM", new Metadata("+993", "TM", "## ##-##-##")), TuplesKt.m28425to("AZ", new Metadata("+994", "AZ", "## ### ## ##")), TuplesKt.m28425to("GE", new Metadata("+995", "GE", "### ## ## ##")), TuplesKt.m28425to("KG", new Metadata("+996", "KG", "### ### ###")), TuplesKt.m28425to("UZ", new Metadata("+998", "UZ", "## ### ## ##")));
        allMetadata = mapOf;
    }

    public /* synthetic */ PhoneNumberFormatter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getCountryCode();

    public abstract String getPlaceholder();

    public abstract String getPrefix();

    public abstract InterfaceC32735Eu6 getVisualTransformation();

    public abstract String toE164Format(String str);

    public abstract String userInputFilter(String str);

    private PhoneNumberFormatter() {
    }
}
