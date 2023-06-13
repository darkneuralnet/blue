.class public final Lhp3$m$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhp3$m;->b(LIO5;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhp3$m$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        "Lco/bird/android/model/wire/WireSkuScannedItems;",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        "orderView",
        "Lco/bird/android/model/wire/WireSkuScannedItems;",
        "scannedItem",
        "a",
        "(Lco/bird/android/model/persistence/OperatorOrderView;Lco/bird/android/model/wire/WireSkuScannedItems;)Lco/bird/android/model/persistence/OperatorOrderView;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorOrderDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsPresenter.kt\nco/bird/android/feature/transferorder/operator/details/OperatorOrderDetailsPresenter$consume$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,162:1\n2624#2,3:163\n1747#2,3:166\n2624#2,3:169\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsPresenter.kt\nco/bird/android/feature/transferorder/operator/details/OperatorOrderDetailsPresenter$consume$1$1\n*L\n45#1:163,3\n58#1:166,3\n64#1:169,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lhp3;


# direct methods
.method public constructor <init>(Lhp3;)V
    .locals 0

    iput-object p1, p0, Lhp3$m$a;->g:Lhp3;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/OperatorOrderView;Lco/bird/android/model/wire/WireSkuScannedItems;)Lco/bird/android/model/persistence/OperatorOrderView;
    .locals 10

    const-string v0, "orderView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scannedItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhp3$m$a;->g:Lhp3;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getType()Lco/bird/android/model/constant/OperatorOrderViewType;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getType()Lco/bird/android/model/constant/OperatorOrderViewType;

    move-result-object v1

    sget-object v3, Lhp3$m$a$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v1, v7, :cond_4

    if-eq v1, v5, :cond_4

    if-eq v1, v4, :cond_0

    if-eq v1, v3, :cond_0

    move v8, v6

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireSkuScannedItems;->getSuccessfulScannedItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v8, v1, Ljava/util/Collection;

    if-eqz v8, :cond_2

    move-object v8, v1

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_2

    :cond_1
    move v1, v7

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lco/bird/android/model/wire/WireSuccessfulScannedItem;

    invoke-virtual {v8}, Lco/bird/android/model/wire/WireSuccessfulScannedItem;->getReceived()Z

    move-result v8

    if-eqz v8, :cond_3

    move v1, v6

    goto :goto_0

    :cond_4
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireSkuScannedItems;->getSuccessfulScannedItems()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    :goto_0
    move v8, v1

    :goto_1
    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getType()Lco/bird/android/model/constant/OperatorOrderViewType;

    move-result-object v1

    sget-object v9, Lhp3$m$a$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v9, v1

    if-eq v1, v7, :cond_d

    if-eq v1, v5, :cond_d

    if-eq v1, v4, :cond_6

    if-eq v1, v3, :cond_6

    :cond_5
    move v4, v6

    goto/16 :goto_5

    :cond_6
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireSkuScannedItems;->getSuccessfulScannedItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_8

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_8

    :cond_7
    move v1, v6

    goto :goto_2

    :cond_8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireSuccessfulScannedItem;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireSuccessfulScannedItem;->getReceived()Z

    move-result v3

    xor-int/2addr v3, v7

    if-eqz v3, :cond_9

    move v1, v7

    :goto_2
    if-nez v1, :cond_e

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireSkuScannedItems;->getSuccessfulScannedItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_b

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_b

    :cond_a
    move v1, v7

    goto :goto_3

    :cond_b
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireSuccessfulScannedItem;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireSuccessfulScannedItem;->getReceived()Z

    move-result v3

    xor-int/2addr v3, v7

    if-eqz v3, :cond_c

    move v1, v6

    :goto_3
    if-eqz v1, :cond_5

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireSkuScannedItems;->getSuccessfulScannedItems()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getQuantity()I

    move-result v1

    if-ge p2, v1, :cond_5

    goto :goto_4

    :cond_d
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireSkuScannedItems;->getSuccessfulScannedItems()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getQuantity()I

    move-result v1

    if-ge p2, v1, :cond_5

    :cond_e
    :goto_4
    move v4, v7

    :goto_5
    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getType()Lco/bird/android/model/constant/OperatorOrderViewType;

    move-result-object p2

    invoke-static {p2}, Lco/bird/android/model/constant/OperatorOrderViewTypeKt;->isLongtail(Lco/bird/android/model/constant/OperatorOrderViewType;)Z

    move-result p2

    if-eqz p2, :cond_f

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getBolUploaded()Z

    move-result p2

    move v5, p2

    goto :goto_6

    :cond_f
    move v5, v7

    :goto_6
    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getContainerOrderId()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_10

    move v6, v7

    :cond_10
    new-instance p2, Llx5;

    move-object v1, p2

    move v3, v8

    invoke-direct/range {v1 .. v6}, Llx5;-><init>(Lco/bird/android/model/constant/OperatorOrderViewType;ZZZZ)V

    invoke-virtual {v0, p2}, Lf1;->h(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/OperatorOrderView;

    check-cast p2, Lco/bird/android/model/wire/WireSkuScannedItems;

    invoke-virtual {p0, p1, p2}, Lhp3$m$a;->a(Lco/bird/android/model/persistence/OperatorOrderView;Lco/bird/android/model/wire/WireSkuScannedItems;)Lco/bird/android/model/persistence/OperatorOrderView;

    move-result-object p1

    return-object p1
.end method
