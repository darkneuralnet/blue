.class public Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe;
.super Lpl/charmas/android/reactivelocation2/observables/location/BaseLocationObservableOnSubscribe;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpl/charmas/android/reactivelocation2/observables/location/BaseLocationObservableOnSubscribe<",
        "Landroid/location/Location;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/observables/location/BaseLocationObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;)V

    return-void
.end method

.method public static createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableContext;",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;",
            ")",
            "Lio/reactivex/Observable<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe;

    invoke-direct {v0, p0}, Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;)V

    invoke-virtual {p1, v0}, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;->createObservable(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onLocationProviderClientReady(Lcom/google/android/gms/location/FusedLocationProviderClient;Lio/reactivex/y;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/FusedLocationProviderClient;",
            "Lio/reactivex/y<",
            "-",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/location/FusedLocationProviderClient;->getLastLocation()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe$1;

    invoke-direct {v0, p0, p2}, Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe$1;-><init>(Lpl/charmas/android/reactivelocation2/observables/location/LastKnownLocationObservableOnSubscribe;Lio/reactivex/y;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lpl/charmas/android/reactivelocation2/BaseFailureListener;

    invoke-direct {v0, p2}, Lpl/charmas/android/reactivelocation2/BaseFailureListener;-><init>(Lio/reactivex/y;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
