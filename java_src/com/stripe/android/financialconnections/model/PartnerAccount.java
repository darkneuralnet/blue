package com.stripe.android.financialconnections.model;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 v2\u00020\u0001:\u0002wvBÁ\u0001\u0012\u0006\u0010$\u001a\u00020\f\u0012\u0006\u0010%\u001a\u00020\u000e\u0012\u0006\u0010&\u001a\u00020\f\u0012\u0006\u0010'\u001a\u00020\f\u0012\u0006\u0010(\u001a\u00020\u0012\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\"¢\u0006\u0004\bp\u0010qBí\u0001\b\u0017\u0012\u0006\u0010r\u001a\u00020\u0017\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\"\u0012\b\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bp\u0010uJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bHÇ\u0001J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\fHÆ\u0003J\t\u0010\u0011\u001a\u00020\fHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\"HÆ\u0003JÖ\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\f2\b\b\u0002\u0010%\u001a\u00020\u000e2\b\b\u0002\u0010&\u001a\u00020\f2\b\b\u0002\u0010'\u001a\u00020\f2\b\b\u0002\u0010(\u001a\u00020\u00122\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\"HÆ\u0001¢\u0006\u0004\b5\u00106J\t\u00107\u001a\u00020\fHÖ\u0001J\t\u00108\u001a\u00020\u0017HÖ\u0001J\u0013\u0010:\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010$\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010;\u0012\u0004\b>\u0010?\u001a\u0004\b<\u0010=R \u0010%\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010@\u0012\u0004\bC\u0010?\u001a\u0004\bA\u0010BR \u0010&\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010;\u0012\u0004\bE\u0010?\u001a\u0004\bD\u0010=R \u0010'\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010;\u0012\u0004\bG\u0010?\u001a\u0004\bF\u0010=R \u0010(\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010H\u0012\u0004\bK\u0010?\u001a\u0004\bI\u0010JR&\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010L\u0012\u0004\bO\u0010?\u001a\u0004\bM\u0010NR\"\u0010*\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010P\u0012\u0004\bR\u0010?\u001a\u0004\bQ\u0010\u0019R\"\u0010+\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010;\u0012\u0004\bT\u0010?\u001a\u0004\bS\u0010=R\"\u0010,\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010;\u0012\u0004\bV\u0010?\u001a\u0004\bU\u0010=R\"\u0010-\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010P\u0012\u0004\bX\u0010?\u001a\u0004\bW\u0010\u0019R\"\u0010.\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010;\u0012\u0004\bZ\u0010?\u001a\u0004\bY\u0010=R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b/\u0010[\u0012\u0004\b\\\u0010?R\"\u00100\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010;\u0012\u0004\b^\u0010?\u001a\u0004\b]\u0010=R\"\u00101\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010;\u0012\u0004\b`\u0010?\u001a\u0004\b_\u0010=R\"\u00102\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010;\u0012\u0004\bb\u0010?\u001a\u0004\ba\u0010=R\"\u00103\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010;\u0012\u0004\bd\u0010?\u001a\u0004\bc\u0010=R\"\u00104\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010e\u0012\u0004\bh\u0010?\u001a\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010=R\u0014\u0010o\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010=¨\u0006x"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/PartnerAccount;", "", "", "component12", "()Ljava/lang/Boolean;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "component2", "component3", "component4", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "component5", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "component6", "", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "component11", "component13", "component14", "component15", "component16", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "component17", "authorization", "category", "id", "name", "subcategory", "supportedPaymentMethodTypes", "balanceAmount", "currency", "displayableAccountNumbers", "initialBalanceAmount", "institutionName", "_allowSelection", "allowSelectionMessage", "institutionUrl", "linkedAccountId", "routingNumber", "status", "copy", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;)Lcom/stripe/android/financialconnections/model/PartnerAccount;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getAuthorization", "()Ljava/lang/String;", "getAuthorization$annotations", "()V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "getCategory", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "getCategory$annotations", "getId", "getId$annotations", "getName", "getName$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "getSubcategory", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "getSubcategory$annotations", "Ljava/util/List;", "getSupportedPaymentMethodTypes", "()Ljava/util/List;", "getSupportedPaymentMethodTypes$annotations", "Ljava/lang/Integer;", "getBalanceAmount", "getBalanceAmount$annotations", "getCurrency", "getCurrency$annotations", "getDisplayableAccountNumbers", "getDisplayableAccountNumbers$annotations", "getInitialBalanceAmount", "getInitialBalanceAmount$annotations", "getInstitutionName", "getInstitutionName$annotations", "Ljava/lang/Boolean;", "get_allowSelection$annotations", "getAllowSelectionMessage", "getAllowSelectionMessage$annotations", "getInstitutionUrl", "getInstitutionUrl$annotations", "getLinkedAccountId", "getLinkedAccountId$annotations", "getRoutingNumber", "getRoutingNumber$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "getStatus", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "getStatus$annotations", "getAllowSelection$financial_connections_release", "()Z", "allowSelection", "getEncryptedNumbers$financial_connections_release", "encryptedNumbers", "getFullName$financial_connections_release", "fullName", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPartnerAccountsList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerAccountsList.kt\ncom/stripe/android/financialconnections/model/PartnerAccount\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
/* loaded from: classes7.dex */
public final class PartnerAccount {
    public static final Companion Companion = new Companion(null);
    private final Boolean _allowSelection;
    private final String allowSelectionMessage;
    private final String authorization;
    private final Integer balanceAmount;
    private final FinancialConnectionsAccount.Category category;
    private final String currency;
    private final String displayableAccountNumbers;

