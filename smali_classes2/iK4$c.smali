.class public final LiK4$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiK4;->onBannerShown()V
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
        "Lco/bird/android/widget/ReservationBannerView$a;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/RideRequirement;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/widget/ReservationBannerView$a;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/wire/WireBird;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/RideRequirement;",
        "c",
        "(Lkotlin/Pair;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nReservationBannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReservationBannerPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/ReservationBannerPresenterImpl$onBannerShown$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LiK4;


# direct methods
.method public constructor <init>(LiK4;)V
    .locals 0

    iput-object p1, p0, LiK4$c;->g:LiK4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LiK4$c;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, LiK4$c;->d(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lkotlin/Pair;)Lio/reactivex/u;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Lco/bird/android/widget/ReservationBannerView$a;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;)",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/RideRequirement;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    iget-object v0, p0, LiK4$c;->g:LiK4;

    invoke-static {v0}, LiK4;->access$getConfigForCurrentBird(LiK4;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBird;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getExternalFeedType()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "zigzag"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getZigzagConfig()Lco/bird/android/model/wire/configs/ZigZagConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/ZigZagConfig;->getEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getZigzagConfig()Lco/bird/android/model/wire/configs/ZigZagConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/ZigZagConfig;->getDeeplinkUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getZigzagConfig()Lco/bird/android/model/wire/configs/ZigZagConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ZigZagConfig;->getDeeplinkUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, LiK4$c;->g:LiK4;

    invoke-static {v0}, LiK4;->access$getNavigator$p(LiK4;)Le13;

    move-result-object v0

    invoke-interface {v0, p1}, Le13;->g0(Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_1

    :cond_2
    iget-object v0, p0, LiK4$c;->g:LiK4;

    invoke-static {v0}, LiK4;->access$getRequirementPresenter$p(LiK4;)LsJ4;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lco/bird/android/model/wire/WireBird;

    sget-object v3, Lco/bird/android/model/constant/RideRequirementReason;->RESERVATION:Lco/bird/android/model/constant/RideRequirementReason;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LsJ4$a;->checkRequirements$default(LsJ4;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/RideRequirementReason;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/p;->I(Lio/reactivex/E;)Lio/reactivex/p;

    move-result-object p1

    new-instance v0, LiK4$c$a;

    iget-object v1, p0, LiK4$c;->g:LiK4;

    invoke-direct {v0, v1}, LiK4$c$a;-><init>(LiK4;)V

    new-instance v1, LjK4;

    invoke-direct {v1, v0}, LjK4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->r(Lio/reactivex/functions/g;)Lio/reactivex/p;

    move-result-object p1

    new-instance v0, LiK4$c$b;

    iget-object v1, p0, LiK4$c;->g:LiK4;

    invoke-direct {v0, v1}, LiK4$c$b;-><init>(LiK4;)V

    new-instance v1, LkK4;

    invoke-direct {v1, v0}, LkK4;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->q(Lio/reactivex/functions/b;)Lio/reactivex/p;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LiK4$c;->c(Lkotlin/Pair;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
