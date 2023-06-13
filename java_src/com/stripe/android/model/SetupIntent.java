package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0004\\]^_B³\u0001\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010J\u001a\u00020\fHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÑ\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\t\u0010N\u001a\u00020OHÖ\u0001J\u0013\u0010P\u001a\u00020\f2\b\u0010Q\u001a\u0004\u0018\u00010RHÖ\u0003J\t\u0010S\u001a\u00020OHÖ\u0001J\b\u0010T\u001a\u00020\fH\u0016J\b\u0010U\u001a\u00020\fH\u0016J\t\u0010V\u001a\u00020\u0003HÖ\u0001J\u0019\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020OHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\b\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0014\u0010&\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010'R\u0016\u0010(\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010-R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006`"}, m28432d2 = {"Lcom/stripe/android/model/SetupIntent;", "Lcom/stripe/android/model/StripeIntent;", "id", "", "cancellationReason", "Lcom/stripe/android/model/SetupIntent$CancellationReason;", AnalyticsRequestV2.PARAM_CREATED, "", "countryCode", "clientSecret", "description", "isLiveMode", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "paymentMethodTypes", "", "status", "Lcom/stripe/android/model/StripeIntent$Status;", PaymentSheetEvent.FIELD_APPEARANCE_USAGE, "Lcom/stripe/android/model/StripeIntent$Usage;", "lastSetupError", "Lcom/stripe/android/model/SetupIntent$Error;", "unactivatedPaymentMethods", "linkFundingSources", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent$CancellationReason;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/SetupIntent$Error;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;)V", "getCancellationReason", "()Lcom/stripe/android/model/SetupIntent$CancellationReason;", "getClientSecret", "()Ljava/lang/String;", "getCountryCode", "getCreated", "()J", "getDescription", "getId", "isConfirmed", "()Z", "lastErrorMessage", "getLastErrorMessage", "getLastSetupError", "()Lcom/stripe/android/model/SetupIntent$Error;", "getLinkFundingSources", "()Ljava/util/List;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "nextActionType", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethodId", "getPaymentMethodTypes", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "getUnactivatedPaymentMethods", "getUsage", "()Lcom/stripe/android/model/StripeIntent$Usage;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "requiresAction", "requiresConfirmation", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CancellationReason", "ClientSecret", "Companion", "Error", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SetupIntent implements StripeIntent {
    private final CancellationReason cancellationReason;
    private final String clientSecret;
    private final String countryCode;
    private final long created;
    private final String description;

    /* renamed from: id */
    private final String f75361id;
    private final boolean isLiveMode;
    private final Error lastSetupError;
    private final List<String> linkFundingSources;
    private final StripeIntent.NextActionData nextActionData;
    private final PaymentMethod paymentMethod;
    private final String paymentMethodId;
    private final List<String> paymentMethodTypes;
    private final StripeIntent.Status status;
    private final List<String> unactivatedPaymentMethods;
    private final StripeIntent.Usage usage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SetupIntent> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/SetupIntent$CancellationReason;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "Duplicate", "RequestedByCustomer", "Abandoned", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum CancellationReason {
        Duplicate("duplicate"),
        RequestedByCustomer("requested_by_customer"),
        Abandoned("abandoned");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/SetupIntent$CancellationReason$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/SetupIntent$CancellationReason;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "fromCode$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nSetupIntent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetupIntent.kt\ncom/stripe/android/model/SetupIntent$CancellationReason$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,264:1\n1282#2,2:265\n*S KotlinDebug\n*F\n+ 1 SetupIntent.kt\ncom/stripe/android/model/SetupIntent$CancellationReason$Companion\n*L\n250#1:265,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CancellationReason fromCode$payments_core_release(String str) {
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

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/model/SetupIntent$ClientSecret;", "", "value", "", "(Ljava/lang/String;)V", "setupIntentId", "getSetupIntentId$payments_core_release", "()Ljava/lang/String;", "getValue$payments_core_release", "component1", "component1$payments_core_release", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSetupIntent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetupIntent.kt\ncom/stripe/android/model/SetupIntent$ClientSecret\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,264:1\n731#2,9:265\n37#3,2:274\n*S KotlinDebug\n*F\n+ 1 SetupIntent.kt\ncom/stripe/android/model/SetupIntent$ClientSecret\n*L\n225#1:265,9\n225#1:274,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class ClientSecret {
        public static final Companion Companion = new Companion(null);
        private static final Pattern PATTERN = Pattern.compile("^seti_[^_]+_secret_[^_]+$");
        private final String setupIntentId;
        private final String value;

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/SetupIntent$ClientSecret$Companion;", "", "()V", "PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "isMatch", "", "value", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
            this.setupIntentId = ((String[]) emptyList.toArray(new String[0]))[0];
            if (Companion.isMatch(this.value)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Setup Intent client secret: " + this.value).toString());
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

        public final String getSetupIntentId$payments_core_release() {
            return this.setupIntentId;
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/SetupIntent$Companion;", "", "()V", "fromJson", "Lcom/stripe/android/model/SetupIntent;", "jsonObject", "Lorg/json/JSONObject;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SetupIntent fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new SetupIntentJsonParser().parse(jSONObject);
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<SetupIntent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetupIntent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SetupIntent(parcel.readString(), parcel.readInt() == 0 ? null : CancellationReason.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() != 0 ? Error.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.NextActionData) parcel.readParcelable(SetupIntent.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetupIntent[] newArray(int i) {
            return new SetupIntent[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002,-BM\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003J]\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006."}, m28432d2 = {"Lcom/stripe/android/model/SetupIntent$Error;", "Lcom/stripe/android/core/model/StripeModel;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "declineCode", "docUrl", "message", "param", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "type", "Lcom/stripe/android/model/SetupIntent$Error$Type;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/SetupIntent$Error$Type;)V", "getCode", "()Ljava/lang/String;", "getDeclineCode", "getDocUrl", "getMessage", "getParam", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getType", "()Lcom/stripe/android/model/SetupIntent$Error$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Type", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Error implements StripeModel {
        public static final String CODE_AUTHENTICATION_ERROR = "setup_intent_authentication_failure";
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

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/SetupIntent$Error$Companion;", "", "()V", "CODE_AUTHENTICATION_ERROR", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
                return new Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/model/SetupIntent$Error$Type;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "ApiConnectionError", "ApiError", "AuthenticationError", "CardError", "IdempotencyError", "InvalidRequestError", "RateLimitError", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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

            @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/SetupIntent$Error$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/SetupIntent$Error$Type;", "typeCode", "", "fromCode$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nSetupIntent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetupIntent.kt\ncom/stripe/android/model/SetupIntent$Error$Type$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,264:1\n1282#2,2:265\n*S KotlinDebug\n*F\n+ 1 SetupIntent.kt\ncom/stripe/android/model/SetupIntent$Error$Type$Companion\n*L\n212#1:265,2\n*E\n"})
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Type fromCode$payments_core_release(String str) {
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

        public Error(String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod, Type type) {
            this.code = str;
            this.declineCode = str2;
            this.docUrl = str3;
            this.message = str4;
            this.param = str5;
            this.paymentMethod = paymentMethod;
            this.type = type;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod, Type type, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.code;
            }
            if ((i & 2) != 0) {
                str2 = error.declineCode;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = error.docUrl;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = error.message;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = error.param;
            }
            String str9 = str5;
            if ((i & 32) != 0) {
                paymentMethod = error.paymentMethod;
            }
            PaymentMethod paymentMethod2 = paymentMethod;
            if ((i & 64) != 0) {
                type = error.type;
            }
            return error.copy(str, str6, str7, str8, str9, paymentMethod2, type);
        }

        public final String component1() {
            return this.code;
        }

        public final String component2() {
            return this.declineCode;
        }

        public final String component3() {
            return this.docUrl;
        }

        public final String component4() {
            return this.message;
        }

        public final String component5() {
            return this.param;
        }

        public final PaymentMethod component6() {
            return this.paymentMethod;
        }

        public final Type component7() {
            return this.type;
        }

        public final Error copy(String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod, Type type) {
            return new Error(str, str2, str3, str4, str5, paymentMethod, type);
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
                return Intrinsics.areEqual(this.code, error.code) && Intrinsics.areEqual(this.declineCode, error.declineCode) && Intrinsics.areEqual(this.docUrl, error.docUrl) && Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.param, error.param) && Intrinsics.areEqual(this.paymentMethod, error.paymentMethod) && this.type == error.type;
            }
            return false;
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
            String str = this.code;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.declineCode;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.docUrl;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.message;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.param;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            int hashCode6 = (hashCode5 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            Type type = this.type;
            return hashCode6 + (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            String str = this.code;
            String str2 = this.declineCode;
            String str3 = this.docUrl;
            String str4 = this.message;
            String str5 = this.param;
            PaymentMethod paymentMethod = this.paymentMethod;
            Type type = this.type;
            return "Error(code=" + str + ", declineCode=" + str2 + ", docUrl=" + str3 + ", message=" + str4 + ", param=" + str5 + ", paymentMethod=" + paymentMethod + ", type=" + type + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
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

    public SetupIntent(String str, CancellationReason cancellationReason, long j, String str2, String str3, String str4, boolean z, PaymentMethod paymentMethod, String str5, List<String> paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, Error error, List<String> unactivatedPaymentMethods, List<String> linkFundingSources, StripeIntent.NextActionData nextActionData) {
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        Intrinsics.checkNotNullParameter(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        Intrinsics.checkNotNullParameter(linkFundingSources, "linkFundingSources");
        this.f75361id = str;
        this.cancellationReason = cancellationReason;
        this.created = j;
        this.countryCode = str2;
        this.clientSecret = str3;
        this.description = str4;
        this.isLiveMode = z;
        this.paymentMethod = paymentMethod;
        this.paymentMethodId = str5;
        this.paymentMethodTypes = paymentMethodTypes;
        this.status = status;
        this.usage = usage;
        this.lastSetupError = error;
        this.unactivatedPaymentMethods = unactivatedPaymentMethods;
        this.linkFundingSources = linkFundingSources;
        this.nextActionData = nextActionData;
    }

    @JvmStatic
    public static final SetupIntent fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return getId();
    }

    public final List<String> component10() {
        return getPaymentMethodTypes();
    }

    public final StripeIntent.Status component11() {
        return getStatus();
    }

    public final StripeIntent.Usage component12() {
        return this.usage;
    }

    public final Error component13() {
        return this.lastSetupError;
    }

    public final List<String> component14() {
        return getUnactivatedPaymentMethods();
    }

    public final List<String> component15() {
        return getLinkFundingSources();
    }

    public final StripeIntent.NextActionData component16() {
        return getNextActionData();
    }

    public final CancellationReason component2() {
        return this.cancellationReason;
    }

    public final long component3() {
        return getCreated();
    }

    public final String component4() {
        return this.countryCode;
    }

    public final String component5() {
        return getClientSecret();
    }

    public final String component6() {
        return getDescription();
    }

    public final boolean component7() {
        return isLiveMode();
    }

    public final PaymentMethod component8() {
        return getPaymentMethod();
    }

    public final String component9() {
        return getPaymentMethodId();
    }

    public final SetupIntent copy(String str, CancellationReason cancellationReason, long j, String str2, String str3, String str4, boolean z, PaymentMethod paymentMethod, String str5, List<String> paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, Error error, List<String> unactivatedPaymentMethods, List<String> linkFundingSources, StripeIntent.NextActionData nextActionData) {
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        Intrinsics.checkNotNullParameter(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        Intrinsics.checkNotNullParameter(linkFundingSources, "linkFundingSources");
        return new SetupIntent(str, cancellationReason, j, str2, str3, str4, z, paymentMethod, str5, paymentMethodTypes, status, usage, error, unactivatedPaymentMethods, linkFundingSources, nextActionData);
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
        if (obj instanceof SetupIntent) {
            SetupIntent setupIntent = (SetupIntent) obj;
            return Intrinsics.areEqual(getId(), setupIntent.getId()) && this.cancellationReason == setupIntent.cancellationReason && getCreated() == setupIntent.getCreated() && Intrinsics.areEqual(this.countryCode, setupIntent.countryCode) && Intrinsics.areEqual(getClientSecret(), setupIntent.getClientSecret()) && Intrinsics.areEqual(getDescription(), setupIntent.getDescription()) && isLiveMode() == setupIntent.isLiveMode() && Intrinsics.areEqual(getPaymentMethod(), setupIntent.getPaymentMethod()) && Intrinsics.areEqual(getPaymentMethodId(), setupIntent.getPaymentMethodId()) && Intrinsics.areEqual(getPaymentMethodTypes(), setupIntent.getPaymentMethodTypes()) && getStatus() == setupIntent.getStatus() && this.usage == setupIntent.usage && Intrinsics.areEqual(this.lastSetupError, setupIntent.lastSetupError) && Intrinsics.areEqual(getUnactivatedPaymentMethods(), setupIntent.getUnactivatedPaymentMethods()) && Intrinsics.areEqual(getLinkFundingSources(), setupIntent.getLinkFundingSources()) && Intrinsics.areEqual(getNextActionData(), setupIntent.getNextActionData());
        }
        return false;
    }

    public final CancellationReason getCancellationReason() {
        return this.cancellationReason;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getClientSecret() {
        return this.clientSecret;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.stripe.android.model.StripeIntent
    public long getCreated() {
        return this.created;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getDescription() {
        return this.description;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.f75361id;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getLastErrorMessage() {
        Error error = this.lastSetupError;
        if (error != null) {
            return error.getMessage();
        }
        return null;
    }

    public final Error getLastSetupError() {
        return this.lastSetupError;
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
        boolean z2;
        boolean z3;
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
        if (nextActionData instanceof StripeIntent.NextActionData.CashAppRedirect) {
            return StripeIntent.NextActionType.CashAppRedirect;
        }
        boolean z4 = true;
        if (nextActionData instanceof StripeIntent.NextActionData.AlipayRedirect) {
            z = true;
        } else {
            z = nextActionData instanceof StripeIntent.NextActionData.BlikAuthorize;
        }
        if (z) {
            z2 = true;
        } else {
            z2 = nextActionData instanceof StripeIntent.NextActionData.WeChatPayRedirect;
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = nextActionData instanceof StripeIntent.NextActionData.UpiAwaitNotification;
        }
        if (!z3 && nextActionData != null) {
            z4 = false;
        }
        if (z4) {
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

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.status;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getUnactivatedPaymentMethods() {
        return this.unactivatedPaymentMethods;
    }

    public final StripeIntent.Usage getUsage() {
        return this.usage;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = (getId() == null ? 0 : getId().hashCode()) * 31;
        CancellationReason cancellationReason = this.cancellationReason;
        int hashCode2 = (((hashCode + (cancellationReason == null ? 0 : cancellationReason.hashCode())) * 31) + Long.hashCode(getCreated())) * 31;
        String str = this.countryCode;
        int hashCode3 = (((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (getClientSecret() == null ? 0 : getClientSecret().hashCode())) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31;
        boolean isLiveMode = isLiveMode();
        int i = isLiveMode;
        if (isLiveMode) {
            i = 1;
        }
        int hashCode4 = (((((((((hashCode3 + i) * 31) + (getPaymentMethod() == null ? 0 : getPaymentMethod().hashCode())) * 31) + (getPaymentMethodId() == null ? 0 : getPaymentMethodId().hashCode())) * 31) + getPaymentMethodTypes().hashCode()) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31;
        StripeIntent.Usage usage = this.usage;
        int hashCode5 = (hashCode4 + (usage == null ? 0 : usage.hashCode())) * 31;
        Error error = this.lastSetupError;
        return ((((((hashCode5 + (error == null ? 0 : error.hashCode())) * 31) + getUnactivatedPaymentMethods().hashCode()) * 31) + getLinkFundingSources().hashCode()) * 31) + (getNextActionData() != null ? getNextActionData().hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean isConfirmed() {
        Set of;
        boolean contains;
        of = SetsKt__SetsKt.setOf((Object[]) new StripeIntent.Status[]{StripeIntent.Status.Processing, StripeIntent.Status.Succeeded});
        contains = CollectionsKt___CollectionsKt.contains(of, getStatus());
        return contains;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean isLiveMode() {
        return this.isLiveMode;
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
        CancellationReason cancellationReason = this.cancellationReason;
        long created = getCreated();
        String str = this.countryCode;
        String clientSecret = getClientSecret();
        String description = getDescription();
        boolean isLiveMode = isLiveMode();
        PaymentMethod paymentMethod = getPaymentMethod();
        String paymentMethodId = getPaymentMethodId();
        List<String> paymentMethodTypes = getPaymentMethodTypes();
        StripeIntent.Status status = getStatus();
        StripeIntent.Usage usage = this.usage;
        Error error = this.lastSetupError;
        List<String> unactivatedPaymentMethods = getUnactivatedPaymentMethods();
        List<String> linkFundingSources = getLinkFundingSources();
        StripeIntent.NextActionData nextActionData = getNextActionData();
        return "SetupIntent(id=" + id + ", cancellationReason=" + cancellationReason + ", created=" + created + ", countryCode=" + str + ", clientSecret=" + clientSecret + ", description=" + description + ", isLiveMode=" + isLiveMode + ", paymentMethod=" + paymentMethod + ", paymentMethodId=" + paymentMethodId + ", paymentMethodTypes=" + paymentMethodTypes + ", status=" + status + ", usage=" + usage + ", lastSetupError=" + error + ", unactivatedPaymentMethods=" + unactivatedPaymentMethods + ", linkFundingSources=" + linkFundingSources + ", nextActionData=" + nextActionData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75361id);
        CancellationReason cancellationReason = this.cancellationReason;
        if (cancellationReason == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cancellationReason.name());
        }
        out.writeLong(this.created);
        out.writeString(this.countryCode);
        out.writeString(this.clientSecret);
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
        out.writeStringList(this.paymentMethodTypes);
        StripeIntent.Status status = this.status;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StripeIntent.Usage usage = this.usage;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        Error error = this.lastSetupError;
        if (error == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            error.writeToParcel(out, i);
        }
        out.writeStringList(this.unactivatedPaymentMethods);
        out.writeStringList(this.linkFundingSources);
        out.writeParcelable(this.nextActionData, i);
    }

    public /* synthetic */ SetupIntent(String str, CancellationReason cancellationReason, long j, String str2, String str3, String str4, boolean z, PaymentMethod paymentMethod, String str5, List list, StripeIntent.Status status, StripeIntent.Usage usage, Error error, List list2, List list3, StripeIntent.NextActionData nextActionData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cancellationReason, j, str2, str3, str4, z, (i & 128) != 0 ? null : paymentMethod, str5, list, status, usage, (i & 4096) != 0 ? null : error, list2, list3, nextActionData);
    }
}
