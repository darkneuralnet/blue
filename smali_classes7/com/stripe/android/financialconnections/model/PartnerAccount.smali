.class public final Lcom/stripe/android/financialconnections/model/PartnerAccount;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;,
        Lcom/stripe/android/financialconnections/model/PartnerAccount$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008P\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u0000 v2\u00020\u0001:\u0002wvB\u00c1\u0001\u0012\u0006\u0010$\u001a\u00020\u000c\u0012\u0006\u0010%\u001a\u00020\u000e\u0012\u0006\u0010&\u001a\u00020\u000c\u0012\u0006\u0010\'\u001a\u00020\u000c\u0012\u0006\u0010(\u001a\u00020\u0012\u0012\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\u0008p\u0010qB\u00ed\u0001\u0008\u0017\u0012\u0006\u0010r\u001a\u00020\u0017\u0012\n\u0008\u0001\u0010$\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010%\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010&\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010\'\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010(\u001a\u0004\u0018\u00010\u0012\u0012\u0010\u0008\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\u0008\u0001\u0010*\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0001\u0010+\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010,\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010-\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0001\u0010.\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u00100\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u00101\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u00102\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u00103\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u00104\u001a\u0004\u0018\u00010\"\u0012\u0008\u0010t\u001a\u0004\u0018\u00010s\u00a2\u0006\u0004\u0008p\u0010uJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c2\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u00c7\u0001J\t\u0010\r\u001a\u00020\u000cH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000cH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000cH\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0012H\u00c6\u0003J\u000f\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u00c6\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u00d6\u0001\u00105\u001a\u00020\u00002\u0008\u0008\u0002\u0010$\u001a\u00020\u000c2\u0008\u0008\u0002\u0010%\u001a\u00020\u000e2\u0008\u0008\u0002\u0010&\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\'\u001a\u00020\u000c2\u0008\u0008\u0002\u0010(\u001a\u00020\u00122\u000e\u0008\u0002\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\"H\u00c6\u0001\u00a2\u0006\u0004\u00085\u00106J\t\u00107\u001a\u00020\u000cH\u00d6\u0001J\t\u00108\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010:\u001a\u00020\u00022\u0008\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R \u0010$\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008$\u0010;\u0012\u0004\u0008>\u0010?\u001a\u0004\u0008<\u0010=R \u0010%\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008%\u0010@\u0012\u0004\u0008C\u0010?\u001a\u0004\u0008A\u0010BR \u0010&\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008&\u0010;\u0012\u0004\u0008E\u0010?\u001a\u0004\u0008D\u0010=R \u0010\'\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\'\u0010;\u0012\u0004\u0008G\u0010?\u001a\u0004\u0008F\u0010=R \u0010(\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008(\u0010H\u0012\u0004\u0008K\u0010?\u001a\u0004\u0008I\u0010JR&\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008)\u0010L\u0012\u0004\u0008O\u0010?\u001a\u0004\u0008M\u0010NR\"\u0010*\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008*\u0010P\u0012\u0004\u0008R\u0010?\u001a\u0004\u0008Q\u0010\u0019R\"\u0010+\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008+\u0010;\u0012\u0004\u0008T\u0010?\u001a\u0004\u0008S\u0010=R\"\u0010,\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008,\u0010;\u0012\u0004\u0008V\u0010?\u001a\u0004\u0008U\u0010=R\"\u0010-\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008-\u0010P\u0012\u0004\u0008X\u0010?\u001a\u0004\u0008W\u0010\u0019R\"\u0010.\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008.\u0010;\u0012\u0004\u0008Z\u0010?\u001a\u0004\u0008Y\u0010=R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008/\u0010[\u0012\u0004\u0008\\\u0010?R\"\u00100\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u00080\u0010;\u0012\u0004\u0008^\u0010?\u001a\u0004\u0008]\u0010=R\"\u00101\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u00081\u0010;\u0012\u0004\u0008`\u0010?\u001a\u0004\u0008_\u0010=R\"\u00102\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u00082\u0010;\u0012\u0004\u0008b\u0010?\u001a\u0004\u0008a\u0010=R\"\u00103\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u00083\u0010;\u0012\u0004\u0008d\u0010?\u001a\u0004\u0008c\u0010=R\"\u00104\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u00084\u0010e\u0012\u0004\u0008h\u0010?\u001a\u0004\u0008f\u0010gR\u0014\u0010k\u001a\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008i\u0010jR\u0014\u0010m\u001a\u00020\u000c8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008l\u0010=R\u0014\u0010o\u001a\u00020\u000c8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008n\u0010=\u00a8\u0006x"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
        "",
        "",
        "component12",
        "()Ljava/lang/Boolean;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "component1",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
        "component2",
        "component3",
        "component4",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
        "component5",
        "",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
        "component6",
        "",
        "component7",
        "()Ljava/lang/Integer;",
        "component8",
        "component9",
        "component10",
        "component11",
        "component13",
        "component14",
        "component15",
        "component16",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
        "component17",
        "authorization",
        "category",
        "id",
        "name",
        "subcategory",
        "supportedPaymentMethodTypes",
        "balanceAmount",
        "currency",
        "displayableAccountNumbers",
        "initialBalanceAmount",
        "institutionName",
        "_allowSelection",
        "allowSelectionMessage",
        "institutionUrl",
        "linkedAccountId",
        "routingNumber",
        "status",
        "copy",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;)Lcom/stripe/android/financialconnections/model/PartnerAccount;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "Ljava/lang/String;",
        "getAuthorization",
        "()Ljava/lang/String;",
        "getAuthorization$annotations",
        "()V",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
        "getCategory",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
        "getCategory$annotations",
        "getId",
        "getId$annotations",
        "getName",
        "getName$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
        "getSubcategory",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
        "getSubcategory$annotations",
        "Ljava/util/List;",
        "getSupportedPaymentMethodTypes",
        "()Ljava/util/List;",
        "getSupportedPaymentMethodTypes$annotations",
        "Ljava/lang/Integer;",
        "getBalanceAmount",
        "getBalanceAmount$annotations",
        "getCurrency",
        "getCurrency$annotations",
        "getDisplayableAccountNumbers",
        "getDisplayableAccountNumbers$annotations",
        "getInitialBalanceAmount",
        "getInitialBalanceAmount$annotations",
        "getInstitutionName",
        "getInstitutionName$annotations",
        "Ljava/lang/Boolean;",
        "get_allowSelection$annotations",
        "getAllowSelectionMessage",
        "getAllowSelectionMessage$annotations",
        "getInstitutionUrl",
        "getInstitutionUrl$annotations",
        "getLinkedAccountId",
        "getLinkedAccountId$annotations",
        "getRoutingNumber",
        "getRoutingNumber$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
        "getStatus",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
        "getStatus$annotations",
        "getAllowSelection$financial_connections_release",
        "()Z",
        "allowSelection",
        "getEncryptedNumbers$financial_connections_release",
        "encryptedNumbers",
        "getFullName$financial_connections_release",
        "fullName",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lbt5;)V",
        "Companion",
        "$serializer",
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
        "SMAP\nPartnerAccountsList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerAccountsList.kt\ncom/stripe/android/financialconnections/model/PartnerAccount\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/model/PartnerAccount$Companion;


