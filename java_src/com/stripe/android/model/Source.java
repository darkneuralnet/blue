package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.adyen.checkout.components.model.payments.response.RedirectAction;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.parsers.SourceJsonParser;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b@\b\u0087\b\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u0002:\u0014\u0081\u0001\u0080\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001B\u0089\u0002\b\u0000\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001c\u0012\u0018\b\u0002\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001e\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010!\u0012\u0006\u00108\u001a\u00020\u0007\u0012\u0006\u00109\u001a\u00020\u0007\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b~\u0010\u007fJ\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0019\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001eHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010'HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0096\u0002\u0010?\u001a\u00020\u00002\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001c2\u0018\b\u0002\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001e2\n\b\u0002\u00107\u001a\u0004\u0018\u00010!2\b\b\u0002\u00108\u001a\u00020\u00072\b\b\u0002\u00109\u001a\u00020\u00072\n\b\u0002\u0010:\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010=\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b?\u0010@J\t\u0010A\u001a\u00020\u0007HÖ\u0001J\t\u0010C\u001a\u00020BHÖ\u0001J\u0013\u0010E\u001a\u00020\u00132\b\u0010D\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010F\u001a\u00020BHÖ\u0001J\u0019\u0010K\u001a\u00020J2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020BHÖ\u0001R\u001c\u0010*\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010+\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u0010O\u001a\u0004\bP\u0010\u000bR\u0019\u0010,\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010L\u001a\u0004\bQ\u0010NR\u0019\u0010-\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b-\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010.\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010O\u001a\u0004\bU\u0010\u000bR\u0019\u0010/\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b/\u0010L\u001a\u0004\bV\u0010NR\u0019\u00100\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b0\u0010W\u001a\u0004\bX\u0010YR\u0019\u00101\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b1\u0010Z\u001a\u0004\b1\u0010\u0015R\u0019\u00102\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b2\u0010[\u001a\u0004\b\\\u0010]R\u0019\u00103\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b3\u0010^\u001a\u0004\b_\u0010`R\u0019\u00104\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b4\u0010a\u001a\u0004\bb\u0010cR\u0019\u00105\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b5\u0010d\u001a\u0004\be\u0010fR'\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b6\u0010g\u001a\u0004\bh\u0010iR\u0019\u00107\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b7\u0010j\u001a\u0004\bk\u0010lR\u0017\u00108\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u0010L\u001a\u0004\bm\u0010NR\u0017\u00109\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010L\u001a\u0004\bn\u0010NR\u0019\u0010:\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b:\u0010o\u001a\u0004\bp\u0010qR\u0016\u0010;\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010rR\u0016\u0010<\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010sR\u0019\u0010=\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b=\u0010t\u001a\u0004\bu\u0010vR\u0019\u0010>\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b>\u0010L\u001a\u0004\bw\u0010NR\u0011\u0010z\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0011\u0010}\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006\u008a\u0001"}, m28432d2 = {"Lcom/stripe/android/model/Source;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "Lcom/stripe/android/model/WeChat;", "component18", "Lcom/stripe/android/model/Source$Klarna;", "component19", "", "component1", "", "component2", "()Ljava/lang/Long;", "component3", "Lcom/stripe/android/model/Source$CodeVerification;", "component4", "component5", "component6", "Lcom/stripe/android/model/Source$Flow;", "component7", "", "component8", "()Ljava/lang/Boolean;", "Lcom/stripe/android/model/Source$Owner;", "component9", "Lcom/stripe/android/model/Source$Receiver;", "component10", "Lcom/stripe/android/model/Source$Redirect;", "component11", "Lcom/stripe/android/model/Source$Status;", "component12", "", "", "component13", "Lcom/stripe/android/model/SourceTypeModel;", "component14", "component15", "component16", "Lcom/stripe/android/model/Source$Usage;", "component17", "Lcom/stripe/android/model/SourceOrder;", "component20", "component21", "id", "amount", "clientSecret", "codeVerification", AnalyticsRequestV2.PARAM_CREATED, "currency", "flow", "isLiveMode", "owner", "receiver", RedirectAction.ACTION_TYPE, "status", "sourceTypeData", "sourceTypeModel", "type", "typeRaw", PaymentSheetEvent.FIELD_APPEARANCE_USAGE, "_weChat", "_klarna", "sourceOrder", "statementDescriptor", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)Lcom/stripe/android/model/Source;", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Long;", "getAmount", "getClientSecret", "Lcom/stripe/android/model/Source$CodeVerification;", "getCodeVerification", "()Lcom/stripe/android/model/Source$CodeVerification;", "getCreated", "getCurrency", "Lcom/stripe/android/model/Source$Flow;", "getFlow", "()Lcom/stripe/android/model/Source$Flow;", "Ljava/lang/Boolean;", "Lcom/stripe/android/model/Source$Owner;", "getOwner", "()Lcom/stripe/android/model/Source$Owner;", "Lcom/stripe/android/model/Source$Receiver;", "getReceiver", "()Lcom/stripe/android/model/Source$Receiver;", "Lcom/stripe/android/model/Source$Redirect;", "getRedirect", "()Lcom/stripe/android/model/Source$Redirect;", "Lcom/stripe/android/model/Source$Status;", "getStatus", "()Lcom/stripe/android/model/Source$Status;", "Ljava/util/Map;", "getSourceTypeData", "()Ljava/util/Map;", "Lcom/stripe/android/model/SourceTypeModel;", "getSourceTypeModel", "()Lcom/stripe/android/model/SourceTypeModel;", "getType", "getTypeRaw", "Lcom/stripe/android/model/Source$Usage;", "getUsage", "()Lcom/stripe/android/model/Source$Usage;", "Lcom/stripe/android/model/WeChat;", "Lcom/stripe/android/model/Source$Klarna;", "Lcom/stripe/android/model/SourceOrder;", "getSourceOrder", "()Lcom/stripe/android/model/SourceOrder;", "getStatementDescriptor", "getWeChat", "()Lcom/stripe/android/model/WeChat;", "weChat", "getKlarna", "()Lcom/stripe/android/model/Source$Klarna;", "klarna", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)V", "Companion", "CodeVerification", "Flow", "Klarna", "Owner", "Receiver", "Redirect", "SourceType", "Status", "Usage", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class Source implements StripeModel, StripePaymentSource {
    public static final String EURO = "eur";
    public static final String USD = "usd";
    private final Klarna _klarna;
    private final WeChat _weChat;
    private final Long amount;
    private final String clientSecret;
    private final CodeVerification codeVerification;
    private final Long created;
    private final String currency;
    private final Flow flow;

    /* renamed from: id */
    private final String f75362id;
    private final Boolean isLiveMode;
    private final Owner owner;
    private final Receiver receiver;
    private final Redirect redirect;
    private final SourceOrder sourceOrder;
    private final Map<String, Object> sourceTypeData;
    private final SourceTypeModel sourceTypeModel;
    private final String statementDescriptor;
    private final Status status;
    private final String type;
    private final String typeRaw;
    private final Usage usage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Source> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/model/Source$CodeVerification;", "Lcom/stripe/android/core/model/StripeModel;", "attemptsRemaining", "", "status", "Lcom/stripe/android/model/Source$CodeVerification$Status;", "(ILcom/stripe/android/model/Source$CodeVerification$Status;)V", "getAttemptsRemaining", "()I", "getStatus", "()Lcom/stripe/android/model/Source$CodeVerification$Status;", "component1", "component2", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Status", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class CodeVerification implements StripeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<CodeVerification> CREATOR = new Creator();
        private final int attemptsRemaining;
        private final Status status;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<CodeVerification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CodeVerification createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CodeVerification(parcel.readInt(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CodeVerification[] newArray(int i) {
                return new CodeVerification[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/Source$CodeVerification$Status;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Pending", "Succeeded", "Failed", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum Status {
            Pending("pending"),
            Succeeded("succeeded"),
            Failed("failed");
            
            public static final Companion Companion = new Companion(null);
            private final String code;

            @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/Source$CodeVerification$Status$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/Source$CodeVerification$Status;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Source.kt\ncom/stripe/android/model/Source$CodeVerification$Status$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,449:1\n1282#2,2:450\n*S KotlinDebug\n*F\n+ 1 Source.kt\ncom/stripe/android/model/Source$CodeVerification$Status$Companion\n*L\n300#1:450,2\n*E\n"})
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Status fromCode(String str) {
                    Status[] values;
                    for (Status status : Status.values()) {
                        if (Intrinsics.areEqual(status.code, str)) {
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

            @Override // java.lang.Enum
            public String toString() {
                return this.code;
            }
        }

        public CodeVerification(int i, Status status) {
            this.attemptsRemaining = i;
            this.status = status;
        }

        public static /* synthetic */ CodeVerification copy$default(CodeVerification codeVerification, int i, Status status, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = codeVerification.attemptsRemaining;
            }
            if ((i2 & 2) != 0) {
                status = codeVerification.status;
            }
            return codeVerification.copy(i, status);
        }

        public final int component1() {
            return this.attemptsRemaining;
        }

        public final Status component2() {
            return this.status;
        }

        public final CodeVerification copy(int i, Status status) {
            return new CodeVerification(i, status);
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
            if (obj instanceof CodeVerification) {
                CodeVerification codeVerification = (CodeVerification) obj;
                return this.attemptsRemaining == codeVerification.attemptsRemaining && this.status == codeVerification.status;
            }
            return false;
        }

        public final int getAttemptsRemaining() {
            return this.attemptsRemaining;
        }

        public final Status getStatus() {
            return this.status;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int hashCode = Integer.hashCode(this.attemptsRemaining) * 31;
            Status status = this.status;
            return hashCode + (status == null ? 0 : status.hashCode());
        }

        public String toString() {
            int i = this.attemptsRemaining;
            Status status = this.status;
            return "CodeVerification(attemptsRemaining=" + i + ", status=" + status + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.attemptsRemaining);
            Status status = this.status;
            if (status == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(status.name());
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/Source$Companion;", "", "()V", "EURO", "", "USD", "asSourceType", "sourceType", "fromJson", "Lcom/stripe/android/model/Source;", "jsonObject", "Lorg/json/JSONObject;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final String asSourceType(String str) {
            String str2;
            if (str == null) {
                return "unknown";
            }
            switch (str.hashCode()) {
                case -1920743119:
                    str2 = "bancontact";
                    if (!str.equals("bancontact")) {
                        return "unknown";
                    }
                    break;
                case -1414960566:
                    str2 = "alipay";
                    if (!str.equals("alipay")) {
                        return "unknown";
                    }
                    break;
                case -896955097:
                    str2 = "sofort";
                    if (!str.equals("sofort")) {
                        return "unknown";
                    }
                    break;
                case -825238221:
                    str2 = "three_d_secure";
                    if (!str.equals("three_d_secure")) {
                        return "unknown";
                    }
                    break;
                case -791770330:
                    str2 = "wechat";
                    if (!str.equals("wechat")) {
                        return "unknown";
                    }
                    break;
                case -284840886:
                    str.equals("unknown");
                    return "unknown";
                case 100648:
                    str2 = "eps";
                    if (!str.equals("eps")) {
                        return "unknown";
                    }
                    break;
                case 109234:
                    str2 = "p24";
                    if (!str.equals("p24")) {
                        return "unknown";
                    }
                    break;
                case 3046160:
                    str2 = "card";
                    if (!str.equals("card")) {
                        return "unknown";
                    }
                    break;
                case 38358441:
                    str2 = "giropay";
                    if (!str.equals("giropay")) {
                        return "unknown";
                    }
                    break;
                case 100048981:
                    str2 = "ideal";
                    if (!str.equals("ideal")) {
                        return "unknown";
                    }
                    break;
                case 1251821346:
                    str2 = "multibanco";
                    if (!str.equals("multibanco")) {
                        return "unknown";
                    }
                    break;
                case 1636477296:
                    str2 = "sepa_debit";
                    if (!str.equals("sepa_debit")) {
                        return "unknown";
                    }
                    break;
                default:
                    return "unknown";
            }
            return str2;
        }

        @JvmStatic
        public final Source fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new SourceJsonParser().parse2(jSONObject);
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<Source> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Status status;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString2 = parcel.readString();
            CodeVerification createFromParcel = parcel.readInt() == 0 ? null : CodeVerification.CREATOR.createFromParcel(parcel);
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString3 = parcel.readString();
            Flow valueOf4 = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Owner createFromParcel2 = parcel.readInt() == 0 ? null : Owner.CREATOR.createFromParcel(parcel);
            Receiver createFromParcel3 = parcel.readInt() == 0 ? null : Receiver.CREATOR.createFromParcel(parcel);
            Redirect createFromParcel4 = parcel.readInt() == 0 ? null : Redirect.CREATOR.createFromParcel(parcel);
            Status valueOf5 = parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                status = valueOf5;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                while (i != readInt) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(Source.class.getClassLoader()));
                    i++;
                    readInt = readInt;
                    valueOf5 = valueOf5;
                }
                status = valueOf5;
                linkedHashMap = linkedHashMap2;
            }
            return new Source(readString, valueOf2, readString2, createFromParcel, valueOf3, readString3, valueOf4, valueOf, createFromParcel2, createFromParcel3, createFromParcel4, status, linkedHashMap, (SourceTypeModel) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : WeChat.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Klarna.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SourceOrder.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source[] newArray(int i) {
            return new Source[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/model/Source$Flow;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "toString", "Redirect", "Receiver", "CodeVerification", "None", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Flow {
        Redirect(RedirectAction.ACTION_TYPE),
        Receiver("receiver"),
        CodeVerification("code_verification"),
        None("none");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/Source$Flow$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/Source$Flow;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Source.kt\ncom/stripe/android/model/Source$Flow$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,449:1\n1282#2,2:450\n*S KotlinDebug\n*F\n+ 1 Source.kt\ncom/stripe/android/model/Source$Flow$Companion\n*L\n226#1:450,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Flow fromCode(String str) {
                Flow[] values;
                for (Flow flow : Flow.values()) {
                    if (Intrinsics.areEqual(flow.getCode$payments_core_release(), str)) {
                        return flow;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        Flow(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jé\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0001J\t\u0010>\u001a\u00020?HÖ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020?HÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\u0019\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020?HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006K"}, m28432d2 = {"Lcom/stripe/android/model/Source$Klarna;", "Lcom/stripe/android/core/model/StripeModel;", "firstName", "", "lastName", "purchaseCountry", "clientToken", "payNowAssetUrlsDescriptive", "payNowAssetUrlsStandard", "payNowName", "payNowRedirectUrl", "payLaterAssetUrlsDescriptive", "payLaterAssetUrlsStandard", "payLaterName", "payLaterRedirectUrl", "payOverTimeAssetUrlsDescriptive", "payOverTimeAssetUrlsStandard", "payOverTimeName", "payOverTimeRedirectUrl", "paymentMethodCategories", "", "customPaymentMethods", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "getClientToken", "()Ljava/lang/String;", "getCustomPaymentMethods", "()Ljava/util/Set;", "getFirstName", "getLastName", "getPayLaterAssetUrlsDescriptive", "getPayLaterAssetUrlsStandard", "getPayLaterName", "getPayLaterRedirectUrl", "getPayNowAssetUrlsDescriptive", "getPayNowAssetUrlsStandard", "getPayNowName", "getPayNowRedirectUrl", "getPayOverTimeAssetUrlsDescriptive", "getPayOverTimeAssetUrlsStandard", "getPayOverTimeName", "getPayOverTimeRedirectUrl", "getPaymentMethodCategories", "getPurchaseCountry", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Klarna implements StripeModel {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Klarna> CREATOR = new Creator();
        private final String clientToken;
        private final Set<String> customPaymentMethods;
        private final String firstName;
        private final String lastName;
        private final String payLaterAssetUrlsDescriptive;
        private final String payLaterAssetUrlsStandard;
        private final String payLaterName;
        private final String payLaterRedirectUrl;
        private final String payNowAssetUrlsDescriptive;
        private final String payNowAssetUrlsStandard;
        private final String payNowName;
        private final String payNowRedirectUrl;
        private final String payOverTimeAssetUrlsDescriptive;
        private final String payOverTimeAssetUrlsStandard;
        private final String payOverTimeName;
        private final String payOverTimeRedirectUrl;
        private final Set<String> paymentMethodCategories;
        private final String purchaseCountry;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Klarna> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Klarna createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                int i = 0;
                while (i != readInt) {
                    linkedHashSet.add(parcel.readString());
                    i++;
                    readInt = readInt;
                }
                int readInt2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    linkedHashSet2.add(parcel.readString());
                    i2++;
                    readInt2 = readInt2;
                }
                return new Klarna(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, linkedHashSet, linkedHashSet2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Klarna[] newArray(int i) {
                return new Klarna[i];
            }
        }

        public Klarna(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set<String> paymentMethodCategories, Set<String> customPaymentMethods) {
            Intrinsics.checkNotNullParameter(paymentMethodCategories, "paymentMethodCategories");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            this.firstName = str;
            this.lastName = str2;
            this.purchaseCountry = str3;
            this.clientToken = str4;
            this.payNowAssetUrlsDescriptive = str5;
            this.payNowAssetUrlsStandard = str6;
            this.payNowName = str7;
            this.payNowRedirectUrl = str8;
            this.payLaterAssetUrlsDescriptive = str9;
            this.payLaterAssetUrlsStandard = str10;
            this.payLaterName = str11;
            this.payLaterRedirectUrl = str12;
            this.payOverTimeAssetUrlsDescriptive = str13;
            this.payOverTimeAssetUrlsStandard = str14;
            this.payOverTimeName = str15;
            this.payOverTimeRedirectUrl = str16;
            this.paymentMethodCategories = paymentMethodCategories;
            this.customPaymentMethods = customPaymentMethods;
        }

        public final String component1() {
            return this.firstName;
        }

        public final String component10() {
            return this.payLaterAssetUrlsStandard;
        }

        public final String component11() {
            return this.payLaterName;
        }

        public final String component12() {
            return this.payLaterRedirectUrl;
        }

        public final String component13() {
            return this.payOverTimeAssetUrlsDescriptive;
        }

        public final String component14() {
            return this.payOverTimeAssetUrlsStandard;
        }

        public final String component15() {
            return this.payOverTimeName;
        }

        public final String component16() {
            return this.payOverTimeRedirectUrl;
        }

        public final Set<String> component17() {
            return this.paymentMethodCategories;
        }

        public final Set<String> component18() {
            return this.customPaymentMethods;
        }

        public final String component2() {
            return this.lastName;
        }

        public final String component3() {
            return this.purchaseCountry;
        }

        public final String component4() {
            return this.clientToken;
        }

        public final String component5() {
            return this.payNowAssetUrlsDescriptive;
        }

        public final String component6() {
            return this.payNowAssetUrlsStandard;
        }

        public final String component7() {
            return this.payNowName;
        }

        public final String component8() {
            return this.payNowRedirectUrl;
        }

        public final String component9() {
            return this.payLaterAssetUrlsDescriptive;
        }

        public final Klarna copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set<String> paymentMethodCategories, Set<String> customPaymentMethods) {
            Intrinsics.checkNotNullParameter(paymentMethodCategories, "paymentMethodCategories");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            return new Klarna(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, paymentMethodCategories, customPaymentMethods);
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
            if (obj instanceof Klarna) {
                Klarna klarna = (Klarna) obj;
                return Intrinsics.areEqual(this.firstName, klarna.firstName) && Intrinsics.areEqual(this.lastName, klarna.lastName) && Intrinsics.areEqual(this.purchaseCountry, klarna.purchaseCountry) && Intrinsics.areEqual(this.clientToken, klarna.clientToken) && Intrinsics.areEqual(this.payNowAssetUrlsDescriptive, klarna.payNowAssetUrlsDescriptive) && Intrinsics.areEqual(this.payNowAssetUrlsStandard, klarna.payNowAssetUrlsStandard) && Intrinsics.areEqual(this.payNowName, klarna.payNowName) && Intrinsics.areEqual(this.payNowRedirectUrl, klarna.payNowRedirectUrl) && Intrinsics.areEqual(this.payLaterAssetUrlsDescriptive, klarna.payLaterAssetUrlsDescriptive) && Intrinsics.areEqual(this.payLaterAssetUrlsStandard, klarna.payLaterAssetUrlsStandard) && Intrinsics.areEqual(this.payLaterName, klarna.payLaterName) && Intrinsics.areEqual(this.payLaterRedirectUrl, klarna.payLaterRedirectUrl) && Intrinsics.areEqual(this.payOverTimeAssetUrlsDescriptive, klarna.payOverTimeAssetUrlsDescriptive) && Intrinsics.areEqual(this.payOverTimeAssetUrlsStandard, klarna.payOverTimeAssetUrlsStandard) && Intrinsics.areEqual(this.payOverTimeName, klarna.payOverTimeName) && Intrinsics.areEqual(this.payOverTimeRedirectUrl, klarna.payOverTimeRedirectUrl) && Intrinsics.areEqual(this.paymentMethodCategories, klarna.paymentMethodCategories) && Intrinsics.areEqual(this.customPaymentMethods, klarna.customPaymentMethods);
            }
            return false;
        }

        public final String getClientToken() {
            return this.clientToken;
        }

        public final Set<String> getCustomPaymentMethods() {
            return this.customPaymentMethods;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getPayLaterAssetUrlsDescriptive() {
            return this.payLaterAssetUrlsDescriptive;
        }

        public final String getPayLaterAssetUrlsStandard() {
            return this.payLaterAssetUrlsStandard;
        }

        public final String getPayLaterName() {
            return this.payLaterName;
        }

        public final String getPayLaterRedirectUrl() {
            return this.payLaterRedirectUrl;
        }

        public final String getPayNowAssetUrlsDescriptive() {
            return this.payNowAssetUrlsDescriptive;
        }

        public final String getPayNowAssetUrlsStandard() {
            return this.payNowAssetUrlsStandard;
        }

        public final String getPayNowName() {
            return this.payNowName;
        }

        public final String getPayNowRedirectUrl() {
            return this.payNowRedirectUrl;
        }

        public final String getPayOverTimeAssetUrlsDescriptive() {
            return this.payOverTimeAssetUrlsDescriptive;
        }

        public final String getPayOverTimeAssetUrlsStandard() {
            return this.payOverTimeAssetUrlsStandard;
        }

        public final String getPayOverTimeName() {
            return this.payOverTimeName;
        }

        public final String getPayOverTimeRedirectUrl() {
            return this.payOverTimeRedirectUrl;
        }

        public final Set<String> getPaymentMethodCategories() {
            return this.paymentMethodCategories;
        }

        public final String getPurchaseCountry() {
            return this.purchaseCountry;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.firstName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lastName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.purchaseCountry;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.clientToken;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.payNowAssetUrlsDescriptive;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.payNowAssetUrlsStandard;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.payNowName;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.payNowRedirectUrl;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.payLaterAssetUrlsDescriptive;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.payLaterAssetUrlsStandard;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.payLaterName;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.payLaterRedirectUrl;
            int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.payOverTimeAssetUrlsDescriptive;
            int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.payOverTimeAssetUrlsStandard;
            int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.payOverTimeName;
            int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.payOverTimeRedirectUrl;
            return ((((hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31) + this.paymentMethodCategories.hashCode()) * 31) + this.customPaymentMethods.hashCode();
        }

        public String toString() {
            String str = this.firstName;
            String str2 = this.lastName;
            String str3 = this.purchaseCountry;
            String str4 = this.clientToken;
            String str5 = this.payNowAssetUrlsDescriptive;
            String str6 = this.payNowAssetUrlsStandard;
            String str7 = this.payNowName;
            String str8 = this.payNowRedirectUrl;
            String str9 = this.payLaterAssetUrlsDescriptive;
            String str10 = this.payLaterAssetUrlsStandard;
            String str11 = this.payLaterName;
            String str12 = this.payLaterRedirectUrl;
            String str13 = this.payOverTimeAssetUrlsDescriptive;
            String str14 = this.payOverTimeAssetUrlsStandard;
            String str15 = this.payOverTimeName;
            String str16 = this.payOverTimeRedirectUrl;
            Set<String> set = this.paymentMethodCategories;
            Set<String> set2 = this.customPaymentMethods;
            return "Klarna(firstName=" + str + ", lastName=" + str2 + ", purchaseCountry=" + str3 + ", clientToken=" + str4 + ", payNowAssetUrlsDescriptive=" + str5 + ", payNowAssetUrlsStandard=" + str6 + ", payNowName=" + str7 + ", payNowRedirectUrl=" + str8 + ", payLaterAssetUrlsDescriptive=" + str9 + ", payLaterAssetUrlsStandard=" + str10 + ", payLaterName=" + str11 + ", payLaterRedirectUrl=" + str12 + ", payOverTimeAssetUrlsDescriptive=" + str13 + ", payOverTimeAssetUrlsStandard=" + str14 + ", payOverTimeName=" + str15 + ", payOverTimeRedirectUrl=" + str16 + ", paymentMethodCategories=" + set + ", customPaymentMethods=" + set2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.firstName);
            out.writeString(this.lastName);
            out.writeString(this.purchaseCountry);
            out.writeString(this.clientToken);
            out.writeString(this.payNowAssetUrlsDescriptive);
            out.writeString(this.payNowAssetUrlsStandard);
            out.writeString(this.payNowName);
            out.writeString(this.payNowRedirectUrl);
            out.writeString(this.payLaterAssetUrlsDescriptive);
            out.writeString(this.payLaterAssetUrlsStandard);
            out.writeString(this.payLaterName);
            out.writeString(this.payLaterRedirectUrl);
            out.writeString(this.payOverTimeAssetUrlsDescriptive);
            out.writeString(this.payOverTimeAssetUrlsStandard);
            out.writeString(this.payOverTimeName);
            out.writeString(this.payOverTimeRedirectUrl);
            Set<String> set = this.paymentMethodCategories;
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
            Set<String> set2 = this.customPaymentMethods;
            out.writeInt(set2.size());
            for (String str2 : set2) {
                out.writeString(str2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ji\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/model/Source$Owner;", "Lcom/stripe/android/core/model/StripeModel;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/model/Address;", "email", "", "name", PaymentMethod.BillingDetails.PARAM_PHONE, "verifiedAddress", "verifiedEmail", "verifiedName", "verifiedPhone", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getEmail", "()Ljava/lang/String;", "getName", "getPhone", "getVerifiedAddress", "getVerifiedEmail", "getVerifiedName", "getVerifiedPhone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Owner implements StripeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Owner> CREATOR = new Creator();
        private final Address address;
        private final String email;
        private final String name;
        private final String phone;
        private final Address verifiedAddress;
        private final String verifiedEmail;
        private final String verifiedName;
        private final String verifiedPhone;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Owner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Owner createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Owner(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Owner[] newArray(int i) {
                return new Owner[i];
            }
        }

        public Owner(Address address, String str, String str2, String str3, Address address2, String str4, String str5, String str6) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
            this.verifiedAddress = address2;
            this.verifiedEmail = str4;
            this.verifiedName = str5;
            this.verifiedPhone = str6;
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final Address component5() {
            return this.verifiedAddress;
        }

        public final String component6() {
            return this.verifiedEmail;
        }

        public final String component7() {
            return this.verifiedName;
        }

        public final String component8() {
            return this.verifiedPhone;
        }

        public final Owner copy(Address address, String str, String str2, String str3, Address address2, String str4, String str5, String str6) {
            return new Owner(address, str, str2, str3, address2, str4, str5, str6);
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
            if (obj instanceof Owner) {
                Owner owner = (Owner) obj;
                return Intrinsics.areEqual(this.address, owner.address) && Intrinsics.areEqual(this.email, owner.email) && Intrinsics.areEqual(this.name, owner.name) && Intrinsics.areEqual(this.phone, owner.phone) && Intrinsics.areEqual(this.verifiedAddress, owner.verifiedAddress) && Intrinsics.areEqual(this.verifiedEmail, owner.verifiedEmail) && Intrinsics.areEqual(this.verifiedName, owner.verifiedName) && Intrinsics.areEqual(this.verifiedPhone, owner.verifiedPhone);
            }
            return false;
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final Address getVerifiedAddress() {
            return this.verifiedAddress;
        }

        public final String getVerifiedEmail() {
            return this.verifiedEmail;
        }

        public final String getVerifiedName() {
            return this.verifiedName;
        }

        public final String getVerifiedPhone() {
            return this.verifiedPhone;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Address address2 = this.verifiedAddress;
            int hashCode5 = (hashCode4 + (address2 == null ? 0 : address2.hashCode())) * 31;
            String str4 = this.verifiedEmail;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.verifiedName;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.verifiedPhone;
            return hashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            Address address = this.address;
            String str = this.email;
            String str2 = this.name;
            String str3 = this.phone;
            Address address2 = this.verifiedAddress;
            String str4 = this.verifiedEmail;
            String str5 = this.verifiedName;
            String str6 = this.verifiedPhone;
            return "Owner(address=" + address + ", email=" + str + ", name=" + str2 + ", phone=" + str3 + ", verifiedAddress=" + address2 + ", verifiedEmail=" + str4 + ", verifiedName=" + str5 + ", verifiedPhone=" + str6 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Address address = this.address;
            if (address == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address.writeToParcel(out, i);
            }
            out.writeString(this.email);
            out.writeString(this.name);
            out.writeString(this.phone);
            Address address2 = this.verifiedAddress;
            if (address2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address2.writeToParcel(out, i);
            }
            out.writeString(this.verifiedEmail);
            out.writeString(this.verifiedName);
            out.writeString(this.verifiedPhone);
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/model/Source$Receiver;", "Lcom/stripe/android/core/model/StripeModel;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "amountCharged", "", "amountReceived", "amountReturned", "(Ljava/lang/String;JJJ)V", "getAddress", "()Ljava/lang/String;", "getAmountCharged", "()J", "getAmountReceived", "getAmountReturned", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Receiver implements StripeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Receiver> CREATOR = new Creator();
        private final String address;
        private final long amountCharged;
        private final long amountReceived;
        private final long amountReturned;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Receiver> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Receiver createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Receiver(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Receiver[] newArray(int i) {
                return new Receiver[i];
            }
        }

        public Receiver(String str, long j, long j2, long j3) {
            this.address = str;
            this.amountCharged = j;
            this.amountReceived = j2;
            this.amountReturned = j3;
        }

        public static /* synthetic */ Receiver copy$default(Receiver receiver, String str, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = receiver.address;
            }
            if ((i & 2) != 0) {
                j = receiver.amountCharged;
            }
            long j4 = j;
            if ((i & 4) != 0) {
                j2 = receiver.amountReceived;
            }
            long j5 = j2;
            if ((i & 8) != 0) {
                j3 = receiver.amountReturned;
            }
            return receiver.copy(str, j4, j5, j3);
        }

        public final String component1() {
            return this.address;
        }

        public final long component2() {
            return this.amountCharged;
        }

        public final long component3() {
            return this.amountReceived;
        }

        public final long component4() {
            return this.amountReturned;
        }

        public final Receiver copy(String str, long j, long j2, long j3) {
            return new Receiver(str, j, j2, j3);
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
            if (obj instanceof Receiver) {
                Receiver receiver = (Receiver) obj;
                return Intrinsics.areEqual(this.address, receiver.address) && this.amountCharged == receiver.amountCharged && this.amountReceived == receiver.amountReceived && this.amountReturned == receiver.amountReturned;
            }
            return false;
        }

        public final String getAddress() {
            return this.address;
        }

        public final long getAmountCharged() {
            return this.amountCharged;
        }

        public final long getAmountReceived() {
            return this.amountReceived;
        }

        public final long getAmountReturned() {
            return this.amountReturned;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.address;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.amountCharged)) * 31) + Long.hashCode(this.amountReceived)) * 31) + Long.hashCode(this.amountReturned);
        }

        public String toString() {
            String str = this.address;
            long j = this.amountCharged;
            long j2 = this.amountReceived;
            long j3 = this.amountReturned;
            return "Receiver(address=" + str + ", amountCharged=" + j + ", amountReceived=" + j2 + ", amountReturned=" + j3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.address);
            out.writeLong(this.amountCharged);
            out.writeLong(this.amountReceived);
            out.writeLong(this.amountReturned);
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/model/Source$Redirect;", "Lcom/stripe/android/core/model/StripeModel;", "returnUrl", "", "status", "Lcom/stripe/android/model/Source$Redirect$Status;", "url", "(Ljava/lang/String;Lcom/stripe/android/model/Source$Redirect$Status;Ljava/lang/String;)V", "getReturnUrl", "()Ljava/lang/String;", "getStatus", "()Lcom/stripe/android/model/Source$Redirect$Status;", "getUrl", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Status", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Redirect implements StripeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Redirect> CREATOR = new Creator();
        private final String returnUrl;
        private final Status status;
        private final String url;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Redirect> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Redirect createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Redirect(parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Redirect[] newArray(int i) {
                return new Redirect[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/Source$Redirect$Status;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Pending", "Succeeded", "NotRequired", "Failed", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum Status {
            Pending("pending"),
            Succeeded("succeeded"),
            NotRequired("not_required"),
            Failed("failed");
            
            public static final Companion Companion = new Companion(null);
            private final String code;

            @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/Source$Redirect$Status$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/Source$Redirect$Status;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Source.kt\ncom/stripe/android/model/Source$Redirect$Status$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,449:1\n1282#2,2:450\n*S KotlinDebug\n*F\n+ 1 Source.kt\ncom/stripe/android/model/Source$Redirect$Status$Companion\n*L\n266#1:450,2\n*E\n"})
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Status fromCode(String str) {
                    Status[] values;
                    for (Status status : Status.values()) {
                        if (Intrinsics.areEqual(status.code, str)) {
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

            @Override // java.lang.Enum
            public String toString() {
                return this.code;
            }
        }

        public Redirect(String str, Status status, String str2) {
            this.returnUrl = str;
            this.status = status;
            this.url = str2;
        }

        public static /* synthetic */ Redirect copy$default(Redirect redirect, String str, Status status, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = redirect.returnUrl;
            }
            if ((i & 2) != 0) {
                status = redirect.status;
            }
            if ((i & 4) != 0) {
                str2 = redirect.url;
            }
            return redirect.copy(str, status, str2);
        }

        public final String component1() {
            return this.returnUrl;
        }

        public final Status component2() {
            return this.status;
        }

        public final String component3() {
            return this.url;
        }

        public final Redirect copy(String str, Status status, String str2) {
            return new Redirect(str, status, str2);
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
            if (obj instanceof Redirect) {
                Redirect redirect = (Redirect) obj;
                return Intrinsics.areEqual(this.returnUrl, redirect.returnUrl) && this.status == redirect.status && Intrinsics.areEqual(this.url, redirect.url);
            }
            return false;
        }

        public final String getReturnUrl() {
            return this.returnUrl;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final String getUrl() {
            return this.url;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.returnUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Status status = this.status;
            int hashCode2 = (hashCode + (status == null ? 0 : status.hashCode())) * 31;
            String str2 = this.url;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.returnUrl;
            Status status = this.status;
            String str2 = this.url;
            return "Redirect(returnUrl=" + str + ", status=" + status + ", url=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.returnUrl);
            Status status = this.status;
            if (status == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(status.name());
            }
            out.writeString(this.url);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/model/Source$SourceType;", "", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: classes7.dex */
    public @interface SourceType {
        public static final String ALIPAY = "alipay";
        public static final String BANCONTACT = "bancontact";
        public static final String CARD = "card";
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String EPS = "eps";
        public static final String GIROPAY = "giropay";
        public static final String IDEAL = "ideal";
        public static final String KLARNA = "klarna";
        public static final String MULTIBANCO = "multibanco";
        public static final String P24 = "p24";
        public static final String SEPA_DEBIT = "sepa_debit";
        public static final String SOFORT = "sofort";
        public static final String THREE_D_SECURE = "three_d_secure";
        public static final String UNKNOWN = "unknown";
        public static final String WECHAT = "wechat";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/model/Source$SourceType$Companion;", "", "()V", "ALIPAY", "", "BANCONTACT", "CARD", "EPS", "GIROPAY", "IDEAL", "KLARNA", "MULTIBANCO", "P24", "SEPA_DEBIT", "SOFORT", "THREE_D_SECURE", "UNKNOWN", "WECHAT", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String ALIPAY = "alipay";
            public static final String BANCONTACT = "bancontact";
            public static final String CARD = "card";
            public static final String EPS = "eps";
            public static final String GIROPAY = "giropay";
            public static final String IDEAL = "ideal";
            public static final String KLARNA = "klarna";
            public static final String MULTIBANCO = "multibanco";
            public static final String P24 = "p24";
            public static final String SEPA_DEBIT = "sepa_debit";
            public static final String SOFORT = "sofort";
            public static final String THREE_D_SECURE = "three_d_secure";
            public static final String UNKNOWN = "unknown";
            public static final String WECHAT = "wechat";

            private Companion() {
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/Source$Status;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Canceled", "Chargeable", "Consumed", "Failed", "Pending", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Status {
        Canceled("canceled"),
        Chargeable("chargeable"),
        Consumed("consumed"),
        Failed("failed"),
        Pending("pending");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/Source$Status$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/Source$Status;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Source.kt\ncom/stripe/android/model/Source$Status$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,449:1\n1282#2,2:450\n*S KotlinDebug\n*F\n+ 1 Source.kt\ncom/stripe/android/model/Source$Status$Companion\n*L\n194#1:450,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status fromCode(String str) {
                Status[] values;
                for (Status status : Status.values()) {
                    if (Intrinsics.areEqual(status.code, str)) {
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

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/Source$Usage;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "toString", "Reusable", "SingleUse", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Usage {
        Reusable("reusable"),
        SingleUse("single_use");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/Source$Usage$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/Source$Usage;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Source.kt\ncom/stripe/android/model/Source$Usage$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,449:1\n1282#2,2:450\n*S KotlinDebug\n*F\n+ 1 Source.kt\ncom/stripe/android/model/Source$Usage$Companion\n*L\n210#1:450,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Usage fromCode(String str) {
                Usage[] values;
                for (Usage usage : Usage.values()) {
                    if (Intrinsics.areEqual(usage.getCode$payments_core_release(), str)) {
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

        public final String getCode$payments_core_release() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    public Source(String str, Long l, String str2, CodeVerification codeVerification, Long l2, String str3, Flow flow, Boolean bool, Owner owner, Receiver receiver, Redirect redirect, Status status, Map<String, ? extends Object> map, SourceTypeModel sourceTypeModel, String type, String typeRaw, Usage usage, WeChat weChat, Klarna klarna, SourceOrder sourceOrder, String str4) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeRaw, "typeRaw");
        this.f75362id = str;
        this.amount = l;
        this.clientSecret = str2;
        this.codeVerification = codeVerification;
        this.created = l2;
        this.currency = str3;
        this.flow = flow;
        this.isLiveMode = bool;
        this.owner = owner;
        this.receiver = receiver;
        this.redirect = redirect;
        this.status = status;
        this.sourceTypeData = map;
        this.sourceTypeModel = sourceTypeModel;
        this.type = type;
        this.typeRaw = typeRaw;
        this.usage = usage;
        this._weChat = weChat;
        this._klarna = klarna;
        this.sourceOrder = sourceOrder;
        this.statementDescriptor = str4;
    }

    @JvmStatic
    public static final String asSourceType(String str) {
        return Companion.asSourceType(str);
    }

    private final WeChat component18() {
        return this._weChat;
    }

    private final Klarna component19() {
        return this._klarna;
    }

    @JvmStatic
    public static final Source fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return getId();
    }

    public final Receiver component10() {
        return this.receiver;
    }

    public final Redirect component11() {
        return this.redirect;
    }

    public final Status component12() {
        return this.status;
    }

    public final Map<String, Object> component13() {
        return this.sourceTypeData;
    }

    public final SourceTypeModel component14() {
        return this.sourceTypeModel;
    }

    public final String component15() {
        return this.type;
    }

    public final String component16() {
        return this.typeRaw;
    }

    public final Usage component17() {
        return this.usage;
    }

    public final Long component2() {
        return this.amount;
    }

    public final SourceOrder component20() {
        return this.sourceOrder;
    }

    public final String component21() {
        return this.statementDescriptor;
    }

    public final String component3() {
        return this.clientSecret;
    }

    public final CodeVerification component4() {
        return this.codeVerification;
    }

    public final Long component5() {
        return this.created;
    }

    public final String component6() {
        return this.currency;
    }

    public final Flow component7() {
        return this.flow;
    }

    public final Boolean component8() {
        return this.isLiveMode;
    }

    public final Owner component9() {
        return this.owner;
    }

    public final Source copy(String str, Long l, String str2, CodeVerification codeVerification, Long l2, String str3, Flow flow, Boolean bool, Owner owner, Receiver receiver, Redirect redirect, Status status, Map<String, ? extends Object> map, SourceTypeModel sourceTypeModel, String type, String typeRaw, Usage usage, WeChat weChat, Klarna klarna, SourceOrder sourceOrder, String str4) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeRaw, "typeRaw");
        return new Source(str, l, str2, codeVerification, l2, str3, flow, bool, owner, receiver, redirect, status, map, sourceTypeModel, type, typeRaw, usage, weChat, klarna, sourceOrder, str4);
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
        if (obj instanceof Source) {
            Source source = (Source) obj;
            return Intrinsics.areEqual(getId(), source.getId()) && Intrinsics.areEqual(this.amount, source.amount) && Intrinsics.areEqual(this.clientSecret, source.clientSecret) && Intrinsics.areEqual(this.codeVerification, source.codeVerification) && Intrinsics.areEqual(this.created, source.created) && Intrinsics.areEqual(this.currency, source.currency) && this.flow == source.flow && Intrinsics.areEqual(this.isLiveMode, source.isLiveMode) && Intrinsics.areEqual(this.owner, source.owner) && Intrinsics.areEqual(this.receiver, source.receiver) && Intrinsics.areEqual(this.redirect, source.redirect) && this.status == source.status && Intrinsics.areEqual(this.sourceTypeData, source.sourceTypeData) && Intrinsics.areEqual(this.sourceTypeModel, source.sourceTypeModel) && Intrinsics.areEqual(this.type, source.type) && Intrinsics.areEqual(this.typeRaw, source.typeRaw) && this.usage == source.usage && Intrinsics.areEqual(this._weChat, source._weChat) && Intrinsics.areEqual(this._klarna, source._klarna) && Intrinsics.areEqual(this.sourceOrder, source.sourceOrder) && Intrinsics.areEqual(this.statementDescriptor, source.statementDescriptor);
        }
        return false;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final CodeVerification getCodeVerification() {
        return this.codeVerification;
    }

    public final Long getCreated() {
        return this.created;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Flow getFlow() {
        return this.flow;
    }

    @Override // com.stripe.android.model.StripePaymentSource
    public String getId() {
        return this.f75362id;
    }

    public final Klarna getKlarna() {
        if (Intrinsics.areEqual("klarna", this.type)) {
            Klarna klarna = this._klarna;
            if (klarna != null) {
                return klarna;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalStateException("Source type must be 'klarna'".toString());
    }

    public final Owner getOwner() {
        return this.owner;
    }

    public final Receiver getReceiver() {
        return this.receiver;
    }

    public final Redirect getRedirect() {
        return this.redirect;
    }

    public final SourceOrder getSourceOrder() {
        return this.sourceOrder;
    }

    public final Map<String, Object> getSourceTypeData() {
        return this.sourceTypeData;
    }

    public final SourceTypeModel getSourceTypeModel() {
        return this.sourceTypeModel;
    }

    public final String getStatementDescriptor() {
        return this.statementDescriptor;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final String getTypeRaw() {
        return this.typeRaw;
    }

    public final Usage getUsage() {
        return this.usage;
    }

    public final WeChat getWeChat() {
        if (Intrinsics.areEqual("wechat", this.type)) {
            WeChat weChat = this._weChat;
            if (weChat != null) {
                return weChat;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalStateException("Source type must be 'wechat'".toString());
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = (getId() == null ? 0 : getId().hashCode()) * 31;
        Long l = this.amount;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.clientSecret;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CodeVerification codeVerification = this.codeVerification;
        int hashCode4 = (hashCode3 + (codeVerification == null ? 0 : codeVerification.hashCode())) * 31;
        Long l2 = this.created;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.currency;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Flow flow = this.flow;
        int hashCode7 = (hashCode6 + (flow == null ? 0 : flow.hashCode())) * 31;
        Boolean bool = this.isLiveMode;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Owner owner = this.owner;
        int hashCode9 = (hashCode8 + (owner == null ? 0 : owner.hashCode())) * 31;
        Receiver receiver = this.receiver;
        int hashCode10 = (hashCode9 + (receiver == null ? 0 : receiver.hashCode())) * 31;
        Redirect redirect = this.redirect;
        int hashCode11 = (hashCode10 + (redirect == null ? 0 : redirect.hashCode())) * 31;
        Status status = this.status;
        int hashCode12 = (hashCode11 + (status == null ? 0 : status.hashCode())) * 31;
        Map<String, Object> map = this.sourceTypeData;
        int hashCode13 = (hashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        SourceTypeModel sourceTypeModel = this.sourceTypeModel;
        int hashCode14 = (((((hashCode13 + (sourceTypeModel == null ? 0 : sourceTypeModel.hashCode())) * 31) + this.type.hashCode()) * 31) + this.typeRaw.hashCode()) * 31;
        Usage usage = this.usage;
        int hashCode15 = (hashCode14 + (usage == null ? 0 : usage.hashCode())) * 31;
        WeChat weChat = this._weChat;
        int hashCode16 = (hashCode15 + (weChat == null ? 0 : weChat.hashCode())) * 31;
        Klarna klarna = this._klarna;
        int hashCode17 = (hashCode16 + (klarna == null ? 0 : klarna.hashCode())) * 31;
        SourceOrder sourceOrder = this.sourceOrder;
        int hashCode18 = (hashCode17 + (sourceOrder == null ? 0 : sourceOrder.hashCode())) * 31;
        String str3 = this.statementDescriptor;
        return hashCode18 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean isLiveMode() {
        return this.isLiveMode;
    }

    public String toString() {
        String id = getId();
        Long l = this.amount;
        String str = this.clientSecret;
        CodeVerification codeVerification = this.codeVerification;
        Long l2 = this.created;
        String str2 = this.currency;
        Flow flow = this.flow;
        Boolean bool = this.isLiveMode;
        Owner owner = this.owner;
        Receiver receiver = this.receiver;
        Redirect redirect = this.redirect;
        Status status = this.status;
        Map<String, Object> map = this.sourceTypeData;
        SourceTypeModel sourceTypeModel = this.sourceTypeModel;
        String str3 = this.type;
        String str4 = this.typeRaw;
        Usage usage = this.usage;
        WeChat weChat = this._weChat;
        Klarna klarna = this._klarna;
        SourceOrder sourceOrder = this.sourceOrder;
        String str5 = this.statementDescriptor;
        return "Source(id=" + id + ", amount=" + l + ", clientSecret=" + str + ", codeVerification=" + codeVerification + ", created=" + l2 + ", currency=" + str2 + ", flow=" + flow + ", isLiveMode=" + bool + ", owner=" + owner + ", receiver=" + receiver + ", redirect=" + redirect + ", status=" + status + ", sourceTypeData=" + map + ", sourceTypeModel=" + sourceTypeModel + ", type=" + str3 + ", typeRaw=" + str4 + ", usage=" + usage + ", _weChat=" + weChat + ", _klarna=" + klarna + ", sourceOrder=" + sourceOrder + ", statementDescriptor=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75362id);
        Long l = this.amount;
        if (l == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l.longValue());
        }
        out.writeString(this.clientSecret);
        CodeVerification codeVerification = this.codeVerification;
        if (codeVerification == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            codeVerification.writeToParcel(out, i);
        }
        Long l2 = this.created;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l2.longValue());
        }
        out.writeString(this.currency);
        Flow flow = this.flow;
        if (flow == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(flow.name());
        }
        Boolean bool = this.isLiveMode;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Owner owner = this.owner;
        if (owner == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            owner.writeToParcel(out, i);
        }
        Receiver receiver = this.receiver;
        if (receiver == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            receiver.writeToParcel(out, i);
        }
        Redirect redirect = this.redirect;
        if (redirect == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            redirect.writeToParcel(out, i);
        }
        Status status = this.status;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        Map<String, Object> map = this.sourceTypeData;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeValue(entry.getValue());
            }
        }
        out.writeParcelable(this.sourceTypeModel, i);
        out.writeString(this.type);
        out.writeString(this.typeRaw);
        Usage usage = this.usage;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        WeChat weChat = this._weChat;
        if (weChat == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            weChat.writeToParcel(out, i);
        }
        Klarna klarna = this._klarna;
        if (klarna == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            klarna.writeToParcel(out, i);
        }
        SourceOrder sourceOrder = this.sourceOrder;
        if (sourceOrder == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sourceOrder.writeToParcel(out, i);
        }
        out.writeString(this.statementDescriptor);
    }

    public /* synthetic */ Source(String str, Long l, String str2, CodeVerification codeVerification, Long l2, String str3, Flow flow, Boolean bool, Owner owner, Receiver receiver, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String str4, String str5, Usage usage, WeChat weChat, Klarna klarna, SourceOrder sourceOrder, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : codeVerification, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : flow, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : owner, (i & 512) != 0 ? null : receiver, (i & 1024) != 0 ? null : redirect, (i & 2048) != 0 ? null : status, (i & 4096) != 0 ? null : map, (i & 8192) != 0 ? null : sourceTypeModel, str4, str5, (65536 & i) != 0 ? null : usage, (131072 & i) != 0 ? null : weChat, (262144 & i) != 0 ? null : klarna, (524288 & i) != 0 ? null : sourceOrder, (i & 1048576) != 0 ? null : str6);
    }
}
