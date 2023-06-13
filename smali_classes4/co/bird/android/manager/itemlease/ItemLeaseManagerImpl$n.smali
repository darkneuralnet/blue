.class public final Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->b()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/PagedCollection<",
        "Lco/bird/android/model/wire/WireLeaseObjectResponse;",
        ">;",
        "Lkotlin/Pair<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/itemlease/ItemLease;",
        ">;+",
        "Lco/bird/android/model/RideStates;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lco/bird/api/response/PagedCollection;",
        "Lco/bird/android/model/wire/WireLeaseObjectResponse;",
        "collection",
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/itemlease/ItemLease;",
        "Lco/bird/android/model/RideStates;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/PagedCollection;)Lkotlin/Pair;"
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
        "SMAP\nItemLeaseManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$queryActiveLeases$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,476:1\n1549#2:477\n1620#2,3:478\n*S KotlinDebug\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$queryActiveLeases$1\n*L\n188#1:477\n188#1:478,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$n;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/PagedCollection;)Lkotlin/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/PagedCollection<",
            "Lco/bird/android/model/wire/WireLeaseObjectResponse;",
            ">;)",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLease;",
            ">;",
            "Lco/bird/android/model/RideStates;",
            ">;"
        }
    .end annotation

    const-string v0, "collection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/PagedCollection;->getItems()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireLeaseObjectResponse;

    invoke-static {v1}, Lco/bird/android/model/itemlease/ItemLeaseKt;->toItemLease(Lco/bird/android/model/wire/WireLeaseObjectResponse;)Lco/bird/android/model/itemlease/ItemLease;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$n;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    invoke-static {p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->access$getRideManager$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)LYR4;

    move-result-object p1

    invoke-interface {p1}, LYR4;->o0()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/PagedCollection;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$n;->a(Lco/bird/api/response/PagedCollection;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
