.class public final Li25$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->u4()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
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
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initPhysicalLockButtonObservables$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n288#2,2:4446\n1#3:4448\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initPhysicalLockButtonObservables$3\n*L\n1607#1:4446,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$u;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Li25$u;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Li25$u;->g:Li25;

    invoke-static {v1}, Li25;->access$getSmartLockV2Enabled(Li25;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    iget-object v1, v0, Li25$u;->g:Li25;

    invoke-static {v1}, Li25;->access$getFocusedRide(Li25;)Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getPhysicalLocks()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WirePhysicalLock;->isBrainLock()Z

    move-result v5

    xor-int/2addr v5, v2

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_0
    check-cast v4, Lco/bird/android/model/wire/WirePhysicalLock;

    goto :goto_1

    :cond_2
    iget-object v1, v0, Li25$u;->g:Li25;

    invoke-static {v1}, Li25;->access$getSmartlockManager$p(Li25;)LoI5;

    move-result-object v1

    invoke-interface {v1}, LoI5;->e()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXl5;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LXl5;->b()Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v4

    goto :goto_1

    :cond_3
    move-object v4, v3

    :goto_1
    if-eqz v4, :cond_c

    invoke-virtual {v4}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v1

    sget-object v5, Lco/bird/android/model/constant/PhysicalLockPurpose;->HELMET:Lco/bird/android/model/constant/PhysicalLockPurpose;

    const/4 v6, 0x0

    if-ne v1, v5, :cond_4

    move v1, v2

    goto :goto_2

    :cond_4
    move v1, v6

    :goto_2
    if-eqz v1, :cond_5

    move-object v8, v4

    goto :goto_3

    :cond_5
    move-object v8, v3

    :goto_3
    if-eqz v8, :cond_c

    iget-object v1, v0, Li25$u;->g:Li25;

    invoke-static {v1}, Li25;->access$getItemLeaseManager$p(Li25;)LMc2;

    move-result-object v4

    invoke-static {v1}, Li25;->access$getReactiveConfig$p(Li25;)LTq4;

    move-result-object v5

    invoke-virtual {v5}, LTq4;->f8()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/configs/Config;

    sget-object v7, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {v4, v5, v8, v7}, LMc2;->v(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WirePhysicalLock;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-static {v1}, Li25;->access$getItemLeaseManager$p(Li25;)LMc2;

    move-result-object v4

    invoke-interface {v4}, LMc2;->s()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/itemlease/ItemLease;

    if-eqz v4, :cond_c

    invoke-static {v1}, Li25;->access$getFocusedRide(Li25;)Lco/bird/android/model/wire/WireRide;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    :cond_6
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getPhysicalLocks()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lco/bird/android/model/wire/WirePhysicalLock;->isSolebe()Z

    move-result v5

    if-ne v5, v2, :cond_7

    goto :goto_4

    :cond_7
    move v2, v6

    :goto_4
    if-eqz v2, :cond_8

    invoke-static {v1}, Li25;->access$getNavigator$p(Li25;)Le13;

    move-result-object v1

    sget-object v2, LI35;->u:LI35;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-interface {v1, v3, v4, v2}, Le13;->w(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/ItemLease;I)V

    goto :goto_5

    :cond_8
    invoke-static {v1}, Li25;->access$getNavigator$p(Li25;)Le13;

    move-result-object v1

    sget-object v2, LI35;->u:LI35;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const-string v3, "helmet_button"

    invoke-interface {v1, v4, v3, v2}, Le13;->n0(Lco/bird/android/model/itemlease/ItemLease;Ljava/lang/String;I)V

    :goto_5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_6

    :cond_9
    const-string v4, "going to physical lock tutorial from physicalLockButtonClicks"

    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v1}, Li25;->access$getConfigurableTutorialManager$p(Li25;)Llw0;

    move-result-object v9

    invoke-static {v1}, Li25;->access$getNavigator$p(Li25;)Le13;

    move-result-object v10

    invoke-virtual {v8, v2}, Lco/bird/android/model/wire/WirePhysicalLock;->toTutorialContext(Z)Lco/bird/android/model/constant/ConfigurableTutorialContext;

    move-result-object v11

    invoke-virtual {v1}, Li25;->f4()LYR4;

    move-result-object v2

    invoke-interface {v2}, LYR4;->R()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/RideState;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v3

    :cond_a
    move-object v12, v3

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x20

    const/16 v17, 0x0

    invoke-static/range {v9 .. v17}, Llw0$a;->maybeGoToConfigurableTutorials$default(Llw0;Le13;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;ZLjava/lang/Integer;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-static {v1}, Li25;->access$getNavigator$p(Li25;)Le13;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Le13$a;->goToPhysicalLockTutorial$default(Le13;Lco/bird/android/model/wire/WirePhysicalLock;ZLjava/lang/Integer;ILjava/lang/Object;)V

    :cond_b
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_6
    move-object v3, v1

    :cond_c
    if-nez v3, :cond_d

    iget-object v1, v0, Li25$u;->g:Li25;

    invoke-static {v1}, Li25;->access$showUnlockInstructions(Li25;)V

    :cond_d
    return-void
.end method
