.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008(\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0004hgijB\u0081\u0001\u0008\u0000\u0012\u0006\u0010!\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020\n\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010%\u001a\u00020\u0013\u0012\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u001d\u0012\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008a\u0010bB\u009d\u0001\u0008\u0017\u0012\u0006\u0010c\u001a\u00020.\u0012\n\u0008\u0001\u0010!\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0001\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0001\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0001\u0010$\u001a\u0004\u0018\u00010\r\u0012\u0008\u0008\u0001\u0010%\u001a\u00020\u0013\u0012\n\u0008\u0001\u0010&\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0001\u0010\'\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0001\u0010(\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0001\u0010)\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0001\u0010*\u001a\u0004\u0018\u00010\u001d\u0012\n\u0008\u0001\u0010+\u001a\u0004\u0018\u00010\u001f\u0012\u0008\u0010e\u001a\u0004\u0018\u00010d\u00a2\u0006\u0004\u0008a\u0010fJ!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u00c7\u0001J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\t\u0010\u000c\u001a\u00020\nH\u00c6\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\rH\u00c0\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\rH\u00c0\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ\t\u0010\u0014\u001a\u00020\u0013H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nH\u00c0\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u0087\u0001\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010!\u001a\u00020\n2\u0008\u0008\u0002\u0010\"\u001a\u00020\n2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010%\u001a\u00020\u00132\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u001d2\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u001fH\u00c6\u0001J\t\u0010-\u001a\u00020\nH\u00d6\u0001J\t\u0010/\u001a\u00020.H\u00d6\u0001J\u0013\u00102\u001a\u00020\u00132\u0008\u00101\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00103\u001a\u00020.H\u00d6\u0001J\u0019\u00107\u001a\u00020\u00082\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020.H\u00d6\u0001R \u0010!\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008!\u00108\u0012\u0004\u0008:\u0010;\u001a\u0004\u00089\u0010\u0019R \u0010\"\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\"\u00108\u0012\u0004\u0008=\u0010;\u001a\u0004\u0008<\u0010\u0019R\"\u0010#\u001a\u0004\u0018\u00010\r8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008#\u0010>\u0012\u0004\u0008@\u0010;\u001a\u0004\u0008?\u0010\u000fR\"\u0010$\u001a\u0004\u0018\u00010\r8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008$\u0010>\u0012\u0004\u0008B\u0010;\u001a\u0004\u0008A\u0010\u000fR \u0010%\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008%\u0010C\u0012\u0004\u0008F\u0010;\u001a\u0004\u0008D\u0010ER\"\u0010&\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008&\u0010G\u0012\u0004\u0008J\u0010;\u001a\u0004\u0008H\u0010IR\"\u0010\'\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\'\u00108\u0012\u0004\u0008L\u0010;\u001a\u0004\u0008K\u0010\u0019R\"\u0010(\u001a\u0004\u0018\u00010\n8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008(\u00108\u0012\u0004\u0008N\u0010;\u001a\u0004\u0008M\u0010\u0019R\"\u0010)\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008)\u0010O\u0012\u0004\u0008R\u0010;\u001a\u0004\u0008P\u0010QR\"\u0010*\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008*\u0010S\u0012\u0004\u0008V\u0010;\u001a\u0004\u0008T\u0010UR\"\u0010+\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008+\u0010W\u0012\u0004\u0008Z\u0010;\u001a\u0004\u0008X\u0010YR\u0011\u0010\\\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008[\u0010\u000fR\u0016\u0010`\u001a\u0004\u0018\u00010]8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008^\u0010_\u00a8\u0006k"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "Landroid/os/Parcelable;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "component1",
        "component2",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;",
        "component3$financial_connections_release",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;",
        "component3",
        "component4$financial_connections_release",
        "component4",
        "",
        "component5",
        "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
        "component6",
        "component7",
        "component8$financial_connections_release",
        "()Ljava/lang/String;",
        "component8",
        "Lcom/stripe/android/financialconnections/model/ManualEntry;",
        "component9",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;",
        "component10",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;",
        "component11",
        "clientSecret",
        "id",
        "accountsOld",
        "accountsNew",
        "livemode",
        "paymentAccount",
        "returnUrl",
        "bankAccountToken",
        "manualEntry",
        "status",
        "statusDetails",
        "copy",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "writeToParcel",
        "Ljava/lang/String;",
        "getClientSecret",
        "getClientSecret$annotations",
        "()V",
        "getId",
        "getId$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;",
        "getAccountsOld$financial_connections_release",
        "getAccountsOld$financial_connections_release$annotations",
        "getAccountsNew$financial_connections_release",
        "getAccountsNew$financial_connections_release$annotations",
        "Z",
        "getLivemode",
        "()Z",
        "getLivemode$annotations",
        "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
        "getPaymentAccount",
        "()Lcom/stripe/android/financialconnections/model/PaymentAccount;",
        "getPaymentAccount$annotations",
        "getReturnUrl",
        "getReturnUrl$annotations",
        "getBankAccountToken$financial_connections_release",
        "getBankAccountToken$financial_connections_release$annotations",
        "Lcom/stripe/android/financialconnections/model/ManualEntry;",
        "getManualEntry",
        "()Lcom/stripe/android/financialconnections/model/ManualEntry;",
        "getManualEntry$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;",
        "getStatus",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;",
        "getStatus$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;",
        "getStatusDetails",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;",
        "getStatusDetails$annotations",
        "getAccounts",
        "accounts",
        "Lcom/stripe/android/model/Token;",
        "getParsedToken$financial_connections_release",
        "()Lcom/stripe/android/model/Token;",
        "parsedToken",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;Lbt5;)V",
        "Companion",
        "$serializer",
        "Status",
        "StatusDetails",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFinancialConnectionsSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSession.kt\ncom/stripe/android/financialconnections/model/FinancialConnectionsSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;


