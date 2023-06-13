.class public final LLQ2$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLQ2;->onBannerShown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
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
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "kotlin.jvm.PlatformType",
        "merchantSiteOptional",
        "",
        "a",
        "(Lco/bird/android/buava/Optional;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LLQ2;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(LLQ2;Z)V
    .locals 0

    iput-object p1, p0, LLQ2$d;->g:LLQ2;

    iput-boolean p2, p0, LLQ2$d;->h:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    iget-object v1, p0, LLQ2$d;->g:LLQ2;

    invoke-static {v1}, LLQ2;->access$getMerchantInfoBannerUi$p(LLQ2;)LPQ2;

    move-result-object v1

    invoke-virtual {v1, v0}, LPQ2;->e(Z)V

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireMerchantSite;

    sget-object v0, LYw2;->a:LYw2;

    iget-object v1, p0, LLQ2$d;->g:LLQ2;

    invoke-static {v1}, LLQ2;->access$getReactiveLocationManager$p(LLQ2;)Ldr4;

    move-result-object v1

    invoke-interface {v1}, Ldr4;->p()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/Location;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LYw2;->d(Landroid/location/Location;Lco/bird/android/model/wire/WireLocation;)F

    move-result v0

    iget-object v1, p0, LLQ2$d;->g:LLQ2;

    invoke-static {v1}, LLQ2;->access$getMerchantInfoBannerUi$p(LLQ2;)LPQ2;

    move-result-object v1

    float-to-double v2, v0

    invoke-virtual {v1, p1, v2, v3}, LPQ2;->d(Lco/bird/android/model/wire/WireMerchantSite;D)V

    iget-object v0, p0, LLQ2$d;->g:LLQ2;

    invoke-static {v0}, LLQ2;->access$getMerchantInfoBannerUi$p(LLQ2;)LPQ2;

    move-result-object v0

    iget-boolean v1, p0, LLQ2$d;->h:Z

    invoke-virtual {v0, v1}, LPQ2;->b(Z)V

    iget-object v0, p0, LLQ2$d;->g:LLQ2;

    invoke-static {v0}, LLQ2;->access$getMerchantInfoBannerUi$p(LLQ2;)LPQ2;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getBirdPayEnabled()Ljava/lang/Boolean;

    move-result-object p1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v0, p1}, LPQ2;->f(Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, LLQ2$d;->a(Lco/bird/android/buava/Optional;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
