.class public final LJO$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJO;->v()V
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
        "Lco/bird/android/model/wire/WireMerchantSite;",
        ">;+",
        "Landroid/location/Location;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007 \u0006*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "kotlin.jvm.PlatformType",
        "Landroid/location/Location;",
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
.field public final synthetic g:LJO;


# direct methods
.method public constructor <init>(LJO;)V
    .locals 0

    iput-object p1, p0, LJO$f;->g:LJO;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LJO$f;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
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

    iget-object v1, p0, LJO$f;->g:LJO;

    const-string v2, "merchantSites"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, LJO;->access$trackMapMerchant(LJO;Ljava/util/List;)V

    iget-object v1, p0, LJO$f;->g:LJO;

    invoke-static {v1}, LJO;->access$getMapUi$p(LJO;)Lco/bird/android/app/feature/map/ui/MapBirdUi;

    move-result-object v1

    invoke-interface {v1, v0}, Lco/bird/android/app/feature/map/ui/MapUi;->setMerchantSites(Ljava/util/List;)V

    iget-object v0, p0, LJO$f;->g:LJO;

    invoke-static {v0}, LJO;->access$getReactiveConfig$p(LJO;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getBirdPayConfig()Lco/bird/android/model/wire/configs/BirdPayConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/BirdPayConfig;->getBannerProminenceThreshold()Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, LJO$f;->g:LJO;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    invoke-static {v2}, LJO;->access$getBirdPayManager$p(LJO;)LiO;

    move-result-object v0

    const-string v5, "userLocation"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LiO$a;->b:LiO$a;

    invoke-interface {v0, p1, v5, v3, v4}, LiO;->c(Landroid/location/Location;LiO$a;D)Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {v2}, LJO;->access$getBirdPayManager$p(LJO;)LiO;

    move-result-object v0

    invoke-interface {v0, p1}, LiO;->d(Lco/bird/android/model/wire/WireMerchantSite;)V

    invoke-static {v2}, LJO;->access$getFlightBannerCoordinatorPresenter$p(LJO;)LZr1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;->MERCHANT_SITE_INFO:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v0}, LZr1;->M1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    const/4 v1, 0x1

    :cond_0
    if-nez v1, :cond_1

    iget-object p1, p0, LJO$f;->g:LJO;

    invoke-static {p1}, LJO;->access$getFlightBannerCoordinatorPresenter$p(LJO;)LZr1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;->MERCHANT_SITE_INFO:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v0}, LZr1;->N1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    :cond_1
    return-void
.end method
