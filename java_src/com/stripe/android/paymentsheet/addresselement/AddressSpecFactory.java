package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.p049ui.core.elements.AddressSpec;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.uicore.elements.AddressType;
import com.stripe.android.uicore.elements.PhoneNumberState;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressSpecFactory;", "", "()V", "create", "Lcom/stripe/android/ui/core/elements/AddressSpec;", "condensedForm", "", "config", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "onNavigation", "Lkotlin/Function0;", "", "parsePhoneNumberConfig", "Lcom/stripe/android/uicore/elements/PhoneNumberState;", "configuration", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddressSpecFactory {
    public static final AddressSpecFactory INSTANCE = new AddressSpecFactory();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration.values().length];
            try {
                iArr[AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration.OPTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration.REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AddressSpecFactory() {
    }

    public final AddressSpec create(boolean z, AddressLauncher.Configuration configuration, Function0<Unit> onNavigation) {
        AddressSpecFactory addressSpecFactory;
        AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration fieldConfiguration;
        AddressSpec addressSpec;
        String str;
        Set<String> set;
        Set<String> allowedCountries;
        String str2;
        Set<String> set2;
        AddressLauncher.AdditionalFieldsConfiguration additionalFields;
        Intrinsics.checkNotNullParameter(onNavigation, "onNavigation");
        AddressSpec addressSpec2 = null;
        if (configuration != null && (additionalFields = configuration.getAdditionalFields()) != null) {
            fieldConfiguration = additionalFields.getPhone();
            addressSpecFactory = this;
        } else {
            addressSpecFactory = this;
            fieldConfiguration = null;
        }
        PhoneNumberState parsePhoneNumberConfig = addressSpecFactory.parsePhoneNumberConfig(fieldConfiguration);
        if (z) {
            if (configuration != null) {
                str2 = configuration.getGooglePlacesApiKey();
            } else {
                str2 = null;
            }
            if (configuration != null) {
                set2 = configuration.getAutocompleteCountries();
            } else {
                set2 = null;
            }
            addressSpec = new AddressSpec(null, null, null, false, new AddressType.ShippingCondensed(str2, set2, parsePhoneNumberConfig, onNavigation), 7, null);
        } else {
            if (configuration != null) {
                str = configuration.getGooglePlacesApiKey();
            } else {
                str = null;
            }
            if (configuration != null) {
                set = configuration.getAutocompleteCountries();
            } else {
                set = null;
            }
            addressSpec = new AddressSpec(null, null, null, false, new AddressType.ShippingExpanded(str, set, parsePhoneNumberConfig, onNavigation), 7, null);
        }
        if (configuration != null && (allowedCountries = configuration.getAllowedCountries()) != null) {
            addressSpec2 = AddressSpec.copy$default(addressSpec, null, allowedCountries, null, false, null, 29, null);
        }
        if (addressSpec2 != null) {
            return addressSpec2;
        }
        return addressSpec;
    }

    public final PhoneNumberState parsePhoneNumberConfig(AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration fieldConfiguration) {
        int i;
        if (fieldConfiguration == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[fieldConfiguration.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return PhoneNumberState.REQUIRED;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return PhoneNumberState.OPTIONAL;
            }
            return PhoneNumberState.HIDDEN;
        }
        return PhoneNumberState.OPTIONAL;
    }
}
