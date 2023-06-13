.class public final Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;
.super Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer<",
        "Lco/bird/android/model/persistence/ZoneMarker;",
        "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B+\u0008\u0007\u0012\u000e\u0008\u0001\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00030(\u0012\u0008\u0008\u0001\u0010+\u001a\u00020*\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008,\u0010-J\u000c\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0013\u001a\u0004\u0008\u0018\u0010\u0015R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001dR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0018\u0010$\u001a\u00020#*\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'\u00a8\u0006/"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;",
        "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;",
        "Lco/bird/android/model/persistence/ZoneMarker;",
        "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;",
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
        "Lrs6;",
        "zoneMarkerViewBinding$delegate",
        "Lkotlin/Lazy;",
        "getZoneMarkerViewBinding",
        "()Lrs6;",
        "zoneMarkerViewBinding",
        "selectedZoneMarkerViewBinding$delegate",
        "getSelectedZoneMarkerViewBinding",
        "selectedZoneMarkerViewBinding",
        "Landroid/util/LruCache;",
        "",
        "bitmapCache",
        "Landroid/util/LruCache;",
        "Landroid/graphics/drawable/Drawable;",
        "iconCache",
        "Landroid/os/Handler;",
        "mainThreadHandler",
        "Landroid/os/Handler;",
        "Landroid/graphics/PointF;",
        "anchorPoint",
        "Landroid/graphics/PointF;",
        "getAnchorPoint",
        "(Lrs6;)Landroid/graphics/PointF;",
        "LGl0;",
        "clusterManager",
        "LcD1;",
        "map",
        "<init>",
        "(LGl0;LcD1;Landroid/content/Context;)V",
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
        "SMAP\nZoneMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"
    }
.end annotation


# static fields
.field private static final CLAIMED_ICON_PADDING_DP:I = 0x5

.field private static final COLORED_ICON_PADDING_DP:I = 0x4

.field public static final Companion:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$Companion;

.field private static final DEFAULT_ICON_PADDING_DP:I = 0x0

.field private static final SELECTED_CLAIMED_ICON_PADDING_DP:I = 0x4

.field private static final SELECTED_COLORED_ICON_PADDING_DP:F = 5.54f

.field private static final TEMP_ANCHOR_POINT:Landroid/graphics/PointF;


# instance fields
.field private anchorPoint:Landroid/graphics/PointF;

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

.field private final selectedZoneMarkerViewBinding$delegate:Lkotlin/Lazy;

.field private final zoneMarkerViewBinding$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->Companion:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$Companion;

    new-instance v0, Landroid/graphics/PointF;

    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->TEMP_ANCHOR_POINT:Landroid/graphics/PointF;

    return-void
.end method

