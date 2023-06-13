.class public final Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;
.super Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$Companion;,
        Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer<",
        "Lco/bird/android/model/persistence/NestMarker;",
        "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00019B3\u0008\u0007\u0012\u000e\u0008\u0001\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u000305\u0012\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u00087\u00108J\u000c\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u000c\u0010\u0006\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0014\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0014\u0010\r\u001a\u00020\u000c*\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0014\u0010\r\u001a\u00020\u000c*\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010*0\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010)R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000c0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0018\u00104\u001a\u00020\t*\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u00103\u00a8\u0006:"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;",
        "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;",
        "Lco/bird/android/model/persistence/NestMarker;",
        "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;",
        "LPT;",
        "bitmapDescriptor",
        "bitmapDescriptorExpanded",
        "LTq4;",
        "reactiveConfig",
        "",
        "anchorCacheKey",
        "Ljs6;",
        "Landroid/graphics/PointF;",
        "anchorPoint",
        "Lks6;",
        "config",
        "",
        "useExpandedPin",
        "item",
        "Lcom/google/android/gms/maps/model/MarkerOptions;",
        "markerOptions",
        "",
        "onBeforeClusterItemRendered",
        "LfM2;",
        "marker",
        "updateItem",
        "LcD1;",
        "map",
        "LcD1;",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "LTq4;",
        "nestMarkerViewBinding",
        "Ljs6;",
        "nestMarkerViewSelectedBinding",
        "nestMarkerExpandedViewBinding",
        "Lks6;",
        "nestMarkerExpandedViewSelectedBinding",
        "Landroid/util/LruCache;",
        "bitmapCache",
        "Landroid/util/LruCache;",
        "Landroid/graphics/drawable/Drawable;",
        "iconCache",
        "",
        "anchorCache",
        "Ljava/util/Map;",
        "Landroid/os/Handler;",
        "mainThreadHandler",
        "Landroid/os/Handler;",
        "getCacheKey",
        "(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)Ljava/lang/String;",
        "cacheKey",
        "LGl0;",
        "clusterManager",
        "<init>",
        "(LGl0;LcD1;Landroid/content/Context;LTq4;)V",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNestMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,333:1\n1#2:334\n177#3,2:335\n*S KotlinDebug\n*F\n+ 1 NestMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer\n*L\n174#1:335,2\n*E\n"
    }
.end annotation


# static fields
.field private static final CLAIMED_ICON_PADDING_DP:I = 0x2

.field private static final CLAIMED_KEY:Ljava/lang/String; = "claimed"

.field public static final Companion:Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$Companion;

.field private static final DEFAULT_ICON_PADDING_DP:I = 0x5

.field private static final NEST_MARKER_PIN_DEFAULT_WIDTH_DP:I = 0x2a

.field private static final NEST_MARKER_PIN_ICON_1_DIGIT_WIDTH_DP:I = 0x34

.field private static final NEST_MARKER_PIN_ICON_2_DIGIT_WIDTH_DP:I = 0x3c

.field private static final NEST_MARKER_PIN_SELECTED_DEFAULT_WIDTH_DP:I = 0x3a

.field private static final NEST_MARKER_PIN_SELECTED_ICON_1_DIGIT_WIDTH_DP:I = 0x48

.field private static final NEST_MARKER_PIN_SELECTED_ICON_2_DIGIT_WIDTH_DP:I = 0x52

.field private static final STANDARD_ANCHOR_KEY:Ljava/lang/String; = "anchor"


# instance fields
.field private final anchorCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

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

.field private final mainThreadHandler:Landroid/os/Handler;

.field private final map:LcD1;

.field private nestMarkerExpandedViewBinding:Lks6;

.field private nestMarkerExpandedViewSelectedBinding:Lks6;

.field private nestMarkerViewBinding:Ljs6;

.field private nestMarkerViewSelectedBinding:Ljs6;

.field private final reactiveConfig:LTq4;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->Companion:Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$Companion;

    return-void
.end method

.method public constructor <init>(LGl0;LcD1;Landroid/content/Context;LTq4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;",
            ">;",
            "LcD1;",
            "Landroid/content/Context;",
            "LTq4;",
            ")V"
        }
    .end annotation

    const-string v0, "clusterManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p2, p1}, Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;-><init>(Landroid/content/Context;LcD1;LGl0;)V

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->map:LcD1;

    iput-object p3, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    iput-object p4, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->reactiveConfig:LTq4;

    new-instance p1, Landroid/util/LruCache;

    const/16 p2, 0x14

    invoke-direct {p1, p2}, Landroid/util/LruCache;-><init>(I)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->bitmapCache:Landroid/util/LruCache;

    new-instance p1, Landroid/util/LruCache;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, Landroid/util/LruCache;-><init>(I)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->iconCache:Landroid/util/LruCache;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCache:Ljava/util/Map;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->mainThreadHandler:Landroid/os/Handler;

    return-void
