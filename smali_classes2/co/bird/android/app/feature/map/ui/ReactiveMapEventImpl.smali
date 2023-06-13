.class public final Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008\"\u0010#J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J\u000e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J,\u0010\n\u001a&\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00050\u0005 \t*\u0012\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00020\u0002H\u0016J,\u0010\u000c\u001a&\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u000b0\u000b \t*\u0012\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\u00020\u0002H\u0016J,\u0010\u000e\u001a&\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\r0\r \t*\u0012\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\r0\r\u0018\u00010\u00020\u0002H\u0016J,\u0010\u000f\u001a&\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\r0\r \t*\u0012\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\r0\r\u0018\u00010\u00020\u0002H\u0016J,\u0010\u0010\u001a&\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\r0\r \t*\u0012\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\r0\r\u0018\u00010\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0002H\u0016R)\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00150\u00150\u00148VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\"\u0010\u0004\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00030\u00030\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u001cR\"\u0010\u0006\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001cR\"\u0010\u0007\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001cR\"\u0010\u0008\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u001cR\"\u0010\n\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001cR\"\u0010\u000c\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u000b0\u000b0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001cR\"\u0010\u000e\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\r0\r0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u001cR\"\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\r0\r0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001cR\"\u0010\u0010\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\r0\r0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001cR\"\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00030\u00030\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001cR\"\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00120\u00120\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001cR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006$"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "Lio/reactivex/Observable;",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "mapClicks",
        "",
        "cameraMoveCancels",
        "cameraIdles",
        "cameraMoves",
        "kotlin.jvm.PlatformType",
        "cameraMoveStarts",
        "LfE1;",
        "groundOverlayClicks",
        "LfM2;",
        "markerClicks",
        "infoWindowCloses",
        "infoWindowClicks",
        "mapLongClicks",
        "LDX3;",
        "polygonClicks",
        "LZ84;",
        "",
        "cameraMoving$delegate",
        "Lkotlin/Lazy;",
        "getCameraMoving",
        "()LZ84;",
        "cameraMoving",
        "Lma4;",
        "Lma4;",
        "La94;",
        "mutableCameraMoving",
        "La94;",
        "LcD1;",
        "map",
        "<init>",
        "(LcD1;)V",
        "core-basemap_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final cameraIdles:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final cameraMoveCancels:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final cameraMoveStarts:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final cameraMoves:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final cameraMoving$delegate:Lkotlin/Lazy;

.field private final groundOverlayClicks:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "LfE1;",
            ">;"
        }
    .end annotation
.end field

.field private final infoWindowClicks:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "LfM2;",
            ">;"
        }
    .end annotation
.end field

.field private final infoWindowCloses:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "LfM2;",
            ">;"
        }
    .end annotation
.end field

.field private final mapClicks:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private final mapLongClicks:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private final markerClicks:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "LfM2;",
            ">;"
        }
    .end annotation
.end field

