.class public final LOR4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOR4;->W(Ljava/lang/String;)Lio/reactivex/c;
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
        "Lco/bird/android/model/OperatorRideHistoryItem;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u00052$\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0001 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000j\u0004\u0018\u0001`\u00020\u0000j\u0002`\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/api/response/PagedCollection;",
        "Lco/bird/android/model/OperatorRideHistoryItem;",
        "Lco/bird/api/response/OperatorRideHistoryResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/api/response/PagedCollection;)V"
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
        "SMAP\nRideHistoryRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideHistoryRepositoryImpl.kt\nco/bird/android/repository/ridehistory/RideHistoryRepositoryImpl$fetchRideHistory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1549#2:83\n1620#2,3:84\n1855#2:87\n1856#2:89\n1#3:88\n*S KotlinDebug\n*F\n+ 1 RideHistoryRepositoryImpl.kt\nco/bird/android/repository/ridehistory/RideHistoryRepositoryImpl$fetchRideHistory$1\n*L\n27#1:83\n27#1:84,3\n36#1:87\n36#1:89\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LOR4;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LOR4;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LOR4$a;->g:LOR4;

    iput-object p2, p0, LOR4$a;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/PagedCollection;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/PagedCollection<",
            "Lco/bird/android/model/OperatorRideHistoryItem;",
            ">;)V"
        }
    .end annotation

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

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/OperatorRideHistoryItem;

    invoke-virtual {v2}, Lco/bird/android/model/OperatorRideHistoryItem;->getRideId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x1fe

    const/4 v13, 0x0

    invoke-static/range {v2 .. v13}, Lco/bird/android/model/OperatorRideHistoryItem;->copy$default(Lco/bird/android/model/OperatorRideHistoryItem;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/OperatorRideHistoryItem;

    move-result-object v2

    :cond_0
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, LOR4$a;->g:LOR4;

    invoke-static {p1}, LOR4;->access$getRideHistoryCache$p(LOR4;)Landroid/util/LruCache;

    move-result-object v1

    iget-object v2, p0, LOR4$a;->h:Ljava/lang/String;

    invoke-static {p1, v1, v2, v0}, LOR4;->access$set(LOR4;Landroid/util/LruCache;Ljava/lang/String;Ljava/util/List;)V

    iget-object p1, p0, LOR4$a;->g:LOR4;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/OperatorRideHistoryItem;

    invoke-virtual {v1}, Lco/bird/android/model/OperatorRideHistoryItem;->getRideId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {p1}, LOR4;->access$getRideHistoryItemCache$p(LOR4;)Ljava/util/HashMap;

    move-result-object v3

    invoke-static {p1, v3, v2, v1}, LOR4;->access$set(LOR4;Ljava/util/HashMap;Ljava/lang/String;Lco/bird/android/model/OperatorRideHistoryItem;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/PagedCollection;

    invoke-virtual {p0, p1}, LOR4$a;->a(Lco/bird/api/response/PagedCollection;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
