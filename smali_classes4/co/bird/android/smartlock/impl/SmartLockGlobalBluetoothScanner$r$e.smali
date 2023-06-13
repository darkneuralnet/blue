.class public final Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r;->invoke(Lkotlin/Unit;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/RideStates;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/RideStates;",
        "rideStates",
        "",
        "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;",
        "a",
        "(Lco/bird/android/model/RideStates;)Ljava/util/List;"
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
        "SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$2$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n1603#2,9:482\n1855#2:491\n1747#2,3:492\n766#2:495\n857#2,2:496\n1856#2:499\n1612#2:500\n1#3:498\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$2$5\n*L\n184#1:482,9\n184#1:491\n186#1:492,3\n192#1:495\n192#1:496,2\n184#1:499\n184#1:500\n184#1:498\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r$e;

    invoke-direct {v0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r$e;-><init>()V

    sput-object v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r$e;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/RideStates;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/RideStates;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;",
            ">;"
        }
    .end annotation

    const-string v0, "rideStates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/RideStates;->getRideStates()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/RideState;

    invoke-virtual {v1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getPhysicalLocks()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_5

    check-cast v4, Ljava/lang/Iterable;

    instance-of v7, v4, Ljava/util/Collection;

    if-eqz v7, :cond_2

    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_2

    :cond_1
    move v4, v6

    goto :goto_2

    :cond_2
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-virtual {v7}, Lco/bird/android/model/wire/WirePhysicalLock;->isBrainLock()Z

    move-result v8

    if-nez v8, :cond_4

    invoke-virtual {v7}, Lco/bird/android/model/wire/WirePhysicalLock;->isSolebe()Z

    move-result v7

    if-nez v7, :cond_4

    move v7, v5

    goto :goto_1

    :cond_4
    move v7, v6

    :goto_1
    if-eqz v7, :cond_3

    move v4, v5

    :goto_2
    if-ne v4, v5, :cond_5

    move v4, v5

    goto :goto_3

    :cond_5
    move v4, v6

    :goto_3
    if-eqz v4, :cond_6

    invoke-static {v1}, Lco/bird/android/model/RideStateKt;->isInRide(Lco/bird/android/model/RideState;)Z

    move-result v4

    if-eqz v4, :cond_6

    move v4, v5

    goto :goto_4

    :cond_6
    move v4, v6

    :goto_4
    if-eqz v4, :cond_7

    move-object v10, v2

    goto :goto_5

    :cond_7
    move-object v10, v3

    :goto_5
    if-eqz v10, :cond_c

    sget-object v8, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;->f:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;

    invoke-virtual {v10}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10}, Lco/bird/android/model/wire/WireBird;->getPhysicalLocks()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_b

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-virtual {v7}, Lco/bird/android/model/wire/WirePhysicalLock;->isBrainLock()Z

    move-result v11

    if-nez v11, :cond_9

    invoke-virtual {v7}, Lco/bird/android/model/wire/WirePhysicalLock;->isSolebe()Z

    move-result v7

    if-nez v7, :cond_9

    move v7, v5

    goto :goto_7

    :cond_9
    move v7, v6

    :goto_7
    if-eqz v7, :cond_8

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    move-object v11, v3

    goto :goto_8

    :cond_b
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    move-object v11, v2

    :goto_8
    invoke-virtual {v1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v12

    new-instance v3, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;

    move-object v7, v3

    invoke-direct/range {v7 .. v12}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/String;)V

    :cond_c
    if-eqz v3, :cond_0

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_d
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/RideStates;

    invoke-virtual {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r$e;->a(Lco/bird/android/model/RideStates;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
