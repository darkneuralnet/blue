.class public final Lco/bird/android/model/RideState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/RideState$Status;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001 B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/model/RideState;",
        "",
        "ride",
        "Lco/bird/android/model/wire/WireRide;",
        "status",
        "Lco/bird/android/model/RideState$Status;",
        "rideConfig",
        "Lco/bird/android/model/wire/configs/Config;",
        "updateState",
        "Lco/bird/android/model/RideUpdateState;",
        "(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/RideState$Status;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RideUpdateState;)V",
        "getRide",
        "()Lco/bird/android/model/wire/WireRide;",
        "getRideConfig",
        "()Lco/bird/android/model/wire/configs/Config;",
        "getStatus",
        "()Lco/bird/android/model/RideState$Status;",
        "getUpdateState",
        "()Lco/bird/android/model/RideUpdateState;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toLoggableString",
        "",
        "toString",
        "Status",
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
.field private final ride:Lco/bird/android/model/wire/WireRide;

.field private final rideConfig:Lco/bird/android/model/wire/configs/Config;

.field private final status:Lco/bird/android/model/RideState$Status;

.field private final updateState:Lco/bird/android/model/RideUpdateState;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/RideState$Status;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RideUpdateState;)V
    .locals 1

    const-string v0, "ride"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/RideState;->ride:Lco/bird/android/model/wire/WireRide;

    iput-object p2, p0, Lco/bird/android/model/RideState;->status:Lco/bird/android/model/RideState$Status;

    iput-object p3, p0, Lco/bird/android/model/RideState;->rideConfig:Lco/bird/android/model/wire/configs/Config;

    iput-object p4, p0, Lco/bird/android/model/RideState;->updateState:Lco/bird/android/model/RideUpdateState;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/RideState$Status;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RideUpdateState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    sget-object p4, Lco/bird/android/model/RideUpdateState;->NONE:Lco/bird/android/model/RideUpdateState;

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/RideState;-><init>(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/RideState$Status;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RideUpdateState;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/RideState;Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/RideState$Status;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RideUpdateState;ILjava/lang/Object;)Lco/bird/android/model/RideState;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/RideState;->ride:Lco/bird/android/model/wire/WireRide;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/RideState;->status:Lco/bird/android/model/RideState$Status;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/RideState;->rideConfig:Lco/bird/android/model/wire/configs/Config;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/RideState;->updateState:Lco/bird/android/model/RideUpdateState;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/RideState;->copy(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/RideState$Status;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RideUpdateState;)Lco/bird/android/model/RideState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireRide;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideState;->ride:Lco/bird/android/model/wire/WireRide;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/RideState$Status;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideState;->status:Lco/bird/android/model/RideState$Status;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/configs/Config;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideState;->rideConfig:Lco/bird/android/model/wire/configs/Config;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/RideUpdateState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideState;->updateState:Lco/bird/android/model/RideUpdateState;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/RideState$Status;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RideUpdateState;)Lco/bird/android/model/RideState;
    .locals 1

    const-string v0, "ride"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/RideState;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/RideState;-><init>(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/RideState$Status;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RideUpdateState;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/RideState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/RideState;

    iget-object v1, p0, Lco/bird/android/model/RideState;->ride:Lco/bird/android/model/wire/WireRide;

    iget-object v3, p1, Lco/bird/android/model/RideState;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/RideState;->status:Lco/bird/android/model/RideState$Status;

    iget-object v3, p1, Lco/bird/android/model/RideState;->status:Lco/bird/android/model/RideState$Status;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/RideState;->rideConfig:Lco/bird/android/model/wire/configs/Config;

    iget-object v3, p1, Lco/bird/android/model/RideState;->rideConfig:Lco/bird/android/model/wire/configs/Config;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/RideState;->updateState:Lco/bird/android/model/RideUpdateState;

    iget-object p1, p1, Lco/bird/android/model/RideState;->updateState:Lco/bird/android/model/RideUpdateState;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getRide()Lco/bird/android/model/wire/WireRide;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideState;->ride:Lco/bird/android/model/wire/WireRide;

    return-object v0
.end method

.method public final getRideConfig()Lco/bird/android/model/wire/configs/Config;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideState;->rideConfig:Lco/bird/android/model/wire/configs/Config;

    return-object v0
.end method

.method public final getStatus()Lco/bird/android/model/RideState$Status;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideState;->status:Lco/bird/android/model/RideState$Status;

    return-object v0
.end method

.method public final getUpdateState()Lco/bird/android/model/RideUpdateState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RideState;->updateState:Lco/bird/android/model/RideUpdateState;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/RideState;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RideState;->status:Lco/bird/android/model/RideState$Status;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RideState;->rideConfig:Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RideState;->updateState:Lco/bird/android/model/RideUpdateState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toLoggableString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/RideState;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/model/RideState;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    const-string v2, "NONE"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    move-object v1, v2

    :cond_1
    iget-object v3, p0, Lco/bird/android/model/RideState;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v2, v3

    :cond_3
    :goto_0
    iget-object v3, p0, Lco/bird/android/model/RideState;->status:Lco/bird/android/model/RideState$Status;

    iget-object v4, p0, Lco/bird/android/model/RideState;->updateState:Lco/bird/android/model/RideUpdateState;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "[rideId: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", birdId: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", birdCode: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", status: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", updateState: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/RideState;->ride:Lco/bird/android/model/wire/WireRide;

    iget-object v1, p0, Lco/bird/android/model/RideState;->status:Lco/bird/android/model/RideState$Status;

    iget-object v2, p0, Lco/bird/android/model/RideState;->rideConfig:Lco/bird/android/model/wire/configs/Config;

    iget-object v3, p0, Lco/bird/android/model/RideState;->updateState:Lco/bird/android/model/RideUpdateState;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "RideState(ride="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rideConfig="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", updateState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
