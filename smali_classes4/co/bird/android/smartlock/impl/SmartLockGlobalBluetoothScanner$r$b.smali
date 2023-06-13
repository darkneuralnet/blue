.class public final Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r$b;
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
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "birds",
        "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;",
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
        "SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,481:1\n766#2:482\n857#2,2:483\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$2$2\n*L\n166#1:482\n166#1:483,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;


# direct methods
.method public constructor <init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r$b;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;",
            ">;"
        }
    .end annotation

    const-string v0, "birds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r$b;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    sget-object v1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;->e:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;

    invoke-static {v0, p1, v1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->access$mapToSmartLockScannableBirds(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;Ljava/util/List;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;)Ljava/util/List;

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

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;

    invoke-virtual {v2}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->d()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WirePhysicalLock;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/wire/WirePhysicalLock;->isSolebe()Z

    move-result v2

    if-ne v2, v4, :cond_1

    move v3, v4

    :cond_1
    xor-int/lit8 v2, v3, 0x1

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r$b;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
