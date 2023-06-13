.class public final Li25$t;
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
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "LXl5;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u00062B\u0010\u0005\u001a>\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/buava/Optional;",
        "LXl5;",
        "",
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
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initPhysicalLockButtonObservables$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$t;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Li25$t;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/buava/Optional<",
            "LXl5;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXl5;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LXl5;->b()Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    iget-object v4, p0, Li25$t;->g:Li25;

    invoke-static {v4}, Li25;->access$getItemLeaseManager$p(Li25;)LMc2;

    move-result-object v5

    invoke-virtual {v4}, Li25;->f4()LYR4;

    move-result-object v6

    invoke-interface {v6}, LYR4;->R()LZ84;

    move-result-object v6

    invoke-virtual {v6}, LZ84;->a()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/buava/Optional;

    invoke-virtual {v6}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/RideState;

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lco/bird/android/model/RideState;->getRideConfig()Lco/bird/android/model/wire/configs/Config;

    move-result-object v6

    if-nez v6, :cond_2

    :cond_1
    invoke-static {v4}, Li25;->access$getReactiveConfig$p(Li25;)LTq4;

    move-result-object v4

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lco/bird/android/model/wire/configs/Config;

    :cond_2
    sget-object v4, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {v5, v6, v0, v4}, LMc2;->v(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WirePhysicalLock;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v5

    sget-object v6, Lco/bird/android/model/constant/PhysicalLockPurpose;->HELMET:Lco/bird/android/model/constant/PhysicalLockPurpose;

    if-ne v5, v6, :cond_3

    move v5, v2

    goto :goto_1

    :cond_3
    move v5, v3

    :goto_1
    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, v1

    :goto_2
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    goto :goto_3

    :cond_5
    move v4, v3

    :goto_3
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->getBirdId()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_8

    :cond_6
    iget-object v5, p0, Li25$t;->g:Li25;

    invoke-virtual {v5}, Li25;->f4()LYR4;

    move-result-object v5

    invoke-interface {v5}, LYR4;->R()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/buava/Optional;

    invoke-virtual {v5}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/RideState;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_7
    move-object v5, v1

    :cond_8
    :goto_4
    if-eqz v5, :cond_9

    iget-object v6, p0, Li25$t;->g:Li25;

    invoke-static {v6}, Li25;->access$getItemLeaseManager$p(Li25;)LMc2;

    move-result-object v6

    sget-object v7, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {v6, v5, v7}, LMc2;->C(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z

    move-result v5

    if-ne v5, v2, :cond_9

    move v5, v2

    goto :goto_5

    :cond_9
    move v5, v3

    :goto_5
    if-eqz v0, :cond_b

    if-eqz v4, :cond_a

    if-eqz v5, :cond_b

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_b

    :cond_a
    move p1, v2

    goto :goto_6

    :cond_b
    move p1, v3

    :goto_6
    iget-object v5, p0, Li25$t;->g:Li25;

    invoke-static {v5}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object v5

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v6

    goto :goto_7

    :cond_c
    move-object v6, v1

    :goto_7
    invoke-interface {v5, p1, v6}, LP75;->kc(ZLco/bird/android/model/constant/PhysicalLockPurpose;)V

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v5

    goto :goto_8

    :cond_d
    move-object v5, v1

    :goto_8
    sget-object v6, Lco/bird/android/model/constant/PhysicalLockPurpose;->HELMET:Lco/bird/android/model/constant/PhysicalLockPurpose;

    if-ne v5, v6, :cond_10

    if-eqz p1, :cond_e

    iget-object p1, p0, Li25$t;->g:Li25;

    invoke-static {p1}, Li25;->access$getPreference$p(Li25;)Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->J0()Z

    move-result p1

    if-nez p1, :cond_e

    iget-object p1, p0, Li25$t;->g:Li25;

    invoke-static {p1}, Li25;->access$getPreference$p(Li25;)Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->S1()V

    iget-object p1, p0, Li25$t;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    invoke-interface {p1}, LP75;->Ce()V

    :cond_e
    iget-object p1, p0, Li25$t;->g:Li25;

    invoke-static {p1}, Li25;->access$getPreference$p(Li25;)Lgl;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->getKind()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Lgl;->M0(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_10

    if-nez v4, :cond_10

    const-string p1, "going to physical lock tutorial from initPhysicalLockButtonObservables"

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {p1, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Li25$t;->g:Li25;

    invoke-static {p1}, Li25;->access$getConfigurableTutorialManager$p(Li25;)Llw0;

    move-result-object v4

    iget-object p1, p0, Li25$t;->g:Li25;

    invoke-static {p1}, Li25;->access$getNavigator$p(Li25;)Le13;

    move-result-object v5

    invoke-virtual {v0, v2}, Lco/bird/android/model/wire/WirePhysicalLock;->toTutorialContext(Z)Lco/bird/android/model/constant/ConfigurableTutorialContext;

    move-result-object v6

    iget-object p1, p0, Li25$t;->g:Li25;

    invoke-virtual {p1}, Li25;->f4()LYR4;

    move-result-object p1

    invoke-interface {p1}, LYR4;->R()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RideState;

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object p1

    move-object v7, p1

    goto :goto_9

    :cond_f
    move-object v7, v1

    :goto_9
    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x20

    const/4 v12, 0x0

    invoke-static/range {v4 .. v12}, Llw0$a;->maybeGoToConfigurableTutorials$default(Llw0;Le13;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;ZLjava/lang/Integer;ZILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    iget-object p1, p0, Li25$t;->g:Li25;

    invoke-static {p1}, Li25;->access$getNavigator$p(Li25;)Le13;

    move-result-object p1

    invoke-interface {p1, v0, v3, v1}, Le13;->b3(Lco/bird/android/model/wire/WirePhysicalLock;ZLjava/lang/Integer;)V

    :cond_10
    return-void
.end method
