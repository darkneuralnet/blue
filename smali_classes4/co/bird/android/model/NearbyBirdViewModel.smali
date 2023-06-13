.class public final Lco/bird/android/model/NearbyBirdViewModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lco/bird/android/model/NearbyBirdViewModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J=\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\t2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/model/NearbyBirdViewModel;",
        "",
        "vehicle",
        "Lco/bird/android/model/Vehicle;",
        "serviceCenterStatus",
        "Lco/bird/android/model/wire/WireServiceCenterStatus;",
        "codeLabelText",
        "",
        "isIBeacon",
        "",
        "shouldShowIBeaconLabel",
        "(Lco/bird/android/model/Vehicle;Lco/bird/android/model/wire/WireServiceCenterStatus;IZZ)V",
        "getCodeLabelText",
        "()I",
        "()Z",
        "getServiceCenterStatus",
        "()Lco/bird/android/model/wire/WireServiceCenterStatus;",
        "getShouldShowIBeaconLabel",
        "getVehicle",
        "()Lco/bird/android/model/Vehicle;",
        "compareTo",
        "other",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "hashCode",
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
.field private final codeLabelText:I

.field private final isIBeacon:Z

.field private final serviceCenterStatus:Lco/bird/android/model/wire/WireServiceCenterStatus;

.field private final shouldShowIBeaconLabel:Z

.field private final vehicle:Lco/bird/android/model/Vehicle;


# direct methods
.method public constructor <init>(Lco/bird/android/model/Vehicle;Lco/bird/android/model/wire/WireServiceCenterStatus;IZZ)V
    .locals 1

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/NearbyBirdViewModel;->vehicle:Lco/bird/android/model/Vehicle;

    iput-object p2, p0, Lco/bird/android/model/NearbyBirdViewModel;->serviceCenterStatus:Lco/bird/android/model/wire/WireServiceCenterStatus;

    iput p3, p0, Lco/bird/android/model/NearbyBirdViewModel;->codeLabelText:I

    iput-boolean p4, p0, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon:Z

    iput-boolean p5, p0, Lco/bird/android/model/NearbyBirdViewModel;->shouldShowIBeaconLabel:Z

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/Vehicle;Lco/bird/android/model/wire/WireServiceCenterStatus;IZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move v5, v0

    goto :goto_0

    :cond_0
    move v5, p4

    :goto_0
    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    move v6, v0

    goto :goto_1

    :cond_1
    move v6, p5

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/NearbyBirdViewModel;-><init>(Lco/bird/android/model/Vehicle;Lco/bird/android/model/wire/WireServiceCenterStatus;IZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/NearbyBirdViewModel;Lco/bird/android/model/Vehicle;Lco/bird/android/model/wire/WireServiceCenterStatus;IZZILjava/lang/Object;)Lco/bird/android/model/NearbyBirdViewModel;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/NearbyBirdViewModel;->vehicle:Lco/bird/android/model/Vehicle;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/android/model/NearbyBirdViewModel;->serviceCenterStatus:Lco/bird/android/model/wire/WireServiceCenterStatus;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lco/bird/android/model/NearbyBirdViewModel;->codeLabelText:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lco/bird/android/model/NearbyBirdViewModel;->shouldShowIBeaconLabel:Z

    :cond_4
    move v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move p5, v0

    move p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/NearbyBirdViewModel;->copy(Lco/bird/android/model/Vehicle;Lco/bird/android/model/wire/WireServiceCenterStatus;IZZ)Lco/bird/android/model/NearbyBirdViewModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public compareTo(Lco/bird/android/model/NearbyBirdViewModel;)I
    .locals 2

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lco/bird/android/model/NearbyBirdViewModel;->vehicle:Lco/bird/android/model/Vehicle;

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getRssi()Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    iget-object v1, p0, Lco/bird/android/model/NearbyBirdViewModel;->vehicle:Lco/bird/android/model/Vehicle;

    invoke-virtual {v1}, Lco/bird/android/model/Vehicle;->getRssi()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_1
    sub-int/2addr p1, v0

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lco/bird/android/model/NearbyBirdViewModel;

    invoke-virtual {p0, p1}, Lco/bird/android/model/NearbyBirdViewModel;->compareTo(Lco/bird/android/model/NearbyBirdViewModel;)I

    move-result p1

    return p1
