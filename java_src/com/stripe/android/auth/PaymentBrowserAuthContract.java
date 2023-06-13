package com.stripe.android.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.stripe3ds2.init.p048ui.StripeToolbarCustomization;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract;", "Lv5;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "Companion", "Args", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class PaymentBrowserAuthContract extends AbstractC29414v5<Args, PaymentFlowResult.Unvalidated> {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_ARGS = "extra_args";

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$Companion;", "", "()V", "EXTRA_ARGS", "", "parseArgs", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "intent", "Landroid/content/Intent;", "parseArgs$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Args parseArgs$payments_core_release(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return (Args) intent.getParcelableExtra(PaymentBrowserAuthContract.EXTRA_ARGS);
        }

        private Companion() {
        }
    }

    @Override // p000.AbstractC29414v5
    public Intent createIntent(Context context, Args input) {
        Class cls;
        Window window;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        boolean z = input.hasDefaultReturnUrl$payments_core_release(DefaultReturnUrl.Companion.create(context)) || input.isInstantApp();
        Bundle bundle = Args.copy$default(input, null, 0, null, null, null, false, null, null, false, false, (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null) ? null : Integer.valueOf(window.getStatusBarColor()), null, false, 7167, null).toBundle();
        if (z) {
            cls = StripeBrowserLauncherActivity.class;
        } else if (!z) {
            cls = PaymentAuthWebViewActivity.class;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Intent intent = new Intent(context, cls);
        intent.putExtras(bundle);
        return intent;
    }

    @Override // p000.AbstractC29414v5
    public PaymentFlowResult.Unvalidated parseResult(int i, Intent intent) {
        PaymentFlowResult.Unvalidated unvalidated = intent != null ? (PaymentFlowResult.Unvalidated) intent.getParcelableExtra(EXTRA_ARGS) : null;
        return unvalidated == null ? new PaymentFlowResult.Unvalidated(null, 0, null, false, null, null, null, 127, null) : unvalidated;
    }

    @Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 G2\u00020\u0001:\u0001GB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0083\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010#J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\u0098\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u00107J\b\u00108\u001a\u00020\bH\u0016J\u0013\u00109\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\u0015\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020>H\u0000¢\u0006\u0002\b?J\t\u0010@\u001a\u00020\bHÖ\u0001J\u0006\u0010A\u001a\u00020BJ\t\u0010C\u001a\u00020\u0006HÖ\u0001J\u0018\u0010D\u001a\u00020E2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\bH\u0016R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018¨\u0006H"}, m28432d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "objectId", "", "requestCode", "", "clientSecret", "url", "returnUrl", NamedConstantsKt.ENABLE_LOGGING, "", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "shouldCancelSource", "shouldCancelIntentOnUserNavigation", "statusBarColor", "publishableKey", com.stripe.android.payments.core.injection.NamedConstantsKt.IS_INSTANT_APP, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;Z)V", "getClientSecret", "()Ljava/lang/String;", "getEnableLogging", "()Z", "getObjectId", "getPublishableKey", "getRequestCode", "()I", "getReturnUrl", "getShouldCancelIntentOnUserNavigation", "getShouldCancelSource", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStripeAccountId", "getToolbarCustomization", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "getUrl", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;Z)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hasDefaultReturnUrl", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "hasDefaultReturnUrl$payments_core_release", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "writeToParcel", "", "flags", "CREATOR", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Args implements Parcelable {
        public static final CREATOR CREATOR = new CREATOR(null);
        private final String clientSecret;
        private final boolean enableLogging;
        private final boolean isInstantApp;
        private final String objectId;
        private final String publishableKey;
        private final int requestCode;
        private final String returnUrl;
        private final boolean shouldCancelIntentOnUserNavigation;
        private final boolean shouldCancelSource;
        private final Integer statusBarColor;
        private final String stripeAccountId;
        private final StripeToolbarCustomization toolbarCustomization;
        private final String url;

        @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class CREATOR implements Parcelable.Creator<Args> {
            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private CREATOR() {
            }

            @Override // android.os.Parcelable.Creator
            public Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(String objectId, int i, String clientSecret, String url, String str, boolean z, StripeToolbarCustomization stripeToolbarCustomization, String str2, boolean z2, boolean z3, Integer num, String publishableKey, boolean z4) {
            Intrinsics.checkNotNullParameter(objectId, "objectId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            this.objectId = objectId;
            this.requestCode = i;
            this.clientSecret = clientSecret;
            this.url = url;
            this.returnUrl = str;
            this.enableLogging = z;
            this.toolbarCustomization = stripeToolbarCustomization;
            this.stripeAccountId = str2;
            this.shouldCancelSource = z2;
            this.shouldCancelIntentOnUserNavigation = z3;
            this.statusBarColor = num;
            this.publishableKey = publishableKey;
            this.isInstantApp = z4;
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, String str2, String str3, String str4, boolean z, StripeToolbarCustomization stripeToolbarCustomization, String str5, boolean z2, boolean z3, Integer num, String str6, boolean z4, int i2, Object obj) {
            return args.copy((i2 & 1) != 0 ? args.objectId : str, (i2 & 2) != 0 ? args.requestCode : i, (i2 & 4) != 0 ? args.clientSecret : str2, (i2 & 8) != 0 ? args.url : str3, (i2 & 16) != 0 ? args.returnUrl : str4, (i2 & 32) != 0 ? args.enableLogging : z, (i2 & 64) != 0 ? args.toolbarCustomization : stripeToolbarCustomization, (i2 & 128) != 0 ? args.stripeAccountId : str5, (i2 & 256) != 0 ? args.shouldCancelSource : z2, (i2 & 512) != 0 ? args.shouldCancelIntentOnUserNavigation : z3, (i2 & 1024) != 0 ? args.statusBarColor : num, (i2 & 2048) != 0 ? args.publishableKey : str6, (i2 & 4096) != 0 ? args.isInstantApp : z4);
        }

        public final String component1() {
            return this.objectId;
        }

        public final boolean component10() {
            return this.shouldCancelIntentOnUserNavigation;
        }

        public final Integer component11() {
            return this.statusBarColor;
        }

        public final String component12() {
            return this.publishableKey;
        }

        public final boolean component13() {
            return this.isInstantApp;
        }

        public final int component2() {
            return this.requestCode;
        }

        public final String component3() {
            return this.clientSecret;
        }

        public final String component4() {
            return this.url;
        }

        public final String component5() {
            return this.returnUrl;
        }

        public final boolean component6() {
            return this.enableLogging;
        }

        public final StripeToolbarCustomization component7() {
            return this.toolbarCustomization;
        }

        public final String component8() {
            return this.stripeAccountId;
        }

        public final boolean component9() {
            return this.shouldCancelSource;
        }

        public final Args copy(String objectId, int i, String clientSecret, String url, String str, boolean z, StripeToolbarCustomization stripeToolbarCustomization, String str2, boolean z2, boolean z3, Integer num, String publishableKey, boolean z4) {
            Intrinsics.checkNotNullParameter(objectId, "objectId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            return new Args(objectId, i, clientSecret, url, str, z, stripeToolbarCustomization, str2, z2, z3, num, publishableKey, z4);
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
                return Intrinsics.areEqual(this.objectId, args.objectId) && this.requestCode == args.requestCode && Intrinsics.areEqual(this.clientSecret, args.clientSecret) && Intrinsics.areEqual(this.url, args.url) && Intrinsics.areEqual(this.returnUrl, args.returnUrl) && this.enableLogging == args.enableLogging && Intrinsics.areEqual(this.toolbarCustomization, args.toolbarCustomization) && Intrinsics.areEqual(this.stripeAccountId, args.stripeAccountId) && this.shouldCancelSource == args.shouldCancelSource && this.shouldCancelIntentOnUserNavigation == args.shouldCancelIntentOnUserNavigation && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && Intrinsics.areEqual(this.publishableKey, args.publishableKey) && this.isInstantApp == args.isInstantApp;
            }
            return false;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final String getObjectId() {
            return this.objectId;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public final int getRequestCode() {
            return this.requestCode;
        }

        public final String getReturnUrl() {
            return this.returnUrl;
        }

        public final boolean getShouldCancelIntentOnUserNavigation() {
            return this.shouldCancelIntentOnUserNavigation;
        }

        public final boolean getShouldCancelSource() {
            return this.shouldCancelSource;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public final StripeToolbarCustomization getToolbarCustomization() {
            return this.toolbarCustomization;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean hasDefaultReturnUrl$payments_core_release(DefaultReturnUrl defaultReturnUrl) {
            Intrinsics.checkNotNullParameter(defaultReturnUrl, "defaultReturnUrl");
            return Intrinsics.areEqual(this.returnUrl, defaultReturnUrl.getValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((this.objectId.hashCode() * 31) + Integer.hashCode(this.requestCode)) * 31) + this.clientSecret.hashCode()) * 31) + this.url.hashCode()) * 31;
            String str = this.returnUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.enableLogging;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode2 + i) * 31;
            StripeToolbarCustomization stripeToolbarCustomization = this.toolbarCustomization;
            int hashCode3 = (i2 + (stripeToolbarCustomization == null ? 0 : stripeToolbarCustomization.hashCode())) * 31;
            String str2 = this.stripeAccountId;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            boolean z2 = this.shouldCancelSource;
            int i3 = z2;
            if (z2 != 0) {
                i3 = 1;
            }
            int i4 = (hashCode4 + i3) * 31;
            boolean z3 = this.shouldCancelIntentOnUserNavigation;
            int i5 = z3;
            if (z3 != 0) {
                i5 = 1;
            }
            int i6 = (i4 + i5) * 31;
            Integer num = this.statusBarColor;
            int hashCode5 = (((i6 + (num != null ? num.hashCode() : 0)) * 31) + this.publishableKey.hashCode()) * 31;
            boolean z4 = this.isInstantApp;
            return hashCode5 + (z4 ? 1 : z4 ? 1 : 0);
        }

        public final boolean isInstantApp() {
            return this.isInstantApp;
        }

        public final Bundle toBundle() {
            return C39564d70.m44603a(TuplesKt.m28425to(PaymentBrowserAuthContract.EXTRA_ARGS, this));
        }

        public String toString() {
            String str = this.objectId;
            int i = this.requestCode;
            String str2 = this.clientSecret;
            String str3 = this.url;
            String str4 = this.returnUrl;
            boolean z = this.enableLogging;
            StripeToolbarCustomization stripeToolbarCustomization = this.toolbarCustomization;
            String str5 = this.stripeAccountId;
            boolean z2 = this.shouldCancelSource;
            boolean z3 = this.shouldCancelIntentOnUserNavigation;
            Integer num = this.statusBarColor;
            String str6 = this.publishableKey;
            boolean z4 = this.isInstantApp;
            return "Args(objectId=" + str + ", requestCode=" + i + ", clientSecret=" + str2 + ", url=" + str3 + ", returnUrl=" + str4 + ", enableLogging=" + z + ", toolbarCustomization=" + stripeToolbarCustomization + ", stripeAccountId=" + str5 + ", shouldCancelSource=" + z2 + ", shouldCancelIntentOnUserNavigation=" + z3 + ", statusBarColor=" + num + ", publishableKey=" + str6 + ", isInstantApp=" + z4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.objectId);
            parcel.writeInt(this.requestCode);
            parcel.writeString(this.clientSecret);
            parcel.writeString(this.url);
            parcel.writeString(this.returnUrl);
            parcel.writeByte(this.enableLogging ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.toolbarCustomization, i);
            parcel.writeString(this.stripeAccountId);
            parcel.writeByte(this.shouldCancelSource ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.shouldCancelIntentOnUserNavigation ? (byte) 1 : (byte) 0);
            parcel.writeValue(this.statusBarColor);
            parcel.writeString(this.publishableKey);
            parcel.writeByte(this.isInstantApp ? (byte) 1 : (byte) 0);
        }

        public /* synthetic */ Args(String str, int i, String str2, String str3, String str4, boolean z, StripeToolbarCustomization stripeToolbarCustomization, String str5, boolean z2, boolean z3, Integer num, String str6, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : stripeToolbarCustomization, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? true : z3, (i2 & 1024) != 0 ? null : num, str6, z4);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Args(Parcel parcel) {
            this(r4, r5, r6, r7, r8, r1, r10, r11, r12, r13, r14, r15 == null ? "" : r15, parcel.readByte() != 0);
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String str = readString == null ? "" : readString;
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            String str2 = readString2 == null ? "" : readString2;
            String readString3 = parcel.readString();
            String str3 = readString3 == null ? "" : readString3;
            String readString4 = parcel.readString();
            boolean z = parcel.readByte() != 0;
            StripeToolbarCustomization stripeToolbarCustomization = (StripeToolbarCustomization) parcel.readParcelable(StripeToolbarCustomization.class.getClassLoader());
            String readString5 = parcel.readString();
            boolean z2 = parcel.readByte() != 0;
            boolean z3 = parcel.readByte() != 0;
            Object readValue = parcel.readValue(Integer.TYPE.getClassLoader());
            Integer num = readValue instanceof Integer ? (Integer) readValue : null;
            String readString6 = parcel.readString();
        }
    }
}
