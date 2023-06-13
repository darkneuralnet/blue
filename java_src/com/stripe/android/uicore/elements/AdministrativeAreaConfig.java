package com.stripe.android.uicore.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.uicore.C19423R;
import com.stripe.android.uicore.elements.DropdownConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000fH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\u000f8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;", "Lcom/stripe/android/uicore/elements/DropdownConfig;", "country", "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;", "(Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;)V", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "displayItems", "", "getDisplayItems", "()Ljava/util/List;", "fullAdministrativeAreaNames", "label", "", "getLabel", "()I", "rawItems", "getRawItems", "shortAdministrativeAreaNames", "tinyMode", "", "getTinyMode", "()Z", "convertFromRaw", "rawValue", "getSelectedItemLabel", "index", "Country", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAdministrativeAreaConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdministrativeAreaConfig.kt\ncom/stripe/android/uicore/elements/AdministrativeAreaConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n1549#2:130\n1620#2,3:131\n1549#2:134\n1620#2,3:135\n*S KotlinDebug\n*F\n+ 1 AdministrativeAreaConfig.kt\ncom/stripe/android/uicore/elements/AdministrativeAreaConfig\n*L\n11#1:130\n11#1:131,3\n12#1:134\n12#1:135,3\n*E\n"})
/* loaded from: classes7.dex */
public final class AdministrativeAreaConfig implements DropdownConfig {
    public static final int $stable = 8;
    private final String debugLabel;
    private final List<String> displayItems;
    private final List<String> fullAdministrativeAreaNames;
    private final int label;
    private final List<String> rawItems;
    private final List<String> shortAdministrativeAreaNames;
    private final boolean tinyMode;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\r\u000eB)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0002\u0010\bR&\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;", "", "label", "", "administrativeAreas", "", "Lkotlin/Pair;", "", "(ILjava/util/List;)V", "getAdministrativeAreas", "()Ljava/util/List;", "getLabel", "()I", "Canada", "US", "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;", "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Country {
        public static final int $stable = 8;
        private final List<Pair<String, String>> administrativeAreas;
        private final int label;

        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001R&\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;", "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;", "label", "", "administrativeAreas", "", "Lkotlin/Pair;", "", "(ILjava/util/List;)V", "getAdministrativeAreas", "()Ljava/util/List;", "getLabel", "()I", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Canada extends Country {
            public static final int $stable = 8;
            private final List<Pair<String, String>> administrativeAreas;
            private final int label;

            public Canada() {
                this(0, null, 3, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Canada copy$default(Canada canada, int i, List list, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = canada.getLabel();
                }
                if ((i2 & 2) != 0) {
                    list = canada.getAdministrativeAreas();
                }
                return canada.copy(i, list);
            }

            public final int component1() {
                return getLabel();
            }

            public final List<Pair<String, String>> component2() {
                return getAdministrativeAreas();
            }

            public final Canada copy(int i, List<Pair<String, String>> administrativeAreas) {
                Intrinsics.checkNotNullParameter(administrativeAreas, "administrativeAreas");
                return new Canada(i, administrativeAreas);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Canada) {
                    Canada canada = (Canada) obj;
                    return getLabel() == canada.getLabel() && Intrinsics.areEqual(getAdministrativeAreas(), canada.getAdministrativeAreas());
                }
                return false;
            }

            @Override // com.stripe.android.uicore.elements.AdministrativeAreaConfig.Country
            public List<Pair<String, String>> getAdministrativeAreas() {
                return this.administrativeAreas;
            }

            @Override // com.stripe.android.uicore.elements.AdministrativeAreaConfig.Country
            public int getLabel() {
                return this.label;
            }

            public int hashCode() {
                return (Integer.hashCode(getLabel()) * 31) + getAdministrativeAreas().hashCode();
            }

            public String toString() {
                int label = getLabel();
                List<Pair<String, String>> administrativeAreas = getAdministrativeAreas();
                return "Canada(label=" + label + ", administrativeAreas=" + administrativeAreas + ")";
            }

            public /* synthetic */ Canada(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? C19423R.string.address_label_province : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair("AB", "Alberta"), new Pair("BC", "British Columbia"), new Pair("MB", "Manitoba"), new Pair("NB", "New Brunswick"), new Pair("NL", "Newfoundland and Labrador"), new Pair("NT", "Northwest Territories"), new Pair("NS", "Nova Scotia"), new Pair("NU", "Nunavut"), new Pair("ON", "Ontario"), new Pair("PE", "Prince Edward Island"), new Pair("QC", "Quebec"), new Pair("SK", "Saskatchewan"), new Pair("YT", "Yukon")}) : list);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Canada(int i, List<Pair<String, String>> administrativeAreas) {
                super(i, administrativeAreas, null);
                Intrinsics.checkNotNullParameter(administrativeAreas, "administrativeAreas");
                this.label = i;
                this.administrativeAreas = administrativeAreas;
            }
        }

        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001R&\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;", "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;", "label", "", "administrativeAreas", "", "Lkotlin/Pair;", "", "(ILjava/util/List;)V", "getAdministrativeAreas", "()Ljava/util/List;", "getLabel", "()I", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.uicore.elements.AdministrativeAreaConfig$Country$US */
        /* loaded from: classes7.dex */
        public static final class C19448US extends Country {
            public static final int $stable = 8;
            private final List<Pair<String, String>> administrativeAreas;
            private final int label;

            public C19448US() {
                this(0, null, 3, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C19448US copy$default(C19448US c19448us, int i, List list, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = c19448us.getLabel();
                }
                if ((i2 & 2) != 0) {
                    list = c19448us.getAdministrativeAreas();
                }
                return c19448us.copy(i, list);
            }

            public final int component1() {
                return getLabel();
            }

            public final List<Pair<String, String>> component2() {
                return getAdministrativeAreas();
            }

            public final C19448US copy(int i, List<Pair<String, String>> administrativeAreas) {
                Intrinsics.checkNotNullParameter(administrativeAreas, "administrativeAreas");
                return new C19448US(i, administrativeAreas);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C19448US) {
                    C19448US c19448us = (C19448US) obj;
                    return getLabel() == c19448us.getLabel() && Intrinsics.areEqual(getAdministrativeAreas(), c19448us.getAdministrativeAreas());
                }
                return false;
            }

            @Override // com.stripe.android.uicore.elements.AdministrativeAreaConfig.Country
            public List<Pair<String, String>> getAdministrativeAreas() {
                return this.administrativeAreas;
            }

            @Override // com.stripe.android.uicore.elements.AdministrativeAreaConfig.Country
            public int getLabel() {
                return this.label;
            }

            public int hashCode() {
                return (Integer.hashCode(getLabel()) * 31) + getAdministrativeAreas().hashCode();
            }

            public String toString() {
                int label = getLabel();
                List<Pair<String, String>> administrativeAreas = getAdministrativeAreas();
                return "US(label=" + label + ", administrativeAreas=" + administrativeAreas + ")";
            }

            public /* synthetic */ C19448US(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? C19423R.string.address_label_state : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair("AL", "Alabama"), new Pair("AK", "Alaska"), new Pair("AS", "American Samoa"), new Pair("AZ", "Arizona"), new Pair("AR", "Arkansas"), new Pair("AA", "Armed Forces (AA)"), new Pair("AE", "Armed Forces (AE)"), new Pair("AP", "Armed Forces (AP)"), new Pair("CA", "California"), new Pair("CO", "Colorado"), new Pair("CT", "Connecticut"), new Pair("DE", "Delaware"), new Pair("DC", "District of Columbia"), new Pair("FL", "Florida"), new Pair("GA", "Georgia"), new Pair("GU", "Guam"), new Pair("HI", "Hawaii"), new Pair("ID", "Idaho"), new Pair("IL", "Illinois"), new Pair("IN", "Indiana"), new Pair("IA", "Iowa"), new Pair("KS", "Kansas"), new Pair("KY", "Kentucky"), new Pair("LA", "Louisiana"), new Pair("ME", "Maine"), new Pair("MH", "Marshal Islands"), new Pair("MD", "Maryland"), new Pair("MA", "Massachusetts"), new Pair("MI", "Michigan"), new Pair("FM", "Micronesia"), new Pair("MN", "Minnesota"), new Pair("MS", "Mississippi"), new Pair("MO", "Missouri"), new Pair("MT", "Montana"), new Pair("NE", "Nebraska"), new Pair("NV", "Nevada"), new Pair("NH", "New Hampshire"), new Pair("NJ", "New Jersey"), new Pair("NM", "New Mexico"), new Pair("NY", "New York"), new Pair("NC", "North Carolina"), new Pair("ND", "North Dakota"), new Pair("MP", "Northern Mariana Islands"), new Pair("OH", "Ohio"), new Pair("OK", "Oklahoma"), new Pair("OR", "Oregon"), new Pair("PW", "Palau"), new Pair("PA", "Pennsylvania"), new Pair("PR", "Puerto Rico"), new Pair("RI", "Rhode Island"), new Pair("SC", "South Carolina"), new Pair("SD", "South Dakota"), new Pair("TN", "Tennessee"), new Pair("TX", "Texas"), new Pair("UT", "Utah"), new Pair("VT", "Vermont"), new Pair("VI", "Virgin Islands"), new Pair("VA", "Virginia"), new Pair("WA", "Washington"), new Pair("WV", "West Virginia"), new Pair("WI", "Wisconsin"), new Pair("WY", "Wyoming")}) : list);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19448US(int i, List<Pair<String, String>> administrativeAreas) {
                super(i, administrativeAreas, null);
                Intrinsics.checkNotNullParameter(administrativeAreas, "administrativeAreas");
                this.label = i;
                this.administrativeAreas = administrativeAreas;
            }
        }

        public /* synthetic */ Country(int i, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, list);
        }

        public List<Pair<String, String>> getAdministrativeAreas() {
            return this.administrativeAreas;
        }

        public int getLabel() {
            return this.label;
        }

        private Country(int i, List<Pair<String, String>> list) {
            this.label = i;
            this.administrativeAreas = list;
        }
    }

    public AdministrativeAreaConfig(Country country) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(country, "country");
        List<Pair<String, String>> administrativeAreas = country.getAdministrativeAreas();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(administrativeAreas, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = administrativeAreas.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).getFirst());
        }
        this.shortAdministrativeAreaNames = arrayList;
        List<Pair<String, String>> administrativeAreas2 = country.getAdministrativeAreas();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(administrativeAreas2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator<T> it2 = administrativeAreas2.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((Pair) it2.next()).getSecond());
        }
        this.fullAdministrativeAreaNames = arrayList2;
        this.debugLabel = "administrativeArea";
        this.label = country.getLabel();
        this.rawItems = this.shortAdministrativeAreaNames;
        this.displayItems = arrayList2;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String convertFromRaw(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        if (this.shortAdministrativeAreaNames.contains(rawValue)) {
            return this.fullAdministrativeAreaNames.get(this.shortAdministrativeAreaNames.indexOf(rawValue));
        }
        return this.fullAdministrativeAreaNames.get(0);
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public boolean getDisableDropdownWithSingleElement() {
        return DropdownConfig.DefaultImpls.getDisableDropdownWithSingleElement(this);
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public List<String> getDisplayItems() {
        return this.displayItems;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public int getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public List<String> getRawItems() {
        return this.rawItems;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String getSelectedItemLabel(int i) {
        return this.fullAdministrativeAreaNames.get(i);
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public boolean getTinyMode() {
        return this.tinyMode;
    }
}