.end method

.method public static final synthetic access$bitmapDescriptor(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)LPT;
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)LPT;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getContext$p(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    return-object p0
.end method

.method private final anchorCacheKey(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/NestMarker;->getSecondaryIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/NestMarker;->getAvailableSpaceDetails()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->useExpandedPin(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/NestMarker;->getIcon()Lco/bird/android/model/constant/NestIcon;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    const-string p1, "anchor"

    :goto_2
    return-object p1
.end method

.method private final anchorPoint(Ljs6;Ljava/lang/String;)Landroid/graphics/PointF;
    .locals 3

    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p1, Ljs6;->e:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    iget-object v2, p1, Ljs6;->e:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {p1}, Ljs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget-object v2, p1, Ljs6;->e:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Ljs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v2, p1

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCache:Ljava/util/Map;

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private final anchorPoint(Lks6;Ljava/lang/String;)Landroid/graphics/PointF;
    .locals 3

    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p1, Lks6;->d:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    iget-object v2, p1, Lks6;->d:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {p1}, Lks6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget-object v2, p1, Lks6;->d:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Lks6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v2, p1

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCache:Ljava/util/Map;

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private final bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)LPT;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getSelected()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->nestMarkerViewSelectedBinding:Ljs6;

    if-nez v2, :cond_1

    iget-object v2, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    invoke-static {v2}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    invoke-static {v2}, Lms6;->c(Landroid/view/LayoutInflater;)Lms6;

    move-result-object v2

    invoke-virtual {v2}, Lms6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-static {v2}, Ljs6;->a(Landroid/view/View;)Ljs6;

    move-result-object v2

    iput-object v2, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->nestMarkerViewSelectedBinding:Ljs6;

    const-string v3, "bind(ViewOperatorNestMar\u2026lectedBinding = binding }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->nestMarkerViewBinding:Ljs6;

    if-nez v2, :cond_1

    iget-object v2, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    invoke-static {v2}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    invoke-static {v2}, Ljs6;->c(Landroid/view/LayoutInflater;)Ljs6;

    move-result-object v2

    iput-object v2, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->nestMarkerViewBinding:Ljs6;

    const-string v3, "inflate(context.layoutIn\u2026erViewBinding = binding }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v3, v2, Ljs6;->c:Landroid/widget/TextView;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/NestMarker;->getCapacity()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v3

    const/4 v4, 0x0

    if-lez v3, :cond_2

    const-string v3, "claimed"

    goto :goto_1

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/NestMarker;->getIcon()Lco/bird/android/model/constant/NestIcon;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v3, v4

    :goto_1
    if-eqz v3, :cond_4

    iget-object v5, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->iconCache:Landroid/util/LruCache;

    new-instance v6, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$bitmapDescriptor$drawable$1;

    invoke-direct {v6, v1, v0}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$bitmapDescriptor$drawable$1;-><init>(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;)V

    invoke-static {v5, v3, v6}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/drawable/Drawable;

    goto :goto_2

    :cond_4
    move-object v3, v4

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/NestMarker;->getProminence()Lco/bird/android/model/constant/NestProminence;

    move-result-object v5

    const/4 v6, 0x1

    if-eqz v5, :cond_5

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getSelected()Z

    move-result v7

    xor-int/2addr v7, v6

    if-eqz v7, :cond_5

    goto :goto_3

    :cond_5
    move-object v5, v4

    :goto_3
    const/4 v7, -0x1

    if-nez v5, :cond_6

    move v5, v7

    goto :goto_4

    :cond_6
    sget-object v8, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v8, v5

    :goto_4
    const/4 v8, 0x2

    if-eq v5, v7, :cond_9

    if-eq v5, v6, :cond_8

    if-ne v5, v8, :cond_7

    goto :goto_5

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_8
    sget-object v5, Lco/bird/android/widget/NestMarkerPin$b;->c:Lco/bird/android/widget/NestMarkerPin$b;

    goto :goto_6

    :cond_9
    :goto_5
    sget-object v5, Lco/bird/android/widget/NestMarkerPin$b;->b:Lco/bird/android/widget/NestMarkerPin$b;

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v7

    const-string v9, "binding.progress"

    const/4 v10, 0x0

    if-lez v7, :cond_a

    iget-object v7, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    sget v11, LDf4;->primaryAccent:I

    invoke-static {v7, v11}, LNA0;->c(Landroid/content/Context;I)I

    move-result v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v11}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v11

    float-to-int v11, v11

    iget-object v12, v2, Ljs6;->f:Landroid/widget/ProgressBar;

    invoke-static {v12, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v12}, Ltu6;->r(Landroid/view/View;)V

    iget-object v9, v2, Ljs6;->f:Landroid/widget/ProgressBar;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v12

    invoke-virtual {v9, v12}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_7

    :cond_a
    iget-object v7, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    sget v11, LDf4;->birdLightGray:I

    invoke-static {v7, v11}, LNA0;->c(Landroid/content/Context;I)I

    move-result v7

    const/4 v11, 0x5

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v11}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v11

    float-to-int v11, v11

    iget-object v12, v2, Ljs6;->f:Landroid/widget/ProgressBar;

    invoke-static {v12, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v12, v10, v10, v8, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :goto_7
    iget-object v9, v2, Ljs6;->d:Landroid/widget/ImageView;

    invoke-virtual {v9, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v3, v2, Ljs6;->d:Landroid/widget/ImageView;

    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v3, v2, Ljs6;->d:Landroid/widget/ImageView;

    const-string v7, "binding.icon"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v9

    if-gtz v9, :cond_b

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v9

    invoke-virtual {v9}, Lco/bird/android/model/persistence/NestMarker;->getIcon()Lco/bird/android/model/constant/NestIcon;

    move-result-object v9

    if-eqz v9, :cond_c

    :cond_b
    sget-object v9, Lco/bird/android/widget/NestMarkerPin$b;->b:Lco/bird/android/widget/NestMarkerPin$b;

    if-ne v5, v9, :cond_c

    move v9, v6

    goto :goto_8

    :cond_c
    move v9, v10

    :goto_8
    invoke-static {v3, v9, v10, v8, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v3, v2, Ljs6;->d:Landroid/widget/ImageView;

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v11, v11, v11, v11}, Landroid/view/View;->setPadding(IIII)V

    iget-object v3, v2, Ljs6;->e:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v7

    const/16 v9, 0xa

    if-gtz v7, :cond_d

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/NestMarker;->getIcon()Lco/bird/android/model/constant/NestIcon;

    move-result-object v7

    if-eqz v7, :cond_e

    :cond_d
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/NestMarker;->getCapacity()I

    move-result v7

    if-ge v7, v9, :cond_e

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getSelected()Z

    move-result v7

    if-eqz v7, :cond_e

    const/16 v7, 0x48

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v7

    :goto_9
    float-to-int v7, v7

    goto/16 :goto_b

    :cond_e
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v7

    if-gtz v7, :cond_f

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/NestMarker;->getIcon()Lco/bird/android/model/constant/NestIcon;

    move-result-object v7

    if-eqz v7, :cond_10

    :cond_f
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getSelected()Z

    move-result v7

    if-eqz v7, :cond_10

    const/16 v7, 0x52

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v7

    goto :goto_9

    :cond_10
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getSelected()Z

    move-result v7

    if-eqz v7, :cond_11

    const/16 v7, 0x3a

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v7

    goto :goto_9

    :cond_11
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v7

    if-gtz v7, :cond_12

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/NestMarker;->getIcon()Lco/bird/android/model/constant/NestIcon;

    move-result-object v7

    if-eqz v7, :cond_13

    :cond_12
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/NestMarker;->getCapacity()I

    move-result v7

    if-ge v7, v9, :cond_13

    const/16 v7, 0x34

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v7

    goto :goto_9

    :cond_13
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v7

    if-gtz v7, :cond_15

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/NestMarker;->getIcon()Lco/bird/android/model/constant/NestIcon;

    move-result-object v7

    if-eqz v7, :cond_14

    goto :goto_a

    :cond_14
    const/16 v7, 0x2a

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v7

    goto :goto_9

    :cond_15
    :goto_a
    const/16 v7, 0x3c

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v7

    goto/16 :goto_9

    :goto_b
    iput v7, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v3

    if-lez v3, :cond_16

    iget-object v3, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    sget v7, LDf4;->primaryAccent:I

    invoke-static {v3, v7}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    iget-object v7, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    sget v9, LDf4;->transparent:I

    invoke-static {v7, v9}, LNA0;->c(Landroid/content/Context;I)I

    move-result v7

    goto :goto_c

    :cond_16
    iget-object v3, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    sget v7, LDf4;->birdWhite:I

    invoke-static {v3, v7}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    iget-object v7, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    sget v9, LDf4;->birdSubtleGray:I

    invoke-static {v7, v9}, LNA0;->c(Landroid/content/Context;I)I

    move-result v7

    :goto_c
    iget-object v9, v2, Ljs6;->e:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v9, v3}, Lco/bird/android/widget/NestMarkerPin;->setColor(I)V

    iget-object v3, v2, Ljs6;->e:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v3, v7}, Lco/bird/android/widget/NestMarkerPin;->setOutlineColor(I)V

    iget-object v3, v2, Ljs6;->e:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v3, v5}, Lco/bird/android/widget/NestMarkerPin;->setPinStyle(Lco/bird/android/widget/NestMarkerPin$b;)V

    iget-object v3, v2, Ljs6;->b:Lco/bird/android/widget/NestBadgeView;

    const-string v5, "binding.badge"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v7

    if-nez v7, :cond_17

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/NestMarker;->getSecondaryIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v7

    if-eqz v7, :cond_17

    move v7, v6

    goto :goto_d

    :cond_17
    move v7, v10

    :goto_d
    invoke-static {v3, v7, v10, v8, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v3, v2, Ljs6;->b:Lco/bird/android/widget/NestBadgeView;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/NestMarker;->getSecondaryIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v7

    if-eqz v7, :cond_18

    iget-object v9, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    invoke-static {v7, v9}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    goto :goto_e

    :cond_18
    move-object v7, v4

    :goto_e
    invoke-virtual {v3, v7}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/NestMarker;->getSecondaryIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v3

    if-eqz v3, :cond_19

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v3

    new-instance v7, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$bitmapDescriptor$2;

    iget-object v9, v2, Ljs6;->b:Lco/bird/android/widget/NestBadgeView;

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v9}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$bitmapDescriptor$2;-><init>(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3}, Lkotlin/reflect/KMutableProperty0;->set(Ljava/lang/Object;)V

    :cond_19
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/NestMarker;->getSecondaryIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v3

    if-eqz v3, :cond_1a

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v3

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_1a

    iget-object v7, v2, Ljs6;->b:Lco/bird/android/widget/NestBadgeView;

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_1a
    iget-object v3, v2, Ljs6;->c:Landroid/widget/TextView;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/NestMarker;->getCapacity()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v2, Ljs6;->c:Landroid/widget/TextView;

    iget-object v5, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v7

    if-lez v7, :cond_1b

    sget v7, LDf4;->birdWhite:I

    goto :goto_f

    :cond_1b
    sget v7, LDf4;->primaryText:I

    :goto_f
    invoke-static {v5, v7}, LNA0;->c(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v3, v2, Ljs6;->c:Landroid/widget/TextView;

    const-string v5, "binding.capacity"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v2, Ljs6;->e:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v5}, Lco/bird/android/widget/NestMarkerPin;->c()Lco/bird/android/widget/NestMarkerPin$b;

    move-result-object v5

    sget-object v7, Lco/bird/android/widget/NestMarkerPin$b;->b:Lco/bird/android/widget/NestMarkerPin$b;

    if-ne v5, v7, :cond_1c

    goto :goto_10

    :cond_1c
    move v6, v10

    :goto_10
    invoke-static {v3, v6, v10, v8, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v11, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    invoke-virtual {v2}, Ljs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v12

    const-string v3, "binding.root"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x4

    const/16 v16, 0x0

    invoke-static/range {v11 .. v16}, LfB0;->iconBitmapDescriptor$default(Landroid/content/Context;Landroid/view/View;Landroid/graphics/drawable/Drawable;LAP1;ILjava/lang/Object;)LPT;

    move-result-object v3

    iget-object v4, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCache:Ljava/util/Map;

    iget-object v5, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->reactiveConfig:LTq4;

    invoke-direct {v0, v1, v5}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCacheKey(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/PointF;

    if-nez v4, :cond_1e

    iget-object v4, v2, Ljs6;->e:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    if-lez v4, :cond_1d

    iget-object v4, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->reactiveConfig:LTq4;

    invoke-direct {v0, v1, v4}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCacheKey(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorPoint(Ljs6;Ljava/lang/String;)Landroid/graphics/PointF;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_11

    :cond_1d
    iget-object v4, v0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->mainThreadHandler:Landroid/os/Handler;

    new-instance v5, Lb43;

    invoke-direct {v5, v0, v2, v1}, Lb43;-><init>(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Ljs6;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V

    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1e
    :goto_11
    return-object v3
.end method

.method private static final bitmapDescriptor$lambda$6$lambda$5(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Ljs6;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_bitmapDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->reactiveConfig:LTq4;

    invoke-direct {p0, p2, v0}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCacheKey(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorPoint(Ljs6;Ljava/lang/String;)Landroid/graphics/PointF;

    return-void
.end method

.method private final bitmapDescriptorExpanded(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)LPT;
    .locals 9

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->nestMarkerExpandedViewSelectedBinding:Lks6;

    if-nez v0, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    invoke-static {v0}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lls6;->c(Landroid/view/LayoutInflater;)Lls6;

    move-result-object v0

    invoke-virtual {v0}, Lls6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-static {v0}, Lks6;->a(Landroid/view/View;)Lks6;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->nestMarkerExpandedViewSelectedBinding:Lks6;

    const-string v1, "bind(ViewOperatorNestMar\u2026lectedBinding = binding }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->nestMarkerExpandedViewBinding:Lks6;

    if-nez v0, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    invoke-static {v0}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lks6;->c(Landroid/view/LayoutInflater;)Lks6;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->nestMarkerExpandedViewBinding:Lks6;

    const-string v1, "inflate(context.layoutIn\u2026edViewBinding = binding }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v1, v0, Lks6;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v1

    instance-of v2, v1, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    check-cast v1, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;

    goto :goto_1

    :cond_2
    move-object v1, v3

    :goto_1
    const/4 v2, 0x0

    if-nez v1, :cond_3

    new-instance v1, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;

    invoke-direct {v1}, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;-><init>()V

    iget-object v4, v0, Lks6;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object v4, v0, Lks6;->c:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v5, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v6, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    invoke-direct {v5, v6, v2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getSelected()Z

    move-result v4

    invoke-virtual {v1, v4}, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->setSelected(Z)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/NestMarker;->getAvailableSpaceDetails()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v4}, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->setAvailableSpaceDetails(Ljava/util/List;)V

    iget-object v4, v0, Lks6;->b:Lco/bird/android/widget/NestBadgeView;

    const-string v5, "binding.badge"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v6

    if-nez v6, :cond_4

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v6

    invoke-virtual {v6}, Lco/bird/android/model/persistence/NestMarker;->getSecondaryIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v6

    if-eqz v6, :cond_4

    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    move v6, v2

    :goto_2
    const/4 v7, 0x2

    invoke-static {v4, v6, v2, v7, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v2, v0, Lks6;->b:Lco/bird/android/widget/NestBadgeView;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/NestMarker;->getSecondaryIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v3, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    invoke-static {v4, v3}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    :cond_5
    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/NestMarker;->getSecondaryIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v2

    new-instance v3, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$bitmapDescriptorExpanded$2;

    iget-object v4, v0, Lks6;->b:Lco/bird/android/widget/NestBadgeView;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v4}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$bitmapDescriptorExpanded$2;-><init>(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Lkotlin/reflect/KMutableProperty0;->set(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/NestMarker;->getSecondaryIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    if-eqz v2, :cond_7

    iget-object v3, v0, Lks6;->b:Lco/bird/android/widget/NestBadgeView;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_7
    iget-object v2, v0, Lks6;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object v3, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->context:Landroid/content/Context;

    invoke-virtual {v0}, Lks6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v4

    const-string v1, "binding.root"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LfB0;->iconBitmapDescriptor$default(Landroid/content/Context;Landroid/view/View;Landroid/graphics/drawable/Drawable;LAP1;ILjava/lang/Object;)LPT;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCache:Ljava/util/Map;

    iget-object v3, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->reactiveConfig:LTq4;

    invoke-direct {p0, p1, v3}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCacheKey(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    if-nez v2, :cond_9

    iget-object v2, v0, Lks6;->d:Lco/bird/android/widget/NestMarkerPin;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    if-lez v2, :cond_8

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->reactiveConfig:LTq4;

    invoke-direct {p0, p1, v2}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCacheKey(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorPoint(Lks6;Ljava/lang/String;)Landroid/graphics/PointF;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_3

    :cond_8
    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->mainThreadHandler:Landroid/os/Handler;

    new-instance v3, La43;

    invoke-direct {v3, p0, v0, p1}, La43;-><init>(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Lks6;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_9
    :goto_3
    return-object v1
.end method

.method private static final bitmapDescriptorExpanded$lambda$14$lambda$13(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Lks6;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_bitmapDescriptorExpanded"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->reactiveConfig:LTq4;

    invoke-direct {p0, p2, v0}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCacheKey(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorPoint(Lks6;Ljava/lang/String;)Landroid/graphics/PointF;

    return-void
.end method

.method private final getCacheKey(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)Ljava/lang/String;
    .locals 6

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v0

    const-string v1, "-"

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getSelected()Z

    move-result v2

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/NestMarker;->getCapacity()I

    move-result v3

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/NestMarker;->getProminence()Lco/bird/android/model/constant/NestProminence;

    move-result-object p1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "claimed-"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/NestMarker;->getIcon()Lco/bird/android/model/constant/NestIcon;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getSelected()Z

    move-result v2

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/NestMarker;->getCapacity()I

    move-result v3

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/NestMarker;->getProminence()Lco/bird/android/model/constant/NestProminence;

    move-result-object v4

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/NestMarker;->getSecondaryIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public static synthetic t(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Lks6;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->bitmapDescriptorExpanded$lambda$14$lambda$13(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Lks6;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V

    return-void
.end method

.method public static synthetic u(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Ljs6;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->bitmapDescriptor$lambda$6$lambda$5(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Ljs6;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V

    return-void
.end method

.method private final useExpandedPin(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Z
    .locals 1

    invoke-virtual {p2}, LTq4;->f8()LZ84;

    move-result-object p2

    invoke-virtual {p2}, LZ84;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getNestMap()Lco/bird/android/model/wire/configs/OperatorNestMapConfig;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/OperatorNestMapConfig;->getEnableExpandedNestPin()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->map:LcD1;

    invoke-virtual {v0}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/maps/model/CameraPosition;->c:F

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/OperatorNestMapConfig;->getExpandedPinZoomThreshold()F

    move-result p2

    cmpl-float p2, v0, p2

    if-lez p2, :cond_0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/NestMarker;->getAvailableSpaceDetails()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    const/4 p2, 0x1

    xor-int/2addr p1, p2

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return p2
.end method


# virtual methods
.method public bridge synthetic onBeforeClusterItemRendered(LEl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->onBeforeClusterItemRendered(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    return-void
.end method

.method public onBeforeClusterItemRendered(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 3

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, LEW0;->onBeforeClusterItemRendered(LEl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->reactiveConfig:LTq4;

    invoke-direct {p0, p1, v0}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->useExpandedPin(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->bitmapDescriptorExpanded(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)LPT;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->bitmapCache:Landroid/util/LruCache;

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->getCacheKey(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$onBeforeClusterItemRendered$descriptor$1;

    invoke-direct {v2, p0, p1}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$onBeforeClusterItemRendered$descriptor$1;-><init>(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V

    invoke-static {v0, v1, v2}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPT;

    :goto_0
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCache:Ljava/util/Map;

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->reactiveConfig:LTq4;

    invoke-direct {p0, p1, v2}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCacheKey(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/PointF;

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

    check-cast p1, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->updateItem(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public updateItem(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LfM2;)V
    .locals 4

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->reactiveConfig:LTq4;

    invoke-direct {p0, p1, v0}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->useExpandedPin(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->bitmapDescriptorExpanded(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)LPT;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->bitmapCache:Landroid/util/LruCache;

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->getCacheKey(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$updateItem$descriptor$1;

    invoke-direct {v2, p0, p1}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$updateItem$descriptor$1;-><init>(Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V

    invoke-static {v0, v1, v2}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPT;

    :goto_0
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCache:Ljava/util/Map;

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->reactiveConfig:LTq4;

    invoke-direct {p0, p1, v2}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;->anchorCacheKey(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;LTq4;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    if-nez v1, :cond_1

    new-instance v1, Landroid/graphics/PointF;

    const/high16 v2, 0x3f000000    # 0.5f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    :cond_1
    invoke-virtual {p2, v0}, LfM2;->k(LPT;)V

    iget v0, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p2, v0, v1}, LfM2;->h(FF)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getZIndex()F

    move-result p1

    invoke-virtual {p2, p1}, LfM2;->s(F)V

    return-void
.end method
