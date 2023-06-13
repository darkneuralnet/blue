.class public final LB55$t;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB55;->p1(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lwb4<",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Lco/bird/android/model/Balance;",
        ">;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/RideRequirement;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052>\u0010\u0004\u001a:\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lwb4;",
        "",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/Balance;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/RideRequirement;",
        "a",
        "(Lwb4;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LB55;

.field public final synthetic h:Lco/bird/android/model/wire/configs/Config;

.field public final synthetic i:Z

.field public final synthetic j:Lco/bird/android/model/User;


# direct methods
.method public constructor <init>(LB55;Lco/bird/android/model/wire/configs/Config;ZLco/bird/android/model/User;)V
    .locals 0

    iput-object p1, p0, LB55$t;->g:LB55;

    iput-object p2, p0, LB55$t;->h:Lco/bird/android/model/wire/configs/Config;

    iput-boolean p3, p0, LB55$t;->i:Z

    iput-object p4, p0, LB55$t;->j:Lco/bird/android/model/User;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lwb4;)Lio/reactivex/u;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwb4<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lco/bird/android/model/Balance;",
            ">;)",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/RideRequirement;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lwb4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p1}, Lwb4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Lwb4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {p1}, Lwb4;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/Balance;

    iget-object v3, p0, LB55$t;->g:LB55;

    invoke-static {v3}, LB55;->access$getPaymentMethodManager$p(LB55;)LzN3;

    move-result-object v3

    invoke-interface {v3}, LzN3;->a()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/buava/Optional;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/BirdPayment;

    iget-object v4, p0, LB55$t;->g:LB55;

    invoke-static {v4}, LB55;->access$getPreference$p(LB55;)Lgl;

    move-result-object v4

    invoke-virtual {v4}, Lgl;->v1()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lez v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    invoke-virtual {p1}, Lco/bird/android/model/Balance;->getAutoPayActive()Ljava/lang/Boolean;

    move-result-object v7

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/Balance;->getAutoPayIncentiveAmount()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v6

    :goto_1
    if-lez p1, :cond_2

    move p1, v5

    goto :goto_2

    :cond_2
    move p1, v6

    :goto_2
    iget-object v7, p0, LB55$t;->g:LB55;

    invoke-static {v7}, LB55;->access$getPaymentManagerV3$p(LB55;)LVM3;

    move-result-object v7

    invoke-interface {v7}, LVM3;->i()LZ84;

    move-result-object v7

    invoke-virtual {v7}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/buava/Optional;

    invoke-virtual {v7}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/api/response/ReloadConfigResponse;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lco/bird/api/response/ReloadConfigResponse;->getAutoReloadFromPreload()Lco/bird/api/response/AutoReloadFromPreloadConfig;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lco/bird/api/response/AutoReloadFromPreloadConfig;->getEnabled()Z

    move-result v7

    if-ne v7, v5, :cond_3

    move v7, v5

    goto :goto_3

    :cond_3
    move v7, v6

    :goto_3
    iget-object v8, p0, LB55$t;->h:Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v8}, Lco/bird/android/model/wire/configs/Config;->getEnablePreloadSkipCoupons()Z

    move-result v8

    if-eqz v8, :cond_4

    iget-object v8, p0, LB55$t;->g:LB55;

    invoke-static {v8}, LB55;->access$getPromoManager$p(LB55;)LV74;

    move-result-object v8

    invoke-interface {v8}, LV74;->r()LZ84;

    move-result-object v8

    invoke-virtual {v8}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_4

    move v6, v5

    :cond_4
    iget-object v8, p0, LB55$t;->g:LB55;

    invoke-static {v8}, LB55;->access$getRidePassManager$p(LB55;)LWU4;

    move-result-object v8

    invoke-interface {v8}, LWU4;->F0()LZ84;

    move-result-object v8

    invoke-virtual {v8}, LZ84;->a()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    xor-int/2addr v5, v8

    if-eqz p1, :cond_5

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto/16 :goto_4

    :cond_5
    if-eqz v6, :cond_6

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto/16 :goto_4

    :cond_6
    if-eqz v5, :cond_7

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_4

    :cond_7
    const-string p1, "preloadV2CanSkip"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_4

    :cond_8
    const-string p1, "preloadV2Required"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, Lco/bird/android/model/RideRequirement$PreloadV2;

    invoke-direct {p1, v7}, Lco/bird/android/model/RideRequirement$PreloadV2;-><init>(Z)V

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_4

    :cond_9
    const-string p1, "preloadV2Enabled"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_a

    iget-boolean p1, p0, LB55$t;->i:Z

    if-eqz p1, :cond_a

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_4

    :cond_a
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_b

    if-eqz v4, :cond_b

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_4

    :cond_b
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_c

    new-instance p1, Lco/bird/android/model/RideRequirement$PreloadV2;

    invoke-direct {p1, v7}, Lco/bird/android/model/RideRequirement$PreloadV2;-><init>(Z)V

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_4

    :cond_c
    iget-object p1, p0, LB55$t;->g:LB55;

    iget-object v0, p0, LB55$t;->h:Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    iget-object v1, p0, LB55$t;->j:Lco/bird/android/model/User;

    invoke-static {p1, v0, v1, v3}, LB55;->access$maybeRedirectToAutoPayV2(LB55;Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;Lco/bird/android/model/BirdPayment;)Lio/reactivex/p;

    move-result-object p1

    :goto_4
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwb4;

    invoke-virtual {p0, p1}, LB55$t;->a(Lwb4;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
