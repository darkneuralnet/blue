.class public final Lco3$z;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco3;->k0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireNestClaim;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/WireNestClaim;",
        "+",
        "Lco/bird/android/model/persistence/NestMarker;",
        ">;>;+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\n\u001a\u00020\t2\u00a7\u0001\u0010\u0008\u001a\u00a2\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00040\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0003*P\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00040\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lkotlin/Triple;",
        "",
        "Lco/bird/android/model/wire/WireNestClaim;",
        "kotlin.jvm.PlatformType",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/NestMarker;",
        "Lco/bird/android/buava/Optional;",
        "",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lkotlin/Triple;)V"
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
        "SMAP\nOperatorNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$27\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,619:1\n1855#2,2:620\n1747#2,3:622\n766#2:625\n857#2,2:626\n*S KotlinDebug\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$27\n*L\n299#1:620,2\n313#1:622,3\n319#1:625\n319#1:626,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco3;


# direct methods
.method public constructor <init>(Lco3;)V
    .locals 0

    iput-object p1, p0, Lco3$z;->g:Lco3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireNestClaim;",
            ">;+",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireNestClaim;",
            "Lco/bird/android/model/persistence/NestMarker;",
            ">;>;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v2

    check-cast v1, Ljava/lang/Iterable;

    iget-object v3, p0, Lco3$z;->g:Lco3;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/Pair;

    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/WireNestClaim;

    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/NestMarker;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireNestClaim;->getExpiresAt()Lorg/joda/time/DateTime;

    move-result-object v6

    invoke-virtual {v6, v2}, Lorg/joda/time/base/AbstractInstant;->compareTo(Lorg/joda/time/ReadableInstant;)I

    move-result v6

    if-gez v6, :cond_0

    invoke-static {v3}, Lco3;->access$getMapNestMarkerUi$p(Lco3;)Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;

    move-result-object v5

    invoke-interface {v5, v4}, Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;->unclaim(Lco/bird/android/model/persistence/NestMarker;)V

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lco3;->access$getMapNestMarkerUi$p(Lco3;)Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;

    move-result-object v6

    invoke-static {v3, v5}, Lco3;->access$getClaimProgress(Lco3;Lco/bird/android/model/wire/WireNestClaim;)I

    move-result v5

    invoke-interface {v6, v4, v5}, Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;->claim(Lco/bird/android/model/persistence/NestMarker;I)V

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v1, "nestClaims"

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz p1, :cond_7

    iget-object v5, p0, Lco3$z;->g:Lco3;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v0

    check-cast v6, Ljava/lang/Iterable;

    instance-of v7, v6, Ljava/util/Collection;

    if-eqz v7, :cond_4

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_4

    :cond_3
    move v6, v4

    goto :goto_2

    :cond_4
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/wire/WireNestClaim;

    invoke-virtual {v7}, Lco/bird/android/model/wire/WireNestClaim;->getNestId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {v7}, Lco/bird/android/model/wire/WireNestClaim;->getExpiresAt()Lorg/joda/time/DateTime;

    move-result-object v7

    invoke-virtual {v7, v2}, Lorg/joda/time/base/AbstractInstant;->compareTo(Lorg/joda/time/ReadableInstant;)I

    move-result v7

    if-lez v7, :cond_6

    move v7, v3

    goto :goto_1

    :cond_6
    move v7, v4

    :goto_1
    if-eqz v7, :cond_5

    move v6, v3

    :goto_2
    if-eqz v6, :cond_7

    invoke-static {v5}, Lco3;->access$getNestFlightSheetRelay$p(Lco3;)Lma4;

    move-result-object v5

    invoke-virtual {v5, p1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_7
    iget-object p1, p0, Lco3$z;->g:Lco3;

    invoke-static {p1}, Lco3;->access$getNestClaims$p(Lco3;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lco/bird/android/model/wire/WireNestClaim;

    invoke-virtual {v7}, Lco/bird/android/model/wire/WireNestClaim;->getExpiresAt()Lorg/joda/time/DateTime;

    move-result-object v7

    invoke-virtual {v7, v2}, Lorg/joda/time/base/AbstractInstant;->compareTo(Lorg/joda/time/ReadableInstant;)I

    move-result v7

    if-lez v7, :cond_9

    move v7, v3

    goto :goto_4

    :cond_9
    move v7, v4

    :goto_4
    if-eqz v7, :cond_8

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    invoke-static {p1, v0, v5}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Lco3$z;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