.field private final mutableCameraMoving:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final polygonClicks:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "LDX3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LcD1;)V
    .locals 5

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl$cameraMoving$2;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl$cameraMoving$2;-><init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraMoving$delegate:Lkotlin/Lazy;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<LatLng>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->mapClicks:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v2, "create<Unit>()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraMoveCancels:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraIdles:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraMoves:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraMoveStarts:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v2, "create<GroundOverlay>()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->groundOverlayClicks:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v2, "create<Marker>()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->markerClicks:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->infoWindowCloses:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->infoWindowClicks:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->mapLongClicks:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Polygon>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->polygonClicks:Lma4;

    sget-object v1, La94;->h:La94$a;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v1

    iput-object v1, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->mutableCameraMoving:La94;

    new-instance v1, LFr4;

    invoke-direct {v1, p0}, LFr4;-><init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    invoke-virtual {p1, v1}, LcD1;->z(LcD1$j;)V

    new-instance v1, LIr4;

    invoke-direct {v1, p0}, LIr4;-><init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    invoke-virtual {p1, v1}, LcD1;->u(LcD1$e;)V

    new-instance v1, LJr4;

    invoke-direct {v1, p0}, LJr4;-><init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    invoke-virtual {p1, v1}, LcD1;->v(LcD1$f;)V

    new-instance v1, LKr4;

    invoke-direct {v1, p0}, LKr4;-><init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    invoke-virtual {p1, v1}, LcD1;->s(LcD1$c;)V

    new-instance v1, LLr4;

    invoke-direct {v1, p0}, LLr4;-><init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    invoke-virtual {p1, v1}, LcD1;->t(LcD1$d;)V

    new-instance v1, LMr4;

    invoke-direct {v1, p0}, LMr4;-><init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    invoke-virtual {p1, v1}, LcD1;->w(LcD1$g;)V

    new-instance v1, LNr4;

    invoke-direct {v1, p0}, LNr4;-><init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    invoke-virtual {p1, v1}, LcD1;->B(LcD1$l;)V

    new-instance v1, LOr4;

    invoke-direct {v1, p0}, LOr4;-><init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    invoke-virtual {p1, v1}, LcD1;->y(LcD1$i;)V

    new-instance v1, LPr4;

    invoke-direct {v1, p0}, LPr4;-><init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    invoke-virtual {p1, v1}, LcD1;->x(LcD1$h;)V

    new-instance v1, LGr4;

    invoke-direct {v1, p0}, LGr4;-><init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    invoke-virtual {p1, v1}, LcD1;->A(LcD1$k;)V

    new-instance v1, LHr4;

    invoke-direct {v1, v0}, LHr4;-><init>(Lma4;)V

    invoke-virtual {p1, v1}, LcD1;->D(LcD1$n;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->mapClicks:Lma4;

    invoke-virtual {p0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda$1(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraMoves:Lma4;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, v0}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda$2(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;I)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraMoveStarts:Lma4;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->mutableCameraMoving:La94;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda$3(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraIdles:Lma4;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->mutableCameraMoving:La94;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda$4(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraMoveCancels:Lma4;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->mutableCameraMoving:La94;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda$5(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;LfE1;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->groundOverlayClicks:Lma4;

    invoke-virtual {p0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda$6(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;LfM2;)Z
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->markerClicks:Lma4;

    invoke-virtual {p0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final _init_$lambda$7(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;LfM2;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->infoWindowCloses:Lma4;

    invoke-virtual {p0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda$8(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;LfM2;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->infoWindowClicks:Lma4;

    invoke-virtual {p0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda$9(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->mapLongClicks:Lma4;

    invoke-virtual {p0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->_init_$lambda$9(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public static final synthetic access$getMutableCameraMoving$p(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->mutableCameraMoving:La94;

    return-object p0
.end method

.method public static synthetic b(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;LfE1;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->_init_$lambda$5(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;LfE1;)V

    return-void
.end method

.method public static synthetic c(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->_init_$lambda$0(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public static synthetic d(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;LfM2;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->_init_$lambda$8(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;LfM2;)V

    return-void
.end method

.method public static synthetic e(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->_init_$lambda$3(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    return-void
.end method

.method public static synthetic f(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->_init_$lambda$1(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    return-void
.end method

.method public static synthetic g(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;I)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->_init_$lambda$2(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;I)V

    return-void
.end method

.method public static synthetic h(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->_init_$lambda$4(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;)V

    return-void
.end method

.method public static synthetic i(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;LfM2;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->_init_$lambda$7(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;LfM2;)V

    return-void
.end method

.method public static synthetic j(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;LfM2;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->_init_$lambda$6(Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;LfM2;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public cameraIdles()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraIdles:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "cameraIdles.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public cameraMoveCancels()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraMoveCancels:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "cameraMoveCancels.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public cameraMoveStarts()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraMoveStarts:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public cameraMoves()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraMoves:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "cameraMoves.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getCameraMoving()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->cameraMoving$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public groundOverlayClicks()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LfE1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->groundOverlayClicks:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public infoWindowClicks()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LfM2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->infoWindowClicks:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public infoWindowCloses()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LfM2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->infoWindowCloses:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public mapClicks()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->mapClicks:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "mapClicks.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public mapLongClicks()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->mapLongClicks:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "mapLongClicks.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public markerClicks()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LfM2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->markerClicks:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public polygonClicks()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LDX3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;->polygonClicks:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "polygonClicks.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
