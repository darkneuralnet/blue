.class public abstract Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceObservableOnSubscribe;
.super Lpl/charmas/android/reactivelocation2/observables/geofence/BaseGeofencingObservableOnSubscribe;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lpl/charmas/android/reactivelocation2/observables/geofence/BaseGeofencingObservableOnSubscribe<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/observables/geofence/BaseGeofencingObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;)V

    return-void
.end method

.method public static createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Landroid/app/PendingIntent;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableContext;",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceByPendingIntentObservableOnSubscribe;

    invoke-direct {v0, p0, p2}, Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceByPendingIntentObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Landroid/app/PendingIntent;)V

    invoke-virtual {p1, v0}, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;->createObservable(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Ljava/util/List;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableContext;",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceRequestIdsObservableOnSubscribe;

    invoke-direct {v0, p0, p2}, Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceRequestIdsObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Ljava/util/List;)V

    invoke-virtual {p1, v0}, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;->createObservable(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onGeofencingClientReady(Lcom/google/android/gms/location/GeofencingClient;Lio/reactivex/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/GeofencingClient;",
            "Lio/reactivex/y<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceObservableOnSubscribe;->removeGeofences(Lcom/google/android/gms/location/GeofencingClient;Lio/reactivex/y;)V

    return-void
.end method

.method public abstract removeGeofences(Lcom/google/android/gms/location/GeofencingClient;Lio/reactivex/y;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/GeofencingClient;",
            "Lio/reactivex/y<",
            "-TT;>;)V"
        }
    .end annotation
.end method
