.class public final LY00$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY00;->a1(Landroid/location/Location;DLco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/OperatorMapResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/OperatorMapResponse;",
        "operatorMapResponse",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/api/response/OperatorMapResponse;)Lio/reactivex/h;"
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
        "SMAP\nBountyRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyRepositoryImpl.kt\nco/bird/android/repository/BountyRepositoryImpl$fetchBounties$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n1549#2:108\n1620#2,3:109\n37#3,2:112\n*S KotlinDebug\n*F\n+ 1 BountyRepositoryImpl.kt\nco/bird/android/repository/BountyRepositoryImpl$fetchBounties$2\n*L\n53#1:104\n53#1:105,3\n54#1:108\n54#1:109,3\n54#1:112,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LY00;


# direct methods
.method public constructor <init>(LY00;)V
    .locals 0

    iput-object p1, p0, LY00$b;->g:LY00;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LY00;[Lco/bird/android/model/persistence/BountyMapMarker;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, LY00$b;->c(LY00;[Lco/bird/android/model/persistence/BountyMapMarker;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LY00;[Lco/bird/android/model/persistence/BountyMapMarker;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$markers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LY00;->access$getBountyMapMarkerDao$p(LY00;)LM00;

    move-result-object p0

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lco/bird/android/model/persistence/BountyMapMarker;

    invoke-virtual {p0, p1}, LM00;->g([Lco/bird/android/model/persistence/BountyMapMarker;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/api/response/OperatorMapResponse;)Lio/reactivex/h;
    .locals 4

    const-string v0, "operatorMapResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/OperatorMapResponse;->getBounties()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireBounty;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBounty;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/api/response/OperatorMapResponse;->getBounties()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireBounty;

    invoke-static {v2}, Lz00;->b(Lco/bird/android/model/wire/WireBounty;)Lco/bird/android/model/persistence/BountyMapMarker;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    new-array v2, p1, [Lco/bird/android/model/persistence/BountyMapMarker;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/persistence/BountyMapMarker;

    const/4 v2, 0x2

    new-array v2, v2, [Lio/reactivex/c;

    iget-object v3, p0, LY00$b;->g:LY00;

    invoke-static {v3}, LY00;->access$getBountyMapMarkerDao$p(LY00;)LM00;

    move-result-object v3

    invoke-virtual {v3, v1}, LM00;->e(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v1

    aput-object v1, v2, p1

    iget-object p1, p0, LY00$b;->g:LY00;

    new-instance v1, LZ00;

    invoke-direct {v1, p1, v0}, LZ00;-><init>(LY00;[Lco/bird/android/model/persistence/BountyMapMarker;)V

    invoke-static {v1}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "fromCallable { bountyMap\u2026ntyMapMarkers(*markers) }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

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

    check-cast p1, Lco/bird/api/response/OperatorMapResponse;

    invoke-virtual {p0, p1}, LY00$b;->b(Lco/bird/api/response/OperatorMapResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
