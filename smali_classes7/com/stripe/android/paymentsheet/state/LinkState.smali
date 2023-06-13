.class public final Lcom/stripe/android/paymentsheet/state/LinkState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\n2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/state/LinkState;",
        "Landroid/os/Parcelable;",
        "configuration",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "loginState",
        "Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;",
        "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;)V",
        "getConfiguration",
        "()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "isReadyForUse",
        "",
        "()Z",
        "getLoginState",
        "()Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;",
        "component1",
        "component2",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "LoginState",
        "paymentsheet_release"
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/paymentsheet/state/LinkState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

.field private final loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/state/LinkState$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/state/LinkState$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/state/LinkState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loginState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/state/LinkState;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/LinkState;->copy(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;)Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;)Lcom/stripe/android/paymentsheet/state/LinkState;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loginState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/state/LinkState;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/state/LinkState;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;)V

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
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/state/LinkState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/state/LinkState;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getConfiguration()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    return-object v0
.end method

.method public final getLoginState()Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isReadyForUse()Z
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;->LoggedIn:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;->NeedsVerification:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "LinkState(configuration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", loginState="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/state/LinkState;->loginState:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
