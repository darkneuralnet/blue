package com.stripe.android.payments.bankaccount.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import com.stripe.android.payments.bankaccount.p044ui.CollectBankAccountActivity;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u000f\u0011B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;", "Lv5;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "Companion", "Args", com.paypal.android.sdk.onetouch.core.Result.f74995h, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class CollectBankAccountContract extends AbstractC29414v5<Args, CollectBankAccountResult> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ARGS = "com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args";
    private static final String EXTRA_RESULT = "com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result";

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0003\u0015\u0016\u0017B1\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "Landroid/os/Parcelable;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "attachToIntent", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Z)V", "getAttachToIntent", "()Z", "getClientSecret", "()Ljava/lang/String;", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getPublishableKey", "getStripeAccountId", "toBundle", "Landroid/os/Bundle;", "Companion", "ForPaymentIntent", "ForSetupIntent", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final boolean attachToIntent;
        private final String clientSecret;
        private final CollectBankAccountConfiguration configuration;
        private final String publishableKey;
        private final String stripeAccountId;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "intent", "Landroid/content/Intent;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args fromIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra(CollectBankAccountContract.EXTRA_ARGS);
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "attachToIntent", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Z)V", "getAttachToIntent", "()Z", "getClientSecret", "()Ljava/lang/String;", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getPublishableKey", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class ForPaymentIntent extends Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ForPaymentIntent> CREATOR = new Creator();
            private final boolean attachToIntent;
            private final String clientSecret;
            private final CollectBankAccountConfiguration configuration;
            private final String publishableKey;
            private final String stripeAccountId;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<ForPaymentIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForPaymentIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ForPaymentIntent(parcel.readString(), parcel.readString(), parcel.readString(), (CollectBankAccountConfiguration) parcel.readParcelable(ForPaymentIntent.class.getClassLoader()), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForPaymentIntent[] newArray(int i) {
                    return new ForPaymentIntent[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForPaymentIntent(String publishableKey, String str, String clientSecret, CollectBankAccountConfiguration configuration, boolean z) {
                super(publishableKey, str, clientSecret, configuration, z, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.clientSecret = clientSecret;
                this.configuration = configuration;
                this.attachToIntent = z;
            }

            public static /* synthetic */ ForPaymentIntent copy$default(ForPaymentIntent forPaymentIntent, String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = forPaymentIntent.getPublishableKey();
                }
                if ((i & 2) != 0) {
                    str2 = forPaymentIntent.getStripeAccountId();
                }
                String str4 = str2;
                if ((i & 4) != 0) {
                    str3 = forPaymentIntent.getClientSecret();
                }
                String str5 = str3;
                if ((i & 8) != 0) {
                    collectBankAccountConfiguration = forPaymentIntent.getConfiguration();
                }
                CollectBankAccountConfiguration collectBankAccountConfiguration2 = collectBankAccountConfiguration;
                if ((i & 16) != 0) {
                    z = forPaymentIntent.getAttachToIntent();
                }
                return forPaymentIntent.copy(str, str4, str5, collectBankAccountConfiguration2, z);
            }

            public final String component1() {
                return getPublishableKey();
            }

            public final String component2() {
                return getStripeAccountId();
            }

            public final String component3() {
                return getClientSecret();
            }

            public final CollectBankAccountConfiguration component4() {
                return getConfiguration();
            }

            public final boolean component5() {
                return getAttachToIntent();
            }

            public final ForPaymentIntent copy(String publishableKey, String str, String clientSecret, CollectBankAccountConfiguration configuration, boolean z) {
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new ForPaymentIntent(publishableKey, str, clientSecret, configuration, z);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ForPaymentIntent) {
                    ForPaymentIntent forPaymentIntent = (ForPaymentIntent) obj;
                    return Intrinsics.areEqual(getPublishableKey(), forPaymentIntent.getPublishableKey()) && Intrinsics.areEqual(getStripeAccountId(), forPaymentIntent.getStripeAccountId()) && Intrinsics.areEqual(getClientSecret(), forPaymentIntent.getClientSecret()) && Intrinsics.areEqual(getConfiguration(), forPaymentIntent.getConfiguration()) && getAttachToIntent() == forPaymentIntent.getAttachToIntent();
                }
                return false;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getClientSecret() {
                return this.clientSecret;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = ((((((getPublishableKey().hashCode() * 31) + (getStripeAccountId() == null ? 0 : getStripeAccountId().hashCode())) * 31) + getClientSecret().hashCode()) * 31) + getConfiguration().hashCode()) * 31;
                boolean attachToIntent = getAttachToIntent();
                int i = attachToIntent;
                if (attachToIntent) {
                    i = 1;
                }
                return hashCode + i;
            }

            public String toString() {
                String publishableKey = getPublishableKey();
                String stripeAccountId = getStripeAccountId();
                String clientSecret = getClientSecret();
                CollectBankAccountConfiguration configuration = getConfiguration();
                boolean attachToIntent = getAttachToIntent();
                return "ForPaymentIntent(publishableKey=" + publishableKey + ", stripeAccountId=" + stripeAccountId + ", clientSecret=" + clientSecret + ", configuration=" + configuration + ", attachToIntent=" + attachToIntent + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.publishableKey);
                out.writeString(this.stripeAccountId);
                out.writeString(this.clientSecret);
                out.writeParcelable(this.configuration, i);
                out.writeInt(this.attachToIntent ? 1 : 0);
            }
        }

        @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "attachToIntent", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Z)V", "getAttachToIntent", "()Z", "getClientSecret", "()Ljava/lang/String;", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getPublishableKey", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class ForSetupIntent extends Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ForSetupIntent> CREATOR = new Creator();
            private final boolean attachToIntent;
            private final String clientSecret;
            private final CollectBankAccountConfiguration configuration;
            private final String publishableKey;
            private final String stripeAccountId;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<ForSetupIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForSetupIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ForSetupIntent(parcel.readString(), parcel.readString(), parcel.readString(), (CollectBankAccountConfiguration) parcel.readParcelable(ForSetupIntent.class.getClassLoader()), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForSetupIntent[] newArray(int i) {
                    return new ForSetupIntent[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForSetupIntent(String publishableKey, String str, String clientSecret, CollectBankAccountConfiguration configuration, boolean z) {
                super(publishableKey, str, clientSecret, configuration, z, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.clientSecret = clientSecret;
                this.configuration = configuration;
                this.attachToIntent = z;
            }

            public static /* synthetic */ ForSetupIntent copy$default(ForSetupIntent forSetupIntent, String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = forSetupIntent.getPublishableKey();
                }
                if ((i & 2) != 0) {
                    str2 = forSetupIntent.getStripeAccountId();
                }
                String str4 = str2;
                if ((i & 4) != 0) {
                    str3 = forSetupIntent.getClientSecret();
                }
                String str5 = str3;
                if ((i & 8) != 0) {
                    collectBankAccountConfiguration = forSetupIntent.getConfiguration();
                }
                CollectBankAccountConfiguration collectBankAccountConfiguration2 = collectBankAccountConfiguration;
                if ((i & 16) != 0) {
                    z = forSetupIntent.getAttachToIntent();
                }
                return forSetupIntent.copy(str, str4, str5, collectBankAccountConfiguration2, z);
            }

            public final String component1() {
                return getPublishableKey();
            }

            public final String component2() {
                return getStripeAccountId();
            }

            public final String component3() {
                return getClientSecret();
            }

            public final CollectBankAccountConfiguration component4() {
                return getConfiguration();
            }

            public final boolean component5() {
                return getAttachToIntent();
            }

            public final ForSetupIntent copy(String publishableKey, String str, String clientSecret, CollectBankAccountConfiguration configuration, boolean z) {
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new ForSetupIntent(publishableKey, str, clientSecret, configuration, z);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ForSetupIntent) {
                    ForSetupIntent forSetupIntent = (ForSetupIntent) obj;
                    return Intrinsics.areEqual(getPublishableKey(), forSetupIntent.getPublishableKey()) && Intrinsics.areEqual(getStripeAccountId(), forSetupIntent.getStripeAccountId()) && Intrinsics.areEqual(getClientSecret(), forSetupIntent.getClientSecret()) && Intrinsics.areEqual(getConfiguration(), forSetupIntent.getConfiguration()) && getAttachToIntent() == forSetupIntent.getAttachToIntent();
                }
                return false;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getClientSecret() {
                return this.clientSecret;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = ((((((getPublishableKey().hashCode() * 31) + (getStripeAccountId() == null ? 0 : getStripeAccountId().hashCode())) * 31) + getClientSecret().hashCode()) * 31) + getConfiguration().hashCode()) * 31;
                boolean attachToIntent = getAttachToIntent();
                int i = attachToIntent;
                if (attachToIntent) {
                    i = 1;
                }
                return hashCode + i;
            }

            public String toString() {
                String publishableKey = getPublishableKey();
                String stripeAccountId = getStripeAccountId();
                String clientSecret = getClientSecret();
                CollectBankAccountConfiguration configuration = getConfiguration();
                boolean attachToIntent = getAttachToIntent();
                return "ForSetupIntent(publishableKey=" + publishableKey + ", stripeAccountId=" + stripeAccountId + ", clientSecret=" + clientSecret + ", configuration=" + configuration + ", attachToIntent=" + attachToIntent + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.publishableKey);
                out.writeString(this.stripeAccountId);
                out.writeString(this.clientSecret);
                out.writeParcelable(this.configuration, i);
                out.writeInt(this.attachToIntent ? 1 : 0);
            }
        }

        public /* synthetic */ Args(String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, collectBankAccountConfiguration, z);
        }

        public boolean getAttachToIntent() {
            return this.attachToIntent;
        }

        public String getClientSecret() {
            return this.clientSecret;
        }

        public CollectBankAccountConfiguration getConfiguration() {
            return this.configuration;
        }

        public String getPublishableKey() {
            return this.publishableKey;
        }

        public String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public final Bundle toBundle() {
            return C39564d70.m44603a(TuplesKt.m28425to(CollectBankAccountContract.EXTRA_ARGS, this));
        }

        private Args(String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z) {
            this.publishableKey = str;
            this.stripeAccountId = str2;
            this.clientSecret = str3;
            this.configuration = collectBankAccountConfiguration;
            this.attachToIntent = z;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Companion;", "", "()V", "EXTRA_ARGS", "", "getEXTRA_ARGS$annotations", "EXTRA_RESULT", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getEXTRA_ARGS$annotations() {
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Result;", "Landroid/os/Parcelable;", "collectBankAccountResult", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V", "getCollectBankAccountResult", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        private final CollectBankAccountResult collectBankAccountResult;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Result((CollectBankAccountResult) parcel.readParcelable(Result.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result(CollectBankAccountResult collectBankAccountResult) {
            Intrinsics.checkNotNullParameter(collectBankAccountResult, "collectBankAccountResult");
            this.collectBankAccountResult = collectBankAccountResult;
        }

        public static /* synthetic */ Result copy$default(Result result, CollectBankAccountResult collectBankAccountResult, int i, Object obj) {
            if ((i & 1) != 0) {
                collectBankAccountResult = result.collectBankAccountResult;
            }
            return result.copy(collectBankAccountResult);
        }

        public final CollectBankAccountResult component1() {
            return this.collectBankAccountResult;
        }

        public final Result copy(CollectBankAccountResult collectBankAccountResult) {
            Intrinsics.checkNotNullParameter(collectBankAccountResult, "collectBankAccountResult");
            return new Result(collectBankAccountResult);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && Intrinsics.areEqual(this.collectBankAccountResult, ((Result) obj).collectBankAccountResult);
        }

        public final CollectBankAccountResult getCollectBankAccountResult() {
            return this.collectBankAccountResult;
        }

        public int hashCode() {
            return this.collectBankAccountResult.hashCode();
        }

        public final Bundle toBundle() {
            return C39564d70.m44603a(TuplesKt.m28425to(CollectBankAccountContract.EXTRA_RESULT, this));
        }

        public String toString() {
            CollectBankAccountResult collectBankAccountResult = this.collectBankAccountResult;
            return "Result(collectBankAccountResult=" + collectBankAccountResult + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.collectBankAccountResult, i);
        }
    }

    @Override // p000.AbstractC29414v5
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent(context, CollectBankAccountActivity.class).putExtra(EXTRA_ARGS, input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, CollectB…tExtra(EXTRA_ARGS, input)");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC29414v5
    public CollectBankAccountResult parseResult(int i, Intent intent) {
        Result result;
        CollectBankAccountResult collectBankAccountResult = (intent == null || (result = (Result) intent.getParcelableExtra(EXTRA_RESULT)) == null) ? null : result.getCollectBankAccountResult();
        return collectBankAccountResult == null ? new CollectBankAccountResult.Failed(new IllegalArgumentException("Failed to retrieve a CollectBankAccountResult.")) : collectBankAccountResult;
    }
}
