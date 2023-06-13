.class public final Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->a(Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/util/List;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/H<",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/Long;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u00060\u0002j\u0002`\u00030\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lio/reactivex/H;",
        "",
        "",
        "Lco/bird/android/feature/rider/impl/MapGeocacheSubRegion;",
        "emitter",
        "",
        "invoke",
        "(Lio/reactivex/H;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lcom/google/android/gms/maps/model/LatLngBounds;

.field public final synthetic h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/util/List;Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$j;->g:Lcom/google/android/gms/maps/model/LatLngBounds;

    iput-object p2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$j;->h:Ljava/util/List;

    iput-object p3, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$j;->i:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/H;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$j;->invoke(Lio/reactivex/H;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/H;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$j;->g:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$j;->h:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refresh called for region="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " and birds="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$j;->i:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    iget-object v1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$j;->g:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static {v0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$getGridDegreeSubdivision$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)I

    move-result v2

    iget-object v3, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$j;->i:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    invoke-static {v3}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$getMaxGeocacheSubRegionLayersPerMapRegion$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$innerRegions(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;II)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
