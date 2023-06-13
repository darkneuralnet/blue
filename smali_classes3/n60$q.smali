.class public final Ln60$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln60;->L(Landroid/content/Intent;)V
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
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/api/response/OperatorBatchStatusResponse;",
        ">;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/api/response/OperatorBatchStatusResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "Lco/bird/api/response/OperatorBatchStatusResponse;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/B;",
        "invoke",
        "(Lkotlin/Pair;)Lio/reactivex/B;",
        "<anonymous>"
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
        "SMAP\nBulkStatusReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$21\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,332:1\n1603#2,9:333\n1855#2:342\n1856#2:344\n1612#2:345\n1#3:343\n37#4,2:346\n*S KotlinDebug\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$21\n*L\n255#1:333,9\n255#1:342\n255#1:344\n255#1:345\n255#1:343\n255#1:346,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ln60;

.field public final synthetic h:Lco/bird/android/model/constant/BulkScanPurpose;


# direct methods
.method public constructor <init>(Ln60;Lco/bird/android/model/constant/BulkScanPurpose;)V
    .locals 0

    iput-object p1, p0, Ln60$q;->g:Ln60;

    iput-object p2, p0, Ln60$q;->h:Lco/bird/android/model/constant/BulkScanPurpose;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Pair;)Lio/reactivex/B;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lkotlin/Unit;",
            "Lco/bird/api/response/OperatorBatchStatusResponse;",
            ">;)",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/api/response/OperatorBatchStatusResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/OperatorBatchStatusResponse;

    invoke-virtual {p1}, Lco/bird/api/response/OperatorBatchStatusResponse;->getErrors()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln60$q;->g:Ln60;

    invoke-static {v0}, Ln60;->access$getOperatorManager$p(Ln60;)Lom3;

    move-result-object v0

    iget-object v1, p0, Ln60$q;->h:Lco/bird/android/model/constant/BulkScanPurpose;

    invoke-interface {v0, v1}, Lom3;->r1(Lco/bird/android/model/constant/BulkScanPurpose;)Lio/reactivex/c;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ln60$q;->g:Ln60;

    invoke-static {v0}, Ln60;->access$getOperatorManager$p(Ln60;)Lom3;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/OperatorBatchStatusResponse;->getErrors()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/api/response/OperatorBatchError;

    invoke-virtual {v3}, Lco/bird/api/response/OperatorBatchError;->getBirdId()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v2, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Lom3;->t([Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v0

    :goto_1
    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->l(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Ln60$q;->invoke(Lkotlin/Pair;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
