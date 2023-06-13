.class public final LAf3$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcD1$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAf3;->onMapReady(LcD1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Af3$l",
        "LcD1$m;",
        "LfM2;",
        "marker",
        "",
        "onMarkerDragStart",
        "onMarkerDragEnd",
        "onMarkerDrag",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LAf3;

.field public final synthetic b:LcD1;


# direct methods
.method public constructor <init>(LAf3;LcD1;)V
    .locals 0

    iput-object p1, p0, LAf3$l;->a:LAf3;

    iput-object p2, p0, LAf3$l;->b:LcD1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMarkerDrag(LfM2;)V
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onMarkerDragEnd(LfM2;)V
    .locals 4

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAf3$l;->a:LAf3;

    invoke-static {v0}, LAf3;->access$getLocationSubject$p(LAf3;)Lio/reactivex/subjects/a;

    move-result-object v0

    new-instance v1, LAf3$a;

    invoke-virtual {p1}, LfM2;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    const-string v3, "marker.position"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LEf3;->access$toLocation(Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/wire/WireLocation;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, LAf3$a;-><init>(Lco/bird/android/model/wire/WireLocation;Z)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LAf3$l;->b:LcD1;

    invoke-virtual {p1}, LfM2;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    invoke-static {p1}, Lrc0;->b(Lcom/google/android/gms/maps/model/LatLng;)Lqc0;

    move-result-object p1

    invoke-virtual {v0, p1}, LcD1;->f(Lqc0;)V

    return-void
.end method

.method public onMarkerDragStart(LfM2;)V
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
