.class public final Lfj3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcj3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\t\u001a\u00020\u0004H\u0016J\u000c\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lfj3;",
        "Lcj3;",
        "",
        "skuOrderId",
        "Lio/reactivex/c;",
        "n",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/SkuOrder;",
        "D0",
        "clear",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "",
        "M1",
        "Lh86;",
        "a",
        "Lh86;",
        "client",
        "Lri3;",
        "b",
        "Lri3;",
        "operatorAllocationDao",
        "<init>",
        "(Lh86;Lri3;)V",
        "co.bird.android.repository.operator-order-view"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorAllocationRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorAllocationRepositoryImpl.kt\nco/bird/android/repository/operatorallocation/OperatorAllocationRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1726#2,3:56\n*S KotlinDebug\n*F\n+ 1 OperatorAllocationRepositoryImpl.kt\nco/bird/android/repository/operatorallocation/OperatorAllocationRepositoryImpl\n*L\n50#1:56,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lh86;

.field public final b:Lri3;


# direct methods
.method public constructor <init>(Lh86;Lri3;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operatorAllocationDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfj3;->a:Lh86;

    iput-object p2, p0, Lfj3;->b:Lri3;

    return-void
.end method

.method public static synthetic J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lfj3;->L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final synthetic access$getOperatorAllocationDao$p(Lfj3;)Lri3;
    .locals 0

    iget-object p0, p0, Lfj3;->b:Lri3;

    return-object p0
.end method

.method public static final synthetic access$isFmAllocation(Lfj3;Lco/bird/android/model/wire/WireSkuOrder;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lfj3;->M1(Lco/bird/android/model/wire/WireSkuOrder;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public D0(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/SkuOrder;",
            ">;"
        }
    .end annotation

    const-string v0, "skuOrderId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfj3;->b:Lri3;

    invoke-virtual {v0, p1}, Lri3;->c(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lfj3;->K1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public K1(Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcj3$a;->a(Lcj3;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public final M1(Lco/bird/android/model/wire/WireSkuOrder;)Z
    .locals 6

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getOriginFleet()Lco/bird/android/model/wire/WireFleet;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    const/4 v4, 0x1

    aput-object v1, v0, v4

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getDestinationFleet()Lco/bird/android/model/wire/WireFleet;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    const/4 v5, 0x2

    aput-object v1, v0, v5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v3

    :goto_2
    const/4 v5, 0x3

    aput-object v1, v0, v5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireTransferOrder;->getOriginWarehouse()Lco/bird/android/model/wire/WireWarehouse;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v3

    :goto_3
    const/4 v5, 0x4

    aput-object v1, v0, v5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireTransferOrder;->getDestinationWarehouse()Lco/bird/android/model/wire/WireWarehouse;

    move-result-object v1

    goto :goto_4

    :cond_4
    move-object v1, v3

    :goto_4
    const/4 v5, 0x5

    aput-object v1, v0, v5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireTransferOrder;->getTargetDeliveryDate()Lorg/joda/time/DateTime;

    move-result-object v3

    :cond_5
    const/4 p1, 0x6

    aput-object v3, v0, p1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    move v2, v4

    goto :goto_6

    :cond_7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_9

    move v0, v4

    goto :goto_5

    :cond_9
    move v0, v2

    :goto_5
    if-nez v0, :cond_8

    :goto_6
    return v2
.end method

.method public clear()Lio/reactivex/c;
    .locals 1

    iget-object v0, p0, Lfj3;->b:Lri3;

    invoke-virtual {v0}, Lri3;->a()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public n(Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "skuOrderId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfj3;->a:Lh86;

    invoke-interface {v0, p1}, Lh86;->m(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lfj3$a;

    invoke-direct {v0, p0}, Lfj3$a;-><init>(Lfj3;)V

    new-instance v1, Ldj3;

    invoke-direct {v1, v0}, Ldj3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun fetchOperat\u2026er)\n        }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
