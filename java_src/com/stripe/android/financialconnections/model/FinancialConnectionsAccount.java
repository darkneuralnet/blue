package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.ArrayList;
import java.util.List;
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
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0007z{y|}~\u007fB\u00ad\u0001\u0012\b\b\u0002\u0010&\u001a\u00020\u000b\u0012\u0006\u0010'\u001a\u00020\r\u0012\u0006\u0010(\u001a\u00020\u000f\u0012\u0006\u0010)\u001a\u00020\u000f\u0012\u0006\u0010*\u001a\u00020\u0012\u0012\b\b\u0002\u0010+\u001a\u00020\u0014\u0012\b\b\u0002\u0010,\u001a\u00020\u0016\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\"\u0012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0018¢\u0006\u0004\bs\u0010tB×\u0001\b\u0017\u0012\u0006\u0010u\u001a\u00020\r\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010'\u001a\u00020\r\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010*\u001a\u00020\u0012\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0001\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\"\u0012\u0010\b\u0001\u00104\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0018\u0012\b\u0010w\u001a\u0004\u0018\u00010v¢\u0006\u0004\bs\u0010xJ!\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007HÇ\u0001J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0016HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\"HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0018HÆ\u0003J¹\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\u000f2\b\b\u0002\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u0010+\u001a\u00020\u00142\b\b\u0002\u0010,\u001a\u00020\u00162\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\"2\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0018HÆ\u0001J\t\u00106\u001a\u00020\u000fHÖ\u0001J\t\u00107\u001a\u00020\rHÖ\u0001J\u0013\u0010:\u001a\u00020\u00122\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003J\t\u0010;\u001a\u00020\rHÖ\u0001J\u0019\u0010?\u001a\u00020\t2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\rHÖ\u0001R \u0010&\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010@\u0012\u0004\bC\u0010D\u001a\u0004\bA\u0010BR \u0010'\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010E\u0012\u0004\bH\u0010D\u001a\u0004\bF\u0010GR \u0010(\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010I\u0012\u0004\bL\u0010D\u001a\u0004\bJ\u0010KR \u0010)\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010I\u0012\u0004\bN\u0010D\u001a\u0004\bM\u0010KR \u0010*\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010O\u0012\u0004\bR\u0010D\u001a\u0004\bP\u0010QR \u0010+\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010S\u0012\u0004\bV\u0010D\u001a\u0004\bT\u0010UR \u0010,\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010W\u0012\u0004\bZ\u0010D\u001a\u0004\bX\u0010YR&\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010[\u0012\u0004\b^\u0010D\u001a\u0004\b\\\u0010]R\"\u0010.\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010_\u0012\u0004\bb\u0010D\u001a\u0004\b`\u0010aR\"\u0010/\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010c\u0012\u0004\bf\u0010D\u001a\u0004\bd\u0010eR\"\u00100\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010I\u0012\u0004\bh\u0010D\u001a\u0004\bg\u0010KR\"\u00101\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010I\u0012\u0004\bj\u0010D\u001a\u0004\bi\u0010KR\"\u00102\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010I\u0012\u0004\bl\u0010D\u001a\u0004\bk\u0010KR\"\u00103\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010m\u0012\u0004\bp\u0010D\u001a\u0004\bn\u0010oR(\u00104\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010[\u0012\u0004\br\u0010D\u001a\u0004\bq\u0010]¨\u0006\u0080\u0001"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "Lcom/stripe/android/core/model/StripeModel;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "component1", "", "component2", "", "component3", "component4", "", "component5", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "component6", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "component7", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "component8", "Lcom/stripe/android/financialconnections/model/Balance;", "component9", "Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "component10", "component11", "component12", "component13", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "component14", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "component15", "category", AnalyticsRequestV2.PARAM_CREATED, "id", "institutionName", "livemode", "status", "subcategory", "supportedPaymentMethodTypes", "balance", "balanceRefresh", "displayName", "last4", "ownership", "ownershipRefresh", "permissions", "copy", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "getCategory", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "getCategory$annotations", "()V", "I", "getCreated", "()I", "getCreated$annotations", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "getInstitutionName", "getInstitutionName$annotations", "Z", "getLivemode", "()Z", "getLivemode$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "getStatus", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "getStatus$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "getSubcategory", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "getSubcategory$annotations", "Ljava/util/List;", "getSupportedPaymentMethodTypes", "()Ljava/util/List;", "getSupportedPaymentMethodTypes$annotations", "Lcom/stripe/android/financialconnections/model/Balance;", "getBalance", "()Lcom/stripe/android/financialconnections/model/Balance;", "getBalance$annotations", "Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "getBalanceRefresh", "()Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "getBalanceRefresh$annotations", "getDisplayName", "getDisplayName$annotations", "getLast4", "getLast4$annotations", "getOwnership", "getOwnership$annotations", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "getOwnershipRefresh", "()Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "getOwnershipRefresh$annotations", "getPermissions", "getPermissions$annotations", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;Lbt5;)V", "Companion", "$serializer", "Category", "Permissions", "Status", "Subcategory", "SupportedPaymentMethodTypes", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FinancialConnectionsAccount extends PaymentAccount implements StripeModel {
    public static final String OBJECT_NEW = "financial_connections.account";
    public static final String OBJECT_OLD = "linked_account";
    private final Balance balance;
    private final BalanceRefresh balanceRefresh;
    private final Category category;
    private final int created;
    private final String displayName;

    /* renamed from: id */
    private final String f75307id;
    private final String institutionName;
    private final String last4;
    private final boolean livemode;
    private final String ownership;
    private final OwnershipRefresh ownershipRefresh;
    private final List<Permissions> permissions;
    private final Status status;
    private final Subcategory subcategory;
    private final List<SupportedPaymentMethodTypes> supportedPaymentMethodTypes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FinancialConnectionsAccount> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CASH", "CREDIT", "INVESTMENT", "OTHER", "UNKNOWN", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5(with = Serializer.class)
    /* loaded from: classes7.dex */
    public enum Category {
        CASH("cash"),
        CREDIT("credit"),
        INVESTMENT("investment"),
        OTHER(LegacyRepairType.OTHER_KEY),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return Category.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<Category> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Category> {
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super(Category.values(), Category.UNKNOWN);
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18877x8fab4239.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        Category(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001R\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "serializer", "", "OBJECT_NEW", "Ljava/lang/String;", "OBJECT_OLD", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<FinancialConnectionsAccount> serializer() {
            return FinancialConnectionsAccount$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Category valueOf = Category.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            Status valueOf2 = Status.valueOf(parcel.readString());
            Subcategory valueOf3 = Subcategory.valueOf(parcel.readString());
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(SupportedPaymentMethodTypes.valueOf(parcel.readString()));
            }
            ArrayList arrayList2 = null;
            Balance createFromParcel = parcel.readInt() == 0 ? null : Balance.CREATOR.createFromParcel(parcel);
            BalanceRefresh createFromParcel2 = parcel.readInt() == 0 ? null : BalanceRefresh.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            OwnershipRefresh createFromParcel3 = parcel.readInt() == 0 ? null : OwnershipRefresh.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    arrayList2.add(Permissions.valueOf(parcel.readString()));
                    i2++;
                    readInt3 = readInt3;
                }
            }
            return new FinancialConnectionsAccount(valueOf, readInt, readString, readString2, z, valueOf2, valueOf3, arrayList, createFromParcel, createFromParcel2, readString3, readString4, readString5, createFromParcel3, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAccount[] newArray(int i) {
            return new FinancialConnectionsAccount[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\r\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BALANCES", "OWNERSHIP", "PAYMENT_METHOD", "TRANSACTIONS", "ACCOUNT_NUMBERS", "UNKNOWN", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5(with = Serializer.class)
    /* loaded from: classes7.dex */
    public enum Permissions {
        BALANCES("balances"),
        OWNERSHIP("ownership"),
        PAYMENT_METHOD("payment_method"),
        TRANSACTIONS("transactions"),
        ACCOUNT_NUMBERS("account_numbers"),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return Permissions.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<Permissions> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Permissions> {
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super(Permissions.values(), Permissions.UNKNOWN);
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18878x2043d99.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        Permissions(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACTIVE", "DISCONNECTED", "INACTIVE", "UNKNOWN", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5(with = Serializer.class)
    /* loaded from: classes7.dex */
    public enum Status {
        ACTIVE("active"),
        DISCONNECTED("disconnected"),
        INACTIVE("inactive"),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
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

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Status> {
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super(Status.values(), Status.UNKNOWN);
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18879x41170805.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        Status(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000e\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CHECKING", "CREDIT_CARD", "LINE_OF_CREDIT", "MORTGAGE", "OTHER", "SAVINGS", "UNKNOWN", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5(with = Serializer.class)
    /* loaded from: classes7.dex */
    public enum Subcategory {
        CHECKING("checking"),
        CREDIT_CARD("credit_card"),
        LINE_OF_CREDIT("line_of_credit"),
        MORTGAGE("mortgage"),
        OTHER(LegacyRepairType.OTHER_KEY),
        SAVINGS("savings"),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return Subcategory.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<Subcategory> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Subcategory> {
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super(Subcategory.values(), Subcategory.UNKNOWN);
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18880x34d3399f.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        Subcategory(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LINK", "US_BANK_ACCOUNT", "UNKNOWN", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5(with = Serializer.class)
    /* loaded from: classes7.dex */
    public enum SupportedPaymentMethodTypes {
        LINK("link"),
        US_BANK_ACCOUNT("us_bank_account"),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return SupportedPaymentMethodTypes.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<SupportedPaymentMethodTypes> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Serializer extends EnumIgnoreUnknownSerializer<SupportedPaymentMethodTypes> {
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super(SupportedPaymentMethodTypes.values(), SupportedPaymentMethodTypes.UNKNOWN);
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18881x4841951d.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        SupportedPaymentMethodTypes(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FinancialConnectionsAccount(int i, @InterfaceC36694Vs5("category") Category category, @InterfaceC36694Vs5("created") int i2, @InterfaceC36694Vs5("id") String str, @InterfaceC36694Vs5("institution_name") String str2, @InterfaceC36694Vs5("livemode") boolean z, @InterfaceC36694Vs5("status") Status status, @InterfaceC36694Vs5("subcategory") Subcategory subcategory, @InterfaceC36694Vs5("supported_payment_method_types") List list, @InterfaceC36694Vs5("balance") Balance balance, @InterfaceC36694Vs5("balance_refresh") BalanceRefresh balanceRefresh, @InterfaceC36694Vs5("display_name") String str3, @InterfaceC36694Vs5("last4") String str4, @InterfaceC36694Vs5("ownership") String str5, @InterfaceC36694Vs5("ownership_refresh") OwnershipRefresh ownershipRefresh, @InterfaceC36694Vs5("permissions") List list2, C38819bt5 c38819bt5) {
        super(null);
        if (158 != (i & 158)) {
            C52838zW3.m1275b(i, 158, FinancialConnectionsAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.category = (i & 1) == 0 ? Category.UNKNOWN : category;
        this.created = i2;
        this.f75307id = str;
        this.institutionName = str2;
        this.livemode = z;
        this.status = (i & 32) == 0 ? Status.UNKNOWN : status;
        this.subcategory = (i & 64) == 0 ? Subcategory.UNKNOWN : subcategory;
        this.supportedPaymentMethodTypes = list;
        if ((i & 256) == 0) {
            this.balance = null;
        } else {
            this.balance = balance;
        }
        if ((i & 512) == 0) {
            this.balanceRefresh = null;
        } else {
            this.balanceRefresh = balanceRefresh;
        }
        if ((i & 1024) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str3;
        }
        if ((i & 2048) == 0) {
            this.last4 = null;
        } else {
            this.last4 = str4;
        }
        if ((i & 4096) == 0) {
            this.ownership = null;
        } else {
            this.ownership = str5;
        }
        if ((i & 8192) == 0) {
            this.ownershipRefresh = null;
        } else {
            this.ownershipRefresh = ownershipRefresh;
        }
        if ((i & 16384) == 0) {
            this.permissions = null;
        } else {
            this.permissions = list2;
        }
    }

    @InterfaceC36694Vs5("balance")
    public static /* synthetic */ void getBalance$annotations() {
    }

    @InterfaceC36694Vs5("balance_refresh")
    public static /* synthetic */ void getBalanceRefresh$annotations() {
    }

    @InterfaceC36694Vs5("category")
    public static /* synthetic */ void getCategory$annotations() {
    }

    @InterfaceC36694Vs5(AnalyticsRequestV2.PARAM_CREATED)
    public static /* synthetic */ void getCreated$annotations() {
    }

    @InterfaceC36694Vs5("display_name")
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    @InterfaceC36694Vs5("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC36694Vs5("institution_name")
    public static /* synthetic */ void getInstitutionName$annotations() {
    }

    @InterfaceC36694Vs5("last4")
    public static /* synthetic */ void getLast4$annotations() {
    }

    @InterfaceC36694Vs5("livemode")
    public static /* synthetic */ void getLivemode$annotations() {
    }

    @InterfaceC36694Vs5("ownership")
    public static /* synthetic */ void getOwnership$annotations() {
    }

    @InterfaceC36694Vs5("ownership_refresh")
    public static /* synthetic */ void getOwnershipRefresh$annotations() {
    }

    @InterfaceC36694Vs5("permissions")
    public static /* synthetic */ void getPermissions$annotations() {
    }

    @InterfaceC36694Vs5("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @InterfaceC36694Vs5("subcategory")
    public static /* synthetic */ void getSubcategory$annotations() {
    }

    @InterfaceC36694Vs5("supported_payment_method_types")
    public static /* synthetic */ void getSupportedPaymentMethodTypes$annotations() {
    }

    @JvmStatic
    public static final void write$Self(FinancialConnectionsAccount self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.mo1132s(serialDesc, 0) || self.category != Category.UNKNOWN) {
            output.mo1126y(serialDesc, 0, Category.Serializer.INSTANCE, self.category);
        }
        output.mo1145e(serialDesc, 1, self.created);
        output.mo1128w(serialDesc, 2, self.f75307id);
        output.mo1128w(serialDesc, 3, self.institutionName);
        output.mo1129v(serialDesc, 4, self.livemode);
        if (output.mo1132s(serialDesc, 5) || self.status != Status.UNKNOWN) {
            output.mo1126y(serialDesc, 5, Status.Serializer.INSTANCE, self.status);
        }
        if (output.mo1132s(serialDesc, 6) || self.subcategory != Subcategory.UNKNOWN) {
            output.mo1126y(serialDesc, 6, Subcategory.Serializer.INSTANCE, self.subcategory);
        }
        output.mo1126y(serialDesc, 7, new C27999ro(SupportedPaymentMethodTypes.Serializer.INSTANCE), self.supportedPaymentMethodTypes);
        if (output.mo1132s(serialDesc, 8) || self.balance != null) {
            output.mo1173E(serialDesc, 8, Balance$$serializer.INSTANCE, self.balance);
        }
        if (output.mo1132s(serialDesc, 9) || self.balanceRefresh != null) {
            output.mo1173E(serialDesc, 9, BalanceRefresh$$serializer.INSTANCE, self.balanceRefresh);
        }
        if (output.mo1132s(serialDesc, 10) || self.displayName != null) {
            output.mo1173E(serialDesc, 10, C41539gS5.f82260a, self.displayName);
        }
        if (output.mo1132s(serialDesc, 11) || self.last4 != null) {
            output.mo1173E(serialDesc, 11, C41539gS5.f82260a, self.last4);
        }
        if (output.mo1132s(serialDesc, 12) || self.ownership != null) {
            output.mo1173E(serialDesc, 12, C41539gS5.f82260a, self.ownership);
        }
        if (output.mo1132s(serialDesc, 13) || self.ownershipRefresh != null) {
            output.mo1173E(serialDesc, 13, OwnershipRefresh$$serializer.INSTANCE, self.ownershipRefresh);
        }
        if (output.mo1132s(serialDesc, 14) || self.permissions != null) {
            output.mo1173E(serialDesc, 14, new C27999ro(Permissions.Serializer.INSTANCE), self.permissions);
        }
    }

    public final Category component1() {
        return this.category;
    }

    public final BalanceRefresh component10() {
        return this.balanceRefresh;
    }

    public final String component11() {
        return this.displayName;
    }

    public final String component12() {
        return this.last4;
    }

    public final String component13() {
        return this.ownership;
    }

    public final OwnershipRefresh component14() {
        return this.ownershipRefresh;
    }

    public final List<Permissions> component15() {
        return this.permissions;
    }

    public final int component2() {
        return this.created;
    }

    public final String component3() {
        return this.f75307id;
    }

    public final String component4() {
        return this.institutionName;
    }

    public final boolean component5() {
        return this.livemode;
    }

    public final Status component6() {
        return this.status;
    }

    public final Subcategory component7() {
        return this.subcategory;
    }

    public final List<SupportedPaymentMethodTypes> component8() {
        return this.supportedPaymentMethodTypes;
    }

    public final Balance component9() {
        return this.balance;
    }

    public final FinancialConnectionsAccount copy(Category category, int i, String id, String institutionName, boolean z, Status status, Subcategory subcategory, List<? extends SupportedPaymentMethodTypes> supportedPaymentMethodTypes, Balance balance, BalanceRefresh balanceRefresh, String str, String str2, String str3, OwnershipRefresh ownershipRefresh, List<? extends Permissions> list) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(subcategory, "subcategory");
        Intrinsics.checkNotNullParameter(supportedPaymentMethodTypes, "supportedPaymentMethodTypes");
        return new FinancialConnectionsAccount(category, i, id, institutionName, z, status, subcategory, supportedPaymentMethodTypes, balance, balanceRefresh, str, str2, str3, ownershipRefresh, list);
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
        if (obj instanceof FinancialConnectionsAccount) {
            FinancialConnectionsAccount financialConnectionsAccount = (FinancialConnectionsAccount) obj;
            return this.category == financialConnectionsAccount.category && this.created == financialConnectionsAccount.created && Intrinsics.areEqual(this.f75307id, financialConnectionsAccount.f75307id) && Intrinsics.areEqual(this.institutionName, financialConnectionsAccount.institutionName) && this.livemode == financialConnectionsAccount.livemode && this.status == financialConnectionsAccount.status && this.subcategory == financialConnectionsAccount.subcategory && Intrinsics.areEqual(this.supportedPaymentMethodTypes, financialConnectionsAccount.supportedPaymentMethodTypes) && Intrinsics.areEqual(this.balance, financialConnectionsAccount.balance) && Intrinsics.areEqual(this.balanceRefresh, financialConnectionsAccount.balanceRefresh) && Intrinsics.areEqual(this.displayName, financialConnectionsAccount.displayName) && Intrinsics.areEqual(this.last4, financialConnectionsAccount.last4) && Intrinsics.areEqual(this.ownership, financialConnectionsAccount.ownership) && Intrinsics.areEqual(this.ownershipRefresh, financialConnectionsAccount.ownershipRefresh) && Intrinsics.areEqual(this.permissions, financialConnectionsAccount.permissions);
        }
        return false;
    }

    public final Balance getBalance() {
        return this.balance;
    }

    public final BalanceRefresh getBalanceRefresh() {
        return this.balanceRefresh;
    }

    public final Category getCategory() {
        return this.category;
    }

    public final int getCreated() {
        return this.created;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.f75307id;
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final String getOwnership() {
        return this.ownership;
    }

    public final OwnershipRefresh getOwnershipRefresh() {
        return this.ownershipRefresh;
    }

    public final List<Permissions> getPermissions() {
        return this.permissions;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Subcategory getSubcategory() {
        return this.subcategory;
    }

    public final List<SupportedPaymentMethodTypes> getSupportedPaymentMethodTypes() {
        return this.supportedPaymentMethodTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((((this.category.hashCode() * 31) + Integer.hashCode(this.created)) * 31) + this.f75307id.hashCode()) * 31) + this.institutionName.hashCode()) * 31;
        boolean z = this.livemode;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((((hashCode + i) * 31) + this.status.hashCode()) * 31) + this.subcategory.hashCode()) * 31) + this.supportedPaymentMethodTypes.hashCode()) * 31;
        Balance balance = this.balance;
        int hashCode3 = (hashCode2 + (balance == null ? 0 : balance.hashCode())) * 31;
        BalanceRefresh balanceRefresh = this.balanceRefresh;
        int hashCode4 = (hashCode3 + (balanceRefresh == null ? 0 : balanceRefresh.hashCode())) * 31;
        String str = this.displayName;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.last4;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownership;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OwnershipRefresh ownershipRefresh = this.ownershipRefresh;
        int hashCode8 = (hashCode7 + (ownershipRefresh == null ? 0 : ownershipRefresh.hashCode())) * 31;
        List<Permissions> list = this.permissions;
        return hashCode8 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Category category = this.category;
        int i = this.created;
        String str = this.f75307id;
        String str2 = this.institutionName;
        boolean z = this.livemode;
        Status status = this.status;
        Subcategory subcategory = this.subcategory;
        List<SupportedPaymentMethodTypes> list = this.supportedPaymentMethodTypes;
        Balance balance = this.balance;
        BalanceRefresh balanceRefresh = this.balanceRefresh;
        String str3 = this.displayName;
        String str4 = this.last4;
        String str5 = this.ownership;
        OwnershipRefresh ownershipRefresh = this.ownershipRefresh;
        List<Permissions> list2 = this.permissions;
        return "FinancialConnectionsAccount(category=" + category + ", created=" + i + ", id=" + str + ", institutionName=" + str2 + ", livemode=" + z + ", status=" + status + ", subcategory=" + subcategory + ", supportedPaymentMethodTypes=" + list + ", balance=" + balance + ", balanceRefresh=" + balanceRefresh + ", displayName=" + str3 + ", last4=" + str4 + ", ownership=" + str5 + ", ownershipRefresh=" + ownershipRefresh + ", permissions=" + list2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.category.name());
        out.writeInt(this.created);
        out.writeString(this.f75307id);
        out.writeString(this.institutionName);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeString(this.status.name());
        out.writeString(this.subcategory.name());
        List<SupportedPaymentMethodTypes> list = this.supportedPaymentMethodTypes;
        out.writeInt(list.size());
        for (SupportedPaymentMethodTypes supportedPaymentMethodTypes : list) {
            out.writeString(supportedPaymentMethodTypes.name());
        }
        Balance balance = this.balance;
        if (balance == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            balance.writeToParcel(out, i);
        }
        BalanceRefresh balanceRefresh = this.balanceRefresh;
        if (balanceRefresh == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            balanceRefresh.writeToParcel(out, i);
        }
        out.writeString(this.displayName);
        out.writeString(this.last4);
        out.writeString(this.ownership);
        OwnershipRefresh ownershipRefresh = this.ownershipRefresh;
        if (ownershipRefresh == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            ownershipRefresh.writeToParcel(out, i);
        }
        List<Permissions> list2 = this.permissions;
        if (list2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list2.size());
        for (Permissions permissions : list2) {
            out.writeString(permissions.name());
        }
    }

    public /* synthetic */ FinancialConnectionsAccount(Category category, int i, String str, String str2, boolean z, Status status, Subcategory subcategory, List list, Balance balance, BalanceRefresh balanceRefresh, String str3, String str4, String str5, OwnershipRefresh ownershipRefresh, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Category.UNKNOWN : category, i, str, str2, z, (i2 & 32) != 0 ? Status.UNKNOWN : status, (i2 & 64) != 0 ? Subcategory.UNKNOWN : subcategory, list, (i2 & 256) != 0 ? null : balance, (i2 & 512) != 0 ? null : balanceRefresh, (i2 & 1024) != 0 ? null : str3, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) != 0 ? null : str5, (i2 & 8192) != 0 ? null : ownershipRefresh, (i2 & 16384) != 0 ? null : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FinancialConnectionsAccount(Category category, int i, String id, String institutionName, boolean z, Status status, Subcategory subcategory, List<? extends SupportedPaymentMethodTypes> supportedPaymentMethodTypes, Balance balance, BalanceRefresh balanceRefresh, String str, String str2, String str3, OwnershipRefresh ownershipRefresh, List<? extends Permissions> list) {
        super(null);
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(subcategory, "subcategory");
        Intrinsics.checkNotNullParameter(supportedPaymentMethodTypes, "supportedPaymentMethodTypes");
        this.category = category;
        this.created = i;
        this.f75307id = id;
        this.institutionName = institutionName;
        this.livemode = z;
        this.status = status;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = supportedPaymentMethodTypes;
        this.balance = balance;
        this.balanceRefresh = balanceRefresh;
        this.displayName = str;
        this.last4 = str2;
        this.ownership = str3;
        this.ownershipRefresh = ownershipRefresh;
        this.permissions = list;
    }
}
