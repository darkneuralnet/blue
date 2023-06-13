.class public final Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider<",
        "Lco/bird/android/model/persistence/BountyMapMarker;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u0000 \"2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0011\u0008\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008 \u0010!J\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u0002J\u000c\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0018\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u00020\u0016*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006$\u00b2\u0006\u000c\u0010#\u001a\u00020\u00068\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;",
        "Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;",
        "Lco/bird/android/model/persistence/BountyMapMarker;",
        "",
        "withIcon",
        "showTimer",
        "LPT;",
        "createBitmapDescriptor",
        "Lhs6;",
        "Landroid/graphics/PointF;",
        "anchorPoint",
        "marker",
        "bitmapDescriptor",
        "bitmapDescriptorFlashing",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "Landroid/util/LruCache;",
        "",
        "noTimerValueBitmapCache",
        "Landroid/util/LruCache;",
        "zeroTimerValueBitmapCache",
        "",
        "anchorCache",
        "Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;",
        "fleetMarkerHelper",
        "Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;",
        "binding",
        "Lhs6;",
        "getAnchorKey",
        "(Lco/bird/android/model/persistence/BountyMapMarker;)Ljava/lang/String;",
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
        "SMAP\nBountyMarkerWithTimerOptionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyMarkerWithTimerOptionProvider.kt\nco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"
    }
.end annotation


# static fields
.field private static final ANCHOR_CACHE_SIZE:I = 0x5

.field private static final CACHE_SIZE:I = 0x5

.field public static final Companion:Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$Companion;

.field private static final TEMP_ANCHOR_POINT:Landroid/graphics/PointF;


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

.field private binding:Lhs6;

.field private final context:Landroid/content/Context;

.field private final fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

.field private final noTimerValueBitmapCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/Integer;",
            "LPT;",
            ">;"
        }
    .end annotation
.end field

.field private final zeroTimerValueBitmapCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/Integer;",
            "LPT;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->Companion:Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$Companion;

    new-instance v0, Landroid/graphics/PointF;

    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->TEMP_ANCHOR_POINT:Landroid/graphics/PointF;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->context:Landroid/content/Context;

    new-instance v0, Landroid/util/LruCache;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->noTimerValueBitmapCache:Landroid/util/LruCache;

    new-instance v0, Landroid/util/LruCache;

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->zeroTimerValueBitmapCache:Landroid/util/LruCache;

    new-instance v0, Landroid/util/LruCache;

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->anchorCache:Landroid/util/LruCache;

    new-instance v0, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    return-void
.end method

.method public static final synthetic access$bitmapDescriptorFlashing$lambda$0(Lkotlin/Lazy;)LPT;
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->bitmapDescriptorFlashing$lambda$0(Lkotlin/Lazy;)LPT;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createBitmapDescriptor(Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;Lco/bird/android/model/persistence/BountyMapMarker;ZZ)LPT;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->createBitmapDescriptor(Lco/bird/android/model/persistence/BountyMapMarker;ZZ)LPT;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAnchorCache$p(Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;)Landroid/util/LruCache;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->anchorCache:Landroid/util/LruCache;

    return-object p0
.end method

