package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.adyen.checkout.components.model.payments.response.Action;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001;BU\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b%J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b'J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\tHÂ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003JY\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u00101\u001a\u00020.HÖ\u0001J\b\u00102\u001a\u00020\tH\u0016J\u0014\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0010\u00105\u001a\u00020\u00002\u0006\u00102\u001a\u00020\tH\u0016J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020.HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000fR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m28432d2 = {"Lcom/stripe/android/model/ConfirmSetupIntentParams;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "clientSecret", "", "paymentMethodId", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "returnUrl", "useStripeSdk", "", "mandateId", "mandateData", "Lcom/stripe/android/model/MandateDataParams;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/MandateDataParams;)V", "getClientSecret", "()Ljava/lang/String;", "getMandateData", "()Lcom/stripe/android/model/MandateDataParams;", "setMandateData", "(Lcom/stripe/android/model/MandateDataParams;)V", "mandateDataParams", "", "", "getMandateDataParams", "()Ljava/util/Map;", "getMandateId", "setMandateId", "(Ljava/lang/String;)V", "getPaymentMethodCreateParams$payments_core_release", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodId$payments_core_release", "paymentMethodParamMap", "getPaymentMethodParamMap", "getReturnUrl", "setReturnUrl", "component1", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "shouldUseStripeSdk", "toParamMap", "toString", "withShouldUseStripeSdk", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConfirmSetupIntentParams implements ConfirmStripeIntentParams {
    private final String clientSecret;
    private MandateDataParams mandateData;
    private String mandateId;
    private final PaymentMethodCreateParams paymentMethodCreateParams;
    private final String paymentMethodId;
    private String returnUrl;
    private final boolean useStripeSdk;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConfirmSetupIntentParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;", "", "()V", "create", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "clientSecret", "", "mandateData", "Lcom/stripe/android/model/MandateDataParams;", "mandateId", Action.PAYMENT_METHOD_TYPE, "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodId", "createWithoutPaymentMethod", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nConfirmSetupIntentParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmSetupIntentParams.kt\ncom/stripe/android/model/ConfirmSetupIntentParams$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ConfirmSetupIntentParams create$default(Companion companion, String str, String str2, MandateDataParams mandateDataParams, String str3, int i, Object obj) {
            if ((i & 4) != 0) {
                mandateDataParams = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.create(str, str2, mandateDataParams, str3);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return create$default(this, paymentMethodCreateParams, clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
        }

        @JvmStatic
        public final ConfirmSetupIntentParams createWithoutPaymentMethod(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmSetupIntentParams(clientSecret, null, null, null, false, null, null, 126, null);
        }

        private Companion() {
        }

        public static /* synthetic */ ConfirmSetupIntentParams create$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                mandateDataParams = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return companion.create(paymentMethodCreateParams, str, mandateDataParams, str2);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, MandateDataParams mandateDataParams) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return create$default(this, paymentMethodCreateParams, clientSecret, mandateDataParams, (String) null, 8, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmSetupIntentParams create(String paymentMethodId, String clientSecret) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return create$default(this, paymentMethodId, clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmSetupIntentParams create(String paymentMethodId, String clientSecret, MandateDataParams mandateDataParams) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return create$default(this, paymentMethodId, clientSecret, mandateDataParams, (String) null, 8, (Object) null);
        }

        @JvmStatic
        public final ConfirmSetupIntentParams create(String clientSecret, PaymentMethod.Type paymentMethodType) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            return new ConfirmSetupIntentParams(clientSecret, null, null, null, false, null, paymentMethodType.requiresMandate ? new MandateDataParams(MandateDataParams.Type.Online.Companion.getDEFAULT()) : null, 62, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmSetupIntentParams create(String paymentMethodId, String clientSecret, MandateDataParams mandateDataParams, String str) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmSetupIntentParams(clientSecret, paymentMethodId, null, null, false, str, mandateDataParams, 28, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, MandateDataParams mandateDataParams, String str) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmSetupIntentParams(clientSecret, null, paymentMethodCreateParams, null, false, str, mandateDataParams, 26, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ConfirmSetupIntentParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmSetupIntentParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfirmSetupIntentParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethodCreateParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? MandateDataParams.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmSetupIntentParams[] newArray(int i) {
            return new ConfirmSetupIntentParams[i];
        }
    }

    public ConfirmSetupIntentParams(String clientSecret, String str, PaymentMethodCreateParams paymentMethodCreateParams, String str2, boolean z, String str3, MandateDataParams mandateDataParams) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.paymentMethodId = str;
        this.paymentMethodCreateParams = paymentMethodCreateParams;
        this.returnUrl = str2;
        this.useStripeSdk = z;
        this.mandateId = str3;
        this.mandateData = mandateDataParams;
    }

    private final boolean component5() {
        return this.useStripeSdk;
    }

    public static /* synthetic */ ConfirmSetupIntentParams copy$default(ConfirmSetupIntentParams confirmSetupIntentParams, String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, boolean z, String str4, MandateDataParams mandateDataParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmSetupIntentParams.getClientSecret();
        }
        if ((i & 2) != 0) {
            str2 = confirmSetupIntentParams.paymentMethodId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            paymentMethodCreateParams = confirmSetupIntentParams.paymentMethodCreateParams;
        }
        PaymentMethodCreateParams paymentMethodCreateParams2 = paymentMethodCreateParams;
        if ((i & 8) != 0) {
            str3 = confirmSetupIntentParams.getReturnUrl();
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = confirmSetupIntentParams.useStripeSdk;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str4 = confirmSetupIntentParams.mandateId;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            mandateDataParams = confirmSetupIntentParams.mandateData;
        }
        return confirmSetupIntentParams.copy(str, str5, paymentMethodCreateParams2, str6, z2, str7, mandateDataParams);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str) {
        return Companion.create(paymentMethodCreateParams, str);
    }

    @JvmStatic
    public static final ConfirmSetupIntentParams createWithoutPaymentMethod(String str) {
        return Companion.createWithoutPaymentMethod(str);
    }

    private final Map<String, Object> getMandateDataParams() {
        Map<String, Object> paramMap;
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams == null || (paramMap = mandateDataParams.toParamMap()) == null) {
            PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
            boolean z = false;
            if (paymentMethodCreateParams != null && paymentMethodCreateParams.getRequiresMandate$payments_core_release()) {
                z = true;
            }
            if (z && this.mandateId == null) {
                return new MandateDataParams(MandateDataParams.Type.Online.Companion.getDEFAULT()).toParamMap();
            }
            return null;
        }
        return paramMap;
    }

    private final Map<String, Object> getPaymentMethodParamMap() {
        Map<String, Object> emptyMap;
        Map<String, Object> mapOf;
        Map<String, Object> mapOf2;
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null) {
            mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("payment_method_data", paymentMethodCreateParams.toParamMap()));
            return mapOf2;
        }
        String str = this.paymentMethodId;
        if (str != null) {
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("payment_method", str));
            return mapOf;
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        return emptyMap;
    }

    public final String component1() {
        return getClientSecret();
    }

    public final String component2$payments_core_release() {
        return this.paymentMethodId;
    }

    public final PaymentMethodCreateParams component3$payments_core_release() {
        return this.paymentMethodCreateParams;
    }

    public final String component4() {
        return getReturnUrl();
    }

    public final String component6() {
        return this.mandateId;
    }

    public final MandateDataParams component7() {
        return this.mandateData;
    }

    public final ConfirmSetupIntentParams copy(String clientSecret, String str, PaymentMethodCreateParams paymentMethodCreateParams, String str2, boolean z, String str3, MandateDataParams mandateDataParams) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return new ConfirmSetupIntentParams(clientSecret, str, paymentMethodCreateParams, str2, z, str3, mandateDataParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfirmSetupIntentParams) {
            ConfirmSetupIntentParams confirmSetupIntentParams = (ConfirmSetupIntentParams) obj;
            return Intrinsics.areEqual(getClientSecret(), confirmSetupIntentParams.getClientSecret()) && Intrinsics.areEqual(this.paymentMethodId, confirmSetupIntentParams.paymentMethodId) && Intrinsics.areEqual(this.paymentMethodCreateParams, confirmSetupIntentParams.paymentMethodCreateParams) && Intrinsics.areEqual(getReturnUrl(), confirmSetupIntentParams.getReturnUrl()) && this.useStripeSdk == confirmSetupIntentParams.useStripeSdk && Intrinsics.areEqual(this.mandateId, confirmSetupIntentParams.mandateId) && Intrinsics.areEqual(this.mandateData, confirmSetupIntentParams.mandateData);
        }
        return false;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public /* synthetic */ String getClientSecret() {
        return this.clientSecret;
    }

    public final MandateDataParams getMandateData() {
        return this.mandateData;
    }

    public final String getMandateId() {
        return this.mandateId;
    }

    public final /* synthetic */ PaymentMethodCreateParams getPaymentMethodCreateParams$payments_core_release() {
        return this.paymentMethodCreateParams;
    }

    public final /* synthetic */ String getPaymentMethodId$payments_core_release() {
        return this.paymentMethodId;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public String getReturnUrl() {
        return this.returnUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = getClientSecret().hashCode() * 31;
        String str = this.paymentMethodId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        int hashCode3 = (((hashCode2 + (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode())) * 31) + (getReturnUrl() == null ? 0 : getReturnUrl().hashCode())) * 31;
        boolean z = this.useStripeSdk;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        String str2 = this.mandateId;
        int hashCode4 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MandateDataParams mandateDataParams = this.mandateData;
        return hashCode4 + (mandateDataParams != null ? mandateDataParams.hashCode() : 0);
    }

    public final void setMandateData(MandateDataParams mandateDataParams) {
        this.mandateData = mandateDataParams;
    }

    public final void setMandateId(String str) {
        this.mandateId = str;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public boolean shouldUseStripeSdk() {
        return this.useStripeSdk;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapOf;
        Map map;
        Map plus;
        Map map2;
        Map plus2;
        Map plus3;
        Map<String, Object> plus4;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("client_secret", getClientSecret()), TuplesKt.m28425to("use_stripe_sdk", Boolean.valueOf(this.useStripeSdk)));
        String returnUrl = getReturnUrl();
        Map map3 = null;
        if (returnUrl != null) {
            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("return_url", returnUrl));
        } else {
            map = null;
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        plus = MapsKt__MapsKt.plus(mapOf, map);
        String str = this.mandateId;
        if (str != null) {
            map2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("mandate", str));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = MapsKt__MapsKt.emptyMap();
        }
        plus2 = MapsKt__MapsKt.plus(plus, map2);
        Map<String, Object> mandateDataParams = getMandateDataParams();
        if (mandateDataParams != null) {
            map3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("mandate_data", mandateDataParams));
        }
        if (map3 == null) {
            map3 = MapsKt__MapsKt.emptyMap();
        }
        plus3 = MapsKt__MapsKt.plus(plus2, map3);
        plus4 = MapsKt__MapsKt.plus(plus3, getPaymentMethodParamMap());
        return plus4;
    }

    public String toString() {
        String clientSecret = getClientSecret();
        String str = this.paymentMethodId;
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        String returnUrl = getReturnUrl();
        boolean z = this.useStripeSdk;
        String str2 = this.mandateId;
        MandateDataParams mandateDataParams = this.mandateData;
        return "ConfirmSetupIntentParams(clientSecret=" + clientSecret + ", paymentMethodId=" + str + ", paymentMethodCreateParams=" + paymentMethodCreateParams + ", returnUrl=" + returnUrl + ", useStripeSdk=" + z + ", mandateId=" + str2 + ", mandateData=" + mandateDataParams + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.clientSecret);
        out.writeString(this.paymentMethodId);
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            paymentMethodCreateParams.writeToParcel(out, i);
        }
        out.writeString(this.returnUrl);
        out.writeInt(this.useStripeSdk ? 1 : 0);
        out.writeString(this.mandateId);
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        mandateDataParams.writeToParcel(out, i);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams) {
        return Companion.create(paymentMethodCreateParams, str, mandateDataParams);
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public ConfirmSetupIntentParams withShouldUseStripeSdk(boolean z) {
        return copy$default(this, null, null, null, null, z, null, null, 111, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams, String str2) {
        return Companion.create(paymentMethodCreateParams, str, mandateDataParams, str2);
    }

    @JvmStatic
    public static final ConfirmSetupIntentParams create(String str, PaymentMethod.Type type) {
        return Companion.create(str, type);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmSetupIntentParams create(String str, String str2) {
        return Companion.create(str, str2);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmSetupIntentParams create(String str, String str2, MandateDataParams mandateDataParams) {
        return Companion.create(str, str2, mandateDataParams);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmSetupIntentParams create(String str, String str2, MandateDataParams mandateDataParams, String str3) {
        return Companion.create(str, str2, mandateDataParams, str3);
    }

    public /* synthetic */ ConfirmSetupIntentParams(String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, boolean z, String str4, MandateDataParams mandateDataParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : paymentMethodCreateParams, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? mandateDataParams : null);
    }
}
