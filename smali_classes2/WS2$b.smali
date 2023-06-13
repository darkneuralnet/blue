.class public final LWS2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWS2;->handleResult(LbN4;)V
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
        "LbT2;",
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
        "LbT2;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
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
.field public final synthetic g:LWS2;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lkotlin/jvm/internal/Ref$BooleanRef;


# direct methods
.method public constructor <init>(LWS2;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/Ref$BooleanRef;)V
    .locals 0

    iput-object p1, p0, LWS2$b;->g:LWS2;

    iput-object p2, p0, LWS2$b;->h:Ljava/lang/String;

    iput-object p3, p0, LWS2$b;->i:Ljava/lang/String;

    iput-object p4, p0, LWS2$b;->j:Lkotlin/jvm/internal/Ref$BooleanRef;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "LbT2;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbT2;

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v1

    const-string v2, "raw"

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LbT2;->b()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, LWS2$b;->g:LWS2;

    const/4 v4, 0x1

    iget-object v5, p0, LWS2$b;->h:Ljava/lang/String;

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, LbT2;->b()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantSite;->getMerchant()Lco/bird/android/model/wire/WireMerchantDescription;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantDescription;->getId()Ljava/lang/String;

    move-result-object v6

    iget-object v8, p0, LWS2$b;->i:Ljava/lang/String;

    move-object v7, p1

    invoke-static/range {v3 .. v8}, LWS2;->access$trackScan(LWS2;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LWS2$b;->g:LWS2;

    invoke-static {v0}, LWS2;->access$getBirdPayManager$p(LWS2;)LiO;

    move-result-object v0

    invoke-interface {v0}, LiO;->e()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireMerchantSite;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantSite;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LWS2$b;->j:Lkotlin/jvm/internal/Ref$BooleanRef;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    iget-object v0, p0, LWS2$b;->g:LWS2;

    invoke-static {v0}, LWS2;->access$getNavigator$p(LWS2;)Le13;

    move-result-object v3

    iget-object v5, p0, LWS2$b;->i:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v4, p1

    invoke-static/range {v3 .. v8}, Le13$a;->goToMerchantPay$default(Le13;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    iget-object p1, p0, LWS2$b;->g:LWS2;

    invoke-static {p1}, LWS2;->access$getNavigator$p(LWS2;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    goto :goto_2

    :cond_0
    iget-object p1, p0, LWS2$b;->g:LWS2;

    invoke-static {p1}, LWS2;->access$getUi$p(LWS2;)LcT2;

    move-result-object p1

    sget v0, Lnl4;->merchant_scan_incorrect:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    goto :goto_2

    :cond_1
    iget-object v1, p0, LWS2$b;->g:LWS2;

    const/4 v3, 0x1

    iget-object v4, p0, LWS2$b;->h:Ljava/lang/String;

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LbT2;->b()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireMerchantSite;->getMerchant()Lco/bird/android/model/wire/WireMerchantDescription;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireMerchantDescription;->getId()Ljava/lang/String;

    move-result-object v2

    move-object v5, v2

    goto :goto_0

    :cond_2
    move-object v5, v7

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, LbT2;->b()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantSite;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v7

    :goto_1
    iget-object v6, p0, LWS2$b;->i:Ljava/lang/String;

    move v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v0

    invoke-static/range {v1 .. v6}, LWS2;->access$trackScan(LWS2;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LWS2$b;->g:LWS2;

    invoke-static {v0}, LWS2;->access$getUi$p(LWS2;)LcT2;

    move-result-object v0

    const-string v1, "response"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LNM4;->d(LHM4;)Ltg1;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ltg1;->c()Ljava/lang/String;

    move-result-object v7

    :cond_4
    invoke-interface {v0, v7}, LaM5;->error(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LWS2$b;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
