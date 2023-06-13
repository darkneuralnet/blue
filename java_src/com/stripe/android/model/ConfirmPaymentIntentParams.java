package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.adyen.checkout.components.model.payments.response.Action;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0003cdeB©\u0001\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0018J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00105J\t\u0010P\u001a\u00020\fHÂ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000fHÆ\u0003J²\u0001\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010SJ\t\u0010T\u001a\u00020UHÖ\u0001J\u0013\u0010V\u001a\u00020\f2\b\u0010W\u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010X\u001a\u00020UHÖ\u0001J\u0006\u0010Y\u001a\u00020\fJ\b\u0010Z\u001a\u00020\fH\u0016J\u0014\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0 H\u0016J\t\u0010\\\u001a\u00020\u0005HÖ\u0001J\u0010\u0010]\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\fH\u0016J\u0019\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020UHÖ\u0001R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010#R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010&R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006f"}, m28432d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodId", "", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "sourceId", "clientSecret", "returnUrl", "savePaymentMethod", "", "useStripeSdk", "paymentMethodOptions", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "mandateId", "mandateData", "Lcom/stripe/android/model/MandateDataParams;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", ConfirmPaymentIntentParams.PARAM_SHIPPING, "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "receiptEmail", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "getMandateData", "()Lcom/stripe/android/model/MandateDataParams;", "setMandateData", "(Lcom/stripe/android/model/MandateDataParams;)V", "mandateDataParams", "", "", "getMandateDataParams", "()Ljava/util/Map;", "getMandateId", "setMandateId", "(Ljava/lang/String;)V", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodId", "getPaymentMethodOptions", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "setPaymentMethodOptions", "(Lcom/stripe/android/model/PaymentMethodOptionsParams;)V", "paymentMethodParamMap", "getPaymentMethodParamMap", "getReceiptEmail", "setReceiptEmail", "getReturnUrl", "setReturnUrl", "getSavePaymentMethod", "()Ljava/lang/Boolean;", "setSavePaymentMethod", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSetupFutureUsage", "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "setSetupFutureUsage", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V", "getShipping", "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "setShipping", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)V", "getSourceId", "getSourceParams", "()Lcom/stripe/android/model/SourceParams;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Ljava/lang/String;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "shouldSavePaymentMethod", "shouldUseStripeSdk", "toParamMap", "toString", "withShouldUseStripeSdk", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "SetupFutureUsage", "Shipping", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nConfirmPaymentIntentParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmPaymentIntentParams.kt\ncom/stripe/android/model/ConfirmPaymentIntentParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n1#2:547\n*E\n"})
/* loaded from: classes7.dex */
public final class ConfirmPaymentIntentParams implements ConfirmStripeIntentParams {
    private static final String PARAM_PAYMENT_METHOD_OPTIONS = "payment_method_options";
    private static final String PARAM_RECEIPT_EMAIL = "receipt_email";
    private static final String PARAM_SAVE_PAYMENT_METHOD = "save_payment_method";
    private static final String PARAM_SETUP_FUTURE_USAGE = "setup_future_usage";
    private static final String PARAM_SHIPPING = "shipping";
    public static final String PARAM_SOURCE_DATA = "source_data";
    private static final String PARAM_SOURCE_ID = "source";
    private final String clientSecret;
    private MandateDataParams mandateData;
    private String mandateId;
    private final PaymentMethodCreateParams paymentMethodCreateParams;
    private final String paymentMethodId;
    private PaymentMethodOptionsParams paymentMethodOptions;
    private String receiptEmail;
    private String returnUrl;
    private Boolean savePaymentMethod;
    private SetupFutureUsage setupFutureUsage;
    private Shipping shipping;
    private final String sourceId;
    private final SourceParams sourceParams;
    private final boolean useStripeSdk;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConfirmPaymentIntentParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0017Je\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0002\u0010\"Je\u0010#\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010$J=\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010(J=\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;", "", "()V", "PARAM_PAYMENT_METHOD_OPTIONS", "", "PARAM_RECEIPT_EMAIL", "PARAM_SAVE_PAYMENT_METHOD", "PARAM_SETUP_FUTURE_USAGE", "PARAM_SHIPPING", "PARAM_SOURCE_DATA", "PARAM_SOURCE_ID", "create", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "clientSecret", ConfirmPaymentIntentParams.PARAM_SHIPPING, "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", Action.PAYMENT_METHOD_TYPE, "Lcom/stripe/android/model/PaymentMethod$Type;", "createAlipay", "createForDashboard", "paymentMethodId", "createForDashboard$payments_core_release", "createWithPaymentMethodCreateParams", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "savePaymentMethod", "", "mandateId", "mandateData", "Lcom/stripe/android/model/MandateDataParams;", "paymentMethodOptions", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodOptionsParams;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "createWithPaymentMethodId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "createWithSourceId", "sourceId", "returnUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "createWithSourceParams", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nConfirmPaymentIntentParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmPaymentIntentParams.kt\ncom/stripe/android/model/ConfirmPaymentIntentParams$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n1#2:547\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ConfirmPaymentIntentParams create$default(Companion companion, String str, Shipping shipping, SetupFutureUsage setupFutureUsage, int i, Object obj) {
            if ((i & 2) != 0) {
                shipping = null;
            }
            if ((i & 4) != 0) {
                setupFutureUsage = null;
            }
            return companion.create(str, shipping, setupFutureUsage);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithPaymentMethodCreateParams$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptionsParams, int i, Object obj) {
            return companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : mandateDataParams, (i & 32) != 0 ? null : setupFutureUsage, (i & 64) != 0 ? null : shipping, (i & 128) != 0 ? null : paymentMethodOptionsParams);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithPaymentMethodId$default(Companion companion, String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, int i, Object obj) {
            return companion.createWithPaymentMethodId(str, str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : paymentMethodOptionsParams, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : mandateDataParams, (i & 64) != 0 ? null : setupFutureUsage, (i & 128) != 0 ? null : shipping);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithSourceId$default(Companion companion, String str, String str2, String str3, Boolean bool, Shipping shipping, int i, Object obj) {
            return companion.createWithSourceId(str, str2, str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : shipping);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithSourceParams$default(Companion companion, SourceParams sourceParams, String str, String str2, Boolean bool, Shipping shipping, int i, Object obj) {
            return companion.createWithSourceParams(sourceParams, str, str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : shipping);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams create(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return create$default(this, clientSecret, null, null, 6, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createAlipay(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(PaymentMethodCreateParams.Companion.createAlipay$default(PaymentMethodCreateParams.Companion, null, 1, null), null, null, null, clientSecret, "stripe://return_url", null, false, null, null, null, null, null, null, 16334, null);
        }

        public final ConfirmPaymentIntentParams createForDashboard$payments_core_release(String clientSecret, String paymentMethodId) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            return new ConfirmPaymentIntentParams(null, paymentMethodId, null, null, clientSecret, null, Boolean.FALSE, true, new PaymentMethodOptionsParams.Card(null, null, null, Boolean.TRUE, 7, null), null, null, null, null, null, 15917, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, null, null, null, null, null, null, 252, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, null, null, null, null, null, null, 252, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithSourceId(String sourceId, String clientSecret, String returnUrl) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return createWithSourceId$default(this, sourceId, clientSecret, returnUrl, null, null, 24, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String clientSecret, String returnUrl) {
            Intrinsics.checkNotNullParameter(sourceParams, "sourceParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return createWithSourceParams$default(this, sourceParams, clientSecret, returnUrl, null, null, 24, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams create(String clientSecret, Shipping shipping) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return create$default(this, clientSecret, shipping, null, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, null, null, null, null, null, 248, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, null, null, null, null, null, 248, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithSourceId(String sourceId, String clientSecret, String returnUrl, Boolean bool) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return createWithSourceId$default(this, sourceId, clientSecret, returnUrl, bool, null, 16, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String clientSecret, String returnUrl, Boolean bool) {
            Intrinsics.checkNotNullParameter(sourceParams, "sourceParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return createWithSourceParams$default(this, sourceParams, clientSecret, returnUrl, bool, null, 16, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams create(String clientSecret, PaymentMethod.Type paymentMethodType) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            return new ConfirmPaymentIntentParams(null, null, null, null, clientSecret, null, null, false, null, null, paymentMethodType.requiresMandate ? new MandateDataParams(MandateDataParams.Type.Online.Companion.getDEFAULT()) : null, null, null, null, 15343, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, str, null, null, null, null, 240, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, paymentMethodOptionsParams, null, null, null, null, 240, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithSourceId(String sourceId, String clientSecret, String returnUrl, Boolean bool, Shipping shipping) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return new ConfirmPaymentIntentParams(null, null, null, sourceId, clientSecret, returnUrl, bool, false, null, null, null, null, shipping, null, 12167, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String clientSecret, String returnUrl, Boolean bool, Shipping shipping) {
            Intrinsics.checkNotNullParameter(sourceParams, "sourceParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return new ConfirmPaymentIntentParams(null, null, sourceParams, null, clientSecret, returnUrl, bool, false, null, null, null, null, shipping, null, 12171, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str, MandateDataParams mandateDataParams) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, str, mandateDataParams, null, null, null, 224, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, paymentMethodOptionsParams, str, null, null, null, 224, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, str, mandateDataParams, setupFutureUsage, null, null, 192, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str, MandateDataParams mandateDataParams) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, paymentMethodOptionsParams, str, mandateDataParams, null, null, 192, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams create(String clientSecret, Shipping shipping, SetupFutureUsage setupFutureUsage) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(null, null, null, null, clientSecret, null, null, false, null, null, null, setupFutureUsage, shipping, null, 10223, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, str, mandateDataParams, setupFutureUsage, shipping, null, 128, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, paymentMethodOptionsParams, str, mandateDataParams, setupFutureUsage, null, 128, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptionsParams) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(paymentMethodCreateParams, null, null, null, clientSecret, null, bool, false, paymentMethodOptionsParams, str, mandateDataParams, setupFutureUsage, shipping, null, 8366, null);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(null, paymentMethodId, null, null, clientSecret, null, bool, false, paymentMethodOptionsParams, str, mandateDataParams, setupFutureUsage, shipping, null, 8365, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ConfirmPaymentIntentParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmPaymentIntentParams createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PaymentMethodCreateParams createFromParcel = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            SourceParams createFromParcel2 = parcel.readInt() == 0 ? null : SourceParams.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ConfirmPaymentIntentParams(createFromParcel, readString, createFromParcel2, readString2, readString3, readString4, valueOf, parcel.readInt() != 0, (PaymentMethodOptionsParams) parcel.readParcelable(ConfirmPaymentIntentParams.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : MandateDataParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SetupFutureUsage.valueOf(parcel.readString()), parcel.readInt() != 0 ? Shipping.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmPaymentIntentParams[] newArray(int i) {
            return new ConfirmPaymentIntentParams[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "OnSession", "OffSession", "Blank", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum SetupFutureUsage {
        OnSession("on_session"),
        OffSession("off_session"),
        Blank("");
        
        private final String code;

        SetupFutureUsage(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }
    }

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u001bJA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0%H\u0016J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "address", "Lcom/stripe/android/model/Address;", "name", "", Shipping.PARAM_CARRIER, "phone", "trackingNumber", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress$payments_core_release", "()Lcom/stripe/android/model/Address;", "getCarrier$payments_core_release", "()Ljava/lang/String;", "getName$payments_core_release", "getPhone$payments_core_release", "getTrackingNumber$payments_core_release", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nConfirmPaymentIntentParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmPaymentIntentParams.kt\ncom/stripe/android/model/ConfirmPaymentIntentParams$Shipping\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n1789#2,2:547\n1791#2:550\n1#3:549\n*S KotlinDebug\n*F\n+ 1 ConfirmPaymentIntentParams.kt\ncom/stripe/android/model/ConfirmPaymentIntentParams$Shipping\n*L\n298#1:547,2\n298#1:550\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Shipping implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        @Deprecated
        private static final String PARAM_ADDRESS = "address";
        @Deprecated
        private static final String PARAM_CARRIER = "carrier";
        @Deprecated
        private static final String PARAM_NAME = "name";
        @Deprecated
        private static final String PARAM_PHONE = "phone";
        @Deprecated
        private static final String PARAM_TRACKING_NUMBER = "tracking_number";
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_CARRIER", "PARAM_NAME", "PARAM_PHONE", "PARAM_TRACKING_NUMBER", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Shipping> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping[] newArray(int i) {
                return new Shipping[i];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Shipping(Address address, String name) {
            this(address, name, null, null, null, 28, null);
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(name, "name");
        }

        public static /* synthetic */ Shipping copy$default(Shipping shipping, Address address, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                address = shipping.address;
            }
            if ((i & 2) != 0) {
                str = shipping.name;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = shipping.carrier;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = shipping.phone;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = shipping.trackingNumber;
            }
            return shipping.copy(address, str5, str6, str7, str4);
        }

        public final Address component1$payments_core_release() {
            return this.address;
        }

        public final String component2$payments_core_release() {
            return this.name;
        }

        public final String component3$payments_core_release() {
            return this.carrier;
        }

        public final String component4$payments_core_release() {
            return this.phone;
        }

        public final String component5$payments_core_release() {
            return this.trackingNumber;
        }

        public final Shipping copy(Address address, String name, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Shipping(address, name, str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Shipping) {
                Shipping shipping = (Shipping) obj;
                return Intrinsics.areEqual(this.address, shipping.address) && Intrinsics.areEqual(this.name, shipping.name) && Intrinsics.areEqual(this.carrier, shipping.carrier) && Intrinsics.areEqual(this.phone, shipping.phone) && Intrinsics.areEqual(this.trackingNumber, shipping.trackingNumber);
            }
            return false;
        }

        public final Address getAddress$payments_core_release() {
            return this.address;
        }

        public final String getCarrier$payments_core_release() {
            return this.carrier;
        }

        public final String getName$payments_core_release() {
            return this.name;
        }

        public final String getPhone$payments_core_release() {
            return this.phone;
        }

        public final String getTrackingNumber$payments_core_release() {
            return this.trackingNumber;
        }

        public int hashCode() {
            int hashCode = ((this.address.hashCode() * 31) + this.name.hashCode()) * 31;
            String str = this.carrier;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.phone;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.trackingNumber;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<Pair> listOf;
            Map<String, Object> emptyMap;
            Map map;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to("address", this.address.toParamMap()), TuplesKt.m28425to("name", this.name), TuplesKt.m28425to(PARAM_CARRIER, this.carrier), TuplesKt.m28425to("phone", this.phone), TuplesKt.m28425to(PARAM_TRACKING_NUMBER, this.trackingNumber)});
            emptyMap = MapsKt__MapsKt.emptyMap();
            for (Pair pair : listOf) {
                String str = (String) pair.component1();
                Object component2 = pair.component2();
                if (component2 != null) {
                    map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, component2));
                } else {
                    map = null;
                }
                if (map == null) {
                    map = MapsKt__MapsKt.emptyMap();
                }
                emptyMap = MapsKt__MapsKt.plus(emptyMap, map);
            }
            return emptyMap;
        }

        public String toString() {
            Address address = this.address;
            String str = this.name;
            String str2 = this.carrier;
            String str3 = this.phone;
            String str4 = this.trackingNumber;
            return "Shipping(address=" + address + ", name=" + str + ", carrier=" + str2 + ", phone=" + str3 + ", trackingNumber=" + str4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.address.writeToParcel(out, i);
            out.writeString(this.name);
            out.writeString(this.carrier);
            out.writeString(this.phone);
            out.writeString(this.trackingNumber);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Shipping(Address address, String name, String str) {
            this(address, name, str, null, null, 24, null);
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(name, "name");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Shipping(Address address, String name, String str, String str2) {
            this(address, name, str, str2, null, 16, null);
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @JvmOverloads
        public Shipping(Address address, String name, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(name, "name");
            this.address = address;
            this.name = name;
            this.carrier = str;
            this.phone = str2;
            this.trackingNumber = str3;
        }

        public /* synthetic */ Shipping(Address address, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(address, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }
    }

    public ConfirmPaymentIntentParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams sourceParams, String str2, String clientSecret, String str3, Boolean bool, boolean z, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, String str5) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.paymentMethodCreateParams = paymentMethodCreateParams;
        this.paymentMethodId = str;
        this.sourceParams = sourceParams;
        this.sourceId = str2;
        this.clientSecret = clientSecret;
        this.returnUrl = str3;
        this.savePaymentMethod = bool;
        this.useStripeSdk = z;
        this.paymentMethodOptions = paymentMethodOptionsParams;
        this.mandateId = str4;
        this.mandateData = mandateDataParams;
        this.setupFutureUsage = setupFutureUsage;
        this.shipping = shipping;
        this.receiptEmail = str5;
    }

    private final boolean component8() {
        return this.useStripeSdk;
    }

    public static /* synthetic */ ConfirmPaymentIntentParams copy$default(ConfirmPaymentIntentParams confirmPaymentIntentParams, PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams sourceParams, String str2, String str3, String str4, Boolean bool, boolean z, PaymentMethodOptionsParams paymentMethodOptionsParams, String str5, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, String str6, int i, Object obj) {
        return confirmPaymentIntentParams.copy((i & 1) != 0 ? confirmPaymentIntentParams.paymentMethodCreateParams : paymentMethodCreateParams, (i & 2) != 0 ? confirmPaymentIntentParams.paymentMethodId : str, (i & 4) != 0 ? confirmPaymentIntentParams.sourceParams : sourceParams, (i & 8) != 0 ? confirmPaymentIntentParams.sourceId : str2, (i & 16) != 0 ? confirmPaymentIntentParams.getClientSecret() : str3, (i & 32) != 0 ? confirmPaymentIntentParams.getReturnUrl() : str4, (i & 64) != 0 ? confirmPaymentIntentParams.savePaymentMethod : bool, (i & 128) != 0 ? confirmPaymentIntentParams.useStripeSdk : z, (i & 256) != 0 ? confirmPaymentIntentParams.paymentMethodOptions : paymentMethodOptionsParams, (i & 512) != 0 ? confirmPaymentIntentParams.mandateId : str5, (i & 1024) != 0 ? confirmPaymentIntentParams.mandateData : mandateDataParams, (i & 2048) != 0 ? confirmPaymentIntentParams.setupFutureUsage : setupFutureUsage, (i & 4096) != 0 ? confirmPaymentIntentParams.shipping : shipping, (i & 8192) != 0 ? confirmPaymentIntentParams.receiptEmail : str6);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams create(String str) {
        return Companion.create(str);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createAlipay(String str) {
        return Companion.createAlipay(str);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2) {
        return Companion.createWithPaymentMethodId(str, str2);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3) {
        return Companion.createWithSourceId(str, str2, str3);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2) {
        return Companion.createWithSourceParams(sourceParams, str, str2);
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
        Map<String, Object> mapOf3;
        Map<String, Object> mapOf4;
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null) {
            mapOf4 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("payment_method_data", paymentMethodCreateParams.toParamMap()));
            return mapOf4;
        }
        String str = this.paymentMethodId;
        if (str != null) {
            mapOf3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("payment_method", str));
            return mapOf3;
        }
        SourceParams sourceParams = this.sourceParams;
        if (sourceParams != null) {
            mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_SOURCE_DATA, sourceParams.toParamMap()));
            return mapOf2;
        }
        String str2 = this.sourceId;
        if (str2 != null) {
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("source", str2));
            return mapOf;
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        return emptyMap;
    }

    public final PaymentMethodCreateParams component1() {
        return this.paymentMethodCreateParams;
    }

    public final String component10() {
        return this.mandateId;
    }

    public final MandateDataParams component11() {
        return this.mandateData;
    }

    public final SetupFutureUsage component12() {
        return this.setupFutureUsage;
    }

    public final Shipping component13() {
        return this.shipping;
    }

    public final String component14() {
        return this.receiptEmail;
    }

    public final String component2() {
        return this.paymentMethodId;
    }

    public final SourceParams component3() {
        return this.sourceParams;
    }

    public final String component4() {
        return this.sourceId;
    }

    public final String component5() {
        return getClientSecret();
    }

    public final String component6() {
        return getReturnUrl();
    }

    public final Boolean component7() {
        return this.savePaymentMethod;
    }

    public final PaymentMethodOptionsParams component9() {
        return this.paymentMethodOptions;
    }

    public final ConfirmPaymentIntentParams copy(PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams sourceParams, String str2, String clientSecret, String str3, Boolean bool, boolean z, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, String str5) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return new ConfirmPaymentIntentParams(paymentMethodCreateParams, str, sourceParams, str2, clientSecret, str3, bool, z, paymentMethodOptionsParams, str4, mandateDataParams, setupFutureUsage, shipping, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfirmPaymentIntentParams) {
            ConfirmPaymentIntentParams confirmPaymentIntentParams = (ConfirmPaymentIntentParams) obj;
            return Intrinsics.areEqual(this.paymentMethodCreateParams, confirmPaymentIntentParams.paymentMethodCreateParams) && Intrinsics.areEqual(this.paymentMethodId, confirmPaymentIntentParams.paymentMethodId) && Intrinsics.areEqual(this.sourceParams, confirmPaymentIntentParams.sourceParams) && Intrinsics.areEqual(this.sourceId, confirmPaymentIntentParams.sourceId) && Intrinsics.areEqual(getClientSecret(), confirmPaymentIntentParams.getClientSecret()) && Intrinsics.areEqual(getReturnUrl(), confirmPaymentIntentParams.getReturnUrl()) && Intrinsics.areEqual(this.savePaymentMethod, confirmPaymentIntentParams.savePaymentMethod) && this.useStripeSdk == confirmPaymentIntentParams.useStripeSdk && Intrinsics.areEqual(this.paymentMethodOptions, confirmPaymentIntentParams.paymentMethodOptions) && Intrinsics.areEqual(this.mandateId, confirmPaymentIntentParams.mandateId) && Intrinsics.areEqual(this.mandateData, confirmPaymentIntentParams.mandateData) && this.setupFutureUsage == confirmPaymentIntentParams.setupFutureUsage && Intrinsics.areEqual(this.shipping, confirmPaymentIntentParams.shipping) && Intrinsics.areEqual(this.receiptEmail, confirmPaymentIntentParams.receiptEmail);
        }
        return false;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public String getClientSecret() {
        return this.clientSecret;
    }

    public final MandateDataParams getMandateData() {
        return this.mandateData;
    }

    public final String getMandateId() {
        return this.mandateId;
    }

    public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final PaymentMethodOptionsParams getPaymentMethodOptions() {
        return this.paymentMethodOptions;
    }

    public final String getReceiptEmail() {
        return this.receiptEmail;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public final Boolean getSavePaymentMethod() {
        return this.savePaymentMethod;
    }

    public final SetupFutureUsage getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final SourceParams getSourceParams() {
        return this.sourceParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        int hashCode = (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode()) * 31;
        String str = this.paymentMethodId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SourceParams sourceParams = this.sourceParams;
        int hashCode3 = (hashCode2 + (sourceParams == null ? 0 : sourceParams.hashCode())) * 31;
        String str2 = this.sourceId;
        int hashCode4 = (((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + getClientSecret().hashCode()) * 31) + (getReturnUrl() == null ? 0 : getReturnUrl().hashCode())) * 31;
        Boolean bool = this.savePaymentMethod;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.useStripeSdk;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptions;
        int hashCode6 = (i2 + (paymentMethodOptionsParams == null ? 0 : paymentMethodOptionsParams.hashCode())) * 31;
        String str3 = this.mandateId;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MandateDataParams mandateDataParams = this.mandateData;
        int hashCode8 = (hashCode7 + (mandateDataParams == null ? 0 : mandateDataParams.hashCode())) * 31;
        SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        int hashCode9 = (hashCode8 + (setupFutureUsage == null ? 0 : setupFutureUsage.hashCode())) * 31;
        Shipping shipping = this.shipping;
        int hashCode10 = (hashCode9 + (shipping == null ? 0 : shipping.hashCode())) * 31;
        String str4 = this.receiptEmail;
        return hashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setMandateData(MandateDataParams mandateDataParams) {
        this.mandateData = mandateDataParams;
    }

    public final void setMandateId(String str) {
        this.mandateId = str;
    }

    public final void setPaymentMethodOptions(PaymentMethodOptionsParams paymentMethodOptionsParams) {
        this.paymentMethodOptions = paymentMethodOptionsParams;
    }

    public final void setReceiptEmail(String str) {
        this.receiptEmail = str;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public final void setSavePaymentMethod(Boolean bool) {
        this.savePaymentMethod = bool;
    }

    public final void setSetupFutureUsage(SetupFutureUsage setupFutureUsage) {
        this.setupFutureUsage = setupFutureUsage;
    }

    public final void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public final boolean shouldSavePaymentMethod() {
        return Intrinsics.areEqual(this.savePaymentMethod, Boolean.TRUE);
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
        Map map3;
        Map plus3;
        Map map4;
        Map plus4;
        Map map5;
        Map plus5;
        Map map6;
        Map plus6;
        Map map7;
        Map plus7;
        Map plus8;
        Map<String, Object> plus9;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("client_secret", getClientSecret()), TuplesKt.m28425to("use_stripe_sdk", Boolean.valueOf(this.useStripeSdk)));
        Boolean bool = this.savePaymentMethod;
        Map map8 = null;
        if (bool != null) {
            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_SAVE_PAYMENT_METHOD, Boolean.valueOf(bool.booleanValue())));
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
        } else {
            map3 = null;
        }
        if (map3 == null) {
            map3 = MapsKt__MapsKt.emptyMap();
        }
        plus3 = MapsKt__MapsKt.plus(plus2, map3);
        String returnUrl = getReturnUrl();
        if (returnUrl != null) {
            map4 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("return_url", returnUrl));
        } else {
            map4 = null;
        }
        if (map4 == null) {
            map4 = MapsKt__MapsKt.emptyMap();
        }
        plus4 = MapsKt__MapsKt.plus(plus3, map4);
        PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptions;
        if (paymentMethodOptionsParams != null) {
            map5 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_PAYMENT_METHOD_OPTIONS, paymentMethodOptionsParams.toParamMap()));
        } else {
            map5 = null;
        }
        if (map5 == null) {
            map5 = MapsKt__MapsKt.emptyMap();
        }
        plus5 = MapsKt__MapsKt.plus(plus4, map5);
        SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        if (setupFutureUsage != null) {
            map6 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("setup_future_usage", setupFutureUsage.getCode$payments_core_release()));
        } else {
            map6 = null;
        }
        if (map6 == null) {
            map6 = MapsKt__MapsKt.emptyMap();
        }
        plus6 = MapsKt__MapsKt.plus(plus5, map6);
        Shipping shipping = this.shipping;
        if (shipping != null) {
            map7 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_SHIPPING, shipping.toParamMap()));
        } else {
            map7 = null;
        }
        if (map7 == null) {
            map7 = MapsKt__MapsKt.emptyMap();
        }
        plus7 = MapsKt__MapsKt.plus(plus6, map7);
        plus8 = MapsKt__MapsKt.plus(plus7, getPaymentMethodParamMap());
        String str2 = this.receiptEmail;
        if (str2 != null) {
            map8 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_RECEIPT_EMAIL, str2));
        }
        if (map8 == null) {
            map8 = MapsKt__MapsKt.emptyMap();
        }
        plus9 = MapsKt__MapsKt.plus(plus8, map8);
        return plus9;
    }

    public String toString() {
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        String str = this.paymentMethodId;
        SourceParams sourceParams = this.sourceParams;
        String str2 = this.sourceId;
        String clientSecret = getClientSecret();
        String returnUrl = getReturnUrl();
        Boolean bool = this.savePaymentMethod;
        boolean z = this.useStripeSdk;
        PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptions;
        String str3 = this.mandateId;
        MandateDataParams mandateDataParams = this.mandateData;
        SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        Shipping shipping = this.shipping;
        String str4 = this.receiptEmail;
        return "ConfirmPaymentIntentParams(paymentMethodCreateParams=" + paymentMethodCreateParams + ", paymentMethodId=" + str + ", sourceParams=" + sourceParams + ", sourceId=" + str2 + ", clientSecret=" + clientSecret + ", returnUrl=" + returnUrl + ", savePaymentMethod=" + bool + ", useStripeSdk=" + z + ", paymentMethodOptions=" + paymentMethodOptionsParams + ", mandateId=" + str3 + ", mandateData=" + mandateDataParams + ", setupFutureUsage=" + setupFutureUsage + ", shipping=" + shipping + ", receiptEmail=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            paymentMethodCreateParams.writeToParcel(out, i);
        }
        out.writeString(this.paymentMethodId);
        SourceParams sourceParams = this.sourceParams;
        if (sourceParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sourceParams.writeToParcel(out, i);
        }
        out.writeString(this.sourceId);
        out.writeString(this.clientSecret);
        out.writeString(this.returnUrl);
        Boolean bool = this.savePaymentMethod;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeInt(this.useStripeSdk ? 1 : 0);
        out.writeParcelable(this.paymentMethodOptions, i);
        out.writeString(this.mandateId);
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mandateDataParams.writeToParcel(out, i);
        }
        SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        if (setupFutureUsage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(setupFutureUsage.name());
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shipping.writeToParcel(out, i);
        }
        out.writeString(this.receiptEmail);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams create(String str, Shipping shipping) {
        return Companion.create(str, shipping);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool) {
        return Companion.createWithPaymentMethodId(str, str2, bool);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool) {
        return Companion.createWithSourceId(str, str2, str3, bool);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2, Boolean bool) {
        return Companion.createWithSourceParams(sourceParams, str, str2, bool);
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public ConfirmPaymentIntentParams withShouldUseStripeSdk(boolean z) {
        return copy$default(this, null, null, null, null, null, null, null, z, null, null, null, null, null, null, 16255, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams create(String str, Shipping shipping, SetupFutureUsage setupFutureUsage) {
        return Companion.create(str, shipping, setupFutureUsage);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams) {
        return Companion.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool, Shipping shipping) {
        return Companion.createWithSourceId(str, str2, str3, bool, shipping);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2, Boolean bool, Shipping shipping) {
        return Companion.createWithSourceParams(sourceParams, str, str2, bool, shipping);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams create(String str, PaymentMethod.Type type) {
        return Companion.create(str, type);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3) {
        return Companion.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams, setupFutureUsage);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams) {
        return Companion.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams, setupFutureUsage, shipping);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
        return Companion.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams, setupFutureUsage);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptionsParams) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams, setupFutureUsage, shipping, paymentMethodOptionsParams);
    }

    @JvmStatic
    @JvmOverloads
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
        return Companion.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams, setupFutureUsage, shipping);
    }

    public /* synthetic */ ConfirmPaymentIntentParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams sourceParams, String str2, String str3, String str4, Boolean bool, boolean z, PaymentMethodOptionsParams paymentMethodOptionsParams, String str5, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentMethodCreateParams, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : sourceParams, (i & 8) != 0 ? null : str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : paymentMethodOptionsParams, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : mandateDataParams, (i & 2048) != 0 ? null : setupFutureUsage, (i & 4096) != 0 ? null : shipping, (i & 8192) != 0 ? null : str6);
    }
}
