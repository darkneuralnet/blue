.class public final Lcom/stripe/android/model/PaymentMethod$USBankAccount;
.super Lcom/stripe/android/model/PaymentMethod$TypeData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "USBankAccount"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;,
        Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;,
        Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0003)*+BS\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003Je\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020\u001dH\u00d6\u0001J\t\u0010#\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u001dH\u00d6\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006,"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount;",
        "Lcom/stripe/android/model/PaymentMethod$TypeData;",
        "accountHolderType",
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;",
        "accountType",
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;",
        "bankName",
        "",
        "fingerprint",
        "last4",
        "linkedAccount",
        "networks",
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;",
        "routingNumber",
        "(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;Ljava/lang/String;)V",
        "type",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "getType",
        "()Lcom/stripe/android/model/PaymentMethod$Type;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "USBankAccountHolderType",
        "USBankAccountType",
        "USBankNetworks",
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
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/PaymentMethod$USBankAccount;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final bankName:Ljava/lang/String;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final fingerprint:Ljava/lang/String;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final last4:Ljava/lang/String;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final linkedAccount:Ljava/lang/String;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final networks:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final routingNumber:Ljava/lang/String;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;Ljava/lang/String;)V
    .locals 1

    const-string v0, "accountHolderType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/model/PaymentMethod$TypeData;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    iput-object p2, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    iput-object p3, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->bankName:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->fingerprint:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->last4:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->linkedAccount:Ljava/lang/String;

    iput-object p7, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->networks:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;

    iput-object p8, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->routingNumber:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/PaymentMethod$USBankAccount;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethod$USBankAccount;
    .locals 9

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->bankName:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->fingerprint:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->last4:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->linkedAccount:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->networks:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->routingNumber:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p8

    :goto_7
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move-object p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->copy(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$USBankAccount;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->bankName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->fingerprint:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->linkedAccount:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->networks:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->routingNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$USBankAccount;
    .locals 10

    const-string v0, "accountHolderType"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountType"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;

    move-object v1, v0

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/model/PaymentMethod$USBankAccount;-><init>(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/model/PaymentMethod$USBankAccount;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/PaymentMethod$USBankAccount;

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->bankName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->bankName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->fingerprint:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->fingerprint:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->last4:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->last4:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->linkedAccount:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->linkedAccount:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->networks:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;

    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->networks:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->routingNumber:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->routingNumber:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public getType()Lcom/stripe/android/model/PaymentMethod$Type;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->bankName:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->fingerprint:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->last4:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->linkedAccount:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->networks:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->routingNumber:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    iget-object v2, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->bankName:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->fingerprint:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->last4:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->linkedAccount:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->networks:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;

    iget-object v7, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->routingNumber:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "USBankAccount(accountHolderType="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", accountType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bankName="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fingerprint="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", last4="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", linkedAccount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", networks="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", routingNumber="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountHolderType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->accountType:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->bankName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->fingerprint:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->last4:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->linkedAccount:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->networks:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object p2, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->routingNumber:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
