.class public final LzC5$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LzC5;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LRe4<",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;+",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
        ">;+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\t\u001a\u00020\u00082r\u0010\u0007\u001an\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006 \u0004*6\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "LRe4;",
        "",
        "LH6;",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
        "",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(LRe4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LzC5;


# direct methods
.method public constructor <init>(LzC5;)V
    .locals 0

    iput-object p1, p0, LzC5$h;->g:LzC5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LRe4;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRe4<",
            "+",
            "Ljava/util/List<",
            "LH6;",
            ">;",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LRe4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, LRe4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireSkuOrder;

    invoke-virtual {p1}, LRe4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-virtual {p1}, LRe4;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {p1}, LRe4;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v4, p0, LzC5$h;->g:LzC5;

    invoke-static {v4}, LzC5;->access$getUi$p(LzC5;)LCC5;

    move-result-object v4

    const-string v5, "sections"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, LCC5;->b(Ljava/util/List;)V

    iget-object v0, p0, LzC5$h;->g:LzC5;

    invoke-static {v0}, LzC5;->access$getUi$p(LzC5;)LCC5;

    move-result-object v0

    invoke-virtual {v0, v3}, LCC5;->Wl(Z)V

    iget-object v0, p0, LzC5$h;->g:LzC5;

    invoke-static {v0}, LzC5;->access$getUi$p(LzC5;)LCC5;

    move-result-object v0

    invoke-virtual {v0, p1}, LCC5;->Xl(Z)V

    iget-object p1, p0, LzC5$h;->g:LzC5;

    invoke-static {p1}, LzC5;->access$getTransferOrderManager$p(LzC5;)LO86;

    move-result-object p1

    const-string v0, "skuOrder"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1}, LO86;->q(Lco/bird/android/model/wire/WireSkuOrder;)Z

    move-result p1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireTransferOrder;->getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    sget-object v4, Lco/bird/android/model/constant/TransferOrderDemandSource;->SCRAP_REMOVAL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    if-ne v0, v4, :cond_4

    iget-object p1, p0, LzC5$h;->g:LzC5;

    invoke-static {p1}, LzC5;->access$getUi$p(LzC5;)LCC5;

    move-result-object p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireSkuOrder;->getContainerOrder()Lco/bird/android/model/wire/WireContainerOrder;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireContainerOrder;->getBooked()Z

    move-result v4

    if-ne v4, v2, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireSkuOrder;->getContainerOrder()Lco/bird/android/model/wire/WireContainerOrder;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireContainerOrder;->getStatus()Lco/bird/android/model/constant/ContainerOrderStatus;

    move-result-object v3

    :cond_2
    sget-object v1, Lco/bird/android/model/constant/ContainerOrderStatus;->RECEIVED:Lco/bird/android/model/constant/ContainerOrderStatus;

    if-eq v3, v1, :cond_3

    goto :goto_2

    :cond_3
    move v2, v5

    :goto_2
    invoke-virtual {p1, v0, v4, v2}, LCC5;->Vl(ZZZ)V

    goto :goto_3

    :cond_4
    if-eqz p1, :cond_5

    iget-object p1, p0, LzC5$h;->g:LzC5;

    invoke-static {p1}, LzC5;->access$getUi$p(LzC5;)LCC5;

    move-result-object p1

    invoke-virtual {p1}, LCC5;->Ul()V

    goto :goto_3

    :cond_5
    iget-object p1, p0, LzC5$h;->g:LzC5;

    invoke-static {p1}, LzC5;->access$getUi$p(LzC5;)LCC5;

    move-result-object p1

    invoke-virtual {p1}, LCC5;->Tl()V

    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LRe4;

    invoke-virtual {p0, p1}, LzC5$h;->a(LRe4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
