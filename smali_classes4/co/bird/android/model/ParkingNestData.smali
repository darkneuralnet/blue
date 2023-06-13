.class public final Lco/bird/android/model/ParkingNestData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/android/model/ParkingNestData;",
        "",
        "parkingNest",
        "Lco/bird/android/model/ParkingNest;",
        "distance",
        "",
        "(Lco/bird/android/model/ParkingNest;F)V",
        "getDistance",
        "()F",
        "getParkingNest",
        "()Lco/bird/android/model/ParkingNest;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
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
.field private final distance:F

.field private final parkingNest:Lco/bird/android/model/ParkingNest;


# direct methods
.method public constructor <init>(Lco/bird/android/model/ParkingNest;F)V
    .locals 1

    const-string v0, "parkingNest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/ParkingNestData;->parkingNest:Lco/bird/android/model/ParkingNest;

    iput p2, p0, Lco/bird/android/model/ParkingNestData;->distance:F

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/ParkingNestData;Lco/bird/android/model/ParkingNest;FILjava/lang/Object;)Lco/bird/android/model/ParkingNestData;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/android/model/ParkingNestData;->parkingNest:Lco/bird/android/model/ParkingNest;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lco/bird/android/model/ParkingNestData;->distance:F

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/ParkingNestData;->copy(Lco/bird/android/model/ParkingNest;F)Lco/bird/android/model/ParkingNestData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/ParkingNest;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNestData;->parkingNest:Lco/bird/android/model/ParkingNest;

    return-object v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lco/bird/android/model/ParkingNestData;->distance:F

    return v0
.end method

.method public final copy(Lco/bird/android/model/ParkingNest;F)Lco/bird/android/model/ParkingNestData;
    .locals 1

    const-string v0, "parkingNest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/ParkingNestData;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/ParkingNestData;-><init>(Lco/bird/android/model/ParkingNest;F)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/ParkingNestData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/ParkingNestData;

    iget-object v1, p0, Lco/bird/android/model/ParkingNestData;->parkingNest:Lco/bird/android/model/ParkingNest;

    iget-object v3, p1, Lco/bird/android/model/ParkingNestData;->parkingNest:Lco/bird/android/model/ParkingNest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/android/model/ParkingNestData;->distance:F

    iget p1, p1, Lco/bird/android/model/ParkingNestData;->distance:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDistance()F
    .locals 1

    iget v0, p0, Lco/bird/android/model/ParkingNestData;->distance:F

    return v0
.end method

.method public final getParkingNest()Lco/bird/android/model/ParkingNest;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ParkingNestData;->parkingNest:Lco/bird/android/model/ParkingNest;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/ParkingNestData;->parkingNest:Lco/bird/android/model/ParkingNest;

    invoke-virtual {v0}, Lco/bird/android/model/ParkingNest;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/ParkingNestData;->distance:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/ParkingNestData;->parkingNest:Lco/bird/android/model/ParkingNest;

    iget v1, p0, Lco/bird/android/model/ParkingNestData;->distance:F

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ParkingNestData(parkingNest="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", distance="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
