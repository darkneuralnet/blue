.class public final Li25$Z;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->w5(Lcom/uber/autodispose/ScopeProvider;)V
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
        "Lco/bird/android/model/RideStates;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/Reservation;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;+",
        "Lco/bird/android/model/RideUpdateState;",
        "+",
        "LFH3;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "La75;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t \u0002*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00030\u00032d\u0010\u0008\u001a`\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00070\u00070\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "LRe4;",
        "Lco/bird/android/model/RideStates;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/Reservation;",
        "Lco/bird/android/model/wire/WireBird;",
        "Lco/bird/android/model/RideUpdateState;",
        "LFH3;",
        "<name for destructuring parameter 0>",
        "La75;",
        "a",
        "(LRe4;)Lco/bird/android/buava/Optional;"
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
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeRideStates$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1747#2,3:4446\n288#2,2:4449\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeRideStates$2\n*L\n4179#1:4446,3\n4188#1:4449,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$Z;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LRe4;)Lco/bird/android/buava/Optional;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRe4<",
            "Lco/bird/android/model/RideStates;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/Reservation;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;+",
            "Lco/bird/android/model/RideUpdateState;",
            "+",
            "LFH3;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "La75;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LRe4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/RideStates;

    invoke-virtual {p1}, LRe4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, LRe4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, LRe4;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/RideUpdateState;

    invoke-virtual {p1}, LRe4;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LFH3;

    invoke-virtual {v0}, Lco/bird/android/model/RideStates;->toLoggableString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/WireBird;

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "ride status observable:\nrideStates: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\nreservation: "

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\nfocusedBird: "

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\nrideUpdateState: "

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\nparkingStatus: "

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v7, v5, [Ljava/lang/Object;

    invoke-static {v4, v7}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireBird;

    sget-object v13, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    const-string v7, "parkingStatus"

    const-string v8, "rideUpdateState"

    if-eqz v4, :cond_1

    sget-object v9, Lco/bird/android/model/RideUpdateState;->STARTING:Lco/bird/android/model/RideUpdateState;

    if-ne v3, v9, :cond_1

    sget-object v0, La75;->h:La75$a;

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Li25$Z;->g:Li25;

    invoke-static {v1}, Li25;->access$getReactiveConfig$p(Li25;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0, v4, v3, p1, v1}, La75$a;->b(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/RideUpdateState;LFH3;Lco/bird/android/model/wire/configs/Config;)La75;

    move-result-object v6

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v0}, Lco/bird/android/model/RideStates;->getRideStates()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    instance-of v9, v4, Ljava/util/Collection;

    const/4 v10, 0x1

    if-eqz v9, :cond_3

    move-object v9, v4

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_3

    :cond_2
    move v4, v5

    goto :goto_1

    :cond_3
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lco/bird/android/model/RideState;

    invoke-static {v9}, Lco/bird/android/model/RideStateKt;->isInRide(Lco/bird/android/model/RideState;)Z

    move-result v9

    if-eqz v9, :cond_4

    move v4, v10

    :goto_1
    if-nez v4, :cond_5

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/Reservation;

    invoke-virtual {v4}, Lco/bird/android/model/Reservation;->isExpired()Z

    move-result v4

    if-nez v4, :cond_5

    sget-object v4, La75;->h:La75$a;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lco/bird/android/model/Reservation;

    const/4 v6, 0x0

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li25$Z;->g:Li25;

    invoke-static {v0}, Li25;->access$getReactiveConfig$p(Li25;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lco/bird/android/model/wire/configs/Config;

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object v7, v3

    move-object v8, p1

    invoke-static/range {v4 .. v11}, La75$a;->invoke$default(La75$a;Lco/bird/android/model/Reservation;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/RideUpdateState;LFH3;Lco/bird/android/model/wire/configs/Config;ILjava/lang/Object;)La75;

    move-result-object v6

    goto/16 :goto_3

    :cond_5
    invoke-virtual {v0}, Lco/bird/android/model/RideStates;->getRideStates()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v10

    if-eqz v1, :cond_b

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Lco/bird/android/model/RideStates;->getRideStates()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lco/bird/android/model/RideState;

    invoke-virtual {v9}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v9

    invoke-virtual {v9}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v9, v11}, Lco/bird/android/model/wire/WireBird;->isSame(Lco/bird/android/model/wire/WireBird;)Z

    move-result v9

    if-ne v9, v10, :cond_7

    move v9, v10

    goto :goto_2

    :cond_7
    move v9, v5

    :goto_2
    if-eqz v9, :cond_6

    move-object v6, v4

    :cond_8
    check-cast v6, Lco/bird/android/model/RideState;

    if-nez v6, :cond_9

    invoke-virtual {v0}, Lco/bird/android/model/RideStates;->getRideStates()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/RideState;

    move-object v6, v1

    :cond_9
    sget-object v4, La75;->h:La75$a;

    invoke-virtual {v0}, Lco/bird/android/model/RideStates;->getRideStates()Ljava/util/List;

    move-result-object v5

    const/4 v0, 0x0

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Li25$Z;->g:Li25;

    invoke-static {v1}, Li25;->access$getReactiveConfig$p(Li25;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lco/bird/android/model/wire/configs/Config;

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v0

    move-object v8, v3

    move-object v9, p1

    invoke-static/range {v4 .. v12}, La75$a;->invoke$default(La75$a;Ljava/util/List;Lco/bird/android/model/RideState;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/RideUpdateState;LFH3;Lco/bird/android/model/wire/configs/Config;ILjava/lang/Object;)La75;

    move-result-object v6

    goto :goto_3

    :cond_a
    sget-object v4, La75;->h:La75$a;

    invoke-virtual {v0}, Lco/bird/android/model/RideStates;->getRideStates()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li25$Z;->g:Li25;

    invoke-static {v0}, Li25;->access$getReactiveConfig$p(Li25;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lco/bird/android/model/wire/configs/Config;

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object v7, v3

    move-object v8, p1

    invoke-static/range {v4 .. v11}, La75$a;->invoke$default(La75$a;Ljava/util/List;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/RideUpdateState;LFH3;Lco/bird/android/model/wire/configs/Config;ILjava/lang/Object;)La75;

    move-result-object v6

    :cond_b
    :goto_3
    invoke-virtual {v13, v6}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LRe4;

    invoke-virtual {p0, p1}, Li25$Z;->a(LRe4;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
