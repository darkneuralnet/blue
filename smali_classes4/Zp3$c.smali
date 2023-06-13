.class public final LZp3$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZp3;->g1()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/OperatorOrderViewsResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/OperatorOrderViewsResponse;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/OperatorOrderViewsResponse;)Lio/reactivex/h;"
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
        "SMAP\nOperatorOrderViewRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderViewRepositoryImpl.kt\nco/bird/android/repository/operatororderview/OperatorOrderViewRepositoryImpl$fetchOperatorOrderViews$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1360#2:85\n1446#2,2:86\n1549#2:88\n1620#2,3:89\n1448#2,3:92\n1549#2:95\n1620#2,3:96\n1549#2:99\n1620#2,3:100\n1549#2:103\n1620#2,3:104\n*S KotlinDebug\n*F\n+ 1 OperatorOrderViewRepositoryImpl.kt\nco/bird/android/repository/operatororderview/OperatorOrderViewRepositoryImpl$fetchOperatorOrderViews$2\n*L\n34#1:85\n34#1:86,2\n35#1:88\n35#1:89,3\n34#1:92,3\n37#1:95\n37#1:96,3\n38#1:99\n38#1:100,3\n44#1:103\n44#1:104,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LZp3;


# direct methods
.method public constructor <init>(LZp3;)V
    .locals 0

    iput-object p1, p0, LZp3$c;->g:LZp3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/OperatorOrderViewsResponse;)Lio/reactivex/h;
    .locals 7

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/OperatorOrderViewsResponse;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/16 v3, 0xa

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireOperatorOrderViewSection;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireOperatorOrderViewSection;->getItems()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireOperatorOrderView;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireOperatorOrderViewSection;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, LQp3;->a(Lco/bird/android/model/wire/WireOperatorOrderView;Ljava/lang/String;)Lco/bird/android/model/persistence/OperatorOrderView;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/OperatorOrderView;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/OperatorOrderView;->getOrderId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lco/bird/api/response/OperatorOrderViewsResponse;->getSections()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/WireOperatorOrderViewSection;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireOperatorOrderViewSection;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    const/4 v2, 0x4

    new-array v2, v2, [Lio/reactivex/c;

    iget-object v5, p0, LZp3$c;->g:LZp3;

    invoke-static {v5}, LZp3;->access$getOrderDao$p(LZp3;)LSp3;

    move-result-object v5

    invoke-virtual {v5, v0}, LSp3;->e(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v0

    const/4 v5, 0x0

    aput-object v0, v2, v5

    iget-object v0, p0, LZp3$c;->g:LZp3;

    invoke-static {v0}, LZp3;->access$getOrderDao$p(LZp3;)LSp3;

    move-result-object v0

    invoke-virtual {v0, v1}, LSp3;->b(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    iget-object v0, p0, LZp3$c;->g:LZp3;

    invoke-static {v0}, LZp3;->access$getSectionDao$p(LZp3;)Lbq3;

    move-result-object v0

    invoke-virtual {v0, v4}, Lbq3;->d(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v2, v1

    iget-object v0, p0, LZp3$c;->g:LZp3;

    invoke-static {v0}, LZp3;->access$getSectionDao$p(LZp3;)Lbq3;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/OperatorOrderViewsResponse;->getSections()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireOperatorOrderViewSection;

    invoke-static {v3}, LQp3;->b(Lco/bird/android/model/wire/WireOperatorOrderViewSection;)Lco/bird/android/model/persistence/OperatorOrderViewSection;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    invoke-virtual {v0, v1}, Lbq3;->b(Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    const/4 v0, 0x3

    aput-object p1, v2, v0

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/OperatorOrderViewsResponse;

    invoke-virtual {p0, p1}, LZp3$c;->a(Lco/bird/api/response/OperatorOrderViewsResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
