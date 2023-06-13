package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import com.stripe.android.financialconnections.model.serializer.JsonAsStringSerializer;
import com.stripe.android.financialconnections.model.serializer.PaymentAccountSerializer;
import com.stripe.android.model.Token;
import com.stripe.android.model.parsers.TokenJsonParser;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0004hgijB\u0081\u0001\b\u0000\u0012\u0006\u0010!\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010%\u001a\u00020\u0013\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\ba\u0010bB\u009d\u0001\b\u0017\u0012\u0006\u0010c\u001a\u00020.\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010%\u001a\u00020\u0013\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010e\u001a\u0004\u0018\u00010d¢\u0006\u0004\ba\u0010fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u0087\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010%\u001a\u00020\u00132\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001fHÆ\u0001J\t\u0010-\u001a\u00020\nHÖ\u0001J\t\u0010/\u001a\u00020.HÖ\u0001J\u0013\u00102\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\u0019\u00107\u001a\u00020\b2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020.HÖ\u0001R \u0010!\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u0019R \u0010\"\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u00108\u0012\u0004\b=\u0010;\u001a\u0004\b<\u0010\u0019R\"\u0010#\u001a\u0004\u0018\u00010\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b#\u0010>\u0012\u0004\b@\u0010;\u001a\u0004\b?\u0010\u000fR\"\u0010$\u001a\u0004\u0018\u00010\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b$\u0010>\u0012\u0004\bB\u0010;\u001a\u0004\bA\u0010\u000fR \u0010%\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010C\u0012\u0004\bF\u0010;\u001a\u0004\bD\u0010ER\"\u0010&\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010G\u0012\u0004\bJ\u0010;\u001a\u0004\bH\u0010IR\"\u0010'\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u00108\u0012\u0004\bL\u0010;\u001a\u0004\bK\u0010\u0019R\"\u0010(\u001a\u0004\u0018\u00010\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b(\u00108\u0012\u0004\bN\u0010;\u001a\u0004\bM\u0010\u0019R\"\u0010)\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010O\u0012\u0004\bR\u0010;\u001a\u0004\bP\u0010QR\"\u0010*\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010S\u0012\u0004\bV\u0010;\u001a\u0004\bT\u0010UR\"\u0010+\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010W\u0012\u0004\bZ\u0010;\u001a\u0004\bX\u0010YR\u0011\u0010\\\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b[\u0010\u000fR\u0016\u0010`\u001a\u0004\u0018\u00010]8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006k"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "Lcom/stripe/android/core/model/StripeModel;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "component2", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "component3$financial_connections_release", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "component3", "component4$financial_connections_release", "component4", "", "component5", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "component6", "component7", "component8$financial_connections_release", "()Ljava/lang/String;", "component8", "Lcom/stripe/android/financialconnections/model/ManualEntry;", "component9", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "component10", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "component11", "clientSecret", "id", "accountsOld", "accountsNew", "livemode", "paymentAccount", "returnUrl", "bankAccountToken", "manualEntry", "status", "statusDetails", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/lang/String;", "getClientSecret", "getClientSecret$annotations", "()V", "getId", "getId$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "getAccountsOld$financial_connections_release", "getAccountsOld$financial_connections_release$annotations", "getAccountsNew$financial_connections_release", "getAccountsNew$financial_connections_release$annotations", "Z", "getLivemode", "()Z", "getLivemode$annotations", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "getPaymentAccount", "()Lcom/stripe/android/financialconnections/model/PaymentAccount;", "getPaymentAccount$annotations", "getReturnUrl", "getReturnUrl$annotations", "getBankAccountToken$financial_connections_release", "getBankAccountToken$financial_connections_release$annotations", "Lcom/stripe/android/financialconnections/model/ManualEntry;", "getManualEntry", "()Lcom/stripe/android/financialconnections/model/ManualEntry;", "getManualEntry$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "getStatus", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "getStatus$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "getStatusDetails", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "getStatusDetails$annotations", "getAccounts", "accounts", "Lcom/stripe/android/model/Token;", "getParsedToken$financial_connections_release", "()Lcom/stripe/android/model/Token;", "parsedToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;Lbt5;)V", "Companion", "$serializer", "Status", "StatusDetails", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFinancialConnectionsSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSession.kt\ncom/stripe/android/financialconnections/model/FinancialConnectionsSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSession implements StripeModel, Parcelable {
    private final FinancialConnectionsAccountList accountsNew;
    private final FinancialConnectionsAccountList accountsOld;
    private final String bankAccountToken;
    private final String clientSecret;

    /* renamed from: id */
    private final String f75310id;
    private final boolean livemode;
    private final ManualEntry manualEntry;
    private final PaymentAccount paymentAccount;
    private final String returnUrl;
    private final Status status;
    private final StatusDetails statusDetails;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FinancialConnectionsSession> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<FinancialConnectionsSession> serializer() {
            return FinancialConnectionsSession$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSession createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FinancialConnectionsSession(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsAccountList.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FinancialConnectionsAccountList.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PaymentAccount) parcel.readParcelable(FinancialConnectionsSession.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ManualEntry.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readInt() != 0 ? StatusDetails.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSession[] newArray(int i) {
            return new FinancialConnectionsSession[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PENDING", "SUCCEEDED", "CANCELED", "FAILED", "UNKNOWN", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5(with = Serializer.class)
    /* loaded from: classes7.dex */
    public enum Status {
        PENDING("pending"),
        SUCCEEDED("succeeded"),
        CANCELED("canceled"),
        FAILED("failed"),
        UNKNOWN("unknown");
        
        private final String value;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18883x8bbb0ae.INSTANCE);

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return Status.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<Status> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Status> {
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super(Status.values(), Status.UNKNOWN);
            }
        }

        Status(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003&'%B\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010 B'\b\u0017\u0012\u0006\u0010!\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006("}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "component1", "cancelled", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "getCancelled", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "getCancelled$annotations", "()V", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;Lbt5;)V", "Companion", "$serializer", "Cancelled", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @InterfaceC36928Ws5
    /* loaded from: classes7.dex */
    public static final class StatusDetails implements Parcelable {
        public static final int $stable = 0;
        private final Cancelled cancelled;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<StatusDetails> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003&%'B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 B'\b\u0017\u0012\u0006\u0010!\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006("}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "component1", "reason", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "getReason", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "getReason$annotations", "()V", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;Lbt5;)V", "Companion", "$serializer", "Reason", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @InterfaceC36928Ws5
        /* loaded from: classes7.dex */
        public static final class Cancelled implements Parcelable {
            public static final int $stable = 0;
            private final Reason reason;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Cancelled> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC34036Kj2<Cancelled> serializer() {
                    return FinancialConnectionsSession$StatusDetails$Cancelled$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Cancelled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancelled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Cancelled(Reason.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancelled[] newArray(int i) {
                    return new Cancelled[i];
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CUSTOM_MANUAL_ENTRY", "OTHER", "UNKNOWN", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            @InterfaceC36928Ws5(with = Serializer.class)
            /* loaded from: classes7.dex */
            public enum Reason {
                CUSTOM_MANUAL_ENTRY("custom_manual_entry"),
                OTHER(LegacyRepairType.OTHER_KEY),
                UNKNOWN("unknown");
                
                private final String value;
                public static final Companion Companion = new Companion(null);
                private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18884x3976f715.INSTANCE);

                @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
                /* loaded from: classes7.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                        return Reason.$cachedSerializer$delegate;
                    }

                    public final InterfaceC34036Kj2<Reason> serializer() {
                        return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
                    }

                    private Companion() {
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* loaded from: classes7.dex */
                public static final class Serializer extends EnumIgnoreUnknownSerializer<Reason> {
                    public static final Serializer INSTANCE = new Serializer();

                    private Serializer() {
                        super(Reason.values(), Reason.UNKNOWN);
                    }
                }

                Reason(String str) {
                    this.value = str;
                }

                public final String getValue() {
                    return this.value;
                }
            }

            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ Cancelled(int i, @InterfaceC36694Vs5("reason") Reason reason, C38819bt5 c38819bt5) {
                if (1 != (i & 1)) {
                    C52838zW3.m1275b(i, 1, FinancialConnectionsSession$StatusDetails$Cancelled$$serializer.INSTANCE.getDescriptor());
                }
                this.reason = reason;
            }

            public static /* synthetic */ Cancelled copy$default(Cancelled cancelled, Reason reason, int i, Object obj) {
                if ((i & 1) != 0) {
                    reason = cancelled.reason;
                }
                return cancelled.copy(reason);
            }

            @InterfaceC36694Vs5("reason")
            public static /* synthetic */ void getReason$annotations() {
            }

            @JvmStatic
            public static final void write$Self(Cancelled self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
                Intrinsics.checkNotNullParameter(self, "self");
                Intrinsics.checkNotNullParameter(output, "output");
                Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
                output.mo1126y(serialDesc, 0, Reason.Serializer.INSTANCE, self.reason);
            }

            public final Reason component1() {
                return this.reason;
            }

            public final Cancelled copy(Reason reason) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                return new Cancelled(reason);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Cancelled) && this.reason == ((Cancelled) obj).reason;
            }

            public final Reason getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                Reason reason = this.reason;
                return "Cancelled(reason=" + reason + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.reason.name());
            }

            public Cancelled(Reason reason) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.reason = reason;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC34036Kj2<StatusDetails> serializer() {
                return FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<StatusDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StatusDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatusDetails(parcel.readInt() == 0 ? null : Cancelled.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StatusDetails[] newArray(int i) {
                return new StatusDetails[i];
            }
        }

        public StatusDetails() {
            this((Cancelled) null, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ StatusDetails copy$default(StatusDetails statusDetails, Cancelled cancelled, int i, Object obj) {
            if ((i & 1) != 0) {
                cancelled = statusDetails.cancelled;
            }
            return statusDetails.copy(cancelled);
        }

        @InterfaceC36694Vs5("cancelled")
        public static /* synthetic */ void getCancelled$annotations() {
        }

        @JvmStatic
        public static final void write$Self(StatusDetails self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            boolean z = true;
            if (!output.mo1132s(serialDesc, 0) && self.cancelled == null) {
                z = false;
            }
            if (z) {
                output.mo1173E(serialDesc, 0, FinancialConnectionsSession$StatusDetails$Cancelled$$serializer.INSTANCE, self.cancelled);
            }
        }

        public final Cancelled component1() {
            return this.cancelled;
        }

        public final StatusDetails copy(Cancelled cancelled) {
            return new StatusDetails(cancelled);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusDetails) && Intrinsics.areEqual(this.cancelled, ((StatusDetails) obj).cancelled);
        }

        public final Cancelled getCancelled() {
            return this.cancelled;
        }

        public int hashCode() {
            Cancelled cancelled = this.cancelled;
            if (cancelled == null) {
                return 0;
            }
            return cancelled.hashCode();
        }

        public String toString() {
            Cancelled cancelled = this.cancelled;
            return "StatusDetails(cancelled=" + cancelled + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Cancelled cancelled = this.cancelled;
            if (cancelled == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            cancelled.writeToParcel(out, i);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ StatusDetails(int i, @InterfaceC36694Vs5("cancelled") Cancelled cancelled, C38819bt5 c38819bt5) {
            if ((i & 0) != 0) {
                C52838zW3.m1275b(i, 0, FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.cancelled = null;
            } else {
                this.cancelled = cancelled;
            }
        }

        public StatusDetails(Cancelled cancelled) {
            this.cancelled = cancelled;
        }

        public /* synthetic */ StatusDetails(Cancelled cancelled, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cancelled);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FinancialConnectionsSession(int i, @InterfaceC36694Vs5("client_secret") String str, @InterfaceC36694Vs5("id") String str2, @InterfaceC36694Vs5("linked_accounts") FinancialConnectionsAccountList financialConnectionsAccountList, @InterfaceC36694Vs5("accounts") FinancialConnectionsAccountList financialConnectionsAccountList2, @InterfaceC36694Vs5("livemode") boolean z, @InterfaceC36694Vs5("payment_account") PaymentAccount paymentAccount, @InterfaceC36694Vs5("return_url") String str3, @InterfaceC36694Vs5("bank_account_token") @InterfaceC36928Ws5(with = JsonAsStringSerializer.class) String str4, @InterfaceC36694Vs5("manual_entry") ManualEntry manualEntry, @InterfaceC36694Vs5("status") Status status, @InterfaceC36694Vs5("status_details") StatusDetails statusDetails, C38819bt5 c38819bt5) {
        if (19 != (i & 19)) {
            C52838zW3.m1275b(i, 19, FinancialConnectionsSession$$serializer.INSTANCE.getDescriptor());
        }
        this.clientSecret = str;
        this.f75310id = str2;
        if ((i & 4) == 0) {
            this.accountsOld = null;
        } else {
            this.accountsOld = financialConnectionsAccountList;
        }
        if ((i & 8) == 0) {
            this.accountsNew = null;
        } else {
            this.accountsNew = financialConnectionsAccountList2;
        }
        this.livemode = z;
        if ((i & 32) == 0) {
            this.paymentAccount = null;
        } else {
            this.paymentAccount = paymentAccount;
        }
        if ((i & 64) == 0) {
            this.returnUrl = null;
        } else {
            this.returnUrl = str3;
        }
        if ((i & 128) == 0) {
            this.bankAccountToken = null;
        } else {
            this.bankAccountToken = str4;
        }
        if ((i & 256) == 0) {
            this.manualEntry = null;
        } else {
            this.manualEntry = manualEntry;
        }
        if ((i & 512) == 0) {
            this.status = null;
        } else {
            this.status = status;
        }
        if ((i & 1024) == 0) {
            this.statusDetails = null;
        } else {
            this.statusDetails = statusDetails;
        }
    }

    @InterfaceC36694Vs5("accounts")
    public static /* synthetic */ void getAccountsNew$financial_connections_release$annotations() {
    }

    @InterfaceC36694Vs5("linked_accounts")
    public static /* synthetic */ void getAccountsOld$financial_connections_release$annotations() {
    }

    @InterfaceC36694Vs5("bank_account_token")
    @InterfaceC36928Ws5(with = JsonAsStringSerializer.class)
    public static /* synthetic */ void getBankAccountToken$financial_connections_release$annotations() {
    }

    @InterfaceC36694Vs5("client_secret")
    public static /* synthetic */ void getClientSecret$annotations() {
    }

    @InterfaceC36694Vs5("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC36694Vs5("livemode")
    public static /* synthetic */ void getLivemode$annotations() {
    }

    @InterfaceC36694Vs5("manual_entry")
    public static /* synthetic */ void getManualEntry$annotations() {
    }

    @InterfaceC36694Vs5("payment_account")
    public static /* synthetic */ void getPaymentAccount$annotations() {
    }

    @InterfaceC36694Vs5("return_url")
    public static /* synthetic */ void getReturnUrl$annotations() {
    }

    @InterfaceC36694Vs5("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @InterfaceC36694Vs5("status_details")
    public static /* synthetic */ void getStatusDetails$annotations() {
    }

    @JvmStatic
    public static final void write$Self(FinancialConnectionsSession self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
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
        output.mo1128w(serialDesc, 0, self.clientSecret);
        output.mo1128w(serialDesc, 1, self.f75310id);
        if (output.mo1132s(serialDesc, 2) || self.accountsOld != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 2, FinancialConnectionsAccountList$$serializer.INSTANCE, self.accountsOld);
        }
        if (output.mo1132s(serialDesc, 3) || self.accountsNew != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1173E(serialDesc, 3, FinancialConnectionsAccountList$$serializer.INSTANCE, self.accountsNew);
        }
        output.mo1129v(serialDesc, 4, self.livemode);
        if (output.mo1132s(serialDesc, 5) || self.paymentAccount != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo1173E(serialDesc, 5, PaymentAccountSerializer.INSTANCE, self.paymentAccount);
        }
        if (output.mo1132s(serialDesc, 6) || self.returnUrl != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            output.mo1173E(serialDesc, 6, C41539gS5.f82260a, self.returnUrl);
        }
        if (output.mo1132s(serialDesc, 7) || self.bankAccountToken != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            output.mo1173E(serialDesc, 7, JsonAsStringSerializer.INSTANCE, self.bankAccountToken);
        }
        if (output.mo1132s(serialDesc, 8) || self.manualEntry != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            output.mo1173E(serialDesc, 8, ManualEntry$$serializer.INSTANCE, self.manualEntry);
        }
        if (output.mo1132s(serialDesc, 9) || self.status != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            output.mo1173E(serialDesc, 9, Status.Serializer.INSTANCE, self.status);
        }
        if (output.mo1132s(serialDesc, 10) || self.statusDetails != null) {
            z8 = true;
        }
        if (z8) {
            output.mo1173E(serialDesc, 10, FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE, self.statusDetails);
        }
    }

    public final String component1() {
        return this.clientSecret;
    }

    public final Status component10() {
        return this.status;
    }

    public final StatusDetails component11() {
        return this.statusDetails;
    }

    public final String component2() {
        return this.f75310id;
    }

    public final FinancialConnectionsAccountList component3$financial_connections_release() {
        return this.accountsOld;
    }

    public final FinancialConnectionsAccountList component4$financial_connections_release() {
        return this.accountsNew;
    }

    public final boolean component5() {
        return this.livemode;
    }

    public final PaymentAccount component6() {
        return this.paymentAccount;
    }

    public final String component7() {
        return this.returnUrl;
    }

    public final String component8$financial_connections_release() {
        return this.bankAccountToken;
    }

    public final ManualEntry component9() {
        return this.manualEntry;
    }

    public final FinancialConnectionsSession copy(String clientSecret, String id, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z, PaymentAccount paymentAccount, String str, String str2, ManualEntry manualEntry, Status status, StatusDetails statusDetails) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(id, "id");
        return new FinancialConnectionsSession(clientSecret, id, financialConnectionsAccountList, financialConnectionsAccountList2, z, paymentAccount, str, str2, manualEntry, status, statusDetails);
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
        if (obj instanceof FinancialConnectionsSession) {
            FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) obj;
            return Intrinsics.areEqual(this.clientSecret, financialConnectionsSession.clientSecret) && Intrinsics.areEqual(this.f75310id, financialConnectionsSession.f75310id) && Intrinsics.areEqual(this.accountsOld, financialConnectionsSession.accountsOld) && Intrinsics.areEqual(this.accountsNew, financialConnectionsSession.accountsNew) && this.livemode == financialConnectionsSession.livemode && Intrinsics.areEqual(this.paymentAccount, financialConnectionsSession.paymentAccount) && Intrinsics.areEqual(this.returnUrl, financialConnectionsSession.returnUrl) && Intrinsics.areEqual(this.bankAccountToken, financialConnectionsSession.bankAccountToken) && Intrinsics.areEqual(this.manualEntry, financialConnectionsSession.manualEntry) && this.status == financialConnectionsSession.status && Intrinsics.areEqual(this.statusDetails, financialConnectionsSession.statusDetails);
        }
        return false;
    }

    public final FinancialConnectionsAccountList getAccounts() {
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsNew;
        if (financialConnectionsAccountList == null) {
            FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsOld;
            Intrinsics.checkNotNull(financialConnectionsAccountList2);
            return financialConnectionsAccountList2;
        }
        return financialConnectionsAccountList;
    }

    public final FinancialConnectionsAccountList getAccountsNew$financial_connections_release() {
        return this.accountsNew;
    }

    public final FinancialConnectionsAccountList getAccountsOld$financial_connections_release() {
        return this.accountsOld;
    }

    public final String getBankAccountToken$financial_connections_release() {
        return this.bankAccountToken;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getId() {
        return this.f75310id;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final ManualEntry getManualEntry() {
        return this.manualEntry;
    }

    public final Token getParsedToken$financial_connections_release() {
        String str = this.bankAccountToken;
        if (str != null) {
            return new TokenJsonParser().parse(new JSONObject(str));
        }
        return null;
    }

    public final PaymentAccount getPaymentAccount() {
        return this.paymentAccount;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final StatusDetails getStatusDetails() {
        return this.statusDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((this.clientSecret.hashCode() * 31) + this.f75310id.hashCode()) * 31;
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsOld;
        int hashCode2 = (hashCode + (financialConnectionsAccountList == null ? 0 : financialConnectionsAccountList.hashCode())) * 31;
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsNew;
        int hashCode3 = (hashCode2 + (financialConnectionsAccountList2 == null ? 0 : financialConnectionsAccountList2.hashCode())) * 31;
        boolean z = this.livemode;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        PaymentAccount paymentAccount = this.paymentAccount;
        int hashCode4 = (i2 + (paymentAccount == null ? 0 : paymentAccount.hashCode())) * 31;
        String str = this.returnUrl;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bankAccountToken;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ManualEntry manualEntry = this.manualEntry;
        int hashCode7 = (hashCode6 + (manualEntry == null ? 0 : manualEntry.hashCode())) * 31;
        Status status = this.status;
        int hashCode8 = (hashCode7 + (status == null ? 0 : status.hashCode())) * 31;
        StatusDetails statusDetails = this.statusDetails;
        return hashCode8 + (statusDetails != null ? statusDetails.hashCode() : 0);
    }

    public String toString() {
        String str = this.clientSecret;
        String str2 = this.f75310id;
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsOld;
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsNew;
        boolean z = this.livemode;
        PaymentAccount paymentAccount = this.paymentAccount;
        String str3 = this.returnUrl;
        String str4 = this.bankAccountToken;
        ManualEntry manualEntry = this.manualEntry;
        Status status = this.status;
        StatusDetails statusDetails = this.statusDetails;
        return "FinancialConnectionsSession(clientSecret=" + str + ", id=" + str2 + ", accountsOld=" + financialConnectionsAccountList + ", accountsNew=" + financialConnectionsAccountList2 + ", livemode=" + z + ", paymentAccount=" + paymentAccount + ", returnUrl=" + str3 + ", bankAccountToken=" + str4 + ", manualEntry=" + manualEntry + ", status=" + status + ", statusDetails=" + statusDetails + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.clientSecret);
        out.writeString(this.f75310id);
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsOld;
        if (financialConnectionsAccountList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            financialConnectionsAccountList.writeToParcel(out, i);
        }
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsNew;
        if (financialConnectionsAccountList2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            financialConnectionsAccountList2.writeToParcel(out, i);
        }
        out.writeInt(this.livemode ? 1 : 0);
        out.writeParcelable(this.paymentAccount, i);
        out.writeString(this.returnUrl);
        out.writeString(this.bankAccountToken);
        ManualEntry manualEntry = this.manualEntry;
        if (manualEntry == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            manualEntry.writeToParcel(out, i);
        }
        Status status = this.status;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StatusDetails statusDetails = this.statusDetails;
        if (statusDetails == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        statusDetails.writeToParcel(out, i);
    }

    public FinancialConnectionsSession(String clientSecret, String id, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z, PaymentAccount paymentAccount, String str, String str2, ManualEntry manualEntry, Status status, StatusDetails statusDetails) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(id, "id");
        this.clientSecret = clientSecret;
        this.f75310id = id;
        this.accountsOld = financialConnectionsAccountList;
        this.accountsNew = financialConnectionsAccountList2;
        this.livemode = z;
        this.paymentAccount = paymentAccount;
        this.returnUrl = str;
        this.bankAccountToken = str2;
        this.manualEntry = manualEntry;
        this.status = status;
        this.statusDetails = statusDetails;
    }

    public /* synthetic */ FinancialConnectionsSession(String str, String str2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z, PaymentAccount paymentAccount, String str3, String str4, ManualEntry manualEntry, Status status, StatusDetails statusDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : financialConnectionsAccountList, (i & 8) != 0 ? null : financialConnectionsAccountList2, z, (i & 32) != 0 ? null : paymentAccount, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : manualEntry, (i & 512) != 0 ? null : status, (i & 1024) != 0 ? null : statusDetails);
    }
}
