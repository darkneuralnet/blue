.class public final Lnr1$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnr1;->D1(Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/FleetStatusPredictionResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/FleetStatusPredictionResponse;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/FleetStatusPredictionResponse;)Lio/reactivex/h;"
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
        "SMAP\nFleetStatusRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchFleetStatusPredictionsById$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,160:1\n1549#2:161\n1620#2,3:162\n37#3,2:165\n*S KotlinDebug\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchFleetStatusPredictionsById$1\n*L\n63#1:161\n63#1:162,3\n63#1:165,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lnr1;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnr1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnr1$c;->g:Lnr1;

    iput-object p2, p0, Lnr1$c;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/FleetStatusPredictionResponse;)Lio/reactivex/h;
    .locals 4

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/FleetStatusPredictionResponse;->component1()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lnr1$c;->g:Lnr1;

    invoke-static {v0}, Lnr1;->access$getFleetStatusDao$p(Lnr1;)Lwq1;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lnr1$c;->h:Ljava/lang/String;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireFleetStatus;

    invoke-static {v3, v1}, Luq1;->d(Lco/bird/android/model/wire/WireFleetStatus;Ljava/lang/String;)Lco/bird/android/model/persistence/FleetStatus;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Lco/bird/android/model/persistence/FleetStatus;

    invoke-interface {v2, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lco/bird/android/model/persistence/FleetStatus;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lco/bird/android/model/persistence/FleetStatus;

    invoke-virtual {v0, p1}, Lwq1;->d([Lco/bird/android/model/persistence/FleetStatus;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/FleetStatusPredictionResponse;

    invoke-virtual {p0, p1}, Lnr1$c;->a(Lco/bird/api/response/FleetStatusPredictionResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
