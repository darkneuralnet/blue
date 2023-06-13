.class public final Lco/bird/android/app/feature/map/renderer/IconLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/renderer/IconLoader$Companion;,
        Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;,
        Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;,
        Lco/bird/android/app/feature/map/renderer/IconLoader$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0018\u0000 J2\u00020\u0001:\u0003JKLB\'\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00105\u001a\u000204\u00a2\u0006\u0004\u0008H\u0010IJ,\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J2\u0010\u0010\u001a\u00020\u000f*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0012\u0010\u0012\u001a\u00020\u0011*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010\u0013\u001a\u00020\u0011*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010\u0014\u001a\u00020\u0011*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u001a\u0010\u0016\u001a\u00020\u0005*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\"\u0010\u001a\u001a\u00020\u0019*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0012\u0010\u001b\u001a\u00020\u0011*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010\u001c\u001a\u00020\u0011*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010\u001d\u001a\u00020\u0011*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010\u001e\u001a\u00020\u0011*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010\u001f\u001a\u00020\u0011*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u001b\u0010 \u001a\u0004\u0018\u00010\u0011*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u00020\u0011*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010#\u001a\u00020\u0011*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J.\u0010%\u001a\u00020\t*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\tH\u0002J#\u0010&\u001a\u0004\u0018\u00010\u0011*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000c\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u001c\u0010*\u001a\u00020(2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010)\u001a\u00020(J\u001c\u0010+\u001a\u00020(2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010)\u001a\u00020(J\u001c\u0010,\u001a\u00020(2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010)\u001a\u00020(R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R\'\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020>0=8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008?\u00109\u001a\u0004\u0008@\u0010AR\u001b\u0010\r\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008C\u00109\u001a\u0004\u0008D\u0010ER\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008F\u00109\u001a\u0004\u0008G\u0010E\u00a8\u0006M"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/IconLoader;",
        "",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "Lco/bird/android/model/wire/WireBird;",
        "item",
        "",
        "selected",
        "Lkotlin/Pair;",
        "LPT;",
        "",
        "getIconAndAccessibilityLabel",
        "multiModalEnabled",
        "shouldShowPills",
        "privateBirdContentDescription",
        "defaultContentDescription",
        "Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;",
        "toPinState",
        "",
        "getViewRes",
        "getBatteryLevelColor",
        "getBatteryLevelDrawable",
        "isMultiModalEnabled",
        "shouldShowGroundOverlay",
        "LBK2;",
        "markerOverridesManager",
        "Lrt2;",
        "getOverrideContentIcon",
        "getMultiModalContentDrawable",
        "getPinBackgroundColor",
        "getPinContentColor",
        "getPinRingColor",
        "getPinAccentColor",
        "getBadgeIcon",
        "(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/Integer;",
        "getBadgeBackgroundColor",
        "getBadgeContentColor",
        "overrideContentDescription",
        "getContentDescription",
        "getPillText",
        "(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)Ljava/lang/Integer;",
        "LnM2;",
        "markerSettings",
        "renderSelected",
        "renderDeselected",
        "renderForState",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "LBK2;",
        "LTq4;",
        "reactiveConfig",
        "LTq4;",
        "LOh;",
        "buildConfig",
        "LOh;",
        "LAP1;",
        "iconGenerator$delegate",
        "Lkotlin/Lazy;",
        "getIconGenerator",
        "()LAP1;",
        "iconGenerator",
        "",
        "Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;",
        "markerPinViews$delegate",
        "getMarkerPinViews",
        "()Ljava/util/Map;",
        "markerPinViews",
        "privateBirdContentDescription$delegate",
        "getPrivateBirdContentDescription",
        "()Ljava/lang/String;",
        "defaultContentDescription$delegate",
        "getDefaultContentDescription",
        "<init>",
        "(Landroid/content/Context;LBK2;LTq4;LOh;)V",
        "Companion",
        "MapMarkerPinState",
        "MarkerPinWrapper",
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
        "SMAP\nIconLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconLoader.kt\nco/bird/android/app/feature/map/renderer/IconLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,623:1\n1#2:624\n*E\n"
    }
.end annotation


# static fields
.field private static final BATTERY_25:I = 0x19

.field private static final BATTERY_50:I = 0x32

.field private static final BATTERY_75:I = 0x4b

