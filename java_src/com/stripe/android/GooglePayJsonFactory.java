package com.stripe.android;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\u00020\u0001:\u0005%&'()B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B1\b\u0011\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J!\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u0016J1\u0010\u0017\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0019JO\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u000b\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m28432d2 = {"Lcom/stripe/android/GooglePayJsonFactory;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "isJcbEnabled", "", "(Landroid/content/Context;Z)V", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "googlePayConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;)V", "Lcom/stripe/android/GooglePayConfig;", "(Lcom/stripe/android/GooglePayConfig;Z)V", "createBaseCardPaymentMethodParams", "Lorg/json/JSONObject;", "createCardPaymentMethod", "billingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "allowCreditCards", "(Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Ljava/lang/Boolean;)Lorg/json/JSONObject;", "createIsReadyToPayRequest", "existingPaymentMethodRequired", "(Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lorg/json/JSONObject;", "createPaymentDataRequest", "transactionInfo", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "shippingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;", "isEmailRequired", "merchantInfo", "Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;", "(Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;ZLcom/stripe/android/GooglePayJsonFactory$MerchantInfo;Ljava/lang/Boolean;)Lorg/json/JSONObject;", "createShippingAddressParameters", "createTransactionInfo", "BillingAddressParameters", "Companion", "MerchantInfo", "ShippingAddressParameters", "TransactionInfo", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayJsonFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayJsonFactory.kt\ncom/stripe/android/GooglePayJsonFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,456:1\n1#2:457\n*E\n"})
/* loaded from: classes6.dex */
public final class GooglePayJsonFactory {
    public static final int $stable = 0;
    @Deprecated
    private static final List<String> ALLOWED_AUTH_METHODS;
    @Deprecated
    private static final int API_VERSION = 2;
    @Deprecated
    private static final int API_VERSION_MINOR = 0;
    @Deprecated
    private static final String CARD_PAYMENT_METHOD = "CARD";
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final List<String> DEFAULT_CARD_NETWORKS;
    @Deprecated
    private static final String JCB_CARD_NETWORK = "JCB";
    private final GooglePayConfig googlePayConfig;
    private final boolean isJcbEnabled;

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B%\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0010J\u000e\u0010\u0011\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0012J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "Landroid/os/Parcelable;", "isRequired", "", "format", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "isPhoneNumberRequired", "(ZLcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;Z)V", "getFormat$payments_core_release", "()Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "isPhoneNumberRequired$payments_core_release", "()Z", "isRequired$payments_core_release", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Format", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class BillingAddressParameters implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BillingAddressParameters> CREATOR = new Creator();
        private final Format format;
        private final boolean isPhoneNumberRequired;
        private final boolean isRequired;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<BillingAddressParameters> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddressParameters createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingAddressParameters(parcel.readInt() != 0, Format.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddressParameters[] newArray(int i) {
                return new BillingAddressParameters[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Min", "Full", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public enum Format {
            Min("MIN"),
            Full("FULL");
            
            private final String code;

            Format(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        @JvmOverloads
        public BillingAddressParameters() {
            this(false, null, false, 7, null);
        }

        public static /* synthetic */ BillingAddressParameters copy$default(BillingAddressParameters billingAddressParameters, boolean z, Format format, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = billingAddressParameters.isRequired;
            }
            if ((i & 2) != 0) {
                format = billingAddressParameters.format;
            }
            if ((i & 4) != 0) {
                z2 = billingAddressParameters.isPhoneNumberRequired;
            }
            return billingAddressParameters.copy(z, format, z2);
        }

        public final boolean component1$payments_core_release() {
            return this.isRequired;
        }

        public final Format component2$payments_core_release() {
            return this.format;
        }

        public final boolean component3$payments_core_release() {
            return this.isPhoneNumberRequired;
        }

        public final BillingAddressParameters copy(boolean z, Format format, boolean z2) {
            Intrinsics.checkNotNullParameter(format, "format");
            return new BillingAddressParameters(z, format, z2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingAddressParameters) {
                BillingAddressParameters billingAddressParameters = (BillingAddressParameters) obj;
                return this.isRequired == billingAddressParameters.isRequired && this.format == billingAddressParameters.format && this.isPhoneNumberRequired == billingAddressParameters.isPhoneNumberRequired;
            }
            return false;
        }

        public final Format getFormat$payments_core_release() {
            return this.format;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.isRequired;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int hashCode = ((r0 * 31) + this.format.hashCode()) * 31;
            boolean z2 = this.isPhoneNumberRequired;
            return hashCode + (z2 ? 1 : z2 ? 1 : 0);
        }

        public final boolean isPhoneNumberRequired$payments_core_release() {
            return this.isPhoneNumberRequired;
        }

        public final boolean isRequired$payments_core_release() {
            return this.isRequired;
        }

        public String toString() {
            boolean z = this.isRequired;
            Format format = this.format;
            boolean z2 = this.isPhoneNumberRequired;
            return "BillingAddressParameters(isRequired=" + z + ", format=" + format + ", isPhoneNumberRequired=" + z2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.isRequired ? 1 : 0);
            out.writeString(this.format.name());
            out.writeInt(this.isPhoneNumberRequired ? 1 : 0);
        }

        @JvmOverloads
        public BillingAddressParameters(boolean z) {
            this(z, null, false, 6, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public BillingAddressParameters(boolean z, Format format) {
            this(z, format, false, 4, null);
            Intrinsics.checkNotNullParameter(format, "format");
        }

        @JvmOverloads
        public BillingAddressParameters(boolean z, Format format, boolean z2) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.isRequired = z;
            this.format = format;
            this.isPhoneNumberRequired = z2;
        }

        public /* synthetic */ BillingAddressParameters(boolean z, Format format, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Format.Min : format, (i & 4) != 0 ? false : z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/GooglePayJsonFactory$Companion;", "", "()V", "ALLOWED_AUTH_METHODS", "", "", "API_VERSION", "", "API_VERSION_MINOR", "CARD_PAYMENT_METHOD", "DEFAULT_CARD_NETWORKS", "JCB_CARD_NETWORK", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;", "Landroid/os/Parcelable;", "merchantName", "", "(Ljava/lang/String;)V", "getMerchantName$payments_core_release", "()Ljava/lang/String;", "component1", "component1$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class MerchantInfo implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<MerchantInfo> CREATOR = new Creator();
        private final String merchantName;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<MerchantInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MerchantInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MerchantInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MerchantInfo[] newArray(int i) {
                return new MerchantInfo[i];
            }
        }

        public MerchantInfo() {
            this(null, 1, null);
        }

        public static /* synthetic */ MerchantInfo copy$default(MerchantInfo merchantInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchantInfo.merchantName;
            }
            return merchantInfo.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.merchantName;
        }

        public final MerchantInfo copy(String str) {
            return new MerchantInfo(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MerchantInfo) && Intrinsics.areEqual(this.merchantName, ((MerchantInfo) obj).merchantName);
        }

        public final String getMerchantName$payments_core_release() {
            return this.merchantName;
        }

        public int hashCode() {
            String str = this.merchantName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.merchantName;
            return "MerchantInfo(merchantName=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.merchantName);
        }

        public MerchantInfo(String str) {
            this.merchantName = str;
        }

        public /* synthetic */ MerchantInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\u000e\u0010\u0012\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0013J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;", "Landroid/os/Parcelable;", "isRequired", "", "allowedCountryCodes", "", "", "phoneNumberRequired", "(ZLjava/util/Set;Z)V", "isRequired$payments_core_release", "()Z", "normalizedAllowedCountryCodes", "getNormalizedAllowedCountryCodes$payments_core_release", "()Ljava/util/Set;", "getPhoneNumberRequired$payments_core_release", "component1", "component1$payments_core_release", "component2", "component3", "component3$payments_core_release", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nGooglePayJsonFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayJsonFactory.kt\ncom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,456:1\n1855#2:457\n1856#2:460\n1549#2:461\n1620#2,3:462\n12744#3,2:458\n*S KotlinDebug\n*F\n+ 1 GooglePayJsonFactory.kt\ncom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters\n*L\n421#1:457\n421#1:460\n414#1:461\n414#1:462,3\n423#1:458,2\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class ShippingAddressParameters implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ShippingAddressParameters> CREATOR = new Creator();
        private final Set<String> allowedCountryCodes;
        private final boolean isRequired;
        private final boolean phoneNumberRequired;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<ShippingAddressParameters> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShippingAddressParameters createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new ShippingAddressParameters(z, linkedHashSet, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShippingAddressParameters[] newArray(int i) {
                return new ShippingAddressParameters[i];
            }
        }

        @JvmOverloads
        public ShippingAddressParameters() {
            this(false, null, false, 7, null);
        }

        private final Set<String> component2() {
            return this.allowedCountryCodes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShippingAddressParameters copy$default(ShippingAddressParameters shippingAddressParameters, boolean z, Set set, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = shippingAddressParameters.isRequired;
            }
            if ((i & 2) != 0) {
                set = shippingAddressParameters.allowedCountryCodes;
            }
            if ((i & 4) != 0) {
                z2 = shippingAddressParameters.phoneNumberRequired;
            }
            return shippingAddressParameters.copy(z, set, z2);
        }

        public final boolean component1$payments_core_release() {
            return this.isRequired;
        }

        public final boolean component3$payments_core_release() {
            return this.phoneNumberRequired;
        }

        public final ShippingAddressParameters copy(boolean z, Set<String> allowedCountryCodes, boolean z2) {
            Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
            return new ShippingAddressParameters(z, allowedCountryCodes, z2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ShippingAddressParameters) {
                ShippingAddressParameters shippingAddressParameters = (ShippingAddressParameters) obj;
                return this.isRequired == shippingAddressParameters.isRequired && Intrinsics.areEqual(this.allowedCountryCodes, shippingAddressParameters.allowedCountryCodes) && this.phoneNumberRequired == shippingAddressParameters.phoneNumberRequired;
            }
            return false;
        }

        public final Set<String> getNormalizedAllowedCountryCodes$payments_core_release() {
            int collectionSizeOrDefault;
            Set<String> set;
            Set<String> set2 = this.allowedCountryCodes;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (String str : set2) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                arrayList.add(upperCase);
            }
            set = CollectionsKt___CollectionsKt.toSet(arrayList);
            return set;
        }

        public final boolean getPhoneNumberRequired$payments_core_release() {
            return this.phoneNumberRequired;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.isRequired;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int hashCode = ((r0 * 31) + this.allowedCountryCodes.hashCode()) * 31;
            boolean z2 = this.phoneNumberRequired;
            return hashCode + (z2 ? 1 : z2 ? 1 : 0);
        }

        public final boolean isRequired$payments_core_release() {
            return this.isRequired;
        }

        public String toString() {
            boolean z = this.isRequired;
            Set<String> set = this.allowedCountryCodes;
            boolean z2 = this.phoneNumberRequired;
            return "ShippingAddressParameters(isRequired=" + z + ", allowedCountryCodes=" + set + ", phoneNumberRequired=" + z2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.isRequired ? 1 : 0);
            Set<String> set = this.allowedCountryCodes;
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
            out.writeInt(this.phoneNumberRequired ? 1 : 0);
        }

