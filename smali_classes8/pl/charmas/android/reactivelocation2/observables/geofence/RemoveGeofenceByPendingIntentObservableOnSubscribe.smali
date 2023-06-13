.class Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceByPendingIntentObservableOnSubscribe;
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
.field private final pendingIntent:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Landroid/app/PendingIntent;)V
    .locals 0

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/observables/geofence/BaseGeofencingObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;)V

    iput-object p2, p0, Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceByPendingIntentObservableOnSubscribe;->pendingIntent:Landroid/app/PendingIntent;

    return-void
.end method


# virtual methods
.method public onGeofencingClientReady(Lcom/google/android/gms/location/GeofencingClient;Lio/reactivex/y;)V
    .locals 1
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

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceByPendingIntentObservableOnSubscribe;->pendingIntent:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/GeofencingClient;->removeGeofences(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceByPendingIntentObservableOnSubscribe$1;

    invoke-direct {v0, p0, p2}, Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceByPendingIntentObservableOnSubscribe$1;-><init>(Lpl/charmas/android/reactivelocation2/observables/geofence/RemoveGeofenceByPendingIntentObservableOnSubscribe;Lio/reactivex/y;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lpl/charmas/android/reactivelocation2/BaseFailureListener;

    invoke-direct {v0, p2}, Lpl/charmas/android/reactivelocation2/BaseFailureListener;-><init>(Lio/reactivex/y;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
