.class public final Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;
.super LEW0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEW0<",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010#\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001BC\u0008\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0008\u0008\u0001\u0010+\u001a\u00020*\u0012\u0014\u0008\u0001\u0010-\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020,\u0012\u0008\u0008\u0001\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\u0008.\u0010/J \u0010\u0008\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\tH\u0002J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000c*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001c\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0010H\u0014J\u001e\u0010\u0016\u001a\u00020\u00072\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014J\u001e\u0010\u0017\u001a\u00020\u00072\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001e\u0010\u0018\u001a\u00020\u00072\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\"\u0010\u001a\u001a\u00020\u00072\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0008\u0010\u001b\u001a\u00020\u0007H\u0016R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00050\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u001c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\n0%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u00060"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;",
        "LEW0;",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "item",
        "LfM2;",
        "marker",
        "",
        "maybeAnimate",
        "Lco/bird/android/model/persistence/FleetIconAnimation;",
        "Landroid/animation/Animator;",
        "animator",
        "LPT;",
        "bitmapDescriptor",
        "Landroid/graphics/PointF;",
        "anchorPoint",
        "LDl0;",
        "cluster",
        "",
        "shouldRenderAsCluster",
        "Lcom/google/android/gms/maps/model/MarkerOptions;",
        "markerOptions",
        "onBeforeClusterItemRendered",
        "selectItem",
        "deselectItem",
        "clusterItem",
        "onClusterItemRendered",
        "startMarkerAnimation",
        "LTq4;",
        "reactiveConfig",
        "LTq4;",
        "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;",
        "markerOptionProvider",
        "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;",
        "",
        "animatedMarkers",
        "Ljava/util/Set;",
        "",
        "animators",
        "Ljava/util/List;",
        "Landroid/content/Context;",
        "context",
        "LcD1;",
        "map",
        "LGl0;",
        "clusterManager",
        "<init>",
        "(Landroid/content/Context;LTq4;LcD1;LGl0;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;)V",
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
        "SMAP\nOperatorBirdMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorBirdMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,148:1\n1855#2,2:149\n1855#2,2:154\n1855#2,2:156\n1#3:151\n13579#4,2:152\n*S KotlinDebug\n*F\n+ 1 OperatorBirdMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer\n*L\n110#1:149,2\n113#1:154,2\n125#1:156,2\n112#1:152,2\n*E\n"
    }
.end annotation


# instance fields
.field private final animatedMarkers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LfM2;",
            ">;"
        }
    .end annotation
.end field

.field private animators:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field

.field private final markerOptionProvider:Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;

.field private final reactiveConfig:LTq4;


# direct methods
.method public constructor <init>(Landroid/content/Context;LTq4;LcD1;LGl0;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LTq4;",
            "LcD1;",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;>;",
            "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clusterManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerOptionProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p3, p4}, LEW0;-><init>(Landroid/content/Context;LcD1;LGl0;)V

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->reactiveConfig:LTq4;

    iput-object p5, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->markerOptionProvider:Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->animatedMarkers:Ljava/util/Set;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->animators:Ljava/util/List;

    return-void
.end method

.method private final anchorPoint(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Landroid/graphics/PointF;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;)",
            "Landroid/graphics/PointF;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->markerOptionProvider:Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->anchorPoint(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method

.method private final animator(Lco/bird/android/model/persistence/FleetIconAnimation;)Landroid/animation/Animator;
    .locals 3

    sget-object v0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-array v0, v1, [I

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, LIj3;

    invoke-direct {v1, p0, p1}, LIj3;-><init>(Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;Lco/bird/android/model/persistence/FleetIconAnimation;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    move-object p1, v0

    :goto_0
    return-object p1

    nop

    :array_0
    .array-data 4
        0x1
        0x3
    .end array-data
.end method

.method private static final animator$lambda$9$lambda$8(Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;Lco/bird/android/model/persistence/FleetIconAnimation;Landroid/animation/ValueAnimator;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->animatedMarkers:Ljava/util/Set;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LfM2;

    invoke-virtual {v1}, LfM2;->c()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    check-cast v2, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    goto :goto_1

    :cond_1
    move-object v2, v4

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/BirdMapMarker;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lco/bird/android/model/persistence/FleetMarker;->getIconAnimation()Lco/bird/android/model/persistence/FleetIconAnimation;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->markerOptionProvider:Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;

    rem-int/lit8 v4, p2, 0x2

    if-nez v4, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {v3, v2, v4}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)LPT;

    move-result-object v2

    invoke-virtual {v1, v2}, LfM2;->k(LPT;)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method private final bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)LPT;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;)",
            "LPT;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->reactiveConfig:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getFleetStatus()Lco/bird/android/model/wire/configs/OperatorFleetStatusConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFleetStatusConfig;->getEnableFleetMarkerAnimation()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/FleetMarker;->getFleetIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/ClientIcon;->UNKNOWN:Lco/bird/android/model/constant/ClientIcon;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->markerOptionProvider:Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;

    invoke-virtual {v1, p1, v0}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)LPT;

    move-result-object p1

    return-object p1