# instance fields
.field private final accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

.field private final accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

.field private final bankAccountToken:Ljava/lang/String;

.field private final clientSecret:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final livemode:Z

.field private final manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

.field private final paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

.field private final returnUrl:Ljava/lang/String;

.field private final status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

.field private final statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->$stable:I

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;Lbt5;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "client_secret"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "id"
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
        .annotation runtime LVs5;
            value = "linked_accounts"
        .end annotation
    .end param
    .param p5    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
        .annotation runtime LVs5;
            value = "accounts"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime LVs5;
            value = "livemode"
        .end annotation
    .end param
    .param p7    # Lcom/stripe/android/financialconnections/model/PaymentAccount;
        .annotation runtime LVs5;
            value = "payment_account"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "return_url"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "bank_account_token"
        .end annotation

        .annotation runtime LWs5;
            with = Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;
        .end annotation
    .end param
    .param p10    # Lcom/stripe/android/financialconnections/model/ManualEntry;
        .annotation runtime LVs5;
            value = "manual_entry"
        .end annotation
    .end param
    .param p11    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;
        .annotation runtime LVs5;
            value = "status"
        .end annotation
    .end param
    .param p12    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;
        .annotation runtime LVs5;
            value = "status_details"
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "This synthesized declaration should not be used directly"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = ""
            imports = {}
        .end subannotation
    .end annotation

    and-int/lit8 p13, p1, 0x13

    const/16 v0, 0x13

    if-eq v0, p13, :cond_0

    sget-object p13, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;

    invoke-virtual {p13}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;->getDescriptor()LMs5;

    move-result-object p13

    invoke-static {p1, v0, p13}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    :goto_1
    iput-boolean p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    :goto_2
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    :goto_3
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    :goto_4
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    goto :goto_5

    :cond_6
    iput-object p10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    :goto_5
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    goto :goto_6

    :cond_7
    iput-object p11, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    :goto_6
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_8

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    goto :goto_7

    :cond_8
    iput-object p12, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    :goto_7
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    iput-boolean p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    iput-object p9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    iput-object p10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    iput-object p11, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v11, v2

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v12, v2

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    move-object v13, v2

    goto :goto_6

    :cond_6
    move-object/from16 v13, p10

    :goto_6
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_7

    move-object v14, v2

    goto :goto_7

    :cond_7
    move-object/from16 v14, p11

    :goto_7
    move-object v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move/from16 v8, p5

    invoke-direct/range {v3 .. v14}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    goto :goto_a

    :cond_a
    move-object/from16 v1, p11

    :goto_a
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v1

    invoke-virtual/range {p0 .. p11}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAccountsNew$financial_connections_release$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "accounts"
    .end annotation

    return-void
.end method

.method public static synthetic getAccountsOld$financial_connections_release$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "linked_accounts"
    .end annotation

    return-void
