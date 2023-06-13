.class public final Lco/bird/android/model/RideRequirement$AutoPayV2;
.super Lco/bird/android/model/RideRequirement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/RideRequirement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AutoPayV2"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J3\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006 "
    }
    d2 = {
        "Lco/bird/android/model/RideRequirement$AutoPayV2;",
        "Lco/bird/android/model/RideRequirement;",
        "config",
        "Lco/bird/android/model/wire/configs/RideConfig;",
        "user",
        "Lco/bird/android/model/User;",
        "balance",
        "Lco/bird/android/model/Balance;",
        "defaultBirdPayment",
        "Lco/bird/android/model/BirdPayment;",
        "(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;Lco/bird/android/model/Balance;Lco/bird/android/model/BirdPayment;)V",
        "getBalance",
        "()Lco/bird/android/model/Balance;",
        "getConfig",
        "()Lco/bird/android/model/wire/configs/RideConfig;",
        "getDefaultBirdPayment",
        "()Lco/bird/android/model/BirdPayment;",
        "getUser",
        "()Lco/bird/android/model/User;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final balance:Lco/bird/android/model/Balance;

.field private final config:Lco/bird/android/model/wire/configs/RideConfig;

.field private final defaultBirdPayment:Lco/bird/android/model/BirdPayment;

.field private final user:Lco/bird/android/model/User;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;Lco/bird/android/model/Balance;Lco/bird/android/model/BirdPayment;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "balance"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/bird/android/model/RideRequirement;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->config:Lco/bird/android/model/wire/configs/RideConfig;

    iput-object p2, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->user:Lco/bird/android/model/User;

    iput-object p3, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->balance:Lco/bird/android/model/Balance;

    iput-object p4, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->defaultBirdPayment:Lco/bird/android/model/BirdPayment;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/RideRequirement$AutoPayV2;Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;Lco/bird/android/model/Balance;Lco/bird/android/model/BirdPayment;ILjava/lang/Object;)Lco/bird/android/model/RideRequirement$AutoPayV2;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->config:Lco/bird/android/model/wire/configs/RideConfig;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->user:Lco/bird/android/model/User;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->balance:Lco/bird/android/model/Balance;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->defaultBirdPayment:Lco/bird/android/model/BirdPayment;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/RideRequirement$AutoPayV2;->copy(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;Lco/bird/android/model/Balance;Lco/bird/android/model/BirdPayment;)Lco/bird/android/model/RideRequirement$AutoPayV2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/configs/RideConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->config:Lco/bird/android/model/wire/configs/RideConfig;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/User;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->user:Lco/bird/android/model/User;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/Balance;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->balance:Lco/bird/android/model/Balance;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/BirdPayment;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->defaultBirdPayment:Lco/bird/android/model/BirdPayment;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;Lco/bird/android/model/Balance;Lco/bird/android/model/BirdPayment;)Lco/bird/android/model/RideRequirement$AutoPayV2;
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "balance"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/RideRequirement$AutoPayV2;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/RideRequirement$AutoPayV2;-><init>(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;Lco/bird/android/model/Balance;Lco/bird/android/model/BirdPayment;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/RideRequirement$AutoPayV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/RideRequirement$AutoPayV2;

    iget-object v1, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->config:Lco/bird/android/model/wire/configs/RideConfig;

    iget-object v3, p1, Lco/bird/android/model/RideRequirement$AutoPayV2;->config:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->user:Lco/bird/android/model/User;

    iget-object v3, p1, Lco/bird/android/model/RideRequirement$AutoPayV2;->user:Lco/bird/android/model/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->balance:Lco/bird/android/model/Balance;

    iget-object v3, p1, Lco/bird/android/model/RideRequirement$AutoPayV2;->balance:Lco/bird/android/model/Balance;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->defaultBirdPayment:Lco/bird/android/model/BirdPayment;

    iget-object p1, p1, Lco/bird/android/model/RideRequirement$AutoPayV2;->defaultBirdPayment:Lco/bird/android/model/BirdPayment;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBalance()Lco/bird/android/model/Balance;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->balance:Lco/bird/android/model/Balance;

    return-object v0
.end method

.method public final getConfig()Lco/bird/android/model/wire/configs/RideConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->config:Lco/bird/android/model/wire/configs/RideConfig;

    return-object v0
.end method

.method public final getDefaultBirdPayment()Lco/bird/android/model/BirdPayment;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->defaultBirdPayment:Lco/bird/android/model/BirdPayment;

    return-object v0
.end method

.method public final getUser()Lco/bird/android/model/User;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->user:Lco/bird/android/model/User;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->config:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->user:Lco/bird/android/model/User;

    invoke-virtual {v1}, Lco/bird/android/model/User;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->balance:Lco/bird/android/model/Balance;

    invoke-virtual {v1}, Lco/bird/android/model/Balance;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->defaultBirdPayment:Lco/bird/android/model/BirdPayment;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/BirdPayment;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->config:Lco/bird/android/model/wire/configs/RideConfig;

    iget-object v1, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->user:Lco/bird/android/model/User;

    iget-object v2, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->balance:Lco/bird/android/model/Balance;

    iget-object v3, p0, Lco/bird/android/model/RideRequirement$AutoPayV2;->defaultBirdPayment:Lco/bird/android/model/BirdPayment;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AutoPayV2(config="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", user="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", balance="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", defaultBirdPayment="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