.end method

.method private final maybeAnimate(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;",
            "LfM2;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->reactiveConfig:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getFleetStatus()Lco/bird/android/model/wire/configs/OperatorFleetStatusConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFleetStatusConfig;->getEnableFleetMarkerAnimation()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/BirdMapMarker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/FleetMarker;->getIconAnimation()Lco/bird/android/model/persistence/FleetIconAnimation;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lco/bird/android/model/persistence/FleetIconAnimation;->UNKNOWN:Lco/bird/android/model/persistence/FleetIconAnimation;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, LfM2;->p(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->animatedMarkers:Ljava/util/Set;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static synthetic t(Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;Lco/bird/android/model/persistence/FleetIconAnimation;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->animator$lambda$9$lambda$8(Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;Lco/bird/android/model/persistence/FleetIconAnimation;Landroid/animation/ValueAnimator;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic deselectItem(LEl0;LfM2;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->deselectItem(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public deselectItem(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;",
            "LfM2;",
            ")V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, LEW0;->selectItem(LEl0;LfM2;)V

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)LPT;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->anchorPoint(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Landroid/graphics/PointF;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p2, v0}, LfM2;->k(LPT;)V

    iget v0, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p2, v0, v1}, LfM2;->h(FF)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getZIndex()F

    move-result v0

    invoke-virtual {p2, v0}, LfM2;->s(F)V

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->maybeAnimate(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public bridge synthetic onBeforeClusterItemRendered(LEl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->onBeforeClusterItemRendered(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    return-void
.end method

.method public onBeforeClusterItemRendered(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;",
            "Lcom/google/android/gms/maps/model/MarkerOptions;",
            ")V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, LEW0;->onBeforeClusterItemRendered(LEl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)LPT;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->anchorPoint(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Landroid/graphics/PointF;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p2, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p2

    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    return-void
.end method

.method public bridge synthetic onClusterItemRendered(LEl0;LfM2;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->onClusterItemRendered(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public onClusterItemRendered(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;",
            "LfM2;",
            ")V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, LEW0;->onClusterItemRendered(LEl0;LfM2;)V

    if-eqz p2, :cond_0

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->maybeAnimate(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic selectItem(LEl0;LfM2;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->selectItem(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public selectItem(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;",
            "LfM2;",
            ")V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, LEW0;->selectItem(LEl0;LfM2;)V

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)LPT;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->anchorPoint(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Landroid/graphics/PointF;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p2, v0}, LfM2;->k(LPT;)V

    iget v0, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p2, v0, v1}, LfM2;->h(FF)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getZIndex()F

    move-result v0

    invoke-virtual {p2, v0}, LfM2;->s(F)V

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->maybeAnimate(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public shouldRenderAsCluster(LDl0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDl0<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;>;)Z"
        }
    .end annotation

    const-string v0, "cluster"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LDl0;->a()I

    move-result p1

    const/16 v0, 0x1e

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public startMarkerAnimation()V
    .locals 5

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->animatedMarkers:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->animators:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/animation/Animator;

    invoke-virtual {v1}, Landroid/animation/Animator;->end()V

    goto :goto_0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->animators:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-static {}, Lco/bird/android/model/persistence/FleetIconAnimation;->values()[Lco/bird/android/model/persistence/FleetIconAnimation;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-direct {p0, v3}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->animator(Lco/bird/android/model/persistence/FleetIconAnimation;)Landroid/animation/Animator;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v4, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->animators:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->animators:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/animation/Animator;

    invoke-virtual {v1}, Landroid/animation/Animator;->start()V

    goto :goto_2

    :cond_3
    return-void
.end method