    /* renamed from: id */
    private final String f75313id;
    private final Integer initialBalanceAmount;
    private final String institutionName;
    private final String institutionUrl;
    private final String linkedAccountId;
    private final String name;
    private final String routingNumber;
    private final FinancialConnectionsAccount.Status status;
    private final FinancialConnectionsAccount.Subcategory subcategory;
    private final List<FinancialConnectionsAccount.SupportedPaymentMethodTypes> supportedPaymentMethodTypes;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/PartnerAccount$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<PartnerAccount> serializer() {
            return PartnerAccount$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PartnerAccount(int i, @InterfaceC36694Vs5("authorization") String str, @InterfaceC36694Vs5("category") FinancialConnectionsAccount.Category category, @InterfaceC36694Vs5("id") String str2, @InterfaceC36694Vs5("name") String str3, @InterfaceC36694Vs5("subcategory") FinancialConnectionsAccount.Subcategory subcategory, @InterfaceC36694Vs5("supported_payment_method_types") List list, @InterfaceC36694Vs5("balance_amount") Integer num, @InterfaceC36694Vs5("currency") String str4, @InterfaceC36694Vs5("displayable_account_numbers") String str5, @InterfaceC36694Vs5("initial_balance_amount") Integer num2, @InterfaceC36694Vs5("institution_name") String str6, @InterfaceC36694Vs5("allow_selection") Boolean bool, @InterfaceC36694Vs5("allow_selection_message") String str7, @InterfaceC36694Vs5("institution_url") String str8, @InterfaceC36694Vs5("linked_account_id") String str9, @InterfaceC36694Vs5("routing_number") String str10, @InterfaceC36694Vs5("status") FinancialConnectionsAccount.Status status, C38819bt5 c38819bt5) {
        if (63 != (i & 63)) {
            C52838zW3.m1275b(i, 63, PartnerAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.authorization = str;
        this.category = category;
        this.f75313id = str2;
        this.name = str3;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = list;
        if ((i & 64) == 0) {
            this.balanceAmount = null;
        } else {
            this.balanceAmount = num;
        }
        if ((i & 128) == 0) {
            this.currency = null;
        } else {
            this.currency = str4;
        }
        if ((i & 256) == 0) {
            this.displayableAccountNumbers = null;
        } else {
            this.displayableAccountNumbers = str5;
        }
        if ((i & 512) == 0) {
            this.initialBalanceAmount = null;
        } else {
            this.initialBalanceAmount = num2;
        }
        if ((i & 1024) == 0) {
            this.institutionName = null;
        } else {
            this.institutionName = str6;
        }
        if ((i & 2048) == 0) {
            this._allowSelection = null;
        } else {
            this._allowSelection = bool;
        }
        if ((i & 4096) == 0) {
            this.allowSelectionMessage = null;
        } else {
            this.allowSelectionMessage = str7;
        }
        if ((i & 8192) == 0) {
            this.institutionUrl = null;
        } else {
            this.institutionUrl = str8;
        }
        if ((i & 16384) == 0) {
            this.linkedAccountId = null;
        } else {
            this.linkedAccountId = str9;
        }
        if ((32768 & i) == 0) {
            this.routingNumber = null;
        } else {
            this.routingNumber = str10;
        }
        if ((i & 65536) == 0) {
            this.status = null;
        } else {
            this.status = status;
        }
    }

    private final Boolean component12() {
        return this._allowSelection;
    }

    @InterfaceC36694Vs5("allow_selection_message")
    public static /* synthetic */ void getAllowSelectionMessage$annotations() {
    }

    @InterfaceC36694Vs5("authorization")
    public static /* synthetic */ void getAuthorization$annotations() {
    }

    @InterfaceC36694Vs5("balance_amount")
    public static /* synthetic */ void getBalanceAmount$annotations() {
    }

    @InterfaceC36694Vs5("category")
    public static /* synthetic */ void getCategory$annotations() {
    }

    @InterfaceC36694Vs5("currency")
    public static /* synthetic */ void getCurrency$annotations() {
    }

    @InterfaceC36694Vs5("displayable_account_numbers")
    public static /* synthetic */ void getDisplayableAccountNumbers$annotations() {
    }

    @InterfaceC36694Vs5("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC36694Vs5("initial_balance_amount")
    public static /* synthetic */ void getInitialBalanceAmount$annotations() {
    }

    @InterfaceC36694Vs5("institution_name")
    public static /* synthetic */ void getInstitutionName$annotations() {
    }

    @InterfaceC36694Vs5("institution_url")
    public static /* synthetic */ void getInstitutionUrl$annotations() {
    }

    @InterfaceC36694Vs5("linked_account_id")
    public static /* synthetic */ void getLinkedAccountId$annotations() {
    }

    @InterfaceC36694Vs5("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @InterfaceC36694Vs5("routing_number")
    public static /* synthetic */ void getRoutingNumber$annotations() {
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

    @InterfaceC36694Vs5("allow_selection")
    private static /* synthetic */ void get_allowSelection$annotations() {
    }

    @JvmStatic
    public static final void write$Self(PartnerAccount self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.mo1128w(serialDesc, 0, self.authorization);
        output.mo1126y(serialDesc, 1, FinancialConnectionsAccount.Category.Serializer.INSTANCE, self.category);
        output.mo1128w(serialDesc, 2, self.f75313id);
        output.mo1128w(serialDesc, 3, self.name);
        output.mo1126y(serialDesc, 4, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, self.subcategory);
        output.mo1126y(serialDesc, 5, new C27999ro(FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE), self.supportedPaymentMethodTypes);
        if (output.mo1132s(serialDesc, 6) || self.balanceAmount != null) {
            output.mo1173E(serialDesc, 6, F52.f8705a, self.balanceAmount);
        }
        if (output.mo1132s(serialDesc, 7) || self.currency != null) {
            output.mo1173E(serialDesc, 7, C41539gS5.f82260a, self.currency);
        }
        if (output.mo1132s(serialDesc, 8) || self.displayableAccountNumbers != null) {
            output.mo1173E(serialDesc, 8, C41539gS5.f82260a, self.displayableAccountNumbers);
        }
        if (output.mo1132s(serialDesc, 9) || self.initialBalanceAmount != null) {
            output.mo1173E(serialDesc, 9, F52.f8705a, self.initialBalanceAmount);
        }
        if (output.mo1132s(serialDesc, 10) || self.institutionName != null) {
            output.mo1173E(serialDesc, 10, C41539gS5.f82260a, self.institutionName);
        }
        if (output.mo1132s(serialDesc, 11) || self._allowSelection != null) {
            output.mo1173E(serialDesc, 11, C9804YY.f45990a, self._allowSelection);
        }
        if (output.mo1132s(serialDesc, 12) || self.allowSelectionMessage != null) {
            output.mo1173E(serialDesc, 12, C41539gS5.f82260a, self.allowSelectionMessage);
        }
        if (output.mo1132s(serialDesc, 13) || self.institutionUrl != null) {
            output.mo1173E(serialDesc, 13, C41539gS5.f82260a, self.institutionUrl);
        }
        if (output.mo1132s(serialDesc, 14) || self.linkedAccountId != null) {
            output.mo1173E(serialDesc, 14, C41539gS5.f82260a, self.linkedAccountId);
        }
        if (output.mo1132s(serialDesc, 15) || self.routingNumber != null) {
            output.mo1173E(serialDesc, 15, C41539gS5.f82260a, self.routingNumber);
        }
        if (output.mo1132s(serialDesc, 16) || self.status != null) {
            output.mo1173E(serialDesc, 16, FinancialConnectionsAccount.Status.Serializer.INSTANCE, self.status);
        }
    }

    public final String component1() {
        return this.authorization;
    }

    public final Integer component10() {
        return this.initialBalanceAmount;
    }

    public final String component11() {
        return this.institutionName;
    }

    public final String component13() {
        return this.allowSelectionMessage;
    }

    public final String component14() {
        return this.institutionUrl;
    }

    public final String component15() {
        return this.linkedAccountId;
    }

    public final String component16() {
        return this.routingNumber;
    }

    public final FinancialConnectionsAccount.Status component17() {
        return this.status;
    }

    public final FinancialConnectionsAccount.Category component2() {
        return this.category;
    }

    public final String component3() {
        return this.f75313id;
    }

    public final String component4() {
        return this.name;
    }

    public final FinancialConnectionsAccount.Subcategory component5() {
        return this.subcategory;
    }

    public final List<FinancialConnectionsAccount.SupportedPaymentMethodTypes> component6() {
        return this.supportedPaymentMethodTypes;
    }

    public final Integer component7() {
        return this.balanceAmount;
    }

    public final String component8() {
        return this.currency;
    }

    public final String component9() {
        return this.displayableAccountNumbers;
    }

    public final PartnerAccount copy(String authorization, FinancialConnectionsAccount.Category category, String id, String name, FinancialConnectionsAccount.Subcategory subcategory, List<? extends FinancialConnectionsAccount.SupportedPaymentMethodTypes> supportedPaymentMethodTypes, Integer num, String str, String str2, Integer num2, String str3, Boolean bool, String str4, String str5, String str6, String str7, FinancialConnectionsAccount.Status status) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(subcategory, "subcategory");
        Intrinsics.checkNotNullParameter(supportedPaymentMethodTypes, "supportedPaymentMethodTypes");
        return new PartnerAccount(authorization, category, id, name, subcategory, supportedPaymentMethodTypes, num, str, str2, num2, str3, bool, str4, str5, str6, str7, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PartnerAccount) {
            PartnerAccount partnerAccount = (PartnerAccount) obj;
            return Intrinsics.areEqual(this.authorization, partnerAccount.authorization) && this.category == partnerAccount.category && Intrinsics.areEqual(this.f75313id, partnerAccount.f75313id) && Intrinsics.areEqual(this.name, partnerAccount.name) && this.subcategory == partnerAccount.subcategory && Intrinsics.areEqual(this.supportedPaymentMethodTypes, partnerAccount.supportedPaymentMethodTypes) && Intrinsics.areEqual(this.balanceAmount, partnerAccount.balanceAmount) && Intrinsics.areEqual(this.currency, partnerAccount.currency) && Intrinsics.areEqual(this.displayableAccountNumbers, partnerAccount.displayableAccountNumbers) && Intrinsics.areEqual(this.initialBalanceAmount, partnerAccount.initialBalanceAmount) && Intrinsics.areEqual(this.institutionName, partnerAccount.institutionName) && Intrinsics.areEqual(this._allowSelection, partnerAccount._allowSelection) && Intrinsics.areEqual(this.allowSelectionMessage, partnerAccount.allowSelectionMessage) && Intrinsics.areEqual(this.institutionUrl, partnerAccount.institutionUrl) && Intrinsics.areEqual(this.linkedAccountId, partnerAccount.linkedAccountId) && Intrinsics.areEqual(this.routingNumber, partnerAccount.routingNumber) && this.status == partnerAccount.status;
        }
        return false;
    }

    public final boolean getAllowSelection$financial_connections_release() {
        Boolean bool = this._allowSelection;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final String getAllowSelectionMessage() {
        return this.allowSelectionMessage;
    }

    public final String getAuthorization() {
        return this.authorization;
    }

    public final Integer getBalanceAmount() {
        return this.balanceAmount;
    }

    public final FinancialConnectionsAccount.Category getCategory() {
        return this.category;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDisplayableAccountNumbers() {
        return this.displayableAccountNumbers;
    }

    public final String getEncryptedNumbers$financial_connections_release() {
        String str = this.displayableAccountNumbers;
        if (str != null) {
            String str2 = "••••" + str;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final String getFullName$financial_connections_release() {
        String str = this.name;
        String encryptedNumbers$financial_connections_release = getEncryptedNumbers$financial_connections_release();
        return str + " " + encryptedNumbers$financial_connections_release;
    }

    public final String getId() {
        return this.f75313id;
    }

    public final Integer getInitialBalanceAmount() {
        return this.initialBalanceAmount;
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getInstitutionUrl() {
        return this.institutionUrl;
    }

    public final String getLinkedAccountId() {
        return this.linkedAccountId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public final FinancialConnectionsAccount.Status getStatus() {
        return this.status;
    }

    public final FinancialConnectionsAccount.Subcategory getSubcategory() {
        return this.subcategory;
    }

    public final List<FinancialConnectionsAccount.SupportedPaymentMethodTypes> getSupportedPaymentMethodTypes() {
        return this.supportedPaymentMethodTypes;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.authorization.hashCode() * 31) + this.category.hashCode()) * 31) + this.f75313id.hashCode()) * 31) + this.name.hashCode()) * 31) + this.subcategory.hashCode()) * 31) + this.supportedPaymentMethodTypes.hashCode()) * 31;
        Integer num = this.balanceAmount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.currency;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayableAccountNumbers;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.initialBalanceAmount;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.institutionName;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this._allowSelection;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.allowSelectionMessage;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.institutionUrl;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.linkedAccountId;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.routingNumber;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        FinancialConnectionsAccount.Status status = this.status;
        return hashCode11 + (status != null ? status.hashCode() : 0);
    }

    public String toString() {
        String str = this.authorization;
        FinancialConnectionsAccount.Category category = this.category;
        String str2 = this.f75313id;
        String str3 = this.name;
        FinancialConnectionsAccount.Subcategory subcategory = this.subcategory;
        List<FinancialConnectionsAccount.SupportedPaymentMethodTypes> list = this.supportedPaymentMethodTypes;
        Integer num = this.balanceAmount;
        String str4 = this.currency;
        String str5 = this.displayableAccountNumbers;
        Integer num2 = this.initialBalanceAmount;
        String str6 = this.institutionName;
        Boolean bool = this._allowSelection;
        String str7 = this.allowSelectionMessage;
        String str8 = this.institutionUrl;
        String str9 = this.linkedAccountId;
        String str10 = this.routingNumber;
        FinancialConnectionsAccount.Status status = this.status;
        return "PartnerAccount(authorization=" + str + ", category=" + category + ", id=" + str2 + ", name=" + str3 + ", subcategory=" + subcategory + ", supportedPaymentMethodTypes=" + list + ", balanceAmount=" + num + ", currency=" + str4 + ", displayableAccountNumbers=" + str5 + ", initialBalanceAmount=" + num2 + ", institutionName=" + str6 + ", _allowSelection=" + bool + ", allowSelectionMessage=" + str7 + ", institutionUrl=" + str8 + ", linkedAccountId=" + str9 + ", routingNumber=" + str10 + ", status=" + status + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PartnerAccount(String authorization, FinancialConnectionsAccount.Category category, String id, String name, FinancialConnectionsAccount.Subcategory subcategory, List<? extends FinancialConnectionsAccount.SupportedPaymentMethodTypes> supportedPaymentMethodTypes, Integer num, String str, String str2, Integer num2, String str3, Boolean bool, String str4, String str5, String str6, String str7, FinancialConnectionsAccount.Status status) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(subcategory, "subcategory");
        Intrinsics.checkNotNullParameter(supportedPaymentMethodTypes, "supportedPaymentMethodTypes");
        this.authorization = authorization;
        this.category = category;
        this.f75313id = id;
        this.name = name;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = supportedPaymentMethodTypes;
        this.balanceAmount = num;
        this.currency = str;
        this.displayableAccountNumbers = str2;
        this.initialBalanceAmount = num2;
        this.institutionName = str3;
        this._allowSelection = bool;
        this.allowSelectionMessage = str4;
        this.institutionUrl = str5;
        this.linkedAccountId = str6;
        this.routingNumber = str7;
        this.status = status;
    }

    public /* synthetic */ PartnerAccount(String str, FinancialConnectionsAccount.Category category, String str2, String str3, FinancialConnectionsAccount.Subcategory subcategory, List list, Integer num, String str4, String str5, Integer num2, String str6, Boolean bool, String str7, String str8, String str9, String str10, FinancialConnectionsAccount.Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, category, str2, str3, subcategory, list, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : str10, (i & 65536) != 0 ? null : status);
    }
}
