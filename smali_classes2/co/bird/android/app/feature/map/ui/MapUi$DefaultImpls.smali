.class public final Lco/bird/android/app/feature/map/ui/MapUi$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/ui/MapUi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static setAreasCompleteChanges(Lco/bird/android/app/feature/map/ui/MapUi;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/ui/MapUi;",
            ")",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUi$DefaultImpls;->setAreasCompleteChanges(Lco/bird/android/app/feature/map/ui/MapAreasUi;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static showInfoWindowForArea(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/persistence/Area;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    const-string v0, "area"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lco/bird/android/app/feature/map/ui/MapAreasUi$DefaultImpls;->showInfoWindowForArea(Lco/bird/android/app/feature/map/ui/MapAreasUi;Lco/bird/android/model/persistence/Area;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public static synthetic zoomTo$default(Lco/bird/android/app/feature/map/ui/MapUi;Landroid/location/Location;Ljava/lang/Float;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-interface {p0, p1, p2}, Lco/bird/android/app/feature/map/ui/MapUi;->zoomTo(Landroid/location/Location;Ljava/lang/Float;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: zoomTo"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
