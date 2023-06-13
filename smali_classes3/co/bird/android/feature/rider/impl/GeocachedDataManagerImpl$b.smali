.class public final Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->z(Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Set;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/Integer;",
        ">;>;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0008\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "",
        "",
        "Lco/bird/android/feature/rider/impl/ServerCellId;",
        "",
        "fetchedCellIdsOptional",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/buava/Optional;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

.field public final synthetic h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Lcom/google/android/gms/maps/model/LatLng;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    iput-object p2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;->h:Ljava/util/Set;

    iput-object p3, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;->i:Lcom/google/android/gms/maps/model/LatLng;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)Lio/reactivex/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "fetchedCellIdsOptional"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "fetchedCellIds = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    invoke-static {p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$getServerCellLastQuery$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)La94;

    move-result-object p1

    new-instance v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b$a;

    iget-object v1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;->h:Ljava/util/Set;

    invoke-direct {v0, v1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b$a;-><init>(Ljava/util/Set;)V

    invoke-virtual {p1, v0}, La94;->i(Lkotlin/jvm/functions/Function1;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;->h:Ljava/util/Set;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    iget-object v2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    invoke-static {v2}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$getServerCellLastQuery$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)La94;

    move-result-object v2

    new-instance v3, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b$b;

    invoke-direct {v3, p1, v0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b$b;-><init>(Ljava/util/Map;Ljava/util/Set;)V

    invoke-virtual {v2, v3}, La94;->i(Lkotlin/jvm/functions/Function1;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "remainingCellIds = "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    iget-object v1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;->i:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {p1, v1, v0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$refreshServerCellIds(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Set;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;->a(Lco/bird/android/buava/Optional;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