.end method

.method public static synthetic getBankAccountToken$financial_connections_release$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "bank_account_token"
    .end annotation

    .annotation runtime LWs5;
        with = Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getClientSecret$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "client_secret"
    .end annotation

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "id"
    .end annotation

    return-void
.end method

.method public static synthetic getLivemode$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "livemode"
    .end annotation

    return-void
.end method

.method public static synthetic getManualEntry$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "manual_entry"
    .end annotation

    return-void
.end method

.method public static synthetic getPaymentAccount$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "payment_account"
    .end annotation

    return-void
.end method

.method public static synthetic getReturnUrl$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "return_url"
    .end annotation

    return-void
.end method

.method public static synthetic getStatus$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "status"
    .end annotation

    return-void
.end method

.method public static synthetic getStatusDetails$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "status_details"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;LUt0;LMs5;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, LUt0;->w(LMs5;ILjava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0}, LUt0;->w(LMs5;ILjava/lang/String;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_0

    :goto_0
    move v3, v2

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_1
    if-eqz v3, :cond_2

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_2
    move v3, v2

    goto :goto_3

    :cond_3
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move v3, v1

    :goto_3
    if-eqz v3, :cond_5

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x4

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    invoke-interface {p1, p2, v0, v3}, LUt0;->v(LMs5;IZ)V

    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_4
    move v3, v2

    goto :goto_5

    :cond_6
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    move v3, v1

    :goto_5
    if-eqz v3, :cond_8

    sget-object v3, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_8
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_9

    :goto_6
    move v3, v2

    goto :goto_7

    :cond_9
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    if-eqz v3, :cond_a

    goto :goto_6

    :cond_a
    move v3, v1

    :goto_7
    if-eqz v3, :cond_b

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_8
    move v3, v2

    goto :goto_9

    :cond_c
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    if-eqz v3, :cond_d

    goto :goto_8

    :cond_d
    move v3, v1

    :goto_9
    if-eqz v3, :cond_e

    sget-object v3, Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_e
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_f

    :goto_a
    move v3, v2

    goto :goto_b

    :cond_f
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    if-eqz v3, :cond_10

    goto :goto_a

    :cond_10
    move v3, v1

    :goto_b
    if-eqz v3, :cond_11

    sget-object v3, Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_12

    :goto_c
    move v3, v2

    goto :goto_d

    :cond_12
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    if-eqz v3, :cond_13

    goto :goto_c

    :cond_13
    move v3, v1

    :goto_d
    if-eqz v3, :cond_14

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_14
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_15

    :goto_e
    move v1, v2

    goto :goto_f

    :cond_15
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    if-eqz v3, :cond_16

    goto :goto_e

    :cond_16
    :goto_f
    if-eqz v1, :cond_17

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$$serializer;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    invoke-interface {p1, p2, v0, v1, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_17
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    return-object v0
.end method

.method public final component11()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    return-object v0
.end method

.method public final component4$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    return v0
.end method

.method public final component6()Lcom/stripe/android/financialconnections/model/PaymentAccount;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component8$financial_connections_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/stripe/android/financialconnections/model/ManualEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;
    .locals 13

    const-string v0, "clientSecret"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-object v1, v0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAccounts()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public final getAccountsNew$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    return-object v0
.end method

.method public final getAccountsOld$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    return-object v0
.end method

.method public final getBankAccountToken$financial_connections_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLivemode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    return v0
.end method

.method public final getManualEntry()Lcom/stripe/android/financialconnections/model/ManualEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    return-object v0
.end method

.method public final getParsedToken$financial_connections_release()Lcom/stripe/android/model/Token;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/stripe/android/model/parsers/TokenJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/TokenJsonParser;-><init>()V

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/parsers/TokenJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Token;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    return-object v0
.end method

.method public final getReturnUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    return-object v0
.end method

.method public final getStatusDetails()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/ManualEntry;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    if-nez v1, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    iget-boolean v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    iget-object v5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    iget-object v8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    iget-object v9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    iget-object v10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "FinancialConnectionsSession(clientSecret="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", accountsOld="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", accountsNew="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", livemode="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", paymentAccount="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", returnUrl="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bankAccountToken="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", manualEntry="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", statusDetails="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/ManualEntry;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_3
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    if-nez v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_4
    return-void
.end method
