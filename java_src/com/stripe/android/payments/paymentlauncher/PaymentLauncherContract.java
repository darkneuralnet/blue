package com.stripe.android.payments.paymentlauncher;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.ConfirmStripeIntentParams;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;", "Lv5;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "Args", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentLauncherContract extends AbstractC29414v5<Args, PaymentResult> {
    public static final int $stable = 0;

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001c2\u00020\u0001:\u0004\u001c\u001d\u001e\u001fBE\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u001a\u001a\u00020\u001bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010\u0082\u0001\u0003 !\"¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "Landroid/os/Parcelable;", "injectorKey", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, NamedConstantsKt.ENABLE_LOGGING, "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "statusBarColor", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;)V", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getStatusBarColor", "()Ljava/lang/Integer;", "setStatusBarColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStripeAccountId", "toBundle", "Landroid/os/Bundle;", "Companion", "IntentConfirmationArgs", "PaymentIntentNextActionArgs", "SetupIntentNextActionArgs", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Args implements Parcelable {
        private static final String EXTRA_ARGS = "extra_args";
        private final boolean enableLogging;
        private final String injectorKey;
        private final Set<String> productUsage;
        private final String publishableKey;
        private Integer statusBarColor;
        private final String stripeAccountId;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$Companion;", "", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "intent", "Landroid/content/Intent;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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

        @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0000\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0019J^\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\t\u0010'\u001a\u00020\rHÖ\u0001J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\rHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\rHÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u00062"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "injectorKey", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, NamedConstantsKt.ENABLE_LOGGING, "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "confirmStripeIntentParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "statusBarColor", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Lcom/stripe/android/model/ConfirmStripeIntentParams;Ljava/lang/Integer;)V", "getConfirmStripeIntentParams", "()Lcom/stripe/android/model/ConfirmStripeIntentParams;", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getStatusBarColor", "()Ljava/lang/Integer;", "setStatusBarColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Lcom/stripe/android/model/ConfirmStripeIntentParams;Ljava/lang/Integer;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class IntentConfirmationArgs extends Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<IntentConfirmationArgs> CREATOR = new Creator();
            private final ConfirmStripeIntentParams confirmStripeIntentParams;
            private final boolean enableLogging;
            private final String injectorKey;
            private final Set<String> productUsage;
            private final String publishableKey;
            private Integer statusBarColor;
            private final String stripeAccountId;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<IntentConfirmationArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IntentConfirmationArgs createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    boolean z = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new IntentConfirmationArgs(readString, readString2, readString3, z, linkedHashSet, (ConfirmStripeIntentParams) parcel.readParcelable(IntentConfirmationArgs.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IntentConfirmationArgs[] newArray(int i) {
                    return new IntentConfirmationArgs[i];
                }
            }

            public /* synthetic */ IntentConfirmationArgs(String str, String str2, String str3, boolean z, Set set, ConfirmStripeIntentParams confirmStripeIntentParams, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, z, set, confirmStripeIntentParams, (i & 64) != 0 ? null : num);
            }

            public static /* synthetic */ IntentConfirmationArgs copy$default(IntentConfirmationArgs intentConfirmationArgs, String str, String str2, String str3, boolean z, Set set, ConfirmStripeIntentParams confirmStripeIntentParams, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = intentConfirmationArgs.getInjectorKey();
                }
                if ((i & 2) != 0) {
                    str2 = intentConfirmationArgs.getPublishableKey();
                }
                String str4 = str2;
                if ((i & 4) != 0) {
                    str3 = intentConfirmationArgs.getStripeAccountId();
                }
                String str5 = str3;
                if ((i & 8) != 0) {
                    z = intentConfirmationArgs.getEnableLogging();
                }
                boolean z2 = z;
                Set<String> set2 = set;
                if ((i & 16) != 0) {
                    set2 = intentConfirmationArgs.getProductUsage();
                }
                Set set3 = set2;
                if ((i & 32) != 0) {
                    confirmStripeIntentParams = intentConfirmationArgs.confirmStripeIntentParams;
                }
                ConfirmStripeIntentParams confirmStripeIntentParams2 = confirmStripeIntentParams;
                if ((i & 64) != 0) {
                    num = intentConfirmationArgs.getStatusBarColor();
                }
                return intentConfirmationArgs.copy(str, str4, str5, z2, set3, confirmStripeIntentParams2, num);
            }

            public final String component1() {
                return getInjectorKey();
            }

            public final String component2() {
                return getPublishableKey();
            }

            public final String component3() {
                return getStripeAccountId();
            }

            public final boolean component4() {
                return getEnableLogging();
            }

            public final Set<String> component5() {
                return getProductUsage();
            }

            public final ConfirmStripeIntentParams component6() {
                return this.confirmStripeIntentParams;
            }

            public final Integer component7() {
                return getStatusBarColor();
            }

            public final IntentConfirmationArgs copy(@InjectorKey String injectorKey, String publishableKey, String str, boolean z, Set<String> productUsage, ConfirmStripeIntentParams confirmStripeIntentParams, Integer num) {
                Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                Intrinsics.checkNotNullParameter(confirmStripeIntentParams, "confirmStripeIntentParams");
                return new IntentConfirmationArgs(injectorKey, publishableKey, str, z, productUsage, confirmStripeIntentParams, num);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof IntentConfirmationArgs) {
                    IntentConfirmationArgs intentConfirmationArgs = (IntentConfirmationArgs) obj;
                    return Intrinsics.areEqual(getInjectorKey(), intentConfirmationArgs.getInjectorKey()) && Intrinsics.areEqual(getPublishableKey(), intentConfirmationArgs.getPublishableKey()) && Intrinsics.areEqual(getStripeAccountId(), intentConfirmationArgs.getStripeAccountId()) && getEnableLogging() == intentConfirmationArgs.getEnableLogging() && Intrinsics.areEqual(getProductUsage(), intentConfirmationArgs.getProductUsage()) && Intrinsics.areEqual(this.confirmStripeIntentParams, intentConfirmationArgs.confirmStripeIntentParams) && Intrinsics.areEqual(getStatusBarColor(), intentConfirmationArgs.getStatusBarColor());
                }
                return false;
            }

            public final ConfirmStripeIntentParams getConfirmStripeIntentParams() {
                return this.confirmStripeIntentParams;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getInjectorKey() {
                return this.injectorKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Set<String> getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = ((((getInjectorKey().hashCode() * 31) + getPublishableKey().hashCode()) * 31) + (getStripeAccountId() == null ? 0 : getStripeAccountId().hashCode())) * 31;
                boolean enableLogging = getEnableLogging();
                int i = enableLogging;
                if (enableLogging) {
                    i = 1;
                }
                return ((((((hashCode + i) * 31) + getProductUsage().hashCode()) * 31) + this.confirmStripeIntentParams.hashCode()) * 31) + (getStatusBarColor() != null ? getStatusBarColor().hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public void setStatusBarColor(Integer num) {
                this.statusBarColor = num;
            }

            public String toString() {
                String injectorKey = getInjectorKey();
                String publishableKey = getPublishableKey();
                String stripeAccountId = getStripeAccountId();
                boolean enableLogging = getEnableLogging();
                Set<String> productUsage = getProductUsage();
                ConfirmStripeIntentParams confirmStripeIntentParams = this.confirmStripeIntentParams;
                Integer statusBarColor = getStatusBarColor();
                return "IntentConfirmationArgs(injectorKey=" + injectorKey + ", publishableKey=" + publishableKey + ", stripeAccountId=" + stripeAccountId + ", enableLogging=" + enableLogging + ", productUsage=" + productUsage + ", confirmStripeIntentParams=" + confirmStripeIntentParams + ", statusBarColor=" + statusBarColor + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                int intValue;
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.injectorKey);
                out.writeString(this.publishableKey);
                out.writeString(this.stripeAccountId);
                out.writeInt(this.enableLogging ? 1 : 0);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
                out.writeParcelable(this.confirmStripeIntentParams, i);
                Integer num = this.statusBarColor;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IntentConfirmationArgs(@InjectorKey String injectorKey, String publishableKey, String str, boolean z, Set<String> productUsage, ConfirmStripeIntentParams confirmStripeIntentParams, Integer num) {
                super(injectorKey, publishableKey, str, z, productUsage, num, null);
                Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                Intrinsics.checkNotNullParameter(confirmStripeIntentParams, "confirmStripeIntentParams");
                this.injectorKey = injectorKey;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.enableLogging = z;
                this.productUsage = productUsage;
                this.confirmStripeIntentParams = confirmStripeIntentParams;
                this.statusBarColor = num;
            }
        }

        @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0000\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0017J^\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\t\u0010%\u001a\u00020\fHÖ\u0001J\u0013\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\fHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u00060"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "injectorKey", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, NamedConstantsKt.ENABLE_LOGGING, "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "paymentIntentClientSecret", "statusBarColor", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/String;Ljava/lang/Integer;)V", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getPaymentIntentClientSecret", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getStatusBarColor", "()Ljava/lang/Integer;", "setStatusBarColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class PaymentIntentNextActionArgs extends Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<PaymentIntentNextActionArgs> CREATOR = new Creator();
            private final boolean enableLogging;
            private final String injectorKey;
            private final String paymentIntentClientSecret;
            private final Set<String> productUsage;
            private final String publishableKey;
            private Integer statusBarColor;
            private final String stripeAccountId;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<PaymentIntentNextActionArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntentNextActionArgs createFromParcel(Parcel parcel) {
                    String readString;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    int i = 0;
                    boolean z = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (true) {
                        readString = parcel.readString();
                        if (i == readInt) {
                            break;
                        }
                        linkedHashSet.add(readString);
                        i++;
                    }
                    return new PaymentIntentNextActionArgs(readString2, readString3, readString4, z, linkedHashSet, readString, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntentNextActionArgs[] newArray(int i) {
                    return new PaymentIntentNextActionArgs[i];
                }
            }

            public /* synthetic */ PaymentIntentNextActionArgs(String str, String str2, String str3, boolean z, Set set, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, z, set, str4, (i & 64) != 0 ? null : num);
            }

            public static /* synthetic */ PaymentIntentNextActionArgs copy$default(PaymentIntentNextActionArgs paymentIntentNextActionArgs, String str, String str2, String str3, boolean z, Set set, String str4, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = paymentIntentNextActionArgs.getInjectorKey();
                }
                if ((i & 2) != 0) {
                    str2 = paymentIntentNextActionArgs.getPublishableKey();
                }
                String str5 = str2;
                if ((i & 4) != 0) {
                    str3 = paymentIntentNextActionArgs.getStripeAccountId();
                }
                String str6 = str3;
                if ((i & 8) != 0) {
                    z = paymentIntentNextActionArgs.getEnableLogging();
                }
                boolean z2 = z;
                Set<String> set2 = set;
                if ((i & 16) != 0) {
                    set2 = paymentIntentNextActionArgs.getProductUsage();
                }
                Set set3 = set2;
                if ((i & 32) != 0) {
                    str4 = paymentIntentNextActionArgs.paymentIntentClientSecret;
                }
                String str7 = str4;
                if ((i & 64) != 0) {
                    num = paymentIntentNextActionArgs.getStatusBarColor();
                }
                return paymentIntentNextActionArgs.copy(str, str5, str6, z2, set3, str7, num);
            }

            public final String component1() {
                return getInjectorKey();
            }

            public final String component2() {
                return getPublishableKey();
            }

            public final String component3() {
                return getStripeAccountId();
            }

            public final boolean component4() {
                return getEnableLogging();
            }

            public final Set<String> component5() {
                return getProductUsage();
            }

            public final String component6() {
                return this.paymentIntentClientSecret;
            }

            public final Integer component7() {
                return getStatusBarColor();
            }

            public final PaymentIntentNextActionArgs copy(@InjectorKey String injectorKey, String publishableKey, String str, boolean z, Set<String> productUsage, String paymentIntentClientSecret, Integer num) {
                Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                Intrinsics.checkNotNullParameter(paymentIntentClientSecret, "paymentIntentClientSecret");
                return new PaymentIntentNextActionArgs(injectorKey, publishableKey, str, z, productUsage, paymentIntentClientSecret, num);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof PaymentIntentNextActionArgs) {
                    PaymentIntentNextActionArgs paymentIntentNextActionArgs = (PaymentIntentNextActionArgs) obj;
                    return Intrinsics.areEqual(getInjectorKey(), paymentIntentNextActionArgs.getInjectorKey()) && Intrinsics.areEqual(getPublishableKey(), paymentIntentNextActionArgs.getPublishableKey()) && Intrinsics.areEqual(getStripeAccountId(), paymentIntentNextActionArgs.getStripeAccountId()) && getEnableLogging() == paymentIntentNextActionArgs.getEnableLogging() && Intrinsics.areEqual(getProductUsage(), paymentIntentNextActionArgs.getProductUsage()) && Intrinsics.areEqual(this.paymentIntentClientSecret, paymentIntentNextActionArgs.paymentIntentClientSecret) && Intrinsics.areEqual(getStatusBarColor(), paymentIntentNextActionArgs.getStatusBarColor());
                }
                return false;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getInjectorKey() {
                return this.injectorKey;
            }

            public final String getPaymentIntentClientSecret() {
                return this.paymentIntentClientSecret;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Set<String> getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = ((((getInjectorKey().hashCode() * 31) + getPublishableKey().hashCode()) * 31) + (getStripeAccountId() == null ? 0 : getStripeAccountId().hashCode())) * 31;
                boolean enableLogging = getEnableLogging();
                int i = enableLogging;
                if (enableLogging) {
                    i = 1;
                }
                return ((((((hashCode + i) * 31) + getProductUsage().hashCode()) * 31) + this.paymentIntentClientSecret.hashCode()) * 31) + (getStatusBarColor() != null ? getStatusBarColor().hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public void setStatusBarColor(Integer num) {
                this.statusBarColor = num;
            }

            public String toString() {
                String injectorKey = getInjectorKey();
                String publishableKey = getPublishableKey();
                String stripeAccountId = getStripeAccountId();
                boolean enableLogging = getEnableLogging();
                Set<String> productUsage = getProductUsage();
                String str = this.paymentIntentClientSecret;
                Integer statusBarColor = getStatusBarColor();
                return "PaymentIntentNextActionArgs(injectorKey=" + injectorKey + ", publishableKey=" + publishableKey + ", stripeAccountId=" + stripeAccountId + ", enableLogging=" + enableLogging + ", productUsage=" + productUsage + ", paymentIntentClientSecret=" + str + ", statusBarColor=" + statusBarColor + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                int intValue;
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.injectorKey);
                out.writeString(this.publishableKey);
                out.writeString(this.stripeAccountId);
                out.writeInt(this.enableLogging ? 1 : 0);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
                out.writeString(this.paymentIntentClientSecret);
                Integer num = this.statusBarColor;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentIntentNextActionArgs(@InjectorKey String injectorKey, String publishableKey, String str, boolean z, Set<String> productUsage, String paymentIntentClientSecret, Integer num) {
                super(injectorKey, publishableKey, str, z, productUsage, num, null);
                Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                Intrinsics.checkNotNullParameter(paymentIntentClientSecret, "paymentIntentClientSecret");
                this.injectorKey = injectorKey;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.enableLogging = z;
                this.productUsage = productUsage;
                this.paymentIntentClientSecret = paymentIntentClientSecret;
                this.statusBarColor = num;
            }
        }

        @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0000\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0017J^\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\t\u0010%\u001a\u00020\fHÖ\u0001J\u0013\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\fHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u00060"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "injectorKey", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, NamedConstantsKt.ENABLE_LOGGING, "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "setupIntentClientSecret", "statusBarColor", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/String;Ljava/lang/Integer;)V", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getSetupIntentClientSecret", "getStatusBarColor", "()Ljava/lang/Integer;", "setStatusBarColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class SetupIntentNextActionArgs extends Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<SetupIntentNextActionArgs> CREATOR = new Creator();
            private final boolean enableLogging;
            private final String injectorKey;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final String setupIntentClientSecret;
            private Integer statusBarColor;
            private final String stripeAccountId;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<SetupIntentNextActionArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntentNextActionArgs createFromParcel(Parcel parcel) {
                    String readString;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    int i = 0;
                    boolean z = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (true) {
                        readString = parcel.readString();
                        if (i == readInt) {
                            break;
                        }
                        linkedHashSet.add(readString);
                        i++;
                    }
                    return new SetupIntentNextActionArgs(readString2, readString3, readString4, z, linkedHashSet, readString, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntentNextActionArgs[] newArray(int i) {
                    return new SetupIntentNextActionArgs[i];
                }
            }

            public /* synthetic */ SetupIntentNextActionArgs(String str, String str2, String str3, boolean z, Set set, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, z, set, str4, (i & 64) != 0 ? null : num);
            }

            public static /* synthetic */ SetupIntentNextActionArgs copy$default(SetupIntentNextActionArgs setupIntentNextActionArgs, String str, String str2, String str3, boolean z, Set set, String str4, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setupIntentNextActionArgs.getInjectorKey();
                }
                if ((i & 2) != 0) {
                    str2 = setupIntentNextActionArgs.getPublishableKey();
                }
                String str5 = str2;
                if ((i & 4) != 0) {
                    str3 = setupIntentNextActionArgs.getStripeAccountId();
                }
                String str6 = str3;
                if ((i & 8) != 0) {
                    z = setupIntentNextActionArgs.getEnableLogging();
                }
                boolean z2 = z;
                Set<String> set2 = set;
                if ((i & 16) != 0) {
                    set2 = setupIntentNextActionArgs.getProductUsage();
                }
                Set set3 = set2;
                if ((i & 32) != 0) {
                    str4 = setupIntentNextActionArgs.setupIntentClientSecret;
                }
                String str7 = str4;
                if ((i & 64) != 0) {
                    num = setupIntentNextActionArgs.getStatusBarColor();
                }
                return setupIntentNextActionArgs.copy(str, str5, str6, z2, set3, str7, num);
            }

            public final String component1() {
                return getInjectorKey();
            }

            public final String component2() {
                return getPublishableKey();
            }

            public final String component3() {
                return getStripeAccountId();
            }

            public final boolean component4() {
                return getEnableLogging();
            }

            public final Set<String> component5() {
                return getProductUsage();
            }

            public final String component6() {
                return this.setupIntentClientSecret;
            }

            public final Integer component7() {
                return getStatusBarColor();
            }

            public final SetupIntentNextActionArgs copy(@InjectorKey String injectorKey, String publishableKey, String str, boolean z, Set<String> productUsage, String setupIntentClientSecret, Integer num) {
                Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                Intrinsics.checkNotNullParameter(setupIntentClientSecret, "setupIntentClientSecret");
                return new SetupIntentNextActionArgs(injectorKey, publishableKey, str, z, productUsage, setupIntentClientSecret, num);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SetupIntentNextActionArgs) {
                    SetupIntentNextActionArgs setupIntentNextActionArgs = (SetupIntentNextActionArgs) obj;
                    return Intrinsics.areEqual(getInjectorKey(), setupIntentNextActionArgs.getInjectorKey()) && Intrinsics.areEqual(getPublishableKey(), setupIntentNextActionArgs.getPublishableKey()) && Intrinsics.areEqual(getStripeAccountId(), setupIntentNextActionArgs.getStripeAccountId()) && getEnableLogging() == setupIntentNextActionArgs.getEnableLogging() && Intrinsics.areEqual(getProductUsage(), setupIntentNextActionArgs.getProductUsage()) && Intrinsics.areEqual(this.setupIntentClientSecret, setupIntentNextActionArgs.setupIntentClientSecret) && Intrinsics.areEqual(getStatusBarColor(), setupIntentNextActionArgs.getStatusBarColor());
                }
                return false;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getInjectorKey() {
                return this.injectorKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Set<String> getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            public final String getSetupIntentClientSecret() {
                return this.setupIntentClientSecret;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = ((((getInjectorKey().hashCode() * 31) + getPublishableKey().hashCode()) * 31) + (getStripeAccountId() == null ? 0 : getStripeAccountId().hashCode())) * 31;
                boolean enableLogging = getEnableLogging();
                int i = enableLogging;
                if (enableLogging) {
                    i = 1;
                }
                return ((((((hashCode + i) * 31) + getProductUsage().hashCode()) * 31) + this.setupIntentClientSecret.hashCode()) * 31) + (getStatusBarColor() != null ? getStatusBarColor().hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public void setStatusBarColor(Integer num) {
                this.statusBarColor = num;
            }

            public String toString() {
                String injectorKey = getInjectorKey();
                String publishableKey = getPublishableKey();
                String stripeAccountId = getStripeAccountId();
                boolean enableLogging = getEnableLogging();
                Set<String> productUsage = getProductUsage();
                String str = this.setupIntentClientSecret;
                Integer statusBarColor = getStatusBarColor();
                return "SetupIntentNextActionArgs(injectorKey=" + injectorKey + ", publishableKey=" + publishableKey + ", stripeAccountId=" + stripeAccountId + ", enableLogging=" + enableLogging + ", productUsage=" + productUsage + ", setupIntentClientSecret=" + str + ", statusBarColor=" + statusBarColor + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                int intValue;
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.injectorKey);
                out.writeString(this.publishableKey);
                out.writeString(this.stripeAccountId);
                out.writeInt(this.enableLogging ? 1 : 0);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
                out.writeString(this.setupIntentClientSecret);
                Integer num = this.statusBarColor;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupIntentNextActionArgs(@InjectorKey String injectorKey, String publishableKey, String str, boolean z, Set<String> productUsage, String setupIntentClientSecret, Integer num) {
                super(injectorKey, publishableKey, str, z, productUsage, num, null);
                Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                Intrinsics.checkNotNullParameter(setupIntentClientSecret, "setupIntentClientSecret");
                this.injectorKey = injectorKey;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.enableLogging = z;
                this.productUsage = productUsage;
                this.setupIntentClientSecret = setupIntentClientSecret;
                this.statusBarColor = num;
            }
        }

        public /* synthetic */ Args(String str, String str2, String str3, boolean z, Set set, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z, set, num);
        }

        public boolean getEnableLogging() {
            return this.enableLogging;
        }

        public String getInjectorKey() {
            return this.injectorKey;
        }

        public Set<String> getProductUsage() {
            return this.productUsage;
        }

        public String getPublishableKey() {
            return this.publishableKey;
        }

        public Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public void setStatusBarColor(Integer num) {
            this.statusBarColor = num;
        }

        public final Bundle toBundle() {
            return C39564d70.m44603a(TuplesKt.m28425to(EXTRA_ARGS, this));
        }

        private Args(@InjectorKey String str, String str2, String str3, boolean z, Set<String> set, Integer num) {
            this.injectorKey = str;
            this.publishableKey = str2;
            this.stripeAccountId = str3;
            this.enableLogging = z;
            this.productUsage = set;
            this.statusBarColor = num;
        }

        public /* synthetic */ Args(String str, String str2, String str3, boolean z, Set set, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z, set, (i & 32) != 0 ? null : num, null);
        }
    }

    @Override // p000.AbstractC29414v5
    public Intent createIntent(Context context, Args input) {
        Window window;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Integer num = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        }
        input.setStatusBarColor(num);
        Intent putExtras = new Intent(context, PaymentLauncherConfirmationActivity.class).putExtras(input.toBundle());
        Intrinsics.checkNotNullExpressionValue(putExtras, "Intent(\n            cont…tExtras(input.toBundle())");
        return putExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC29414v5
    public PaymentResult parseResult(int i, Intent intent) {
        return PaymentResult.Companion.fromIntent(intent);
    }
}
