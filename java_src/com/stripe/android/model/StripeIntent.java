package com.stripe.android.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.utils.StripeUrlUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u00040123J\b\u0010.\u001a\u00020\u000fH&J\b\u0010/\u001a\u00020\u000fH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u0004\u0018\u00010!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0017R\u0014\u0010(\u001a\u0004\u0018\u00010)X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0017\u0082\u0001\u000245¨\u00066"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/core/model/StripeModel;", "clientSecret", "", "getClientSecret", "()Ljava/lang/String;", AnalyticsRequestV2.PARAM_CREATED, "", "getCreated", "()J", "description", "getDescription", "id", "getId", "isConfirmed", "", "()Z", "isLiveMode", "lastErrorMessage", "getLastErrorMessage", "linkFundingSources", "", "getLinkFundingSources", "()Ljava/util/List;", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "nextActionType", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "getPaymentMethodId", "paymentMethodTypes", "getPaymentMethodTypes", "status", "Lcom/stripe/android/model/StripeIntent$Status;", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "unactivatedPaymentMethods", "getUnactivatedPaymentMethods", "requiresAction", "requiresConfirmation", "NextActionData", "NextActionType", "Status", "Usage", "Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/model/SetupIntent;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface StripeIntent extends StripeModel {

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/core/model/StripeModel;", "()V", "AlipayRedirect", "BlikAuthorize", "CashAppRedirect", "DisplayOxxoDetails", "RedirectToUrl", "SdkData", "UpiAwaitNotification", "VerifyWithMicrodeposits", "WeChatPayRedirect", "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "Lcom/stripe/android/model/StripeIntent$NextActionData$CashAppRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$UpiAwaitNotification;", "Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;", "Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class NextActionData implements StripeModel {
        public static final int $stable = 0;

        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\b\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", MessageExtension.FIELD_DATA, "", "webViewUrl", "returnUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "authCompleteUrl", "Landroid/net/Uri;", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "getAuthCompleteUrl", "()Ljava/lang/String;", "getData", "getReturnUrl", "getWebViewUrl", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class AlipayRedirect extends NextActionData {
            private final String authCompleteUrl;
            private final String data;
            private final String returnUrl;
            private final Uri webViewUrl;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<AlipayRedirect> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect$Companion;", "", "()V", "extractReturnUrl", "", MessageExtension.FIELD_DATA, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String extractReturnUrl(String str) {
                    Object m116783constructorimpl;
                    String it;
                    String str2 = null;
                    try {
                        Result.Companion companion = Result.Companion;
                        it = Uri.parse("alipay://url?" + str).getQueryParameter("return_url");
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                    }
                    if (it != null) {
                        StripeUrlUtils stripeUrlUtils = StripeUrlUtils.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        if (stripeUrlUtils.isStripeUrl$payments_core_release(it)) {
                            m116783constructorimpl = Result.m116783constructorimpl(it);
                            if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
                                str2 = m116783constructorimpl;
                            }
                            return str2;
                        }
                    }
                    it = null;
                    m116783constructorimpl = Result.m116783constructorimpl(it);
                    if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
                    }
                    return str2;
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<AlipayRedirect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AlipayRedirect createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AlipayRedirect(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(AlipayRedirect.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AlipayRedirect[] newArray(int i) {
                    return new AlipayRedirect[i];
                }
            }

            public /* synthetic */ AlipayRedirect(String str, String str2, Uri uri, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, uri, (i & 8) != 0 ? null : str3);
            }

            public static /* synthetic */ AlipayRedirect copy$default(AlipayRedirect alipayRedirect, String str, String str2, Uri uri, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = alipayRedirect.data;
                }
                if ((i & 2) != 0) {
                    str2 = alipayRedirect.authCompleteUrl;
                }
                if ((i & 4) != 0) {
                    uri = alipayRedirect.webViewUrl;
                }
                if ((i & 8) != 0) {
                    str3 = alipayRedirect.returnUrl;
                }
                return alipayRedirect.copy(str, str2, uri, str3);
            }

            public final String component1() {
                return this.data;
            }

            public final String component2() {
                return this.authCompleteUrl;
            }

            public final Uri component3() {
                return this.webViewUrl;
            }

            public final String component4() {
                return this.returnUrl;
            }

            public final AlipayRedirect copy(String data, String str, Uri webViewUrl, String str2) {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(webViewUrl, "webViewUrl");
                return new AlipayRedirect(data, str, webViewUrl, str2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AlipayRedirect) {
                    AlipayRedirect alipayRedirect = (AlipayRedirect) obj;
                    return Intrinsics.areEqual(this.data, alipayRedirect.data) && Intrinsics.areEqual(this.authCompleteUrl, alipayRedirect.authCompleteUrl) && Intrinsics.areEqual(this.webViewUrl, alipayRedirect.webViewUrl) && Intrinsics.areEqual(this.returnUrl, alipayRedirect.returnUrl);
                }
                return false;
            }

            public final String getAuthCompleteUrl() {
                return this.authCompleteUrl;
            }

            public final String getData() {
                return this.data;
            }

            public final String getReturnUrl() {
                return this.returnUrl;
            }

            public final Uri getWebViewUrl() {
                return this.webViewUrl;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                int hashCode = this.data.hashCode() * 31;
                String str = this.authCompleteUrl;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.webViewUrl.hashCode()) * 31;
                String str2 = this.returnUrl;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                String str = this.data;
                String str2 = this.authCompleteUrl;
                Uri uri = this.webViewUrl;
                String str3 = this.returnUrl;
                return "AlipayRedirect(data=" + str + ", authCompleteUrl=" + str2 + ", webViewUrl=" + uri + ", returnUrl=" + str3 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.data);
                out.writeString(this.authCompleteUrl);
                out.writeParcelable(this.webViewUrl, i);
                out.writeString(this.returnUrl);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AlipayRedirect(String data, String str, Uri webViewUrl, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(webViewUrl, "webViewUrl");
                this.data = data;
                this.authCompleteUrl = str;
                this.webViewUrl = webViewUrl;
                this.returnUrl = str2;
            }

            public /* synthetic */ AlipayRedirect(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : str3);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public AlipayRedirect(String data, String webViewUrl, String str) {
                this(data, r0, r4, str);
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(webViewUrl, "webViewUrl");
                String extractReturnUrl = Companion.extractReturnUrl(data);
                Uri parse = Uri.parse(webViewUrl);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(webViewUrl)");
            }
        }

        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004HÖ\u0001¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "()V", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class BlikAuthorize extends NextActionData {
            public static final int $stable = 0;
            public static final BlikAuthorize INSTANCE = new BlikAuthorize();
            public static final Parcelable.Creator<BlikAuthorize> CREATOR = new Creator();

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<BlikAuthorize> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BlikAuthorize createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BlikAuthorize.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BlikAuthorize[] newArray(int i) {
                    return new BlikAuthorize[i];
                }
            }

            private BlikAuthorize() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                return this == obj;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return BlikAuthorize.class.hashCode();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeInt(1);
            }
        }

        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$CashAppRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "mobileAuthUrl", "", "(Ljava/lang/String;)V", "getMobileAuthUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class CashAppRedirect extends NextActionData {
            public static final int $stable = 0;
            public static final Parcelable.Creator<CashAppRedirect> CREATOR = new Creator();
            private final String mobileAuthUrl;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<CashAppRedirect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CashAppRedirect createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CashAppRedirect(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CashAppRedirect[] newArray(int i) {
                    return new CashAppRedirect[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CashAppRedirect(String mobileAuthUrl) {
                super(null);
                Intrinsics.checkNotNullParameter(mobileAuthUrl, "mobileAuthUrl");
                this.mobileAuthUrl = mobileAuthUrl;
            }

            public static /* synthetic */ CashAppRedirect copy$default(CashAppRedirect cashAppRedirect, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cashAppRedirect.mobileAuthUrl;
                }
                return cashAppRedirect.copy(str);
            }

            public final String component1() {
                return this.mobileAuthUrl;
            }

            public final CashAppRedirect copy(String mobileAuthUrl) {
                Intrinsics.checkNotNullParameter(mobileAuthUrl, "mobileAuthUrl");
                return new CashAppRedirect(mobileAuthUrl);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashAppRedirect) && Intrinsics.areEqual(this.mobileAuthUrl, ((CashAppRedirect) obj).mobileAuthUrl);
            }

            public final String getMobileAuthUrl() {
                return this.mobileAuthUrl;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return this.mobileAuthUrl.hashCode();
            }

            public String toString() {
                String str = this.mobileAuthUrl;
                return "CashAppRedirect(mobileAuthUrl=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.mobileAuthUrl);
            }
        }

        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "expiresAfter", "", "number", "", "hostedVoucherUrl", "(ILjava/lang/String;Ljava/lang/String;)V", "getExpiresAfter", "()I", "getHostedVoucherUrl", "()Ljava/lang/String;", "getNumber", "component1", "component2", "component3", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class DisplayOxxoDetails extends NextActionData {
            public static final int $stable = 0;
            public static final Parcelable.Creator<DisplayOxxoDetails> CREATOR = new Creator();
            private final int expiresAfter;
            private final String hostedVoucherUrl;
            private final String number;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<DisplayOxxoDetails> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayOxxoDetails createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayOxxoDetails(parcel.readInt(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayOxxoDetails[] newArray(int i) {
                    return new DisplayOxxoDetails[i];
                }
            }

            public DisplayOxxoDetails() {
                this(0, null, null, 7, null);
            }

            public static /* synthetic */ DisplayOxxoDetails copy$default(DisplayOxxoDetails displayOxxoDetails, int i, String str, String str2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = displayOxxoDetails.expiresAfter;
                }
                if ((i2 & 2) != 0) {
                    str = displayOxxoDetails.number;
                }
                if ((i2 & 4) != 0) {
                    str2 = displayOxxoDetails.hostedVoucherUrl;
                }
                return displayOxxoDetails.copy(i, str, str2);
            }

            public final int component1() {
                return this.expiresAfter;
            }

            public final String component2() {
                return this.number;
            }

            public final String component3() {
                return this.hostedVoucherUrl;
            }

            public final DisplayOxxoDetails copy(int i, String str, String str2) {
                return new DisplayOxxoDetails(i, str, str2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof DisplayOxxoDetails) {
                    DisplayOxxoDetails displayOxxoDetails = (DisplayOxxoDetails) obj;
                    return this.expiresAfter == displayOxxoDetails.expiresAfter && Intrinsics.areEqual(this.number, displayOxxoDetails.number) && Intrinsics.areEqual(this.hostedVoucherUrl, displayOxxoDetails.hostedVoucherUrl);
                }
                return false;
            }

            public final int getExpiresAfter() {
                return this.expiresAfter;
            }

            public final String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public final String getNumber() {
                return this.number;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                int hashCode = Integer.hashCode(this.expiresAfter) * 31;
                String str = this.number;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.hostedVoucherUrl;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                int i = this.expiresAfter;
                String str = this.number;
                String str2 = this.hostedVoucherUrl;
                return "DisplayOxxoDetails(expiresAfter=" + i + ", number=" + str + ", hostedVoucherUrl=" + str2 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeInt(this.expiresAfter);
                out.writeString(this.number);
                out.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayOxxoDetails(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
            }

            public DisplayOxxoDetails(int i, String str, String str2) {
                super(null);
                this.expiresAfter = i;
                this.number = str;
                this.hostedVoucherUrl = str2;
            }
        }

        @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "url", "Landroid/net/Uri;", "returnUrl", "", "(Landroid/net/Uri;Ljava/lang/String;)V", "getReturnUrl", "()Ljava/lang/String;", "getUrl", "()Landroid/net/Uri;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class RedirectToUrl extends NextActionData {
            public static final int $stable = 8;
            public static final Parcelable.Creator<RedirectToUrl> CREATOR = new Creator();
            private final String returnUrl;
            private final Uri url;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<RedirectToUrl> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RedirectToUrl createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RedirectToUrl((Uri) parcel.readParcelable(RedirectToUrl.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RedirectToUrl[] newArray(int i) {
                    return new RedirectToUrl[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RedirectToUrl(Uri url, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.returnUrl = str;
            }

            public static /* synthetic */ RedirectToUrl copy$default(RedirectToUrl redirectToUrl, Uri uri, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = redirectToUrl.url;
                }
                if ((i & 2) != 0) {
                    str = redirectToUrl.returnUrl;
                }
                return redirectToUrl.copy(uri, str);
            }

            public final Uri component1() {
                return this.url;
            }

            public final String component2() {
                return this.returnUrl;
            }

            public final RedirectToUrl copy(Uri url, String str) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new RedirectToUrl(url, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RedirectToUrl) {
                    RedirectToUrl redirectToUrl = (RedirectToUrl) obj;
                    return Intrinsics.areEqual(this.url, redirectToUrl.url) && Intrinsics.areEqual(this.returnUrl, redirectToUrl.returnUrl);
                }
                return false;
            }

            public final String getReturnUrl() {
                return this.returnUrl;
            }

            public final Uri getUrl() {
                return this.url;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                String str = this.returnUrl;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                Uri uri = this.url;
                String str = this.returnUrl;
                return "RedirectToUrl(url=" + uri + ", returnUrl=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeParcelable(this.url, i);
                out.writeString(this.returnUrl);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "()V", "Use3DS1", "Use3DS2", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static abstract class SdkData extends NextActionData {
            public static final int $stable = 0;

            @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Use3DS1 extends SdkData {
                public static final int $stable = 0;
                public static final Parcelable.Creator<Use3DS1> CREATOR = new Creator();
                private final String url;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* loaded from: classes7.dex */
                public static final class Creator implements Parcelable.Creator<Use3DS1> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS1 createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Use3DS1(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS1[] newArray(int i) {
                        return new Use3DS1[i];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Use3DS1(String url) {
                    super(null);
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.url = url;
                }

                public static /* synthetic */ Use3DS1 copy$default(Use3DS1 use3DS1, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = use3DS1.url;
                    }
                    return use3DS1.copy(str);
                }

                public final String component1() {
                    return this.url;
                }

                public final Use3DS1 copy(String url) {
                    Intrinsics.checkNotNullParameter(url, "url");
                    return new Use3DS1(url);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // com.stripe.android.core.model.StripeModel
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Use3DS1) && Intrinsics.areEqual(this.url, ((Use3DS1) obj).url);
                }

                public final String getUrl() {
                    return this.url;
                }

                @Override // com.stripe.android.core.model.StripeModel
                public int hashCode() {
                    return this.url.hashCode();
                }

                public String toString() {
                    String str = this.url;
                    return "Use3DS1(url=" + str + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i) {
                    Intrinsics.checkNotNullParameter(out, "out");
                    out.writeString(this.url);
                }
            }

            @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006("}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "serverName", "transactionId", "serverEncryption", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "threeDS2IntentId", "publishableKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;Ljava/lang/String;Ljava/lang/String;)V", "getPublishableKey", "()Ljava/lang/String;", "getServerEncryption", "()Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "getServerName", "getSource", "getThreeDS2IntentId", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "DirectoryServerEncryption", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Use3DS2 extends SdkData {
                public static final int $stable = 8;
                public static final Parcelable.Creator<Use3DS2> CREATOR = new Creator();
                private final String publishableKey;
                private final DirectoryServerEncryption serverEncryption;
                private final String serverName;
                private final String source;
                private final String threeDS2IntentId;
                private final String transactionId;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* loaded from: classes7.dex */
                public static final class Creator implements Parcelable.Creator<Use3DS2> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS2 createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Use3DS2(parcel.readString(), parcel.readString(), parcel.readString(), DirectoryServerEncryption.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS2[] newArray(int i) {
                        return new Use3DS2[i];
                    }
                }

                @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "Landroid/os/Parcelable;", "directoryServerId", "", "dsCertificateData", "rootCertsData", "", "keyId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDirectoryServerId", "()Ljava/lang/String;", "getDsCertificateData", "getKeyId", "getRootCertsData", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* loaded from: classes7.dex */
                public static final class DirectoryServerEncryption implements Parcelable {
                    public static final int $stable = 8;
                    public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new Creator();
                    private final String directoryServerId;
                    private final String dsCertificateData;
                    private final String keyId;
                    private final List<String> rootCertsData;

                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                    /* loaded from: classes7.dex */
                    public static final class Creator implements Parcelable.Creator<DirectoryServerEncryption> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final DirectoryServerEncryption createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new DirectoryServerEncryption(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final DirectoryServerEncryption[] newArray(int i) {
                            return new DirectoryServerEncryption[i];
                        }
                    }

                    public DirectoryServerEncryption(String directoryServerId, String dsCertificateData, List<String> rootCertsData, String str) {
                        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
                        Intrinsics.checkNotNullParameter(dsCertificateData, "dsCertificateData");
                        Intrinsics.checkNotNullParameter(rootCertsData, "rootCertsData");
                        this.directoryServerId = directoryServerId;
                        this.dsCertificateData = dsCertificateData;
                        this.rootCertsData = rootCertsData;
                        this.keyId = str;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ DirectoryServerEncryption copy$default(DirectoryServerEncryption directoryServerEncryption, String str, String str2, List list, String str3, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = directoryServerEncryption.directoryServerId;
                        }
                        if ((i & 2) != 0) {
                            str2 = directoryServerEncryption.dsCertificateData;
                        }
                        if ((i & 4) != 0) {
                            list = directoryServerEncryption.rootCertsData;
                        }
                        if ((i & 8) != 0) {
                            str3 = directoryServerEncryption.keyId;
                        }
                        return directoryServerEncryption.copy(str, str2, list, str3);
                    }

                    public final String component1() {
                        return this.directoryServerId;
                    }

                    public final String component2() {
                        return this.dsCertificateData;
                    }

                    public final List<String> component3() {
                        return this.rootCertsData;
                    }

                    public final String component4() {
                        return this.keyId;
                    }

                    public final DirectoryServerEncryption copy(String directoryServerId, String dsCertificateData, List<String> rootCertsData, String str) {
                        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
                        Intrinsics.checkNotNullParameter(dsCertificateData, "dsCertificateData");
                        Intrinsics.checkNotNullParameter(rootCertsData, "rootCertsData");
                        return new DirectoryServerEncryption(directoryServerId, dsCertificateData, rootCertsData, str);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj instanceof DirectoryServerEncryption) {
                            DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) obj;
                            return Intrinsics.areEqual(this.directoryServerId, directoryServerEncryption.directoryServerId) && Intrinsics.areEqual(this.dsCertificateData, directoryServerEncryption.dsCertificateData) && Intrinsics.areEqual(this.rootCertsData, directoryServerEncryption.rootCertsData) && Intrinsics.areEqual(this.keyId, directoryServerEncryption.keyId);
                        }
                        return false;
                    }

                    public final String getDirectoryServerId() {
                        return this.directoryServerId;
                    }

                    public final String getDsCertificateData() {
                        return this.dsCertificateData;
                    }

                    public final String getKeyId() {
                        return this.keyId;
                    }

                    public final List<String> getRootCertsData() {
                        return this.rootCertsData;
                    }

                    public int hashCode() {
                        int hashCode = ((((this.directoryServerId.hashCode() * 31) + this.dsCertificateData.hashCode()) * 31) + this.rootCertsData.hashCode()) * 31;
                        String str = this.keyId;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        String str = this.directoryServerId;
                        String str2 = this.dsCertificateData;
                        List<String> list = this.rootCertsData;
                        String str3 = this.keyId;
                        return "DirectoryServerEncryption(directoryServerId=" + str + ", dsCertificateData=" + str2 + ", rootCertsData=" + list + ", keyId=" + str3 + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i) {
                        Intrinsics.checkNotNullParameter(out, "out");
                        out.writeString(this.directoryServerId);
                        out.writeString(this.dsCertificateData);
                        out.writeStringList(this.rootCertsData);
                        out.writeString(this.keyId);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Use3DS2(String source, String serverName, String transactionId, DirectoryServerEncryption serverEncryption, String str, String str2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(serverName, "serverName");
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    Intrinsics.checkNotNullParameter(serverEncryption, "serverEncryption");
                    this.source = source;
                    this.serverName = serverName;
                    this.transactionId = transactionId;
                    this.serverEncryption = serverEncryption;
                    this.threeDS2IntentId = str;
                    this.publishableKey = str2;
                }

                public static /* synthetic */ Use3DS2 copy$default(Use3DS2 use3DS2, String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption, String str4, String str5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = use3DS2.source;
                    }
                    if ((i & 2) != 0) {
                        str2 = use3DS2.serverName;
                    }
                    String str6 = str2;
                    if ((i & 4) != 0) {
                        str3 = use3DS2.transactionId;
                    }
                    String str7 = str3;
                    if ((i & 8) != 0) {
                        directoryServerEncryption = use3DS2.serverEncryption;
                    }
                    DirectoryServerEncryption directoryServerEncryption2 = directoryServerEncryption;
                    if ((i & 16) != 0) {
                        str4 = use3DS2.threeDS2IntentId;
                    }
                    String str8 = str4;
                    if ((i & 32) != 0) {
                        str5 = use3DS2.publishableKey;
                    }
                    return use3DS2.copy(str, str6, str7, directoryServerEncryption2, str8, str5);
                }

                public final String component1() {
                    return this.source;
                }

                public final String component2() {
                    return this.serverName;
                }

                public final String component3() {
                    return this.transactionId;
                }

                public final DirectoryServerEncryption component4() {
                    return this.serverEncryption;
                }

                public final String component5() {
                    return this.threeDS2IntentId;
                }

                public final String component6() {
                    return this.publishableKey;
                }

                public final Use3DS2 copy(String source, String serverName, String transactionId, DirectoryServerEncryption serverEncryption, String str, String str2) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(serverName, "serverName");
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    Intrinsics.checkNotNullParameter(serverEncryption, "serverEncryption");
                    return new Use3DS2(source, serverName, transactionId, serverEncryption, str, str2);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // com.stripe.android.core.model.StripeModel
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof Use3DS2) {
                        Use3DS2 use3DS2 = (Use3DS2) obj;
                        return Intrinsics.areEqual(this.source, use3DS2.source) && Intrinsics.areEqual(this.serverName, use3DS2.serverName) && Intrinsics.areEqual(this.transactionId, use3DS2.transactionId) && Intrinsics.areEqual(this.serverEncryption, use3DS2.serverEncryption) && Intrinsics.areEqual(this.threeDS2IntentId, use3DS2.threeDS2IntentId) && Intrinsics.areEqual(this.publishableKey, use3DS2.publishableKey);
                    }
                    return false;
                }

                public final String getPublishableKey() {
                    return this.publishableKey;
                }

                public final DirectoryServerEncryption getServerEncryption() {
                    return this.serverEncryption;
                }

                public final String getServerName() {
                    return this.serverName;
                }

                public final String getSource() {
                    return this.source;
                }

                public final String getThreeDS2IntentId() {
                    return this.threeDS2IntentId;
                }

                public final String getTransactionId() {
                    return this.transactionId;
                }

                @Override // com.stripe.android.core.model.StripeModel
                public int hashCode() {
                    int hashCode = ((((((this.source.hashCode() * 31) + this.serverName.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.serverEncryption.hashCode()) * 31;
                    String str = this.threeDS2IntentId;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.publishableKey;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    String str = this.source;
                    String str2 = this.serverName;
                    String str3 = this.transactionId;
                    DirectoryServerEncryption directoryServerEncryption = this.serverEncryption;
                    String str4 = this.threeDS2IntentId;
                    String str5 = this.publishableKey;
                    return "Use3DS2(source=" + str + ", serverName=" + str2 + ", transactionId=" + str3 + ", serverEncryption=" + directoryServerEncryption + ", threeDS2IntentId=" + str4 + ", publishableKey=" + str5 + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i) {
                    Intrinsics.checkNotNullParameter(out, "out");
                    out.writeString(this.source);
                    out.writeString(this.serverName);
                    out.writeString(this.transactionId);
                    this.serverEncryption.writeToParcel(out, i);
                    out.writeString(this.threeDS2IntentId);
                    out.writeString(this.publishableKey);
                }
            }

            public /* synthetic */ SdkData(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private SdkData() {
                super(null);
            }
        }

        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004HÖ\u0001¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$UpiAwaitNotification;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "()V", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class UpiAwaitNotification extends NextActionData {
            public static final int $stable = 0;
            public static final UpiAwaitNotification INSTANCE = new UpiAwaitNotification();
            public static final Parcelable.Creator<UpiAwaitNotification> CREATOR = new Creator();

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<UpiAwaitNotification> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpiAwaitNotification createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UpiAwaitNotification.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpiAwaitNotification[] newArray(int i) {
                    return new UpiAwaitNotification[i];
                }
            }

            private UpiAwaitNotification() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                return this == obj;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return UpiAwaitNotification.class.hashCode();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeInt(1);
            }
        }

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "arrivalDate", "", "hostedVerificationUrl", "", "microdepositType", "Lcom/stripe/android/model/MicrodepositType;", "(JLjava/lang/String;Lcom/stripe/android/model/MicrodepositType;)V", "getArrivalDate", "()J", "getHostedVerificationUrl", "()Ljava/lang/String;", "getMicrodepositType", "()Lcom/stripe/android/model/MicrodepositType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class VerifyWithMicrodeposits extends NextActionData {
            public static final int $stable = 0;
            public static final Parcelable.Creator<VerifyWithMicrodeposits> CREATOR = new Creator();
            private final long arrivalDate;
            private final String hostedVerificationUrl;
            private final MicrodepositType microdepositType;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<VerifyWithMicrodeposits> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VerifyWithMicrodeposits createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new VerifyWithMicrodeposits(parcel.readLong(), parcel.readString(), MicrodepositType.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VerifyWithMicrodeposits[] newArray(int i) {
                    return new VerifyWithMicrodeposits[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyWithMicrodeposits(long j, String hostedVerificationUrl, MicrodepositType microdepositType) {
                super(null);
                Intrinsics.checkNotNullParameter(hostedVerificationUrl, "hostedVerificationUrl");
                Intrinsics.checkNotNullParameter(microdepositType, "microdepositType");
                this.arrivalDate = j;
                this.hostedVerificationUrl = hostedVerificationUrl;
                this.microdepositType = microdepositType;
            }

            public static /* synthetic */ VerifyWithMicrodeposits copy$default(VerifyWithMicrodeposits verifyWithMicrodeposits, long j, String str, MicrodepositType microdepositType, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = verifyWithMicrodeposits.arrivalDate;
                }
                if ((i & 2) != 0) {
                    str = verifyWithMicrodeposits.hostedVerificationUrl;
                }
                if ((i & 4) != 0) {
                    microdepositType = verifyWithMicrodeposits.microdepositType;
                }
                return verifyWithMicrodeposits.copy(j, str, microdepositType);
            }

            public final long component1() {
                return this.arrivalDate;
            }

            public final String component2() {
                return this.hostedVerificationUrl;
            }

            public final MicrodepositType component3() {
                return this.microdepositType;
            }

            public final VerifyWithMicrodeposits copy(long j, String hostedVerificationUrl, MicrodepositType microdepositType) {
                Intrinsics.checkNotNullParameter(hostedVerificationUrl, "hostedVerificationUrl");
                Intrinsics.checkNotNullParameter(microdepositType, "microdepositType");
                return new VerifyWithMicrodeposits(j, hostedVerificationUrl, microdepositType);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof VerifyWithMicrodeposits) {
                    VerifyWithMicrodeposits verifyWithMicrodeposits = (VerifyWithMicrodeposits) obj;
                    return this.arrivalDate == verifyWithMicrodeposits.arrivalDate && Intrinsics.areEqual(this.hostedVerificationUrl, verifyWithMicrodeposits.hostedVerificationUrl) && this.microdepositType == verifyWithMicrodeposits.microdepositType;
                }
                return false;
            }

            public final long getArrivalDate() {
                return this.arrivalDate;
            }

            public final String getHostedVerificationUrl() {
                return this.hostedVerificationUrl;
            }

            public final MicrodepositType getMicrodepositType() {
                return this.microdepositType;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return (((Long.hashCode(this.arrivalDate) * 31) + this.hostedVerificationUrl.hashCode()) * 31) + this.microdepositType.hashCode();
            }

            public String toString() {
                long j = this.arrivalDate;
                String str = this.hostedVerificationUrl;
                MicrodepositType microdepositType = this.microdepositType;
                return "VerifyWithMicrodeposits(arrivalDate=" + j + ", hostedVerificationUrl=" + str + ", microdepositType=" + microdepositType + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeLong(this.arrivalDate);
                out.writeString(this.hostedVerificationUrl);
                out.writeString(this.microdepositType.name());
            }
        }

        @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "weChat", "Lcom/stripe/android/model/WeChat;", "(Lcom/stripe/android/model/WeChat;)V", "getWeChat", "()Lcom/stripe/android/model/WeChat;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class WeChatPayRedirect extends NextActionData {
            public static final int $stable = 0;
            public static final Parcelable.Creator<WeChatPayRedirect> CREATOR = new Creator();
            private final WeChat weChat;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<WeChatPayRedirect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final WeChatPayRedirect createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new WeChatPayRedirect(WeChat.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final WeChatPayRedirect[] newArray(int i) {
                    return new WeChatPayRedirect[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WeChatPayRedirect(WeChat weChat) {
                super(null);
                Intrinsics.checkNotNullParameter(weChat, "weChat");
                this.weChat = weChat;
            }

            public static /* synthetic */ WeChatPayRedirect copy$default(WeChatPayRedirect weChatPayRedirect, WeChat weChat, int i, Object obj) {
                if ((i & 1) != 0) {
                    weChat = weChatPayRedirect.weChat;
                }
                return weChatPayRedirect.copy(weChat);
            }

            public final WeChat component1() {
                return this.weChat;
            }

            public final WeChatPayRedirect copy(WeChat weChat) {
                Intrinsics.checkNotNullParameter(weChat, "weChat");
                return new WeChatPayRedirect(weChat);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WeChatPayRedirect) && Intrinsics.areEqual(this.weChat, ((WeChatPayRedirect) obj).weChat);
            }

            public final WeChat getWeChat() {
                return this.weChat;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return this.weChat.hashCode();
            }

            public String toString() {
                WeChat weChat = this.weChat;
                return "WeChatPayRedirect(weChat=" + weChat + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                this.weChat.writeToParcel(out, i);
            }
        }

        public /* synthetic */ NextActionData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private NextActionData() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionType;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "RedirectToUrl", "UseStripeSdk", "DisplayOxxoDetails", "AlipayRedirect", "BlikAuthorize", "WeChatPayRedirect", "VerifyWithMicrodeposits", "UpiAwaitNotification", "CashAppRedirect", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum NextActionType {
        RedirectToUrl("redirect_to_url"),
        UseStripeSdk("use_stripe_sdk"),
        DisplayOxxoDetails("oxxo_display_details"),
        AlipayRedirect("alipay_handle_redirect"),
        BlikAuthorize("blik_authorize"),
        WeChatPayRedirect("wechat_pay_redirect_to_android_app"),
        VerifyWithMicrodeposits("verify_with_microdeposits"),
        UpiAwaitNotification("upi_await_notification"),
        CashAppRedirect("cashapp_handle_redirect_or_display_qr_code");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/StripeIntent$NextActionType;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "fromCode$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nStripeIntent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeIntent.kt\ncom/stripe/android/model/StripeIntent$NextActionType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,305:1\n1282#2,2:306\n*S KotlinDebug\n*F\n+ 1 StripeIntent.kt\ncom/stripe/android/model/StripeIntent$NextActionType$Companion\n*L\n96#1:306,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final NextActionType fromCode$payments_core_release(String str) {
                NextActionType[] values;
                for (NextActionType nextActionType : NextActionType.values()) {
                    if (Intrinsics.areEqual(nextActionType.getCode(), str)) {
                        return nextActionType;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        NextActionType(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$Status;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "Canceled", "Processing", "RequiresAction", "RequiresConfirmation", "RequiresPaymentMethod", "Succeeded", "RequiresCapture", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Status {
        Canceled("canceled"),
        Processing(BaseSheetViewModel.SAVE_PROCESSING),
        RequiresAction("requires_action"),
        RequiresConfirmation("requires_confirmation"),
        RequiresPaymentMethod("requires_payment_method"),
        Succeeded("succeeded"),
        RequiresCapture("requires_capture");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$Status$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/StripeIntent$Status;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "fromCode$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nStripeIntent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeIntent.kt\ncom/stripe/android/model/StripeIntent$Status$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,305:1\n1282#2,2:306\n*S KotlinDebug\n*F\n+ 1 StripeIntent.kt\ncom/stripe/android/model/StripeIntent$Status$Companion\n*L\n123#1:306,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status fromCode$payments_core_release(String str) {
                Status[] values;
                for (Status status : Status.values()) {
                    if (Intrinsics.areEqual(status.getCode(), str)) {
                        return status;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        Status(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$Usage;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "OnSession", "OffSession", "OneTime", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Usage {
        OnSession("on_session"),
        OffSession("off_session"),
        OneTime("one_time");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent$Usage$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/StripeIntent$Usage;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "fromCode$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nStripeIntent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeIntent.kt\ncom/stripe/android/model/StripeIntent$Usage$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,305:1\n1282#2,2:306\n*S KotlinDebug\n*F\n+ 1 StripeIntent.kt\ncom/stripe/android/model/StripeIntent$Usage$Companion\n*L\n152#1:306,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Usage fromCode$payments_core_release(String str) {
                Usage[] values;
                for (Usage usage : Usage.values()) {
                    if (Intrinsics.areEqual(usage.getCode(), str)) {
                        return usage;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        Usage(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    String getClientSecret();

    long getCreated();

    String getDescription();

    String getId();

    String getLastErrorMessage();

    List<String> getLinkFundingSources();

    NextActionData getNextActionData();

    NextActionType getNextActionType();

    PaymentMethod getPaymentMethod();

    String getPaymentMethodId();

    List<String> getPaymentMethodTypes();

    Status getStatus();

    List<String> getUnactivatedPaymentMethods();

    boolean isConfirmed();

    boolean isLiveMode();

    boolean requiresAction();

    boolean requiresConfirmation();
}
