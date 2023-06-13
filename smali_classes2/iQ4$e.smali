.class public final LiQ4$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiQ4;->t(Ljava/lang/String;Z)V
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
        "Lco/bird/android/model/wire/WireRideDetail;",
        "+",
        "LQP4;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/WireRideDetail;",
        "LQP4;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
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
        "SMAP\nRideDetailPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideDetailPresenter.kt\nco/bird/android/app/feature/ridedetail/RideDetailPresenterImpl$onCreate$3\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,274:1\n199#2:275\n766#3:276\n857#3,2:277\n*S KotlinDebug\n*F\n+ 1 RideDetailPresenter.kt\nco/bird/android/app/feature/ridedetail/RideDetailPresenterImpl$onCreate$3\n*L\n98#1:275\n110#1:276\n110#1:277,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LiQ4;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(LiQ4;Z)V
    .locals 0

    iput-object p1, p0, LiQ4$e;->g:LiQ4;

    iput-boolean p2, p0, LiQ4$e;->h:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LiQ4$e;->b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LiQ4$e;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireRideDetail;",
            "LQP4;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireRideDetail;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LQP4;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getPartnerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireRide;->getVehicleModel()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v3}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v3

    const-string v4, "detail"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v0}, LsQ4;->m5(Lco/bird/android/model/wire/WireRideDetail;)V

    iget-object v3, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v3}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getBirdTracks()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1}, LQP4;->c()Z

    move-result v5

    invoke-interface {v3, v4, v2, v5}, LsQ4;->Dl(Ljava/util/List;Ljava/lang/String;Z)V

    iget-object v3, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v3}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getReportStatus()Lco/bird/android/model/constant/RideReportStatus;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/RideReportStatus;->NOT_AVAILABLE:Lco/bird/android/model/constant/RideReportStatus;

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_0

    move v4, v7

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    invoke-interface {v3, v4}, LsQ4;->i0(Z)V

    iget-object v3, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v3}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireRide;->getDistance()D

    move-result-wide v4

    invoke-interface {v3, v4, v5}, LsQ4;->B7(D)V

    iget-object v3, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v3}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v4

    invoke-virtual {p1}, LQP4;->f()Z

    move-result v5

    invoke-virtual {p1}, LQP4;->e()Z

    move-result v8

    invoke-interface {v3, v4, v5, v8}, LsQ4;->vl(Lco/bird/android/model/wire/WireRide;ZZ)V

    iget-object v3, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v3}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getDispute()Lco/bird/android/model/wire/WireDisputeView;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireDisputeView;->getStatusText()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v5

    :goto_1
    invoke-interface {v3, v4}, LsQ4;->N7(Ljava/lang/String;)V

    iget-object v3, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v3}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v3

    iget-object v4, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v4}, LiQ4;->access$getReactiveConfig$p(LiQ4;)LTq4;

    move-result-object v4

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getDispute()Lco/bird/android/model/wire/configs/DisputeConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/DisputeConfig;->getEnabled()Ljava/lang/Boolean;

    move-result-object v4

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getDispute()Lco/bird/android/model/wire/WireDisputeView;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireDisputeView;->getDisputable()Z

    move-result v4

    if-ne v4, v7, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v6

    :goto_2
    if-eqz v4, :cond_3

    move v4, v7

    goto :goto_3

    :cond_3
    move v4, v6

    :goto_3
    invoke-interface {v3, v4}, LsQ4;->Vh(Z)V

    iget-object v3, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v3}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v3

    iget-object v4, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v4}, LiQ4;->access$getReactiveConfig$p(LiQ4;)LTq4;

    move-result-object v4

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getTaxInformationConfig()Lco/bird/android/model/wire/configs/TaxInformationConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/TaxInformationConfig;->getEnableCompliantReceipts()Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v3, v4}, LsQ4;->g6(Z)V

    invoke-virtual {p1}, LQP4;->c()Z

    move-result v3

    if-eqz v3, :cond_5

    if-eqz v1, :cond_4

    iget-object v3, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v3}, LiQ4;->access$getPartnerManager$p(LiQ4;)LGI3;

    move-result-object v4

    invoke-interface {v4, v1}, LGI3;->u(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {v3}, LiQ4;->access$getScopeProvider$p(LiQ4;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v4

    invoke-static {v4}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v4

    invoke-virtual {v1, v4}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v1

    const-string v4, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v4, LiQ4$e$a;

    invoke-direct {v4, v3, v2}, LiQ4$e$a;-><init>(LiQ4;Ljava/lang/String;)V

    new-instance v3, LjQ4;

    invoke-direct {v3, v4}, LjQ4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v3}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object v1

    goto :goto_4

    :cond_4
    move-object v1, v5

    :goto_4
    if-nez v1, :cond_5

    iget-object v1, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v1}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v1

    invoke-interface {v1, v5, v2}, LsQ4;->Re(Lco/bird/android/model/MobilePartner;Ljava/lang/String;)V

    :cond_5
    iget-boolean v1, p0, LiQ4$e;->h:Z

    if-eqz v1, :cond_6

    iget-object v1, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v1}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getRating()Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v1, v2}, LsQ4;->bg(Ljava/lang/Float;)V

    :cond_6
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getReceipt()Lco/bird/android/model/wire/WireReceipt;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireReceipt;->getDebitTransactionLineItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v7

    if-eqz v1, :cond_a

    invoke-virtual {p1}, LQP4;->b()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v1}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getReceipt()Lco/bird/android/model/wire/WireReceipt;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireReceipt;->getDebitTransactionLineItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lco/bird/android/model/wire/WireRideTransactionItem;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireRideTransactionItem;->getTitle()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_8

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireRideTransactionItem;->getValueAmount()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_8

    move v5, v7

    goto :goto_6

    :cond_8
    move v5, v6

    :goto_6
    if-eqz v5, :cond_7

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getReceipt()Lco/bird/android/model/wire/WireReceipt;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireReceipt;->getCurrency()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2}, LsQ4;->xh(Ljava/util/List;Ljava/lang/String;)V

    :cond_a
    invoke-virtual {p1}, LQP4;->b()Z

    move-result v1

    if-nez v1, :cond_b

    iget-object v1, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v1}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getReceipt()Lco/bird/android/model/wire/WireReceipt;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireReceipt;->getTransaction()Lco/bird/android/model/wire/WireRideTransaction;

    move-result-object v2

    invoke-interface {v1, v2}, LsQ4;->A3(Lco/bird/android/model/wire/WireRideTransaction;)V

    :cond_b
    iget-object v1, p0, LiQ4$e;->g:LiQ4;

    invoke-static {v1}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v1

    invoke-virtual {p1}, LQP4;->d()Z

    move-result v2

    invoke-interface {v1, v2}, LsQ4;->oj(Z)V

    invoke-virtual {p1}, LQP4;->d()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->getRideEndRidePhotoParkingEvaluation()Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    move-result-object p1

    if-nez p1, :cond_c

    iget-object p1, p0, LiQ4$e;->g:LiQ4;

    invoke-static {p1}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object p1

    invoke-interface {p1, v7}, LsQ4;->Q8(Z)V

    goto :goto_7

    :cond_c
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;->getProperParking()Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, p0, LiQ4$e;->g:LiQ4;

    invoke-static {p1}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object p1

    invoke-interface {p1}, LsQ4;->e6()V

    goto :goto_7

    :cond_d
    iget-object p1, p0, LiQ4$e;->g:LiQ4;

    invoke-static {p1}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object p1

    invoke-interface {p1}, LsQ4;->Gd()V

    :cond_e
    :goto_7
    return-void
.end method
