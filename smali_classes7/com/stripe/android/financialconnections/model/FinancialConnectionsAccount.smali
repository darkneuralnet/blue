.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;
.super Lcom/stripe/android/financialconnections/model/PaymentAccount;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u00089\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u0000 y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0007z{y|}~\u007fB\u00ad\u0001\u0012\u0008\u0008\u0002\u0010&\u001a\u00020\u000b\u0012\u0006\u0010\'\u001a\u00020\r\u0012\u0006\u0010(\u001a\u00020\u000f\u0012\u0006\u0010)\u001a\u00020\u000f\u0012\u0006\u0010*\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010+\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010,\u001a\u00020\u0016\u0012\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u001d\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\"\u0012\u0010\u0008\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0018\u00a2\u0006\u0004\u0008s\u0010tB\u00d7\u0001\u0008\u0017\u0012\u0006\u0010u\u001a\u00020\r\u0012\n\u0008\u0001\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0001\u0010\'\u001a\u00020\r\u0012\n\u0008\u0001\u0010(\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0001\u0010)\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0008\u0001\u0010*\u001a\u00020\u0012\u0012\n\u0008\u0001\u0010+\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0001\u0010,\u001a\u0004\u0018\u00010\u0016\u0012\u0010\u0008\u0001\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\n\u0008\u0001\u0010.\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0001\u0010/\u001a\u0004\u0018\u00010\u001d\u0012\n\u0008\u0001\u00100\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0001\u00101\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0001\u00102\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0001\u00103\u001a\u0004\u0018\u00010\"\u0012\u0010\u0008\u0001\u00104\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0018\u0012\u0008\u0010w\u001a\u0004\u0018\u00010v\u00a2\u0006\u0004\u0008s\u0010xJ!\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u00c7\u0001J\t\u0010\u000c\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0012H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0014H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0016H\u00c6\u0003J\u000f\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0018H\u00c6\u0003J\u00b9\u0001\u00105\u001a\u00020\u00002\u0008\u0008\u0002\u0010&\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\'\u001a\u00020\r2\u0008\u0008\u0002\u0010(\u001a\u00020\u000f2\u0008\u0008\u0002\u0010)\u001a\u00020\u000f2\u0008\u0008\u0002\u0010*\u001a\u00020\u00122\u0008\u0008\u0002\u0010+\u001a\u00020\u00142\u0008\u0008\u0002\u0010,\u001a\u00020\u00162\u000e\u0008\u0002\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u001d2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\"2\u0010\u0008\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0018H\u00c6\u0001J\t\u00106\u001a\u00020\u000fH\u00d6\u0001J\t\u00107\u001a\u00020\rH\u00d6\u0001J\u0013\u0010:\u001a\u00020\u00122\u0008\u00109\u001a\u0004\u0018\u000108H\u00d6\u0003J\t\u0010;\u001a\u00020\rH\u00d6\u0001J\u0019\u0010?\u001a\u00020\t2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\rH\u00d6\u0001R \u0010&\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008&\u0010@\u0012\u0004\u0008C\u0010D\u001a\u0004\u0008A\u0010BR \u0010\'\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\'\u0010E\u0012\u0004\u0008H\u0010D\u001a\u0004\u0008F\u0010GR \u0010(\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008(\u0010I\u0012\u0004\u0008L\u0010D\u001a\u0004\u0008J\u0010KR \u0010)\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008)\u0010I\u0012\u0004\u0008N\u0010D\u001a\u0004\u0008M\u0010KR \u0010*\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008*\u0010O\u0012\u0004\u0008R\u0010D\u001a\u0004\u0008P\u0010QR \u0010+\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008+\u0010S\u0012\u0004\u0008V\u0010D\u001a\u0004\u0008T\u0010UR \u0010,\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008,\u0010W\u0012\u0004\u0008Z\u0010D\u001a\u0004\u0008X\u0010YR&\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008-\u0010[\u0012\u0004\u0008^\u0010D\u001a\u0004\u0008\\\u0010]R\"\u0010.\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008.\u0010_\u0012\u0004\u0008b\u0010D\u001a\u0004\u0008`\u0010aR\"\u0010/\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008/\u0010c\u0012\u0004\u0008f\u0010D\u001a\u0004\u0008d\u0010eR\"\u00100\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u00080\u0010I\u0012\u0004\u0008h\u0010D\u001a\u0004\u0008g\u0010KR\"\u00101\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u00081\u0010I\u0012\u0004\u0008j\u0010D\u001a\u0004\u0008i\u0010KR\"\u00102\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u00082\u0010I\u0012\u0004\u0008l\u0010D\u001a\u0004\u0008k\u0010KR\"\u00103\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u00083\u0010m\u0012\u0004\u0008p\u0010D\u001a\u0004\u0008n\u0010oR(\u00104\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u00084\u0010[\u0012\u0004\u0008r\u0010D\u001a\u0004\u0008q\u0010]\u00a8\u0006\u0080\u0001"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "Landroid/os/Parcelable;",
        "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
        "component1",
        "",
        "component2",
        "",
        "component3",
        "component4",
        "",
        "component5",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
        "component6",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
        "component7",
        "",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
        "component8",
        "Lcom/stripe/android/financialconnections/model/Balance;",
        "component9",
        "Lcom/stripe/android/financialconnections/model/BalanceRefresh;",
        "component10",
        "component11",
        "component12",
        "component13",
        "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;",
        "component14",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
        "component15",
        "category",
        "created",
        "id",
        "institutionName",
        "livemode",
        "status",
        "subcategory",
        "supportedPaymentMethodTypes",
        "balance",
        "balanceRefresh",
        "displayName",
        "last4",
        "ownership",
        "ownershipRefresh",
        "permissions",
        "copy",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "writeToParcel",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
        "getCategory",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
        "getCategory$annotations",
        "()V",
        "I",
        "getCreated",
        "()I",
        "getCreated$annotations",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "getId$annotations",
        "getInstitutionName",
        "getInstitutionName$annotations",
        "Z",
        "getLivemode",
        "()Z",
        "getLivemode$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
        "getStatus",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
        "getStatus$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
        "getSubcategory",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
        "getSubcategory$annotations",
        "Ljava/util/List;",
        "getSupportedPaymentMethodTypes",
        "()Ljava/util/List;",
        "getSupportedPaymentMethodTypes$annotations",
        "Lcom/stripe/android/financialconnections/model/Balance;",
        "getBalance",
        "()Lcom/stripe/android/financialconnections/model/Balance;",
        "getBalance$annotations",
        "Lcom/stripe/android/financialconnections/model/BalanceRefresh;",
        "getBalanceRefresh",
        "()Lcom/stripe/android/financialconnections/model/BalanceRefresh;",
        "getBalanceRefresh$annotations",
        "getDisplayName",
        "getDisplayName$annotations",
        "getLast4",
        "getLast4$annotations",
        "getOwnership",
        "getOwnership$annotations",
        "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;",
        "getOwnershipRefresh",
        "()Lcom/stripe/android/financialconnections/model/OwnershipRefresh;",
        "getOwnershipRefresh$annotations",
        "getPermissions",
        "getPermissions$annotations",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;Lbt5;)V",
        "Companion",
        "$serializer",
        "Category",
        "Permissions",
        "Status",
        "Subcategory",
        "SupportedPaymentMethodTypes",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;

