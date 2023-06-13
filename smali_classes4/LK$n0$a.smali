.class public final LLK$n0$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLK$n0;->b(Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
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
        "SMAP\nBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$scanBatch$1$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,969:1\n125#2:970\n152#2,3:971\n*S KotlinDebug\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$scanBatch$1$2\n*L\n509#1:970\n509#1:971,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LLK;

.field public final synthetic h:LLK$n0$b;

.field public final synthetic i:Lio/reactivex/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/y<",
            "Ljava/util/List<",
            "Lco/bird/android/model/Vehicle;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LLK;LLK$n0$b;Lio/reactivex/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLK;",
            "LLK$n0$b;",
            "Lio/reactivex/y<",
            "Ljava/util/List<",
            "Lco/bird/android/model/Vehicle;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, LLK$n0$a;->g:LLK;

    iput-object p2, p0, LLK$n0$a;->h:LLK$n0$b;

    iput-object p3, p0, LLK$n0$a;->i:Lio/reactivex/y;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LLK$n0$a;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    iget-object v0, p0, LLK$n0$a;->g:LLK;

    iget-object v1, p0, LLK$n0$a;->h:LLK$n0$b;

    invoke-virtual {v0, v1}, LLK;->H2(Ljj5;)V

    iget-object v0, p0, LLK$n0$a;->i:Lio/reactivex/y;

    invoke-static {}, LLK;->access$getScannedVehicles$cp()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/Vehicle;

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LLK$n0$a;->i:Lio/reactivex/y;

    invoke-interface {v0}, Lio/reactivex/j;->onComplete()V

    return-void
.end method
