.class public final Lbv3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbv3;->j1()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/OperatorTaskResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/OperatorTaskResponse;",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/OperatorTaskResponse;)Lio/reactivex/h;"
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
        "SMAP\nOperatorTaskGroupRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskGroupRepositoryImpl.kt\nco/bird/android/repository/operatortaskv2/OperatorTaskGroupRepositoryImpl$fetchOperatorTaskGroups$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1#2:54\n1549#3:55\n1620#3,3:56\n*S KotlinDebug\n*F\n+ 1 OperatorTaskGroupRepositoryImpl.kt\nco/bird/android/repository/operatortaskv2/OperatorTaskGroupRepositoryImpl$fetchOperatorTaskGroups$1\n*L\n26#1:55\n26#1:56,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lbv3;


# direct methods
.method public constructor <init>(Lbv3;)V
    .locals 0

    iput-object p1, p0, Lbv3$a;->g:Lbv3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/OperatorTaskResponse;)Lio/reactivex/h;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    new-array v0, v0, [Lio/reactivex/c;

    iget-object v1, p0, Lbv3$a;->g:Lbv3;

    invoke-static {v1}, Lbv3;->access$getOperatorTaskV2Dao$p(Lbv3;)Lww3;

    move-result-object v1

    invoke-virtual {v1}, Lww3;->a()Lio/reactivex/c;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lbv3$a;->g:Lbv3;

    invoke-static {v1}, Lbv3;->access$getOperatorTaskV2Dao$p(Lbv3;)Lww3;

    move-result-object v1

    invoke-virtual {v1}, Lww3;->b()Lio/reactivex/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p1}, Lco/bird/api/response/OperatorTaskResponse;->getBanner()Lco/bird/android/model/wire/WireOperatorTaskBanner;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, LTu3;->a(Lco/bird/android/model/wire/WireOperatorTaskBanner;)Lco/bird/android/model/persistence/OperatorTaskBanner;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lbv3$a;->g:Lbv3;

    invoke-static {v2}, Lbv3;->access$getOperatorTaskV2Dao$p(Lbv3;)Lww3;

    move-result-object v2

    invoke-virtual {v2, v1}, Lww3;->c(Lco/bird/android/model/persistence/OperatorTaskBanner;)Lio/reactivex/c;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lbv3$a;->g:Lbv3;

    invoke-static {v1}, Lbv3;->access$getOperatorTaskV2Dao$p(Lbv3;)Lww3;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/api/response/OperatorTaskResponse;->getTaskGroups()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireOperatorTaskGroup;

    invoke-static {v3}, LYu3;->a(Lco/bird/android/model/wire/WireOperatorTaskGroup;)Lco/bird/android/model/persistence/OperatorTaskGroup;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v2}, Lww3;->d(Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    const/4 v1, 0x3

    aput-object p1, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/OperatorTaskResponse;

    invoke-virtual {p0, p1}, Lbv3$a;->a(Lco/bird/api/response/OperatorTaskResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