# instance fields
.field private final _allowSelection:Ljava/lang/Boolean;

.field private final allowSelectionMessage:Ljava/lang/String;

.field private final authorization:Ljava/lang/String;

.field private final balanceAmount:Ljava/lang/Integer;

.field private final category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

.field private final currency:Ljava/lang/String;

.field private final displayableAccountNumbers:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final initialBalanceAmount:Ljava/lang/Integer;

.field private final institutionName:Ljava/lang/String;

.field private final institutionUrl:Ljava/lang/String;

.field private final linkedAccountId:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final routingNumber:Ljava/lang/String;

.field private final status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

.field private final subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

.field private final supportedPaymentMethodTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/PartnerAccount$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/PartnerAccount$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->Companion:Lcom/stripe/android/financialconnections/model/PartnerAccount$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lbt5;)V
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "authorization"
        .end annotation
    .end param
    .param p3    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;
        .annotation runtime LVs5;
            value = "category"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "id"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "name"
        .end annotation
    .end param
    .param p6    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
        .annotation runtime LVs5;
            value = "subcategory"
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation runtime LVs5;
            value = "supported_payment_method_types"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation runtime LVs5;
            value = "balance_amount"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "currency"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "displayable_account_numbers"
        .end annotation
    .end param
    .param p11    # Ljava/lang/Integer;
        .annotation runtime LVs5;
            value = "initial_balance_amount"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "institution_name"
        .end annotation
    .end param
    .param p13    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "allow_selection"
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "allow_selection_message"
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "institution_url"
        .end annotation
    .end param
    .param p16    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "linked_account_id"
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "routing_number"
        .end annotation
    .end param
    .param p18    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;
        .annotation runtime LVs5;
            value = "status"
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

    move-object v0, p0

    move v1, p1

    and-int/lit8 v2, v1, 0x3f

    const/16 v3, 0x3f

    if-eq v3, v2, :cond_0

    sget-object v2, Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;->getDescriptor()LMs5;

    move-result-object v2

    invoke-static {p1, v3, v2}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v2, p2

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->authorization:Ljava/lang/String;

    move-object v2, p3

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    move-object v2, p4

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->id:Ljava/lang/String;

    move-object v2, p5

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->name:Ljava/lang/String;

    move-object v2, p6

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    move-object v2, p7

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    and-int/lit8 v2, v1, 0x40

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->balanceAmount:Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    move-object v2, p8

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->balanceAmount:Ljava/lang/Integer;

    :goto_0
    and-int/lit16 v2, v1, 0x80

    if-nez v2, :cond_2

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->currency:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p9

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->currency:Ljava/lang/String;

    :goto_1
    and-int/lit16 v2, v1, 0x100

    if-nez v2, :cond_3

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object v2, p10

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    :goto_2
    and-int/lit16 v2, v1, 0x200

    if-nez v2, :cond_4

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->initialBalanceAmount:Ljava/lang/Integer;

    goto :goto_3

    :cond_4
    move-object v2, p11

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->initialBalanceAmount:Ljava/lang/Integer;

    :goto_3
    and-int/lit16 v2, v1, 0x400

    if-nez v2, :cond_5

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionName:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v2, p12

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionName:Ljava/lang/String;

    :goto_4
    and-int/lit16 v2, v1, 0x800

    if-nez v2, :cond_6

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->_allowSelection:Ljava/lang/Boolean;

    goto :goto_5

    :cond_6
    move-object/from16 v2, p13

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->_allowSelection:Ljava/lang/Boolean;

    :goto_5
    and-int/lit16 v2, v1, 0x1000

    if-nez v2, :cond_7

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->allowSelectionMessage:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v2, p14

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->allowSelectionMessage:Ljava/lang/String;

    :goto_6
    and-int/lit16 v2, v1, 0x2000

    if-nez v2, :cond_8

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionUrl:Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object/from16 v2, p15

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionUrl:Ljava/lang/String;

    :goto_7
    and-int/lit16 v2, v1, 0x4000

    if-nez v2, :cond_9

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->linkedAccountId:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 v2, p16

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->linkedAccountId:Ljava/lang/String;

    :goto_8
    const v2, 0x8000

    and-int/2addr v2, v1

    if-nez v2, :cond_a

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->routingNumber:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v2, p17

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->routingNumber:Ljava/lang/String;

    :goto_9
    const/high16 v2, 0x10000

    and-int/2addr v1, v2

    if-nez v1, :cond_b

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    goto :goto_a

    :cond_b
    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    :goto_a
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    const-string v7, "authorization"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "category"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "id"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "name"

    invoke-static {p4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "subcategory"

    invoke-static {p5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "supportedPaymentMethodTypes"

    invoke-static {p6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->authorization:Ljava/lang/String;

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->id:Ljava/lang/String;

    iput-object v4, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->name:Ljava/lang/String;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    iput-object v6, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    move-object v1, p7

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->balanceAmount:Ljava/lang/Integer;

    move-object/from16 v1, p8

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->currency:Ljava/lang/String;

    move-object/from16 v1, p9

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    move-object/from16 v1, p10

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->initialBalanceAmount:Ljava/lang/Integer;

    move-object/from16 v1, p11

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionName:Ljava/lang/String;

    move-object/from16 v1, p12

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->_allowSelection:Ljava/lang/Boolean;

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->allowSelectionMessage:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionUrl:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->linkedAccountId:Ljava/lang/String;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->routingNumber:Ljava/lang/String;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v10, v2

    goto :goto_0

    :cond_0
    move-object/from16 v10, p7

    :goto_0
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_1

    move-object v11, v2

    goto :goto_1

    :cond_1
    move-object/from16 v11, p8

    :goto_1
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_2

    move-object v12, v2

    goto :goto_2

    :cond_2
    move-object/from16 v12, p9

    :goto_2
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_3

    move-object v13, v2

    goto :goto_3

    :cond_3
    move-object/from16 v13, p10

    :goto_3
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_4

    move-object v14, v2

    goto :goto_4

    :cond_4
    move-object/from16 v14, p11

    :goto_4
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_5

    move-object v15, v2

    goto :goto_5

    :cond_5
    move-object/from16 v15, p12

    :goto_5
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_6

    move-object/from16 v16, v2

    goto :goto_6

    :cond_6
    move-object/from16 v16, p13

    :goto_6
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_7

    move-object/from16 v17, v2

    goto :goto_7

    :cond_7
    move-object/from16 v17, p14

    :goto_7
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_8

    move-object/from16 v18, v2

    goto :goto_8

    :cond_8
    move-object/from16 v18, p15

    :goto_8
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_9

    move-object/from16 v19, v2

    goto :goto_9

    :cond_9
    move-object/from16 v19, p16

    :goto_9
    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_a

    move-object/from16 v20, v2

    goto :goto_a

    :cond_a
    move-object/from16 v20, p17

    :goto_a
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v3 .. v20}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;)V

    return-void
.end method

.method private final component12()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->_allowSelection:Ljava/lang/Boolean;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/PartnerAccount;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/PartnerAccount;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->authorization:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->id:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->name:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->balanceAmount:Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->currency:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->initialBalanceAmount:Ljava/lang/Integer;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionName:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->_allowSelection:Ljava/lang/Boolean;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->allowSelectionMessage:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionUrl:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->linkedAccountId:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->routingNumber:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v1, v1, v16

    if-eqz v1, :cond_10

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p16, v15

    move-object/from16 p17, v1

    invoke-virtual/range {p0 .. p17}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;)Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAllowSelectionMessage$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "allow_selection_message"
    .end annotation

    return-void
