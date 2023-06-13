.class public final Lco/bird/android/feature/rider/birdpay/input/d$J;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/birdpay/input/d;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "b",
        "(LHM4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/rider/birdpay/input/d;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/birdpay/input/d;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$J;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/feature/rider/birdpay/input/d;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/rider/birdpay/input/d$J;->c(Lco/bird/android/feature/rider/birdpay/input/d;)V

    return-void
.end method

.method public static final c(Lco/bird/android/feature/rider/birdpay/input/d;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getMerchantSiteSubject$p(Lco/bird/android/feature/rider/birdpay/input/d;)LAG;

    move-result-object p0

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p0, v0}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(LHM4;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireMerchantSite;

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$J;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {p1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getMerchantSiteSubject$p(Lco/bird/android/feature/rider/birdpay/input/d;)LAG;

    move-result-object p1

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1, v0}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, LAG;->accept(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/input/d$J;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getUi$p(Lco/bird/android/feature/rider/birdpay/input/d;)LbO;

    move-result-object v0

    const-string v1, "response"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LNM4;->d(LHM4;)Ltg1;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ltg1;->c()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, LaM5;->error(Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$J;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {p1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getHandler$p(Lco/bird/android/feature/rider/birdpay/input/d;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/input/d$J;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    new-instance v1, LZN;

    invoke-direct {v1, v0}, LZN;-><init>(Lco/bird/android/feature/rider/birdpay/input/d;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/input/d$J;->b(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
