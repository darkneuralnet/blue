.class public final Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/model/StripeParamsModel;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentMethodCreateParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "USBankAccount"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u000f\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\'\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cBC\u0008\u0002\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c0\u0003\u00a2\u0006\u0002\u0008\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c0\u0003\u00a2\u0006\u0002\u0008 J\u0010\u0010!\u001a\u0004\u0018\u00010\u0004H\u00c0\u0003\u00a2\u0006\u0002\u0008\"J\u0010\u0010#\u001a\u0004\u0018\u00010\tH\u00c0\u0003\u00a2\u0006\u0002\u0008$J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c0\u0003\u00a2\u0006\u0002\u0008&JE\u0010\'\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001J\u0013\u0010*\u001a\u00020+2\u0008\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020)H\u00d6\u0001J\u0014\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020-00H\u0016J\t\u00101\u001a\u00020\u0004H\u00d6\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020)H\u00d6\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0005R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u0013\"\u0004\u0008\u001a\u0010\u0005R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u0013\"\u0004\u0008\u001c\u0010\u0005\u00a8\u00068"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;",
        "Lcom/stripe/android/model/StripeParamsModel;",
        "Landroid/os/Parcelable;",
        "linkAccountSessionId",
        "",
        "(Ljava/lang/String;)V",
        "accountNumber",
        "routingNumber",
        "accountType",
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;",
        "accountHolderType",
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V",
        "getAccountHolderType$payments_core_release",
        "()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;",
        "setAccountHolderType$payments_core_release",
        "(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V",
        "getAccountNumber$payments_core_release",
        "()Ljava/lang/String;",
        "setAccountNumber$payments_core_release",
        "getAccountType$payments_core_release",
        "()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;",
        "setAccountType$payments_core_release",
        "(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;)V",
        "getLinkAccountSessionId$payments_core_release",
        "setLinkAccountSessionId$payments_core_release",
        "getRoutingNumber$payments_core_release",
        "setRoutingNumber$payments_core_release",
        "component1",
        "component1$payments_core_release",
        "component2",
        "component2$payments_core_release",
        "component3",
        "component3$payments_core_release",
        "component4",
        "component4$payments_core_release",
        "component5",
        "component5$payments_core_release",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toParamMap",
        "",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "Companion",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;",
            ">;"
        }
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount$Companion;

.field private static final PARAM_ACCOUNT_HOLDER_TYPE:Ljava/lang/String; = "account_holder_type"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final PARAM_ACCOUNT_NUMBER:Ljava/lang/String; = "account_number"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final PARAM_ACCOUNT_TYPE:Ljava/lang/String; = "account_type"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final PARAM_LINKED_ACCOUNT_SESSION_ID:Ljava/lang/String; = "link_account_session"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final PARAM_ROUTING_NUMBER:Ljava/lang/String; = "routing_number"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

.field private accountNumber:Ljava/lang/String;

.field private accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

.field private linkAccountSessionId:Ljava/lang/String;

.field private routingNumber:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->$stable:I

    new-instance v0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 7

    const-string v0, "linkAccountSessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V
    .locals 7

    const-string v0, "accountNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "routingNumber"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountHolderType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->linkAccountSessionId:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountNumber:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->routingNumber:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    iput-object p5, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p7, v0

    goto :goto_0

    :cond_0
    move-object p7, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move-object v1, v0

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    move-object v2, v0

    goto :goto_2

    :cond_2
    move-object v2, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    move-object v3, v0

    goto :goto_3

    :cond_3
    move-object v3, p4

    :goto_3
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    move-object p6, v0

    goto :goto_4

    :cond_4
    move-object p6, p5

    :goto_4
    move-object p1, p0

    move-object p2, p7

    move-object p3, v1

    move-object p4, v2

    move-object p5, v3

    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->linkAccountSessionId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountNumber:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->routingNumber:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->linkAccountSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component3$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->routingNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component4$payments_core_release()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    return-object v0
.end method

.method public final component5$payments_core_release()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;
    .locals 7

    new-instance v6, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V

    return-object v6
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
    instance-of v1, p1, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->linkAccountSessionId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->linkAccountSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->routingNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->routingNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAccountHolderType$payments_core_release()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    return-object v0
.end method

.method public final getAccountNumber$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getAccountType$payments_core_release()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    return-object v0
.end method

.method public final getLinkAccountSessionId$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->linkAccountSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getRoutingNumber$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->routingNumber:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->linkAccountSessionId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountNumber:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->routingNumber:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public final setAccountHolderType$payments_core_release(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    return-void
.end method

.method public final setAccountNumber$payments_core_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountNumber:Ljava/lang/String;

    return-void
.end method

.method public final setAccountType$payments_core_release(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    return-void
.end method

.method public final setLinkAccountSessionId$payments_core_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->linkAccountSessionId:Ljava/lang/String;

    return-void
.end method

.method public final setRoutingNumber$payments_core_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->routingNumber:Ljava/lang/String;

    return-void
.end method

.method public toParamMap()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->linkAccountSessionId:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v1, "link_account_session"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    new-array v0, v0, [Lkotlin/Pair;

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountNumber:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v2, "account_number"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->routingNumber:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v2, "routing_number"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->getValue()Ljava/lang/String;

    move-result-object v1

    const-string v2, "account_type"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->getValue()Ljava/lang/String;

    move-result-object v1

    const-string v2, "account_holder_type"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->linkAccountSessionId:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountNumber:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->routingNumber:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    iget-object v4, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "USBankAccount(linkAccountSessionId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", accountNumber="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", routingNumber="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", accountType="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", accountHolderType="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->linkAccountSessionId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->routingNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    return-void
.end method