.end method

.method public static synthetic getAuthorization$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "authorization"
    .end annotation

    return-void
.end method

.method public static synthetic getBalanceAmount$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "balance_amount"
    .end annotation

    return-void
.end method

.method public static synthetic getCategory$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "category"
    .end annotation

    return-void
.end method

.method public static synthetic getCurrency$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "currency"
    .end annotation

    return-void
.end method

.method public static synthetic getDisplayableAccountNumbers$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "displayable_account_numbers"
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

.method public static synthetic getInitialBalanceAmount$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "initial_balance_amount"
    .end annotation

    return-void
.end method

.method public static synthetic getInstitutionName$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "institution_name"
    .end annotation

    return-void
.end method

.method public static synthetic getInstitutionUrl$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "institution_url"
    .end annotation

    return-void
.end method

.method public static synthetic getLinkedAccountId$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "linked_account_id"
    .end annotation

    return-void
.end method

.method public static synthetic getName$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "name"
    .end annotation

    return-void
.end method

.method public static synthetic getRoutingNumber$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "routing_number"
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

.method public static synthetic getSubcategory$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "subcategory"
    .end annotation

    return-void
.end method

.method public static synthetic getSupportedPaymentMethodTypes$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "supported_payment_method_types"
    .end annotation

    return-void
