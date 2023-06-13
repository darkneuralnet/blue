.class public final Li25$q2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->d8()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;+",
        "Landroid/location/Location;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "Landroid/location/Location;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$q2;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Li25;Lco/bird/android/model/wire/WireBird;Landroid/location/Location;)V
    .locals 0

    invoke-static {p0, p1, p2}, Li25$q2;->b(Li25;Lco/bird/android/model/wire/WireBird;Landroid/location/Location;)V

    return-void
.end method

.method public static final b(Li25;Lco/bird/android/model/wire/WireBird;Landroid/location/Location;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$privateBird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Li25;->J5(Lco/bird/android/model/wire/WireBird;Z)V

    invoke-static {p0}, Li25;->access$getMapUi$p(Li25;)LG95;

    move-result-object p0

    const/4 v0, 0x1

    invoke-interface {p0, p1, p2, v0}, Lco/bird/android/app/feature/map/ui/MapBirdUi;->zoomTo(Lco/bird/android/model/wire/WireBird;Landroid/location/Location;Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Li25$q2;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;+",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/Location;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-eqz v3, :cond_1

    const-string v1, "user has one private bird, attempting to auto select if close enough..."

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    iget-object v1, p0, Li25$q2;->g:Li25;

    invoke-static {v1}, Li25;->access$getReactiveConfig$p(Li25;)LTq4;

    move-result-object v1

    invoke-static {v1, v0}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getPrivateBirdConfig()Lco/bird/android/model/wire/configs/PrivateBirdConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/PrivateBirdConfig;->getMaxDistanceToShowAnnotationMeters()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v3, p0, Li25$q2;->g:Li25;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    sget-object v1, LYw2;->a:LYw2;

    const-string v6, "userLocation"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v6

    invoke-virtual {v1, p1, v6}, LYw2;->d(Landroid/location/Location;Lco/bird/android/model/wire/WireLocation;)F

    move-result v1

    float-to-double v6, v1

    cmpg-double v1, v6, v4

    if-gtz v1, :cond_1

    const-string v1, "user is close enough to private bird, selecting now..."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v3}, Li25;->access$getHandler$p(Li25;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, LD25;

    invoke-direct {v2, v3, v0, p1}, LD25;-><init>(Li25;Lco/bird/android/model/wire/WireBird;Landroid/location/Location;)V

    const-wide/16 v3, 0x3e8

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method
