.class public final LCu4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCu4;->o0()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/ZoneAssignmentsResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/ZoneAssignmentsResponse;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/ZoneAssignmentsResponse;)Lio/reactivex/h;"
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
        "SMAP\nReleaseAssignmentRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentRepositoryImpl.kt\nco/bird/android/repository/releaseassignment/ReleaseAssignmentRepositoryImpl$fetchZoneAssignments$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1#2:55\n1549#3:56\n1620#3,3:57\n1549#3:60\n1620#3,3:61\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentRepositoryImpl.kt\nco/bird/android/repository/releaseassignment/ReleaseAssignmentRepositoryImpl$fetchZoneAssignments$1\n*L\n28#1:56\n28#1:57,3\n31#1:60\n31#1:61,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LCu4;


# direct methods
.method public constructor <init>(LCu4;)V
    .locals 0

    iput-object p1, p0, LCu4$a;->g:LCu4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/ZoneAssignmentsResponse;)Lio/reactivex/h;
    .locals 6

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/ZoneAssignmentsResponse;->getMapBanner()Lco/bird/android/model/wire/WireReleaseAssignmentMapBanner;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LCu4$a;->g:LCu4;

    invoke-static {v1}, LCu4;->access$getPreferences$p(LCu4;)Lgl;

    move-result-object v1

    invoke-virtual {v1, v0}, Lgl;->D2(Lco/bird/android/model/wire/WireReleaseAssignmentMapBanner;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, LCu4$a;->g:LCu4;

    invoke-static {v0}, LCu4;->access$getPreferences$p(LCu4;)Lgl;

    move-result-object v0

    invoke-virtual {v0}, Lgl;->p()V

    :cond_1
    invoke-virtual {p1}, Lco/bird/api/response/ZoneAssignmentsResponse;->getGroups()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireZoneAssignmentGroup;

    invoke-static {v2}, LzI6;->a(Lco/bird/android/model/wire/WireZoneAssignmentGroup;)Lco/bird/android/model/persistence/ZoneAssignmentGroup;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object p1, p0, LCu4$a;->g:LCu4;

    const/4 v2, 0x2

    new-array v2, v2, [Lio/reactivex/c;

    invoke-static {p1}, LCu4;->access$getZoneAssignmentDao$p(LCu4;)LxI6;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/persistence/ZoneAssignmentGroup;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/ZoneAssignmentGroup;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {v3, v4}, LxI6;->d(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v2, v3

    iget-object v1, p0, LCu4$a;->g:LCu4;

    invoke-static {v1}, LCu4;->access$getZoneAssignmentDao$p(LCu4;)LxI6;

    move-result-object v1

    invoke-virtual {v1, v0}, LxI6;->b(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lio/reactivex/c;->L(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "merge(listOf(\n          \u2026ignmentGroups)\n        ))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LCu4;->K1(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/ZoneAssignmentsResponse;

    invoke-virtual {p0, p1}, LCu4$a;->a(Lco/bird/api/response/ZoneAssignmentsResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
