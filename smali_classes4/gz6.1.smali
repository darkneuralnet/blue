.class public final Lgz6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcz6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001e\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00020\tH\u0016J\u0008\u0010\u000c\u001a\u00020\u0007H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lgz6;",
        "Lcz6;",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "viewport",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
        "filters",
        "Lio/reactivex/c;",
        "H1",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/WarehouseMarker;",
        "p1",
        "clear",
        "LTk3;",
        "a",
        "LTk3;",
        "client",
        "LWy6;",
        "b",
        "LWy6;",
        "warehouseMarkerDao",
        "<init>",
        "(LTk3;LWy6;)V",
        "warehouse-marker_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWarehouseMarkerRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseMarkerRepositoryImpl.kt\nco/bird/android/repository/warehousemarker/WarehouseMarkerRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1549#2:56\n1620#2,3:57\n*S KotlinDebug\n*F\n+ 1 WarehouseMarkerRepositoryImpl.kt\nco/bird/android/repository/warehousemarker/WarehouseMarkerRepositoryImpl\n*L\n29#1:56\n29#1:57,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LTk3;

.field public final b:LWy6;


# direct methods
.method public constructor <init>(LTk3;LWy6;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "warehouseMarkerDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgz6;->a:LTk3;

    iput-object p2, p0, Lgz6;->b:LWy6;

    return-void
.end method

.method public static synthetic J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lgz6;->L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final synthetic access$getWarehouseMarkerDao$p(Lgz6;)LWy6;
    .locals 0

    iget-object p0, p0, Lgz6;->b:LWy6;

    return-object p0
.end method


# virtual methods
.method public H1(Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Lio/reactivex/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            ">;",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
            ")",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "viewport"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgz6;->a:LTk3;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    invoke-static {v2}, LqB0;->g(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Lco/bird/android/model/wire/WireLocation;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p2}, LqB0;->i(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Lco/bird/android/model/wire/WireOperatorMapFilterBundle;

    move-result-object p1

    new-instance p2, Lco/bird/api/request/OperatorMapWarehouseRequest;

    invoke-direct {p2, v1, p1}, Lco/bird/api/request/OperatorMapWarehouseRequest;-><init>(Ljava/util/List;Lco/bird/android/model/wire/WireOperatorMapFilterBundle;)V

    invoke-interface {v0, p2}, LTk3;->w(Lco/bird/api/request/OperatorMapWarehouseRequest;)Lio/reactivex/F;

    move-result-object p1

    new-instance p2, Lgz6$a;

    invoke-direct {p2, p0}, Lgz6$a;-><init>(Lgz6;)V

    new-instance v0, Ldz6;

    invoke-direct {v0, p2}, Ldz6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "override fun fetchWareho\u2026learOnError()\n      }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public K1(Lio/reactivex/c;)Lio/reactivex/c;
    .locals 0

    invoke-static {p0, p1}, Lcz6$a;->a(Lcz6;Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public clear()Lio/reactivex/c;
    .locals 1

    iget-object v0, p0, Lgz6;->b:LWy6;

    invoke-virtual {v0}, LWy6;->a()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public p1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/WarehouseMarker;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lgz6;->b:LWy6;

    invoke-virtual {v0}, LWy6;->j()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
