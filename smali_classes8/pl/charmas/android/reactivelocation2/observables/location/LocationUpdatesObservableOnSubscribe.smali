.class public Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe;
.super Lpl/charmas/android/reactivelocation2/observables/location/BaseLocationObservableOnSubscribe;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe$LocationUpdatesLocationListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpl/charmas/android/reactivelocation2/observables/location/BaseLocationObservableOnSubscribe<",
        "Landroid/location/Location;",
        ">;"
    }
.end annotation


# instance fields
.field private fusedLocationProviderClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

.field private listener:Lcom/google/android/gms/location/LocationCallback;

.field private final locationRequest:Lcom/google/android/gms/location/LocationRequest;


# direct methods
.method private constructor <init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lcom/google/android/gms/location/LocationRequest;)V
    .locals 0

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/observables/location/BaseLocationObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;)V

    iput-object p2, p0, Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    return-void
.end method

.method public static createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Lcom/google/android/gms/location/LocationRequest;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableContext;",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;",
            "Lcom/google/android/gms/location/LocationRequest;",
            ")",
            "Lio/reactivex/Observable<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe;

    invoke-direct {v0, p0, p2}, Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lcom/google/android/gms/location/LocationRequest;)V

    invoke-virtual {p1, v0}, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;->createObservable(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p0

    invoke-virtual {p2}, Lcom/google/android/gms/location/LocationRequest;->getNumUpdates()I

    move-result p1

    if-lez p1, :cond_0

    const p2, 0x7fffffff

    if-ge p1, p2, :cond_0

    int-to-long p1, p1

    invoke-virtual {p0, p1, p2}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public onDisposed()V
    .locals 2

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe;->fusedLocationProviderClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe;->listener:Lcom/google/android/gms/location/LocationCallback;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/FusedLocationProviderClient;->removeLocationUpdates(Lcom/google/android/gms/location/LocationCallback;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method

.method public onLocationProviderClientReady(Lcom/google/android/gms/location/FusedLocationProviderClient;Lio/reactivex/y;)V
    .locals 3
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

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe;->fusedLocationProviderClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe$LocationUpdatesLocationListener;

    invoke-direct {v0, p2}, Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe$LocationUpdatesLocationListener;-><init>(Lio/reactivex/y;)V

    iput-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe;->listener:Lcom/google/android/gms/location/LocationCallback;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/observables/location/LocationUpdatesObservableOnSubscribe;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v0, v2}, Lcom/google/android/gms/location/FusedLocationProviderClient;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationCallback;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lpl/charmas/android/reactivelocation2/BaseFailureListener;

    invoke-direct {v0, p2}, Lpl/charmas/android/reactivelocation2/BaseFailureListener;-><init>(Lio/reactivex/y;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
