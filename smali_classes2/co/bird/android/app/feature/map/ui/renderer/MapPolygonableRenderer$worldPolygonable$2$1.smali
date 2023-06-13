.class public final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/Polygonable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2;->invoke()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0005R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "co/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1",
        "Lco/bird/android/model/Polygonable;",
        "borderColor",
        "",
        "getBorderColor",
        "()I",
        "color",
        "getColor",
        "id",
        "",
        "getId",
        "()Ljava/lang/String;",
        "region",
        "Lco/bird/android/model/Polygon;",
        "getRegion",
        "()Lco/bird/android/model/Polygon;",
        "co.bird.android.feature.map"
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
.field private final borderColor:I

.field private final color:I

.field private final id:Ljava/lang/String;

.field private final region:Lco/bird/android/model/Polygon;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getWORLD_POLYGONABLE_ID$cp()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;->id:Ljava/lang/String;

    invoke-static {p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getMapConfig$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v0

    const/16 v1, 0x10

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getZoneColorOverride()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;->getOperationalInverse()Lco/bird/android/model/wire/configs/ZoneColorConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ZoneColorConfig;->getFillColor()Lco/bird/android/model/wire/configs/MobileColorConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/MobileColorConfig;->getLightMode()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "23FF0010"

    invoke-static {v0, v1}, Lkotlin/text/UStringsKt;->toUInt(Ljava/lang/String;I)I

    move-result v0

    :goto_0
    iput v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;->color:I

    invoke-static {p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getMapConfig$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getZoneColorOverride()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;->getOperationalInverse()Lco/bird/android/model/wire/configs/ZoneColorConfig;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ZoneColorConfig;->getBorderColor()Lco/bird/android/model/wire/configs/MobileColorConfig;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MobileColorConfig;->getLightMode()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_1
    const-string p1, "FFFFFFFF"

    invoke-static {p1, v1}, Lkotlin/text/UStringsKt;->toUInt(Ljava/lang/String;I)I

    move-result p1

    :goto_1
    iput p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;->borderColor:I

    new-instance p1, Lco/bird/android/model/Polygon;

    const/4 v0, 0x1

    new-array v0, v0, [Lco/bird/android/model/LinearRing;

    const/4 v1, 0x0

    invoke-static {}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getWORLD_RING$cp()Lco/bird/android/model/LinearRing;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-direct {p1, v0}, Lco/bird/android/model/Polygon;-><init>([Lco/bird/android/model/LinearRing;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;->region:Lco/bird/android/model/Polygon;

    return-void
.end method


# virtual methods
.method public getBorderColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;->borderColor:I

    return v0
.end method

.method public getColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;->color:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getRegion()Lco/bird/android/model/Polygon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;->region:Lco/bird/android/model/Polygon;

    return-object v0
.end method
