.class public final Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$u$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$u;->invoke(Lkotlin/Pair;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "LsE5;",
        ">;",
        "Ljava/util/List<",
        "+",
        "LsE5;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "LsE5;",
        "scanResults",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Ljava/util/List;"
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
        "SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$5$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n1603#2,9:482\n1855#2:491\n1856#2:493\n1612#2:494\n1#3:492\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$5$1\n*L\n241#1:482,9\n241#1:491\n241#1:493\n241#1:494\n241#1:492\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$u$a;->g:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LsE5;",
            ">;)",
            "Ljava/util/List<",
            "LsE5;",
            ">;"
        }
    .end annotation

    const-string v0, "scanResults"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$u$a;->g:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LsE5;

    const-string v3, "scannableBirds"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v10, 0x0

    if-eqz v3, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;

    invoke-virtual {v11}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->d()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireSmartlock;->getMacAddress()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_3
    move-object v5, v10

    :goto_1
    invoke-virtual {v2}, LsE5;->f()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, v10

    :goto_2
    if-eqz v4, :cond_5

    invoke-static {v4}, LZK;->i(Lco/bird/android/model/wire/WireSmartlock;)Lco/bird/android/model/persistence/nestedstructures/Smartlock;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v11}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->b()Lco/bird/android/model/wire/WireBird;

    move-result-object v5

    invoke-static {v5}, LZK;->a(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/persistence/Bird;

    move-result-object v5

    invoke-virtual {v3}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v6

    invoke-virtual {v11}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->f()Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;->b()LtE5;

    move-result-object v7

    invoke-virtual {v11}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->e()Ljava/lang/String;

    move-result-object v8

    move-object v3, v2

    invoke-static/range {v3 .. v8}, LtF5;->a(LsE5;Lco/bird/android/model/persistence/nestedstructures/Smartlock;Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/constant/PhysicalLockPurpose;LtE5;Ljava/lang/String;)LsE5;

    move-result-object v3

    goto :goto_3

    :cond_5
    move-object v3, v10

    :goto_3
    if-eqz v3, :cond_2

    move-object v10, v3

    :cond_6
    if-eqz v10, :cond_1

    :cond_7
    if-eqz v10, :cond_0

    invoke-interface {v1, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$u$a;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
