.class public final LEr4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Law2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0017J\u0016\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J,\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0016J$\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000cH\u0016R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001e"
    }
    d2 = {
        "LEr4;",
        "Law2;",
        "Lio/reactivex/p;",
        "Landroid/location/Location;",
        "d",
        "Lcom/google/android/gms/location/LocationRequest;",
        "locationRequest",
        "Lio/reactivex/Observable;",
        "b",
        "",
        "lat",
        "lng",
        "",
        "maxResults",
        "Lio/reactivex/F;",
        "",
        "Landroid/location/Address;",
        "a",
        "",
        "locationName",
        "c",
        "Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;",
        "Lkotlin/Lazy;",
        "e",
        "()Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;",
        "provider",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "co.bird.android.lib.location"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LEr4$a;

    invoke-direct {v0, p1}, LEr4$a;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LEr4;->a:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public a(DDI)Lio/reactivex/F;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDI)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, LEr4;->e()Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->reverseGeocode(DDI)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "provider.reverseGeocode(lat, lng, maxResults)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Lcom/google/android/gms/location/LocationRequest;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/LocationRequest;",
            ")",
            "Lio/reactivex/Observable<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    const-string v0, "locationRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LEr4;->e()Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->getUpdatedLocation(Lcom/google/android/gms/location/LocationRequest;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "provider.getUpdatedLocation(locationRequest)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(Ljava/lang/String;I)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;>;"
        }
    .end annotation

    const-string v0, "locationName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LEr4;->e()Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->geocode(Ljava/lang/String;I)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "provider.geocode(locationName, maxResults)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d()Lio/reactivex/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/p<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LEr4;->e()Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;

    move-result-object v0

    invoke-virtual {v0}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;->getLastKnownLocation()Lio/reactivex/p;

    move-result-object v0

    const-string v1, "provider.lastKnownLocation"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final e()Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;
    .locals 1

    iget-object v0, p0, LEr4;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;

    return-object v0
.end method
