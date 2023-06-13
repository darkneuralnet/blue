package com.stripe.android.link;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.view.ActivityStarter;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u000f\u0011B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/link/LinkActivityContract;", "Lv5;", "Lcom/stripe/android/link/LinkActivityContract$Args;", "Lcom/stripe/android/link/LinkActivityResult;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "Companion", "Args", com.paypal.android.sdk.onetouch.core.Result.f74995h, "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class LinkActivityContract extends AbstractC29414v5<Args, LinkActivityResult> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ARGS = "com.stripe.android.link.LinkActivityContract.extra_args";
    public static final String EXTRA_RESULT = "com.stripe.android.link.LinkActivityContract.extra_result";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/link/LinkActivityContract$Companion;", "", "()V", "EXTRA_ARGS", "", "EXTRA_RESULT", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/link/LinkActivityContract$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "linkResult", "Lcom/stripe/android/link/LinkActivityResult;", "(Lcom/stripe/android/link/LinkActivityResult;)V", "getLinkResult", "()Lcom/stripe/android/link/LinkActivityResult;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Result implements ActivityStarter.Result {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        private final LinkActivityResult linkResult;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Result((LinkActivityResult) parcel.readParcelable(Result.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result(LinkActivityResult linkResult) {
            Intrinsics.checkNotNullParameter(linkResult, "linkResult");
            this.linkResult = linkResult;
        }

        public static /* synthetic */ Result copy$default(Result result, LinkActivityResult linkActivityResult, int i, Object obj) {
            if ((i & 1) != 0) {
                linkActivityResult = result.linkResult;
            }
            return result.copy(linkActivityResult);
        }

        public final LinkActivityResult component1() {
            return this.linkResult;
        }

        public final Result copy(LinkActivityResult linkResult) {
            Intrinsics.checkNotNullParameter(linkResult, "linkResult");
            return new Result(linkResult);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && Intrinsics.areEqual(this.linkResult, ((Result) obj).linkResult);
        }

        public final LinkActivityResult getLinkResult() {
            return this.linkResult;
        }

        public int hashCode() {
            return this.linkResult.hashCode();
        }

        @Override // com.stripe.android.view.ActivityStarter.Result
        public Bundle toBundle() {
            return C39564d70.m44603a(TuplesKt.m28425to(LinkActivityContract.EXTRA_RESULT, this));
        }

        public String toString() {
            LinkActivityResult linkActivityResult = this.linkResult;
            return "Result(linkResult=" + linkActivityResult + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.linkResult, i);
        }
    }

    @Override // p000.AbstractC29414v5
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent(context, LinkActivity.class).putExtra(EXTRA_ARGS, input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, LinkActi…tExtra(EXTRA_ARGS, input)");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC29414v5
    public LinkActivityResult parseResult(int i, Intent intent) {
        Result result;
        LinkActivityResult linkResult = (intent == null || (result = (Result) intent.getParcelableExtra(EXTRA_RESULT)) == null) ? null : result.getLinkResult();
        return linkResult == null ? new LinkActivityResult.Canceled(LinkActivityResult.Canceled.Reason.BackPressed) : linkResult;
    }

    @Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002=>B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010)\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b*J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b,J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b.J+\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u00100\u001a\u000201HÖ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000201HÖ\u0001J\t\u00107\u001a\u00020\fHÖ\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\fX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR*\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u001fX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u000e\u001a\u0004\b'\u0010(¨\u0006?"}, m28432d2 = {"Lcom/stripe/android/link/LinkActivityContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "configuration", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "prefilledCardParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "injectionParams", "Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;", "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;)V", "getConfiguration$link_release", "()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "customerEmail", "", "getCustomerEmail$link_release$annotations", "()V", "getCustomerEmail$link_release", "()Ljava/lang/String;", "customerName", "getCustomerName$link_release$annotations", "getCustomerName$link_release", "customerPhone", "getCustomerPhone$link_release$annotations", "getCustomerPhone$link_release", "getInjectionParams$link_release", "()Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;", "merchantName", "getMerchantName$link_release$annotations", "getMerchantName$link_release", "getPrefilledCardParams$link_release", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", NamedConstantsKt.SHIPPING_VALUES, "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getShippingValues$link_release$annotations", "getShippingValues$link_release", "()Ljava/util/Map;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "getStripeIntent$link_release$annotations", "getStripeIntent$link_release", "()Lcom/stripe/android/model/StripeIntent;", "component1", "component1$link_release", "component2", "component2$link_release", "component3", "component3$link_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "InjectionParams", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args implements ActivityStarter.Args {
        private final LinkPaymentLauncher.Configuration configuration;
        private final String customerEmail;
        private final String customerName;
        private final String customerPhone;
        private final InjectionParams injectionParams;
        private final String merchantName;
        private final PaymentMethodCreateParams prefilledCardParams;
        private final Map<IdentifierSpec, String> shippingValues;
        private final StripeIntent stripeIntent;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/link/LinkActivityContract$Args$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/link/LinkActivityContract$Args;", "intent", "Landroid/content/Intent;", "fromIntent$link_release", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args fromIntent$link_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra(LinkActivityContract.EXTRA_ARGS);
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
                return new Args(LinkPaymentLauncher.Configuration.CREATOR.createFromParcel(parcel), (PaymentMethodCreateParams) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? null : InjectionParams.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;", "Landroid/os/Parcelable;", "injectorKey", "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", NamedConstantsKt.ENABLE_LOGGING, "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/String;Ljava/lang/String;)V", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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

        public Args(LinkPaymentLauncher.Configuration configuration, PaymentMethodCreateParams paymentMethodCreateParams, InjectionParams injectionParams) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
            this.prefilledCardParams = paymentMethodCreateParams;
            this.injectionParams = injectionParams;
            this.stripeIntent = configuration.getStripeIntent();
            this.merchantName = configuration.getMerchantName();
            this.customerEmail = configuration.getCustomerEmail();
            this.customerPhone = configuration.getCustomerPhone();
            this.customerName = configuration.getCustomerName();
            this.shippingValues = configuration.getShippingValues();
        }

        public static /* synthetic */ Args copy$default(Args args, LinkPaymentLauncher.Configuration configuration, PaymentMethodCreateParams paymentMethodCreateParams, InjectionParams injectionParams, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = args.configuration;
            }
            if ((i & 2) != 0) {
                paymentMethodCreateParams = args.prefilledCardParams;
            }
            if ((i & 4) != 0) {
                injectionParams = args.injectionParams;
            }
            return args.copy(configuration, paymentMethodCreateParams, injectionParams);
        }

        public static /* synthetic */ void getCustomerEmail$link_release$annotations() {
        }

        public static /* synthetic */ void getCustomerName$link_release$annotations() {
        }

        public static /* synthetic */ void getCustomerPhone$link_release$annotations() {
        }

        public static /* synthetic */ void getMerchantName$link_release$annotations() {
        }

        public static /* synthetic */ void getShippingValues$link_release$annotations() {
        }

        public static /* synthetic */ void getStripeIntent$link_release$annotations() {
        }

        public final LinkPaymentLauncher.Configuration component1$link_release() {
            return this.configuration;
        }

        public final PaymentMethodCreateParams component2$link_release() {
            return this.prefilledCardParams;
        }

        public final InjectionParams component3$link_release() {
            return this.injectionParams;
        }

        public final Args copy(LinkPaymentLauncher.Configuration configuration, PaymentMethodCreateParams paymentMethodCreateParams, InjectionParams injectionParams) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new Args(configuration, paymentMethodCreateParams, injectionParams);
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
                return Intrinsics.areEqual(this.configuration, args.configuration) && Intrinsics.areEqual(this.prefilledCardParams, args.prefilledCardParams) && Intrinsics.areEqual(this.injectionParams, args.injectionParams);
            }
            return false;
        }

        public final LinkPaymentLauncher.Configuration getConfiguration$link_release() {
            return this.configuration;
        }

        public final String getCustomerEmail$link_release() {
            return this.customerEmail;
        }

        public final String getCustomerName$link_release() {
            return this.customerName;
        }

        public final String getCustomerPhone$link_release() {
            return this.customerPhone;
        }

        public final InjectionParams getInjectionParams$link_release() {
            return this.injectionParams;
        }

        public final String getMerchantName$link_release() {
            return this.merchantName;
        }

        public final PaymentMethodCreateParams getPrefilledCardParams$link_release() {
            return this.prefilledCardParams;
        }

        public final Map<IdentifierSpec, String> getShippingValues$link_release() {
            return this.shippingValues;
        }

        public final StripeIntent getStripeIntent$link_release() {
            return this.stripeIntent;
        }

        public int hashCode() {
            int hashCode = this.configuration.hashCode() * 31;
            PaymentMethodCreateParams paymentMethodCreateParams = this.prefilledCardParams;
            int hashCode2 = (hashCode + (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode())) * 31;
            InjectionParams injectionParams = this.injectionParams;
            return hashCode2 + (injectionParams != null ? injectionParams.hashCode() : 0);
        }

        public String toString() {
            LinkPaymentLauncher.Configuration configuration = this.configuration;
            PaymentMethodCreateParams paymentMethodCreateParams = this.prefilledCardParams;
            InjectionParams injectionParams = this.injectionParams;
            return "Args(configuration=" + configuration + ", prefilledCardParams=" + paymentMethodCreateParams + ", injectionParams=" + injectionParams + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.configuration.writeToParcel(out, i);
            out.writeParcelable(this.prefilledCardParams, i);
            InjectionParams injectionParams = this.injectionParams;
            if (injectionParams == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            injectionParams.writeToParcel(out, i);
        }

        public /* synthetic */ Args(LinkPaymentLauncher.Configuration configuration, PaymentMethodCreateParams paymentMethodCreateParams, InjectionParams injectionParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(configuration, (i & 2) != 0 ? null : paymentMethodCreateParams, (i & 4) != 0 ? null : injectionParams);
        }
    }
}
