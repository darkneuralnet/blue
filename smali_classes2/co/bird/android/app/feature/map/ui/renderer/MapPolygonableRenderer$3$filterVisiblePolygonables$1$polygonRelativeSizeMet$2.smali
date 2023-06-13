.class final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$polygonRelativeSizeMet$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3;->invoke$filterVisiblePolygonables(Ljava/util/List;ZLandroid/location/Location;FLco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lcom/google/android/gms/maps/model/VisibleRegion;Lkotlin/Lazy;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $polygonableSize$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $visibleSize$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/Lazy;Lkotlin/Lazy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "Ljava/lang/Double;",
            ">;",
            "Lkotlin/Lazy<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$polygonRelativeSizeMet$2;->$polygonableSize$delegate:Lkotlin/Lazy;

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$polygonRelativeSizeMet$2;->$visibleSize$delegate:Lkotlin/Lazy;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$polygonRelativeSizeMet$2;->$polygonableSize$delegate:Lkotlin/Lazy;

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3;->access$invoke$filterVisiblePolygonables$lambda$8$lambda$3(Lkotlin/Lazy;)D

    move-result-wide v0

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$polygonRelativeSizeMet$2;->$visibleSize$delegate:Lkotlin/Lazy;

    invoke-static {v2}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3;->access$invoke$lambda$1(Lkotlin/Lazy;)D

    move-result-wide v2

    div-double/2addr v0, v2

    const-wide v2, 0x3f40624dd2f1a9fcL    # 5.0E-4

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$polygonRelativeSizeMet$2;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
