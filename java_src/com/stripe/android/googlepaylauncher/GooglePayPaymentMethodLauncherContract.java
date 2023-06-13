package com.stripe.android.googlepaylauncher;

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
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract;", "Lv5;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "Companion", "Args", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class GooglePayPaymentMethodLauncherContract extends AbstractC29414v5<Args, GooglePayPaymentMethodLauncher.Result> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_RESULT = "extra_result";
    public static final String EXTRA_STATUS_BAR_COLOR = "extra_status_bar_color";

    @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000201B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tB7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0016\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0017J\u000e\u0010\u0018\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÀ\u0003¢\u0006\u0002\b\u001fJ?\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\r\u0010'\u001a\u00020(H\u0000¢\u0006\u0002\b)J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u00062"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "Landroid/os/Parcelable;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "currencyCode", "", "amount", "", "transactionId", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Ljava/lang/String;ILjava/lang/String;)V", "injectionParams", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;)V", "getAmount$payments_core_release", "()I", "getConfig$payments_core_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "getCurrencyCode$payments_core_release", "()Ljava/lang/String;", "getInjectionParams$payments_core_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;", "getTransactionId$payments_core_release", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toBundle$payments_core_release", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "InjectionParams", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args implements Parcelable {
        private static final String EXTRA_ARGS = "extra_args";
        private final int amount;
        private final GooglePayPaymentMethodLauncher.Config config;
        private final String currencyCode;
        private final InjectionParams injectionParams;
        private final String transactionId;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$Companion;", "", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "intent", "Landroid/content/Intent;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
                return new Args(GooglePayPaymentMethodLauncher.Config.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : InjectionParams.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;", "Landroid/os/Parcelable;", "injectorKey", "", NamedConstantsKt.PRODUCT_USAGE, "", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "", "publishableKey", com.stripe.android.core.injection.NamedConstantsKt.STRIPE_ACCOUNT_ID, "(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/String;Ljava/lang/String;)V", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class InjectionParams implements Parcelable {
            public static final Parcelable.Creator<InjectionParams> CREATOR = new Creator();
            private final boolean enableLogging;
            private final String injectorKey;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final String stripeAccountId;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<InjectionParams> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InjectionParams createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new InjectionParams(readString, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InjectionParams[] newArray(int i) {
                    return new InjectionParams[i];
                }
            }

            public InjectionParams(@InjectorKey String injectorKey, Set<String> productUsage, boolean z, String publishableKey, String str) {
                Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                this.injectorKey = injectorKey;
                this.productUsage = productUsage;
                this.enableLogging = z;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
            }

            public static /* synthetic */ InjectionParams copy$default(InjectionParams injectionParams, String str, Set set, boolean z, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = injectionParams.injectorKey;
                }
                Set<String> set2 = set;
                if ((i & 2) != 0) {
                    set2 = injectionParams.productUsage;
                }
                Set set3 = set2;
                if ((i & 4) != 0) {
                    z = injectionParams.enableLogging;
                }
                boolean z2 = z;
                if ((i & 8) != 0) {
                    str2 = injectionParams.publishableKey;
                }
                String str4 = str2;
                if ((i & 16) != 0) {
                    str3 = injectionParams.stripeAccountId;
                }
                return injectionParams.copy(str, set3, z2, str4, str3);
            }

            public final String component1() {
                return this.injectorKey;
            }

            public final Set<String> component2() {
                return this.productUsage;
            }

            public final boolean component3() {
                return this.enableLogging;
            }

            public final String component4() {
                return this.publishableKey;
            }

            public final String component5() {
                return this.stripeAccountId;
            }

            public final InjectionParams copy(@InjectorKey String injectorKey, Set<String> productUsage, boolean z, String publishableKey, String str) {
                Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                return new InjectionParams(injectorKey, productUsage, z, publishableKey, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof InjectionParams) {
                    InjectionParams injectionParams = (InjectionParams) obj;
                    return Intrinsics.areEqual(this.injectorKey, injectionParams.injectorKey) && Intrinsics.areEqual(this.productUsage, injectionParams.productUsage) && this.enableLogging == injectionParams.enableLogging && Intrinsics.areEqual(this.publishableKey, injectionParams.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, injectionParams.stripeAccountId);
                }
                return false;
            }

            public final boolean getEnableLogging() {
                return this.enableLogging;
            }

            public final String getInjectorKey() {
                return this.injectorKey;
            }

            public final Set<String> getProductUsage() {
                return this.productUsage;
            }

            public final String getPublishableKey() {
                return this.publishableKey;
            }

            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = ((this.injectorKey.hashCode() * 31) + this.productUsage.hashCode()) * 31;
                boolean z = this.enableLogging;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                int hashCode2 = (((hashCode + i) * 31) + this.publishableKey.hashCode()) * 31;
                String str = this.stripeAccountId;
                return hashCode2 + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.injectorKey;
                Set<String> set = this.productUsage;
                boolean z = this.enableLogging;
                String str2 = this.publishableKey;
                String str3 = this.stripeAccountId;
                return "InjectionParams(injectorKey=" + str + ", productUsage=" + set + ", enableLogging=" + z + ", publishableKey=" + str2 + ", stripeAccountId=" + str3 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.injectorKey);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
                out.writeInt(this.enableLogging ? 1 : 0);
                out.writeString(this.publishableKey);
                out.writeString(this.stripeAccountId);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Args(GooglePayPaymentMethodLauncher.Config config, String currencyCode, int i) {
            this(config, currencyCode, i, null, 8, null);
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        }

        public static /* synthetic */ Args copy$default(Args args, GooglePayPaymentMethodLauncher.Config config, String str, int i, String str2, InjectionParams injectionParams, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                config = args.config;
            }
            if ((i2 & 2) != 0) {
                str = args.currencyCode;
            }
            String str3 = str;
            if ((i2 & 4) != 0) {
                i = args.amount;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                str2 = args.transactionId;
            }
            String str4 = str2;
            if ((i2 & 16) != 0) {
                injectionParams = args.injectionParams;
            }
            return args.copy(config, str3, i3, str4, injectionParams);
        }

        public final GooglePayPaymentMethodLauncher.Config component1$payments_core_release() {
            return this.config;
        }

        public final String component2$payments_core_release() {
            return this.currencyCode;
        }

        public final int component3$payments_core_release() {
            return this.amount;
        }

        public final String component4$payments_core_release() {
            return this.transactionId;
        }

        public final InjectionParams component5$payments_core_release() {
            return this.injectionParams;
        }

        public final Args copy(GooglePayPaymentMethodLauncher.Config config, String currencyCode, int i, String str, InjectionParams injectionParams) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            return new Args(config, currencyCode, i, str, injectionParams);
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
                return Intrinsics.areEqual(this.config, args.config) && Intrinsics.areEqual(this.currencyCode, args.currencyCode) && this.amount == args.amount && Intrinsics.areEqual(this.transactionId, args.transactionId) && Intrinsics.areEqual(this.injectionParams, args.injectionParams);
            }
            return false;
        }

        public final int getAmount$payments_core_release() {
            return this.amount;
        }

        public final GooglePayPaymentMethodLauncher.Config getConfig$payments_core_release() {
            return this.config;
        }

        public final String getCurrencyCode$payments_core_release() {
            return this.currencyCode;
        }

        public final InjectionParams getInjectionParams$payments_core_release() {
            return this.injectionParams;
        }

        public final String getTransactionId$payments_core_release() {
            return this.transactionId;
        }

        public int hashCode() {
            int hashCode = ((((this.config.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + Integer.hashCode(this.amount)) * 31;
            String str = this.transactionId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            InjectionParams injectionParams = this.injectionParams;
            return hashCode2 + (injectionParams != null ? injectionParams.hashCode() : 0);
        }

        public final Bundle toBundle$payments_core_release() {
            return C39564d70.m44603a(TuplesKt.m28425to(EXTRA_ARGS, this));
        }

        public String toString() {
            GooglePayPaymentMethodLauncher.Config config = this.config;
            String str = this.currencyCode;
            int i = this.amount;
            String str2 = this.transactionId;
            InjectionParams injectionParams = this.injectionParams;
            return "Args(config=" + config + ", currencyCode=" + str + ", amount=" + i + ", transactionId=" + str2 + ", injectionParams=" + injectionParams + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.config.writeToParcel(out, i);
            out.writeString(this.currencyCode);
            out.writeInt(this.amount);
            out.writeString(this.transactionId);
            InjectionParams injectionParams = this.injectionParams;
            if (injectionParams == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            injectionParams.writeToParcel(out, i);
        }

        public Args(GooglePayPaymentMethodLauncher.Config config, String currencyCode, int i, String str, InjectionParams injectionParams) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.config = config;
            this.currencyCode = currencyCode;
            this.amount = i;
            this.transactionId = str;
            this.injectionParams = injectionParams;
        }

        public /* synthetic */ Args(GooglePayPaymentMethodLauncher.Config config, String str, int i, String str2, InjectionParams injectionParams, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(config, str, i, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : injectionParams);
        }

        public /* synthetic */ Args(GooglePayPaymentMethodLauncher.Config config, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(config, str, i, (i2 & 8) != 0 ? null : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Args(GooglePayPaymentMethodLauncher.Config config, String currencyCode, int i, String str) {
            this(config, currencyCode, i, str, null);
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Companion;", "", "()V", "EXTRA_RESULT", "", "EXTRA_STATUS_BAR_COLOR", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // p000.AbstractC29414v5
    public Intent createIntent(Context context, Args input) {
        Window window;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Integer num = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        }
        Bundle bundle$payments_core_release = input.toBundle$payments_core_release();
        if (num != null) {
            bundle$payments_core_release.putInt("extra_status_bar_color", num.intValue());
        }
        Intent putExtras = new Intent(context, GooglePayPaymentMethodLauncherActivity.class).putExtras(bundle$payments_core_release);
        Intrinsics.checkNotNullExpressionValue(putExtras, "Intent(context, GooglePa…       .putExtras(extras)");
        return putExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC29414v5
    public GooglePayPaymentMethodLauncher.Result parseResult(int i, Intent intent) {
        GooglePayPaymentMethodLauncher.Result result = intent != null ? (GooglePayPaymentMethodLauncher.Result) intent.getParcelableExtra("extra_result") : null;
        return result == null ? new GooglePayPaymentMethodLauncher.Result.Failed(new IllegalArgumentException("Could not parse a valid result."), 1) : result;
    }
}
