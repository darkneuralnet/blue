.class public final Lco/bird/android/feature/rider/birdpay/confirmation/e$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/birdpay/confirmation/e;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "kotlin.jvm.PlatformType",
        "merchantSite",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireMerchantSite;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

.field public final synthetic h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/birdpay/confirmation/e;Lco/bird/android/feature/rider/birdpay/confirmation/e$b;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$f;->g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

    iput-object p2, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$f;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireMerchantSite;)V
    .locals 6

    sget-object v0, Lxx1;->a:Lxx1;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getCity()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getState()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getCountry()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getZip()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lxx1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$f;->g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

    invoke-static {v1}, Lco/bird/android/feature/rider/birdpay/confirmation/e;->access$getUi$p(Lco/bird/android/feature/rider/birdpay/confirmation/e;)LcM3;

    move-result-object v1

    const-string v2, "merchantSite"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1, v0}, LcM3;->Pj(Lco/bird/android/model/wire/WireMerchantSite;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$f;->g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

    invoke-static {v0}, Lco/bird/android/feature/rider/birdpay/confirmation/e;->access$getUi$p(Lco/bird/android/feature/rider/birdpay/confirmation/e;)LcM3;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$f;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {v1}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getTipSettings()Lco/bird/android/model/wire/WireMerchantSite$TipSettings;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, LcM3;->va(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireMerchantSite;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/confirmation/e$f;->a(Lco/bird/android/model/wire/WireMerchantSite;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