.method public static final synthetic access$getAnchorKey(Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;Lco/bird/android/model/persistence/BountyMapMarker;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->getAnchorKey(Lco/bird/android/model/persistence/BountyMapMarker;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final anchorPoint(Lhs6;)Landroid/graphics/PointF;
    .locals 2

    iget-object v0, p1, Lhs6;->c:Lco/bird/android/widget/FleetMarkerPin;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    new-instance v1, Landroid/graphics/PointF;

    invoke-virtual {p1}, Lhs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v0, p1

    const/high16 p1, 0x3f000000    # 0.5f

    invoke-direct {v1, p1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v1
.end method

.method private static final bitmapDescriptorFlashing$lambda$0(Lkotlin/Lazy;)LPT;
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

.method private final declared-synchronized createBitmapDescriptor(Lco/bird/android/model/persistence/BountyMapMarker;ZZ)LPT;
    .locals 8

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyMapMarker;->getMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->binding:Lhs6;

    if-nez v1, :cond_0

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->context:Landroid/content/Context;

    invoke-static {v1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1}, Lhs6;->c(Landroid/view/LayoutInflater;)Lhs6;

    move-result-object v1

    iput-object v1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->binding:Lhs6;

    const-string v2, "inflate(context.layoutIn\u2026vider.binding = binding }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v1}, Lhs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-static {v2}, Lfs6;->a(Landroid/view/View;)Lfs6;

    move-result-object v2

    const-string v3, "bind(binding.root)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    invoke-virtual {v3, v2, v0, p2}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->hydrateBinding(Lfs6;Lco/bird/android/model/persistence/FleetMarker;Z)V

    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->fleetMarkerHelper:Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;

    new-instance v3, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$createBitmapDescriptor$1;

    invoke-direct {v3, p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$createBitmapDescriptor$1;-><init>(Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;Lco/bird/android/model/persistence/BountyMapMarker;)V

    invoke-virtual {p2, v2, v0, v3}, Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;->calculateAnchorPoint(Lfs6;Lco/bird/android/model/persistence/FleetMarker;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->context:Landroid/content/Context;

    sget v0, Lqg4;->fleet_marker_timer_bg:I

    invoke-static {p2, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_0

    :cond_1
    move-object p2, v0

    :goto_0
    const-string v2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/graphics/drawable/GradientDrawable;

    iget-object v2, v1, Lhs6;->c:Lco/bird/android/widget/FleetMarkerPin;

    invoke-virtual {v2}, Lco/bird/android/widget/FleetMarkerPin;->g()I

    move-result v2

    invoke-virtual {p2, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget-object v2, v1, Lhs6;->e:Landroid/widget/ImageView;

    invoke-virtual {v2, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, v1, Lhs6;->d:Landroid/widget/TextView;

    const-string v2, "binding.timer"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, p3, v3, v2, v0}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p2, v1, Lhs6;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyMapMarker;->getCountdownUntil()Lorg/joda/time/DateTime;

    move-result-object p3

    if-eqz p3, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyMapMarker;->getCountdownUntil()Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    move v0, v3

    :goto_1
    if-eqz v0, :cond_3

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-static {p1, p3}, Lorg/joda/time/Hours;->hoursBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Hours;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/Hours;->getHours()I

    move-result p1

    rem-int/lit8 v3, p1, 0x18

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-static {p1, p3}, Lorg/joda/time/Minutes;->minutesBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Minutes;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/Minutes;->getMinutes()I

    move-result p1

    rem-int/lit8 p1, p1, 0x3c

    goto :goto_2

    :cond_3
    move p1, v3

    :goto_2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    if-ge p1, v0, :cond_4

    const-string v0, "0"

    goto :goto_3

    :cond_4
    const-string v0, ""

    :goto_3
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    const-string p1, "?"

    :goto_4
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->context:Landroid/content/Context;

    invoke-virtual {v1}, Lhs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    const-string p1, "binding.root"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LfB0;->iconBitmapDescriptor$default(Landroid/content/Context;Landroid/view/View;Landroid/graphics/drawable/Drawable;LAP1;ILjava/lang/Object;)LPT;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_6
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot render marker without FleetMarker parameter"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static synthetic createBitmapDescriptor$default(Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;Lco/bird/android/model/persistence/BountyMapMarker;ZZILjava/lang/Object;)LPT;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->createBitmapDescriptor(Lco/bird/android/model/persistence/BountyMapMarker;ZZ)LPT;

    move-result-object p0

    return-object p0
.end method

.method private final getAnchorKey(Lco/bird/android/model/persistence/BountyMapMarker;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyMapMarker;->getCountdownUntil()Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public anchorPoint(Lco/bird/android/model/persistence/BountyMapMarker;)Landroid/graphics/PointF;
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->anchorCache:Landroid/util/LruCache;

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->getAnchorKey(Lco/bird/android/model/persistence/BountyMapMarker;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/PointF;

    if-nez p1, :cond_0

    sget-object p1, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->TEMP_ANCHOR_POINT:Landroid/graphics/PointF;

    :cond_0
    return-object p1
.end method

.method public bridge synthetic anchorPoint(Ljava/lang/Object;)Landroid/graphics/PointF;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BountyMapMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->anchorPoint(Lco/bird/android/model/persistence/BountyMapMarker;)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method

.method public bitmapDescriptor(Lco/bird/android/model/persistence/BountyMapMarker;Z)LPT;
    .locals 7

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v1 .. v6}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->createBitmapDescriptor$default(Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;Lco/bird/android/model/persistence/BountyMapMarker;ZZILjava/lang/Object;)LPT;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic bitmapDescriptor(Ljava/lang/Object;Z)LPT;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BountyMapMarker;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->bitmapDescriptor(Lco/bird/android/model/persistence/BountyMapMarker;Z)LPT;

    move-result-object p1

    return-object p1
.end method

.method public final bitmapDescriptorFlashing(Lco/bird/android/model/persistence/BountyMapMarker;ZZ)LPT;
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$bitmapDescriptorFlashing$descriptor$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$bitmapDescriptorFlashing$descriptor$2;-><init>(Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;Lco/bird/android/model/persistence/BountyMapMarker;ZZ)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->zeroTimerValueBitmapCache:Landroid/util/LruCache;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyMapMarker;->getMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$bitmapDescriptorFlashing$1;

    invoke-direct {v0, p2}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$bitmapDescriptorFlashing$1;-><init>(Lkotlin/Lazy;)V

    invoke-static {p3, p1, v0}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LPT;

    goto :goto_0

    :cond_1
    iget-object p3, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->noTimerValueBitmapCache:Landroid/util/LruCache;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyMapMarker;->getMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetMarker;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$bitmapDescriptorFlashing$2;

    invoke-direct {v0, p2}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$bitmapDescriptorFlashing$2;-><init>(Lkotlin/Lazy;)V

    invoke-static {p3, p1, v0}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LPT;

    :goto_0
    return-object p1
.end method
