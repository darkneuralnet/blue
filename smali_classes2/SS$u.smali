.class public final LSS$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSS;->i0(Ljava/lang/String;Ljava/lang/String;)V
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
.field public final synthetic g:LSS;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(LSS;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LSS$u;->g:LSS;

    iput-object p2, p0, LSS$u;->h:Ljava/lang/String;

    iput-object p3, p0, LSS$u;->i:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 8
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

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LbT2;->b()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, LSS$u;->g:LSS;

    const/4 v2, 0x1

    iget-object v3, p0, LSS$u;->h:Ljava/lang/String;

    invoke-virtual {v0}, LbT2;->b()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantSite;->getMerchant()Lco/bird/android/model/wire/WireMerchantDescription;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantDescription;->getId()Ljava/lang/String;

    move-result-object v4

    iget-object v6, p0, LSS$u;->i:Ljava/lang/String;

    move-object v5, p1

    invoke-static/range {v1 .. v6}, LSS;->access$trackScan(LSS;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LSS$u;->g:LSS;

    invoke-static {v0}, LSS;->access$getNavigator$p(LSS;)Le13;

    move-result-object v0

    iget-object v1, p0, LSS$u;->i:Ljava/lang/String;

    invoke-interface {v0, p1, v1, v2}, Le13;->O3(Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object p1, p0, LSS$u;->g:LSS;

    invoke-static {p1}, LSS;->access$getNavigator$p(LSS;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    goto :goto_2

    :cond_0
    iget-object v1, p0, LSS$u;->g:LSS;

    const/4 v2, 0x1

    iget-object v3, p0, LSS$u;->h:Ljava/lang/String;

    const/4 v6, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LbT2;->b()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireMerchantSite;->getMerchant()Lco/bird/android/model/wire/WireMerchantDescription;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireMerchantDescription;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v6

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LbT2;->b()Lco/bird/android/model/wire/WireMerchantSite;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantSite;->getId()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    goto :goto_1

    :cond_2
    move-object v5, v6

    :goto_1
    iget-object v7, p0, LSS$u;->i:Ljava/lang/String;

    move-object v0, v1

    move v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v7

    invoke-static/range {v0 .. v5}, LSS;->access$trackScan(LSS;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LSS$u;->g:LSS;

    invoke-static {v0}, LSS;->access$getUi$p(LSS;)LZS;

    move-result-object v0

    const-string v1, "response"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LNM4;->d(LHM4;)Ltg1;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ltg1;->c()Ljava/lang/String;

    move-result-object v6

    :cond_3
    invoke-interface {v0, v6}, LaM5;->error(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LSS$u;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
