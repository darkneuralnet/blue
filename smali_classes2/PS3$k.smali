.class public final LPS3$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPS3;->i(LES3;Lco/bird/android/model/wire/WirePhysicalLock;Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "b",
        "()Lco/bird/android/model/wire/WireBird;"
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
        "SMAP\nPhysicalLockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockPresenterImpl$onCreate$riddenBird$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n288#2:143\n1747#2,3:144\n289#2:147\n*S KotlinDebug\n*F\n+ 1 PhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockPresenterImpl$onCreate$riddenBird$2\n*L\n57#1:143\n58#1:144,3\n57#1:147\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LPS3;

.field public final synthetic h:Lco/bird/android/model/wire/WirePhysicalLock;


# direct methods
.method public constructor <init>(LPS3;Lco/bird/android/model/wire/WirePhysicalLock;)V
    .locals 0

    iput-object p1, p0, LPS3$k;->g:LPS3;

    iput-object p2, p0, LPS3$k;->h:Lco/bird/android/model/wire/WirePhysicalLock;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lco/bird/android/model/wire/WireBird;
    .locals 9

    iget-object v0, p0, LPS3$k;->g:LPS3;

    invoke-static {v0}, LPS3;->access$getRideManager$p(LPS3;)LYR4;

    move-result-object v0

    invoke-interface {v0}, LYR4;->o0()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/RideStates;

    invoke-virtual {v0}, Lco/bird/android/model/RideStates;->activeRides()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, LPS3$k;->h:Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lco/bird/android/model/RideState;

    invoke-virtual {v4}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireBird;->getPhysicalLocks()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_4

    check-cast v4, Ljava/lang/Iterable;

    instance-of v6, v4, Ljava/util/Collection;

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    move-object v6, v4

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_1
    move v4, v5

    goto :goto_0

    :cond_2
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-virtual {v6}, Lco/bird/android/model/wire/WirePhysicalLock;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v4, v7

    :goto_0
    if-ne v4, v7, :cond_4

    move v5, v7

    :cond_4
    if-eqz v5, :cond_0

    goto :goto_1

    :cond_5
    move-object v2, v3

    :goto_1
    check-cast v2, Lco/bird/android/model/RideState;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    :cond_6
    return-object v3
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPS3$k;->b()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    return-object v0
.end method
