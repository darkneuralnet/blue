.class public final Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003J*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\rJ*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u00020\u0014*\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;",
        "",
        "Lfs6;",
        "Lco/bird/android/model/persistence/FleetMarker;",
        "marker",
        "Landroid/graphics/PointF;",
        "anchorPoint",
        "Los6;",
        "binding",
        "",
        "withIcon",
        "",
        "hydrateBinding",
        "Lkotlin/Function1;",
        "setAnchorPointAsync",
        "calculateAnchorPoint",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "Landroid/util/LruCache;",
        "",
        "Landroid/graphics/drawable/Drawable;",
        "iconCache",
        "Landroid/util/LruCache;",
        "Landroid/os/Handler;",
        "uiHandler",
        "Landroid/os/Handler;",
        "getIconKey",
        "(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;",
        "iconKey",
        "<init>",
        "(Landroid/content/Context;)V",
        "Companion",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$Companion;

.field private static final ICON_CACHE_SIZE:I = 0xf

.field private static final STANDARD_PIN_COLOR_PROMINENCES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final STANDARD_PIN_STYLE_PROMINENCES:Lkotlin/ranges/IntRange;


# instance fields
.field private final context:Landroid/content/Context;

.field private final iconCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field

.field private final uiHandler:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->Companion:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$Companion;

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Integer;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v3, 0x1

    aput-object v0, v1, v3

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->STANDARD_PIN_COLOR_PROMINENCES:Ljava/util/Set;

    new-instance v0, Lkotlin/ranges/IntRange;

    invoke-direct {v0, v2, v3}, Lkotlin/ranges/IntRange;-><init>(II)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->STANDARD_PIN_STYLE_PROMINENCES:Lkotlin/ranges/IntRange;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->context:Landroid/content/Context;

    new-instance p1, Landroid/util/LruCache;

    const/16 v0, 0xf

    invoke-direct {p1, v0}, Landroid/util/LruCache;-><init>(I)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->iconCache:Landroid/util/LruCache;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->uiHandler:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;Lfs6;Lco/bird/android/model/persistence/FleetMarker;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->calculateAnchorPoint$lambda$1(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;Lfs6;Lco/bird/android/model/persistence/FleetMarker;)V

    return-void
.end method