.end method

.method public final component1()Lco/bird/android/model/Vehicle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/NearbyBirdViewModel;->vehicle:Lco/bird/android/model/Vehicle;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireServiceCenterStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/NearbyBirdViewModel;->serviceCenterStatus:Lco/bird/android/model/wire/WireServiceCenterStatus;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/NearbyBirdViewModel;->codeLabelText:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/NearbyBirdViewModel;->shouldShowIBeaconLabel:Z

    return v0
.end method

.method public final copy(Lco/bird/android/model/Vehicle;Lco/bird/android/model/wire/WireServiceCenterStatus;IZZ)Lco/bird/android/model/NearbyBirdViewModel;
    .locals 7

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/NearbyBirdViewModel;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/NearbyBirdViewModel;-><init>(Lco/bird/android/model/Vehicle;Lco/bird/android/model/wire/WireServiceCenterStatus;IZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/NearbyBirdViewModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/NearbyBirdViewModel;

    iget-object v1, p0, Lco/bird/android/model/NearbyBirdViewModel;->vehicle:Lco/bird/android/model/Vehicle;

    iget-object v3, p1, Lco/bird/android/model/NearbyBirdViewModel;->vehicle:Lco/bird/android/model/Vehicle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/NearbyBirdViewModel;->serviceCenterStatus:Lco/bird/android/model/wire/WireServiceCenterStatus;

    iget-object v3, p1, Lco/bird/android/model/NearbyBirdViewModel;->serviceCenterStatus:Lco/bird/android/model/wire/WireServiceCenterStatus;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/model/NearbyBirdViewModel;->codeLabelText:I

    iget v3, p1, Lco/bird/android/model/NearbyBirdViewModel;->codeLabelText:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon:Z

    iget-boolean v3, p1, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/bird/android/model/NearbyBirdViewModel;->shouldShowIBeaconLabel:Z

    iget-boolean p1, p1, Lco/bird/android/model/NearbyBirdViewModel;->shouldShowIBeaconLabel:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCodeLabelText()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/NearbyBirdViewModel;->codeLabelText:I

    return v0
.end method

.method public final getServiceCenterStatus()Lco/bird/android/model/wire/WireServiceCenterStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/NearbyBirdViewModel;->serviceCenterStatus:Lco/bird/android/model/wire/WireServiceCenterStatus;

    return-object v0
.end method

.method public final getShouldShowIBeaconLabel()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/NearbyBirdViewModel;->shouldShowIBeaconLabel:Z

    return v0
.end method

.method public final getVehicle()Lco/bird/android/model/Vehicle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/NearbyBirdViewModel;->vehicle:Lco/bird/android/model/Vehicle;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/NearbyBirdViewModel;->vehicle:Lco/bird/android/model/Vehicle;

    invoke-virtual {v0}, Lco/bird/android/model/Vehicle;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/NearbyBirdViewModel;->serviceCenterStatus:Lco/bird/android/model/wire/WireServiceCenterStatus;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireServiceCenterStatus;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/NearbyBirdViewModel;->codeLabelText:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/NearbyBirdViewModel;->shouldShowIBeaconLabel:Z

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final isIBeacon()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/NearbyBirdViewModel;->vehicle:Lco/bird/android/model/Vehicle;

    iget-object v1, p0, Lco/bird/android/model/NearbyBirdViewModel;->serviceCenterStatus:Lco/bird/android/model/wire/WireServiceCenterStatus;

    iget v2, p0, Lco/bird/android/model/NearbyBirdViewModel;->codeLabelText:I

    iget-boolean v3, p0, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon:Z

    iget-boolean v4, p0, Lco/bird/android/model/NearbyBirdViewModel;->shouldShowIBeaconLabel:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "NearbyBirdViewModel(vehicle="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", serviceCenterStatus="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", codeLabelText="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isIBeacon="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", shouldShowIBeaconLabel="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
