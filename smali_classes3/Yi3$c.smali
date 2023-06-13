.class public final LYi3$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYi3;->M(Lbj3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Lco/bird/android/model/persistence/SkuOrder;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/persistence/SkuOrder;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LYi3;


# direct methods
.method public constructor <init>(LYi3;)V
    .locals 0

    iput-object p1, p0, LYi3$c;->g:LYi3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LYi3$c;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lco/bird/android/model/persistence/SkuOrder;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/SkuOrder;

    const-string v1, "completed"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYi3$c;->g:LYi3;

    new-instance v1, LuA5;

    const-string v2, "skuOrder"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lco/bird/android/model/persistence/SkuOrderKt;->isInbound(Lco/bird/android/model/persistence/SkuOrder;)Z

    move-result v2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->getDestinationWarehouse()Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/Warehouse;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getDestinationFleet()Lco/bird/android/model/persistence/nestedstructures/Fleet;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/Fleet;->getName()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getDestinationFleet()Lco/bird/android/model/persistence/nestedstructures/Fleet;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/Fleet;->getPartnerId()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    const-string v4, ""

    :cond_0
    invoke-direct {v1, v2, v3, v4}, LuA5;-><init>(ZLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    iget-object p1, p0, LYi3$c;->g:LYi3;

    sget-object v0, LKM1;->a:LKM1;

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
