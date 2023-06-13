.class public final LzC5$k;
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
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "kotlin.jvm.PlatformType",
        "skuOrder",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireSkuOrder;)V"
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

    iput-object p1, p0, LzC5$k;->g:LzC5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireSkuOrder;)V
    .locals 4

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireTransferOrder;->getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lco/bird/android/model/constant/TransferOrderDemandSource;->SCRAP_REMOVAL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    if-ne v0, v1, :cond_1

    iget-object p1, p0, LzC5$k;->g:LzC5;

    invoke-static {p1}, LzC5;->access$getNavigator$p(LzC5;)Le13;

    move-result-object p1

    iget-object v0, p0, LzC5$k;->g:LzC5;

    invoke-static {v0}, LzC5;->access$getSkuId$p(LzC5;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x274a

    invoke-interface {p1, v0, v1}, Le13;->s(Ljava/lang/String;I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LzC5$k;->g:LzC5;

    invoke-static {v0}, LzC5;->access$getNavigator$p(LzC5;)Le13;

    move-result-object v0

    iget-object v1, p0, LzC5$k;->g:LzC5;

    invoke-static {v1}, LzC5;->access$getSkuId$p(LzC5;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LzC5$k;->g:LzC5;

    invoke-static {v2}, LzC5;->access$getTransferOrderManager$p(LzC5;)LO86;

    move-result-object v2

    const-string v3, "skuOrder"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, p1}, LO86;->q(Lco/bird/android/model/wire/WireSkuOrder;)Z

    move-result p1

    invoke-interface {v0, v1, p1}, Le13;->M0(Ljava/lang/String;Z)V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireSkuOrder;

    invoke-virtual {p0, p1}, LzC5$k;->a(Lco/bird/android/model/wire/WireSkuOrder;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
