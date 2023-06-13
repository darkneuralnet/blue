.class public final Lco/bird/android/feature/rider/birdpay/input/d$w;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/birdpay/input/d;->V()V
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
        "Ljava/lang/Integer;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        ">;+",
        "Ljava/lang/Double;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00020\u000224\u0010\u0006\u001a0\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00050\u00050\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Triple;",
        "",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "kotlin.jvm.PlatformType",
        "",
        "<name for destructuring parameter 0>",
        "a",
        "(Lkotlin/Triple;)Lco/bird/android/buava/Optional;"
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

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$w;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)Lco/bird/android/buava/Optional;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Ljava/lang/Integer;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ">;",
            "Ljava/lang/Double;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireMerchantSite;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireMerchantSite;->getTipSettings()Lco/bird/android/model/wire/WireMerchantSite$TipSettings;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    iget-object v3, p0, Lco/bird/android/feature/rider/birdpay/input/d$w;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    const-string v4, "inputAmount"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {v3, v4, v5, v0, v1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$calculateTip(Lco/bird/android/feature/rider/birdpay/input/d;DILco/bird/android/model/wire/WireMerchantSite$TipSettings;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, p1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    goto :goto_2

    :cond_2
    :goto_1
    sget-object p1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p1

    :goto_2
    iget-object v2, p0, Lco/bird/android/feature/rider/birdpay/input/d$w;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v2, v0, v1, p1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$trackTipSettingsSelected(Lco/bird/android/feature/rider/birdpay/input/d;ILco/bird/android/model/wire/WireMerchantSite$TipSettings;Lco/bird/android/buava/Optional;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/input/d$w;->a(Lkotlin/Triple;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
