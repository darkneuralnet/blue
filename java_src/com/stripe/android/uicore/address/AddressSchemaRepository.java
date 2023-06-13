package com.stripe.android.uicore.address;

import android.content.res.Resources;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007R-\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00068DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/uicore/address/AddressSchemaRepository;", "", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "countryAddressSchemaMap", "", "", "", "Lcom/stripe/android/uicore/address/CountryAddressSchema;", "getCountryAddressSchemaMap", "()Ljava/util/Map;", "countryAddressSchemaMap$delegate", "Lkotlin/Lazy;", "getResources", "()Landroid/content/res/Resources;", "getSchema", "countryCode", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public class AddressSchemaRepository {
    public static final String DEFAULT_COUNTRY_CODE = "ZZ";
    private static final Set<String> SUPPORTED_COUNTRIES;
    private final Lazy countryAddressSchemaMap$delegate;
    private final Resources resources;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/uicore/address/AddressSchemaRepository$Companion;", "", "()V", "DEFAULT_COUNTRY_CODE", "", "SUPPORTED_COUNTRIES", "", "getSUPPORTED_COUNTRIES$annotations", "getSUPPORTED_COUNTRIES", "()Ljava/util/Set;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getSUPPORTED_COUNTRIES$annotations() {
        }

        public final Set<String> getSUPPORTED_COUNTRIES() {
            return AddressSchemaRepository.SUPPORTED_COUNTRIES;
        }

        private Companion() {
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"AC", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CV", "CW", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MK", "ML", "MM", "MN", "MO", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SZ", "TA", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VN", "VU", "WF", "WS", "XK", "YE", "YT", "ZA", "ZM", "ZW", "ZZ"});
        SUPPORTED_COUNTRIES = of;
    }

    public AddressSchemaRepository(Resources resources) {
        Lazy lazy;
        this.resources = resources;
        lazy = LazyKt__LazyJVMKt.lazy(new AddressSchemaRepository$countryAddressSchemaMap$2(this));
        this.countryAddressSchemaMap$delegate = lazy;
    }

    public final Map<String, List<CountryAddressSchema>> getCountryAddressSchemaMap() {
        return (Map) this.countryAddressSchemaMap$delegate.getValue();
    }

    public final Resources getResources() {
        return this.resources;
    }

    public final List<CountryAddressSchema> getSchema(String str) {
        List<CountryAddressSchema> list;
        if (str == null || (list = getCountryAddressSchemaMap().get(str)) == null) {
            return getCountryAddressSchemaMap().get("ZZ");
        }
        return list;
    }
}
