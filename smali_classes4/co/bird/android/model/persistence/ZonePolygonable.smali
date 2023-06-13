.class public final Lco/bird/android/model/persistence/ZonePolygonable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/Polygonable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J1\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u000cH\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u000b\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0013\u00a8\u0006&"
    }
    d2 = {
        "Lco/bird/android/model/persistence/ZonePolygonable;",
        "Lco/bird/android/model/Polygonable;",
        "zoneId",
        "",
        "region",
        "Lco/bird/android/model/Polygon;",
        "overlay",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;",
        "selectability",
        "Lco/bird/android/model/constant/OperatorMapZoneSelectability;",
        "(Ljava/lang/String;Lco/bird/android/model/Polygon;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)V",
        "borderColor",
        "",
        "getBorderColor",
        "()I",
        "color",
        "getColor",
        "id",
        "getId",
        "()Ljava/lang/String;",
        "getOverlay",
        "()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;",
        "getRegion",
        "()Lco/bird/android/model/Polygon;",
        "getSelectability",
        "()Lco/bird/android/model/constant/OperatorMapZoneSelectability;",
        "getZoneId",
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
        "toString",
        "model-persistence_release"
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
.field private final overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

.field private final region:Lco/bird/android/model/Polygon;

.field private final selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

.field private final zoneId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/Polygon;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)V
    .locals 1

    const-string v0, "zoneId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "region"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overlay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectability"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/ZonePolygonable;->zoneId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/persistence/ZonePolygonable;->region:Lco/bird/android/model/Polygon;

    iput-object p3, p0, Lco/bird/android/model/persistence/ZonePolygonable;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    iput-object p4, p0, Lco/bird/android/model/persistence/ZonePolygonable;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/ZonePolygonable;Ljava/lang/String;Lco/bird/android/model/Polygon;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/constant/OperatorMapZoneSelectability;ILjava/lang/Object;)Lco/bird/android/model/persistence/ZonePolygonable;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/persistence/ZonePolygonable;->zoneId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/persistence/ZonePolygonable;->region:Lco/bird/android/model/Polygon;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/persistence/ZonePolygonable;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/persistence/ZonePolygonable;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/persistence/ZonePolygonable;->copy(Ljava/lang/String;Lco/bird/android/model/Polygon;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)Lco/bird/android/model/persistence/ZonePolygonable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/Polygon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->region:Lco/bird/android/model/Polygon;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/constant/OperatorMapZoneSelectability;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/Polygon;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)Lco/bird/android/model/persistence/ZonePolygonable;
    .locals 1

    const-string v0, "zoneId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "region"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overlay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectability"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/ZonePolygonable;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/persistence/ZonePolygonable;-><init>(Ljava/lang/String;Lco/bird/android/model/Polygon;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/ZonePolygonable;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/ZonePolygonable;

    iget-object v1, p0, Lco/bird/android/model/persistence/ZonePolygonable;->zoneId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/ZonePolygonable;->zoneId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/ZonePolygonable;->region:Lco/bird/android/model/Polygon;

    iget-object v3, p1, Lco/bird/android/model/persistence/ZonePolygonable;->region:Lco/bird/android/model/Polygon;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/ZonePolygonable;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    iget-object v3, p1, Lco/bird/android/model/persistence/ZonePolygonable;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/ZonePolygonable;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    iget-object p1, p1, Lco/bird/android/model/persistence/ZonePolygonable;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getBorderColor()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;->getBorderColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    return v0
.end method

.method public getColor()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final getOverlay()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    return-object v0
.end method

.method public getRegion()Lco/bird/android/model/Polygon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->region:Lco/bird/android/model/Polygon;

    return-object v0
.end method

.method public final getSelectability()Lco/bird/android/model/constant/OperatorMapZoneSelectability;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    return-object v0
.end method

.method public final getZoneId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->zoneId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/ZonePolygonable;->region:Lco/bird/android/model/Polygon;

    invoke-virtual {v1}, Lco/bird/android/model/ComposedGeom;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/ZonePolygonable;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/ZonePolygonable;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/persistence/ZonePolygonable;->zoneId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/persistence/ZonePolygonable;->region:Lco/bird/android/model/Polygon;

    iget-object v2, p0, Lco/bird/android/model/persistence/ZonePolygonable;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    iget-object v3, p0, Lco/bird/android/model/persistence/ZonePolygonable;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ZonePolygonable(zoneId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", region="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", overlay="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectability="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
