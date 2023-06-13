.class public final LFP4$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFP4;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/RidePassView;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "ridePassViewList",
        "",
        "Lco/bird/android/model/persistence/RidePassView;",
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
.field public final synthetic g:LFP4;


# direct methods
.method public constructor <init>(LFP4;)V
    .locals 0

    iput-object p1, p0, LFP4$n;->g:LFP4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LFP4$n;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LFP4$n;->g:LFP4;

    const-string v1, "ridePassViewList"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LFP4$n;->g:LFP4;

    invoke-static {v1}, LFP4;->access$getReactiveConfig$p(LFP4;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getRidePass()Lco/bird/android/model/wire/configs/RidePassConfig;

    move-result-object v1

    invoke-static {v0, p1, v1}, LFP4;->access$shouldEnableBanner(LFP4;Ljava/util/List;Lco/bird/android/model/wire/configs/RidePassConfig;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LFP4$n;->g:LFP4;

    invoke-static {p1}, LFP4;->access$getFlightBannerCoordinatorPresenter$p(LFP4;)LZr1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RIDE_PASS:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v0}, LZr1;->M1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LFP4$n;->g:LFP4;

    invoke-static {p1}, LFP4;->access$getFlightBannerCoordinatorPresenter$p(LFP4;)LZr1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RIDE_PASS:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v0}, LZr1;->N1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    :goto_0
    return-void
.end method
