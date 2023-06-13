.class public final Lnr1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnr1;->u0(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireFleetList;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireFleetList;",
        "wireFleetList",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireFleetList;)Lio/reactivex/h;"
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
        "SMAP\nFleetStatusRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchFleetList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,160:1\n1360#2:161\n1446#2,5:162\n1549#2:167\n1620#2,3:168\n1549#2:171\n1620#2,3:172\n1549#2:175\n1620#2,3:176\n1360#2:179\n1446#2,2:180\n1549#2:182\n1620#2,3:183\n1448#2,3:186\n37#3,2:189\n*S KotlinDebug\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchFleetList$1\n*L\n89#1:161\n89#1:162,5\n90#1:167\n90#1:168,3\n91#1:171\n91#1:172,3\n92#1:175\n92#1:176,3\n93#1:179\n93#1:180,2\n94#1:182\n94#1:183,3\n93#1:186,3\n103#1:189,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lnr1;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnr1;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnr1$a;->g:Lnr1;

    iput-object p2, p0, Lnr1$a;->h:Ljava/lang/String;

    iput-object p3, p0, Lnr1$a;->i:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireFleetList;)Lio/reactivex/h;
    .locals 13

    const-string v0, "wireFleetList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireFleetList;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireFleetListSection;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireFleetListSection;->getVehicles()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireFleetListVehicle;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireFleetListVehicle;->getVehicleId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireFleetList;->getSections()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireFleetListSection;

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireFleetListSection;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireFleetList;->getSections()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v4, p0, Lnr1$a;->i:Ljava/lang/String;

    iget-object v5, p0, Lnr1$a;->h:Ljava/lang/String;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/wire/WireFleetListSection;

    invoke-static {v7, v4, v5}, Luq1;->b(Lco/bird/android/model/wire/WireFleetListSection;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/persistence/FleetListSection;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireFleetList;->getSections()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v4, p0, Lnr1$a;->h:Ljava/lang/String;

    iget-object v5, p0, Lnr1$a;->i:Ljava/lang/String;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lco/bird/android/model/wire/WireFleetListSection;

    invoke-virtual {v8}, Lco/bird/android/model/wire/WireFleetListSection;->getVehicles()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v9, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lco/bird/android/model/wire/WireFleetListVehicle;

    invoke-virtual {v8}, Lco/bird/android/model/wire/WireFleetListSection;->getTitle()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v4, v5, v12}, Luq1;->c(Lco/bird/android/model/wire/WireFleetListVehicle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/persistence/FleetListVehicle;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_4
    invoke-static {v7, v10}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_4

    :cond_5
    const/4 v1, 0x5

    new-array v1, v1, [Lio/reactivex/c;

    iget-object v2, p0, Lnr1$a;->g:Lnr1;

    invoke-static {v2}, Lnr1;->access$getFleetListDao$p(Lnr1;)Lwo1;

    move-result-object v2

    iget-object v4, p0, Lnr1$a;->h:Ljava/lang/String;

    iget-object v5, p0, Lnr1$a;->i:Ljava/lang/String;

    invoke-static {p1, v4, v5}, Luq1;->a(Lco/bird/android/model/wire/WireFleetList;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/persistence/FleetList;

    move-result-object p1

    invoke-virtual {v2, p1}, Lwo1;->c(Lco/bird/android/model/persistence/FleetList;)Lio/reactivex/c;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    iget-object p1, p0, Lnr1$a;->g:Lnr1;

    invoke-static {p1}, Lnr1;->access$getFleetListVehicleDao$p(Lnr1;)Lfp1;

    move-result-object p1

    iget-object v4, p0, Lnr1$a;->h:Ljava/lang/String;

    iget-object v5, p0, Lnr1$a;->i:Ljava/lang/String;

    invoke-virtual {p1, v4, v5, v0, v3}, Lfp1;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    const/4 v0, 0x1

    aput-object p1, v1, v0

    iget-object p1, p0, Lnr1$a;->g:Lnr1;

    invoke-static {p1}, Lnr1;->access$getFleetListVehicleDao$p(Lnr1;)Lfp1;

    move-result-object p1

    new-array v0, v2, [Lco/bird/android/model/persistence/FleetListVehicle;

    invoke-interface {v7, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/persistence/FleetListVehicle;

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/persistence/FleetListVehicle;

    invoke-virtual {p1, v0}, Lfp1;->b([Lco/bird/android/model/persistence/FleetListVehicle;)Lio/reactivex/c;

    move-result-object p1

    const/4 v0, 0x2

    aput-object p1, v1, v0

    iget-object p1, p0, Lnr1$a;->g:Lnr1;

    invoke-static {p1}, Lnr1;->access$getFleetListSectionDao$p(Lnr1;)LXo1;

    move-result-object p1

    iget-object v0, p0, Lnr1$a;->i:Ljava/lang/String;

    iget-object v2, p0, Lnr1$a;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v2, v3}, LXo1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    const/4 v0, 0x3

    aput-object p1, v1, v0

    iget-object p1, p0, Lnr1$a;->g:Lnr1;

    invoke-static {p1}, Lnr1;->access$getFleetListSectionDao$p(Lnr1;)LXo1;

    move-result-object p1

    invoke-virtual {p1, v6}, LXo1;->c(Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    const/4 v0, 0x4

    aput-object p1, v1, v0

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireFleetList;

    invoke-virtual {p0, p1}, Lnr1$a;->a(Lco/bird/android/model/wire/WireFleetList;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
