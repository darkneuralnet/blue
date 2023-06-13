.class public Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;
.super Lpl/charmas/android/reactivelocation2/observables/geofence/BaseGeofencingObservableOnSubscribe;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpl/charmas/android/reactivelocation2/observables/geofence/BaseGeofencingObservableOnSubscribe<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final geofenceTransitionPendingIntent:Landroid/app/PendingIntent;

.field private final request:Lcom/google/android/gms/location/GeofencingRequest;


# direct methods
.method private constructor <init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)V
    .locals 0

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/observables/geofence/BaseGeofencingObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;)V

    iput-object p2, p0, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;->request:Lcom/google/android/gms/location/GeofencingRequest;

    iput-object p3, p0, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;->geofenceTransitionPendingIntent:Landroid/app/PendingIntent;

    return-void
.end method

.method public static createObservable(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableContext;",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;",
            "Lcom/google/android/gms/location/GeofencingRequest;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;

    invoke-direct {v0, p0, p2, p3}, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)V

    invoke-virtual {p1, v0}, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;->createObservable(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onGeofencingClientReady(Lcom/google/android/gms/location/GeofencingClient;Lio/reactivex/y;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/GeofencingClient;",
            "Lio/reactivex/y<",
            "-",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;->request:Lcom/google/android/gms/location/GeofencingRequest;

    iget-object v1, p0, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;->geofenceTransitionPendingIntent:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/location/GeofencingClient;->addGeofences(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe$1;

    invoke-direct {v0, p0, p2}, Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe$1;-><init>(Lpl/charmas/android/reactivelocation2/observables/geofence/AddGeofenceObservableOnSubscribe;Lio/reactivex/y;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lpl/charmas/android/reactivelocation2/BaseFailureListener;

    invoke-direct {v0, p2}, Lpl/charmas/android/reactivelocation2/BaseFailureListener;-><init>(Lio/reactivex/y;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
