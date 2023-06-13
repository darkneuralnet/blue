.class public final Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$l;
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
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/Long;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/Long;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aR\u0012\"\u0008\u0001\u0012\u001e\u0012\u0008\u0012\u00060\u0001j\u0002`\u0002 \u0005*\u000e\u0012\u0008\u0012\u00060\u0001j\u0002`\u0002\u0018\u00010\u00000\u0000 \u0005*(\u0012\"\u0008\u0001\u0012\u001e\u0012\u0008\u0012\u00060\u0001j\u0002`\u0002 \u0005*\u000e\u0012\u0008\u0012\u00060\u0001j\u0002`\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0010\u0010\u0003\u001a\u000c\u0012\u0008\u0012\u00060\u0001j\u0002`\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "",
        "Lco/bird/android/feature/rider/impl/MapGeocacheSubRegion;",
        "innerRegions",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/Set;)Lio/reactivex/K;"
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


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$l;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Lio/reactivex/K;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation

    const-string v0, "innerRegions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$l;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    invoke-static {v0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$hydrateMapGeocacheSubRegions(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Ljava/util/Set;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/c;->j0(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$l;->a(Ljava/util/Set;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
