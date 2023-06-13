package com.stripe.android.paymentsheet;

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
import com.stripe.android.core.injection.InjectorKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import com.stripe.android.view.ActivityStarter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u000f\u0011B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract;", "Lv5;", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "Companion", "Args", com.paypal.android.sdk.onetouch.core.Result.f74995h, "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentSheetContract extends AbstractC29414v5<Args, PaymentSheetResult> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ARGS = "com.stripe.android.paymentsheet.PaymentSheetContract.extra_args";
    private static final String EXTRA_RESULT = "com.stripe.android.paymentsheet.PaymentSheetContract.extra_result";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Companion;", "", "()V", "EXTRA_ARGS", "", "getEXTRA_ARGS$annotations", "EXTRA_RESULT", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "paymentSheetResult", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V", "getPaymentSheetResult", "()Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Result implements ActivityStarter.Result {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        private final PaymentSheetResult paymentSheetResult;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Result((PaymentSheetResult) parcel.readParcelable(Result.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result(PaymentSheetResult paymentSheetResult) {
            Intrinsics.checkNotNullParameter(paymentSheetResult, "paymentSheetResult");
            this.paymentSheetResult = paymentSheetResult;
        }

        public static /* synthetic */ Result copy$default(Result result, PaymentSheetResult paymentSheetResult, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentSheetResult = result.paymentSheetResult;
            }
            return result.copy(paymentSheetResult);
        }

        public final PaymentSheetResult component1() {
            return this.paymentSheetResult;
        }

        public final Result copy(PaymentSheetResult paymentSheetResult) {
            Intrinsics.checkNotNullParameter(paymentSheetResult, "paymentSheetResult");
            return new Result(paymentSheetResult);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && Intrinsics.areEqual(this.paymentSheetResult, ((Result) obj).paymentSheetResult);
        }

        public final PaymentSheetResult getPaymentSheetResult() {
            return this.paymentSheetResult;
        }

        public int hashCode() {
            return this.paymentSheetResult.hashCode();
        }

        @Override // com.stripe.android.view.ActivityStarter.Result
        public Bundle toBundle() {
            return C39564d70.m44603a(TuplesKt.m28425to(PaymentSheetContract.EXTRA_RESULT, this));
        }

        public String toString() {
            PaymentSheetResult paymentSheetResult = this.paymentSheetResult;
            return "Result(paymentSheetResult=" + paymentSheetResult + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.paymentSheetResult, i);
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
        Intent putExtra = new Intent(context, PaymentSheetActivity.class).putExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args", Args.copy$default(input, null, null, num, null, 11, null).toV2$paymentsheet_release());
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, PaymentS…(EXTRA_ARGS, args.toV2())");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC29414v5
    public PaymentSheetResult parseResult(int i, Intent intent) {
        PaymentSheetContractV2.Result result;
        PaymentSheetResult paymentSheetResult = (intent == null || (result = (PaymentSheetContractV2.Result) intent.getParcelableExtra(EXTRA_RESULT)) == null) ? null : result.getPaymentSheetResult();
        return paymentSheetResult == null ? new PaymentSheetResult.Failed(new IllegalArgumentException("Failed to retrieve a PaymentSheetResult.")) : paymentSheetResult;
    }

    @Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00011B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0018\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u000e\u0010\u001e\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b\u001fJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001J\r\u0010)\u001a\u00020*H\u0000¢\u0006\u0002\b+J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u00062"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "statusBarColor", "", "injectorKey", "", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Ljava/lang/Integer;Ljava/lang/String;)V", "getClientSecret$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/model/ClientSecret;", "getConfig$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "googlePayConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "getGooglePayConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "getInjectorKey$paymentsheet_release", "()Ljava/lang/String;", "getStatusBarColor$paymentsheet_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component1$paymentsheet_release", "component2", "component2$paymentsheet_release", "component3", "component3$paymentsheet_release", "component4", "component4$paymentsheet_release", "copy", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "toV2", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "toV2$paymentsheet_release", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args implements ActivityStarter.Args {
        private final ClientSecret clientSecret;
        private final PaymentSheet.Configuration config;
        private final String injectorKey;
        private final Integer statusBarColor;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args$Companion;", "", "()V", "createPaymentIntentArgs", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "clientSecret", "", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "createSetupIntentArgs", "fromIntent", "intent", "Landroid/content/Intent;", "fromIntent$paymentsheet_release", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Args createPaymentIntentArgs$default(Companion companion, String str, PaymentSheet.Configuration configuration, int i, Object obj) {
                if ((i & 2) != 0) {
                    configuration = null;
                }
                return companion.createPaymentIntentArgs(str, configuration);
            }

            public static /* synthetic */ Args createSetupIntentArgs$default(Companion companion, String str, PaymentSheet.Configuration configuration, int i, Object obj) {
                if ((i & 2) != 0) {
                    configuration = null;
                }
                return companion.createSetupIntentArgs(str, configuration);
            }

            public final Args createPaymentIntentArgs(String clientSecret, PaymentSheet.Configuration configuration) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new Args(new PaymentIntentClientSecret(clientSecret), configuration, null, null, 12, null);
            }

            public final Args createSetupIntentArgs(String clientSecret, PaymentSheet.Configuration configuration) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new Args(new SetupIntentClientSecret(clientSecret), configuration, null, null, 12, null);
            }

            public final Args fromIntent$paymentsheet_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args");
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
                return new Args((ClientSecret) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? null : PaymentSheet.Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(ClientSecret clientSecret, PaymentSheet.Configuration configuration, Integer num, @InjectorKey String injectorKey) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            this.clientSecret = clientSecret;
            this.config = configuration;
            this.statusBarColor = num;
            this.injectorKey = injectorKey;
        }

        public static /* synthetic */ Args copy$default(Args args, ClientSecret clientSecret, PaymentSheet.Configuration configuration, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                clientSecret = args.clientSecret;
            }
            if ((i & 2) != 0) {
                configuration = args.config;
            }
            if ((i & 4) != 0) {
                num = args.statusBarColor;
            }
            if ((i & 8) != 0) {
                str = args.injectorKey;
            }
            return args.copy(clientSecret, configuration, num, str);
        }

        public final ClientSecret component1$paymentsheet_release() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration component2$paymentsheet_release() {
            return this.config;
        }

        public final Integer component3$paymentsheet_release() {
            return this.statusBarColor;
        }

        public final String component4$paymentsheet_release() {
            return this.injectorKey;
        }

        public final Args copy(ClientSecret clientSecret, PaymentSheet.Configuration configuration, Integer num, @InjectorKey String injectorKey) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            return new Args(clientSecret, configuration, num, injectorKey);
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
                return Intrinsics.areEqual(this.clientSecret, args.clientSecret) && Intrinsics.areEqual(this.config, args.config) && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && Intrinsics.areEqual(this.injectorKey, args.injectorKey);
            }
            return false;
        }

        public final ClientSecret getClientSecret$paymentsheet_release() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration getConfig$paymentsheet_release() {
            return this.config;
        }

        public final PaymentSheet.GooglePayConfiguration getGooglePayConfig() {
            PaymentSheet.Configuration configuration = this.config;
            if (configuration != null) {
                return configuration.getGooglePay();
            }
            return null;
        }

        public final String getInjectorKey$paymentsheet_release() {
            return this.injectorKey;
        }

        public final Integer getStatusBarColor$paymentsheet_release() {
            return this.statusBarColor;
        }

        public int hashCode() {
            int hashCode = this.clientSecret.hashCode() * 31;
            PaymentSheet.Configuration configuration = this.config;
            int hashCode2 = (hashCode + (configuration == null ? 0 : configuration.hashCode())) * 31;
            Integer num = this.statusBarColor;
            return ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.injectorKey.hashCode();
        }

        public String toString() {
            ClientSecret clientSecret = this.clientSecret;
            PaymentSheet.Configuration configuration = this.config;
            Integer num = this.statusBarColor;
            String str = this.injectorKey;
            return "Args(clientSecret=" + clientSecret + ", config=" + configuration + ", statusBarColor=" + num + ", injectorKey=" + str + ")";
        }

        public final PaymentSheetContractV2.Args toV2$paymentsheet_release() {
            PaymentSheet.InitializationMode setupIntent;
            ClientSecret clientSecret = this.clientSecret;
            if (clientSecret instanceof PaymentIntentClientSecret) {
                setupIntent = new PaymentSheet.InitializationMode.PaymentIntent(this.clientSecret.getValue());
            } else if (clientSecret instanceof SetupIntentClientSecret) {
                setupIntent = new PaymentSheet.InitializationMode.SetupIntent(this.clientSecret.getValue());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return new PaymentSheetContractV2.Args(setupIntent, this.config, this.statusBarColor, this.injectorKey);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.clientSecret, i);
            PaymentSheet.Configuration configuration = this.config;
            if (configuration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                configuration.writeToParcel(out, i);
            }
            Integer num = this.statusBarColor;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.injectorKey);
        }

        public /* synthetic */ Args(ClientSecret clientSecret, PaymentSheet.Configuration configuration, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(clientSecret, configuration, (i & 4) != 0 ? null : num, (i & 8) != 0 ? InjectorKt.DUMMY_INJECTOR_KEY : str);
        }
    }
}
