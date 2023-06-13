.class public final Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider<",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0018\u0000 22\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u00012B\u0011\u0008\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u00080\u00101J\u001a\u0010\u0007\u001a\u00020\u0006*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J,\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000cH\u0002J\u0014\u0010\u0011\u001a\u00020\r*\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\u0011\u001a\u00020\r2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\u0012\u001a\u00020\u00062\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R \u0010+\u001a\u0004\u0018\u00010\u0017*\u0008\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*R\u001e\u0010-\u001a\u00020\u0017*\u0008\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010*R\u001e\u0010/\u001a\u00020\u0017*\u0008\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010*\u00a8\u00064\u00b2\u0006\u000c\u00103\u001a\u00020\u00068\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;",
        "Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "",
        "withIcon",
        "LPT;",
        "createBitmapDescriptor",
        "Lgs6;",
        "binding",
        "Lco/bird/android/model/persistence/FleetMarker;",
        "marker",
        "Lkotlin/Function1;",
        "Landroid/graphics/PointF;",
        "",
        "setAnchorPointAsync",
        "calculateAnchorPoint",
        "anchorPoint",
        "bitmapDescriptor",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "Landroid/util/LruCache;",
        "",
        "noIconBitmapCache",
        "Landroid/util/LruCache;",
        "bitmapCache",
        "anchorCache",
        "Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;",
        "fleetMarkerHelper",
        "Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;",
        "selectedBinding",
        "Lgs6;",
        "Lfs6;",
        "Lfs6;",
        "Los6;",
        "taskBinding",
        "Los6;",
        "Landroid/os/Handler;",
        "uiHandler",
        "Landroid/os/Handler;",
        "getBitmapKey",
        "(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/String;",
        "bitmapKey",
        "getNoIconBitmapKey",
        "noIconBitmapKey",
        "getAnchorKey",
        "anchorKey",
        "<init>",
        "(Landroid/content/Context;)V",
        "Companion",
        "descriptor",
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
        "SMAP\nBirdMarkerClusterItemOptionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdMarkerClusterItemOptionProvider.kt\nco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"
    }
.end annotation


# static fields
.field private static final ANCHOR_CACHE_SIZE:I = 0x5

.field private static final BITMAP_CACHE_SIZE:I = 0x1e

.field public static final Companion:Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$Companion;

.field private static final DEFAULT_ANCHOR:Landroid/graphics/PointF;

.field private static final DEFAULT_ANCHOR_CENTERED:Landroid/graphics/PointF;

.field private static final NO_ICON_CACHE_SIZE:I = 0xa

.field private static final STANDARD_PIN_STYLE_PROMINENCES:Lkotlin/ranges/IntRange;


# instance fields
.field private final anchorCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private binding:Lfs6;

.field private final bitmapCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "LPT;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

.field private final noIconBitmapCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "LPT;",
            ">;"
        }
    .end annotation
.end field

.field private selectedBinding:Lgs6;

.field private taskBinding:Los6;

.field private final uiHandler:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->Companion:Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$Companion;

    new-instance v0, Landroid/graphics/PointF;

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-direct {v0, v2, v1}, Landroid/graphics/PointF;-><init>(FF)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->DEFAULT_ANCHOR:Landroid/graphics/PointF;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, v2, v2}, Landroid/graphics/PointF;-><init>(FF)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->DEFAULT_ANCHOR_CENTERED:Landroid/graphics/PointF;

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->STANDARD_PIN_STYLE_PROMINENCES:Lkotlin/ranges/IntRange;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->context:Landroid/content/Context;

    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->noIconBitmapCache:Landroid/util/LruCache;

    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->bitmapCache:Landroid/util/LruCache;

    new-instance v0, Landroid/util/LruCache;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->anchorCache:Landroid/util/LruCache;

    new-instance v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->uiHandler:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lgs6;Lco/bird/android/model/persistence/FleetMarker;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->calculateAnchorPoint$lambda$9(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lgs6;Lco/bird/android/model/persistence/FleetMarker;)V

    return-void
.end method

