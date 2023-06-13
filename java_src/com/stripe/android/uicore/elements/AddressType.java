package com.stripe.android.uicore.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.uicore.address.AutocompleteCapableAddressType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AddressType;", "", "()V", "phoneNumberState", "Lcom/stripe/android/uicore/elements/PhoneNumberState;", "getPhoneNumberState", "()Lcom/stripe/android/uicore/elements/PhoneNumberState;", "Normal", "ShippingCondensed", "ShippingExpanded", "Lcom/stripe/android/uicore/elements/AddressType$Normal;", "Lcom/stripe/android/uicore/elements/AddressType$ShippingCondensed;", "Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class AddressType {
    public static final int $stable = 0;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AddressType$Normal;", "Lcom/stripe/android/uicore/elements/AddressType;", "phoneNumberState", "Lcom/stripe/android/uicore/elements/PhoneNumberState;", "(Lcom/stripe/android/uicore/elements/PhoneNumberState;)V", "getPhoneNumberState", "()Lcom/stripe/android/uicore/elements/PhoneNumberState;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Normal extends AddressType {
        public static final int $stable = 0;
        private final PhoneNumberState phoneNumberState;

        public Normal() {
            this(null, 1, null);
        }

        public static /* synthetic */ Normal copy$default(Normal normal, PhoneNumberState phoneNumberState, int i, Object obj) {
            if ((i & 1) != 0) {
                phoneNumberState = normal.getPhoneNumberState();
            }
            return normal.copy(phoneNumberState);
        }

        public final PhoneNumberState component1() {
            return getPhoneNumberState();
        }

        public final Normal copy(PhoneNumberState phoneNumberState) {
            Intrinsics.checkNotNullParameter(phoneNumberState, "phoneNumberState");
            return new Normal(phoneNumberState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Normal) && getPhoneNumberState() == ((Normal) obj).getPhoneNumberState();
        }

        @Override // com.stripe.android.uicore.elements.AddressType
        public PhoneNumberState getPhoneNumberState() {
            return this.phoneNumberState;
        }

        public int hashCode() {
            return getPhoneNumberState().hashCode();
        }

        public String toString() {
            PhoneNumberState phoneNumberState = getPhoneNumberState();
            return "Normal(phoneNumberState=" + phoneNumberState + ")";
        }

        public /* synthetic */ Normal(PhoneNumberState phoneNumberState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PhoneNumberState.HIDDEN : phoneNumberState);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Normal(PhoneNumberState phoneNumberState) {
            super(null);
            Intrinsics.checkNotNullParameter(phoneNumberState, "phoneNumberState");
            this.phoneNumberState = phoneNumberState;
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AddressType$ShippingCondensed;", "Lcom/stripe/android/uicore/elements/AddressType;", "Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;", "googleApiKey", "", "autocompleteCountries", "", "phoneNumberState", "Lcom/stripe/android/uicore/elements/PhoneNumberState;", "onNavigation", "Lkotlin/Function0;", "", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/PhoneNumberState;Lkotlin/jvm/functions/Function0;)V", "getAutocompleteCountries", "()Ljava/util/Set;", "getGoogleApiKey", "()Ljava/lang/String;", "getOnNavigation", "()Lkotlin/jvm/functions/Function0;", "getPhoneNumberState", "()Lcom/stripe/android/uicore/elements/PhoneNumberState;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ShippingCondensed extends AddressType implements AutocompleteCapableAddressType {
        public static final int $stable = 8;
        private final Set<String> autocompleteCountries;
        private final String googleApiKey;
        private final Function0<Unit> onNavigation;
        private final PhoneNumberState phoneNumberState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShippingCondensed(String str, Set<String> set, PhoneNumberState phoneNumberState, Function0<Unit> onNavigation) {
            super(null);
            Intrinsics.checkNotNullParameter(phoneNumberState, "phoneNumberState");
            Intrinsics.checkNotNullParameter(onNavigation, "onNavigation");
            this.googleApiKey = str;
            this.autocompleteCountries = set;
            this.phoneNumberState = phoneNumberState;
            this.onNavigation = onNavigation;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShippingCondensed copy$default(ShippingCondensed shippingCondensed, String str, Set set, PhoneNumberState phoneNumberState, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shippingCondensed.getGoogleApiKey();
            }
            if ((i & 2) != 0) {
                set = shippingCondensed.getAutocompleteCountries();
            }
            if ((i & 4) != 0) {
                phoneNumberState = shippingCondensed.getPhoneNumberState();
            }
            if ((i & 8) != 0) {
                function0 = shippingCondensed.getOnNavigation();
            }
            return shippingCondensed.copy(str, set, phoneNumberState, function0);
        }

        public final String component1() {
            return getGoogleApiKey();
        }

        public final Set<String> component2() {
            return getAutocompleteCountries();
        }

        public final PhoneNumberState component3() {
            return getPhoneNumberState();
        }

        public final Function0<Unit> component4() {
            return getOnNavigation();
        }

        public final ShippingCondensed copy(String str, Set<String> set, PhoneNumberState phoneNumberState, Function0<Unit> onNavigation) {
            Intrinsics.checkNotNullParameter(phoneNumberState, "phoneNumberState");
            Intrinsics.checkNotNullParameter(onNavigation, "onNavigation");
            return new ShippingCondensed(str, set, phoneNumberState, onNavigation);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ShippingCondensed) {
                ShippingCondensed shippingCondensed = (ShippingCondensed) obj;
                return Intrinsics.areEqual(getGoogleApiKey(), shippingCondensed.getGoogleApiKey()) && Intrinsics.areEqual(getAutocompleteCountries(), shippingCondensed.getAutocompleteCountries()) && getPhoneNumberState() == shippingCondensed.getPhoneNumberState() && Intrinsics.areEqual(getOnNavigation(), shippingCondensed.getOnNavigation());
            }
            return false;
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableAddressType
        public Set<String> getAutocompleteCountries() {
            return this.autocompleteCountries;
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableAddressType
        public String getGoogleApiKey() {
            return this.googleApiKey;
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableAddressType
        public Function0<Unit> getOnNavigation() {
            return this.onNavigation;
        }

        @Override // com.stripe.android.uicore.elements.AddressType
        public PhoneNumberState getPhoneNumberState() {
            return this.phoneNumberState;
        }

        public int hashCode() {
            return ((((((getGoogleApiKey() == null ? 0 : getGoogleApiKey().hashCode()) * 31) + (getAutocompleteCountries() != null ? getAutocompleteCountries().hashCode() : 0)) * 31) + getPhoneNumberState().hashCode()) * 31) + getOnNavigation().hashCode();
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableAddressType
        public boolean supportsAutoComplete(String str, IsPlacesAvailable isPlacesAvailable) {
            return AutocompleteCapableAddressType.DefaultImpls.supportsAutoComplete(this, str, isPlacesAvailable);
        }

        public String toString() {
            String googleApiKey = getGoogleApiKey();
            Set<String> autocompleteCountries = getAutocompleteCountries();
            PhoneNumberState phoneNumberState = getPhoneNumberState();
            Function0<Unit> onNavigation = getOnNavigation();
            return "ShippingCondensed(googleApiKey=" + googleApiKey + ", autocompleteCountries=" + autocompleteCountries + ", phoneNumberState=" + phoneNumberState + ", onNavigation=" + onNavigation + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;", "Lcom/stripe/android/uicore/elements/AddressType;", "Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;", "googleApiKey", "", "autocompleteCountries", "", "phoneNumberState", "Lcom/stripe/android/uicore/elements/PhoneNumberState;", "onNavigation", "Lkotlin/Function0;", "", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/PhoneNumberState;Lkotlin/jvm/functions/Function0;)V", "getAutocompleteCountries", "()Ljava/util/Set;", "getGoogleApiKey", "()Ljava/lang/String;", "getOnNavigation", "()Lkotlin/jvm/functions/Function0;", "getPhoneNumberState", "()Lcom/stripe/android/uicore/elements/PhoneNumberState;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ShippingExpanded extends AddressType implements AutocompleteCapableAddressType {
        public static final int $stable = 8;
        private final Set<String> autocompleteCountries;
        private final String googleApiKey;
        private final Function0<Unit> onNavigation;
        private final PhoneNumberState phoneNumberState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShippingExpanded(String str, Set<String> set, PhoneNumberState phoneNumberState, Function0<Unit> onNavigation) {
            super(null);
            Intrinsics.checkNotNullParameter(phoneNumberState, "phoneNumberState");
            Intrinsics.checkNotNullParameter(onNavigation, "onNavigation");
            this.googleApiKey = str;
            this.autocompleteCountries = set;
            this.phoneNumberState = phoneNumberState;
            this.onNavigation = onNavigation;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShippingExpanded copy$default(ShippingExpanded shippingExpanded, String str, Set set, PhoneNumberState phoneNumberState, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shippingExpanded.getGoogleApiKey();
            }
            if ((i & 2) != 0) {
                set = shippingExpanded.getAutocompleteCountries();
            }
            if ((i & 4) != 0) {
                phoneNumberState = shippingExpanded.getPhoneNumberState();
            }
            if ((i & 8) != 0) {
                function0 = shippingExpanded.getOnNavigation();
            }
            return shippingExpanded.copy(str, set, phoneNumberState, function0);
        }

        public final String component1() {
            return getGoogleApiKey();
        }

        public final Set<String> component2() {
            return getAutocompleteCountries();
        }

        public final PhoneNumberState component3() {
            return getPhoneNumberState();
        }

        public final Function0<Unit> component4() {
            return getOnNavigation();
        }

        public final ShippingExpanded copy(String str, Set<String> set, PhoneNumberState phoneNumberState, Function0<Unit> onNavigation) {
            Intrinsics.checkNotNullParameter(phoneNumberState, "phoneNumberState");
            Intrinsics.checkNotNullParameter(onNavigation, "onNavigation");
            return new ShippingExpanded(str, set, phoneNumberState, onNavigation);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ShippingExpanded) {
                ShippingExpanded shippingExpanded = (ShippingExpanded) obj;
                return Intrinsics.areEqual(getGoogleApiKey(), shippingExpanded.getGoogleApiKey()) && Intrinsics.areEqual(getAutocompleteCountries(), shippingExpanded.getAutocompleteCountries()) && getPhoneNumberState() == shippingExpanded.getPhoneNumberState() && Intrinsics.areEqual(getOnNavigation(), shippingExpanded.getOnNavigation());
            }
            return false;
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableAddressType
        public Set<String> getAutocompleteCountries() {
            return this.autocompleteCountries;
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableAddressType
        public String getGoogleApiKey() {
            return this.googleApiKey;
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableAddressType
        public Function0<Unit> getOnNavigation() {
            return this.onNavigation;
        }

        @Override // com.stripe.android.uicore.elements.AddressType
        public PhoneNumberState getPhoneNumberState() {
            return this.phoneNumberState;
        }

        public int hashCode() {
            return ((((((getGoogleApiKey() == null ? 0 : getGoogleApiKey().hashCode()) * 31) + (getAutocompleteCountries() != null ? getAutocompleteCountries().hashCode() : 0)) * 31) + getPhoneNumberState().hashCode()) * 31) + getOnNavigation().hashCode();
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableAddressType
        public boolean supportsAutoComplete(String str, IsPlacesAvailable isPlacesAvailable) {
            return AutocompleteCapableAddressType.DefaultImpls.supportsAutoComplete(this, str, isPlacesAvailable);
        }

        public String toString() {
            String googleApiKey = getGoogleApiKey();
            Set<String> autocompleteCountries = getAutocompleteCountries();
            PhoneNumberState phoneNumberState = getPhoneNumberState();
            Function0<Unit> onNavigation = getOnNavigation();
            return "ShippingExpanded(googleApiKey=" + googleApiKey + ", autocompleteCountries=" + autocompleteCountries + ", phoneNumberState=" + phoneNumberState + ", onNavigation=" + onNavigation + ")";
        }
    }

    public /* synthetic */ AddressType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract PhoneNumberState getPhoneNumberState();

    private AddressType() {
    }
}