.field public static final Companion:Lco/bird/android/app/feature/map/renderer/IconLoader$Companion;

.field private static final LOW_BATTERY_THRESHOLD:I = 0xa

.field public static final MAP_MARKER_ANCHOR_POINT_HEIGHT_PERCENTAGE:F = 1.0f

.field public static final MAP_MARKER_ANCHOR_POINT_WIDTH_PERCENTAGE:F = 0.5f

.field private static final pinStateBitmapDescriptorCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;",
            "LPT;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final buildConfig:LOh;

.field private final context:Landroid/content/Context;

.field private final defaultContentDescription$delegate:Lkotlin/Lazy;

.field private final iconGenerator$delegate:Lkotlin/Lazy;

.field private final markerOverridesManager:LBK2;

.field private final markerPinViews$delegate:Lkotlin/Lazy;

.field private final privateBirdContentDescription$delegate:Lkotlin/Lazy;

.field private final reactiveConfig:LTq4;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/map/renderer/IconLoader$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/IconLoader;->Companion:Lco/bird/android/app/feature/map/renderer/IconLoader$Companion;

    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/IconLoader;->pinStateBitmapDescriptorCache:Landroid/util/LruCache;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LBK2;LTq4;LOh;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerOverridesManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->context:Landroid/content/Context;

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->markerOverridesManager:LBK2;

    iput-object p3, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->reactiveConfig:LTq4;

    iput-object p4, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->buildConfig:LOh;

    new-instance p1, Lco/bird/android/app/feature/map/renderer/IconLoader$iconGenerator$2;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/map/renderer/IconLoader$iconGenerator$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->iconGenerator$delegate:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/app/feature/map/renderer/IconLoader$markerPinViews$2;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/map/renderer/IconLoader$markerPinViews$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->markerPinViews$delegate:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/app/feature/map/renderer/IconLoader$privateBirdContentDescription$2;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/map/renderer/IconLoader$privateBirdContentDescription$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->privateBirdContentDescription$delegate:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/app/feature/map/renderer/IconLoader$defaultContentDescription$2;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/map/renderer/IconLoader$defaultContentDescription$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->defaultContentDescription$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getContext$p(Lco/bird/android/app/feature/map/renderer/IconLoader;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->context:Landroid/content/Context;

    return-object p0
.end method

.method private final getBadgeBackgroundColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->AVAILABLE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getHasHelmet()Z

    move-result v0

    if-eqz v0, :cond_1

    sget p1, LDf4;->birdWhite:I

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getPinAccentColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I

    move-result p1

    :goto_0
    return p1
.end method

.method private final getBadgeContentColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->AVAILABLE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getHasHelmet()Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, LDf4;->birdMatteBlack:I

    goto :goto_0

    :cond_1
    sget p1, LDf4;->birdWhite:I

    :goto_0
    return p1
.end method

.method private final getBadgeIcon(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/Integer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/renderer/IconLoader$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getHasHelmet()Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lrg4;->ic_marker_bird_riding_badge_filled_helmet:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocked()Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lrg4;->ic_marker_bird_riding_badge_filled_paused:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :pswitch_2
    sget p1, Lrg4;->ic_marker_bird_riding_badge_filled_issue:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :pswitch_3
    sget p1, Lrg4;->ic_marker_bird_riding_badge_filled_no_parking:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :pswitch_4
    sget p1, Lrg4;->ic_marker_bird_riding_badge_filled_dont_enter:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :pswitch_5
    sget p1, Lrg4;->ic_marker_bird_riding_badge_filled_parking:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    :goto_0
    :pswitch_6
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final getBatteryLevelColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result p1

    const/16 v0, 0xa

    if-le p1, v0, :cond_0

    sget p1, LDf4;->birdESBlue:I

    goto :goto_0

    :cond_0
    sget p1, LDf4;->birdRed:I

    :goto_0
    return p1
.end method

.method private final getBatteryLevelDrawable(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result v0

    const/16 v1, 0x19

    if-ge v0, v1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->getInRide()Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lrg4;->ic_marker_bird_riding_battery_25:I

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    if-ne p1, v0, :cond_1

    sget p1, Lrg4;->ic_marker_bird_selected_battery_25:I

    goto :goto_0

    :cond_1
    sget p1, Lrg4;->ic_marker_bird_unselected_battery_25:I

    goto :goto_0

    :cond_2
    const/16 v1, 0x32

    if-ge v0, v1, :cond_5

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->getInRide()Z

    move-result v0

    if-eqz v0, :cond_3

    sget p1, Lrg4;->ic_marker_bird_riding_battery_50:I

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    if-ne p1, v0, :cond_4

    sget p1, Lrg4;->ic_marker_bird_selected_battery_50:I

    goto :goto_0

    :cond_4
    sget p1, Lrg4;->ic_marker_bird_unselected_battery_50:I

    goto :goto_0

    :cond_5
    const/16 v1, 0x4b

    if-ge v0, v1, :cond_8

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->getInRide()Z

    move-result v0

    if-eqz v0, :cond_6

    sget p1, Lrg4;->ic_marker_bird_riding_battery_75:I

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    if-ne p1, v0, :cond_7

    sget p1, Lrg4;->ic_marker_bird_selected_battery_75:I

    goto :goto_0

    :cond_7
    sget p1, Lrg4;->ic_marker_bird_unselected_battery_75:I

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->getInRide()Z

    move-result v0

    if-eqz v0, :cond_9

    sget p1, Lrg4;->ic_marker_bird_riding_battery_100:I

    goto :goto_0

    :cond_9
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    if-ne p1, v0, :cond_a

    sget p1, Lrg4;->ic_marker_bird_selected_battery_100:I

    goto :goto_0

    :cond_a
    sget p1, Lrg4;->ic_marker_bird_unselected_battery_100:I

    :goto_0
    return p1
.end method

.method private final getContentDescription(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p4, :cond_1

    move-object p2, p3

    goto :goto_0

    :cond_1
    move-object p2, p4

    :goto_0
    return-object p2
.end method

.method public static synthetic getContentDescription$default(Lco/bird/android/app/feature/map/renderer/IconLoader;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getContentDescription(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getDefaultContentDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->defaultContentDescription$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final getIconAndAccessibilityLabel(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)Lkotlin/Pair;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;Z)",
            "Lkotlin/Pair<",
            "LPT;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->reactiveConfig:LTq4;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    invoke-static {p2, v0}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableMultiModalMapPins()Z

    move-result v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getWarningConfig()Lco/bird/android/model/wire/configs/RideWarningConfig;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideWarningConfig;->getEnableRiderAnnotationPills()Ljava/lang/Boolean;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    invoke-direct {p0}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getPrivateBirdContentDescription()Ljava/lang/String;

    move-result-object v5

    const-string p2, "privateBirdContentDescription"

    invoke-static {v5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getDefaultContentDescription()Ljava/lang/String;

    move-result-object v6

    const-string p2, "defaultContentDescription"

    invoke-static {v6, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/app/feature/map/renderer/IconLoader;->toPinState(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;ZZLjava/lang/String;Ljava/lang/String;)Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;

    move-result-object p2

    sget-object v0, Lco/bird/android/app/feature/map/renderer/IconLoader;->pinStateBitmapDescriptorCache:Landroid/util/LruCache;

    invoke-virtual {v0, p2}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LPT;

    if-nez v1, :cond_16

    invoke-direct {p0}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getMarkerPinViews()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getViewRes()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getPillText()Landroid/widget/TextView;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getPinAccentColor()I

    move-result v8

    invoke-static {v7, v8}, LNA0;->c(Landroid/content/Context;I)I

    move-result v7

    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getPillTextRes()Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getPillTextRes()Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_1

    move v7, v3

    goto :goto_0

    :cond_1
    move v7, v6

    :goto_0
    invoke-static {v2, v7, v6, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_2
    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getPinBg()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getPinBackgroundColor()I

    move-result v8

    invoke-static {v7, v8}, LNA0;->c(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setColorFilter(I)V

    :cond_3
    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getPinRing()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getPinRingColor()I

    move-result v8

    invoke-static {v7, v8}, LNA0;->c(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setColorFilter(I)V

    :cond_4
    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getPinGround()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getShowGroundOverlay()Z

    move-result v7

    invoke-static {v2, v7, v6, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_5
    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getPinBatteryBg()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle()Z

    move-result v7

    xor-int/2addr v7, v3

    invoke-static {v2, v7, v6, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_6
    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getPinBatteryLevel()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getBatteryLevelDrawable()I

    move-result v7

    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getBatteryLevelColor()I

    move-result v8

    invoke-static {v7, v8}, LNA0;->c(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setColorFilter(I)V

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle()Z

    move-result v7

    xor-int/2addr v7, v3

    invoke-static {v2, v7, v6, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_7
    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getPinContent()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getMultiModalEnabled()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle()Z

    move-result v7

    if-nez v7, :cond_8

    move v7, v3

    goto :goto_1

    :cond_8
    move v7, v6

    :goto_1
    if-eqz v7, :cond_9

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getMultiModalContentDrawable()I

    move-result v8

    invoke-virtual {v2, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getPinContentColor()I

    move-result v9

    invoke-static {v8, v9}, LNA0;->c(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v2, v8}, Landroid/widget/ImageView;->setColorFilter(I)V

    :cond_9
    invoke-static {v2, v7, v6, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_a
    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getOverrideImage()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getMultiModalEnabled()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle()Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_2

    :cond_b
    move v7, v6

    goto :goto_3

    :cond_c
    :goto_2
    move v7, v3

    :goto_3
    if-eqz v7, :cond_f

    iget-object v8, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->markerOverridesManager:LBK2;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-interface {v8, p1}, LBK2;->a(Lco/bird/android/model/wire/WireBird;)Lrt2;

    move-result-object p1

    invoke-virtual {p1}, Lrt2;->a()Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->isExternalFeedVehicle()Z

    move-result p1

    if-eqz p1, :cond_d

    const/4 p1, 0x5

    invoke-static {v2, p1}, Ltu6;->d(Landroid/view/View;I)I

    move-result p1

    goto :goto_4

    :cond_d
    invoke-static {v2, v4}, Ltu6;->d(Landroid/view/View;I)I

    move-result p1

    :goto_4
    int-to-float p1, p1

    invoke-virtual {v2, p1}, Landroid/view/View;->setTranslationY(F)V

    goto :goto_5

    :cond_e
    iget-object p1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->buildConfig:LOh;

    invoke-interface {p1}, LOh;->g()I

    move-result p1

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getPinContentColor()I

    move-result v8

    invoke-static {p1, v8}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    const/4 p1, 0x4

    invoke-static {v2, p1}, Ltu6;->d(Landroid/view/View;I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v2, p1}, Landroid/view/View;->setTranslationY(F)V

    :cond_f
    :goto_5
    invoke-static {v2, v7, v6, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_10
    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getBadgeFrame()Landroid/widget/FrameLayout;

    move-result-object p1

    if-eqz p1, :cond_12

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getBadgeIconDrawable()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_11

    goto :goto_6

    :cond_11
    move v3, v6

    :goto_6
    invoke-static {p1, v3, v6, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_12
    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getBadgeInnerBg()Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getBadgeBackgroundColor()I

    move-result v3

    invoke-static {v2, v3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    :cond_13
    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getBadgeContent()Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_15

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getBadgeIconDrawable()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_14
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getBadgeContentColor()I

    move-result v3

    invoke-static {v2, v3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    :cond_15
    iget-object p1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->context:Landroid/content/Context;

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getView()Landroid/view/View;

    move-result-object v1

    invoke-direct {p0}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getIconGenerator()LAP1;

    move-result-object v2

    invoke-static {p1, v1, v5, v2}, LfB0;->r(Landroid/content/Context;Landroid/view/View;Landroid/graphics/drawable/Drawable;LAP1;)LPT;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_16
    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;->getContentDescription()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method private final getIconGenerator()LAP1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->iconGenerator$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAP1;

    return-object v0
.end method

.method private final getMarkerPinViews()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->markerPinViews$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final getMultiModalContentDrawable(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->getInRide()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->isBikeType(Lco/bird/android/model/wire/WireBird;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lrg4;->ic_marker_bird_riding_bike:I

    goto :goto_0

    :cond_0
    sget p1, Lrg4;->ic_marker_bird_riding_scooter:I

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->isBikeType(Lco/bird/android/model/wire/WireBird;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget p1, Lrg4;->ic_marker_bird_selected_bike:I

    goto :goto_0

    :cond_2
    sget p1, Lrg4;->ic_marker_bird_selected_scooter:I

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->isBikeType(Lco/bird/android/model/wire/WireBird;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget p1, Lrg4;->ic_marker_bird_unselected_bike:I

    goto :goto_0

    :cond_4
    sget p1, Lrg4;->ic_marker_bird_unselected_scooter:I

    :goto_0
    return p1
.end method

.method private final getOverrideContentIcon(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LBK2;Z)Lrt2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "LBK2;",
            "Z)",
            "Lrt2;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p3}, Lco/bird/android/model/wire/WireBird;->getExternalFeedType()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_0

    new-instance p1, Lrt2;

    const-string p2, ""

    const/4 p3, 0x0

    invoke-direct {p1, p3, p2, p3}, Lrt2;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-interface {p2, p1}, LBK2;->a(Lco/bird/android/model/wire/WireBird;)Lrt2;

    move-result-object p1

    return-object p1
.end method

.method private final getPillText(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)Ljava/lang/Integer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;Z)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object p1

    sget-object p2, Lco/bird/android/app/feature/map/renderer/IconLoader$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget p1, Lnl4;->rider_pill_slow_zone:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    sget p1, Lnl4;->rider_pill_no_park_zone:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    sget p1, Lnl4;->rider_pill_slow_no_park_zone:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    sget p1, Lnl4;->rider_pill_no_ride_no_park_zone:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_4
    sget p1, Lnl4;->parking_unavailable:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_5
    sget p1, Lnl4;->rider_pill_no_ride_zone:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_6
    sget p1, Lnl4;->rider_pill_parking_zone:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_7
    sget p1, Lnl4;->parking_spot_nearby:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    :pswitch_8
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_8
        :pswitch_0
        :pswitch_8
        :pswitch_8
    .end packed-switch
.end method

.method private final getPinAccentColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/renderer/IconLoader$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    sget p1, LDf4;->birdESBlue:I

    goto :goto_0

    :pswitch_0
    sget p1, LDf4;->birdESBlue:I

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocked()Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, LDf4;->birdDarkBlueGray:I

    goto :goto_0

    :cond_0
    sget p1, LDf4;->birdESBlue:I

    goto :goto_0

    :pswitch_2
    sget p1, LDf4;->birdGold:I

    goto :goto_0

    :pswitch_3
    sget p1, LDf4;->birdRed:I

    goto :goto_0

    :pswitch_4
    sget p1, LDf4;->birdMatteBlack:I

    goto :goto_0

    :pswitch_5
    sget p1, LDf4;->birdParkingBlue:I

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final getPinBackgroundColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object p1

    if-eqz p1, :cond_0

    sget p1, LDf4;->birdMatteBlack:I

    goto :goto_0

    :cond_0
    sget p1, LDf4;->birdWhite:I

    :goto_0
    return p1
.end method

.method private final getPinContentColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object p1

    if-eqz p1, :cond_0

    sget p1, LDf4;->birdWhite:I

    goto :goto_0

    :cond_0
    sget p1, LDf4;->birdMatteBlack:I

    :goto_0
    return p1
.end method

.method private final getPinRingColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v0

    if-eqz v0, :cond_0

    sget p1, LDf4;->birdWhite:I

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getPinAccentColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I

    move-result p1

    :goto_0
    return p1
.end method

.method private final getPrivateBirdContentDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader;->privateBirdContentDescription$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final getViewRes(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->getInRide()Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lmj4;->marker_bird_riding:I

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Lmj4;->marker_bird_selected:I

    goto :goto_0

    :cond_1
    sget p1, Lmj4;->marker_bird_unselected:I

    :goto_0
    return p1
.end method

.method private final shouldShowGroundOverlay(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;Z)Z"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->getInRide()Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final toPinState(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;ZZLjava/lang/String;Ljava/lang/String;)Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lco/bird/android/app/feature/map/renderer/IconLoader;->markerOverridesManager:LBK2;

    move/from16 v4, p2

    invoke-direct {v0, v1, v2, v4}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getOverrideContentIcon(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LBK2;Z)Lrt2;

    move-result-object v2

    invoke-virtual {v2}, Lrt2;->a()Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v2}, Lrt2;->b()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lrt2;->c()Ljava/lang/String;

    move-result-object v2

    new-instance v22, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;

    invoke-direct/range {p0 .. p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getViewRes(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I

    move-result v5

    invoke-direct/range {p0 .. p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getBatteryLevelColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I

    move-result v6

    invoke-direct/range {p0 .. p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getBatteryLevelDrawable(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I

    move-result v7

    invoke-direct/range {p0 .. p2}, Lco/bird/android/app/feature/map/renderer/IconLoader;->shouldShowGroundOverlay(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)Z

    move-result v8

    const/4 v11, 0x0

    if-eqz v3, :cond_0

    const/4 v12, 0x1

    goto :goto_0

    :cond_0
    move v12, v11

    :goto_0
    invoke-direct/range {p0 .. p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getMultiModalContentDrawable(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I

    move-result v13

    invoke-direct/range {p0 .. p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getPinBackgroundColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I

    move-result v14

    invoke-direct/range {p0 .. p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getPinContentColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I

    move-result v15

    invoke-direct/range {p0 .. p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getPinRingColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I

    move-result v16

    invoke-direct/range {p0 .. p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getPinAccentColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I

    move-result v17

    invoke-direct/range {p0 .. p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getBadgeIcon(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/Integer;

    move-result-object v18

    invoke-direct/range {p0 .. p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getBadgeBackgroundColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I

    move-result v19

    invoke-direct/range {p0 .. p1}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getBadgeContentColor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)I

    move-result v20

    move/from16 v3, p3

    invoke-direct {v0, v1, v3}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getPillText(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)Ljava/lang/Integer;

    move-result-object v21

    move-object/from16 v3, p4

    move-object/from16 v10, p5

    invoke-direct {v0, v1, v3, v10, v2}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getContentDescription(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getExternalFeedType()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const/16 v23, 0x1

    goto :goto_1

    :cond_1
    move/from16 v23, v11

    :goto_1
    move-object/from16 v3, v22

    move/from16 v4, p2

    move v10, v12

    move v11, v13

    move v12, v14

    move v13, v15

    move/from16 v14, v16

    move/from16 v15, v17

    move-object/from16 v16, v18

    move/from16 v17, v19

    move/from16 v18, v20

    move-object/from16 v19, v21

    move-object/from16 v20, v2

    move/from16 v21, v23

    invoke-direct/range {v3 .. v21}, Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;-><init>(ZIIIZLjava/lang/String;ZIIIIILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/String;Z)V

    return-object v22
.end method


# virtual methods
.method public final renderDeselected(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LnM2;)LnM2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "LnM2;",
            ")",
            "LnM2;"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerSettings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getIconAndAccessibilityLabel(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPT;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, LnM2;->e(Ljava/lang/String;)LnM2;

    move-result-object p1

    invoke-virtual {p1, v0}, LnM2;->d(LPT;)LnM2;

    move-result-object p1

    const/high16 p2, 0x3f000000    # 0.5f

    const v0, 0x3f6d097b

    invoke-virtual {p1, p2, v0}, LnM2;->a(FF)LnM2;

    move-result-object p1

    const-string p2, "markerSettings\n      .ti\u2026TH_PERCENTAGE, 50f / 54f)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final renderForState(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LnM2;)LnM2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "LnM2;",
            ")",
            "LnM2;"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerSettings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->isSelected()Z

    move-result v0

    invoke-direct {p0, p1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getIconAndAccessibilityLabel(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPT;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, LnM2;->e(Ljava/lang/String;)LnM2;

    move-result-object p1

    invoke-virtual {p1, v0}, LnM2;->d(LPT;)LnM2;

    move-result-object p1

    const/high16 p2, 0x3f000000    # 0.5f

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, v0}, LnM2;->a(FF)LnM2;

    move-result-object p1

    const-string p2, "markerSettings\n      .ti\u2026_POINT_HEIGHT_PERCENTAGE)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final renderSelected(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LnM2;)LnM2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "LnM2;",
            ")",
            "LnM2;"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerSettings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader;->getIconAndAccessibilityLabel(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPT;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, LnM2;->e(Ljava/lang/String;)LnM2;

    move-result-object p1

    invoke-virtual {p1, v0}, LnM2;->d(LPT;)LnM2;

    move-result-object p1

    const/high16 p2, 0x3f000000    # 0.5f

    const v0, 0x3f7ca1af

    invoke-virtual {p1, p2, v0}, LnM2;->a(FF)LnM2;

    move-result-object p1

    const-string p2, "markerSettings\n      .ti\u2026TH_PERCENTAGE, 75f / 76f)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
