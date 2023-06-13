.class public final Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;
.super Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer<",
        "Lco/bird/android/model/persistence/WarehouseMarker;",
        "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0008\u0007\u0012\u000e\u0008\u0001\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00030$\u0012\u0008\u0008\u0001\u0010\'\u001a\u00020&\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008(\u0010)J\u000c\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u0018R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0018\u0010\u001e\u001a\u00020\u001d*\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006*"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;",
        "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;",
        "Lco/bird/android/model/persistence/WarehouseMarker;",
        "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;",
        "LPT;",
        "bitmapDescriptor",
        "item",
        "Lcom/google/android/gms/maps/model/MarkerOptions;",
        "markerOptions",
        "",
        "onBeforeClusterItemRendered",
        "LfM2;",
        "marker",
        "updateItem",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "Landroid/os/Handler;",
        "mainThreadHandler",
        "Landroid/os/Handler;",
        "Lps6;",
        "binding$delegate",
        "Lkotlin/Lazy;",
        "getBinding",
        "()Lps6;",
        "binding",
        "selectedBinding$delegate",
        "getSelectedBinding",
        "selectedBinding",
        "Landroid/graphics/PointF;",
        "anchorPoint",
        "Landroid/graphics/PointF;",
        "cachedDescriptor",
        "LPT;",
        "getAnchorPoint",
        "(Lps6;)Landroid/graphics/PointF;",
        "LGl0;",
        "clusterManager",
        "LcD1;",
        "map",
        "<init>",
        "(LGl0;LcD1;Landroid/content/Context;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWarehouseMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"
    }
.end annotation


# instance fields
.field private anchorPoint:Landroid/graphics/PointF;

.field private final binding$delegate:Lkotlin/Lazy;

.field private cachedDescriptor:LPT;

.field private final context:Landroid/content/Context;

.field private final mainThreadHandler:Landroid/os/Handler;

.field private final selectedBinding$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(LGl0;LcD1;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;",
            ">;",
            "LcD1;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    const-string v0, "clusterManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p2, p1}, Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;-><init>(Landroid/content/Context;LcD1;LGl0;)V

    iput-object p3, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->context:Landroid/content/Context;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->mainThreadHandler:Landroid/os/Handler;

    new-instance p1, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer$binding$2;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer$binding$2;-><init>(Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->binding$delegate:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer$selectedBinding$2;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer$selectedBinding$2;-><init>(Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->selectedBinding$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getContext$p(Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->context:Landroid/content/Context;

    return-object p0
.end method

.method private final bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;)LPT;
    .locals 7

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;->getSelected()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->getSelectedBinding()Lps6;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->getBinding()Lps6;

    move-result-object p1

    :goto_0
    const-string v0, "if (selected) selectedBinding else binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lps6;->b:Landroid/widget/ImageView;

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->context:Landroid/content/Context;

    sget v2, Lrg4;->ic_warehouse:I

    invoke-static {v1, v2}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->anchorPoint:Landroid/graphics/PointF;

    if-nez v0, :cond_2

    iget-object v0, p1, Lps6;->c:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->getAnchorPoint(Lps6;)Landroid/graphics/PointF;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->mainThreadHandler:Landroid/os/Handler;

    new-instance v1, LUy6;

    invoke-direct {v1, p0, p1}, LUy6;-><init>(Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;Lps6;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    :goto_1
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->context:Landroid/content/Context;

    invoke-virtual {p1}, Lps6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    const-string p1, "binding.root"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LfB0;->iconBitmapDescriptor$default(Landroid/content/Context;Landroid/view/View;Landroid/graphics/drawable/Drawable;LAP1;ILjava/lang/Object;)LPT;

    move-result-object p1

    return-object p1
.end method

.method private static final bitmapDescriptor$lambda$1(Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;Lps6;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->getAnchorPoint(Lps6;)Landroid/graphics/PointF;

    return-void
.end method

.method private final getAnchorPoint(Lps6;)Landroid/graphics/PointF;
    .locals 2

    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p1, Lps6;->c:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Lps6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v1, p1

    const/high16 p1, 0x3f000000    # 0.5f

    invoke-direct {v0, p1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->anchorPoint:Landroid/graphics/PointF;

    return-object v0
.end method

.method private final getBinding()Lps6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->binding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lps6;

    return-object v0
.end method

.method private final getSelectedBinding()Lps6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->selectedBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lps6;

    return-object v0
.end method

.method public static synthetic t(Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;Lps6;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->bitmapDescriptor$lambda$1(Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;Lps6;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onBeforeClusterItemRendered(LEl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->onBeforeClusterItemRendered(Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    return-void
.end method

.method public onBeforeClusterItemRendered(Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 3

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->cachedDescriptor:LPT;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;)LPT;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->cachedDescriptor:LPT;

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->anchorPoint:Landroid/graphics/PointF;

    if-nez p1, :cond_1

    new-instance p1, Landroid/graphics/PointF;

    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {p1, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    :cond_1
    invoke-virtual {p2, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p2

    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    return-void
.end method

.method public bridge synthetic updateItem(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;LfM2;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->updateItem(Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public updateItem(Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;LfM2;)V
    .locals 4

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;)LPT;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;->anchorPoint:Landroid/graphics/PointF;

    if-nez v1, :cond_0

    new-instance v1, Landroid/graphics/PointF;

    const/high16 v2, 0x3f000000    # 0.5f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    :cond_0
    invoke-virtual {p2, v0}, LfM2;->k(LPT;)V

    iget v0, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p2, v0, v1}, LfM2;->h(FF)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;->getZIndex()F

    move-result p1

    invoke-virtual {p2, p1}, LfM2;->s(F)V

    return-void
.end method
