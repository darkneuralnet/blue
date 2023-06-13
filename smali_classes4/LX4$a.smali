.class public final LLX4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLX4;->L0()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/WireRidePassUiV2Response;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/WireRidePassUiV2Response;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/api/response/WireRidePassUiV2Response;)Lio/reactivex/h;"
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
        "SMAP\nRidePassViewRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassViewRepositoryImpl.kt\nco/bird/android/repository/ridepassview/RidePassViewRepositoryImpl$fetchRidePassViewV2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n1549#2:108\n1620#2,3:109\n1549#2:112\n1620#2,3:113\n*S KotlinDebug\n*F\n+ 1 RidePassViewRepositoryImpl.kt\nco/bird/android/repository/ridepassview/RidePassViewRepositoryImpl$fetchRidePassViewV2$1\n*L\n45#1:104\n45#1:105,3\n46#1:108\n46#1:109,3\n47#1:112\n47#1:113,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LLX4;


# direct methods
.method public constructor <init>(LLX4;)V
    .locals 0

    iput-object p1, p0, LLX4$a;->g:LLX4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LLX4;Ljava/util/List;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LLX4$a;->c(LLX4;Ljava/util/List;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LLX4;Ljava/util/List;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$ridePassList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LLX4;->access$getRidePassViewDao$p(LLX4;)LCX4;

    move-result-object p0

    invoke-virtual {p0, p1}, LCX4;->d(Ljava/util/List;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/api/response/WireRidePassUiV2Response;)Lio/reactivex/h;
    .locals 6

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/WireRidePassUiV2Response;->getActive()Ljava/util/List;

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

    check-cast v3, Lco/bird/android/model/wire/WireRidePassView;

    sget-object v4, Lco/bird/android/model/constant/RidePassViewStatus;->ACTIVE:Lco/bird/android/model/constant/RidePassViewStatus;

    invoke-static {v3, v4}, LAX4;->a(Lco/bird/android/model/wire/WireRidePassView;Lco/bird/android/model/constant/RidePassViewStatus;)Lco/bird/android/model/persistence/RidePassView;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/api/response/WireRidePassUiV2Response;->getAvailable()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireRidePassView;

    sget-object v5, Lco/bird/android/model/constant/RidePassViewStatus;->AVAILABLE:Lco/bird/android/model/constant/RidePassViewStatus;

    invoke-static {v4, v5}, LAX4;->a(Lco/bird/android/model/wire/WireRidePassView;Lco/bird/android/model/constant/RidePassViewStatus;)Lco/bird/android/model/persistence/RidePassView;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Lco/bird/api/response/WireRidePassUiV2Response;->getIneligible()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireRidePassView;

    sget-object v3, Lco/bird/android/model/constant/RidePassViewStatus;->INELIGIBLE:Lco/bird/android/model/constant/RidePassViewStatus;

    invoke-static {v2, v3}, LAX4;->a(Lco/bird/android/model/wire/WireRidePassView;Lco/bird/android/model/constant/RidePassViewStatus;)Lco/bird/android/model/persistence/RidePassView;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LLX4$a;->g:LLX4;

    invoke-virtual {v0}, LLX4;->O0()Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LLX4$a;->g:LLX4;

    new-instance v2, LKX4;

    invoke-direct {v2, v1, p1}, LKX4;-><init>(LLX4;Ljava/util/List;)V

    invoke-static {v2}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/WireRidePassUiV2Response;

    invoke-virtual {p0, p1}, LLX4$a;->b(Lco/bird/api/response/WireRidePassUiV2Response;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
