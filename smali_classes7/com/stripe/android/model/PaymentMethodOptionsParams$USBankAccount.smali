.class public final Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;
.super Lcom/stripe/android/model/PaymentMethodOptionsParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentMethodOptionsParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "USBankAccount"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0008\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J!\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000c0\u000bH\u0010\u00a2\u0006\u0002\u0008\u000fJ\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\rH\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0004\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;",
        "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
        "setupFutureUsage",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;",
        "(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V",
        "getSetupFutureUsage",
        "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;",
        "setSetupFutureUsage",
        "component1",
        "copy",
        "createTypeParams",
        "",
        "Lkotlin/Pair;",
        "",
        "",
        "createTypeParams$payments_core_release",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "hashCode",
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
            "Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount$Companion;

.field public static final PARAM_SETUP_FUTURE_USAGE:Ljava/lang/String; = "setup_future_usage"


# instance fields
.field private setupFutureUsage:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->Companion:Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->$stable:I

    new-instance v0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;-><init>(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V
    .locals 2

    sget-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/model/PaymentMethodOptionsParams;-><init>(Lcom/stripe/android/model/PaymentMethod$Type;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->setupFutureUsage:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;-><init>(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->setupFutureUsage:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->copy(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->setupFutureUsage:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;
    .locals 1

    new-instance v0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;-><init>(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V

    return-object v0
.end method

.method public createTypeParams$payments_core_release()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->setupFutureUsage:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;->getCode$payments_core_release()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "setup_future_usage"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->setupFutureUsage:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->setupFutureUsage:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getSetupFutureUsage()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->setupFutureUsage:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->setupFutureUsage:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final setSetupFutureUsage(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->setupFutureUsage:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->setupFutureUsage:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "USBankAccount(setupFutureUsage="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->setupFutureUsage:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
