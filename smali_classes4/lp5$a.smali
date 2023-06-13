.class public final Llp5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llp5;->C1(Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/ScrapOrderViewResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/ScrapOrderViewResponse;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/ScrapOrderViewResponse;)Lio/reactivex/h;"
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
        "SMAP\nScrapOrderViewRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderViewRepositoryImpl.kt\nco/bird/android/repository/scraporderview/ScrapOrderViewRepositoryImpl$fetchScrapOrders$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1549#2:42\n1620#2,3:43\n1549#2:46\n1620#2,3:47\n*S KotlinDebug\n*F\n+ 1 ScrapOrderViewRepositoryImpl.kt\nco/bird/android/repository/scraporderview/ScrapOrderViewRepositoryImpl$fetchScrapOrders$1\n*L\n21#1:42\n21#1:43,3\n24#1:46\n24#1:47,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Llp5;


# direct methods
.method public constructor <init>(Llp5;)V
    .locals 0

    iput-object p1, p0, Llp5$a;->g:Llp5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/ScrapOrderViewResponse;)Lio/reactivex/h;
    .locals 5

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/ScrapOrderViewResponse;->getOrders()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireScrapOrderView;

    invoke-static {v2}, Lfp5;->a(Lco/bird/android/model/wire/WireScrapOrderView;)Lco/bird/android/model/persistence/ScrapOrderView;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    new-array p1, p1, [Lio/reactivex/c;

    iget-object v2, p0, Llp5$a;->g:Llp5;

    invoke-static {v2}, Llp5;->access$getScrapOrderViewDao$p(Llp5;)Lhp5;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/ScrapOrderView;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/ScrapOrderView;->getOrderId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v3}, Lhp5;->d(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, p1, v2

    iget-object v1, p0, Llp5$a;->g:Llp5;

    invoke-static {v1}, Llp5;->access$getScrapOrderViewDao$p(Llp5;)Lhp5;

    move-result-object v1

    invoke-virtual {v1, v0}, Lhp5;->b(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p1, v1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/ScrapOrderViewResponse;

    invoke-virtual {p0, p1}, Llp5$a;->a(Lco/bird/api/response/ScrapOrderViewResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
