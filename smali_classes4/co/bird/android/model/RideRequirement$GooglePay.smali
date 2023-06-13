.class public final Lco/bird/android/model/RideRequirement$GooglePay;
.super Lco/bird/android/model/RideRequirement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/RideRequirement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GooglePay"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/android/model/RideRequirement$GooglePay;",
        "Lco/bird/android/model/RideRequirement;",
        "config",
        "Lco/bird/android/model/wire/configs/RideConfig;",
        "user",
        "Lco/bird/android/model/User;",
        "(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;)V",
        "getConfig",
        "()Lco/bird/android/model/wire/configs/RideConfig;",
        "getUser",
        "()Lco/bird/android/model/User;",
        "component1",
        "component2",
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
.field private final config:Lco/bird/android/model/wire/configs/RideConfig;

.field private final user:Lco/bird/android/model/User;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/bird/android/model/RideRequirement;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lco/bird/android/model/RideRequirement$GooglePay;->config:Lco/bird/android/model/wire/configs/RideConfig;

    iput-object p2, p0, Lco/bird/android/model/RideRequirement$GooglePay;->user:Lco/bird/android/model/User;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/RideRequirement$GooglePay;Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;ILjava/lang/Object;)Lco/bird/android/model/RideRequirement$GooglePay;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/android/model/RideRequirement$GooglePay;->config:Lco/bird/android/model/wire/configs/RideConfig;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/android/model/RideRequirement$GooglePay;->user:Lco/bird/android/model/User;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/RideRequirement$GooglePay;->copy(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;)Lco/bird/android/model/RideRequirement$GooglePay;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/configs/RideConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$GooglePay;->config:Lco/bird/android/model/wire/configs/RideConfig;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/User;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$GooglePay;->user:Lco/bird/android/model/User;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;)Lco/bird/android/model/RideRequirement$GooglePay;
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/RideRequirement$GooglePay;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/RideRequirement$GooglePay;-><init>(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/RideRequirement$GooglePay;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/RideRequirement$GooglePay;

    iget-object v1, p0, Lco/bird/android/model/RideRequirement$GooglePay;->config:Lco/bird/android/model/wire/configs/RideConfig;

    iget-object v3, p1, Lco/bird/android/model/RideRequirement$GooglePay;->config:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/RideRequirement$GooglePay;->user:Lco/bird/android/model/User;

    iget-object p1, p1, Lco/bird/android/model/RideRequirement$GooglePay;->user:Lco/bird/android/model/User;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getConfig()Lco/bird/android/model/wire/configs/RideConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$GooglePay;->config:Lco/bird/android/model/wire/configs/RideConfig;

    return-object v0
.end method

.method public final getUser()Lco/bird/android/model/User;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$GooglePay;->user:Lco/bird/android/model/User;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$GooglePay;->config:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RideRequirement$GooglePay;->user:Lco/bird/android/model/User;

    invoke-virtual {v1}, Lco/bird/android/model/User;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/RideRequirement$GooglePay;->config:Lco/bird/android/model/wire/configs/RideConfig;

    iget-object v1, p0, Lco/bird/android/model/RideRequirement$GooglePay;->user:Lco/bird/android/model/User;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GooglePay(config="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", user="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
