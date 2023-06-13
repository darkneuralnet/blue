.class public final Lnr1$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnr1;->z(Ljava/util/List;)Lio/reactivex/c;
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
        "SMAP\nFleetStatusRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchVehiclesForRating$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,160:1\n1360#2:161\n1446#2,2:162\n1549#2:164\n1620#2,3:165\n1448#2,3:168\n37#3,2:171\n*S KotlinDebug\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchVehiclesForRating$1\n*L\n114#1:161\n114#1:162,2\n124#1:164\n124#1:165,3\n114#1:168,3\n126#1:171,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lnr1;


# direct methods
.method public constructor <init>(Lnr1;)V
    .locals 0

    iput-object p1, p0, Lnr1$f;->g:Lnr1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireFleetList;)Lio/reactivex/h;
    .locals 7

    const-string v0, "wireFleetList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireFleetList;->getSections()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireFleetListSection;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireFleetListSection;->getVehicles()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireFleetListVehicle;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireFleetListSection;->getTitle()Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    invoke-static {v4, v6, v6, v5}, Luq1;->c(Lco/bird/android/model/wire/WireFleetListVehicle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/persistence/FleetListVehicle;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lnr1$f;->g:Lnr1;

    invoke-static {p1}, Lnr1;->access$getFleetListVehicleDao$p(Lnr1;)Lfp1;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lco/bird/android/model/persistence/FleetListVehicle;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/persistence/FleetListVehicle;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/persistence/FleetListVehicle;

    invoke-virtual {p1, v0}, Lfp1;->b([Lco/bird/android/model/persistence/FleetListVehicle;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireFleetList;

    invoke-virtual {p0, p1}, Lnr1$f;->a(Lco/bird/android/model/wire/WireFleetList;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
