.class public final LrS$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LrS;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/DialogResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/DialogResponse;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)Lio/reactivex/K;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireRidePrice;

.field public final synthetic h:LrS;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireRidePrice;LrS;)V
    .locals 0

    iput-object p1, p0, LrS$a;->g:Lco/bird/android/model/wire/WireRidePrice;

    iput-object p2, p0, LrS$a;->h:LrS;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Unit;)Lio/reactivex/K;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LrS$a;->g:Lco/bird/android/model/wire/WireRidePrice;

    if-nez p1, :cond_0

    iget-object p1, p0, LrS$a;->h:LrS;

    invoke-virtual {p1}, LrS;->e()LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-static {p1}, LFv0;->a(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/WireRidePrice;

    move-result-object p1

    :cond_0
    iget-object v0, p0, LrS$a;->h:LrS;

    invoke-virtual {v0}, LrS;->f()LsS;

    move-result-object v0

    sget v1, Lnl4;->payment_quick_deposit_promos_text:I

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v3}, LsS;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LrS$a;->h:LrS;

    invoke-virtual {v1}, LrS;->e()LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getFraudConfig()Lco/bird/android/model/wire/configs/FraudConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/FraudConfig;->getAuthChargeAmount()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v3, p0, LrS$a;->h:LrS;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-virtual {v3}, LrS;->f()LsS;

    move-result-object v1

    sget v6, Lnl4;->payment_quick_deposit_title:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    sget-object v8, Lxx1;->a:Lxx1;

    invoke-virtual {v3}, LrS;->e()LTq4;

    move-result-object v3

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v3

    sget-object v9, LUx1;->d:LUx1;

    invoke-virtual {v8, v4, v5, v3, v9}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v7, v2

    invoke-interface {v1, v6, v7}, LsS;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LrS$a;->h:LrS;

    invoke-virtual {v2}, LrS;->f()LsS;

    move-result-object v2

    invoke-interface {v2, p1, v0, v1}, LsS;->af(Lco/bird/android/model/wire/WireRidePrice;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LrS$a;->invoke(Lkotlin/Unit;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