.field public static final OBJECT_NEW:Ljava/lang/String; = "financial_connections.account"

.field public static final OBJECT_OLD:Ljava/lang/String; = "linked_account"


# instance fields
.field private final balance:Lcom/stripe/android/financialconnections/model/Balance;

.field private final balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

.field private final category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

.field private final created:I

.field private final displayName:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final institutionName:Ljava/lang/String;

.field private final last4:Ljava/lang/String;

.field private final livemode:Z

.field private final ownership:Ljava/lang/String;

.field private final ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

.field private final permissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;"
        }
    .end annotation
.end field

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

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->$stable:I

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;Lbt5;)V
    .locals 4
    .param p2    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;
        .annotation runtime LVs5;
            value = "category"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime LVs5;
            value = "created"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "id"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "institution_name"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime LVs5;
            value = "livemode"
        .end annotation
    .end param
    .param p7    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;
        .annotation runtime LVs5;
            value = "status"
        .end annotation
    .end param
    .param p8    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
        .annotation runtime LVs5;
            value = "subcategory"
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation runtime LVs5;
            value = "supported_payment_method_types"
        .end annotation
    .end param
    .param p10    # Lcom/stripe/android/financialconnections/model/Balance;
        .annotation runtime LVs5;
            value = "balance"
        .end annotation
    .end param
    .param p11    # Lcom/stripe/android/financialconnections/model/BalanceRefresh;
        .annotation runtime LVs5;
            value = "balance_refresh"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "display_name"
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "last4"
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "ownership"
        .end annotation
    .end param
    .param p15    # Lcom/stripe/android/financialconnections/model/OwnershipRefresh;
        .annotation runtime LVs5;
            value = "ownership_refresh"
        .end annotation
    .end param
    .param p16    # Ljava/util/List;
        .annotation runtime LVs5;
            value = "permissions"
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

    and-int/lit16 v2, v1, 0x9e

    const/16 v3, 0x9e

    if-eq v3, v2, :cond_0

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->getDescriptor()LMs5;

    move-result-object v2

    invoke-static {p1, v3, v2}, LzW3;->b(IILMs5;)V

    :cond_0
    const/4 v2, 0x0

    invoke-direct {p0, v2}, Lcom/stripe/android/financialconnections/model/PaymentAccount;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v3, v1, 0x1

    if-nez v3, :cond_1

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    goto :goto_0

    :cond_1
    move-object v3, p2

    :goto_0
    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    move v3, p3

    iput v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    move-object v3, p4

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    move-object v3, p5

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    move v3, p6

    iput-boolean v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    and-int/lit8 v3, v1, 0x20

    if-nez v3, :cond_2

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    goto :goto_1

    :cond_2
    move-object v3, p7

    :goto_1
    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    and-int/lit8 v3, v1, 0x40

    if-nez v3, :cond_3

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    goto :goto_2

    :cond_3
    move-object v3, p8

    :goto_2
    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    move-object v3, p9

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    and-int/lit16 v3, v1, 0x100

    if-nez v3, :cond_4

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    goto :goto_3

    :cond_4
    move-object v3, p10

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    :goto_3
    and-int/lit16 v3, v1, 0x200

    if-nez v3, :cond_5

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    goto :goto_4

    :cond_5
    move-object v3, p11

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    :goto_4
    and-int/lit16 v3, v1, 0x400

    if-nez v3, :cond_6

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object/from16 v3, p12

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    :goto_5
    and-int/lit16 v3, v1, 0x800

    if-nez v3, :cond_7

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v3, p13

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    :goto_6
    and-int/lit16 v3, v1, 0x1000

    if-nez v3, :cond_8

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object/from16 v3, p14

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    :goto_7
    and-int/lit16 v3, v1, 0x2000

    if-nez v3, :cond_9

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    goto :goto_8

    :cond_9
    move-object/from16 v3, p15

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    :goto_8
    and-int/lit16 v1, v1, 0x4000

    if-nez v1, :cond_a

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    goto :goto_9

    :cond_a
    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    :goto_9
    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/Balance;",
            "Lcom/stripe/android/financialconnections/model/BalanceRefresh;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p6

    move-object v5, p7

    move-object/from16 v6, p8

    const-string v7, "category"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "id"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "institutionName"

    invoke-static {p4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "status"

    invoke-static {p6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "subcategory"

    invoke-static {p7, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "supportedPaymentMethodTypes"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    invoke-direct {p0, v7}, Lcom/stripe/android/financialconnections/model/PaymentAccount;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    move v1, p2

    iput v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    move v1, p5

    iput-boolean v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    iput-object v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    iput-object v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    move-object/from16 v1, p9

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    move-object/from16 v1, p10

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    move-object/from16 v1, p11

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    move-object/from16 v1, p12

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    move-object v8, v1

    goto :goto_1

    :cond_1
    move-object/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    move-object v9, v1

    goto :goto_2

    :cond_2
    move-object/from16 v9, p7

    :goto_2
    and-int/lit16 v1, v0, 0x100

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object/from16 v11, p9

    :goto_3
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_4

    move-object v12, v2

    goto :goto_4

    :cond_4
    move-object/from16 v12, p10

    :goto_4
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_5

    move-object v13, v2

    goto :goto_5

    :cond_5
    move-object/from16 v13, p11

    :goto_5
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_6

    move-object v14, v2

    goto :goto_6

    :cond_6
    move-object/from16 v14, p12

    :goto_6
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_7

    move-object v15, v2

    goto :goto_7

    :cond_7
    move-object/from16 v15, p13

    :goto_7
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_8

    move-object/from16 v16, v2

    goto :goto_8

    :cond_8
    move-object/from16 v16, p14

    :goto_8
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_9

    move-object/from16 v17, v2

    goto :goto_9

    :cond_9
    move-object/from16 v17, p15

    :goto_9
    move-object/from16 v2, p0

    move/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v10, p8

    invoke-direct/range {v2 .. v17}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v1, p15

    :goto_e
    move-object/from16 p1, v2

    move/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, v1

    invoke-virtual/range {p0 .. p15}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->copy(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getBalance$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "balance"
    .end annotation

    return-void
.end method

.method public static synthetic getBalanceRefresh$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "balance_refresh"
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

.method public static synthetic getCreated$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "created"
    .end annotation

    return-void
.end method

.method public static synthetic getDisplayName$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "display_name"
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

.method public static synthetic getInstitutionName$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "institution_name"
    .end annotation

    return-void
.end method

.method public static synthetic getLast4$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "last4"
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

.method public static synthetic getOwnership$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "ownership"
    .end annotation

    return-void
.end method

.method public static synthetic getOwnershipRefresh$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "ownership_refresh"
    .end annotation

    return-void
.end method

.method public static synthetic getPermissions$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "permissions"
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

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;LUt0;LMs5;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    if-eq v1, v3, :cond_1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    if-eqz v1, :cond_2

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-interface {p1, p2, v0, v1, v3}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    iget v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    invoke-interface {p1, p2, v2, v1}, LUt0;->e(LMs5;II)V

    const/4 v1, 0x2

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3}, LUt0;->w(LMs5;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3}, LUt0;->w(LMs5;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    invoke-interface {p1, p2, v1, v3}, LUt0;->v(LMs5;IZ)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_2
    move v3, v2

    goto :goto_3

    :cond_3
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    if-eq v3, v4, :cond_4

    goto :goto_2

    :cond_4
    move v3, v0

    :goto_3
    if-eqz v3, :cond_5

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    invoke-interface {p1, p2, v1, v3, v4}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_4
    move v3, v2

    goto :goto_5

    :cond_6
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    if-eq v3, v4, :cond_7

    goto :goto_4

    :cond_7
    move v3, v0

    :goto_5
    if-eqz v3, :cond_8

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-interface {p1, p2, v1, v3, v4}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_8
    new-instance v1, Lro;

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;

    invoke-direct {v1, v3}, Lro;-><init>(LKj2;)V

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    const/4 v4, 0x7

    invoke-interface {p1, p2, v4, v1, v3}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_9

    :goto_6
    move v3, v2

    goto :goto_7

    :cond_9
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    if-eqz v3, :cond_a

    goto :goto_6

    :cond_a
    move v3, v0

    :goto_7
    if-eqz v3, :cond_b

    sget-object v3, Lcom/stripe/android/financialconnections/model/Balance$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Balance$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    invoke-interface {p1, p2, v1, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_b
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_8
    move v3, v2

    goto :goto_9

    :cond_c
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    if-eqz v3, :cond_d

    goto :goto_8

    :cond_d
    move v3, v0

    :goto_9
    if-eqz v3, :cond_e

    sget-object v3, Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    invoke-interface {p1, p2, v1, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_e
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_f

    :goto_a
    move v3, v2

    goto :goto_b

    :cond_f
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    if-eqz v3, :cond_10

    goto :goto_a

    :cond_10
    move v3, v0

    :goto_b
    if-eqz v3, :cond_11

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_12

    :goto_c
    move v3, v2

    goto :goto_d

    :cond_12
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    if-eqz v3, :cond_13

    goto :goto_c

    :cond_13
    move v3, v0

    :goto_d
    if-eqz v3, :cond_14

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_14
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_15

    :goto_e
    move v3, v2

    goto :goto_f

    :cond_15
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    if-eqz v3, :cond_16

    goto :goto_e

    :cond_16
    move v3, v0

    :goto_f
    if-eqz v3, :cond_17

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_17
    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_18

    :goto_10
    move v3, v2

    goto :goto_11

    :cond_18
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    if-eqz v3, :cond_19

    goto :goto_10

    :cond_19
    move v3, v0

    :goto_11
    if-eqz v3, :cond_1a

    sget-object v3, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    invoke-interface {p1, p2, v1, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_1a
    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_1b

    :goto_12
    move v0, v2

    goto :goto_13

    :cond_1b
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    if-eqz v3, :cond_1c

    goto :goto_12

    :cond_1c
    :goto_13
    if-eqz v0, :cond_1d

    new-instance v0, Lro;

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;

    invoke-direct {v0, v2}, Lro;-><init>(LKj2;)V

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_1d
    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    return-object v0
.end method

.method public final component10()Lcom/stripe/android/financialconnections/model/BalanceRefresh;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Lcom/stripe/android/financialconnections/model/OwnershipRefresh;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    return v0
.end method

.method public final component6()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Lcom/stripe/android/financialconnections/model/Balance;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/Balance;",
            "Lcom/stripe/android/financialconnections/model/BalanceRefresh;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;)",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;"
        }
    .end annotation

    const-string v0, "category"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "institutionName"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subcategory"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportedPaymentMethodTypes"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    move-object v1, v0

    move/from16 v3, p2

    move/from16 v6, p5

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    iget v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getBalance()Lcom/stripe/android/financialconnections/model/Balance;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    return-object v0
.end method

.method public final getBalanceRefresh()Lcom/stripe/android/financialconnections/model/BalanceRefresh;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    return-object v0
.end method

.method public final getCategory()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    return-object v0
.end method

.method public final getCreated()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    return v0
.end method

.method public final getDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInstitutionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    return-object v0
.end method

.method public final getLast4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final getLivemode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    return v0
.end method

.method public final getOwnership()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    return-object v0
.end method

.method public final getOwnershipRefresh()Lcom/stripe/android/financialconnections/model/OwnershipRefresh;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    return-object v0
.end method

.method public final getPermissions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    return-object v0
.end method

.method public final getStatus()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    return-object v0
.end method

.method public final getSubcategory()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

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

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/Balance;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    if-nez v1, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    iget v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    iget-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    iget-boolean v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    iget-object v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    iget-object v7, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    iget-object v9, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    iget-object v10, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    iget-object v11, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    iget-object v12, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    iget-object v13, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    iget-object v14, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v15

    const-string v15, "FinancialConnectionsAccount(category="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", created="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", institutionName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", livemode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subcategory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", supportedPaymentMethodTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", balance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", balanceRefresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", displayName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", last4="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ownership="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ownershipRefresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", permissions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/Balance;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    if-nez p2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    :goto_5
    return-void
.end method
