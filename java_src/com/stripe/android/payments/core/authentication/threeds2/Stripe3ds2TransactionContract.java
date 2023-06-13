package com.stripe.android.payments.core.authentication.threeds2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract;", "Lv5;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "Args", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class Stripe3ds2TransactionContract extends AbstractC29414v5<Args, PaymentFlowResult.Unvalidated> {

    @Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0001GB_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0002\u0010\u0015J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010*J\t\u00106\u001a\u00020\u0011HÆ\u0003J\t\u00107\u001a\u00020\u0011HÆ\u0003Jz\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014HÆ\u0001¢\u0006\u0002\u00109J\t\u0010:\u001a\u00020\u000fHÖ\u0001J\u0013\u0010;\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u000fHÖ\u0001J\u0006\u0010?\u001a\u00020@J\t\u0010A\u001a\u00020\u0011HÖ\u0001J\u0019\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006H"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Landroid/os/Parcelable;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "config", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", NamedConstantsKt.ENABLE_LOGGING, "", "statusBarColor", "", "injectorKey", "", "publishableKey", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;Lcom/stripe/android/core/networking/ApiRequest$Options;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getConfig", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "getEnableLogging", "()Z", "fingerprint", "Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "getFingerprint", "()Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "getInjectorKey", "()Ljava/lang/String;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getRequestOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;Lcom/stripe/android/core/networking/ApiRequest$Options;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args implements Parcelable {
        private static final String EXTRA_ARGS = "extra_args";
        private final PaymentAuthConfig.Stripe3ds2Config config;
        private final boolean enableLogging;
        private final String injectorKey;
        private final StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData;
        private final Set<String> productUsage;
        private final String publishableKey;
        private final ApiRequest.Options requestOptions;
        private final SdkTransactionId sdkTransactionId;
        private final Integer statusBarColor;
        private final StripeIntent stripeIntent;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args$Companion;", "", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "intent", "Landroid/content/Intent;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args fromIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra(Args.EXTRA_ARGS);
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                SdkTransactionId sdkTransactionId = (SdkTransactionId) parcel.readParcelable(Args.class.getClassLoader());
                PaymentAuthConfig.Stripe3ds2Config createFromParcel = PaymentAuthConfig.Stripe3ds2Config.CREATOR.createFromParcel(parcel);
                StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(Args.class.getClassLoader());
                StripeIntent.NextActionData.SdkData.Use3DS2 createFromParcel2 = StripeIntent.NextActionData.SdkData.Use3DS2.CREATOR.createFromParcel(parcel);
                ApiRequest.Options options = (ApiRequest.Options) parcel.readParcelable(Args.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new Args(sdkTransactionId, createFromParcel, stripeIntent, createFromParcel2, options, z, valueOf, readString, readString2, linkedHashSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(SdkTransactionId sdkTransactionId, PaymentAuthConfig.Stripe3ds2Config config, StripeIntent stripeIntent, StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData, ApiRequest.Options requestOptions, boolean z, Integer num, @InjectorKey String injectorKey, String publishableKey, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
            Intrinsics.checkNotNullParameter(nextActionData, "nextActionData");
            Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            this.sdkTransactionId = sdkTransactionId;
            this.config = config;
            this.stripeIntent = stripeIntent;
            this.nextActionData = nextActionData;
            this.requestOptions = requestOptions;
            this.enableLogging = z;
            this.statusBarColor = num;
            this.injectorKey = injectorKey;
            this.publishableKey = publishableKey;
            this.productUsage = productUsage;
        }

        public final SdkTransactionId component1() {
            return this.sdkTransactionId;
        }

        public final Set<String> component10() {
            return this.productUsage;
        }

        public final PaymentAuthConfig.Stripe3ds2Config component2() {
            return this.config;
        }

        public final StripeIntent component3() {
            return this.stripeIntent;
        }

        public final StripeIntent.NextActionData.SdkData.Use3DS2 component4() {
            return this.nextActionData;
        }

        public final ApiRequest.Options component5() {
            return this.requestOptions;
        }

        public final boolean component6() {
            return this.enableLogging;
        }

        public final Integer component7() {
            return this.statusBarColor;
        }

        public final String component8() {
            return this.injectorKey;
        }

        public final String component9() {
            return this.publishableKey;
        }

        public final Args copy(SdkTransactionId sdkTransactionId, PaymentAuthConfig.Stripe3ds2Config config, StripeIntent stripeIntent, StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData, ApiRequest.Options requestOptions, boolean z, Integer num, @InjectorKey String injectorKey, String publishableKey, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
            Intrinsics.checkNotNullParameter(nextActionData, "nextActionData");
            Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            return new Args(sdkTransactionId, config, stripeIntent, nextActionData, requestOptions, z, num, injectorKey, publishableKey, productUsage);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Args) {
                Args args = (Args) obj;
                return Intrinsics.areEqual(this.sdkTransactionId, args.sdkTransactionId) && Intrinsics.areEqual(this.config, args.config) && Intrinsics.areEqual(this.stripeIntent, args.stripeIntent) && Intrinsics.areEqual(this.nextActionData, args.nextActionData) && Intrinsics.areEqual(this.requestOptions, args.requestOptions) && this.enableLogging == args.enableLogging && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && Intrinsics.areEqual(this.injectorKey, args.injectorKey) && Intrinsics.areEqual(this.publishableKey, args.publishableKey) && Intrinsics.areEqual(this.productUsage, args.productUsage);
            }
            return false;
        }

        public final PaymentAuthConfig.Stripe3ds2Config getConfig() {
            return this.config;
        }

        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final Stripe3ds2Fingerprint getFingerprint() {
            return new Stripe3ds2Fingerprint(this.nextActionData);
        }

        public final String getInjectorKey() {
            return this.injectorKey;
        }

        public final StripeIntent.NextActionData.SdkData.Use3DS2 getNextActionData() {
            return this.nextActionData;
        }

        public final Set<String> getProductUsage() {
            return this.productUsage;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public final ApiRequest.Options getRequestOptions() {
            return this.requestOptions;
        }

        public final SdkTransactionId getSdkTransactionId() {
            return this.sdkTransactionId;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final StripeIntent getStripeIntent() {
            return this.stripeIntent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((((this.sdkTransactionId.hashCode() * 31) + this.config.hashCode()) * 31) + this.stripeIntent.hashCode()) * 31) + this.nextActionData.hashCode()) * 31) + this.requestOptions.hashCode()) * 31;
            boolean z = this.enableLogging;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            Integer num = this.statusBarColor;
            return ((((((i2 + (num == null ? 0 : num.hashCode())) * 31) + this.injectorKey.hashCode()) * 31) + this.publishableKey.hashCode()) * 31) + this.productUsage.hashCode();
        }

        public final Bundle toBundle() {
            return C39564d70.m44603a(TuplesKt.m28425to(EXTRA_ARGS, this));
        }

        public String toString() {
            SdkTransactionId sdkTransactionId = this.sdkTransactionId;
            PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config = this.config;
            StripeIntent stripeIntent = this.stripeIntent;
            StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2 = this.nextActionData;
            ApiRequest.Options options = this.requestOptions;
            boolean z = this.enableLogging;
            Integer num = this.statusBarColor;
            String str = this.injectorKey;
            String str2 = this.publishableKey;
            Set<String> set = this.productUsage;
            return "Args(sdkTransactionId=" + sdkTransactionId + ", config=" + stripe3ds2Config + ", stripeIntent=" + stripeIntent + ", nextActionData=" + use3DS2 + ", requestOptions=" + options + ", enableLogging=" + z + ", statusBarColor=" + num + ", injectorKey=" + str + ", publishableKey=" + str2 + ", productUsage=" + set + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            int intValue;
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.sdkTransactionId, i);
            this.config.writeToParcel(out, i);
            out.writeParcelable(this.stripeIntent, i);
            this.nextActionData.writeToParcel(out, i);
            out.writeParcelable(this.requestOptions, i);
            out.writeInt(this.enableLogging ? 1 : 0);
            Integer num = this.statusBarColor;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeString(this.injectorKey);
            out.writeString(this.publishableKey);
            Set<String> set = this.productUsage;
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
        }
    }

    @Override // p000.AbstractC29414v5
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtras = new Intent(context, Stripe3ds2TransactionActivity.class).putExtras(input.toBundle());
        Intrinsics.checkNotNullExpressionValue(putExtras, "Intent(context, Stripe3d…tExtras(input.toBundle())");
        return putExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC29414v5
    public PaymentFlowResult.Unvalidated parseResult(int i, Intent intent) {
        return PaymentFlowResult.Unvalidated.Companion.fromIntent(intent);
    }
}