.method public static final synthetic access$bitmapDescriptor$lambda$1(Lkotlin/Lazy;)LPT;
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->bitmapDescriptor$lambda$1(Lkotlin/Lazy;)LPT;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createBitmapDescriptor(Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)LPT;
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->createBitmapDescriptor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)LPT;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAnchorCache$p(Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;)Landroid/util/LruCache;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->anchorCache:Landroid/util/LruCache;

    return-object p0
.end method

.method public static final synthetic access$getAnchorKey(Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->getAnchorKey(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final anchorPoint(Lgs6;Lco/bird/android/model/persistence/FleetMarker;)Landroid/graphics/PointF;
    .locals 1

    iget-object p2, p1, Lgs6;->f:Lco/bird/android/widget/FleetMarkerPillPin;

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result p2

    int-to-float p2, p2

    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {p1}, Lgs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    invoke-direct {v0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method private static final bitmapDescriptor$lambda$1(Lkotlin/Lazy;)LPT;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "LPT;",
            ">;)",
            "LPT;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LPT;

    return-object p0
.end method

.method private final calculateAnchorPoint(Lgs6;Lco/bird/android/model/persistence/FleetMarker;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgs6;",
            "Lco/bird/android/model/persistence/FleetMarker;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/PointF;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p1, Lgs6;->f:Lco/bird/android/widget/FleetMarkerPillPin;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->anchorPoint(Lgs6;Lco/bird/android/model/persistence/FleetMarker;)Landroid/graphics/PointF;

    move-result-object p1

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->uiHandler:Landroid/os/Handler;

    new-instance v1, LLM;

    invoke-direct {v1, p3, p0, p1, p2}, LLM;-><init>(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lgs6;Lco/bird/android/model/persistence/FleetMarker;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method private static final calculateAnchorPoint$lambda$9(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lgs6;Lco/bird/android/model/persistence/FleetMarker;)V
    .locals 1

    const-string v0, "$setAnchorPointAsync"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$marker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2, p3}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->anchorPoint(Lgs6;Lco/bird/android/model/persistence/FleetMarker;)Landroid/graphics/PointF;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final createBitmapDescriptor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)LPT;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;Z)",
            "LPT;"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->selectedBinding:Lgs6;

    if-nez p2, :cond_0

    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->context:Landroid/content/Context;

    invoke-static {p2}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2}, Lgs6;->c(Landroid/view/LayoutInflater;)Lgs6;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->selectedBinding:Lgs6;

    const-string v0, "inflate(context.layoutIn\u2026lectedBinding = binding }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p2, Lgs6;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdMapMarker;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p2, Lgs6;->b:Lco/bird/android/widget/BatteryViewV2;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdMapMarker;->getBatteryLevel()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lco/bird/android/widget/BatteryViewV2;->setBatteryLevel(F)V

    iget-object v0, p2, Lgs6;->d:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/FleetMarker;->getFleetIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->context:Landroid/content/Context;

    invoke-static {v1, v2}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p2, Lgs6;->d:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/FleetMarker;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p2, Lgs6;->d:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/FleetMarker;->getStandardPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p2, Lgs6;->f:Lco/bird/android/widget/FleetMarkerPillPin;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/FleetMarker;->getStandardPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v1

    invoke-virtual {v0, v1}, Lco/bird/android/widget/FleetMarkerPillPin;->setOutlineColor(I)V

    iget-object v0, p2, Lgs6;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->context:Landroid/content/Context;

    sget v2, Lnl4;->battery_percent:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/BirdMapMarker;->getBatteryLevel()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$1;

    invoke-direct {v1, p0, p1}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$1;-><init>(Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)V

    invoke-direct {p0, p2, v0, v1}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->calculateAnchorPoint(Lgs6;Lco/bird/android/model/persistence/FleetMarker;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2}, Lgs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    :goto_0
    move-object v1, p1

    goto/16 :goto_1

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/FleetMarker;->getLabel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->taskBinding:Los6;

    if-nez p2, :cond_2

    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->context:Landroid/content/Context;

    invoke-static {p2}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2}, Los6;->c(Landroid/view/LayoutInflater;)Los6;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->taskBinding:Los6;

    const-string v0, "inflate(context.layoutIn\u2026> taskBinding = binding }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->hydrateBinding(Los6;Lco/bird/android/model/persistence/FleetMarker;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$2;

    invoke-direct {v2, p0, p1}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$2;-><init>(Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)V

    invoke-virtual {v0, p2, v1, v2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->calculateAnchorPoint(Los6;Lco/bird/android/model/persistence/FleetMarker;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2}, Los6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->binding:Lfs6;

    if-nez v0, :cond_4

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->context:Landroid/content/Context;

    invoke-static {v0}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lfs6;->c(Landroid/view/LayoutInflater;)Lfs6;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->binding:Lfs6;

    const-string v1, "inflate(context.layoutIn\u2026vider.binding = binding }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->hydrateBinding(Lfs6;Lco/bird/android/model/persistence/FleetMarker;Z)V

    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$3;

    invoke-direct {v2, p0, p1}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$3;-><init>(Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)V

    invoke-virtual {p2, v0, v1, v2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->calculateAnchorPoint(Lfs6;Lco/bird/android/model/persistence/FleetMarker;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lfs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    goto/16 :goto_0

    :goto_1
    const-string p1, "private fun BirdMarkerCl\u2026w, background = null)\n  }"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->context:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LfB0;->iconBitmapDescriptor$default(Landroid/content/Context;Landroid/view/View;Landroid/graphics/drawable/Drawable;LAP1;ILjava/lang/Object;)LPT;

    move-result-object p1

    return-object p1
.end method

.method private final getAnchorKey(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/FleetMarker;->getProminence()I

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->isSelected()Z

    move-result v1

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getLabel()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getBitmapKey(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/FleetMarker;->getProminence()I

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/FleetMarker;->getFleetIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/FleetMarker;->getStandardPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v2

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getLabel()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final getNoIconBitmapKey(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/FleetMarker;->getStandardPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getLabel()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public anchorPoint(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Landroid/graphics/PointF;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;)",
            "Landroid/graphics/PointF;"
        }
    .end annotation

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->anchorCache:Landroid/util/LruCache;

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->getAnchorKey(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    if-nez v0, :cond_2

    sget-object v0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->STANDARD_PIN_STYLE_PROMINENCES:Lkotlin/ranges/IntRange;

    invoke-virtual {v0}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v1

    invoke-virtual {v0}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getProminence()I

    move-result p1

    const/4 v2, 0x0

    if-gt v1, p1, :cond_0

    if-gt p1, v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    if-eqz v2, :cond_1

    sget-object p1, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->DEFAULT_ANCHOR:Landroid/graphics/PointF;

    goto :goto_0

    :cond_1
    sget-object p1, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->DEFAULT_ANCHOR_CENTERED:Landroid/graphics/PointF;

    :goto_0
    move-object v0, p1

    :cond_2
    return-object v0
.end method

.method public bridge synthetic anchorPoint(Ljava/lang/Object;)Landroid/graphics/PointF;
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->anchorPoint(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method

.method public bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)LPT;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;Z)",
            "LPT;"
        }
    .end annotation

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$bitmapDescriptor$descriptor$2;

    invoke-direct {v0, p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$bitmapDescriptor$descriptor$2;-><init>(Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    if-eqz p2, :cond_1

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->getBitmapKey(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->bitmapCache:Landroid/util/LruCache;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$bitmapDescriptor$1$1;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$bitmapDescriptor$1$1;-><init>(Lkotlin/Lazy;)V

    invoke-static {p2, p1, v1}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LPT;

    if-nez p1, :cond_2

    :cond_0
    invoke-static {v0}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->bitmapDescriptor$lambda$1(Lkotlin/Lazy;)LPT;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->noIconBitmapCache:Landroid/util/LruCache;

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->getNoIconBitmapKey(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$bitmapDescriptor$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$bitmapDescriptor$2;-><init>(Lkotlin/Lazy;)V

    invoke-static {p2, p1, v1}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LPT;

    :cond_2
    :goto_0
    return-object p1
.end method

.method public bridge synthetic bitmapDescriptor(Ljava/lang/Object;Z)LPT;
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)LPT;

    move-result-object p1

    return-object p1
.end method
