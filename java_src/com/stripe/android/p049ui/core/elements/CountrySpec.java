package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.uicore.elements.BillingSpecKt;
import com.stripe.android.uicore.elements.CountryConfig;
import com.stripe.android.uicore.elements.CountryElement;
import com.stripe.android.uicore.elements.DropdownFieldController;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.stripe.android.uicore.elements.SectionElement;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B!\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b%\u0010&B9\b\u0017\u0012\u0006\u0010'\u001a\u00020\u0016\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u001c\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tJ\t\u0010\u000f\u001a\u00020\nHÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010HÆ\u0003J#\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\n2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010HÆ\u0001J\t\u0010\u0015\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R \u0010\u0012\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010!\u0012\u0004\b$\u0010 \u001a\u0004\b\"\u0010#¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CountrySpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", NamedConstantsKt.INITIAL_VALUES, "Lcom/stripe/android/uicore/elements/SectionElement;", "transform", "component1", "", "component2", "apiPath", "allowedCountryCodes", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "()V", "Ljava/util/Set;", "getAllowedCountryCodes", "()Ljava/util/Set;", "getAllowedCountryCodes$annotations", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.CountrySpec */
/* loaded from: classes7.dex */
public final class CountrySpec extends FormItemSpec {
    private final Set<String> allowedCountryCodes;
    private final IdentifierSpec apiPath;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CountrySpec$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/CountrySpec;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.CountrySpec$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<CountrySpec> serializer() {
            return CountrySpec$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CountrySpec() {
        this((IdentifierSpec) null, (Set) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountrySpec copy$default(CountrySpec countrySpec, IdentifierSpec identifierSpec, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = countrySpec.getApiPath();
        }
        if ((i & 2) != 0) {
            set = countrySpec.allowedCountryCodes;
        }
        return countrySpec.copy(identifierSpec, set);
    }

    @InterfaceC36694Vs5("allowed_country_codes")
    public static /* synthetic */ void getAllowedCountryCodes$annotations() {
    }

    @InterfaceC36694Vs5("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @JvmStatic
    public static final void write$Self(CountrySpec self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z2 = false;
        if (output.mo1132s(serialDesc, 0) || !Intrinsics.areEqual(self.getApiPath(), IdentifierSpec.Companion.getCountry())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1126y(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
        if (output.mo1132s(serialDesc, 1) || !Intrinsics.areEqual(self.allowedCountryCodes, BillingSpecKt.getSupportedBillingCountries())) {
            z2 = true;
        }
        if (z2) {
            output.mo1126y(serialDesc, 1, new C35980Sr2(C41539gS5.f82260a), self.allowedCountryCodes);
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final Set<String> component2() {
        return this.allowedCountryCodes;
    }

    public final CountrySpec copy(IdentifierSpec apiPath, Set<String> allowedCountryCodes) {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        return new CountrySpec(apiPath, allowedCountryCodes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CountrySpec) {
            CountrySpec countrySpec = (CountrySpec) obj;
            return Intrinsics.areEqual(getApiPath(), countrySpec.getApiPath()) && Intrinsics.areEqual(this.allowedCountryCodes, countrySpec.allowedCountryCodes);
        }
        return false;
    }

    public final Set<String> getAllowedCountryCodes() {
        return this.allowedCountryCodes;
    }

    @Override // com.stripe.android.p049ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public int hashCode() {
        return (getApiPath().hashCode() * 31) + this.allowedCountryCodes.hashCode();
    }

    public String toString() {
        IdentifierSpec apiPath = getApiPath();
        Set<String> set = this.allowedCountryCodes;
        return "CountrySpec(apiPath=" + apiPath + ", allowedCountryCodes=" + set + ")";
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new CountryElement(getApiPath(), new DropdownFieldController(new CountryConfig(this.allowedCountryCodes, null, false, false, null, null, 62, null), initialValues.get(getApiPath()))), (Integer) null, 2, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CountrySpec(int i, @InterfaceC36694Vs5("api_path") IdentifierSpec identifierSpec, @InterfaceC36694Vs5("allowed_country_codes") Set set, C38819bt5 c38819bt5) {
        super(null);
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, CountrySpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = (i & 1) == 0 ? IdentifierSpec.Companion.getCountry() : identifierSpec;
        if ((i & 2) == 0) {
            this.allowedCountryCodes = BillingSpecKt.getSupportedBillingCountries();
        } else {
            this.allowedCountryCodes = set;
        }
    }

    public /* synthetic */ CountrySpec(IdentifierSpec identifierSpec, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IdentifierSpec.Companion.getCountry() : identifierSpec, (i & 2) != 0 ? BillingSpecKt.getSupportedBillingCountries() : set);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySpec(IdentifierSpec apiPath, Set<String> allowedCountryCodes) {
        super(null);
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        this.apiPath = apiPath;
        this.allowedCountryCodes = allowedCountryCodes;
    }
}
