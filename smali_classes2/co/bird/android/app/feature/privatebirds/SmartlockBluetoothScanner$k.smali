.class public final Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;->A()Lio/reactivex/disposables/c;
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
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        ">;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "physicalLocks",
        "Lio/reactivex/B;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$k;->g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lio/reactivex/B;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            ">;)",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            ">;"
        }
    .end annotation

    const-string v0, "physicalLocks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$k;->g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;

    invoke-static {v0}, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;->access$getLogger(Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;)Lg46$b;

    move-result-object v0

    const-string v2, "Starting physical lock bluetooth scanning"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$k;->g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;->access$scanForLocks(Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;Ljava/util/List;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$k;->g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;

    invoke-static {p1}, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;->access$getLogger(Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;)Lg46$b;

    move-result-object p1

    const-string v0, "Stopping physical lock bluetooth scanning due to having 0 locks to scan for"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$k;->g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;

    invoke-static {p1}, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;->access$getSmartlockManager$p(Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;)LoI5;

    move-result-object p1

    invoke-interface {p1}, LoI5;->d()V

    invoke-static {}, Lio/reactivex/Observable;->never()Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$k;->a(Ljava/util/List;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
