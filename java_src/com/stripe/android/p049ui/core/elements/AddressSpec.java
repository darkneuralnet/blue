package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.elements.AddressElement;
import com.stripe.android.uicore.elements.AddressType;
import com.stripe.android.uicore.elements.BillingSpecKt;
import com.stripe.android.uicore.elements.CountryConfig;
import com.stripe.android.uicore.elements.CountryElement;
import com.stripe.android.uicore.elements.DropdownFieldController;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.stripe.android.uicore.elements.SameAsShippingController;
import com.stripe.android.uicore.elements.SameAsShippingElement;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SectionFieldElement;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BE\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b:\u0010;BU\b\u0017\u0012\u0006\u0010<\u001a\u00020\"\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013\u0012\u0010\b\u0001\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0017\u0012\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b:\u0010?J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J<\u0010\u0011\u001a\u00020\u00102\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\tJ\t\u0010\u0012\u001a\u00020\nHÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0017HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\n2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u0019HÆ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\"HÖ\u0001J\u0013\u0010&\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003R \u0010\u001b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010,\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010.R \u0010\u001e\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00102\u0012\u0004\b5\u0010+\u001a\u0004\b3\u00104R \u0010\u001f\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00106\u0012\u0004\b9\u0010+\u001a\u0004\b7\u00108¨\u0006B"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/AddressSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", NamedConstantsKt.INITIAL_VALUES, "Lcom/stripe/android/uicore/address/AddressRepository;", "addressRepository", NamedConstantsKt.SHIPPING_VALUES, "Lcom/stripe/android/uicore/elements/SectionElement;", "transform", "component1", "", "component2", "Lcom/stripe/android/ui/core/elements/DisplayField;", "component3", "", "component4", "Lcom/stripe/android/uicore/elements/AddressType;", "component5", "apiPath", "allowedCountryCodes", "displayFields", "showLabel", "type", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "()V", "Ljava/util/Set;", "getAllowedCountryCodes", "()Ljava/util/Set;", "getAllowedCountryCodes$annotations", "getDisplayFields", "getDisplayFields$annotations", "Z", "getShowLabel", "()Z", "getShowLabel$annotations", "Lcom/stripe/android/uicore/elements/AddressType;", "getType", "()Lcom/stripe/android/uicore/elements/AddressType;", "getType$annotations", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.AddressSpec */
/* loaded from: classes7.dex */
public final class AddressSpec extends FormItemSpec {
    private final Set<String> allowedCountryCodes;
    private final IdentifierSpec apiPath;
    private final Set<DisplayField> displayFields;
    private final boolean showLabel;
    private final AddressType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/AddressSpec$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/AddressSpec;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.AddressSpec$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<AddressSpec> serializer() {
            return AddressSpec$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AddressSpec() {
        this(null, null, null, false, null, 31, null);
    }

    public static /* synthetic */ AddressSpec copy$default(AddressSpec addressSpec, IdentifierSpec identifierSpec, Set set, Set set2, boolean z, AddressType addressType, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = addressSpec.getApiPath();
        }
        Set<String> set3 = set;
        if ((i & 2) != 0) {
            set3 = addressSpec.allowedCountryCodes;
        }
        Set set4 = set3;
        Set<DisplayField> set5 = set2;
        if ((i & 4) != 0) {
            set5 = addressSpec.displayFields;
        }
        Set set6 = set5;
        if ((i & 8) != 0) {
            z = addressSpec.showLabel;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            addressType = addressSpec.type;
        }
        return addressSpec.copy(identifierSpec, set4, set6, z2, addressType);
    }

    @InterfaceC36694Vs5("allowed_country_codes")
    public static /* synthetic */ void getAllowedCountryCodes$annotations() {
    }

