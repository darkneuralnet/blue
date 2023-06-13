.class public final LoP3$N;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoP3;->Q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lys;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lys;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lys;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LoP3;


# direct methods
.method public constructor <init>(LoP3;)V
    .locals 0

    iput-object p1, p0, LoP3$N;->g:LoP3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lys;)V
    .locals 8

    invoke-virtual {p1}, Lys;->a()Lco/bird/android/model/Balance;

    move-result-object v0

    invoke-virtual {p1}, Lys;->b()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v1

    invoke-virtual {p1}, Lys;->c()Z

    move-result v2

    invoke-virtual {p1}, Lys;->d()Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/api/response/ReloadConfigResponse;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-static {v3}, LoN3;->a(Lco/bird/api/response/ReloadConfigResponse;)Z

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/api/response/ReloadConfigResponse;

    if-eqz v5, :cond_1

    invoke-static {v5}, LoN3;->b(Lco/bird/api/response/ReloadConfigResponse;)Z

    move-result v5

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayRefillAmount()I

    move-result v1

    const/4 v6, 0x1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lco/bird/android/model/Balance;->getAutoPayRefillAmount()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_2

    :cond_2
    move v1, v4

    :goto_2
    if-lez v1, :cond_3

    move v1, v6

    goto :goto_3

    :cond_3
    move v1, v4

    :goto_3
    if-nez v3, :cond_5

    if-nez v2, :cond_5

    invoke-virtual {v0}, Lco/bird/android/model/Balance;->getAutoPayActive()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v0}, Lco/bird/android/model/Balance;->getAutoPayAskedAt()Lorg/joda/time/DateTime;

    move-result-object v3

    if-eqz v3, :cond_4

    if-eqz v1, :cond_4

    goto :goto_4

    :cond_4
    move v1, v4

    goto :goto_5

    :cond_5
    :goto_4
    move v1, v6

    :goto_5
    if-nez v5, :cond_8

    invoke-virtual {v0}, Lco/bird/android/model/Balance;->getAutoPayActive()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lco/bird/android/model/Balance;->getAutoPayRefillAmount()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_6

    :cond_6
    move v0, v4

    :goto_6
    if-lez v0, :cond_7

    goto :goto_7

    :cond_7
    move v0, v4

    goto :goto_8

    :cond_8
    :goto_7
    move v0, v6

    :goto_8
    if-eqz v1, :cond_9

    iget-object v3, p0, LoP3$N;->g:LoP3;

    invoke-static {v3}, LoP3;->access$getUi$p(LoP3;)LCP3;

    move-result-object v3

    invoke-interface {v3, v0}, LCP3;->S7(Z)V

    :cond_9
    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/ReloadConfigResponse;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lco/bird/api/response/ReloadConfigResponse;->getAutoReload()Lco/bird/api/response/AutoReloadConfig;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lco/bird/api/response/AutoReloadConfig;->getEnabled()Z

    move-result p1

    if-ne p1, v6, :cond_a

    move v4, v6

    :cond_a
    if-eqz v4, :cond_b

    sget-object p1, Lvs;->d:Lvs;

    goto :goto_9

    :cond_b
    if-eqz v2, :cond_c

    sget-object p1, Lvs;->c:Lvs;

    goto :goto_9

    :cond_c
    sget-object p1, Lvs;->b:Lvs;

    :goto_9
    iget-object v2, p0, LoP3$N;->g:LoP3;

    invoke-static {v2}, LoP3;->access$getAutoPayEnabled$p(LoP3;)La94;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v2, v0}, La94;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, LoP3$N;->g:LoP3;

    invoke-static {v0}, LoP3;->access$getAutoPayVersion$p(LoP3;)La94;

    move-result-object v0

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, LoP3$N;->g:LoP3;

    invoke-static {p1}, LoP3;->access$getUi$p(LoP3;)LCP3;

    move-result-object p1

    invoke-interface {p1, v1}, LCP3;->pg(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lys;

    invoke-virtual {p0, p1}, LoP3$N;->a(Lys;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
