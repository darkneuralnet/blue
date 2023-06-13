.class public Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider<",
        "Lco/bird/android/model/persistence/FleetMarker;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0016\u0018\u0000 $2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0011\u0008\u0007\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\"\u0010#J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00080\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0019R\u0018\u0010\u001d\u001a\u00020\u000f*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u00020\u000f*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001cR\u0018\u0010!\u001a\u00020\u000f*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u001c\u00a8\u0006&\u00b2\u0006\u000c\u0010%\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;",
        "Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;",
        "Lco/bird/android/model/persistence/FleetMarker;",
        "",
        "withIcon",
        "LPT;",
        "createBitmapDescriptor",
        "marker",
        "Landroid/graphics/PointF;",
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
        "Lfs6;",
        "fleetBinding",
        "Lfs6;",
        "bountyBinding",
        "getBitmapKey",
        "(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;",
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
        "SMAP\nFleetMarkerOptionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetMarkerOptionProvider.kt\nco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"
    }
.end annotation


# static fields
.field private static final ANCHOR_CACHE_SIZE:I = 0x5

.field private static final BITMAP_CACHE_SIZE:I = 0x1e

.field public static final Companion:Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$Companion;

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

.field private bountyBinding:Lfs6;

.field private final context:Landroid/content/Context;

.field private fleetBinding:Lfs6;

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


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->Companion:Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$Companion;

    new-instance v0, Landroid/graphics/PointF;

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-direct {v0, v2, v1}, Landroid/graphics/PointF;-><init>(FF)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->DEFAULT_ANCHOR:Landroid/graphics/PointF;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, v2, v2}, Landroid/graphics/PointF;-><init>(FF)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->DEFAULT_ANCHOR_CENTERED:Landroid/graphics/PointF;

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->STANDARD_PIN_STYLE_PROMINENCES:Lkotlin/ranges/IntRange;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->context:Landroid/content/Context;

    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->noIconBitmapCache:Landroid/util/LruCache;

    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->bitmapCache:Landroid/util/LruCache;

    new-instance v0, Landroid/util/LruCache;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->anchorCache:Landroid/util/LruCache;

    new-instance v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    return-void
.end method

.method public static final synthetic access$bitmapDescriptor$lambda$1(Lkotlin/Lazy;)LPT;
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->bitmapDescriptor$lambda$1(Lkotlin/Lazy;)LPT;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createBitmapDescriptor(Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;Lco/bird/android/model/persistence/FleetMarker;Z)LPT;
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->createBitmapDescriptor(Lco/bird/android/model/persistence/FleetMarker;Z)LPT;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAnchorCache$p(Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;)Landroid/util/LruCache;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->anchorCache:Landroid/util/LruCache;

    return-object p0
.end method

.method public static final synthetic access$getAnchorKey(Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->getAnchorKey(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;

    move-result-object p0

    return-object p0
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

.method private final createBitmapDescriptor(Lco/bird/android/model/persistence/FleetMarker;Z)LPT;
    .locals 8

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getShape()Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->TEARDROP:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->bountyBinding:Lfs6;

    if-nez v0, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->context:Landroid/content/Context;

    invoke-static {v0}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lds6;->c(Landroid/view/LayoutInflater;)Lds6;

    move-result-object v0

    invoke-virtual {v0}, Lds6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-static {v0}, Lfs6;->a(Landroid/view/View;)Lfs6;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->bountyBinding:Lfs6;

    const-string v1, "bind(ViewOperatorBountyM\u2026bountyBinding = binding }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->fleetBinding:Lfs6;

    if-nez v0, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->context:Landroid/content/Context;

    invoke-static {v0}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lfs6;->c(Landroid/view/LayoutInflater;)Lfs6;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->fleetBinding:Lfs6;

    const-string v1, "inflate(context.layoutIn\u2026 fleetBinding = binding }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    invoke-virtual {v1, v0, p1, p2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->hydrateBinding(Lfs6;Lco/bird/android/model/persistence/FleetMarker;Z)V

    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$createBitmapDescriptor$1;

    invoke-direct {v1, p0, p1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$createBitmapDescriptor$1;-><init>(Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;Lco/bird/android/model/persistence/FleetMarker;)V

    invoke-virtual {p2, v0, p1, v1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->calculateAnchorPoint(Lfs6;Lco/bird/android/model/persistence/FleetMarker;Lkotlin/jvm/functions/Function1;)V

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->context:Landroid/content/Context;

    invoke-virtual {v0}, Lfs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    const-string p1, "binding.root"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LfB0;->iconBitmapDescriptor$default(Landroid/content/Context;Landroid/view/View;Landroid/graphics/drawable/Drawable;LAP1;ILjava/lang/Object;)LPT;

    move-result-object p1

    return-object p1
.end method

.method private final getAnchorKey(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getProminence()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getBitmapKey(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getProminence()I

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getFleetIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getStandardPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getNoIconBitmapKey(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getStandardPinColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public anchorPoint(Lco/bird/android/model/persistence/FleetMarker;)Landroid/graphics/PointF;
    .locals 3

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->anchorCache:Landroid/util/LruCache;

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->getAnchorKey(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    if-nez v0, :cond_2

    sget-object v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->STANDARD_PIN_STYLE_PROMINENCES:Lkotlin/ranges/IntRange;

    invoke-virtual {v0}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v1

    invoke-virtual {v0}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getProminence()I

    move-result p1

    const/4 v2, 0x0

    if-gt v1, p1, :cond_0

    if-gt p1, v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    if-eqz v2, :cond_1

    sget-object p1, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->DEFAULT_ANCHOR:Landroid/graphics/PointF;

    goto :goto_0

    :cond_1
    sget-object p1, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->DEFAULT_ANCHOR_CENTERED:Landroid/graphics/PointF;

    :goto_0
    move-object v0, p1

    :cond_2
    return-object v0
.end method

.method public bridge synthetic anchorPoint(Ljava/lang/Object;)Landroid/graphics/PointF;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/FleetMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->anchorPoint(Lco/bird/android/model/persistence/FleetMarker;)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method

.method public bitmapDescriptor(Lco/bird/android/model/persistence/FleetMarker;Z)LPT;
    .locals 2

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$bitmapDescriptor$descriptor$2;

    invoke-direct {v0, p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$bitmapDescriptor$descriptor$2;-><init>(Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;Lco/bird/android/model/persistence/FleetMarker;Z)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    if-eqz p2, :cond_0

    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->bitmapCache:Landroid/util/LruCache;

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->getBitmapKey(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$bitmapDescriptor$1;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$bitmapDescriptor$1;-><init>(Lkotlin/Lazy;)V

    invoke-static {p2, p1, v1}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LPT;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->noIconBitmapCache:Landroid/util/LruCache;

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->getNoIconBitmapKey(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$bitmapDescriptor$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$bitmapDescriptor$2;-><init>(Lkotlin/Lazy;)V

    invoke-static {p2, p1, v1}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LPT;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic bitmapDescriptor(Ljava/lang/Object;Z)LPT;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/FleetMarker;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->bitmapDescriptor(Lco/bird/android/model/persistence/FleetMarker;Z)LPT;

    move-result-object p1

    return-object p1
.end method