        @JvmOverloads
        public ShippingAddressParameters(boolean z) {
            this(z, null, false, 6, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public ShippingAddressParameters(boolean z, Set<String> allowedCountryCodes) {
            this(z, allowedCountryCodes, false, 4, null);
            Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        }

        @JvmOverloads
        public ShippingAddressParameters(boolean z, Set<String> allowedCountryCodes, boolean z2) {
            Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
            this.isRequired = z;
            this.allowedCountryCodes = allowedCountryCodes;
            this.phoneNumberRequired = z2;
            String[] countryCodes = Locale.getISOCountries();
            for (String str : getNormalizedAllowedCountryCodes$payments_core_release()) {
                Intrinsics.checkNotNullExpressionValue(countryCodes, "countryCodes");
                int length = countryCodes.length;
                boolean z3 = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (Intrinsics.areEqual(str, countryCodes[i])) {
                        z3 = true;
                        continue;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z3) {
                    throw new IllegalArgumentException(("'" + str + "' is not a valid country code").toString());
                }
            }
        }

        public /* synthetic */ ShippingAddressParameters(boolean z, Set set, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? SetsKt__SetsKt.emptySet() : set, (i & 4) != 0 ? false : z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000267BS\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u001a\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001bJ\u000e\u0010\u001c\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b%J\u0010\u0010&\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0002\b'J^\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010)J\t\u0010*\u001a\u00020\tHÖ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\tHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\tHÖ\u0001R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u00068"}, m28432d2 = {"Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "Landroid/os/Parcelable;", "currencyCode", "", "totalPriceStatus", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "countryCode", "transactionId", "totalPrice", "", "totalPriceLabel", "checkoutOption", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "(Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;)V", "getCheckoutOption$payments_core_release", "()Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "getCountryCode$payments_core_release", "()Ljava/lang/String;", "getCurrencyCode$payments_core_release", "getTotalPrice$payments_core_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalPriceLabel$payments_core_release", "getTotalPriceStatus$payments_core_release", "()Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "getTransactionId$payments_core_release", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "component6", "component6$payments_core_release", "component7", "component7$payments_core_release", "copy", "(Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CheckoutOption", "TotalPriceStatus", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class TransactionInfo implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<TransactionInfo> CREATOR = new Creator();
        private final CheckoutOption checkoutOption;
        private final String countryCode;
        private final String currencyCode;
        private final Integer totalPrice;
        private final String totalPriceLabel;
        private final TotalPriceStatus totalPriceStatus;
        private final String transactionId;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Default", "CompleteImmediatePurchase", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public enum CheckoutOption {
            Default("DEFAULT"),
            CompleteImmediatePurchase("COMPLETE_IMMEDIATE_PURCHASE");
            
            private final String code;

            CheckoutOption(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<TransactionInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionInfo(parcel.readString(), TotalPriceStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : CheckoutOption.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionInfo[] newArray(int i) {
                return new TransactionInfo[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "NotCurrentlyKnown", "Estimated", "Final", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public enum TotalPriceStatus {
            NotCurrentlyKnown("NOT_CURRENTLY_KNOWN"),
            Estimated("ESTIMATED"),
            Final("FINAL");
            
            private final String code;

            TotalPriceStatus(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus) {
            this(currencyCode, totalPriceStatus, null, null, null, null, null, 124, null);
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(totalPriceStatus, "totalPriceStatus");
        }

        public static /* synthetic */ TransactionInfo copy$default(TransactionInfo transactionInfo, String str, TotalPriceStatus totalPriceStatus, String str2, String str3, Integer num, String str4, CheckoutOption checkoutOption, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transactionInfo.currencyCode;
            }
            if ((i & 2) != 0) {
                totalPriceStatus = transactionInfo.totalPriceStatus;
            }
            TotalPriceStatus totalPriceStatus2 = totalPriceStatus;
            if ((i & 4) != 0) {
                str2 = transactionInfo.countryCode;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = transactionInfo.transactionId;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                num = transactionInfo.totalPrice;
            }
            Integer num2 = num;
            if ((i & 32) != 0) {
                str4 = transactionInfo.totalPriceLabel;
            }
            String str7 = str4;
            if ((i & 64) != 0) {
                checkoutOption = transactionInfo.checkoutOption;
            }
            return transactionInfo.copy(str, totalPriceStatus2, str5, str6, num2, str7, checkoutOption);
        }

        public final String component1$payments_core_release() {
            return this.currencyCode;
        }

        public final TotalPriceStatus component2$payments_core_release() {
            return this.totalPriceStatus;
        }

        public final String component3$payments_core_release() {
            return this.countryCode;
        }

        public final String component4$payments_core_release() {
            return this.transactionId;
        }

        public final Integer component5$payments_core_release() {
            return this.totalPrice;
        }

        public final String component6$payments_core_release() {
            return this.totalPriceLabel;
        }

        public final CheckoutOption component7$payments_core_release() {
            return this.checkoutOption;
        }

        public final TransactionInfo copy(String currencyCode, TotalPriceStatus totalPriceStatus, String str, String str2, Integer num, String str3, CheckoutOption checkoutOption) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(totalPriceStatus, "totalPriceStatus");
            return new TransactionInfo(currencyCode, totalPriceStatus, str, str2, num, str3, checkoutOption);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TransactionInfo) {
                TransactionInfo transactionInfo = (TransactionInfo) obj;
                return Intrinsics.areEqual(this.currencyCode, transactionInfo.currencyCode) && this.totalPriceStatus == transactionInfo.totalPriceStatus && Intrinsics.areEqual(this.countryCode, transactionInfo.countryCode) && Intrinsics.areEqual(this.transactionId, transactionInfo.transactionId) && Intrinsics.areEqual(this.totalPrice, transactionInfo.totalPrice) && Intrinsics.areEqual(this.totalPriceLabel, transactionInfo.totalPriceLabel) && this.checkoutOption == transactionInfo.checkoutOption;
            }
            return false;
        }

        public final CheckoutOption getCheckoutOption$payments_core_release() {
            return this.checkoutOption;
        }

        public final String getCountryCode$payments_core_release() {
            return this.countryCode;
        }

        public final String getCurrencyCode$payments_core_release() {
            return this.currencyCode;
        }

        public final Integer getTotalPrice$payments_core_release() {
            return this.totalPrice;
        }

        public final String getTotalPriceLabel$payments_core_release() {
            return this.totalPriceLabel;
        }

        public final TotalPriceStatus getTotalPriceStatus$payments_core_release() {
            return this.totalPriceStatus;
        }

        public final String getTransactionId$payments_core_release() {
            return this.transactionId;
        }

        public int hashCode() {
            int hashCode = ((this.currencyCode.hashCode() * 31) + this.totalPriceStatus.hashCode()) * 31;
            String str = this.countryCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.transactionId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.totalPrice;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.totalPriceLabel;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CheckoutOption checkoutOption = this.checkoutOption;
            return hashCode5 + (checkoutOption != null ? checkoutOption.hashCode() : 0);
        }

        public String toString() {
            String str = this.currencyCode;
            TotalPriceStatus totalPriceStatus = this.totalPriceStatus;
            String str2 = this.countryCode;
            String str3 = this.transactionId;
            Integer num = this.totalPrice;
            String str4 = this.totalPriceLabel;
            CheckoutOption checkoutOption = this.checkoutOption;
            return "TransactionInfo(currencyCode=" + str + ", totalPriceStatus=" + totalPriceStatus + ", countryCode=" + str2 + ", transactionId=" + str3 + ", totalPrice=" + num + ", totalPriceLabel=" + str4 + ", checkoutOption=" + checkoutOption + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.currencyCode);
            out.writeString(this.totalPriceStatus.name());
            out.writeString(this.countryCode);
            out.writeString(this.transactionId);
            Integer num = this.totalPrice;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.totalPriceLabel);
            CheckoutOption checkoutOption = this.checkoutOption;
            if (checkoutOption == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(checkoutOption.name());
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus, String str) {
            this(currencyCode, totalPriceStatus, str, null, null, null, null, 120, null);
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(totalPriceStatus, "totalPriceStatus");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus, String str, String str2) {
            this(currencyCode, totalPriceStatus, str, str2, null, null, null, 112, null);
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(totalPriceStatus, "totalPriceStatus");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus, String str, String str2, Integer num) {
            this(currencyCode, totalPriceStatus, str, str2, num, null, null, 96, null);
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(totalPriceStatus, "totalPriceStatus");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus, String str, String str2, Integer num, String str3) {
            this(currencyCode, totalPriceStatus, str, str2, num, str3, null, 64, null);
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(totalPriceStatus, "totalPriceStatus");
        }

        @JvmOverloads
        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus, String str, String str2, Integer num, String str3, CheckoutOption checkoutOption) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(totalPriceStatus, "totalPriceStatus");
            this.currencyCode = currencyCode;
            this.totalPriceStatus = totalPriceStatus;
            this.countryCode = str;
            this.transactionId = str2;
            this.totalPrice = num;
            this.totalPriceLabel = str3;
            this.checkoutOption = checkoutOption;
        }

        public /* synthetic */ TransactionInfo(String str, TotalPriceStatus totalPriceStatus, String str2, String str3, Integer num, String str4, CheckoutOption checkoutOption, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, totalPriceStatus, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : checkoutOption);
        }
    }

