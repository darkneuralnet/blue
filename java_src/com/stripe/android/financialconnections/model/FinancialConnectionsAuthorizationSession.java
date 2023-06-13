package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import com.stripe.android.financialconnections.domain.Display;
import com.stripe.android.financialconnections.domain.Display$$serializer;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 U2\u00020\u0001:\u0003VUWBw\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bO\u0010PB\u0093\u0001\b\u0017\u0012\u0006\u0010Q\u001a\u00020&\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010S\u001a\u0004\u0018\u00010R¢\u0006\u0004\bO\u0010TJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bHÇ\u0001J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0004J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0004J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0004J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0084\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b#\u0010$J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020&HÖ\u0001J\u0013\u0010*\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010+\u001a\u00020&HÖ\u0001J\u0019\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020&HÖ\u0001R \u0010\u0019\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R \u0010\u001a\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u00105\u0012\u0004\b8\u00104\u001a\u0004\b6\u00107R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00109\u0012\u0004\b<\u00104\u001a\u0004\b:\u0010;R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010=\u0012\u0004\b?\u00104\u001a\u0004\b>\u0010\u0004R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010=\u0012\u0004\bA\u00104\u001a\u0004\b@\u0010\u0004R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010=\u0012\u0004\bC\u00104\u001a\u0004\bB\u0010\u0004R\"\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00100\u0012\u0004\bE\u00104\u001a\u0004\bD\u00102R\"\u0010 \u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00100\u0012\u0004\bG\u00104\u001a\u0004\bF\u00102R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b!\u0010=\u0012\u0004\bH\u00104R\"\u0010\"\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010I\u0012\u0004\bL\u00104\u001a\u0004\bJ\u0010KR\u0011\u0010M\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006X"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "Landroid/os/Parcelable;", "", "component9", "()Ljava/lang/Boolean;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "component2", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "component3", "component4", "component5", "component6", "component7", "component8", "Lcom/stripe/android/financialconnections/domain/Display;", "component10", "id", "nextPane", "flow", "institutionSkipAccountSelection", "showPartnerDisclosure", "skipAccountSelection", "url", "urlQrCode", "_isOAuth", "display", "copy", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPane$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "getFlow", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "getFlow$annotations", "Ljava/lang/Boolean;", "getInstitutionSkipAccountSelection", "getInstitutionSkipAccountSelection$annotations", "getShowPartnerDisclosure", "getShowPartnerDisclosure$annotations", "getSkipAccountSelection", "getSkipAccountSelection$annotations", "getUrl", "getUrl$annotations", "getUrlQrCode", "getUrlQrCode$annotations", "get_isOAuth$annotations", "Lcom/stripe/android/financialconnections/domain/Display;", "getDisplay", "()Lcom/stripe/android/financialconnections/domain/Display;", "getDisplay$annotations", "isOAuth", "()Z", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;Lbt5;)V", "Companion", "$serializer", "Flow", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FinancialConnectionsAuthorizationSession implements Parcelable {
    private final Boolean _isOAuth;
    private final Display display;
    private final Flow flow;

    /* renamed from: id */
    private final String f75308id;
    private final Boolean institutionSkipAccountSelection;
    private final FinancialConnectionsSessionManifest.Pane nextPane;
    private final Boolean showPartnerDisclosure;
    private final Boolean skipAccountSelection;
    private final String url;
    private final String urlQrCode;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsAuthorizationSession> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<FinancialConnectionsAuthorizationSession> serializer() {
            return FinancialConnectionsAuthorizationSession$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsAuthorizationSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAuthorizationSession createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            FinancialConnectionsSessionManifest.Pane valueOf5 = FinancialConnectionsSessionManifest.Pane.valueOf(parcel.readString());
            Flow valueOf6 = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FinancialConnectionsAuthorizationSession(readString, valueOf5, valueOf6, valueOf, valueOf2, valueOf3, readString2, readString3, valueOf4, parcel.readInt() != 0 ? Display.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAuthorizationSession[] newArray(int i) {
            return new FinancialConnectionsAuthorizationSession[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0087\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u001c\u001dB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DIRECT", "DIRECT_WEBVIEW", "FINICITY_CONNECT_V2_FIX", "FINICITY_CONNECT_V2_LITE", "FINICITY_CONNECT_V2_OAUTH", "FINICITY_CONNECT_V2_OAUTH_REDIRECT", "FINICITY_CONNECT_V2_OAUTH_WEBVIEW", "MX_CONNECT", "MX_OAUTH", "MX_OAUTH_APP2APP", "MX_OAUTH_REDIRECT", "MX_OAUTH_WEBVIEW", "TESTMODE", "TESTMODE_OAUTH", "TESTMODE_OAUTH_WEBVIEW", "TRUELAYER_OAUTH", "TRUELAYER_OAUTH_HANDOFF", "TRUELAYER_OAUTH_WEBVIEW", "WELLS_FARGO", "WELLS_FARGO_WEBVIEW", "UNKNOWN", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5(with = Serializer.class)
    /* loaded from: classes7.dex */
    public enum Flow {
        DIRECT("direct"),
        DIRECT_WEBVIEW("direct_webview"),
        FINICITY_CONNECT_V2_FIX("finicity_connect_v2_fix"),
        FINICITY_CONNECT_V2_LITE("finicity_connect_v2_lite"),
        FINICITY_CONNECT_V2_OAUTH("finicity_connect_v2_oauth"),
        FINICITY_CONNECT_V2_OAUTH_REDIRECT("finicity_connect_v2_oauth_redirect"),
        FINICITY_CONNECT_V2_OAUTH_WEBVIEW("finicity_connect_v2_oauth_webview"),
        MX_CONNECT("mx_connect"),
        MX_OAUTH("mx_oauth"),
        MX_OAUTH_APP2APP("mx_oauth_app_to_app"),
        MX_OAUTH_REDIRECT("mx_oauth_redirect"),
        MX_OAUTH_WEBVIEW("mx_oauth_webview"),
        TESTMODE("testmode"),
        TESTMODE_OAUTH("testmode_oauth"),
        TESTMODE_OAUTH_WEBVIEW("testmode_oauth_webview"),
        TRUELAYER_OAUTH("truelayer_oauth"),
        TRUELAYER_OAUTH_HANDOFF("truelayer_oauth_handoff"),
        TRUELAYER_OAUTH_WEBVIEW("truelayer_oauth_webview"),
        WELLS_FARGO("wells_fargo"),
        WELLS_FARGO_WEBVIEW("wells_fargo_webview"),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return Flow.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<Flow> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Flow> {
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super(Flow.values(), Flow.UNKNOWN);
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18882xf042ca51.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        Flow(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FinancialConnectionsAuthorizationSession(int i, @InterfaceC36694Vs5("id") String str, @InterfaceC36694Vs5("next_pane") FinancialConnectionsSessionManifest.Pane pane, @InterfaceC36694Vs5("flow") Flow flow, @InterfaceC36694Vs5("institution_skip_account_selection") Boolean bool, @InterfaceC36694Vs5("show_partner_disclosure") Boolean bool2, @InterfaceC36694Vs5("skip_account_selection") Boolean bool3, @InterfaceC36694Vs5("url") String str2, @InterfaceC36694Vs5("url_qr_code") String str3, @InterfaceC36694Vs5("is_oauth") Boolean bool4, @InterfaceC36694Vs5("display") Display display, C38819bt5 c38819bt5) {
        if (3 != (i & 3)) {
            C52838zW3.m1275b(i, 3, FinancialConnectionsAuthorizationSession$$serializer.INSTANCE.getDescriptor());
        }
        this.f75308id = str;
        this.nextPane = pane;
        if ((i & 4) == 0) {
            this.flow = null;
        } else {
            this.flow = flow;
        }
        if ((i & 8) == 0) {
            this.institutionSkipAccountSelection = null;
        } else {
            this.institutionSkipAccountSelection = bool;
        }
        if ((i & 16) == 0) {
            this.showPartnerDisclosure = null;
        } else {
            this.showPartnerDisclosure = bool2;
        }
        if ((i & 32) == 0) {
            this.skipAccountSelection = null;
        } else {
            this.skipAccountSelection = bool3;
        }
        if ((i & 64) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i & 128) == 0) {
            this.urlQrCode = null;
        } else {
            this.urlQrCode = str3;
        }
        if ((i & 256) == 0) {
            this._isOAuth = Boolean.FALSE;
        } else {
            this._isOAuth = bool4;
        }
        if ((i & 512) == 0) {
            this.display = null;
        } else {
            this.display = display;
        }
    }

    private final Boolean component9() {
        return this._isOAuth;
    }

    @InterfaceC36694Vs5("display")
    public static /* synthetic */ void getDisplay$annotations() {
    }

    @InterfaceC36694Vs5("flow")
    public static /* synthetic */ void getFlow$annotations() {
    }

    @InterfaceC36694Vs5("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC36694Vs5("institution_skip_account_selection")
    public static /* synthetic */ void getInstitutionSkipAccountSelection$annotations() {
    }

    @InterfaceC36694Vs5("next_pane")
    public static /* synthetic */ void getNextPane$annotations() {
    }

    @InterfaceC36694Vs5("show_partner_disclosure")
    public static /* synthetic */ void getShowPartnerDisclosure$annotations() {
    }

    @InterfaceC36694Vs5("skip_account_selection")
    public static /* synthetic */ void getSkipAccountSelection$annotations() {
    }

    @InterfaceC36694Vs5("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    @InterfaceC36694Vs5("url_qr_code")
    public static /* synthetic */ void getUrlQrCode$annotations() {
    }

    @InterfaceC36694Vs5("is_oauth")
    private static /* synthetic */ void get_isOAuth$annotations() {
    }

    @JvmStatic
    public static final void write$Self(FinancialConnectionsAuthorizationSession self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z8 = false;
        output.mo1128w(serialDesc, 0, self.f75308id);
        output.mo1126y(serialDesc, 1, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, self.nextPane);
        if (output.mo1132s(serialDesc, 2) || self.flow != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 2, Flow.Serializer.INSTANCE, self.flow);
        }
        if (output.mo1132s(serialDesc, 3) || self.institutionSkipAccountSelection != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1173E(serialDesc, 3, C9804YY.f45990a, self.institutionSkipAccountSelection);
        }
        if (output.mo1132s(serialDesc, 4) || self.showPartnerDisclosure != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo1173E(serialDesc, 4, C9804YY.f45990a, self.showPartnerDisclosure);
        }
        if (output.mo1132s(serialDesc, 5) || self.skipAccountSelection != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            output.mo1173E(serialDesc, 5, C9804YY.f45990a, self.skipAccountSelection);
        }
        if (output.mo1132s(serialDesc, 6) || self.url != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            output.mo1173E(serialDesc, 6, C41539gS5.f82260a, self.url);
        }
        if (output.mo1132s(serialDesc, 7) || self.urlQrCode != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            output.mo1173E(serialDesc, 7, C41539gS5.f82260a, self.urlQrCode);
        }
        if (output.mo1132s(serialDesc, 8) || !Intrinsics.areEqual(self._isOAuth, Boolean.FALSE)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            output.mo1173E(serialDesc, 8, C9804YY.f45990a, self._isOAuth);
        }
        if (output.mo1132s(serialDesc, 9) || self.display != null) {
            z8 = true;
        }
        if (z8) {
            output.mo1173E(serialDesc, 9, Display$$serializer.INSTANCE, self.display);
        }
    }

    public final String component1() {
        return this.f75308id;
    }

    public final Display component10() {
        return this.display;
    }

    public final FinancialConnectionsSessionManifest.Pane component2() {
        return this.nextPane;
    }

    public final Flow component3() {
        return this.flow;
    }

    public final Boolean component4() {
        return this.institutionSkipAccountSelection;
    }

    public final Boolean component5() {
        return this.showPartnerDisclosure;
    }

    public final Boolean component6() {
        return this.skipAccountSelection;
    }

    public final String component7() {
        return this.url;
    }

    public final String component8() {
        return this.urlQrCode;
    }

    public final FinancialConnectionsAuthorizationSession copy(String id, FinancialConnectionsSessionManifest.Pane nextPane, Flow flow, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, Boolean bool4, Display display) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        return new FinancialConnectionsAuthorizationSession(id, nextPane, flow, bool, bool2, bool3, str, str2, bool4, display);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsAuthorizationSession) {
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) obj;
            return Intrinsics.areEqual(this.f75308id, financialConnectionsAuthorizationSession.f75308id) && this.nextPane == financialConnectionsAuthorizationSession.nextPane && this.flow == financialConnectionsAuthorizationSession.flow && Intrinsics.areEqual(this.institutionSkipAccountSelection, financialConnectionsAuthorizationSession.institutionSkipAccountSelection) && Intrinsics.areEqual(this.showPartnerDisclosure, financialConnectionsAuthorizationSession.showPartnerDisclosure) && Intrinsics.areEqual(this.skipAccountSelection, financialConnectionsAuthorizationSession.skipAccountSelection) && Intrinsics.areEqual(this.url, financialConnectionsAuthorizationSession.url) && Intrinsics.areEqual(this.urlQrCode, financialConnectionsAuthorizationSession.urlQrCode) && Intrinsics.areEqual(this._isOAuth, financialConnectionsAuthorizationSession._isOAuth) && Intrinsics.areEqual(this.display, financialConnectionsAuthorizationSession.display);
        }
        return false;
    }

    public final Display getDisplay() {
        return this.display;
    }

    public final Flow getFlow() {
        return this.flow;
    }

    public final String getId() {
        return this.f75308id;
    }

    public final Boolean getInstitutionSkipAccountSelection() {
        return this.institutionSkipAccountSelection;
    }

    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    public final Boolean getShowPartnerDisclosure() {
        return this.showPartnerDisclosure;
    }

    public final Boolean getSkipAccountSelection() {
        return this.skipAccountSelection;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrlQrCode() {
        return this.urlQrCode;
    }

    public int hashCode() {
        int hashCode = ((this.f75308id.hashCode() * 31) + this.nextPane.hashCode()) * 31;
        Flow flow = this.flow;
        int hashCode2 = (hashCode + (flow == null ? 0 : flow.hashCode())) * 31;
        Boolean bool = this.institutionSkipAccountSelection;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showPartnerDisclosure;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.skipAccountSelection;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.url;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.urlQrCode;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this._isOAuth;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Display display = this.display;
        return hashCode8 + (display != null ? display.hashCode() : 0);
    }

    public final boolean isOAuth() {
        Boolean bool = this._isOAuth;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public String toString() {
        String str = this.f75308id;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPane;
        Flow flow = this.flow;
        Boolean bool = this.institutionSkipAccountSelection;
        Boolean bool2 = this.showPartnerDisclosure;
        Boolean bool3 = this.skipAccountSelection;
        String str2 = this.url;
        String str3 = this.urlQrCode;
        Boolean bool4 = this._isOAuth;
        Display display = this.display;
        return "FinancialConnectionsAuthorizationSession(id=" + str + ", nextPane=" + pane + ", flow=" + flow + ", institutionSkipAccountSelection=" + bool + ", showPartnerDisclosure=" + bool2 + ", skipAccountSelection=" + bool3 + ", url=" + str2 + ", urlQrCode=" + str3 + ", _isOAuth=" + bool4 + ", display=" + display + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75308id);
        out.writeString(this.nextPane.name());
        Flow flow = this.flow;
        if (flow == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(flow.name());
        }
        Boolean bool = this.institutionSkipAccountSelection;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showPartnerDisclosure;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.skipAccountSelection;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        out.writeString(this.url);
        out.writeString(this.urlQrCode);
        Boolean bool4 = this._isOAuth;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Display display = this.display;
        if (display == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        display.writeToParcel(out, i);
    }

    public FinancialConnectionsAuthorizationSession(String id, FinancialConnectionsSessionManifest.Pane nextPane, Flow flow, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, Boolean bool4, Display display) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        this.f75308id = id;
        this.nextPane = nextPane;
        this.flow = flow;
        this.institutionSkipAccountSelection = bool;
        this.showPartnerDisclosure = bool2;
        this.skipAccountSelection = bool3;
        this.url = str;
        this.urlQrCode = str2;
        this._isOAuth = bool4;
        this.display = display;
    }

    public /* synthetic */ FinancialConnectionsAuthorizationSession(String str, FinancialConnectionsSessionManifest.Pane pane, Flow flow, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, Boolean bool4, Display display, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, pane, (i & 4) != 0 ? null : flow, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? Boolean.FALSE : bool4, (i & 512) != 0 ? null : display);
    }
}
