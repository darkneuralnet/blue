package com.stripe.android.paymentsheet.addresselement;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.paymentsheet.addresselement.AddressLauncherResult;
import com.stripe.android.paymentsheet.addresselement.AddressLauncherResultCallback;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0017\b\u0000\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0010\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0010\u0010\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0010\u0010\u0019J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;", "", "", "publishableKey", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "configuration", "", "present", "LB5;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "activityResultLauncher", "LB5;", "injectorKey", "Ljava/lang/String;", "getInjectorKey$annotations", "()V", "<init>", "(LB5;)V", "Landroidx/activity/ComponentActivity;", "activity", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;", "callback", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;)V", "AdditionalFieldsConfiguration", "Configuration", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AddressLauncher {
    public static final int $stable = 8;
    private final AbstractC0407B5<AddressElementActivityContract.Args> activityResultLauncher;
    private final String injectorKey;

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001d\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;", "Landroid/os/Parcelable;", PaymentMethod.BillingDetails.PARAM_PHONE, "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;", "checkboxLabel", "", "(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;Ljava/lang/String;)V", "getCheckboxLabel", "()Ljava/lang/String;", "getPhone", "()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "FieldConfiguration", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class AdditionalFieldsConfiguration implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AdditionalFieldsConfiguration> CREATOR = new Creator();
        private final String checkboxLabel;
        private final FieldConfiguration phone;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<AdditionalFieldsConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdditionalFieldsConfiguration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalFieldsConfiguration(FieldConfiguration.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdditionalFieldsConfiguration[] newArray(int i) {
                return new AdditionalFieldsConfiguration[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "HIDDEN", "OPTIONAL", "REQUIRED", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum FieldConfiguration implements Parcelable {
            HIDDEN,
            OPTIONAL,
            REQUIRED;
            
            public static final Parcelable.Creator<FieldConfiguration> CREATOR = new Creator();

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<FieldConfiguration> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FieldConfiguration createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return FieldConfiguration.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FieldConfiguration[] newArray(int i) {
                    return new FieldConfiguration[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(name());
            }
        }

        @JvmOverloads
        public AdditionalFieldsConfiguration() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ AdditionalFieldsConfiguration copy$default(AdditionalFieldsConfiguration additionalFieldsConfiguration, FieldConfiguration fieldConfiguration, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                fieldConfiguration = additionalFieldsConfiguration.phone;
            }
            if ((i & 2) != 0) {
                str = additionalFieldsConfiguration.checkboxLabel;
            }
            return additionalFieldsConfiguration.copy(fieldConfiguration, str);
        }

        public final FieldConfiguration component1() {
            return this.phone;
        }

        public final String component2() {
            return this.checkboxLabel;
        }

        public final AdditionalFieldsConfiguration copy(FieldConfiguration phone, String str) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            return new AdditionalFieldsConfiguration(phone, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AdditionalFieldsConfiguration) {
                AdditionalFieldsConfiguration additionalFieldsConfiguration = (AdditionalFieldsConfiguration) obj;
                return this.phone == additionalFieldsConfiguration.phone && Intrinsics.areEqual(this.checkboxLabel, additionalFieldsConfiguration.checkboxLabel);
            }
            return false;
        }

        public final String getCheckboxLabel() {
            return this.checkboxLabel;
        }

        public final FieldConfiguration getPhone() {
            return this.phone;
        }

        public int hashCode() {
            int hashCode = this.phone.hashCode() * 31;
            String str = this.checkboxLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            FieldConfiguration fieldConfiguration = this.phone;
            String str = this.checkboxLabel;
            return "AdditionalFieldsConfiguration(phone=" + fieldConfiguration + ", checkboxLabel=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.phone.writeToParcel(out, i);
            out.writeString(this.checkboxLabel);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public AdditionalFieldsConfiguration(FieldConfiguration phone) {
            this(phone, null, 2, null);
            Intrinsics.checkNotNullParameter(phone, "phone");
        }

        @JvmOverloads
        public AdditionalFieldsConfiguration(FieldConfiguration phone, String str) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            this.phone = phone;
            this.checkboxLabel = str;
        }

        public /* synthetic */ AdditionalFieldsConfiguration(FieldConfiguration fieldConfiguration, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? FieldConfiguration.HIDDEN : fieldConfiguration, (i & 2) != 0 ? null : str);
        }
    }

    @Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Bm\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003Jo\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020'HÖ\u0001J\t\u0010-\u001a\u00020\bHÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020'HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001a¨\u00064"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "Landroid/os/Parcelable;", PaymentSheetEvent.FIELD_APPEARANCE, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "allowedCountries", "", "", "buttonTitle", "additionalFields", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;", "title", "googlePlacesApiKey", "autocompleteCountries", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getAdditionalFields", "()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;", "getAddress", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getAllowedCountries", "()Ljava/util/Set;", "getAppearance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "getAutocompleteCountries", "getButtonTitle", "()Ljava/lang/String;", "getGooglePlacesApiKey", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Configuration implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Configuration> CREATOR = new Creator();
        private final AdditionalFieldsConfiguration additionalFields;
        private final AddressDetails address;
        private final Set<String> allowedCountries;
        private final PaymentSheet.Appearance appearance;
        private final Set<String> autocompleteCountries;
        private final String buttonTitle;
        private final String googlePlacesApiKey;
        private final String title;

        @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;", "", "()V", "additionalFields", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "allowedCountries", "", "", PaymentSheetEvent.FIELD_APPEARANCE, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "autocompleteCountries", "buttonTitle", "googlePlacesApiKey", "title", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nAddressLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressLauncher.kt\ncom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Builder {
            public static final int $stable = 8;
            private AdditionalFieldsConfiguration additionalFields;
            private AddressDetails address;
            private Set<String> allowedCountries;
            private PaymentSheet.Appearance appearance = new PaymentSheet.Appearance(null, null, null, null, null, 31, null);
            private Set<String> autocompleteCountries;
            private String buttonTitle;
            private String googlePlacesApiKey;
            private String title;

            public Builder() {
                Set<String> emptySet;
                emptySet = SetsKt__SetsKt.emptySet();
                this.allowedCountries = emptySet;
            }

            public final Builder additionalFields(AdditionalFieldsConfiguration additionalFields) {
                Intrinsics.checkNotNullParameter(additionalFields, "additionalFields");
                this.additionalFields = additionalFields;
                return this;
            }

            public final Builder address(AddressDetails addressDetails) {
                this.address = addressDetails;
                return this;
            }

            public final Builder allowedCountries(Set<String> allowedCountries) {
                Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
                this.allowedCountries = allowedCountries;
                return this;
            }

            public final Builder appearance(PaymentSheet.Appearance appearance) {
                Intrinsics.checkNotNullParameter(appearance, "appearance");
                this.appearance = appearance;
                return this;
            }

            public final Builder autocompleteCountries(Set<String> autocompleteCountries) {
                Intrinsics.checkNotNullParameter(autocompleteCountries, "autocompleteCountries");
                this.autocompleteCountries = autocompleteCountries;
                return this;
            }

            public final Configuration build() {
                return new Configuration(this.appearance, this.address, this.allowedCountries, this.buttonTitle, this.additionalFields, this.title, this.googlePlacesApiKey, null, 128, null);
            }

            public final Builder buttonTitle(String str) {
                this.buttonTitle = str;
                return this;
            }

            public final Builder googlePlacesApiKey(String str) {
                this.googlePlacesApiKey = str;
                return this;
            }

            public final Builder title(String str) {
                this.title = str;
                return this;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Configuration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PaymentSheet.Appearance createFromParcel = PaymentSheet.Appearance.CREATOR.createFromParcel(parcel);
                AddressDetails createFromParcel2 = parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(parcel.readString());
                }
                String readString = parcel.readString();
                AdditionalFieldsConfiguration createFromParcel3 = parcel.readInt() != 0 ? AdditionalFieldsConfiguration.CREATOR.createFromParcel(parcel) : null;
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                int readInt2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    linkedHashSet2.add(parcel.readString());
                }
                return new Configuration(createFromParcel, createFromParcel2, linkedHashSet, readString, createFromParcel3, readString2, readString3, linkedHashSet2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration[] newArray(int i) {
                return new Configuration[i];
            }
        }

        @JvmOverloads
        public Configuration() {
            this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
        }

        public final PaymentSheet.Appearance component1() {
            return this.appearance;
        }

        public final AddressDetails component2() {
            return this.address;
        }

        public final Set<String> component3() {
            return this.allowedCountries;
        }

        public final String component4() {
            return this.buttonTitle;
        }

        public final AdditionalFieldsConfiguration component5() {
            return this.additionalFields;
        }

        public final String component6() {
            return this.title;
        }

        public final String component7() {
            return this.googlePlacesApiKey;
        }

        public final Set<String> component8() {
            return this.autocompleteCountries;
        }

        public final Configuration copy(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2, String str3, Set<String> autocompleteCountries) {
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
            Intrinsics.checkNotNullParameter(autocompleteCountries, "autocompleteCountries");
            return new Configuration(appearance, addressDetails, allowedCountries, str, additionalFieldsConfiguration, str2, str3, autocompleteCountries);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Configuration) {
                Configuration configuration = (Configuration) obj;
                return Intrinsics.areEqual(this.appearance, configuration.appearance) && Intrinsics.areEqual(this.address, configuration.address) && Intrinsics.areEqual(this.allowedCountries, configuration.allowedCountries) && Intrinsics.areEqual(this.buttonTitle, configuration.buttonTitle) && Intrinsics.areEqual(this.additionalFields, configuration.additionalFields) && Intrinsics.areEqual(this.title, configuration.title) && Intrinsics.areEqual(this.googlePlacesApiKey, configuration.googlePlacesApiKey) && Intrinsics.areEqual(this.autocompleteCountries, configuration.autocompleteCountries);
            }
            return false;
        }

        public final AdditionalFieldsConfiguration getAdditionalFields() {
            return this.additionalFields;
        }

        public final AddressDetails getAddress() {
            return this.address;
        }

        public final Set<String> getAllowedCountries() {
            return this.allowedCountries;
        }

        public final PaymentSheet.Appearance getAppearance() {
            return this.appearance;
        }

        public final Set<String> getAutocompleteCountries() {
            return this.autocompleteCountries;
        }

        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        public final String getGooglePlacesApiKey() {
            return this.googlePlacesApiKey;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.appearance.hashCode() * 31;
            AddressDetails addressDetails = this.address;
            int hashCode2 = (((hashCode + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + this.allowedCountries.hashCode()) * 31;
            String str = this.buttonTitle;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            AdditionalFieldsConfiguration additionalFieldsConfiguration = this.additionalFields;
            int hashCode4 = (hashCode3 + (additionalFieldsConfiguration == null ? 0 : additionalFieldsConfiguration.hashCode())) * 31;
            String str2 = this.title;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.googlePlacesApiKey;
            return ((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.autocompleteCountries.hashCode();
        }

        public String toString() {
            PaymentSheet.Appearance appearance = this.appearance;
            AddressDetails addressDetails = this.address;
            Set<String> set = this.allowedCountries;
            String str = this.buttonTitle;
            AdditionalFieldsConfiguration additionalFieldsConfiguration = this.additionalFields;
            String str2 = this.title;
            String str3 = this.googlePlacesApiKey;
            Set<String> set2 = this.autocompleteCountries;
            return "Configuration(appearance=" + appearance + ", address=" + addressDetails + ", allowedCountries=" + set + ", buttonTitle=" + str + ", additionalFields=" + additionalFieldsConfiguration + ", title=" + str2 + ", googlePlacesApiKey=" + str3 + ", autocompleteCountries=" + set2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.appearance.writeToParcel(out, i);
            AddressDetails addressDetails = this.address;
            if (addressDetails == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                addressDetails.writeToParcel(out, i);
            }
            Set<String> set = this.allowedCountries;
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
            out.writeString(this.buttonTitle);
            AdditionalFieldsConfiguration additionalFieldsConfiguration = this.additionalFields;
            if (additionalFieldsConfiguration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                additionalFieldsConfiguration.writeToParcel(out, i);
            }
            out.writeString(this.title);
            out.writeString(this.googlePlacesApiKey);
            Set<String> set2 = this.autocompleteCountries;
            out.writeInt(set2.size());
            for (String str2 : set2) {
                out.writeString(str2);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(PaymentSheet.Appearance appearance) {
            this(appearance, null, null, null, null, null, null, null, 254, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails) {
            this(appearance, addressDetails, null, null, null, null, null, null, 252, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries) {
            this(appearance, addressDetails, allowedCountries, null, null, null, null, null, 248, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str) {
            this(appearance, addressDetails, allowedCountries, str, null, null, null, null, 240, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration) {
            this(appearance, addressDetails, allowedCountries, str, additionalFieldsConfiguration, null, null, null, 224, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2) {
            this(appearance, addressDetails, allowedCountries, str, additionalFieldsConfiguration, str2, null, null, 192, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2, String str3) {
            this(appearance, addressDetails, allowedCountries, str, additionalFieldsConfiguration, str2, str3, null, 128, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
        }

        @JvmOverloads
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2, String str3, Set<String> autocompleteCountries) {
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
            Intrinsics.checkNotNullParameter(autocompleteCountries, "autocompleteCountries");
            this.appearance = appearance;
            this.address = addressDetails;
            this.allowedCountries = allowedCountries;
            this.buttonTitle = str;
            this.additionalFields = additionalFieldsConfiguration;
            this.title = str2;
            this.googlePlacesApiKey = str3;
            this.autocompleteCountries = autocompleteCountries;
        }

        public /* synthetic */ Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set set, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2, String str3, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new PaymentSheet.Appearance(null, null, null, null, null, 31, null) : appearance, (i & 2) != 0 ? null : addressDetails, (i & 4) != 0 ? SetsKt__SetsKt.emptySet() : set, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : additionalFieldsConfiguration, (i & 32) != 0 ? null : str2, (i & 64) == 0 ? str3 : null, (i & 128) != 0 ? SetsKt__SetsKt.setOf((Object[]) new String[]{"AU", "BE", "BR", "CA", "CH", "DE", "ES", "FR", "GB", "IE", "IT", "MX", "NO", "NL", "PL", "RU", "SE", "TR", "US", "ZA"}) : set2);
        }
    }

    public AddressLauncher(AbstractC0407B5<AddressElementActivityContract.Args> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
        WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
        String simpleName = Reflection.getOrCreateKotlinClass(AddressLauncher.class).getSimpleName();
        if (simpleName == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.injectorKey = weakMapInjectorRegistry.nextKey(simpleName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(AddressLauncherResultCallback callback, AddressLauncherResult it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        callback.onAddressLauncherResult(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AddressLauncherResultCallback callback, AddressLauncherResult it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        callback.onAddressLauncherResult(it);
    }

    @InjectorKey
    private static /* synthetic */ void getInjectorKey$annotations() {
    }

    public static /* synthetic */ void present$default(AddressLauncher addressLauncher, String str, Configuration configuration, int i, Object obj) {
        if ((i & 2) != 0) {
            configuration = new Configuration(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
        }
        addressLauncher.present(str, configuration);
    }

    @JvmOverloads
    public final void present(String publishableKey) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        present$default(this, publishableKey, null, 2, null);
    }

    @JvmOverloads
    public final void present(String publishableKey, Configuration configuration) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.activityResultLauncher.m114705a(new AddressElementActivityContract.Args(publishableKey, configuration, this.injectorKey, null, 8, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddressLauncher(ComponentActivity activity, final AddressLauncherResultCallback callback) {
        this(r3);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC0407B5 registerForActivityResult = activity.registerForActivityResult(new AddressElementActivityContract(), new InterfaceC28515t5() { // from class: i8
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                AddressLauncher._init_$lambda$0(AddressLauncherResultCallback.this, (AddressLauncherResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activity.registerForActi…ncherResult(it)\n        }");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddressLauncher(Fragment fragment, final AddressLauncherResultCallback callback) {
        this(r3);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC0407B5 registerForActivityResult = fragment.registerForActivityResult(new AddressElementActivityContract(), new InterfaceC28515t5() { // from class: h8
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                AddressLauncher._init_$lambda$1(AddressLauncherResultCallback.this, (AddressLauncherResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "fragment.registerForActi…ncherResult(it)\n        }");
    }
}