.method public constructor <init>(LGl0;LcD1;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;",
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

    iput-object p3, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->context:Landroid/content/Context;

    new-instance p1, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$zoneMarkerViewBinding$2;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$zoneMarkerViewBinding$2;-><init>(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->zoneMarkerViewBinding$delegate:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$selectedZoneMarkerViewBinding$2;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$selectedZoneMarkerViewBinding$2;-><init>(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->selectedZoneMarkerViewBinding$delegate:Lkotlin/Lazy;

    new-instance p1, Landroid/util/LruCache;

    const/16 p2, 0x14

    invoke-direct {p1, p2}, Landroid/util/LruCache;-><init>(I)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->bitmapCache:Landroid/util/LruCache;

    new-instance p1, Landroid/util/LruCache;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Landroid/util/LruCache;-><init>(I)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->iconCache:Landroid/util/LruCache;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->mainThreadHandler:Landroid/os/Handler;

    return-void
.end method

.method public static final synthetic access$bitmapDescriptor(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)LPT;
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)LPT;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getContext$p(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->context:Landroid/content/Context;

    return-object p0
.end method

.method private final bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)LPT;
    .locals 7

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->getSelectedZoneMarkerViewBinding()Lrs6;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->getZoneMarkerViewBinding()Lrs6;

    move-result-object v0

    :goto_0
    const-string v1, "if (selected) {\n      se\u2026neMarkerViewBinding\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lrs6;->b:Landroid/widget/TextView;

    const-string v2, "binding.capacity"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getLabel()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;->getText()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v1, v3, v6, v5, v4}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getLabel()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotationLabel;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v1

    iget-object v3, v0, Lrs6;->b:Landroid/widget/TextView;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getIcon()Lco/bird/android/model/persistence/nestedstructures/Icon;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->iconCache:Landroid/util/LruCache;

    invoke-static {v1}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererKt;->access$getCacheKey(Lco/bird/android/model/persistence/nestedstructures/Icon;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$bitmapDescriptor$icon$1$1;

    invoke-direct {v5, v1, p0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$bitmapDescriptor$icon$1$1;-><init>(Lco/bird/android/model/persistence/nestedstructures/Icon;Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;)V

    invoke-static {v2, v3, v5}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_5

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->iconCache:Landroid/util/LruCache;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$bitmapDescriptor$icon$2$1;

    invoke-direct {v5, v1, p0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$bitmapDescriptor$icon$2$1;-><init>(Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;)V

    invoke-static {v2, v3, v5}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/Drawable;

    goto :goto_2

    :cond_4
    move-object v1, v4

    :cond_5
    :goto_2
    iget-object v2, v0, Lrs6;->c:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getIcon()Lco/bird/android/model/persistence/nestedstructures/Icon;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Icon;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v2, v0, Lrs6;->c:Landroid/widget/ImageView;

    const-string v3, "binding.icon"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_3

    :cond_6
    move-object v1, v4

    :goto_3
    if-nez v1, :cond_7

    iget-object v1, v0, Lrs6;->c:Landroid/widget/ImageView;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_7
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getSelected()Z

    move-result v1

    const/4 v2, 0x4

    if-eqz v1, :cond_9

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getIcon()Lco/bird/android/model/persistence/nestedstructures/Icon;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Icon;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v1

    goto :goto_4

    :cond_8
    move-object v1, v4

    :goto_4
    sget-object v3, Lco/bird/android/model/constant/ClientIcon;->IC_FILLED_CLOCK:Lco/bird/android/model/constant/ClientIcon;

    if-ne v1, v3, :cond_9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_5

    :cond_9
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getIcon()Lco/bird/android/model/persistence/nestedstructures/Icon;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Icon;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v4

    :cond_a
    sget-object v1, Lco/bird/android/model/constant/ClientIcon;->IC_FILLED_CLOCK:Lco/bird/android/model/constant/ClientIcon;

    if-ne v4, v1, :cond_b

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_5

    :cond_b
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getSelected()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v1

    if-eqz v1, :cond_c

    const v1, 0x40b147ae    # 5.54f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    goto :goto_5

    :cond_c
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_5

    :cond_d
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_5
    invoke-static {v1}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v1

    float-to-int v1, v1

    iget-object v2, v0, Lrs6;->c:Landroid/widget/ImageView;

    invoke-virtual {v2, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    iget-object v1, v0, Lrs6;->d:Lco/bird/android/widget/ZoneMarkerPin;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getBorderColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v2

    invoke-virtual {v1, v2}, Lco/bird/android/widget/ZoneMarkerPin;->setOutlineColor(I)V

    iget-object v1, v0, Lrs6;->d:Lco/bird/android/widget/ZoneMarkerPin;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result p1

    invoke-virtual {v1, p1}, Lco/bird/android/widget/ZoneMarkerPin;->setColor(I)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->anchorPoint:Landroid/graphics/PointF;

    if-nez p1, :cond_f

    iget-object p1, v0, Lrs6;->d:Lco/bird/android/widget/ZoneMarkerPin;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    if-lez p1, :cond_e

    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->getAnchorPoint(Lrs6;)Landroid/graphics/PointF;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_6

    :cond_e
    iget-object p1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->mainThreadHandler:Landroid/os/Handler;

    new-instance v1, LVI6;

    invoke-direct {v1, p0, v0}, LVI6;-><init>(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;Lrs6;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_f
    :goto_6
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->context:Landroid/content/Context;

    invoke-virtual {v0}, Lrs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

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

.method private static final bitmapDescriptor$lambda$5(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;Lrs6;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->getAnchorPoint(Lrs6;)Landroid/graphics/PointF;

    return-void
.end method

.method private final getAnchorPoint(Lrs6;)Landroid/graphics/PointF;
    .locals 2

    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p1, Lrs6;->d:Lco/bird/android/widget/ZoneMarkerPin;

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Lrs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v1, p1

    const/high16 p1, 0x3f000000    # 0.5f

    invoke-direct {v0, p1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->anchorPoint:Landroid/graphics/PointF;

    return-object v0
.end method

.method private final getSelectedZoneMarkerViewBinding()Lrs6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->selectedZoneMarkerViewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrs6;

    return-object v0
.end method

.method private final getZoneMarkerViewBinding()Lrs6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->zoneMarkerViewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrs6;

    return-object v0
.end method

.method public static synthetic t(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;Lrs6;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->bitmapDescriptor$lambda$5(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;Lrs6;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onBeforeClusterItemRendered(LEl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->onBeforeClusterItemRendered(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    return-void
.end method

.method public onBeforeClusterItemRendered(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 3

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, LEW0;->onBeforeClusterItemRendered(LEl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->bitmapCache:Landroid/util/LruCache;

    invoke-static {p1}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererKt;->access$getCacheKey(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$onBeforeClusterItemRendered$descriptor$1;

    invoke-direct {v2, p0, p1}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$onBeforeClusterItemRendered$descriptor$1;-><init>(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)V

    invoke-static {v0, v1, v2}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LPT;

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->anchorPoint:Landroid/graphics/PointF;

    if-nez v0, :cond_0

    sget-object v0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->TEMP_ANCHOR_POINT:Landroid/graphics/PointF;

    :cond_0
    invoke-virtual {p2, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    iget p2, v0, Landroid/graphics/PointF;->x:F

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    return-void
.end method

.method public bridge synthetic updateItem(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;LfM2;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->updateItem(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public updateItem(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;LfM2;)V
    .locals 3

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->bitmapCache:Landroid/util/LruCache;

    invoke-static {p1}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererKt;->access$getCacheKey(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$updateItem$descriptor$1;

    invoke-direct {v2, p0, p1}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$updateItem$descriptor$1;-><init>(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)V

    invoke-static {v0, v1, v2}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPT;

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->anchorPoint:Landroid/graphics/PointF;

    if-nez v1, :cond_0

    sget-object v1, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->TEMP_ANCHOR_POINT:Landroid/graphics/PointF;

    :cond_0
    invoke-virtual {p2, v0}, LfM2;->k(LPT;)V

    iget v0, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p2, v0, v1}, LfM2;->h(FF)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getZIndex()F

    move-result p1

    invoke-virtual {p2, p1}, LfM2;->s(F)V

    return-void
.end method