.end method

.method private static synthetic get_allowSelection$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "allow_selection"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/PartnerAccount;LUt0;LMs5;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->authorization:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, LUt0;->w(LMs5;ILjava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v0, v2}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2}, LUt0;->w(LMs5;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2}, LUt0;->w(LMs5;ILjava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    const/4 v4, 0x4

    invoke-interface {p1, p2, v4, v0, v2}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    new-instance v0, Lro;

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;

    invoke-direct {v0, v2}, Lro;-><init>(LKj2;)V

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    const/4 v4, 0x5

    invoke-interface {p1, p2, v4, v0, v2}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    move v2, v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->balanceAmount:Ljava/lang/Integer;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-eqz v2, :cond_2

    sget-object v2, LF52;->a:LF52;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->balanceAmount:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_2
    move v2, v3

    goto :goto_3

    :cond_3
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->currency:Ljava/lang/String;

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    move v2, v1

    :goto_3
    if-eqz v2, :cond_5

    sget-object v2, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->currency:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_6

    :goto_4
    move v2, v3

    goto :goto_5

    :cond_6
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    move v2, v1

    :goto_5
    if-eqz v2, :cond_8

    sget-object v2, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_8
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_9

    :goto_6
    move v2, v3

    goto :goto_7

    :cond_9
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->initialBalanceAmount:Ljava/lang/Integer;

    if-eqz v2, :cond_a

    goto :goto_6

    :cond_a
    move v2, v1

    :goto_7
    if-eqz v2, :cond_b

    sget-object v2, LF52;->a:LF52;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->initialBalanceAmount:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_c

    :goto_8
    move v2, v3

    goto :goto_9

    :cond_c
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionName:Ljava/lang/String;

    if-eqz v2, :cond_d

    goto :goto_8

    :cond_d
    move v2, v1

    :goto_9
    if-eqz v2, :cond_e

    sget-object v2, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionName:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_e
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_f

    :goto_a
    move v2, v3

    goto :goto_b

    :cond_f
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->_allowSelection:Ljava/lang/Boolean;

    if-eqz v2, :cond_10

    goto :goto_a

    :cond_10
    move v2, v1

    :goto_b
    if-eqz v2, :cond_11

    sget-object v2, LYY;->a:LYY;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->_allowSelection:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_12

    :goto_c
    move v2, v3

    goto :goto_d

    :cond_12
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->allowSelectionMessage:Ljava/lang/String;

    if-eqz v2, :cond_13

    goto :goto_c

    :cond_13
    move v2, v1

    :goto_d
    if-eqz v2, :cond_14

    sget-object v2, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->allowSelectionMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_14
    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_15

    :goto_e
    move v2, v3

    goto :goto_f

    :cond_15
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionUrl:Ljava/lang/String;

    if-eqz v2, :cond_16

    goto :goto_e

    :cond_16
    move v2, v1

    :goto_f
    if-eqz v2, :cond_17

    sget-object v2, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_17
    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_18

    :goto_10
    move v2, v3

    goto :goto_11

    :cond_18
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->linkedAccountId:Ljava/lang/String;

    if-eqz v2, :cond_19

    goto :goto_10

    :cond_19
    move v2, v1

    :goto_11
    if-eqz v2, :cond_1a

    sget-object v2, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->linkedAccountId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_1a
    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_1b

    :goto_12
    move v2, v3

    goto :goto_13

    :cond_1b
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->routingNumber:Ljava/lang/String;

    if-eqz v2, :cond_1c

    goto :goto_12

    :cond_1c
    move v2, v1

    :goto_13
    if-eqz v2, :cond_1d

    sget-object v2, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->routingNumber:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_1d
    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_1e

    :goto_14
    move v1, v3

    goto :goto_15

    :cond_1e
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    if-eqz v2, :cond_1f

    goto :goto_14

    :cond_1f
    :goto_15
    if-eqz v1, :cond_20

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    invoke-interface {p1, p2, v0, v1, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_20
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->authorization:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->initialBalanceAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionName:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->allowSelectionMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->linkedAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->routingNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->balanceAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;)Lcom/stripe/android/financialconnections/model/PartnerAccount;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
            ")",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    const-string v0, "authorization"

    move-object/from16 v18, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subcategory"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportedPaymentMethodTypes"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v19, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;)V

    return-object v19
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->authorization:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->authorization:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->balanceAmount:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->balanceAmount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->currency:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->initialBalanceAmount:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->initialBalanceAmount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->_allowSelection:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->_allowSelection:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->allowSelectionMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->allowSelectionMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->linkedAccountId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->linkedAccountId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->routingNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->routingNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    if-eq v1, p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getAllowSelection$financial_connections_release()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->_allowSelection:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public final getAllowSelectionMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->allowSelectionMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getAuthorization()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->authorization:Ljava/lang/String;

    return-object v0
