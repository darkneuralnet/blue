package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.location.places.Place;
import com.stripe.android.CreateIntentCallback;
import com.stripe.android.CreateIntentCallbackForServerSideConfirmation;
import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.link.account.CookieStore;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.PaymentOption;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u0000 %2\u00020\u0001:\u0011!\"#$%&'()*+,-./01B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nB\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rB\u0017\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0010B\u001f\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011B\u001f\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012B\u000f\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u001c\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u001c\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet;", "", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "createIntentCallback", "Lcom/stripe/android/CreateIntentCallback;", "paymentResultCallback", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "createIntentCallbackForServerSideConfirmation", "Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "paymentSheetLauncher", "Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;", "(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V", "presentWithIntentConfiguration", "", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "presentWithPaymentIntent", "paymentIntentClientSecret", "", "presentWithSetupIntent", "setupIntentClientSecret", "Address", "Appearance", "BillingDetails", "Colors", "Companion", "Configuration", "CustomerConfiguration", "FlowController", "GooglePayConfiguration", "InitializationMode", "IntentConfiguration", "PrimaryButton", "PrimaryButtonColors", "PrimaryButtonShape", "PrimaryButtonTypography", "Shapes", "Typography", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentSheet {
    private final PaymentSheetLauncher paymentSheetLauncher;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006&"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "Landroid/os/Parcelable;", "city", "", "country", "line1", "line2", "postalCode", TransferTable.COLUMN_STATE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCountry", "getLine1", "getLine2", "getPostalCode", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Address implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Address> CREATOR = new Creator();
        private final String city;
        private final String country;
        private final String line1;
        private final String line2;
        private final String postalCode;
        private final String state;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;", "", "()V", "city", "", "country", "line1", "line2", "postalCode", TransferTable.COLUMN_STATE, JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPaymentSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheet.kt\ncom/stripe/android/paymentsheet/PaymentSheet$Address$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1086:1\n1#2:1087\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Builder {
            public static final int $stable = 8;
            private String city;
            private String country;
            private String line1;
            private String line2;
            private String postalCode;
            private String state;

            public final Address build() {
                return new Address(this.city, this.country, this.line1, this.line2, this.postalCode, this.state);
            }

            public final Builder city(String str) {
                this.city = str;
                return this;
            }

            public final Builder country(String str) {
                this.country = str;
                return this;
            }

            public final Builder line1(String str) {
                this.line1 = str;
                return this;
            }

            public final Builder line2(String str) {
                this.line2 = str;
                return this;
            }

            public final Builder postalCode(String str) {
                this.postalCode = str;
                return this;
            }

            public final Builder state(String str) {
                this.state = str;
                return this;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Address> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Address createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Address[] newArray(int i) {
                return new Address[i];
            }
        }

        public Address() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = address.city;
            }
            if ((i & 2) != 0) {
                str2 = address.country;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = address.line1;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = address.line2;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = address.postalCode;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = address.state;
            }
            return address.copy(str, str7, str8, str9, str10, str6);
        }

        public final String component1() {
            return this.city;
        }

        public final String component2() {
            return this.country;
        }

        public final String component3() {
            return this.line1;
        }

        public final String component4() {
            return this.line2;
        }

        public final String component5() {
            return this.postalCode;
        }

        public final String component6() {
            return this.state;
        }

        public final Address copy(String str, String str2, String str3, String str4, String str5, String str6) {
            return new Address(str, str2, str3, str4, str5, str6);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Address) {
                Address address = (Address) obj;
                return Intrinsics.areEqual(this.city, address.city) && Intrinsics.areEqual(this.country, address.country) && Intrinsics.areEqual(this.line1, address.line1) && Intrinsics.areEqual(this.line2, address.line2) && Intrinsics.areEqual(this.postalCode, address.postalCode) && Intrinsics.areEqual(this.state, address.state);
            }
            return false;
        }

        public final String getCity() {
            return this.city;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getLine1() {
            return this.line1;
        }

        public final String getLine2() {
            return this.line2;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public final String getState() {
            return this.state;
        }

        public int hashCode() {
            String str = this.city;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.country;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.line1;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.line2;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.postalCode;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.state;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            String str = this.city;
            String str2 = this.country;
            String str3 = this.line1;
            String str4 = this.line2;
            String str5 = this.postalCode;
            String str6 = this.state;
            return "Address(city=" + str + ", country=" + str2 + ", line1=" + str3 + ", line2=" + str4 + ", postalCode=" + str5 + ", state=" + str6 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.city);
            out.writeString(this.country);
            out.writeString(this.line1);
            out.writeString(this.line2);
            out.writeString(this.postalCode);
            out.writeString(this.state);
        }

        public Address(String str, String str2, String str3, String str4, String str5, String str6) {
            this.city = str;
            this.country = str2;
            this.line1 = str3;
            this.line2 = str4;
            this.postalCode = str5;
            this.state = str6;
        }

        public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
        }
    }

    @Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\u000e\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001eJ\t\u0010#\u001a\u00020\u001cHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006,"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "Landroid/os/Parcelable;", PaymentSheetEvent.FIELD_COLORS_LIGHT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", PaymentSheetEvent.FIELD_COLORS_DARK, "shapes", "Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "typography", "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "primaryButton", "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)V", "getColorsDark", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", "getColorsLight", "getPrimaryButton", "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;", "getShapes", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "getTypography", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "getColors", "isDark", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Appearance implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Appearance> CREATOR = new Creator();
        private final Colors colorsDark;
        private final Colors colorsLight;
        private final PrimaryButton primaryButton;
        private final Shapes shapes;
        private final Typography typography;

        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;", "", "()V", PaymentSheetEvent.FIELD_COLORS_DARK, "Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", PaymentSheetEvent.FIELD_COLORS_LIGHT, "primaryButton", "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;", "shapes", "Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "typography", "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "colors", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPaymentSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheet.kt\ncom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1086:1\n1#2:1087\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Builder {
            public static final int $stable = 8;
            private Colors colorsDark;
            private Colors colorsLight;
            private PrimaryButton primaryButton;
            private Shapes shapes;
            private Typography typography;

            public Builder() {
                Colors.Companion companion = Colors.Companion;
                this.colorsLight = companion.getDefaultLight();
                this.colorsDark = companion.getDefaultDark();
                this.shapes = Shapes.Companion.getDefault();
                this.typography = Typography.Companion.getDefault();
                this.primaryButton = new PrimaryButton(null, null, null, null, 15, null);
            }

            public final Builder colorsDark(Colors colors) {
                Intrinsics.checkNotNullParameter(colors, "colors");
                this.colorsDark = colors;
                return this;
            }

            public final Builder colorsLight(Colors colors) {
                Intrinsics.checkNotNullParameter(colors, "colors");
                this.colorsLight = colors;
                return this;
            }

            public final Builder primaryButton(PrimaryButton primaryButton) {
                Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
                this.primaryButton = primaryButton;
                return this;
            }

            public final Builder shapes(Shapes shapes) {
                Intrinsics.checkNotNullParameter(shapes, "shapes");
                this.shapes = shapes;
                return this;
            }

            public final Builder typography(Typography typography) {
                Intrinsics.checkNotNullParameter(typography, "typography");
                this.typography = typography;
                return this;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Appearance> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Appearance createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable.Creator<Colors> creator = Colors.CREATOR;
                return new Appearance(creator.createFromParcel(parcel), creator.createFromParcel(parcel), Shapes.CREATOR.createFromParcel(parcel), Typography.CREATOR.createFromParcel(parcel), PrimaryButton.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Appearance[] newArray(int i) {
                return new Appearance[i];
            }
        }

        public Appearance() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ Appearance copy$default(Appearance appearance, Colors colors, Colors colors2, Shapes shapes, Typography typography, PrimaryButton primaryButton, int i, Object obj) {
            if ((i & 1) != 0) {
                colors = appearance.colorsLight;
            }
            if ((i & 2) != 0) {
                colors2 = appearance.colorsDark;
            }
            Colors colors3 = colors2;
            if ((i & 4) != 0) {
                shapes = appearance.shapes;
            }
            Shapes shapes2 = shapes;
            if ((i & 8) != 0) {
                typography = appearance.typography;
            }
            Typography typography2 = typography;
            if ((i & 16) != 0) {
                primaryButton = appearance.primaryButton;
            }
            return appearance.copy(colors, colors3, shapes2, typography2, primaryButton);
        }

        public final Colors component1() {
            return this.colorsLight;
        }

        public final Colors component2() {
            return this.colorsDark;
        }

        public final Shapes component3() {
            return this.shapes;
        }

        public final Typography component4() {
            return this.typography;
        }

        public final PrimaryButton component5() {
            return this.primaryButton;
        }

        public final Appearance copy(Colors colorsLight, Colors colorsDark, Shapes shapes, Typography typography, PrimaryButton primaryButton) {
            Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
            Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
            Intrinsics.checkNotNullParameter(shapes, "shapes");
            Intrinsics.checkNotNullParameter(typography, "typography");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            return new Appearance(colorsLight, colorsDark, shapes, typography, primaryButton);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Appearance) {
                Appearance appearance = (Appearance) obj;
                return Intrinsics.areEqual(this.colorsLight, appearance.colorsLight) && Intrinsics.areEqual(this.colorsDark, appearance.colorsDark) && Intrinsics.areEqual(this.shapes, appearance.shapes) && Intrinsics.areEqual(this.typography, appearance.typography) && Intrinsics.areEqual(this.primaryButton, appearance.primaryButton);
            }
            return false;
        }

        public final Colors getColors(boolean z) {
            return z ? this.colorsDark : this.colorsLight;
        }

        public final Colors getColorsDark() {
            return this.colorsDark;
        }

        public final Colors getColorsLight() {
            return this.colorsLight;
        }

        public final PrimaryButton getPrimaryButton() {
            return this.primaryButton;
        }

        public final Shapes getShapes() {
            return this.shapes;
        }

        public final Typography getTypography() {
            return this.typography;
        }

        public int hashCode() {
            return (((((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.shapes.hashCode()) * 31) + this.typography.hashCode()) * 31) + this.primaryButton.hashCode();
        }

        public String toString() {
            Colors colors = this.colorsLight;
            Colors colors2 = this.colorsDark;
            Shapes shapes = this.shapes;
            Typography typography = this.typography;
            PrimaryButton primaryButton = this.primaryButton;
            return "Appearance(colorsLight=" + colors + ", colorsDark=" + colors2 + ", shapes=" + shapes + ", typography=" + typography + ", primaryButton=" + primaryButton + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.colorsLight.writeToParcel(out, i);
            this.colorsDark.writeToParcel(out, i);
            this.shapes.writeToParcel(out, i);
            this.typography.writeToParcel(out, i);
            this.primaryButton.writeToParcel(out, i);
        }

        public Appearance(Colors colorsLight, Colors colorsDark, Shapes shapes, Typography typography, PrimaryButton primaryButton) {
            Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
            Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
            Intrinsics.checkNotNullParameter(shapes, "shapes");
            Intrinsics.checkNotNullParameter(typography, "typography");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            this.colorsLight = colorsLight;
            this.colorsDark = colorsDark;
            this.shapes = shapes;
            this.typography = typography;
            this.primaryButton = primaryButton;
        }

        public /* synthetic */ Appearance(Colors colors, Colors colors2, Shapes shapes, Typography typography, PrimaryButton primaryButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Colors.Companion.getDefaultLight() : colors, (i & 2) != 0 ? Colors.Companion.getDefaultDark() : colors2, (i & 4) != 0 ? Shapes.Companion.getDefault() : shapes, (i & 8) != 0 ? Typography.Companion.getDefault() : typography, (i & 16) != 0 ? new PrimaryButton(null, null, null, null, 15, null) : primaryButton);
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "Landroid/os/Parcelable;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "email", "", "name", PaymentMethod.BillingDetails.PARAM_PHONE, "(Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "getEmail", "()Ljava/lang/String;", "getName", "getPhone", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class BillingDetails implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BillingDetails> CREATOR = new Creator();
        private final Address address;
        private final String email;
        private final String name;
        private final String phone;

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;", "", "()V", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "email", "", "name", PaymentMethod.BillingDetails.PARAM_PHONE, "addressBuilder", "Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPaymentSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheet.kt\ncom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1086:1\n1#2:1087\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Builder {
            public static final int $stable = 8;
            private Address address;
            private String email;
            private String name;
            private String phone;

            public final Builder address(Address address) {
                this.address = address;
                return this;
            }

            public final BillingDetails build() {
                return new BillingDetails(this.address, this.email, this.name, this.phone);
            }

            public final Builder email(String str) {
                this.email = str;
                return this;
            }

            public final Builder name(String str) {
                this.name = str;
                return this;
            }

            public final Builder phone(String str) {
                this.phone = str;
                return this;
            }

            public final Builder address(Address.Builder addressBuilder) {
                Intrinsics.checkNotNullParameter(addressBuilder, "addressBuilder");
                this.address = addressBuilder.build();
                return this;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<BillingDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingDetails(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetails[] newArray(int i) {
                return new BillingDetails[i];
            }
        }

        public BillingDetails() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ BillingDetails copy$default(BillingDetails billingDetails, Address address, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                address = billingDetails.address;
            }
            if ((i & 2) != 0) {
                str = billingDetails.email;
            }
            if ((i & 4) != 0) {
                str2 = billingDetails.name;
            }
            if ((i & 8) != 0) {
                str3 = billingDetails.phone;
            }
            return billingDetails.copy(address, str, str2, str3);
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final BillingDetails copy(Address address, String str, String str2, String str3) {
            return new BillingDetails(address, str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingDetails) {
                BillingDetails billingDetails = (BillingDetails) obj;
                return Intrinsics.areEqual(this.address, billingDetails.address) && Intrinsics.areEqual(this.email, billingDetails.email) && Intrinsics.areEqual(this.name, billingDetails.name) && Intrinsics.areEqual(this.phone, billingDetails.phone);
            }
            return false;
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            Address address = this.address;
            String str = this.email;
            String str2 = this.name;
            String str3 = this.phone;
            return "BillingDetails(address=" + address + ", email=" + str + ", name=" + str2 + ", phone=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Address address = this.address;
            if (address == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address.writeToParcel(out, i);
            }
            out.writeString(this.email);
            out.writeString(this.name);
            out.writeString(this.phone);
        }

        public BillingDetails(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public /* synthetic */ BillingDetails(Address address, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }
    }

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00018Bu\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b4\u00105Bd\b\u0016\u0012\u0006\u0010\u000e\u001a\u000206\u0012\u0006\u0010\u000f\u001a\u000206\u0012\u0006\u0010\u0010\u001a\u000206\u0012\u0006\u0010\u0011\u001a\u000206\u0012\u0006\u0010\u0012\u001a\u000206\u0012\u0006\u0010\u0013\u001a\u000206\u0012\u0006\u0010\u0015\u001a\u000206\u0012\u0006\u0010\u0016\u001a\u000206\u0012\u0006\u0010\u0014\u001a\u000206\u0012\u0006\u0010\u0017\u001a\u000206\u0012\u0006\u0010\u0018\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b4\u00107J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003Jw\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u000e\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\u00022\b\b\u0003\u0010\u0013\u001a\u00020\u00022\b\b\u0003\u0010\u0014\u001a\u00020\u00022\b\b\u0003\u0010\u0015\u001a\u00020\u00022\b\b\u0003\u0010\u0016\u001a\u00020\u00022\b\b\u0003\u0010\u0017\u001a\u00020\u00022\b\b\u0003\u0010\u0018\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0002HÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010!\u001a\u00020\u0002HÖ\u0001J\u0019\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b-\u0010)R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b.\u0010)R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b/\u0010)R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b0\u0010)R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b1\u0010)R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b2\u0010)R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010'\u001a\u0004\b3\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "primary", "surface", "component", "componentBorder", "componentDivider", "onComponent", "onSurface", "subtitle", "placeholderText", "appBarIcon", "error", "copy", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "I", "getPrimary", "()I", "getSurface", "getComponent", "getComponentBorder", "getComponentDivider", "getOnComponent", "getOnSurface", "getSubtitle", "getPlaceholderText", "getAppBarIcon", "getError", "<init>", "(IIIIIIIIIII)V", "Lpm0;", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Colors implements Parcelable {
        public static final int $stable = 0;
        private static final Colors defaultDark;
        private static final Colors defaultLight;
        private final int appBarIcon;
        private final int component;
        private final int componentBorder;
        private final int componentDivider;
        private final int error;
        private final int onComponent;
        private final int onSurface;
        private final int placeholderText;
        private final int primary;
        private final int subtitle;
        private final int surface;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Colors> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;", "", "()V", "defaultDark", "Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", "getDefaultDark", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", "defaultLight", "getDefaultLight", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Colors getDefaultDark() {
                return Colors.defaultDark;
            }

            public final Colors getDefaultLight() {
                return Colors.defaultLight;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Colors> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Colors createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Colors(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Colors[] newArray(int i) {
                return new Colors[i];
            }
        }

        static {
            StripeThemeDefaults stripeThemeDefaults = StripeThemeDefaults.INSTANCE;
            defaultLight = new Colors(stripeThemeDefaults.getColorsLight().getMaterialColors().m94900j(), stripeThemeDefaults.getColorsLight().getMaterialColors().m94896n(), stripeThemeDefaults.getColorsLight().m116695getComponent0d7_KjU(), stripeThemeDefaults.getColorsLight().m116696getComponentBorder0d7_KjU(), stripeThemeDefaults.getColorsLight().m116697getComponentDivider0d7_KjU(), stripeThemeDefaults.getColorsLight().m116698getOnComponent0d7_KjU(), stripeThemeDefaults.getColorsLight().m116700getSubtitle0d7_KjU(), stripeThemeDefaults.getColorsLight().m116699getPlaceholderText0d7_KjU(), stripeThemeDefaults.getColorsLight().getMaterialColors().m94901i(), stripeThemeDefaults.getColorsLight().m116694getAppBarIcon0d7_KjU(), stripeThemeDefaults.getColorsLight().getMaterialColors().m94906d(), null);
            defaultDark = new Colors(stripeThemeDefaults.getColorsDark().getMaterialColors().m94900j(), stripeThemeDefaults.getColorsDark().getMaterialColors().m94896n(), stripeThemeDefaults.getColorsDark().m116695getComponent0d7_KjU(), stripeThemeDefaults.getColorsDark().m116696getComponentBorder0d7_KjU(), stripeThemeDefaults.getColorsDark().m116697getComponentDivider0d7_KjU(), stripeThemeDefaults.getColorsDark().m116698getOnComponent0d7_KjU(), stripeThemeDefaults.getColorsDark().m116700getSubtitle0d7_KjU(), stripeThemeDefaults.getColorsDark().m116699getPlaceholderText0d7_KjU(), stripeThemeDefaults.getColorsDark().getMaterialColors().m94901i(), stripeThemeDefaults.getColorsDark().m116694getAppBarIcon0d7_KjU(), stripeThemeDefaults.getColorsDark().getMaterialColors().m94906d(), null);
        }

        public /* synthetic */ Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
        }

        public final int component1() {
            return this.primary;
        }

        public final int component10() {
            return this.appBarIcon;
        }

        public final int component11() {
            return this.error;
        }

        public final int component2() {
            return this.surface;
        }

        public final int component3() {
            return this.component;
        }

        public final int component4() {
            return this.componentBorder;
        }

        public final int component5() {
            return this.componentDivider;
        }

        public final int component6() {
            return this.onComponent;
        }

        public final int component7() {
            return this.onSurface;
        }

        public final int component8() {
            return this.subtitle;
        }

        public final int component9() {
            return this.placeholderText;
        }

        public final Colors copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            return new Colors(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Colors) {
                Colors colors = (Colors) obj;
                return this.primary == colors.primary && this.surface == colors.surface && this.component == colors.component && this.componentBorder == colors.componentBorder && this.componentDivider == colors.componentDivider && this.onComponent == colors.onComponent && this.onSurface == colors.onSurface && this.subtitle == colors.subtitle && this.placeholderText == colors.placeholderText && this.appBarIcon == colors.appBarIcon && this.error == colors.error;
            }
            return false;
        }

        public final int getAppBarIcon() {
            return this.appBarIcon;
        }

        public final int getComponent() {
            return this.component;
        }

        public final int getComponentBorder() {
            return this.componentBorder;
        }

        public final int getComponentDivider() {
            return this.componentDivider;
        }

        public final int getError() {
            return this.error;
        }

        public final int getOnComponent() {
            return this.onComponent;
        }

        public final int getOnSurface() {
            return this.onSurface;
        }

        public final int getPlaceholderText() {
            return this.placeholderText;
        }

        public final int getPrimary() {
            return this.primary;
        }

        public final int getSubtitle() {
            return this.subtitle;
        }

        public final int getSurface() {
            return this.surface;
        }

        public int hashCode() {
            return (((((((((((((((((((Integer.hashCode(this.primary) * 31) + Integer.hashCode(this.surface)) * 31) + Integer.hashCode(this.component)) * 31) + Integer.hashCode(this.componentBorder)) * 31) + Integer.hashCode(this.componentDivider)) * 31) + Integer.hashCode(this.onComponent)) * 31) + Integer.hashCode(this.onSurface)) * 31) + Integer.hashCode(this.subtitle)) * 31) + Integer.hashCode(this.placeholderText)) * 31) + Integer.hashCode(this.appBarIcon)) * 31) + Integer.hashCode(this.error);
        }

        public String toString() {
            int i = this.primary;
            int i2 = this.surface;
            int i3 = this.component;
            int i4 = this.componentBorder;
            int i5 = this.componentDivider;
            int i6 = this.onComponent;
            int i7 = this.onSurface;
            int i8 = this.subtitle;
            int i9 = this.placeholderText;
            int i10 = this.appBarIcon;
            int i11 = this.error;
            return "Colors(primary=" + i + ", surface=" + i2 + ", component=" + i3 + ", componentBorder=" + i4 + ", componentDivider=" + i5 + ", onComponent=" + i6 + ", onSurface=" + i7 + ", subtitle=" + i8 + ", placeholderText=" + i9 + ", appBarIcon=" + i10 + ", error=" + i11 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.primary);
            out.writeInt(this.surface);
            out.writeInt(this.component);
            out.writeInt(this.componentBorder);
            out.writeInt(this.componentDivider);
            out.writeInt(this.onComponent);
            out.writeInt(this.onSurface);
            out.writeInt(this.subtitle);
            out.writeInt(this.placeholderText);
            out.writeInt(this.appBarIcon);
            out.writeInt(this.error);
        }

        public Colors(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.primary = i;
            this.surface = i2;
            this.component = i3;
            this.componentBorder = i4;
            this.componentDivider = i5;
            this.onComponent = i6;
            this.onSurface = i7;
            this.subtitle = i8;
            this.placeholderText = i9;
            this.appBarIcon = i10;
            this.error = i11;
        }

        private Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
            this(C50619vm0.m8173h(j), C50619vm0.m8173h(j2), C50619vm0.m8173h(j3), C50619vm0.m8173h(j4), C50619vm0.m8173h(j5), C50619vm0.m8173h(j6), C50619vm0.m8173h(j9), C50619vm0.m8173h(j7), C50619vm0.m8173h(j8), C50619vm0.m8173h(j10), C50619vm0.m8173h(j11));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;", "", "()V", "resetCustomer", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void resetCustomer(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            new CookieStore(context).clear();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001@Bu\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0012HÆ\u0003Jy\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u00104\u001a\u000205HÖ\u0001J\u0013\u00106\u001a\u00020\u000f2\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u000205HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000205HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006A"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "Landroid/os/Parcelable;", "merchantDisplayName", "", PaymentSheetEvent.FIELD_CUSTOMER, "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "googlePay", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "primaryButtonColor", "Landroid/content/res/ColorStateList;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "allowsDelayedPaymentMethods", "", "allowsPaymentMethodsRequiringShippingAddress", PaymentSheetEvent.FIELD_APPEARANCE, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "primaryButtonLabel", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;Landroid/content/res/ColorStateList;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZZLcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/String;)V", "getAllowsDelayedPaymentMethods", "()Z", "getAllowsPaymentMethodsRequiringShippingAddress", "getAppearance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "getCustomer", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "getDefaultBillingDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getGooglePay", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "getMerchantDisplayName", "()Ljava/lang/String;", "getPrimaryButtonColor$annotations", "()V", "getPrimaryButtonColor", "()Landroid/content/res/ColorStateList;", "getPrimaryButtonLabel", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Configuration implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Configuration> CREATOR = new Creator();
        private final boolean allowsDelayedPaymentMethods;
        private final boolean allowsPaymentMethodsRequiringShippingAddress;
        private final Appearance appearance;
        private final CustomerConfiguration customer;
        private final BillingDetails defaultBillingDetails;
        private final GooglePayConfiguration googlePay;
        private final String merchantDisplayName;
        private final ColorStateList primaryButtonColor;
        private final String primaryButtonLabel;
        private final AddressDetails shippingDetails;

        @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;", "", "merchantDisplayName", "", "(Ljava/lang/String;)V", "allowsDelayedPaymentMethods", "", "allowsPaymentMethodsRequiringShippingAddress", PaymentSheetEvent.FIELD_APPEARANCE, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", PaymentSheetEvent.FIELD_CUSTOMER, "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "googlePay", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "primaryButtonColor", "Landroid/content/res/ColorStateList;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPaymentSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheet.kt\ncom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1086:1\n1#2:1087\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Builder {
            public static final int $stable = 8;
            private boolean allowsDelayedPaymentMethods;
            private boolean allowsPaymentMethodsRequiringShippingAddress;
            private Appearance appearance;
            private CustomerConfiguration customer;
            private BillingDetails defaultBillingDetails;
            private GooglePayConfiguration googlePay;
            private String merchantDisplayName;
            private ColorStateList primaryButtonColor;
            private AddressDetails shippingDetails;

            public Builder(String merchantDisplayName) {
                Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
                this.merchantDisplayName = merchantDisplayName;
                this.appearance = new Appearance(null, null, null, null, null, 31, null);
            }

            public final Builder allowsDelayedPaymentMethods(boolean z) {
                this.allowsDelayedPaymentMethods = z;
                return this;
            }

            public final Builder allowsPaymentMethodsRequiringShippingAddress(boolean z) {
                this.allowsPaymentMethodsRequiringShippingAddress = z;
                return this;
            }

            public final Builder appearance(Appearance appearance) {
                Intrinsics.checkNotNullParameter(appearance, "appearance");
                this.appearance = appearance;
                return this;
            }

            public final Configuration build() {
                return new Configuration(this.merchantDisplayName, this.customer, this.googlePay, this.primaryButtonColor, this.defaultBillingDetails, this.shippingDetails, this.allowsDelayedPaymentMethods, this.allowsPaymentMethodsRequiringShippingAddress, this.appearance, null, 512, null);
            }

            public final Builder customer(CustomerConfiguration customerConfiguration) {
                this.customer = customerConfiguration;
                return this;
            }

            public final Builder defaultBillingDetails(BillingDetails billingDetails) {
                this.defaultBillingDetails = billingDetails;
                return this;
            }

            public final Builder googlePay(GooglePayConfiguration googlePayConfiguration) {
                this.googlePay = googlePayConfiguration;
                return this;
            }

            public final Builder merchantDisplayName(String merchantDisplayName) {
                Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
                this.merchantDisplayName = merchantDisplayName;
                return this;
            }

            @Deprecated(message = "Use Appearance parameter to customize primary button color", replaceWith = @ReplaceWith(expression = "Appearance.colorsLight/colorsDark.primary or PrimaryButton.colorsLight/colorsDark.background", imports = {}))
            public final Builder primaryButtonColor(ColorStateList colorStateList) {
                this.primaryButtonColor = colorStateList;
                return this;
            }

            public final Builder shippingDetails(AddressDetails addressDetails) {
                this.shippingDetails = addressDetails;
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
                return new Configuration(parcel.readString(), parcel.readInt() == 0 ? null : CustomerConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GooglePayConfiguration.CREATOR.createFromParcel(parcel), (ColorStateList) parcel.readParcelable(Configuration.class.getClassLoader()), parcel.readInt() == 0 ? null : BillingDetails.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AddressDetails.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0, Appearance.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration[] newArray(int i) {
                return new Configuration[i];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(String merchantDisplayName) {
            this(merchantDisplayName, null, null, null, null, null, false, false, null, null, Place.TYPE_SUBLOCALITY, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        @Deprecated(message = "Use Appearance parameter to customize primary button color", replaceWith = @ReplaceWith(expression = "Appearance.colorsLight/colorsDark.primary or PrimaryButton.colorsLight/colorsDark.background", imports = {}))
        public static /* synthetic */ void getPrimaryButtonColor$annotations() {
        }

        public final String component1() {
            return this.merchantDisplayName;
        }

        public final String component10() {
            return this.primaryButtonLabel;
        }

        public final CustomerConfiguration component2() {
            return this.customer;
        }

        public final GooglePayConfiguration component3() {
            return this.googlePay;
        }

        public final ColorStateList component4() {
            return this.primaryButtonColor;
        }

        public final BillingDetails component5() {
            return this.defaultBillingDetails;
        }

        public final AddressDetails component6() {
            return this.shippingDetails;
        }

        public final boolean component7() {
            return this.allowsDelayedPaymentMethods;
        }

        public final boolean component8() {
            return this.allowsPaymentMethodsRequiringShippingAddress;
        }

        public final Appearance component9() {
            return this.appearance;
        }

        public final Configuration copy(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, Appearance appearance, String str) {
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            return new Configuration(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, z, z2, appearance, str);
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
                return Intrinsics.areEqual(this.merchantDisplayName, configuration.merchantDisplayName) && Intrinsics.areEqual(this.customer, configuration.customer) && Intrinsics.areEqual(this.googlePay, configuration.googlePay) && Intrinsics.areEqual(this.primaryButtonColor, configuration.primaryButtonColor) && Intrinsics.areEqual(this.defaultBillingDetails, configuration.defaultBillingDetails) && Intrinsics.areEqual(this.shippingDetails, configuration.shippingDetails) && this.allowsDelayedPaymentMethods == configuration.allowsDelayedPaymentMethods && this.allowsPaymentMethodsRequiringShippingAddress == configuration.allowsPaymentMethodsRequiringShippingAddress && Intrinsics.areEqual(this.appearance, configuration.appearance) && Intrinsics.areEqual(this.primaryButtonLabel, configuration.primaryButtonLabel);
            }
            return false;
        }

        public final boolean getAllowsDelayedPaymentMethods() {
            return this.allowsDelayedPaymentMethods;
        }

        public final boolean getAllowsPaymentMethodsRequiringShippingAddress() {
            return this.allowsPaymentMethodsRequiringShippingAddress;
        }

        public final Appearance getAppearance() {
            return this.appearance;
        }

        public final CustomerConfiguration getCustomer() {
            return this.customer;
        }

        public final BillingDetails getDefaultBillingDetails() {
            return this.defaultBillingDetails;
        }

        public final GooglePayConfiguration getGooglePay() {
            return this.googlePay;
        }

        public final String getMerchantDisplayName() {
            return this.merchantDisplayName;
        }

        public final ColorStateList getPrimaryButtonColor() {
            return this.primaryButtonColor;
        }

        public final String getPrimaryButtonLabel() {
            return this.primaryButtonLabel;
        }

        public final AddressDetails getShippingDetails() {
            return this.shippingDetails;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.merchantDisplayName.hashCode() * 31;
            CustomerConfiguration customerConfiguration = this.customer;
            int hashCode2 = (hashCode + (customerConfiguration == null ? 0 : customerConfiguration.hashCode())) * 31;
            GooglePayConfiguration googlePayConfiguration = this.googlePay;
            int hashCode3 = (hashCode2 + (googlePayConfiguration == null ? 0 : googlePayConfiguration.hashCode())) * 31;
            ColorStateList colorStateList = this.primaryButtonColor;
            int hashCode4 = (hashCode3 + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
            BillingDetails billingDetails = this.defaultBillingDetails;
            int hashCode5 = (hashCode4 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
            AddressDetails addressDetails = this.shippingDetails;
            int hashCode6 = (hashCode5 + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31;
            boolean z = this.allowsDelayedPaymentMethods;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode6 + i) * 31;
            boolean z2 = this.allowsPaymentMethodsRequiringShippingAddress;
            int hashCode7 = (((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.appearance.hashCode()) * 31;
            String str = this.primaryButtonLabel;
            return hashCode7 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.merchantDisplayName;
            CustomerConfiguration customerConfiguration = this.customer;
            GooglePayConfiguration googlePayConfiguration = this.googlePay;
            ColorStateList colorStateList = this.primaryButtonColor;
            BillingDetails billingDetails = this.defaultBillingDetails;
            AddressDetails addressDetails = this.shippingDetails;
            boolean z = this.allowsDelayedPaymentMethods;
            boolean z2 = this.allowsPaymentMethodsRequiringShippingAddress;
            Appearance appearance = this.appearance;
            String str2 = this.primaryButtonLabel;
            return "Configuration(merchantDisplayName=" + str + ", customer=" + customerConfiguration + ", googlePay=" + googlePayConfiguration + ", primaryButtonColor=" + colorStateList + ", defaultBillingDetails=" + billingDetails + ", shippingDetails=" + addressDetails + ", allowsDelayedPaymentMethods=" + z + ", allowsPaymentMethodsRequiringShippingAddress=" + z2 + ", appearance=" + appearance + ", primaryButtonLabel=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.merchantDisplayName);
            CustomerConfiguration customerConfiguration = this.customer;
            if (customerConfiguration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                customerConfiguration.writeToParcel(out, i);
            }
            GooglePayConfiguration googlePayConfiguration = this.googlePay;
            if (googlePayConfiguration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                googlePayConfiguration.writeToParcel(out, i);
            }
            out.writeParcelable(this.primaryButtonColor, i);
            BillingDetails billingDetails = this.defaultBillingDetails;
            if (billingDetails == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                billingDetails.writeToParcel(out, i);
            }
            AddressDetails addressDetails = this.shippingDetails;
            if (addressDetails == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                addressDetails.writeToParcel(out, i);
            }
            out.writeInt(this.allowsDelayedPaymentMethods ? 1 : 0);
            out.writeInt(this.allowsPaymentMethodsRequiringShippingAddress ? 1 : 0);
            this.appearance.writeToParcel(out, i);
            out.writeString(this.primaryButtonLabel);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration) {
            this(merchantDisplayName, customerConfiguration, null, null, null, null, false, false, null, null, Place.TYPE_ROUTE, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, null, null, null, false, false, null, null, Place.TYPE_POSTAL_CODE_PREFIX, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, null, null, false, false, null, null, Place.TYPE_INTERSECTION, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, null, false, false, null, null, 992, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, false, false, null, null, 960, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, z, false, null, null, 896, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, z, z2, null, null, 768, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, Appearance appearance) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, z, z2, appearance, null, 512, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
        }

        @JvmOverloads
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, Appearance appearance, String str) {
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            this.merchantDisplayName = merchantDisplayName;
            this.customer = customerConfiguration;
            this.googlePay = googlePayConfiguration;
            this.primaryButtonColor = colorStateList;
            this.defaultBillingDetails = billingDetails;
            this.shippingDetails = addressDetails;
            this.allowsDelayedPaymentMethods = z;
            this.allowsPaymentMethodsRequiringShippingAddress = z2;
            this.appearance = appearance;
            this.primaryButtonLabel = str;
        }

        public /* synthetic */ Configuration(String str, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, Appearance appearance, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : customerConfiguration, (i & 4) != 0 ? null : googlePayConfiguration, (i & 8) != 0 ? null : colorStateList, (i & 16) != 0 ? null : billingDetails, (i & 32) != 0 ? null : addressDetails, (i & 64) != 0 ? false : z, (i & 128) == 0 ? z2 : false, (i & 256) != 0 ? new Appearance(null, null, null, null, null, 31, null) : appearance, (i & 512) == 0 ? str2 : null);
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Landroid/os/Parcelable;", "id", "", "ephemeralKeySecret", "(Ljava/lang/String;Ljava/lang/String;)V", "getEphemeralKeySecret", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class CustomerConfiguration implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<CustomerConfiguration> CREATOR = new Creator();
        private final String ephemeralKeySecret;

        /* renamed from: id */
        private final String f75401id;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<CustomerConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomerConfiguration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomerConfiguration(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomerConfiguration[] newArray(int i) {
                return new CustomerConfiguration[i];
            }
        }

        public CustomerConfiguration(String id, String ephemeralKeySecret) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
            this.f75401id = id;
            this.ephemeralKeySecret = ephemeralKeySecret;
        }

        public static /* synthetic */ CustomerConfiguration copy$default(CustomerConfiguration customerConfiguration, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customerConfiguration.f75401id;
            }
            if ((i & 2) != 0) {
                str2 = customerConfiguration.ephemeralKeySecret;
            }
            return customerConfiguration.copy(str, str2);
        }

        public final String component1() {
            return this.f75401id;
        }

        public final String component2() {
            return this.ephemeralKeySecret;
        }

        public final CustomerConfiguration copy(String id, String ephemeralKeySecret) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
            return new CustomerConfiguration(id, ephemeralKeySecret);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CustomerConfiguration) {
                CustomerConfiguration customerConfiguration = (CustomerConfiguration) obj;
                return Intrinsics.areEqual(this.f75401id, customerConfiguration.f75401id) && Intrinsics.areEqual(this.ephemeralKeySecret, customerConfiguration.ephemeralKeySecret);
            }
            return false;
        }

        public final String getEphemeralKeySecret() {
            return this.ephemeralKeySecret;
        }

        public final String getId() {
            return this.f75401id;
        }

        public int hashCode() {
            return (this.f75401id.hashCode() * 31) + this.ephemeralKeySecret.hashCode();
        }

        public String toString() {
            String str = this.f75401id;
            String str2 = this.ephemeralKeySecret;
            return "CustomerConfiguration(id=" + str + ", ephemeralKeySecret=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f75401id);
            out.writeString(this.ephemeralKeySecret);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u001a\u001bJ$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH'J$\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J$\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0015\u001a\u00020\tH&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\b\u0010\u0018\u001a\u00020\tH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "setShippingDetails", "(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "configureWithIntentConfiguration", "", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "callback", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;", "configureWithPaymentIntent", "paymentIntentClientSecret", "", "configureWithSetupIntent", "setupIntentClientSecret", "confirm", "getPaymentOption", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "presentPaymentOptions", "Companion", "ConfigCallback", com.paypal.android.sdk.onetouch.core.Result.f74995h, "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface FlowController {
        public static final Companion Companion = Companion.$$INSTANCE;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;", "", "onConfigured", "", "success", "", "error", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public interface ConfigCallback {
            void onConfigured(boolean z, Throwable th);
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void configureWithIntentConfiguration$default(FlowController flowController, IntentConfiguration intentConfiguration, Configuration configuration, ConfigCallback configCallback, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configureWithIntentConfiguration");
                }
                if ((i & 2) != 0) {
                    configuration = null;
                }
                flowController.configureWithIntentConfiguration(intentConfiguration, configuration, configCallback);
            }

            public static /* synthetic */ void configureWithPaymentIntent$default(FlowController flowController, String str, Configuration configuration, ConfigCallback configCallback, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configureWithPaymentIntent");
                }
                if ((i & 2) != 0) {
                    configuration = null;
                }
                flowController.configureWithPaymentIntent(str, configuration, configCallback);
            }

            public static /* synthetic */ void configureWithSetupIntent$default(FlowController flowController, String str, Configuration configuration, ConfigCallback configCallback, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configureWithSetupIntent");
                }
                if ((i & 2) != 0) {
                    configuration = null;
                }
                flowController.configureWithSetupIntent(str, configuration, configCallback);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result;", "", "()V", "Failure", "Success", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result$Failure;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result$Success;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static abstract class Result {
            public static final int $stable = 0;

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result$Failure;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Failure extends Result {
                public static final int $stable = 8;
                private final Throwable error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Failure(Throwable error) {
                    super(null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    this.error = error;
                }

                public final Throwable getError() {
                    return this.error;
                }
            }

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result$Success;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result;", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Success extends Result {
                public static final int $stable = 0;
                public static final Success INSTANCE = new Success();

                private Success() {
                    super(null);
                }
            }

            public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Result() {
            }
        }

        @JvmStatic
        static FlowController create(ComponentActivity componentActivity, PaymentOptionCallback paymentOptionCallback, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return Companion.create(componentActivity, paymentOptionCallback, createIntentCallback, paymentSheetResultCallback);
        }

        void configureWithIntentConfiguration(IntentConfiguration intentConfiguration, Configuration configuration, ConfigCallback configCallback);

        void configureWithPaymentIntent(String str, Configuration configuration, ConfigCallback configCallback);

        void configureWithSetupIntent(String str, Configuration configuration, ConfigCallback configCallback);

        void confirm();

        PaymentOption getPaymentOption();

        AddressDetails getShippingDetails();

        void presentPaymentOptions();

        void setShippingDetails(AddressDetails addressDetails);

        @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Companion;", "", "()V", "create", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "activity", "Landroidx/activity/ComponentActivity;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "createIntentCallback", "Lcom/stripe/android/CreateIntentCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "createIntentCallbackForServerSideConfirmation", "Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;", "fragment", "Landroidx/fragment/app/Fragment;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @JvmStatic
            public final FlowController create(ComponentActivity activity, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                return new FlowControllerFactory(activity, paymentOptionCallback, paymentResultCallback).create();
            }

            @JvmStatic
            public final FlowController create(ComponentActivity activity, PaymentOptionCallback paymentOptionCallback, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                IntentConfirmationInterceptor.Companion.setCreateIntentCallback(createIntentCallback);
                return new FlowControllerFactory(activity, paymentOptionCallback, paymentResultCallback).create();
            }

            @JvmStatic
            public final FlowController create(ComponentActivity activity, PaymentOptionCallback paymentOptionCallback, CreateIntentCallbackForServerSideConfirmation createIntentCallbackForServerSideConfirmation, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(createIntentCallbackForServerSideConfirmation, "createIntentCallbackForServerSideConfirmation");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                IntentConfirmationInterceptor.Companion.setCreateIntentCallback(createIntentCallbackForServerSideConfirmation);
                return new FlowControllerFactory(activity, paymentOptionCallback, paymentResultCallback).create();
            }

            @JvmStatic
            public final FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                return new FlowControllerFactory(fragment, paymentOptionCallback, paymentResultCallback).create();
            }

            @JvmStatic
            public final FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                IntentConfirmationInterceptor.Companion.setCreateIntentCallback(createIntentCallback);
                return new FlowControllerFactory(fragment, paymentOptionCallback, paymentResultCallback).create();
            }

            @JvmStatic
            public final FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, CreateIntentCallbackForServerSideConfirmation createIntentCallbackForServerSideConfirmation, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(createIntentCallbackForServerSideConfirmation, "createIntentCallbackForServerSideConfirmation");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                IntentConfirmationInterceptor.Companion.setCreateIntentCallback(createIntentCallbackForServerSideConfirmation);
                return new FlowControllerFactory(fragment, paymentOptionCallback, paymentResultCallback).create();
            }
        }

        @JvmStatic
        static FlowController create(ComponentActivity componentActivity, PaymentOptionCallback paymentOptionCallback, CreateIntentCallbackForServerSideConfirmation createIntentCallbackForServerSideConfirmation, PaymentSheetResultCallback paymentSheetResultCallback) {
            return Companion.create(componentActivity, paymentOptionCallback, createIntentCallbackForServerSideConfirmation, paymentSheetResultCallback);
        }

        @JvmStatic
        static FlowController create(ComponentActivity componentActivity, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return Companion.create(componentActivity, paymentOptionCallback, paymentSheetResultCallback);
        }

        @JvmStatic
        static FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return Companion.create(fragment, paymentOptionCallback, createIntentCallback, paymentSheetResultCallback);
        }

        @JvmStatic
        static FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, CreateIntentCallbackForServerSideConfirmation createIntentCallbackForServerSideConfirmation, PaymentSheetResultCallback paymentSheetResultCallback) {
            return Companion.create(fragment, paymentOptionCallback, createIntentCallbackForServerSideConfirmation, paymentSheetResultCallback);
        }

        @JvmStatic
        static FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return Companion.create(fragment, paymentOptionCallback, paymentSheetResultCallback);
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H ¢\u0006\u0002\b\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "Landroid/os/Parcelable;", "()V", "validate", "", "validate$paymentsheet_release", "DeferredIntent", "PaymentIntent", "SetupIntent", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$PaymentIntent;", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$SetupIntent;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class InitializationMode implements Parcelable {

        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\r\u0010\u0012\u001a\u00020\u0013H\u0010¢\u0006\u0002\b\u0014J\u0019\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)V", "getIntentConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "validate", "", "validate$paymentsheet_release", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class DeferredIntent extends InitializationMode {
            public static final Parcelable.Creator<DeferredIntent> CREATOR = new Creator();
            private final IntentConfiguration intentConfiguration;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<DeferredIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DeferredIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DeferredIntent(IntentConfiguration.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DeferredIntent[] newArray(int i) {
                    return new DeferredIntent[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeferredIntent(IntentConfiguration intentConfiguration) {
                super(null);
                Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
                this.intentConfiguration = intentConfiguration;
            }

            public static /* synthetic */ DeferredIntent copy$default(DeferredIntent deferredIntent, IntentConfiguration intentConfiguration, int i, Object obj) {
                if ((i & 1) != 0) {
                    intentConfiguration = deferredIntent.intentConfiguration;
                }
                return deferredIntent.copy(intentConfiguration);
            }

            public final IntentConfiguration component1() {
                return this.intentConfiguration;
            }

            public final DeferredIntent copy(IntentConfiguration intentConfiguration) {
                Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
                return new DeferredIntent(intentConfiguration);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DeferredIntent) && Intrinsics.areEqual(this.intentConfiguration, ((DeferredIntent) obj).intentConfiguration);
            }

            public final IntentConfiguration getIntentConfiguration() {
                return this.intentConfiguration;
            }

            public int hashCode() {
                return this.intentConfiguration.hashCode();
            }

            public String toString() {
                IntentConfiguration intentConfiguration = this.intentConfiguration;
                return "DeferredIntent(intentConfiguration=" + intentConfiguration + ")";
            }

            @Override // com.stripe.android.paymentsheet.PaymentSheet.InitializationMode
            public void validate$paymentsheet_release() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                this.intentConfiguration.writeToParcel(out, i);
            }
        }

        @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\r\u0010\u0011\u001a\u00020\u0012H\u0010¢\u0006\u0002\b\u0013J\u0019\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$PaymentIntent;", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "clientSecret", "", "(Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "validate", "", "validate$paymentsheet_release", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class PaymentIntent extends InitializationMode {
            public static final Parcelable.Creator<PaymentIntent> CREATOR = new Creator();
            private final String clientSecret;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<PaymentIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PaymentIntent(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntent[] newArray(int i) {
                    return new PaymentIntent[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentIntent(String clientSecret) {
                super(null);
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                this.clientSecret = clientSecret;
            }

            public static /* synthetic */ PaymentIntent copy$default(PaymentIntent paymentIntent, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = paymentIntent.clientSecret;
                }
                return paymentIntent.copy(str);
            }

            public final String component1() {
                return this.clientSecret;
            }

            public final PaymentIntent copy(String clientSecret) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new PaymentIntent(clientSecret);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentIntent) && Intrinsics.areEqual(this.clientSecret, ((PaymentIntent) obj).clientSecret);
            }

            public final String getClientSecret() {
                return this.clientSecret;
            }

            public int hashCode() {
                return this.clientSecret.hashCode();
            }

            public String toString() {
                String str = this.clientSecret;
                return "PaymentIntent(clientSecret=" + str + ")";
            }

            @Override // com.stripe.android.paymentsheet.PaymentSheet.InitializationMode
            public void validate$paymentsheet_release() {
                new PaymentIntentClientSecret(this.clientSecret).validate();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.clientSecret);
            }
        }

        @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\r\u0010\u0011\u001a\u00020\u0012H\u0010¢\u0006\u0002\b\u0013J\u0019\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$SetupIntent;", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "clientSecret", "", "(Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "validate", "", "validate$paymentsheet_release", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class SetupIntent extends InitializationMode {
            public static final Parcelable.Creator<SetupIntent> CREATOR = new Creator();
            private final String clientSecret;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<SetupIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SetupIntent(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntent[] newArray(int i) {
                    return new SetupIntent[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupIntent(String clientSecret) {
                super(null);
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                this.clientSecret = clientSecret;
            }

            public static /* synthetic */ SetupIntent copy$default(SetupIntent setupIntent, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setupIntent.clientSecret;
                }
                return setupIntent.copy(str);
            }

            public final String component1() {
                return this.clientSecret;
            }

            public final SetupIntent copy(String clientSecret) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new SetupIntent(clientSecret);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetupIntent) && Intrinsics.areEqual(this.clientSecret, ((SetupIntent) obj).clientSecret);
            }

            public final String getClientSecret() {
                return this.clientSecret;
            }

            public int hashCode() {
                return this.clientSecret.hashCode();
            }

            public String toString() {
                String str = this.clientSecret;
                return "SetupIntent(clientSecret=" + str + ")";
            }

            @Override // com.stripe.android.paymentsheet.PaymentSheet.InitializationMode
            public void validate$paymentsheet_release() {
                new SetupIntentClientSecret(this.clientSecret).validate();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.clientSecret);
            }
        }

        public /* synthetic */ InitializationMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract void validate$paymentsheet_release();

        private InitializationMode() {
        }
    }

    @Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;", "Landroid/os/Parcelable;", PaymentSheetEvent.FIELD_COLORS_LIGHT, "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", PaymentSheetEvent.FIELD_COLORS_DARK, "shape", "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;", "typography", "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;)V", "getColorsDark", "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", "getColorsLight", "getShape", "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;", "getTypography", "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PrimaryButton implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PrimaryButton> CREATOR = new Creator();
        private final PrimaryButtonColors colorsDark;
        private final PrimaryButtonColors colorsLight;
        private final PrimaryButtonShape shape;
        private final PrimaryButtonTypography typography;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<PrimaryButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable.Creator<PrimaryButtonColors> creator = PrimaryButtonColors.CREATOR;
                return new PrimaryButton(creator.createFromParcel(parcel), creator.createFromParcel(parcel), PrimaryButtonShape.CREATOR.createFromParcel(parcel), PrimaryButtonTypography.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButton[] newArray(int i) {
                return new PrimaryButton[i];
            }
        }

        public PrimaryButton() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ PrimaryButton copy$default(PrimaryButton primaryButton, PrimaryButtonColors primaryButtonColors, PrimaryButtonColors primaryButtonColors2, PrimaryButtonShape primaryButtonShape, PrimaryButtonTypography primaryButtonTypography, int i, Object obj) {
            if ((i & 1) != 0) {
                primaryButtonColors = primaryButton.colorsLight;
            }
            if ((i & 2) != 0) {
                primaryButtonColors2 = primaryButton.colorsDark;
            }
            if ((i & 4) != 0) {
                primaryButtonShape = primaryButton.shape;
            }
            if ((i & 8) != 0) {
                primaryButtonTypography = primaryButton.typography;
            }
            return primaryButton.copy(primaryButtonColors, primaryButtonColors2, primaryButtonShape, primaryButtonTypography);
        }

        public final PrimaryButtonColors component1() {
            return this.colorsLight;
        }

        public final PrimaryButtonColors component2() {
            return this.colorsDark;
        }

        public final PrimaryButtonShape component3() {
            return this.shape;
        }

        public final PrimaryButtonTypography component4() {
            return this.typography;
        }

        public final PrimaryButton copy(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
            Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
            Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(typography, "typography");
            return new PrimaryButton(colorsLight, colorsDark, shape, typography);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PrimaryButton) {
                PrimaryButton primaryButton = (PrimaryButton) obj;
                return Intrinsics.areEqual(this.colorsLight, primaryButton.colorsLight) && Intrinsics.areEqual(this.colorsDark, primaryButton.colorsDark) && Intrinsics.areEqual(this.shape, primaryButton.shape) && Intrinsics.areEqual(this.typography, primaryButton.typography);
            }
            return false;
        }

        public final PrimaryButtonColors getColorsDark() {
            return this.colorsDark;
        }

        public final PrimaryButtonColors getColorsLight() {
            return this.colorsLight;
        }

        public final PrimaryButtonShape getShape() {
            return this.shape;
        }

        public final PrimaryButtonTypography getTypography() {
            return this.typography;
        }

        public int hashCode() {
            return (((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.shape.hashCode()) * 31) + this.typography.hashCode();
        }

        public String toString() {
            PrimaryButtonColors primaryButtonColors = this.colorsLight;
            PrimaryButtonColors primaryButtonColors2 = this.colorsDark;
            PrimaryButtonShape primaryButtonShape = this.shape;
            PrimaryButtonTypography primaryButtonTypography = this.typography;
            return "PrimaryButton(colorsLight=" + primaryButtonColors + ", colorsDark=" + primaryButtonColors2 + ", shape=" + primaryButtonShape + ", typography=" + primaryButtonTypography + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.colorsLight.writeToParcel(out, i);
            this.colorsDark.writeToParcel(out, i);
            this.shape.writeToParcel(out, i);
            this.typography.writeToParcel(out, i);
        }

        public PrimaryButton(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
            Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
            Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(typography, "typography");
            this.colorsLight = colorsLight;
            this.colorsDark = colorsDark;
            this.shape = shape;
            this.typography = typography;
        }

        public /* synthetic */ PrimaryButton(PrimaryButtonColors primaryButtonColors, PrimaryButtonColors primaryButtonColors2, PrimaryButtonShape primaryButtonShape, PrimaryButtonTypography primaryButtonTypography, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PrimaryButtonColors.Companion.getDefaultLight() : primaryButtonColors, (i & 2) != 0 ? PrimaryButtonColors.Companion.getDefaultDark() : primaryButtonColors2, (i & 4) != 0 ? new PrimaryButtonShape(null, null, 3, null) : primaryButtonShape, (i & 8) != 0 ? new PrimaryButtonTypography(null, null, 3, null) : primaryButtonTypography);
        }
    }

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B'\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 B&\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010!\u0012\u0006\u0010\b\u001a\u00020!\u0012\u0006\u0010\t\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\"J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J0\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/Integer;", "component2", "component3", "background", "onBackground", "border", "copy", "(Ljava/lang/Integer;II)Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/Integer;", "getBackground", "I", "getOnBackground", "()I", "getBorder", "<init>", "(Ljava/lang/Integer;II)V", "Lpm0;", "(Lpm0;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class PrimaryButtonColors implements Parcelable {
        public static final int $stable = 0;
        private static final PrimaryButtonColors defaultDark;
        private static final PrimaryButtonColors defaultLight;
        private final Integer background;
        private final int border;
        private final int onBackground;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<PrimaryButtonColors> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors$Companion;", "", "()V", "defaultDark", "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", "getDefaultDark", "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", "defaultLight", "getDefaultLight", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PrimaryButtonColors getDefaultDark() {
                return PrimaryButtonColors.defaultDark;
            }

            public final PrimaryButtonColors getDefaultLight() {
                return PrimaryButtonColors.defaultLight;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<PrimaryButtonColors> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonColors createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrimaryButtonColors(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonColors[] newArray(int i) {
                return new PrimaryButtonColors[i];
            }
        }

        static {
            StripeThemeDefaults stripeThemeDefaults = StripeThemeDefaults.INSTANCE;
            defaultLight = new PrimaryButtonColors((Integer) null, C50619vm0.m8173h(stripeThemeDefaults.getPrimaryButtonStyle().getColorsLight().m116679getOnBackground0d7_KjU()), C50619vm0.m8173h(stripeThemeDefaults.getPrimaryButtonStyle().getColorsLight().m116678getBorder0d7_KjU()));
            defaultDark = new PrimaryButtonColors((Integer) null, C50619vm0.m8173h(stripeThemeDefaults.getPrimaryButtonStyle().getColorsDark().m116679getOnBackground0d7_KjU()), C50619vm0.m8173h(stripeThemeDefaults.getPrimaryButtonStyle().getColorsDark().m116678getBorder0d7_KjU()));
        }

        public /* synthetic */ PrimaryButtonColors(C47063pm0 c47063pm0, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(c47063pm0, j, j2);
        }

        public static /* synthetic */ PrimaryButtonColors copy$default(PrimaryButtonColors primaryButtonColors, Integer num, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                num = primaryButtonColors.background;
            }
            if ((i3 & 2) != 0) {
                i = primaryButtonColors.onBackground;
            }
            if ((i3 & 4) != 0) {
                i2 = primaryButtonColors.border;
            }
            return primaryButtonColors.copy(num, i, i2);
        }

        public final Integer component1() {
            return this.background;
        }

        public final int component2() {
            return this.onBackground;
        }

        public final int component3() {
            return this.border;
        }

        public final PrimaryButtonColors copy(Integer num, int i, int i2) {
            return new PrimaryButtonColors(num, i, i2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PrimaryButtonColors) {
                PrimaryButtonColors primaryButtonColors = (PrimaryButtonColors) obj;
                return Intrinsics.areEqual(this.background, primaryButtonColors.background) && this.onBackground == primaryButtonColors.onBackground && this.border == primaryButtonColors.border;
            }
            return false;
        }

        public final Integer getBackground() {
            return this.background;
        }

        public final int getBorder() {
            return this.border;
        }

        public final int getOnBackground() {
            return this.onBackground;
        }

        public int hashCode() {
            Integer num = this.background;
            return ((((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.onBackground)) * 31) + Integer.hashCode(this.border);
        }

        public String toString() {
            Integer num = this.background;
            int i = this.onBackground;
            int i2 = this.border;
            return "PrimaryButtonColors(background=" + num + ", onBackground=" + i + ", border=" + i2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            int intValue;
            Intrinsics.checkNotNullParameter(out, "out");
            Integer num = this.background;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.onBackground);
            out.writeInt(this.border);
        }

        public PrimaryButtonColors(Integer num, int i, int i2) {
            this.background = num;
            this.onBackground = i;
            this.border = i2;
        }

        private PrimaryButtonColors(C47063pm0 c47063pm0, long j, long j2) {
            this(c47063pm0 != null ? Integer.valueOf(C50619vm0.m8173h(c47063pm0.m18733w())) : null, C50619vm0.m8173h(j), C50619vm0.m8173h(j2));
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007B\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;", "Landroid/os/Parcelable;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "cornerRadiusDp", "", "borderStrokeWidthDp", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getBorderStrokeWidthDp", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCornerRadiusDp", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PrimaryButtonShape implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PrimaryButtonShape> CREATOR = new Creator();
        private final Float borderStrokeWidthDp;
        private final Float cornerRadiusDp;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<PrimaryButtonShape> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonShape createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrimaryButtonShape(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonShape[] newArray(int i) {
                return new PrimaryButtonShape[i];
            }
        }

        public PrimaryButtonShape() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ PrimaryButtonShape copy$default(PrimaryButtonShape primaryButtonShape, Float f, Float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = primaryButtonShape.cornerRadiusDp;
            }
            if ((i & 2) != 0) {
                f2 = primaryButtonShape.borderStrokeWidthDp;
            }
            return primaryButtonShape.copy(f, f2);
        }

        public final Float component1() {
            return this.cornerRadiusDp;
        }

        public final Float component2() {
            return this.borderStrokeWidthDp;
        }

        public final PrimaryButtonShape copy(Float f, Float f2) {
            return new PrimaryButtonShape(f, f2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PrimaryButtonShape) {
                PrimaryButtonShape primaryButtonShape = (PrimaryButtonShape) obj;
                return Intrinsics.areEqual((Object) this.cornerRadiusDp, (Object) primaryButtonShape.cornerRadiusDp) && Intrinsics.areEqual((Object) this.borderStrokeWidthDp, (Object) primaryButtonShape.borderStrokeWidthDp);
            }
            return false;
        }

        public final Float getBorderStrokeWidthDp() {
            return this.borderStrokeWidthDp;
        }

        public final Float getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        public int hashCode() {
            Float f = this.cornerRadiusDp;
            int hashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.borderStrokeWidthDp;
            return hashCode + (f2 != null ? f2.hashCode() : 0);
        }

        public String toString() {
            Float f = this.cornerRadiusDp;
            Float f2 = this.borderStrokeWidthDp;
            return "PrimaryButtonShape(cornerRadiusDp=" + f + ", borderStrokeWidthDp=" + f2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Float f = this.cornerRadiusDp;
            if (f == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f.floatValue());
            }
            Float f2 = this.borderStrokeWidthDp;
            if (f2 == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeFloat(f2.floatValue());
        }

        public PrimaryButtonShape(Float f, Float f2) {
            this.cornerRadiusDp = f;
            this.borderStrokeWidthDp = f2;
        }

        public /* synthetic */ PrimaryButtonShape(Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2);
        }

        public /* synthetic */ PrimaryButtonShape(Context context, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PrimaryButtonShape(Context context, Integer num, Integer num2) {
            this(num != null ? Float.valueOf(StripeThemeKt.getRawValueFromDimenResource(context, num.intValue())) : null, num2 != null ? Float.valueOf(StripeThemeKt.getRawValueFromDimenResource(context, num2.intValue())) : null);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u001d\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000eJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;", "Landroid/os/Parcelable;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "fontResId", "", "fontSizeSp", "(Landroid/content/Context;Ljava/lang/Integer;I)V", "", "(Ljava/lang/Integer;Ljava/lang/Float;)V", "getFontResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFontSizeSp", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Float;)Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PrimaryButtonTypography implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PrimaryButtonTypography> CREATOR = new Creator();
        private final Integer fontResId;
        private final Float fontSizeSp;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<PrimaryButtonTypography> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonTypography createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrimaryButtonTypography(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonTypography[] newArray(int i) {
                return new PrimaryButtonTypography[i];
            }
        }

        public PrimaryButtonTypography() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ PrimaryButtonTypography copy$default(PrimaryButtonTypography primaryButtonTypography, Integer num, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                num = primaryButtonTypography.fontResId;
            }
            if ((i & 2) != 0) {
                f = primaryButtonTypography.fontSizeSp;
            }
            return primaryButtonTypography.copy(num, f);
        }

        public final Integer component1() {
            return this.fontResId;
        }

        public final Float component2() {
            return this.fontSizeSp;
        }

        public final PrimaryButtonTypography copy(Integer num, Float f) {
            return new PrimaryButtonTypography(num, f);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PrimaryButtonTypography) {
                PrimaryButtonTypography primaryButtonTypography = (PrimaryButtonTypography) obj;
                return Intrinsics.areEqual(this.fontResId, primaryButtonTypography.fontResId) && Intrinsics.areEqual((Object) this.fontSizeSp, (Object) primaryButtonTypography.fontSizeSp);
            }
            return false;
        }

        public final Integer getFontResId() {
            return this.fontResId;
        }

        public final Float getFontSizeSp() {
            return this.fontSizeSp;
        }

        public int hashCode() {
            Integer num = this.fontResId;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f = this.fontSizeSp;
            return hashCode + (f != null ? f.hashCode() : 0);
        }

        public String toString() {
            Integer num = this.fontResId;
            Float f = this.fontSizeSp;
            return "PrimaryButtonTypography(fontResId=" + num + ", fontSizeSp=" + f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Integer num = this.fontResId;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Float f = this.fontSizeSp;
            if (f == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeFloat(f.floatValue());
        }

        public PrimaryButtonTypography(Integer num, Float f) {
            this.fontResId = num;
            this.fontSizeSp = f;
        }

        public /* synthetic */ PrimaryButtonTypography(Integer num, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : f);
        }

        public /* synthetic */ PrimaryButtonTypography(Context context, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : num, i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PrimaryButtonTypography(Context context, Integer num, int i) {
            this(num, Float.valueOf(StripeThemeKt.getRawValueFromDimenResource(context, i)));
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "Landroid/os/Parcelable;", "sizeScaleFactor", "", "fontResId", "", "(FLjava/lang/Integer;)V", "getFontResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSizeScaleFactor", "()F", "component1", "component2", "copy", "(FLjava/lang/Integer;)Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Typography implements Parcelable {
        public static final int $stable = 0;

        /* renamed from: default  reason: not valid java name */
        private static final Typography f122678default;
        private final Integer fontResId;
        private final float sizeScaleFactor;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Typography> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;", "", "()V", "default", "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "getDefault", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Typography getDefault() {
                return Typography.f122678default;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Typography> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Typography createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Typography(parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Typography[] newArray(int i) {
                return new Typography[i];
            }
        }

        static {
            StripeThemeDefaults stripeThemeDefaults = StripeThemeDefaults.INSTANCE;
            f122678default = new Typography(stripeThemeDefaults.getTypography().getFontSizeMultiplier(), stripeThemeDefaults.getTypography().getFontFamily());
        }

        public Typography(float f, Integer num) {
            this.sizeScaleFactor = f;
            this.fontResId = num;
        }

        public static /* synthetic */ Typography copy$default(Typography typography, float f, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                f = typography.sizeScaleFactor;
            }
            if ((i & 2) != 0) {
                num = typography.fontResId;
            }
            return typography.copy(f, num);
        }

        public final float component1() {
            return this.sizeScaleFactor;
        }

        public final Integer component2() {
            return this.fontResId;
        }

        public final Typography copy(float f, Integer num) {
            return new Typography(f, num);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Typography) {
                Typography typography = (Typography) obj;
                return Float.compare(this.sizeScaleFactor, typography.sizeScaleFactor) == 0 && Intrinsics.areEqual(this.fontResId, typography.fontResId);
            }
            return false;
        }

        public final Integer getFontResId() {
            return this.fontResId;
        }

        public final float getSizeScaleFactor() {
            return this.sizeScaleFactor;
        }

        public int hashCode() {
            int hashCode = Float.hashCode(this.sizeScaleFactor) * 31;
            Integer num = this.fontResId;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            float f = this.sizeScaleFactor;
            Integer num = this.fontResId;
            return "Typography(sizeScaleFactor=" + f + ", fontResId=" + num + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            int intValue;
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeFloat(this.sizeScaleFactor);
            Integer num = this.fontResId;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }
    }

    public PaymentSheet(PaymentSheetLauncher paymentSheetLauncher) {
        Intrinsics.checkNotNullParameter(paymentSheetLauncher, "paymentSheetLauncher");
        this.paymentSheetLauncher = paymentSheetLauncher;
    }

    public static /* synthetic */ void presentWithIntentConfiguration$default(PaymentSheet paymentSheet, IntentConfiguration intentConfiguration, Configuration configuration, int i, Object obj) {
        if ((i & 2) != 0) {
            configuration = null;
        }
        paymentSheet.presentWithIntentConfiguration(intentConfiguration, configuration);
    }

    public static /* synthetic */ void presentWithPaymentIntent$default(PaymentSheet paymentSheet, String str, Configuration configuration, int i, Object obj) {
        if ((i & 2) != 0) {
            configuration = null;
        }
        paymentSheet.presentWithPaymentIntent(str, configuration);
    }

    public static /* synthetic */ void presentWithSetupIntent$default(PaymentSheet paymentSheet, String str, Configuration configuration, int i, Object obj) {
        if ((i & 2) != 0) {
            configuration = null;
        }
        paymentSheet.presentWithSetupIntent(str, configuration);
    }

    @JvmOverloads
    public final void presentWithIntentConfiguration(IntentConfiguration intentConfiguration) {
        Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
        presentWithIntentConfiguration$default(this, intentConfiguration, null, 2, null);
    }

    @JvmOverloads
    public final void presentWithPaymentIntent(String paymentIntentClientSecret) {
        Intrinsics.checkNotNullParameter(paymentIntentClientSecret, "paymentIntentClientSecret");
        presentWithPaymentIntent$default(this, paymentIntentClientSecret, null, 2, null);
    }

    @JvmOverloads
    public final void presentWithSetupIntent(String setupIntentClientSecret) {
        Intrinsics.checkNotNullParameter(setupIntentClientSecret, "setupIntentClientSecret");
        presentWithSetupIntent$default(this, setupIntentClientSecret, null, 2, null);
    }

    @JvmOverloads
    public final void presentWithIntentConfiguration(IntentConfiguration intentConfiguration, Configuration configuration) {
        Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
        this.paymentSheetLauncher.present(new InitializationMode.DeferredIntent(intentConfiguration), configuration);
    }

    @JvmOverloads
    public final void presentWithPaymentIntent(String paymentIntentClientSecret, Configuration configuration) {
        Intrinsics.checkNotNullParameter(paymentIntentClientSecret, "paymentIntentClientSecret");
        this.paymentSheetLauncher.present(new InitializationMode.PaymentIntent(paymentIntentClientSecret), configuration);
    }

    @JvmOverloads
    public final void presentWithSetupIntent(String setupIntentClientSecret, Configuration configuration) {
        Intrinsics.checkNotNullParameter(setupIntentClientSecret, "setupIntentClientSecret");
        this.paymentSheetLauncher.present(new InitializationMode.SetupIntent(setupIntentClientSecret), configuration);
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "Landroid/os/Parcelable;", "mode", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", "paymentMethodTypes", "", "", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;Ljava/util/List;)V", "captureMethod", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "getCaptureMethod$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "getMode", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", "getPaymentMethodTypes", "()Ljava/util/List;", "setupFutureUse", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "getSetupFutureUse$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CaptureMethod", "Mode", "SetupFutureUse", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class IntentConfiguration implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<IntentConfiguration> CREATOR = new Creator();
        private final Mode mode;
        private final List<String> paymentMethodTypes;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "", "(Ljava/lang/String;I)V", "Automatic", "Manual", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum CaptureMethod {
            Automatic,
            Manual
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<IntentConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntentConfiguration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntentConfiguration((Mode) parcel.readParcelable(IntentConfiguration.class.getClassLoader()), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntentConfiguration[] newArray(int i) {
                return new IntentConfiguration[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", "Landroid/os/Parcelable;", "()V", "captureMethod", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "getCaptureMethod$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "setupFutureUse", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "getSetupFutureUse$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "Payment", "Setup", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static abstract class Mode implements Parcelable {
            public static final int $stable = 0;

            public /* synthetic */ Mode(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract CaptureMethod getCaptureMethod$paymentsheet_release();

            public abstract SetupFutureUse getSetupFutureUse$paymentsheet_release();

            @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\tX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", "amount", "", "currency", "", "setupFutureUse", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "captureMethod", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "(JLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;)V", "getAmount", "()J", "getCaptureMethod$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "getCurrency", "()Ljava/lang/String;", "getSetupFutureUse$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Payment extends Mode {
                public static final int $stable = 0;
                public static final Parcelable.Creator<Payment> CREATOR = new Creator();
                private final long amount;
                private final CaptureMethod captureMethod;
                private final String currency;
                private final SetupFutureUse setupFutureUse;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* loaded from: classes7.dex */
                public static final class Creator implements Parcelable.Creator<Payment> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Payment createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Payment(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : SetupFutureUse.valueOf(parcel.readString()), CaptureMethod.valueOf(parcel.readString()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Payment[] newArray(int i) {
                        return new Payment[i];
                    }
                }

                public /* synthetic */ Payment(long j, String str, SetupFutureUse setupFutureUse, CaptureMethod captureMethod, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(j, str, (i & 4) != 0 ? null : setupFutureUse, (i & 8) != 0 ? CaptureMethod.Automatic : captureMethod);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final long getAmount() {
                    return this.amount;
                }

                @Override // com.stripe.android.paymentsheet.PaymentSheet.IntentConfiguration.Mode
                public CaptureMethod getCaptureMethod$paymentsheet_release() {
                    return this.captureMethod;
                }

                public final String getCurrency() {
                    return this.currency;
                }

                @Override // com.stripe.android.paymentsheet.PaymentSheet.IntentConfiguration.Mode
                public SetupFutureUse getSetupFutureUse$paymentsheet_release() {
                    return this.setupFutureUse;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i) {
                    Intrinsics.checkNotNullParameter(out, "out");
                    out.writeLong(this.amount);
                    out.writeString(this.currency);
                    SetupFutureUse setupFutureUse = this.setupFutureUse;
                    if (setupFutureUse == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        out.writeString(setupFutureUse.name());
                    }
                    out.writeString(this.captureMethod.name());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Payment(long j, String currency, SetupFutureUse setupFutureUse, CaptureMethod captureMethod) {
                    super(null);
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
                    this.amount = j;
                    this.currency = currency;
                    this.setupFutureUse = setupFutureUse;
                    this.captureMethod = captureMethod;
                }
            }

            @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", "currency", "", "setupFutureUse", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;)V", "captureMethod", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "getCaptureMethod$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "getCurrency", "()Ljava/lang/String;", "getSetupFutureUse$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Setup extends Mode {
                public static final int $stable = 0;
                public static final Parcelable.Creator<Setup> CREATOR = new Creator();
                private final String currency;
                private final SetupFutureUse setupFutureUse;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* loaded from: classes7.dex */
                public static final class Creator implements Parcelable.Creator<Setup> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Setup createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Setup(parcel.readString(), SetupFutureUse.valueOf(parcel.readString()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Setup[] newArray(int i) {
                        return new Setup[i];
                    }
                }

                public /* synthetic */ Setup(String str, SetupFutureUse setupFutureUse, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, (i & 2) != 0 ? SetupFutureUse.OffSession : setupFutureUse);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // com.stripe.android.paymentsheet.PaymentSheet.IntentConfiguration.Mode
                public CaptureMethod getCaptureMethod$paymentsheet_release() {
                    return null;
                }

                public final String getCurrency() {
                    return this.currency;
                }

                @Override // com.stripe.android.paymentsheet.PaymentSheet.IntentConfiguration.Mode
                public SetupFutureUse getSetupFutureUse$paymentsheet_release() {
                    return this.setupFutureUse;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i) {
                    Intrinsics.checkNotNullParameter(out, "out");
                    out.writeString(this.currency);
                    out.writeString(this.setupFutureUse.name());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Setup(String str, SetupFutureUse setupFutureUse) {
                    super(null);
                    Intrinsics.checkNotNullParameter(setupFutureUse, "setupFutureUse");
                    this.currency = str;
                    this.setupFutureUse = setupFutureUse;
                }
            }

            private Mode() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "", "(Ljava/lang/String;I)V", "OnSession", "OffSession", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum SetupFutureUse {
            OnSession,
            OffSession
        }

        public IntentConfiguration(Mode mode, List<String> paymentMethodTypes) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
            this.mode = mode;
            this.paymentMethodTypes = paymentMethodTypes;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final CaptureMethod getCaptureMethod$paymentsheet_release() {
            return this.mode.getCaptureMethod$paymentsheet_release();
        }

        public final Mode getMode() {
            return this.mode;
        }

        public final List<String> getPaymentMethodTypes() {
            return this.paymentMethodTypes;
        }

        public final SetupFutureUse getSetupFutureUse$paymentsheet_release() {
            return this.mode.getSetupFutureUse$paymentsheet_release();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.mode, i);
            out.writeStringList(this.paymentMethodTypes);
        }

        public /* synthetic */ IntentConfiguration(Mode mode, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(mode, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\b\u0012\u0006\u0010\u0006\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "Landroid/os/Parcelable;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "cornerRadiusDp", "", "borderStrokeWidthDp", "(Landroid/content/Context;II)V", "", "(FF)V", "getBorderStrokeWidthDp", "()F", "getCornerRadiusDp", "component1", "component2", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Shapes implements Parcelable {
        public static final int $stable = 0;

        /* renamed from: default  reason: not valid java name */
        private static final Shapes f122677default;
        private final float borderStrokeWidthDp;
        private final float cornerRadiusDp;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Shapes> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;", "", "()V", "default", "Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "getDefault", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Shapes getDefault() {
                return Shapes.f122677default;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Shapes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shapes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Shapes(parcel.readFloat(), parcel.readFloat());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shapes[] newArray(int i) {
                return new Shapes[i];
            }
        }

        static {
            StripeThemeDefaults stripeThemeDefaults = StripeThemeDefaults.INSTANCE;
            f122677default = new Shapes(stripeThemeDefaults.getShapes().getCornerRadius(), stripeThemeDefaults.getShapes().getBorderStrokeWidth());
        }

        public Shapes(float f, float f2) {
            this.cornerRadiusDp = f;
            this.borderStrokeWidthDp = f2;
        }

        public static /* synthetic */ Shapes copy$default(Shapes shapes, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = shapes.cornerRadiusDp;
            }
            if ((i & 2) != 0) {
                f2 = shapes.borderStrokeWidthDp;
            }
            return shapes.copy(f, f2);
        }

        public final float component1() {
            return this.cornerRadiusDp;
        }

        public final float component2() {
            return this.borderStrokeWidthDp;
        }

        public final Shapes copy(float f, float f2) {
            return new Shapes(f, f2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Shapes) {
                Shapes shapes = (Shapes) obj;
                return Float.compare(this.cornerRadiusDp, shapes.cornerRadiusDp) == 0 && Float.compare(this.borderStrokeWidthDp, shapes.borderStrokeWidthDp) == 0;
            }
            return false;
        }

        public final float getBorderStrokeWidthDp() {
            return this.borderStrokeWidthDp;
        }

        public final float getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        public int hashCode() {
            return (Float.hashCode(this.cornerRadiusDp) * 31) + Float.hashCode(this.borderStrokeWidthDp);
        }

        public String toString() {
            float f = this.cornerRadiusDp;
            float f2 = this.borderStrokeWidthDp;
            return "Shapes(cornerRadiusDp=" + f + ", borderStrokeWidthDp=" + f2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeFloat(this.cornerRadiusDp);
            out.writeFloat(this.borderStrokeWidthDp);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Shapes(Context context, int i, int i2) {
            this(StripeThemeKt.getRawValueFromDimenResource(context, i), StripeThemeKt.getRawValueFromDimenResource(context, i2));
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentSheet(ComponentActivity activity, PaymentSheetResultCallback callback) {
        this(new DefaultPaymentSheetLauncher(activity, callback));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "Landroid/os/Parcelable;", "environment", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "countryCode", "", "(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;Ljava/lang/String;)V", "currencyCode", "(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getCurrencyCode", "getEnvironment", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Environment", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class GooglePayConfiguration implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<GooglePayConfiguration> CREATOR = new Creator();
        private final String countryCode;
        private final String currencyCode;
        private final Environment environment;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<GooglePayConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePayConfiguration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GooglePayConfiguration(Environment.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePayConfiguration[] newArray(int i) {
                return new GooglePayConfiguration[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "", "(Ljava/lang/String;I)V", "Production", "Test", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum Environment {
            Production,
            Test
        }

        public GooglePayConfiguration(Environment environment, String countryCode, String str) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.environment = environment;
            this.countryCode = countryCode;
            this.currencyCode = str;
        }

        public static /* synthetic */ GooglePayConfiguration copy$default(GooglePayConfiguration googlePayConfiguration, Environment environment, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                environment = googlePayConfiguration.environment;
            }
            if ((i & 2) != 0) {
                str = googlePayConfiguration.countryCode;
            }
            if ((i & 4) != 0) {
                str2 = googlePayConfiguration.currencyCode;
            }
            return googlePayConfiguration.copy(environment, str, str2);
        }

        public final Environment component1() {
            return this.environment;
        }

        public final String component2() {
            return this.countryCode;
        }

        public final String component3() {
            return this.currencyCode;
        }

        public final GooglePayConfiguration copy(Environment environment, String countryCode, String str) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            return new GooglePayConfiguration(environment, countryCode, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof GooglePayConfiguration) {
                GooglePayConfiguration googlePayConfiguration = (GooglePayConfiguration) obj;
                return this.environment == googlePayConfiguration.environment && Intrinsics.areEqual(this.countryCode, googlePayConfiguration.countryCode) && Intrinsics.areEqual(this.currencyCode, googlePayConfiguration.currencyCode);
            }
            return false;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final Environment getEnvironment() {
            return this.environment;
        }

        public int hashCode() {
            int hashCode = ((this.environment.hashCode() * 31) + this.countryCode.hashCode()) * 31;
            String str = this.currencyCode;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            Environment environment = this.environment;
            String str = this.countryCode;
            String str2 = this.currencyCode;
            return "GooglePayConfiguration(environment=" + environment + ", countryCode=" + str + ", currencyCode=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.environment.name());
            out.writeString(this.countryCode);
            out.writeString(this.currencyCode);
        }

        public /* synthetic */ GooglePayConfiguration(Environment environment, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(environment, str, (i & 4) != 0 ? null : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public GooglePayConfiguration(Environment environment, String countryCode) {
            this(environment, countryCode, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentSheet(ComponentActivity activity, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentResultCallback) {
        this(new DefaultPaymentSheetLauncher(activity, paymentResultCallback));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        IntentConfirmationInterceptor.Companion.setCreateIntentCallback(createIntentCallback);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentSheet(ComponentActivity activity, CreateIntentCallbackForServerSideConfirmation createIntentCallbackForServerSideConfirmation, PaymentSheetResultCallback paymentResultCallback) {
        this(new DefaultPaymentSheetLauncher(activity, paymentResultCallback));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(createIntentCallbackForServerSideConfirmation, "createIntentCallbackForServerSideConfirmation");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        IntentConfirmationInterceptor.Companion.setCreateIntentCallback(createIntentCallbackForServerSideConfirmation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentSheet(Fragment fragment, PaymentSheetResultCallback callback) {
        this(new DefaultPaymentSheetLauncher(fragment, callback));
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentSheet(Fragment fragment, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentResultCallback) {
        this(new DefaultPaymentSheetLauncher(fragment, paymentResultCallback));
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        IntentConfirmationInterceptor.Companion.setCreateIntentCallback(createIntentCallback);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentSheet(Fragment fragment, CreateIntentCallbackForServerSideConfirmation createIntentCallbackForServerSideConfirmation, PaymentSheetResultCallback paymentResultCallback) {
        this(new DefaultPaymentSheetLauncher(fragment, paymentResultCallback));
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(createIntentCallbackForServerSideConfirmation, "createIntentCallbackForServerSideConfirmation");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        IntentConfirmationInterceptor.Companion.setCreateIntentCallback(createIntentCallbackForServerSideConfirmation);
    }
}