    static {
        List<String> listOf;
        List<String> listOf2;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"PAN_ONLY", "CRYPTOGRAM_3DS"});
        ALLOWED_AUTH_METHODS = listOf;
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"AMEX", "DISCOVER", "MASTERCARD", "VISA"});
        DEFAULT_CARD_NETWORKS = listOf2;
    }

    public GooglePayJsonFactory(GooglePayConfig googlePayConfig, boolean z) {
        Intrinsics.checkNotNullParameter(googlePayConfig, "googlePayConfig");
        this.googlePayConfig = googlePayConfig;
        this.isJcbEnabled = z;
    }

    private final JSONObject createBaseCardPaymentMethodParams() {
        List listOf;
        List plus;
        JSONObject put = new JSONObject().put("allowedAuthMethods", new JSONArray((Collection) ALLOWED_AUTH_METHODS));
        List<String> list = DEFAULT_CARD_NETWORKS;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(JCB_CARD_NETWORK);
        if (!this.isJcbEnabled) {
            listOf = null;
        }
        if (listOf == null) {
            listOf = CollectionsKt__CollectionsKt.emptyList();
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) listOf);
        JSONObject put2 = put.put("allowedCardNetworks", new JSONArray((Collection) plus));
        Intrinsics.checkNotNullExpressionValue(put2, "JSONObject()\n           …          )\n            )");
        return put2;
    }

    private final JSONObject createCardPaymentMethod(BillingAddressParameters billingAddressParameters, Boolean bool) {
        JSONObject createBaseCardPaymentMethodParams = createBaseCardPaymentMethodParams();
        boolean z = false;
        if (billingAddressParameters != null && billingAddressParameters.isRequired$payments_core_release()) {
            z = true;
        }
        if (z) {
            createBaseCardPaymentMethodParams.put("billingAddressRequired", true);
            createBaseCardPaymentMethodParams.put("billingAddressParameters", new JSONObject().put("phoneNumberRequired", billingAddressParameters.isPhoneNumberRequired$payments_core_release()).put("format", billingAddressParameters.getFormat$payments_core_release().getCode$payments_core_release()));
        }
        if (bool != null) {
            createBaseCardPaymentMethodParams.put("allowCreditCards", bool.booleanValue());
        }
        JSONObject put = new JSONObject().put("type", CARD_PAYMENT_METHOD).put("parameters", createBaseCardPaymentMethodParams).put("tokenizationSpecification", this.googlePayConfig.getTokenizationSpecification());
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …okenizationSpecification)");
        return put;
    }

    public static /* synthetic */ JSONObject createIsReadyToPayRequest$default(GooglePayJsonFactory googlePayJsonFactory, BillingAddressParameters billingAddressParameters, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            billingAddressParameters = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        return googlePayJsonFactory.createIsReadyToPayRequest(billingAddressParameters, bool, bool2);
    }

    public static /* synthetic */ JSONObject createPaymentDataRequest$default(GooglePayJsonFactory googlePayJsonFactory, TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z, MerchantInfo merchantInfo, Boolean bool, int i, Object obj) {
        return googlePayJsonFactory.createPaymentDataRequest(transactionInfo, (i & 2) != 0 ? null : billingAddressParameters, (i & 4) != 0 ? null : shippingAddressParameters, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : merchantInfo, (i & 32) == 0 ? bool : null);
    }

    private final JSONObject createShippingAddressParameters(ShippingAddressParameters shippingAddressParameters) {
        JSONObject put = new JSONObject().put("allowedCountryCodes", new JSONArray((Collection) shippingAddressParameters.getNormalizedAllowedCountryCodes$payments_core_release())).put("phoneNumberRequired", shippingAddressParameters.getPhoneNumberRequired$payments_core_release());
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …berRequired\n            )");
        return put;
    }

    private final JSONObject createTransactionInfo(TransactionInfo transactionInfo) {
        JSONObject jSONObject = new JSONObject();
        String currencyCode$payments_core_release = transactionInfo.getCurrencyCode$payments_core_release();
        Locale locale = Locale.ROOT;
        String upperCase = currencyCode$payments_core_release.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        JSONObject put = jSONObject.put("currencyCode", upperCase).put("totalPriceStatus", transactionInfo.getTotalPriceStatus$payments_core_release().getCode$payments_core_release());
        String countryCode$payments_core_release = transactionInfo.getCountryCode$payments_core_release();
        if (countryCode$payments_core_release != null) {
            String upperCase2 = countryCode$payments_core_release.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            put.put("countryCode", upperCase2);
        }
        String transactionId$payments_core_release = transactionInfo.getTransactionId$payments_core_release();
        if (transactionId$payments_core_release != null) {
            put.put("transactionId", transactionId$payments_core_release);
        }
        Integer totalPrice$payments_core_release = transactionInfo.getTotalPrice$payments_core_release();
        if (totalPrice$payments_core_release != null) {
            int intValue = totalPrice$payments_core_release.intValue();
            String upperCase3 = transactionInfo.getCurrencyCode$payments_core_release().toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Currency currency = Currency.getInstance(upperCase3);
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(\n           …                        )");
            put.put("totalPrice", PayWithGoogleUtils.getPriceString(intValue, currency));
        }
        String totalPriceLabel$payments_core_release = transactionInfo.getTotalPriceLabel$payments_core_release();
        if (totalPriceLabel$payments_core_release != null) {
            put.put("totalPriceLabel", totalPriceLabel$payments_core_release);
        }
        TransactionInfo.CheckoutOption checkoutOption$payments_core_release = transactionInfo.getCheckoutOption$payments_core_release();
        if (checkoutOption$payments_core_release != null) {
            put.put("checkoutOption", checkoutOption$payments_core_release.getCode$payments_core_release());
        }
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …          }\n            }");
        return put;
    }

    @JvmOverloads
    public final JSONObject createIsReadyToPayRequest() {
        return createIsReadyToPayRequest$default(this, null, null, null, 7, null);
    }

    @JvmOverloads
    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo) {
        Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        return createPaymentDataRequest$default(this, transactionInfo, null, null, false, null, null, 62, null);
    }

    @JvmOverloads
    public final JSONObject createIsReadyToPayRequest(BillingAddressParameters billingAddressParameters) {
        return createIsReadyToPayRequest$default(this, billingAddressParameters, null, null, 6, null);
    }

    @JvmOverloads
    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters) {
        Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        return createPaymentDataRequest$default(this, transactionInfo, billingAddressParameters, null, false, null, null, 60, null);
    }

    @JvmOverloads
    public final JSONObject createIsReadyToPayRequest(BillingAddressParameters billingAddressParameters, Boolean bool) {
        return createIsReadyToPayRequest$default(this, billingAddressParameters, bool, null, 4, null);
    }

    @JvmOverloads
    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters) {
        Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        return createPaymentDataRequest$default(this, transactionInfo, billingAddressParameters, shippingAddressParameters, false, null, null, 56, null);
    }

    public /* synthetic */ GooglePayJsonFactory(GooglePayConfig googlePayConfig, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(googlePayConfig, (i & 2) != 0 ? false : z);
    }

    @JvmOverloads
    public final JSONObject createIsReadyToPayRequest(BillingAddressParameters billingAddressParameters, Boolean bool, Boolean bool2) {
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(createCardPaymentMethod(billingAddressParameters, bool2)));
        if (bool != null) {
            put.put("existingPaymentMethodRequired", bool.booleanValue());
        }
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …          }\n            }");
        return put;
    }

    @JvmOverloads
    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z) {
        Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        return createPaymentDataRequest$default(this, transactionInfo, billingAddressParameters, shippingAddressParameters, z, null, null, 48, null);
    }

    public /* synthetic */ GooglePayJsonFactory(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? false : z);
    }

    @JvmOverloads
    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z, MerchantInfo merchantInfo) {
        Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        return createPaymentDataRequest$default(this, transactionInfo, billingAddressParameters, shippingAddressParameters, z, merchantInfo, null, 32, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayJsonFactory(Context context, boolean z) {
        this(new GooglePayConfig(context), z);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmOverloads
    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z, MerchantInfo merchantInfo, Boolean bool) {
        Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        boolean z2 = false;
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(createCardPaymentMethod(billingAddressParameters, bool))).put("transactionInfo", createTransactionInfo(transactionInfo)).put("emailRequired", z);
        if (shippingAddressParameters != null && shippingAddressParameters.isRequired$payments_core_release()) {
            put.put("shippingAddressRequired", true);
            put.put("shippingAddressParameters", createShippingAddressParameters(shippingAddressParameters));
        }
        if (merchantInfo != null) {
            String merchantName$payments_core_release = merchantInfo.getMerchantName$payments_core_release();
            if (merchantName$payments_core_release == null || merchantName$payments_core_release.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                put.put("merchantInfo", new JSONObject().put("merchantName", merchantInfo.getMerchantName$payments_core_release()));
            }
        }
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …          }\n            }");
        return put;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayJsonFactory(Function0<String> publishableKeyProvider, Function0<String> stripeAccountIdProvider, GooglePayPaymentMethodLauncher.Config googlePayConfig) {
        this(new GooglePayConfig(publishableKeyProvider.invoke(), stripeAccountIdProvider.invoke()), googlePayConfig.isJcbEnabled$payments_core_release());
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        Intrinsics.checkNotNullParameter(googlePayConfig, "googlePayConfig");
    }
}