.method public static final synthetic access$getContext$p(Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->context:Landroid/content/Context;

    return-object p0
.end method

.method private final anchorPoint(Lfs6;Lco/bird/android/model/persistence/FleetMarker;)Landroid/graphics/PointF;
    .locals 3

    sget-object v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->STANDARD_PIN_STYLE_PROMINENCES:Lkotlin/ranges/IntRange;

    invoke-virtual {v0}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v1

    invoke-virtual {v0}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v0

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getProminence()I

    move-result p2

    const/4 v2, 0x0

    if-gt v1, p2, :cond_0

    if-gt p2, v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    const/high16 p2, 0x3f000000    # 0.5f

    if-eqz v2, :cond_1

    iget-object v0, p1, Lfs6;->c:Lco/bird/android/widget/FleetMarkerPin;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    int-to-float v0, v0

    new-instance v1, Landroid/graphics/PointF;

    invoke-virtual {p1}, Lfs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v0, p1

    invoke-direct {v1, p2, v0}, Landroid/graphics/PointF;-><init>(FF)V

    goto :goto_0

    :cond_1
    iget-object v0, p1, Lfs6;->c:Lco/bird/android/widget/FleetMarkerPin;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    new-instance v1, Landroid/graphics/PointF;

    invoke-virtual {p1}, Lfs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v0, p1

    invoke-direct {v1, p2, v0}, Landroid/graphics/PointF;-><init>(FF)V

    :goto_0
    return-object v1
.end method

.method private final anchorPoint(Los6;Lco/bird/android/model/persistence/FleetMarker;)Landroid/graphics/PointF;
    .locals 3

    sget-object v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->STANDARD_PIN_STYLE_PROMINENCES:Lkotlin/ranges/IntRange;

    invoke-virtual {v0}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v1

    invoke-virtual {v0}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v0

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getProminence()I

    move-result p2

    const/4 v2, 0x0

    if-gt v1, p2, :cond_0

    if-gt p2, v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    const/high16 p2, 0x3f000000    # 0.5f

    if-eqz v2, :cond_1

    iget-object v0, p1, Los6;->d:Lco/bird/android/widget/FleetMarkerPillPin;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    int-to-float v0, v0

    new-instance v1, Landroid/graphics/PointF;

    invoke-virtual {p1}, Los6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v0, p1

    invoke-direct {v1, p2, v0}, Landroid/graphics/PointF;-><init>(FF)V

    goto :goto_0

    :cond_1
    iget-object v0, p1, Los6;->d:Lco/bird/android/widget/FleetMarkerPillPin;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    new-instance v1, Landroid/graphics/PointF;

    invoke-virtual {p1}, Los6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v0, p1

    invoke-direct {v1, p2, v0}, Landroid/graphics/PointF;-><init>(FF)V

    :goto_0
    return-object v1
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;Los6;Lco/bird/android/model/persistence/FleetMarker;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->calculateAnchorPoint$lambda$2(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;Los6;Lco/bird/android/model/persistence/FleetMarker;)V

    return-void
.end method

.method private static final calculateAnchorPoint$lambda$1(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;Lfs6;Lco/bird/android/model/persistence/FleetMarker;)V
    .locals 1

    const-string v0, "$setAnchorPointAsync"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$marker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2, p3}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->anchorPoint(Lfs6;Lco/bird/android/model/persistence/FleetMarker;)Landroid/graphics/PointF;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final calculateAnchorPoint$lambda$2(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;Los6;Lco/bird/android/model/persistence/FleetMarker;)V
    .locals 1

    const-string v0, "$setAnchorPointAsync"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$marker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2, p3}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->anchorPoint(Los6;Lco/bird/android/model/persistence/FleetMarker;)Landroid/graphics/PointF;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final getIconKey(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getFleetIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final calculateAnchorPoint(Lfs6;Lco/bird/android/model/persistence/FleetMarker;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfs6;",
            "Lco/bird/android/model/persistence/FleetMarker;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/PointF;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setAnchorPointAsync"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lfs6;->c:Lco/bird/android/widget/FleetMarkerPin;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->anchorPoint(Lfs6;Lco/bird/android/model/persistence/FleetMarker;)Landroid/graphics/PointF;

    move-result-object p1

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->uiHandler:Landroid/os/Handler;

    new-instance v1, Lip1;

    invoke-direct {v1, p3, p0, p1, p2}, Lip1;-><init>(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;Lfs6;Lco/bird/android/model/persistence/FleetMarker;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method public final calculateAnchorPoint(Los6;Lco/bird/android/model/persistence/FleetMarker;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Los6;",
            "Lco/bird/android/model/persistence/FleetMarker;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/PointF;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setAnchorPointAsync"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Los6;->d:Lco/bird/android/widget/FleetMarkerPillPin;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->anchorPoint(Los6;Lco/bird/android/model/persistence/FleetMarker;)Landroid/graphics/PointF;

    move-result-object p1

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->uiHandler:Landroid/os/Handler;

    new-instance v1, Lhp1;

    invoke-direct {v1, p3, p0, p1, p2}, Lhp1;-><init>(Lkotlin/jvm/functions/Function1;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;Los6;Lco/bird/android/model/persistence/FleetMarker;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method public final hydrateBinding(Lfs6;Lco/bird/android/model/persistence/FleetMarker;Z)V
    .locals 7

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getFleetIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/ClientIcon;->UNKNOWN:Lco/bird/android/model/constant/ClientIcon;

    if-ne v0, v1, :cond_0

    iget-object p3, p1, Lfs6;->c:Lco/bird/android/widget/FleetMarkerPin;

    sget-object v0, Lco/bird/android/widget/FleetMarkerPin$b;->b:Lco/bird/android/widget/FleetMarkerPin$b;

    invoke-virtual {p3, v0}, Lco/bird/android/widget/FleetMarkerPin;->setPinStyle(Lco/bird/android/widget/FleetMarkerPin$b;)V

    iget-object p3, p1, Lfs6;->c:Lco/bird/android/widget/FleetMarkerPin;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getStandardPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    invoke-virtual {p3, v0}, Lco/bird/android/widget/FleetMarkerPin;->setColor(I)V

    iget-object p1, p1, Lfs6;->b:Landroid/widget/ImageView;

    iget-object p3, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->iconCache:Landroid/util/LruCache;

    invoke-direct {p0, p2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->getIconKey(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$hydrateBinding$1;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$hydrateBinding$1;-><init>(Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;)V

    invoke-static {p3, p2, v0}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    iget-object v0, p1, Lfs6;->c:Lco/bird/android/widget/FleetMarkerPin;

    sget-object v1, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->STANDARD_PIN_STYLE_PROMINENCES:Lkotlin/ranges/IntRange;

    invoke-virtual {v1}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v2

    invoke-virtual {v1}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v3

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getProminence()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-gt v2, v4, :cond_1

    if-gt v4, v3, :cond_1

    move v2, v5

    goto :goto_0

    :cond_1
    move v2, v6

    :goto_0
    if-eqz v2, :cond_2

    sget-object v2, Lco/bird/android/widget/FleetMarkerPin$b;->b:Lco/bird/android/widget/FleetMarkerPin$b;

    goto :goto_1

    :cond_2
    sget-object v2, Lco/bird/android/widget/FleetMarkerPin$b;->c:Lco/bird/android/widget/FleetMarkerPin$b;

    :goto_1
    invoke-virtual {v0, v2}, Lco/bird/android/widget/FleetMarkerPin;->setPinStyle(Lco/bird/android/widget/FleetMarkerPin$b;)V

    iget-object v0, p1, Lfs6;->c:Lco/bird/android/widget/FleetMarkerPin;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getShape()Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    move-result-object v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/FleetMarkerPin;->setPinShape(Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;)V

    iget-object v0, p1, Lfs6;->c:Lco/bird/android/widget/FleetMarkerPin;

    sget-object v2, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->STANDARD_PIN_COLOR_PROMINENCES:Ljava/util/Set;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getProminence()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getStandardPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v2

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getBackgroundPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v2

    :goto_2
    invoke-virtual {v0, v2}, Lco/bird/android/widget/FleetMarkerPin;->setColor(I)V

    if-eqz p3, :cond_5

    invoke-virtual {v1}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result p3

    invoke-virtual {v1}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v0

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getProminence()I

    move-result v1

    if-gt p3, v1, :cond_4

    if-gt v1, v0, :cond_4

    goto :goto_3

    :cond_4
    move v5, v6

    :goto_3
    if-eqz v5, :cond_5

    iget-object p3, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->iconCache:Landroid/util/LruCache;

    invoke-direct {p0, p2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->getIconKey(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$hydrateBinding$2;

    invoke-direct {v1, p2, p0}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$hydrateBinding$2;-><init>(Lco/bird/android/model/persistence/FleetMarker;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;)V

    invoke-static {p3, v0, v1}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/drawable/Drawable;

    iget-object v0, p1, Lfs6;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p3, p1, Lfs6;->b:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_4

    :cond_5
    iget-object p3, p1, Lfs6;->b:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_4
    invoke-virtual {p1}, Lfs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getOpacity()Ljava/lang/Double;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    double-to-float p2, p2

    goto :goto_5

    :cond_6
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_5
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final hydrateBinding(Los6;Lco/bird/android/model/persistence/FleetMarker;)V
    .locals 4

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Los6;->d:Lco/bird/android/widget/FleetMarkerPillPin;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getStandardPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v1

    invoke-virtual {v0, v1}, Lco/bird/android/widget/FleetMarkerPillPin;->setOutlineColor(I)V

    iget-object v0, p1, Los6;->b:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getStandardPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p1, Los6;->b:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p1, Los6;->b:Landroid/widget/ImageView;

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->iconCache:Landroid/util/LruCache;

    invoke-direct {p0, p2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->getIconKey(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$hydrateBinding$4;

    invoke-direct {v3, p2, p0}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$hydrateBinding$4;-><init>(Lco/bird/android/model/persistence/FleetMarker;Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;)V

    invoke-static {v1, v2, v3}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p1, Los6;->c:Landroid/widget/TextView;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Los6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetMarker;->getOpacity()Ljava/lang/Double;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    double-to-float p2, v0

    goto :goto_0

    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method
