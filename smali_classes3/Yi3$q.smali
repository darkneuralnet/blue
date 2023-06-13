.class public final LYi3$q;
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
        "Lco/bird/android/model/wire/WireSkuScannedItems;",
        "+",
        "Lco/bird/android/model/persistence/SkuOrder;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0005*\u0018\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/WireSkuScannedItems;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorAllocationDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorAllocationDetailsPresenter.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsPresenter$consume$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1774#2,4:175\n*S KotlinDebug\n*F\n+ 1 OperatorAllocationDetailsPresenter.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsPresenter$consume$2\n*L\n52#1:175,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LYi3;


# direct methods
.method public constructor <init>(LYi3;)V
    .locals 0

    iput-object p1, p0, LYi3$q;->g:LYi3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LYi3$q;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireSkuScannedItems;",
            "Lco/bird/android/model/persistence/SkuOrder;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireSkuScannedItems;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/SkuOrder;

    iget-object v1, p0, LYi3$q;->g:LYi3;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireSkuScannedItems;->getSuccessfulScannedItems()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireSkuScannedItems;->getFailedScannedItems()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v1, p1, v2, v3}, LYi3;->access$setScanButton(LYi3;Lco/bird/android/model/persistence/SkuOrder;Ljava/util/List;I)V

    iget-object v1, p0, LYi3$q;->g:LYi3;

    invoke-static {p1}, Lco/bird/android/model/persistence/SkuOrderKt;->isInbound(Lco/bird/android/model/persistence/SkuOrder;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireSkuScannedItems;->getSuccessfulScannedItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v3

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/SkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/constant/SkuOrderStatus;->isClosed()Z

    move-result v2

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireSkuScannedItems;->getSuccessfulScannedItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v5, v0, Ljava/util/Collection;

    if-eqz v5, :cond_1

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v4

    goto :goto_2

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v5, v4

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/wire/WireSuccessfulScannedItem;

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireSuccessfulScannedItem;->getReceived()Z

    move-result v6

    if-eqz v6, :cond_2

    add-int/lit8 v5, v5, 0x1

    if-gez v5, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_1

    :cond_3
    :goto_2
    invoke-virtual {p1}, Lco/bird/android/model/persistence/SkuOrder;->getQuantity()I

    move-result p1

    if-ge v5, p1, :cond_4

    goto :goto_3

    :cond_4
    move v3, v4

    :goto_3
    new-instance p1, Lnx5;

    invoke-direct {p1, v2, v3}, Lnx5;-><init>(ZZ)V

    invoke-virtual {v1, p1}, Lf1;->h(Ljava/lang/Object;)V

    return-void
.end method
