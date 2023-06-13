package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.PaymentIntentJsonParser;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u0085\u00012\u00020\u0001:\u000e\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001B\u0097\u0002\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010'J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0015HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010!HÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010)J\t\u0010f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010h\u001a\u00020\fHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u000fHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J°\u0002\u0010l\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010mJ\t\u0010n\u001a\u00020oHÖ\u0001J\u0013\u0010p\u001a\u00020\u00152\b\u0010q\u001a\u0004\u0018\u00010rHÖ\u0003J\u0014\u0010s\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010r0tJ\t\u0010u\u001a\u00020oHÖ\u0001J\u0014\u0010v\u001a\u00020\u00152\n\u0010w\u001a\u00060\u0003j\u0002`xH\u0007J\b\u0010y\u001a\u00020\u0015H\u0003J\b\u0010z\u001a\u00020\u0015H\u0016J\b\u0010{\u001a\u00020\u0015H\u0016J\t\u0010|\u001a\u00020\u0003HÖ\u0001J\u001b\u0010}\u001a\u00020~2\u0007\u0010\u007f\u001a\u00030\u0080\u00012\u0007\u0010\u0081\u0001\u001a\u00020oHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0014\u0010\u0011\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00102R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00102R\u0014\u0010:\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010;R\u0016\u0010<\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u00102R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010$\u001a\u0004\u0018\u00010%X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0016\u0010D\u001a\u0004\u0018\u00010E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00102R\u0010\u0010&\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010AR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010A¨\u0006\u0089\u0001"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/model/StripeIntent;", "id", "", "paymentMethodTypes", "", "amount", "", "canceledAt", "cancellationReason", "Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "captureMethod", "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "clientSecret", "confirmationMethod", "Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "countryCode", AnalyticsRequestV2.PARAM_CREATED, "currency", "description", "isLiveMode", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "receiptEmail", "status", "Lcom/stripe/android/model/StripeIntent$Status;", "setupFutureUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "lastPaymentError", "Lcom/stripe/android/model/PaymentIntent$Error;", "shipping", "Lcom/stripe/android/model/PaymentIntent$Shipping;", "unactivatedPaymentMethods", "linkFundingSources", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "paymentMethodOptionsJsonString", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLcom/stripe/android/model/PaymentIntent$CancellationReason;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$Error;Lcom/stripe/android/model/PaymentIntent$Shipping;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCanceledAt", "()J", "getCancellationReason", "()Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "getCaptureMethod", "()Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "getClientSecret", "()Ljava/lang/String;", "getConfirmationMethod", "()Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "getCountryCode", "getCreated", "getCurrency", "getDescription", "getId", "isConfirmed", "()Z", "lastErrorMessage", "getLastErrorMessage", "getLastPaymentError", "()Lcom/stripe/android/model/PaymentIntent$Error;", "getLinkFundingSources", "()Ljava/util/List;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "nextActionType", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethodId", "getPaymentMethodTypes", "getReceiptEmail", "getSetupFutureUsage", "()Lcom/stripe/android/model/StripeIntent$Usage;", "getShipping", "()Lcom/stripe/android/model/PaymentIntent$Shipping;", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "getUnactivatedPaymentMethods", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLcom/stripe/android/model/PaymentIntent$CancellationReason;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$Error;Lcom/stripe/android/model/PaymentIntent$Shipping;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent;", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "getPaymentMethodOptions", "", "hashCode", "isLpmLevelSetupFutureUsageSet", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lcom/stripe/android/model/PaymentMethodCode;", "isTopLevelSetupFutureUsageSet", "requiresAction", "requiresConfirmation", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CancellationReason", "CaptureMethod", "ClientSecret", "Companion", "ConfirmationMethod", "Error", "Shipping", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentIntent implements StripeIntent {
    private final Long amount;
    private final long canceledAt;
    private final CancellationReason cancellationReason;
    private final CaptureMethod captureMethod;
    private final String clientSecret;
    private final ConfirmationMethod confirmationMethod;
    private final String countryCode;
    private final long created;
    private final String currency;
    private final String description;

    /* renamed from: id */
    private final String f75357id;
    private final boolean isLiveMode;
    private final Error lastPaymentError;
    private final List<String> linkFundingSources;
    private final StripeIntent.NextActionData nextActionData;
    private final PaymentMethod paymentMethod;
    private final String paymentMethodId;
    private final String paymentMethodOptionsJsonString;
    private final List<String> paymentMethodTypes;
    private final String receiptEmail;
    private final StripeIntent.Usage setupFutureUsage;
    private final Shipping shipping;
    private final StripeIntent.Status status;
    private final List<String> unactivatedPaymentMethods;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentIntent> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "Duplicate", "Fraudulent", "RequestedByCustomer", "Abandoned", "FailedInvoice", "VoidInvoice", "Automatic", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum CancellationReason {
        Duplicate("duplicate"),
        Fraudulent("fraudulent"),
        RequestedByCustomer("requested_by_customer"),
        Abandoned("abandoned"),
        FailedInvoice("failed_invoice"),
        VoidInvoice("void_invoice"),
        Automatic("automatic");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$CancellationReason$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/PaymentIntent$CancellationReason;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPaymentIntent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentIntent.kt\ncom/stripe/android/model/PaymentIntent$CancellationReason$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,436:1\n1282#2,2:437\n*S KotlinDebug\n*F\n+ 1 PaymentIntent.kt\ncom/stripe/android/model/PaymentIntent$CancellationReason$Companion\n*L\n384#1:437,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CancellationReason fromCode(String str) {
                CancellationReason[] values;
                for (CancellationReason cancellationReason : CancellationReason.values()) {
                    if (Intrinsics.areEqual(cancellationReason.code, str)) {
                        return cancellationReason;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        CancellationReason(String str) {
            this.code = str;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "Automatic", "Manual", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum CaptureMethod {
        Automatic("automatic"),
        Manual("manual");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$CaptureMethod$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPaymentIntent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentIntent.kt\ncom/stripe/android/model/PaymentIntent$CaptureMethod$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,436:1\n1282#2,2:437\n*S KotlinDebug\n*F\n+ 1 PaymentIntent.kt\ncom/stripe/android/model/PaymentIntent$CaptureMethod$Companion\n*L\n404#1:437,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CaptureMethod fromCode(String str) {
                CaptureMethod captureMethod;
                CaptureMethod[] values = CaptureMethod.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        captureMethod = values[i];
                        if (Intrinsics.areEqual(captureMethod.code, str)) {
                            break;
                        }
                        i++;
                    } else {
                        captureMethod = null;
                        break;
                    }
                }
                if (captureMethod == null) {
                    return CaptureMethod.Automatic;
                }
                return captureMethod;
            }

            private Companion() {
            }
        }

        CaptureMethod(String str) {
            this.code = str;
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$ClientSecret;", "", "value", "", "(Ljava/lang/String;)V", "paymentIntentId", "getPaymentIntentId$payments_core_release", "()Ljava/lang/String;", "getValue$payments_core_release", "component1", "component1$payments_core_release", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentIntent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentIntent.kt\ncom/stripe/android/model/PaymentIntent$ClientSecret\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,436:1\n731#2,9:437\n37#3,2:446\n*S KotlinDebug\n*F\n+ 1 PaymentIntent.kt\ncom/stripe/android/model/PaymentIntent$ClientSecret\n*L\n354#1:437,9\n354#1:446,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class ClientSecret {
        public static final Companion Companion = new Companion(null);
        private static final Pattern PATTERN = Pattern.compile("^pi_[^_]+_secret_[^_]+$");
        private final String paymentIntentId;
        private final String value;

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$ClientSecret$Companion;", "", "()V", "PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "isMatch", "", "value", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean isMatch(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ClientSecret.PATTERN.matcher(value).matches();
            }

            private Companion() {
            }
        }

        public ClientSecret(String value) {
            List emptyList;
            boolean z;
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            List<String> split = new Regex("_secret").split(value, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        emptyList = CollectionsKt___CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.paymentIntentId = ((String[]) emptyList.toArray(new String[0]))[0];
            if (Companion.isMatch(this.value)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Payment Intent client secret: " + this.value).toString());
        }

        public static /* synthetic */ ClientSecret copy$default(ClientSecret clientSecret, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientSecret.value;
            }
            return clientSecret.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.value;
        }

        public final ClientSecret copy(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new ClientSecret(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientSecret) && Intrinsics.areEqual(this.value, ((ClientSecret) obj).value);
        }

        public final String getPaymentIntentId$payments_core_release() {
            return this.paymentIntentId;
        }

        public final String getValue$payments_core_release() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            String str = this.value;
            return "ClientSecret(value=" + str + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$Companion;", "", "()V", "fromJson", "Lcom/stripe/android/model/PaymentIntent;", "jsonObject", "Lorg/json/JSONObject;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final PaymentIntent fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new PaymentIntentJsonParser(null, 1, null).parse(jSONObject);
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "Automatic", "Manual", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum ConfirmationMethod {
        Automatic("automatic"),
        Manual("manual");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPaymentIntent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentIntent.kt\ncom/stripe/android/model/PaymentIntent$ConfirmationMethod$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,436:1\n1282#2,2:437\n*S KotlinDebug\n*F\n+ 1 PaymentIntent.kt\ncom/stripe/android/model/PaymentIntent$ConfirmationMethod$Companion\n*L\n423#1:437,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ConfirmationMethod fromCode(String str) {
                ConfirmationMethod confirmationMethod;
                ConfirmationMethod[] values = ConfirmationMethod.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        confirmationMethod = values[i];
                        if (Intrinsics.areEqual(confirmationMethod.code, str)) {
                            break;
                        }
                        i++;
                    } else {
                        confirmationMethod = null;
                        break;
                    }
                }
                if (confirmationMethod == null) {
                    return ConfirmationMethod.Automatic;
                }
                return confirmationMethod;
            }

            private Companion() {
            }
        }

        ConfirmationMethod(String str) {
            this.code = str;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<PaymentIntent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentIntent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentIntent(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() == 0 ? null : CancellationReason.valueOf(parcel.readString()), CaptureMethod.valueOf(parcel.readString()), parcel.readString(), ConfirmationMethod.valueOf(parcel.readString()), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Error.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Shipping.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.NextActionData) parcel.readParcelable(PaymentIntent.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentIntent[] newArray(int i) {
            return new PaymentIntent[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002/0BW\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003Ji\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00061"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$Error;", "Lcom/stripe/android/core/model/StripeModel;", "charge", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "declineCode", "docUrl", "message", "param", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "type", "Lcom/stripe/android/model/PaymentIntent$Error$Type;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentIntent$Error$Type;)V", "getCharge", "()Ljava/lang/String;", "getCode", "getDeclineCode", "getDocUrl", "getMessage", "getParam", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getType", "()Lcom/stripe/android/model/PaymentIntent$Error$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Type", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Error implements StripeModel {
        public static final String CODE_AUTHENTICATION_ERROR = "payment_intent_authentication_failure";
        private final String charge;
        private final String code;
        private final String declineCode;
        private final String docUrl;
        private final String message;
        private final String param;
        private final PaymentMethod paymentMethod;
        private final Type type;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Error> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$Error$Companion;", "", "()V", "CODE_AUTHENTICATION_ERROR", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$Error$Type;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "ApiConnectionError", "ApiError", "AuthenticationError", "CardError", "IdempotencyError", "InvalidRequestError", "RateLimitError", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum Type {
            ApiConnectionError("api_connection_error"),
            ApiError("api_error"),
            AuthenticationError("authentication_error"),
            CardError("card_error"),
            IdempotencyError("idempotency_error"),
            InvalidRequestError("invalid_request_error"),
            RateLimitError("rate_limit_error");
            
            public static final Companion Companion = new Companion(null);
            private final String code;

            @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$Error$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/PaymentIntent$Error$Type;", "typeCode", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nPaymentIntent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentIntent.kt\ncom/stripe/android/model/PaymentIntent$Error$Type$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,436:1\n1282#2,2:437\n*S KotlinDebug\n*F\n+ 1 PaymentIntent.kt\ncom/stripe/android/model/PaymentIntent$Error$Type$Companion\n*L\n297#1:437,2\n*E\n"})
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Type fromCode(String str) {
                    Type[] values;
                    for (Type type : Type.values()) {
                        if (Intrinsics.areEqual(type.getCode(), str)) {
                            return type;
                        }
                    }
                    return null;
                }

                private Companion() {
                }
            }

            Type(String str) {
                this.code = str;
            }

            public final String getCode() {
                return this.code;
            }
        }

        public Error(String str, String str2, String str3, String str4, String str5, String str6, PaymentMethod paymentMethod, Type type) {
            this.charge = str;
            this.code = str2;
            this.declineCode = str3;
            this.docUrl = str4;
            this.message = str5;
            this.param = str6;
            this.paymentMethod = paymentMethod;
            this.type = type;
        }

        public final String component1() {
            return this.charge;
        }

        public final String component2() {
            return this.code;
        }

        public final String component3() {
            return this.declineCode;
        }

        public final String component4() {
            return this.docUrl;
        }

        public final String component5() {
            return this.message;
        }

        public final String component6() {
            return this.param;
        }

        public final PaymentMethod component7() {
            return this.paymentMethod;
        }

        public final Type component8() {
            return this.type;
        }

        public final Error copy(String str, String str2, String str3, String str4, String str5, String str6, PaymentMethod paymentMethod, Type type) {
            return new Error(str, str2, str3, str4, str5, str6, paymentMethod, type);
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
            if (obj instanceof Error) {
                Error error = (Error) obj;
                return Intrinsics.areEqual(this.charge, error.charge) && Intrinsics.areEqual(this.code, error.code) && Intrinsics.areEqual(this.declineCode, error.declineCode) && Intrinsics.areEqual(this.docUrl, error.docUrl) && Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.param, error.param) && Intrinsics.areEqual(this.paymentMethod, error.paymentMethod) && this.type == error.type;
            }
            return false;
        }

        public final String getCharge() {
            return this.charge;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getDeclineCode() {
            return this.declineCode;
        }

        public final String getDocUrl() {
            return this.docUrl;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getParam() {
            return this.param;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final Type getType() {
            return this.type;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.charge;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.code;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.declineCode;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.docUrl;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.message;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.param;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            int hashCode7 = (hashCode6 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            Type type = this.type;
            return hashCode7 + (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            String str = this.charge;
            String str2 = this.code;
            String str3 = this.declineCode;
            String str4 = this.docUrl;
            String str5 = this.message;
            String str6 = this.param;
            PaymentMethod paymentMethod = this.paymentMethod;
            Type type = this.type;
            return "Error(charge=" + str + ", code=" + str2 + ", declineCode=" + str3 + ", docUrl=" + str4 + ", message=" + str5 + ", param=" + str6 + ", paymentMethod=" + paymentMethod + ", type=" + type + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.charge);
            out.writeString(this.code);
            out.writeString(this.declineCode);
            out.writeString(this.docUrl);
            out.writeString(this.message);
            out.writeString(this.param);
            PaymentMethod paymentMethod = this.paymentMethod;
            if (paymentMethod == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                paymentMethod.writeToParcel(out, i);
            }
            Type type = this.type;
            if (type == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(type.name());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.Usage.values().length];
            try {
                iArr[StripeIntent.Usage.OnSession.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Usage.OffSession.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Usage.OneTime.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentIntent(String str, List<String> paymentMethodTypes, Long l, long j, CancellationReason cancellationReason, CaptureMethod captureMethod, String str2, ConfirmationMethod confirmationMethod, String str3, long j2, String str4, String str5, boolean z, PaymentMethod paymentMethod, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List<String> unactivatedPaymentMethods, List<String> linkFundingSources, StripeIntent.NextActionData nextActionData, String str8) {
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
        Intrinsics.checkNotNullParameter(confirmationMethod, "confirmationMethod");
        Intrinsics.checkNotNullParameter(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        Intrinsics.checkNotNullParameter(linkFundingSources, "linkFundingSources");
        this.f75357id = str;
        this.paymentMethodTypes = paymentMethodTypes;
        this.amount = l;
        this.canceledAt = j;
        this.cancellationReason = cancellationReason;
        this.captureMethod = captureMethod;
        this.clientSecret = str2;
        this.confirmationMethod = confirmationMethod;
        this.countryCode = str3;
        this.created = j2;
        this.currency = str4;
        this.description = str5;
        this.isLiveMode = z;
        this.paymentMethod = paymentMethod;
        this.paymentMethodId = str6;
        this.receiptEmail = str7;
        this.status = status;
        this.setupFutureUsage = usage;
        this.lastPaymentError = error;
        this.shipping = shipping;
        this.unactivatedPaymentMethods = unactivatedPaymentMethods;
        this.linkFundingSources = linkFundingSources;
        this.nextActionData = nextActionData;
        this.paymentMethodOptionsJsonString = str8;
    }

    private final String component24() {
        return this.paymentMethodOptionsJsonString;
    }

    @JvmStatic
    public static final PaymentIntent fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    private final boolean isTopLevelSetupFutureUsageSet() {
        int i;
        StripeIntent.Usage usage = this.setupFutureUsage;
        if (usage == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[usage.ordinal()];
        }
        if (i == -1) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String component1() {
        return getId();
    }

    public final long component10() {
        return getCreated();
    }

    public final String component11() {
        return this.currency;
    }

    public final String component12() {
        return getDescription();
    }

    public final boolean component13() {
        return isLiveMode();
    }

    public final PaymentMethod component14() {
        return getPaymentMethod();
    }

    public final String component15() {
        return getPaymentMethodId();
    }

    public final String component16() {
        return this.receiptEmail;
    }

    public final StripeIntent.Status component17() {
        return getStatus();
    }

    public final StripeIntent.Usage component18() {
        return this.setupFutureUsage;
    }

    public final Error component19() {
        return this.lastPaymentError;
    }

    public final List<String> component2() {
        return getPaymentMethodTypes();
    }

    public final Shipping component20() {
        return this.shipping;
    }

    public final List<String> component21() {
        return getUnactivatedPaymentMethods();
    }

    public final List<String> component22() {
        return getLinkFundingSources();
    }

    public final StripeIntent.NextActionData component23() {
        return getNextActionData();
    }

    public final Long component3() {
        return this.amount;
    }

    public final long component4() {
        return this.canceledAt;
    }

    public final CancellationReason component5() {
        return this.cancellationReason;
    }

    public final CaptureMethod component6() {
        return this.captureMethod;
    }

    public final String component7() {
        return getClientSecret();
    }

    public final ConfirmationMethod component8() {
        return this.confirmationMethod;
    }

    public final String component9() {
        return this.countryCode;
    }

    public final PaymentIntent copy(String str, List<String> paymentMethodTypes, Long l, long j, CancellationReason cancellationReason, CaptureMethod captureMethod, String str2, ConfirmationMethod confirmationMethod, String str3, long j2, String str4, String str5, boolean z, PaymentMethod paymentMethod, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List<String> unactivatedPaymentMethods, List<String> linkFundingSources, StripeIntent.NextActionData nextActionData, String str8) {
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
        Intrinsics.checkNotNullParameter(confirmationMethod, "confirmationMethod");
        Intrinsics.checkNotNullParameter(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        Intrinsics.checkNotNullParameter(linkFundingSources, "linkFundingSources");
        return new PaymentIntent(str, paymentMethodTypes, l, j, cancellationReason, captureMethod, str2, confirmationMethod, str3, j2, str4, str5, z, paymentMethod, str6, str7, status, usage, error, shipping, unactivatedPaymentMethods, linkFundingSources, nextActionData, str8);
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
        if (obj instanceof PaymentIntent) {
            PaymentIntent paymentIntent = (PaymentIntent) obj;
            return Intrinsics.areEqual(getId(), paymentIntent.getId()) && Intrinsics.areEqual(getPaymentMethodTypes(), paymentIntent.getPaymentMethodTypes()) && Intrinsics.areEqual(this.amount, paymentIntent.amount) && this.canceledAt == paymentIntent.canceledAt && this.cancellationReason == paymentIntent.cancellationReason && this.captureMethod == paymentIntent.captureMethod && Intrinsics.areEqual(getClientSecret(), paymentIntent.getClientSecret()) && this.confirmationMethod == paymentIntent.confirmationMethod && Intrinsics.areEqual(this.countryCode, paymentIntent.countryCode) && getCreated() == paymentIntent.getCreated() && Intrinsics.areEqual(this.currency, paymentIntent.currency) && Intrinsics.areEqual(getDescription(), paymentIntent.getDescription()) && isLiveMode() == paymentIntent.isLiveMode() && Intrinsics.areEqual(getPaymentMethod(), paymentIntent.getPaymentMethod()) && Intrinsics.areEqual(getPaymentMethodId(), paymentIntent.getPaymentMethodId()) && Intrinsics.areEqual(this.receiptEmail, paymentIntent.receiptEmail) && getStatus() == paymentIntent.getStatus() && this.setupFutureUsage == paymentIntent.setupFutureUsage && Intrinsics.areEqual(this.lastPaymentError, paymentIntent.lastPaymentError) && Intrinsics.areEqual(this.shipping, paymentIntent.shipping) && Intrinsics.areEqual(getUnactivatedPaymentMethods(), paymentIntent.getUnactivatedPaymentMethods()) && Intrinsics.areEqual(getLinkFundingSources(), paymentIntent.getLinkFundingSources()) && Intrinsics.areEqual(getNextActionData(), paymentIntent.getNextActionData()) && Intrinsics.areEqual(this.paymentMethodOptionsJsonString, paymentIntent.paymentMethodOptionsJsonString);
        }
        return false;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final long getCanceledAt() {
        return this.canceledAt;
    }

    public final CancellationReason getCancellationReason() {
        return this.cancellationReason;
    }

    public final CaptureMethod getCaptureMethod() {
        return this.captureMethod;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getClientSecret() {
        return this.clientSecret;
    }

    public final ConfirmationMethod getConfirmationMethod() {
        return this.confirmationMethod;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.stripe.android.model.StripeIntent
    public long getCreated() {
        return this.created;
    }

    public final String getCurrency() {
        return this.currency;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getDescription() {
        return this.description;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.f75357id;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getLastErrorMessage() {
        Error error = this.lastPaymentError;
        if (error != null) {
            return error.getMessage();
        }
        return null;
    }

    public final Error getLastPaymentError() {
        return this.lastPaymentError;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getLinkFundingSources() {
        return this.linkFundingSources;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionData getNextActionData() {
        return this.nextActionData;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType getNextActionType() {
        boolean z;
        StripeIntent.NextActionData nextActionData = getNextActionData();
        if (nextActionData instanceof StripeIntent.NextActionData.SdkData) {
            return StripeIntent.NextActionType.UseStripeSdk;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.RedirectToUrl) {
            return StripeIntent.NextActionType.RedirectToUrl;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayOxxoDetails) {
            return StripeIntent.NextActionType.DisplayOxxoDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.VerifyWithMicrodeposits) {
            return StripeIntent.NextActionType.VerifyWithMicrodeposits;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.UpiAwaitNotification) {
            return StripeIntent.NextActionType.UpiAwaitNotification;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.CashAppRedirect) {
            return StripeIntent.NextActionType.CashAppRedirect;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.BlikAuthorize) {
            return StripeIntent.NextActionType.BlikAuthorize;
        }
        boolean z2 = true;
        if (nextActionData instanceof StripeIntent.NextActionData.AlipayRedirect) {
            z = true;
        } else {
            z = nextActionData instanceof StripeIntent.NextActionData.WeChatPayRedirect;
        }
        if (!z && nextActionData != null) {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.stripe.android.model.StripeIntent
    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final Map<String, Object> getPaymentMethodOptions() {
        Map<String, Object> emptyMap;
        Map<String, Object> jsonObjectToMap;
        String str = this.paymentMethodOptionsJsonString;
        if (str == null || (jsonObjectToMap = StripeJsonUtils.INSTANCE.jsonObjectToMap(new JSONObject(str))) == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }
        return jsonObjectToMap;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    public final String getReceiptEmail() {
        return this.receiptEmail;
    }

    public final StripeIntent.Usage getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.status;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getUnactivatedPaymentMethods() {
        return this.unactivatedPaymentMethods;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = (((getId() == null ? 0 : getId().hashCode()) * 31) + getPaymentMethodTypes().hashCode()) * 31;
        Long l = this.amount;
        int hashCode2 = (((hashCode + (l == null ? 0 : l.hashCode())) * 31) + Long.hashCode(this.canceledAt)) * 31;
        CancellationReason cancellationReason = this.cancellationReason;
        int hashCode3 = (((((((hashCode2 + (cancellationReason == null ? 0 : cancellationReason.hashCode())) * 31) + this.captureMethod.hashCode()) * 31) + (getClientSecret() == null ? 0 : getClientSecret().hashCode())) * 31) + this.confirmationMethod.hashCode()) * 31;
        String str = this.countryCode;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(getCreated())) * 31;
        String str2 = this.currency;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31;
        boolean isLiveMode = isLiveMode();
        int i = isLiveMode;
        if (isLiveMode) {
            i = 1;
        }
        int hashCode6 = (((((hashCode5 + i) * 31) + (getPaymentMethod() == null ? 0 : getPaymentMethod().hashCode())) * 31) + (getPaymentMethodId() == null ? 0 : getPaymentMethodId().hashCode())) * 31;
        String str3 = this.receiptEmail;
        int hashCode7 = (((hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31;
        StripeIntent.Usage usage = this.setupFutureUsage;
        int hashCode8 = (hashCode7 + (usage == null ? 0 : usage.hashCode())) * 31;
        Error error = this.lastPaymentError;
        int hashCode9 = (hashCode8 + (error == null ? 0 : error.hashCode())) * 31;
        Shipping shipping = this.shipping;
        int hashCode10 = (((((((hashCode9 + (shipping == null ? 0 : shipping.hashCode())) * 31) + getUnactivatedPaymentMethods().hashCode()) * 31) + getLinkFundingSources().hashCode()) * 31) + (getNextActionData() == null ? 0 : getNextActionData().hashCode())) * 31;
        String str4 = this.paymentMethodOptionsJsonString;
        return hashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean isConfirmed() {
        Set of;
        boolean contains;
        of = SetsKt__SetsKt.setOf((Object[]) new StripeIntent.Status[]{StripeIntent.Status.Processing, StripeIntent.Status.RequiresCapture, StripeIntent.Status.Succeeded});
        contains = CollectionsKt___CollectionsKt.contains(of, getStatus());
        return contains;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean isLiveMode() {
        return this.isLiveMode;
    }

    public final boolean isLpmLevelSetupFutureUsageSet(String code) {
        boolean z;
        JSONObject optJSONObject;
        Intrinsics.checkNotNullParameter(code, "code");
        if (isTopLevelSetupFutureUsageSet()) {
            return true;
        }
        if (this.paymentMethodOptionsJsonString != null && (optJSONObject = new JSONObject(this.paymentMethodOptionsJsonString).optJSONObject(code)) != null && optJSONObject.optString(PaymentMethodOptionsParams.USBankAccount.PARAM_SETUP_FUTURE_USAGE) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean requiresAction() {
        return getStatus() == StripeIntent.Status.RequiresAction;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean requiresConfirmation() {
        return getStatus() == StripeIntent.Status.RequiresConfirmation;
    }

    public String toString() {
        String id = getId();
        List<String> paymentMethodTypes = getPaymentMethodTypes();
        Long l = this.amount;
        long j = this.canceledAt;
        CancellationReason cancellationReason = this.cancellationReason;
        CaptureMethod captureMethod = this.captureMethod;
        String clientSecret = getClientSecret();
        ConfirmationMethod confirmationMethod = this.confirmationMethod;
        String str = this.countryCode;
        long created = getCreated();
        String str2 = this.currency;
        String description = getDescription();
        boolean isLiveMode = isLiveMode();
        PaymentMethod paymentMethod = getPaymentMethod();
        String paymentMethodId = getPaymentMethodId();
        String str3 = this.receiptEmail;
        StripeIntent.Status status = getStatus();
        StripeIntent.Usage usage = this.setupFutureUsage;
        Error error = this.lastPaymentError;
        Shipping shipping = this.shipping;
        List<String> unactivatedPaymentMethods = getUnactivatedPaymentMethods();
        List<String> linkFundingSources = getLinkFundingSources();
        StripeIntent.NextActionData nextActionData = getNextActionData();
        String str4 = this.paymentMethodOptionsJsonString;
        return "PaymentIntent(id=" + id + ", paymentMethodTypes=" + paymentMethodTypes + ", amount=" + l + ", canceledAt=" + j + ", cancellationReason=" + cancellationReason + ", captureMethod=" + captureMethod + ", clientSecret=" + clientSecret + ", confirmationMethod=" + confirmationMethod + ", countryCode=" + str + ", created=" + created + ", currency=" + str2 + ", description=" + description + ", isLiveMode=" + isLiveMode + ", paymentMethod=" + paymentMethod + ", paymentMethodId=" + paymentMethodId + ", receiptEmail=" + str3 + ", status=" + status + ", setupFutureUsage=" + usage + ", lastPaymentError=" + error + ", shipping=" + shipping + ", unactivatedPaymentMethods=" + unactivatedPaymentMethods + ", linkFundingSources=" + linkFundingSources + ", nextActionData=" + nextActionData + ", paymentMethodOptionsJsonString=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75357id);
        out.writeStringList(this.paymentMethodTypes);
        Long l = this.amount;
        if (l == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l.longValue());
        }
        out.writeLong(this.canceledAt);
        CancellationReason cancellationReason = this.cancellationReason;
        if (cancellationReason == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cancellationReason.name());
        }
        out.writeString(this.captureMethod.name());
        out.writeString(this.clientSecret);
        out.writeString(this.confirmationMethod.name());
        out.writeString(this.countryCode);
        out.writeLong(this.created);
        out.writeString(this.currency);
        out.writeString(this.description);
        out.writeInt(this.isLiveMode ? 1 : 0);
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            paymentMethod.writeToParcel(out, i);
        }
        out.writeString(this.paymentMethodId);
        out.writeString(this.receiptEmail);
        StripeIntent.Status status = this.status;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StripeIntent.Usage usage = this.setupFutureUsage;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        Error error = this.lastPaymentError;
        if (error == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            error.writeToParcel(out, i);
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shipping.writeToParcel(out, i);
        }
        out.writeStringList(this.unactivatedPaymentMethods);
        out.writeStringList(this.linkFundingSources);
        out.writeParcelable(this.nextActionData, i);
        out.writeString(this.paymentMethodOptionsJsonString);
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/model/PaymentIntent$Shipping;", "Lcom/stripe/android/core/model/StripeModel;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/model/Address;", "carrier", "", "name", PaymentMethod.BillingDetails.PARAM_PHONE, "trackingNumber", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getCarrier", "()Ljava/lang/String;", "getName", "getPhone", "getTrackingNumber", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Shipping implements StripeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;

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

        public Shipping(Address address, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.address = address;
            this.carrier = str;
            this.name = str2;
            this.phone = str3;
            this.trackingNumber = str4;
        }

        public static /* synthetic */ Shipping copy$default(Shipping shipping, Address address, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                address = shipping.address;
            }
            if ((i & 2) != 0) {
                str = shipping.carrier;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = shipping.name;
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

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.carrier;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final String component5() {
            return this.trackingNumber;
        }

        public final Shipping copy(Address address, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(address, "address");
            return new Shipping(address, str, str2, str3, str4);
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
            if (obj instanceof Shipping) {
                Shipping shipping = (Shipping) obj;
                return Intrinsics.areEqual(this.address, shipping.address) && Intrinsics.areEqual(this.carrier, shipping.carrier) && Intrinsics.areEqual(this.name, shipping.name) && Intrinsics.areEqual(this.phone, shipping.phone) && Intrinsics.areEqual(this.trackingNumber, shipping.trackingNumber);
            }
            return false;
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getCarrier() {
            return this.carrier;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getTrackingNumber() {
            return this.trackingNumber;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int hashCode = this.address.hashCode() * 31;
            String str = this.carrier;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackingNumber;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            Address address = this.address;
            String str = this.carrier;
            String str2 = this.name;
            String str3 = this.phone;
            String str4 = this.trackingNumber;
            return "Shipping(address=" + address + ", carrier=" + str + ", name=" + str2 + ", phone=" + str3 + ", trackingNumber=" + str4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.address.writeToParcel(out, i);
            out.writeString(this.carrier);
            out.writeString(this.name);
            out.writeString(this.phone);
            out.writeString(this.trackingNumber);
        }

        public /* synthetic */ Shipping(Address address, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PaymentIntent(String str, List list, Long l, long j, CancellationReason cancellationReason, CaptureMethod captureMethod, String str2, ConfirmationMethod confirmationMethod, String str3, long j2, String str4, String str5, boolean z, PaymentMethod paymentMethod, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List list2, List list3, StripeIntent.NextActionData nextActionData, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, l, r7, r9, r10, str2, r12, str3, j2, str4, r17, z, r19, r20, r21, r22, r23, r24, r25, list2, r27, (4194304 & i) != 0 ? null : nextActionData, (i & 8388608) != 0 ? null : str8);
        List list4;
        List emptyList;
        long j3 = (i & 8) != 0 ? 0L : j;
        CancellationReason cancellationReason2 = (i & 16) != 0 ? null : cancellationReason;
        CaptureMethod captureMethod2 = (i & 32) != 0 ? CaptureMethod.Automatic : captureMethod;
        ConfirmationMethod confirmationMethod2 = (i & 128) != 0 ? ConfirmationMethod.Automatic : confirmationMethod;
        String str9 = (i & 2048) != 0 ? null : str5;
        PaymentMethod paymentMethod2 = (i & 8192) != 0 ? null : paymentMethod;
        String str10 = (i & 16384) != 0 ? null : str6;
        String str11 = (32768 & i) != 0 ? null : str7;
        StripeIntent.Status status2 = (65536 & i) != 0 ? null : status;
        StripeIntent.Usage usage2 = (131072 & i) != 0 ? null : usage;
        Error error2 = (262144 & i) != 0 ? null : error;
        Shipping shipping2 = (524288 & i) != 0 ? null : shipping;
        if ((2097152 & i) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list4 = emptyList;
        } else {
            list4 = list3;
        }
    }
}
