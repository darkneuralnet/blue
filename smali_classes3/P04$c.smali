.class public final LP04$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP04;->C(LQ04;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/api/response/ReloadConfigResponse;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/constant/PaymentMethod;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/constant/PaymentMethod;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u00072V\u0010\u0006\u001aR\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*(\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/api/response/ReloadConfigResponse;",
        "",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LP04;

.field public final synthetic h:LQ04;


# direct methods
.method public constructor <init>(LP04;LQ04;)V
    .locals 0

    iput-object p1, p0, LP04$c;->g:LP04;

    iput-object p2, p0, LP04$c;->h:LQ04;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/api/response/ReloadConfigResponse;",
            ">;+",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/PaymentMethod;",
            ">;+",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/PaymentMethod;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/util/List;

    iget-object p1, p0, LP04$c;->g:LP04;

    invoke-static {p1}, LP04;->access$getReactiveConfig$p(LP04;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getFraudConfig()Lco/bird/android/model/wire/configs/FraudConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/FraudConfig;->getAuthChargeAmount()Ljava/lang/Long;

    move-result-object p1

    iget-object v1, p0, LP04$c;->g:LP04;

    invoke-static {v1}, LP04;->access$getReactiveConfig$p(LP04;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v1

    iget-object v9, p0, LP04$c;->g:LP04;

    new-instance v10, LEo6;

    invoke-static {v9}, LP04;->access$getReactiveConfig$p(LP04;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getLocalizedDynamicPriceString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/api/response/ReloadConfigResponse;

    const/4 v6, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lco/bird/api/response/ReloadConfigResponse;->getPreload()Lco/bird/api/response/PreloadConfig;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lco/bird/api/response/PreloadConfig;->getMaxIncentiveText()Ljava/lang/String;

    move-result-object v2

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object v7, v6

    :goto_0
    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/api/response/ReloadConfigResponse;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lco/bird/api/response/ReloadConfigResponse;->getPreload()Lco/bird/api/response/PreloadConfig;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lco/bird/api/response/PreloadConfig;->getMaxIncentiveSubtext()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v6

    :goto_1
    iget-object v2, p0, LP04$c;->h:LQ04;

    invoke-interface {v2, p1, v1}, LQ04;->J2(Ljava/lang/Long;Ljava/util/Currency;)Ljava/lang/String;

    move-result-object v8

    move-object v2, v10

    move-object v6, v7

    move-object v7, v0

    invoke-direct/range {v2 .. v8}, LEo6;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v10}, Lf1;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LP04$c;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