    @InterfaceC36694Vs5("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @InterfaceC36694Vs5("display_fields")
    public static /* synthetic */ void getDisplayFields$annotations() {
    }

    @InterfaceC36694Vs5("show_label")
    public static /* synthetic */ void getShowLabel$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void write$Self(AddressSpec self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        boolean z2;
        Set emptySet;
        boolean z3;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z4 = false;
        if (output.mo1132s(serialDesc, 0) || !Intrinsics.areEqual(self.getApiPath(), IdentifierSpec.Companion.Generic("billing_details[address]"))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1126y(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
        if (output.mo1132s(serialDesc, 1) || !Intrinsics.areEqual(self.allowedCountryCodes, BillingSpecKt.getSupportedBillingCountries())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1126y(serialDesc, 1, new C35980Sr2(C41539gS5.f82260a), self.allowedCountryCodes);
        }
        if (!output.mo1132s(serialDesc, 2)) {
            Set<DisplayField> set = self.displayFields;
            emptySet = SetsKt__SetsKt.emptySet();
            if (Intrinsics.areEqual(set, emptySet)) {
                z3 = false;
                if (z3) {
                    output.mo1126y(serialDesc, 2, new C35980Sr2(DisplayField.Companion.serializer()), self.displayFields);
                }
                if (!output.mo1132s(serialDesc, 3) || !self.showLabel) {
                    z4 = true;
                }
                if (!z4) {
                    output.mo1129v(serialDesc, 3, self.showLabel);
                    return;
                }
                return;
            }
        }
        z3 = true;
        if (z3) {
        }
        if (!output.mo1132s(serialDesc, 3)) {
        }
        z4 = true;
        if (!z4) {
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final Set<String> component2() {
        return this.allowedCountryCodes;
    }

    public final Set<DisplayField> component3() {
        return this.displayFields;
    }

    public final boolean component4() {
        return this.showLabel;
    }

    public final AddressType component5() {
        return this.type;
    }

    public final AddressSpec copy(IdentifierSpec apiPath, Set<String> allowedCountryCodes, Set<? extends DisplayField> displayFields, boolean z, AddressType type) {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        Intrinsics.checkNotNullParameter(displayFields, "displayFields");
        Intrinsics.checkNotNullParameter(type, "type");
        return new AddressSpec(apiPath, allowedCountryCodes, displayFields, z, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddressSpec) {
            AddressSpec addressSpec = (AddressSpec) obj;
            return Intrinsics.areEqual(getApiPath(), addressSpec.getApiPath()) && Intrinsics.areEqual(this.allowedCountryCodes, addressSpec.allowedCountryCodes) && Intrinsics.areEqual(this.displayFields, addressSpec.displayFields) && this.showLabel == addressSpec.showLabel && Intrinsics.areEqual(this.type, addressSpec.type);
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

    public final Set<DisplayField> getDisplayFields() {
        return this.displayFields;
    }

    public final boolean getShowLabel() {
        return this.showLabel;
    }

    public final AddressType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((getApiPath().hashCode() * 31) + this.allowedCountryCodes.hashCode()) * 31) + this.displayFields.hashCode()) * 31;
        boolean z = this.showLabel;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.type.hashCode();
    }

    public String toString() {
        IdentifierSpec apiPath = getApiPath();
        Set<String> set = this.allowedCountryCodes;
        Set<DisplayField> set2 = this.displayFields;
        boolean z = this.showLabel;
        AddressType addressType = this.type;
        return "AddressSpec(apiPath=" + apiPath + ", allowedCountryCodes=" + set + ", displayFields=" + set2 + ", showLabel=" + z + ", type=" + addressType + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
        r5 = kotlin.text.StringsKt__StringsKt.toBooleanStrictOrNull(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SectionElement transform(Map<IdentifierSpec, String> initialValues, AddressRepository addressRepository, Map<IdentifierSpec, String> map) {
        Integer num;
        SameAsShippingElement sameAsShippingElement;
        List<? extends SectionFieldElement> listOfNotNull;
        Boolean booleanStrictOrNull;
        Object first;
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        if (this.showLabel) {
            num = Integer.valueOf(C19369R.string.billing_details);
        } else {
            num = null;
        }
        if (this.displayFields.size() == 1) {
            first = CollectionsKt___CollectionsKt.first(this.displayFields);
            if (first == DisplayField.Country) {
                return createSectionElement$payments_ui_core_release(new CountryElement(IdentifierSpec.Companion.Generic("billing_details[address][country]"), new DropdownFieldController(new CountryConfig(this.allowedCountryCodes, null, false, false, null, null, 62, null), initialValues.get(getApiPath()))), num);
            }
        }
        if (map != null) {
            IdentifierSpec.Companion companion = IdentifierSpec.Companion;
            String str = map.get(companion.getSameAsShipping());
            if (str != null && booleanStrictOrNull != null) {
                sameAsShippingElement = new SameAsShippingElement(companion.getSameAsShipping(), new SameAsShippingController(booleanStrictOrNull.booleanValue()));
                listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new SectionFieldElement[]{new AddressElement(getApiPath(), addressRepository, initialValues, this.type, this.allowedCountryCodes, null, sameAsShippingElement, map, null, 288, null), sameAsShippingElement});
                return createSectionElement$payments_ui_core_release(listOfNotNull, num);
            }
        }
        sameAsShippingElement = null;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new SectionFieldElement[]{new AddressElement(getApiPath(), addressRepository, initialValues, this.type, this.allowedCountryCodes, null, sameAsShippingElement, map, null, 288, null), sameAsShippingElement});
        return createSectionElement$payments_ui_core_release(listOfNotNull, num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AddressSpec(int i, @InterfaceC36694Vs5("api_path") IdentifierSpec identifierSpec, @InterfaceC36694Vs5("allowed_country_codes") Set set, @InterfaceC36694Vs5("display_fields") Set set2, @InterfaceC36694Vs5("show_label") boolean z, C38819bt5 c38819bt5) {
        super(null);
        Set<DisplayField> emptySet;
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, AddressSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = (i & 1) == 0 ? IdentifierSpec.Companion.Generic("billing_details[address]") : identifierSpec;
        if ((i & 2) == 0) {
            this.allowedCountryCodes = BillingSpecKt.getSupportedBillingCountries();
        } else {
            this.allowedCountryCodes = set;
        }
        if ((i & 4) == 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            this.displayFields = emptySet;
        } else {
            this.displayFields = set2;
        }
        if ((i & 8) == 0) {
            this.showLabel = true;
        } else {
            this.showLabel = z;
        }
        this.type = new AddressType.Normal(null, 1, null);
    }

    public /* synthetic */ AddressSpec(IdentifierSpec identifierSpec, Set set, Set set2, boolean z, AddressType addressType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IdentifierSpec.Companion.Generic("billing_details[address]") : identifierSpec, (i & 2) != 0 ? BillingSpecKt.getSupportedBillingCountries() : set, (i & 4) != 0 ? SetsKt__SetsKt.emptySet() : set2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? new AddressType.Normal(null, 1, null) : addressType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressSpec(IdentifierSpec apiPath, Set<String> allowedCountryCodes, Set<? extends DisplayField> displayFields, boolean z, AddressType type) {
        super(null);
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        Intrinsics.checkNotNullParameter(displayFields, "displayFields");
        Intrinsics.checkNotNullParameter(type, "type");
        this.apiPath = apiPath;
        this.allowedCountryCodes = allowedCountryCodes;
        this.displayFields = displayFields;
        this.showLabel = z;
        this.type = type;
    }
}