.end method

.method public final getBalanceAmount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->balanceAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCategory()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayableAccountNumbers()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    return-object v0
.end method

.method public final getEncryptedNumbers$financial_connections_release()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u2022\u2022\u2022\u2022"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :cond_1
    return-object v0
.end method

.method public final getFullName$financial_connections_release()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->name:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getEncryptedNumbers$financial_connections_release()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitialBalanceAmount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->initialBalanceAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getInstitutionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionName:Ljava/lang/String;

    return-object v0
.end method

.method public final getInstitutionUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkedAccountId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->linkedAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getRoutingNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->routingNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    return-object v0
.end method

.method public final getSubcategory()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    return-object v0
.end method

.method public final getSupportedPaymentMethodTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->authorization:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->balanceAmount:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->currency:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->initialBalanceAmount:Ljava/lang/Integer;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionName:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->_allowSelection:Ljava/lang/Boolean;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->allowSelectionMessage:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionUrl:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->linkedAccountId:Ljava/lang/String;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->routingNumber:Ljava/lang/String;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    if-nez v1, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->authorization:Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    iget-object v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->id:Ljava/lang/String;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->name:Ljava/lang/String;

    iget-object v5, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    iget-object v6, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    iget-object v7, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->balanceAmount:Ljava/lang/Integer;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->currency:Ljava/lang/String;

    iget-object v9, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->displayableAccountNumbers:Ljava/lang/String;

    iget-object v10, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->initialBalanceAmount:Ljava/lang/Integer;

    iget-object v11, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionName:Ljava/lang/String;

    iget-object v12, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->_allowSelection:Ljava/lang/Boolean;

    iget-object v13, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->allowSelectionMessage:Ljava/lang/String;

    iget-object v14, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->institutionUrl:Ljava/lang/String;

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->linkedAccountId:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->routingNumber:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v18, v15

    const-string v15, "PartnerAccount(authorization="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", category="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subcategory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", supportedPaymentMethodTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", balanceAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", displayableAccountNumbers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", initialBalanceAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", institutionName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", _allowSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowSelectionMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", institutionUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkedAccountId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", routingNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
